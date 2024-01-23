package Documentation;

public class ContainsException extends RuntimeException {
    public static final String CONSTAINS_WRONG = " Error, Недопустимые символы";
    public ContainsException (String message){
        super(message);
    }
}

