package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.L;
import y4.l;

public final class TransactionException extends Exception {
    public TransactionException(@l String s) {
        L.p(s, "message");
        super(s);
    }
}

