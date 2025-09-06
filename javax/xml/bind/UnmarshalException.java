package javax.xml.bind;

public class UnmarshalException extends JAXBException {
    public UnmarshalException(String s) {
        this(s, null, null);
    }

    public UnmarshalException(String s, String s1) {
        this(s, s1, null);
    }

    public UnmarshalException(String s, String s1, Throwable throwable0) {
        super(s, s1, throwable0);
    }

    public UnmarshalException(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    public UnmarshalException(Throwable throwable0) {
        this(null, null, throwable0);
    }
}

