package api_jdbc.mengqi.Dao;

import api_jdbc.mengqi.Exceptions.UserNameExistsError;
import api_jdbc.mengqi.Exceptions.UserNameFormatError;
import api_jdbc.mengqi.Models.User;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements UserImpl {

    private UserDao() {}
    private static UserDao instance = null;
    public static UserDao getInstance() {
        if(instance == null) {
            instance = new UserDao();
        }
        return instance;
    }

    //sql
    private final String INSERT_PERSON_INFO = "INSERT INTO user (username, password) VALUES (?,?)";
    private final String FIND_USER_BY_PASSWORD = "SELECT * FROM user WHERE user.username = ? AND user.password = ?";
    private final String FIND_EXISTS_USERNAME = "SELECT username FROM user WHERE user.username = ?";
    private final String FIND_USER = "SELECT * FROM user WHERE user.username = ?";

    @Override
    public User createUser(User user) throws SQLException{

        PreparedStatement pStatement = null;
        int result = 0;

        pStatement = DriverManager.getConnection(mysql_Connection.JDBC_ADDRESS).prepareStatement(INSERT_PERSON_INFO);

        // Requirement for username
        if (user.getUsername().length() > 15 || user.getUsername().length() == 0) {
//            throw new SQLException("username should less than 15 characters and should not be empty");
            throw new UserNameFormatError(user.getUsername());
        } else if (userExists(user) == true) {
            throw new UserNameExistsError();
//            throw new SQLException("Cannot retrieve inserted row data from table. Please contact DBA.");
        } else {
            pStatement.setString(1, user.getUsername());
        }

        // Requirement for password
        if (user.getPassword().length() == 0) {
            throw new SQLException("password cannot be empty");
        } else if (user.getPassword().length() <= 8) {
            throw new SQLException("the length of password should greater than 8.");
        } else if (!user.getPassword().matches(".*(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%]).*")) {
            throw new SQLException("password should contains at least one uppercase letter, one lowercase letter, one number and one special characters(in [@!-_#$%^&*])");
        } else {
            pStatement.setString(2, user.getPassword());
        }

        result = pStatement.executeUpdate();

        pStatement.close();

        return user;
    }

    @Override
    public boolean userExists (User user) throws SQLException {
        boolean checkResult = false;
        PreparedStatement preStatement = null;
        ResultSet existUsername = null;
        String username = null;

        preStatement = DriverManager.getConnection(mysql_Connection.JDBC_ADDRESS).prepareStatement(FIND_EXISTS_USERNAME);
        preStatement.setString(1, user.getUsername());
        existUsername = preStatement.executeQuery();
        if (existUsername.next()) {
            username = existUsername.getString("username");
            checkResult = true;
        }

        preStatement.close();

        return checkResult;
    }

    @Override
    public User login(String username, String password) {
        PreparedStatement pStatement = null;
        ResultSet results = null;
        User userCheck = null;

        try {
            pStatement = DriverManager.getConnection(mysql_Connection.JDBC_ADDRESS).prepareStatement(FIND_USER_BY_PASSWORD);
            pStatement.setString(1, username);
            pStatement.setString(2, password);
            results = pStatement.executeQuery();
            // Iterate results
            if (results.next()) {
                int id = results.getInt("id");
                username = results.getString("userName");
                password = results.getString("password");
                userCheck = new User(id, username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User findUser(String username) throws SQLException{
        PreparedStatement pStatement = null;
        ResultSet findUser = null;
        User u = null;

        pStatement = DriverManager.getConnection(mysql_Connection.JDBC_ADDRESS).prepareStatement(FIND_USER);
        pStatement.setString(1, username);
        findUser = pStatement.executeQuery();
        if (findUser.next()) {
            int id = findUser.getInt("id");
            username = findUser.getString("username");
            String passwrod = findUser.getString("password");
            u = new User(id, username, passwrod);
        }

        pStatement.close();

        return u;
    }
}

