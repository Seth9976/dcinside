package org.chromium.net;

import java.io.IOException;

public abstract class CronetException extends IOException {
    protected CronetException(String s, Throwable throwable0) {
        super(s, throwable0);
    }
}

