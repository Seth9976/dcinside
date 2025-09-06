package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.L;
import y4.l;

public final class LoadException extends Exception {
    private final int errorCode;

    public LoadException(int v, @l String s) {
        L.p(s, "message");
        super(s);
        this.errorCode = v;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

