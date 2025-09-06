package javax.xml.bind;

public class ValidationException extends JAXBException {
    public ValidationException(String s) {
        this(s, null, null);
    }

    public ValidationException(String s, String s1) {
        this(s, s1, null);
    }

    public ValidationException(String s, String s1, Throwable throwable0) {
        super(s, s1, throwable0);
    }

    public ValidationException(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    public ValidationException(Throwable throwable0) {
        this(null, null, throwable0);
    }
}

