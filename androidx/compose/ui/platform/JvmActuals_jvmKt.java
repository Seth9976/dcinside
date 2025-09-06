package androidx.compose.ui.platform;

import A3.a;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class JvmActuals_jvmKt {
    @l
    public static final Object a(@l Object object0) {
        L.p(object0, "<this>");
        return object0.getClass();
    }

    @l
    public static final String b(@l Object object0, @m String s) {
        L.p(object0, "obj");
        if(s == null) {
            s = object0.getClass().isAnonymousClass() ? object0.getClass().getName() : object0.getClass().getSimpleName();
        }
        String s1 = String.format("%07x", Arrays.copyOf(new Object[]{System.identityHashCode(object0)}, 1));
        L.o(s1, "format(format, *args)");
        return s + '@' + s1;
    }

    public static final Object c(@l Object object0, @l a a0) {
        L.p(object0, "lock");
        L.p(a0, "block");
        synchronized(object0) {
            return a0.invoke();
        }
    }
}

