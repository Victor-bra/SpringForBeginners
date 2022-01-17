package arrmod.exceptionHanding;

public class NoSuchCompanyException extends RuntimeException{
    public NoSuchCompanyException(String message) {
        super(message);
    }
}
