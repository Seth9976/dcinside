package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.L;
import y4.l;

public final class AbortRetryException extends Exception {
    @l
    private final String reason;

    public AbortRetryException(@l String s) {
        L.p(s, "reason");
        super(s);
        this.reason = s;
    }
}

