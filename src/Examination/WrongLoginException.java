package Examination;

public class WrongLoginException extends  RuntimeException {
    public static final String WRONG_LOGIN =  "Неверный логин";
    public  WrongLoginException(){
        super();
    }
    public WrongLoginException(String messege){
        super(messege);
    }
}
