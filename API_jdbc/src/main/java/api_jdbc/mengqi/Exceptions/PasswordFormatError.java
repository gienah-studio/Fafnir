package api_jdbc.mengqi.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PasswordFormatError extends SQLException {

    public PasswordFormatError(String password){
        super("password cannot be empty and should contains at least one uppercase letter, one lowercase letter, one number and one special characters(in [@!-_#$%^&*]), and the length of password should greater than 8.");
    }
}
