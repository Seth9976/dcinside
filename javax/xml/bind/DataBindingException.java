package javax.xml.bind;

public class DataBindingException extends RuntimeException {
    public DataBindingException(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public DataBindingException(Throwable throwable0) {
        super(throwable0);
    }
}

