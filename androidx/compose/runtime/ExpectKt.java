package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public final class ExpectKt {
    @l
    public static final ThreadLocal a() {
        return new ThreadLocal(androidx.compose.runtime.ExpectKt.ThreadLocal.1.e);

        final class androidx.compose.runtime.ExpectKt.ThreadLocal.1 extends N implements a {
            public static final androidx.compose.runtime.ExpectKt.ThreadLocal.1 e;

            static {
                androidx.compose.runtime.ExpectKt.ThreadLocal.1.e = new androidx.compose.runtime.ExpectKt.ThreadLocal.1();
            }

            androidx.compose.runtime.ExpectKt.ThreadLocal.1() {
                super(0);
            }

            @Override  // A3.a
            @m
            public final Object invoke() {
                return null;
            }
        }

    }

    public static final int b(@l AtomicInt atomicInt0) {
        L.p(atomicInt0, "<this>");
        return atomicInt0.a(1) - 1;
    }
}

