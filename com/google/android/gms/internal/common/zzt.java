package com.google.android.gms.internal.common;

import j..util.Objects;
import o3.a;
import z4.b;

@b
public final class zzt {
    static final CharSequence zza(@a Object object0, String s) {
        Objects.requireNonNull(object0);
        return object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
    }
}

