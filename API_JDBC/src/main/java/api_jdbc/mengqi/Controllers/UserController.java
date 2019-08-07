package api_jdbc.mengqi.Controllers;

import api_jdbc.mengqi.Dao.UserDao;
import api_jdbc.mengqi.Exceptions.PasswordFormatError;
import api_jdbc.mengqi.Exceptions.UserNameExistsError;
import api_jdbc.mengqi.Exceptions.UserNameFormatError;
import api_jdbc.mengqi.Models.User;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;


@RestController
public class UserController {

    private UserDao userDao = UserDao.getInstance();

    @PostMapping("/api/user")
    public String createUser (@RequestBody User user) throws SQLException {
        try {
            userDao.createUser(user);
            User user1 = userDao.findUser(user.getUsername());
            return ("User ID: "+ user1.getId() + ",   Username: " + user1.getUsername() + ",   Password: " + user1.getPassword());
        } catch (Exception e) {
//            return new SQLException(String.format("{\"%s\"}", e.toString())).toString();
            if (user.getUsername().length() > 15 || user.getUsername().length() == 0) {
                return new UserNameFormatError(user.getUsername()).toString();
            } else if (userDao.userExists(user) == true) {
                return new UserNameExistsError().toString();
            } else if (user.getPassword().length() == 0 || user.getPassword().length() <= 8 || !user.getPassword().matches(".*(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%]).*")) {
                return new PasswordFormatError(user.getPassword()).toString();
            }
        }
        return null;
    }

    @PostMapping("/api/user/login")
    public User login (@RequestBody User user){
        return userDao.login(user.getUsername(),user.getPassword());
    }


}