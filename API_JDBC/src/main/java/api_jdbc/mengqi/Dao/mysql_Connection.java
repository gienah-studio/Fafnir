package api_jdbc.mengqi.Dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public final class mysql_Connection {

    private static final String URL = "jdbc:mysql://localhost:3306/fafnir";
    private static final String USER = "fafnir";
    private static final String PASSWORD ="fafnir";

    public static final String JDBC_ADDRESS = String.format("%s?user=%s&password=%s", URL, USER, PASSWORD);



}
