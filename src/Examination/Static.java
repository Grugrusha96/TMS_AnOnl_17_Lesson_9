package Examination;

public class Static {
    public static boolean login(String login, String password, String soldPassword) {
        boolean resultLogin;
        boolean containsDigit = withDigite(password);

        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException(WrongLoginException.WRONG_LOGIN);
        } else if (password.length() > 20 || password.contains(" ") || !containsDigit) {
            throw new WrongPasswordException(WrongPasswordException.WRONG_PASSWORD);
        } else if (!password.equals(soldPassword)) {
            throw new WrongPasswordException(WrongPasswordException.WROHG_CONFIRM);
        } else {
            resultLogin = true;
            System.out.println(" Выполнен вход ");
        }
        return resultLogin;
    }

    private static boolean withDigite(String password) {
        boolean result = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                result = true;
            }
        }
        return result;
    }
}
