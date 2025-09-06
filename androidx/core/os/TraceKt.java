package androidx.core.os;

import A3.a;
import android.os.Trace;
import kotlin.c0;
import kotlin.k;
import y4.l;

public final class TraceKt {
    @k(message = "Use androidx.tracing.Trace instead", replaceWith = @c0(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final Object a(@l String s, @l a a0) {
        Trace.beginSection(s);
        try {
            return a0.invoke();
        }
        finally {
            Trace.endSection();
        }
    }
}

