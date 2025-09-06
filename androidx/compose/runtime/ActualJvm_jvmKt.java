package androidx.compose.runtime;

import A3.a;
import A3.o;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public final class ActualJvm_jvmKt {
    public static final void a(@l Object object0) {
        L.p(object0, "it");
    }

    public static final int b(@m Object object0) {
        return System.identityHashCode(object0);
    }

    public static final void c(@l Composer composer0, @l o o0) {
        L.p(composer0, "composer");
        L.p(o0, "composable");
        ((o)v0.q(o0, 2)).invoke(composer0, 1);
    }

    public static final Object d(@l Composer composer0, @l o o0) {
        L.p(composer0, "composer");
        L.p(o0, "composable");
        return ((o)v0.q(o0, 2)).invoke(composer0, 1);
    }

    @b0
    public static final Object e(@l Object object0, @l a a0) {
        L.p(object0, "lock");
        L.p(a0, "block");
        synchronized(object0) {
            return a0.invoke();
        }
    }
}

