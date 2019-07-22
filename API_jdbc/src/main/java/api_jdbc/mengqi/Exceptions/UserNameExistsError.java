package api_jdbc.mengqi.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserNameExistsError extends SQLException {

    public UserNameExistsError(){
        super("Username exists. Please try another one");
    }

}
