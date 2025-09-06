package org.mp4parser.aj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SoftException extends RuntimeException {
    private static final boolean HAVE_JAVA_14;
    Throwable inner;

    static {
        SoftException.HAVE_JAVA_14 = true;
    }

    public SoftException(Throwable throwable0) {
        this.inner = throwable0;
    }

    @Override
    public Throwable getCause() {
        return this.inner;
    }

    public Throwable getWrappedThrowable() {
        return this.inner;
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        super.printStackTrace(printStream0);
        Throwable throwable0 = this.inner;
        if(!SoftException.HAVE_JAVA_14 && throwable0 != null) {
            printStream0.print("Caused by: ");
            throwable0.printStackTrace(printStream0);
        }
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        super.printStackTrace(printWriter0);
        Throwable throwable0 = this.inner;
        if(!SoftException.HAVE_JAVA_14 && throwable0 != null) {
            printWriter0.print("Caused by: ");
            throwable0.printStackTrace(printWriter0);
        }
    }
}

