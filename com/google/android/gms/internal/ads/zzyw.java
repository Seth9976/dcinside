package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzyw extends IOException {
    public zzyw(Throwable throwable0) {
        super("Unexpected " + throwable0.getClass().getSimpleName() + (throwable0.getMessage() == null ? "" : ": " + throwable0.getMessage()), throwable0);
    }
}

