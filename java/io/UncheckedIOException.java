package java.io;

import j..util.Objects;

public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException0) {
        super(((Throwable)Objects.requireNonNull(iOException0)));
    }

    public IOException getCause() {
        return (IOException)super.getCause();
    }

    @Override
    public Throwable getCause() {
        return this.getCause();
    }
}

