package api_jdbc.mengqi.Dao;

import api_jdbc.mengqi.Models.User;

import java.sql.SQLException;

public interface UserImpl{

    public User createUser(User user) throws SQLException;

    public boolean userExists (User user) throws SQLException;

    public User login(String username, String password);

    public User findUser(String username) throws SQLException;
}
