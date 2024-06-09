package task6.t1;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Validator.validate("user1", "Qwerty123", "Qwerty123");
    }
}
