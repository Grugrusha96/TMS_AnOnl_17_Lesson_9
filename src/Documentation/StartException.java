package Documentation;

public class StartException extends RuntimeException {
    public static final String START_WRONG = "Error, Неверный номер";
    public StartException (String message){
        super(message);
    }
}
