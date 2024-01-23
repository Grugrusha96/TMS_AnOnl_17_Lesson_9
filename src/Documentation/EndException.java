package Documentation;

public class EndException extends RuntimeException {
    public static final String END_WRONG = "Error, Неверные символы";
    public EndException (String message){
        super(message);
    }
}
