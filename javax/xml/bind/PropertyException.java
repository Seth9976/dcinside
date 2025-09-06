package javax.xml.bind;

public class PropertyException extends JAXBException {
    public PropertyException(String s) {
        super(s);
    }

    public PropertyException(String s, Object object0) {
        super(Messages.format("PropertyException.NameValue", s, object0.toString()));
    }

    public PropertyException(String s, String s1) {
        super(s, s1);
    }

    public PropertyException(String s, String s1, Throwable throwable0) {
        super(s, s1, throwable0);
    }

    public PropertyException(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public PropertyException(Throwable throwable0) {
        super(throwable0);
    }
}

