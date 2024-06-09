package task6.t1;

public class Validator {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Invalid password");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match");
        }

        return true;
    }
}
