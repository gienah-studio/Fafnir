package api_jdbc.mengqi.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserNameFormatError extends SQLException {

//    private static final long serialVersionUID = -8790211652911971729L;

    public UserNameFormatError(String username) {
        super("username should less than 15 characters and should not be empty");
    }


}
