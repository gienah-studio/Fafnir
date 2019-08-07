package api_jdbc.mengqi;

import java.lang.reflect.Type;

public class RestServiceError {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static RestServiceError build (Type errorType, String message) {
        RestServiceError error = new RestServiceError();
        error.code = errorType.getCode();
        error.message = message;
        return error;
    }

    public enum Type {

        BAD_REQUEST_ERROR_PASSWORD("error.badrequest", "password cannot be empty and should contains at least one uppercase letter, \" +\n" +
                "                        \"one lowercase letter, one number and one special characters(in [@!-_#$%^&*]), \" +\n" +
                "                        \"and the length of password should greater than 8."),
        BAD_REQUEST_ERROR_USERNAME_LIMITATION("error.badrequest", "Username should less than 15 characters and should not be empty"),
        BAD_REQUEST_ERROR_USERNAME_EXISTS("error.badrequest", "Username exists."),
        VALIDATION_ERROR("error.validation", "Found validation issues");

        private String code;
        private String message;

        Type(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }


}
