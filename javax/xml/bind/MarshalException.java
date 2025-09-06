package javax.xml.bind;

public class MarshalException extends JAXBException {
    public MarshalException(String s) {
        this(s, null, null);
    }

    public MarshalException(String s, String s1) {
        this(s, s1, null);
    }

    public MarshalException(String s, String s1, Throwable throwable0) {
        super(s, s1, throwable0);
    }

    public MarshalException(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    public MarshalException(Throwable throwable0) {
        this(null, null, throwable0);
    }
}

