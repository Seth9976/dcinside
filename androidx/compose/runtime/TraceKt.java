package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class TraceKt {
    public static final Object a(@l String s, @l a a0) {
        Object object1;
        L.p(s, "sectionName");
        L.p(a0, "block");
        Trace trace0 = Trace.a;
        Object object0 = trace0.a(s);
        try {
            object1 = a0.invoke();
        }
        catch(Throwable throwable0) {
            Trace.a.b(object0);
            throw throwable0;
        }
        trace0.b(object0);
        return object1;
    }
}

