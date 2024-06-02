package task6.t1;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
