package androidx.datastore.core;

import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CorruptionException extends IOException {
    public CorruptionException(@l String s, @m Throwable throwable0) {
        L.p(s, "message");
        super(s, throwable0);
    }

    public CorruptionException(String s, Throwable throwable0, int v, w w0) {
        if((v & 2) != 0) {
            throwable0 = null;
        }
        this(s, throwable0);
    }
}

