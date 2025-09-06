package javax.xml.bind;

public interface ValidationEvent {
    public static final int ERROR = 1;
    public static final int FATAL_ERROR = 2;
    public static final int WARNING;

    Throwable getLinkedException();

    ValidationEventLocator getLocator();

    String getMessage();

    int getSeverity();
}

