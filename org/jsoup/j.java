package org.jsoup;

import java.io.IOException;
import java.io.UncheckedIOException;

@Deprecated
public class j extends UncheckedIOException {
    public j(IOException iOException0) {
        super(iOException0);
    }

    public j(String s) {
        super(new IOException(s));
    }

    public IOException a() {
        return this.getCause();
    }
}

