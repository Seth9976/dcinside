package kotlinx.coroutines;

import A3.a;
import kotlin.b0;
import kotlinx.coroutines.scheduling.a.c;
import y4.l;

public final class r0 {
    @l
    public static final o0 a() {
        return new h(Thread.currentThread());
    }

    @b0
    @E0
    @c0
    public static final boolean b(@l Thread thread0) {
        return thread0 instanceof c ? ((c)thread0).p() : false;
    }

    public static final void c(@l a a0) {
        a0.invoke();
    }

    @E0
    public static final long d() {
        o0 o00 = m1.a.a();
        return o00 == null ? 0x7FFFFFFFFFFFFFFFL : o00.t2();
    }

    @b0
    @E0
    @c0
    public static final long e() {
        Thread thread0 = Thread.currentThread();
        if(!(thread0 instanceof c)) {
            throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + thread0);
        }
        return ((c)thread0).t();
    }
}

