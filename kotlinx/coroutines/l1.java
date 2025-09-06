package kotlinx.coroutines;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.d0;
import y4.l;
import y4.m;

@s0({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n262#1:285\n1#2:286\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n283#1:285\n*E\n"})
public final class l1 {
    @l
    public static final k1 a(@l ThreadLocal threadLocal0, Object object0) {
        return new c0(object0, threadLocal0);
    }

    public static k1 b(ThreadLocal threadLocal0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = threadLocal0.get();
        }
        return l1.a(threadLocal0, object0);
    }

    @m
    public static final Object c(@l ThreadLocal threadLocal0, @l d d0) {
        if(d0.getContext().get(new d0(threadLocal0)) == null) {
            throw new IllegalStateException(("ThreadLocal " + threadLocal0 + " is missing from context " + d0.getContext()).toString());
        }
        return S0.a;
    }

    private static final Object d(ThreadLocal threadLocal0, d d0) {
        throw null;
    }

    @m
    public static final Object e(@l ThreadLocal threadLocal0, @l d d0) {
        return d0.getContext().get(new d0(threadLocal0)) == null ? b.a(false) : b.a(true);
    }

    private static final Object f(ThreadLocal threadLocal0, d d0) {
        throw null;
    }
}

