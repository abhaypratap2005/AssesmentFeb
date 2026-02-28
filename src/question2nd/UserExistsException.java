package question2nd;

public class UserExistsException extends RuntimeException {

    public UserExistsException(String msg) {
        super(msg);
    }
}
