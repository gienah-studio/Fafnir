package Coding.Training.Exceptions;

public class ExceptionStackFull extends RuntimeException {
    public ExceptionStackFull(String err) {
        super(err);
    }
}
