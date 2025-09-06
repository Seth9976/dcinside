package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class zzgdd extends TimeoutException {
    zzgdd(String s, zzgde zzgde0) {
        super(s);
    }

    @Override
    public final Throwable fillInStackTrace() {
        synchronized(this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }
}

