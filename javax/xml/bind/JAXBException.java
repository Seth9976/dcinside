package javax.xml.bind;

import java.io.PrintStream;
import java.io.PrintWriter;

public class JAXBException extends Exception {
    private String errorCode;
    private volatile Throwable linkedException;
    static final long serialVersionUID = 0xB1FCD4715DD94775L;

    public JAXBException(String s) {
        this(s, null, null);
    }

    public JAXBException(String s, String s1) {
        this(s, s1, null);
    }

    public JAXBException(String s, String s1, Throwable throwable0) {
        super(s);
        this.errorCode = s1;
        this.linkedException = throwable0;
    }

    public JAXBException(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    public JAXBException(Throwable throwable0) {
        this(null, null, throwable0);
    }

    @Override
    public Throwable getCause() {
        return this.linkedException;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public Throwable getLinkedException() {
        return this.linkedException;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        super.printStackTrace(printStream0);
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        super.printStackTrace(printWriter0);
    }

    public void setLinkedException(Throwable throwable0) {
        this.linkedException = throwable0;
    }

    @Override
    public String toString() {
        return this.linkedException == null ? super.toString() : super.toString() + "\n - with linked exception:\n[" + this.linkedException.toString() + "]";
    }
}

