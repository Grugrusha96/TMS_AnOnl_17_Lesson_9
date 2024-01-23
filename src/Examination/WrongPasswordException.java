package Examination;

public class WrongPasswordException extends RuntimeException {
    public static final String WROHG_CONFIRM = " или пароль";
    public static final String WRONG_PASSWORD = "Пароль содердит недопустимые символы";
    public WrongPasswordException(){
      super();
    }
    public WrongPasswordException(String massege){
        super(massege);
    }
}
