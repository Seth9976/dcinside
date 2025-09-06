package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class Trace {
    @l
    public static final Trace a;

    static {
        Trace.a = new Trace();
    }

    @m
    public final Object a(@l String s) {
        L.p(s, "name");
        android.os.Trace.beginSection(s);
        return null;
    }

    public final void b(@m Object object0) {
        android.os.Trace.endSection();
    }
}

