package androidx.collection.internal;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class Lock {
    public final Object a(@l a a0) {
        L.p(a0, "block");
        synchronized(this) {
            return a0.invoke();
        }
    }
}

