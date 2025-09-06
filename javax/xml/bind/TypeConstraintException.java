package javax.xml.bind;

import java.io.PrintStream;

public class TypeConstraintException extends RuntimeException {
    private String errorCode;
    private volatile Throwable linkedException;
    static final long serialVersionUID = 0xD589686288371F18L;

    public TypeConstraintException(String s) {
        this(s, null, null);
    }

    public TypeConstraintException(String s, String s1) {
        this(s, s1, null);
    }

    public TypeConstraintException(String s, String s1, Throwable throwable0) {
        super(s);
        this.errorCode = s1;
        this.linkedException = throwable0;
    }

    public TypeConstraintException(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    public TypeConstraintException(Throwable throwable0) {
        this(null, null, throwable0);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public Throwable getLinkedException() {
        return this.linkedException;
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        if(this.linkedException != null) {
            this.linkedException.printStackTrace(printStream0);
            printStream0.println("--------------- linked to ------------------");
        }
        super.printStackTrace(printStream0);
    }

    public void setLinkedException(Throwable throwable0) {
        this.linkedException = throwable0;
    }

    @Override
    public String toString() {
        return this.linkedException == null ? super.toString() : super.toString() + "\n - with linked exception:\n[" + this.linkedException.toString() + "]";
    }
}

