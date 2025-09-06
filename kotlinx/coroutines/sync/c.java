package kotlinx.coroutines.sync;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.V;
import y4.l;
import y4.m;

public final class c {
    @l
    private static final V a = null;
    @l
    private static final V b = null;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;

    static {
        c.a = new V("NO_OWNER");
        c.b = new V("ALREADY_LOCKED_BY_OWNER");
    }

    @l
    public static final a a(boolean z) {
        return new b(z);
    }

    public static a b(boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return c.a(z);
    }

    @m
    public static final Object e(@l a a0, @m Object object0, @l A3.a a1, @l d d0) {
        @f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {120}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
        @s0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexKt$withLock$1\n*L\n1#1,305:1\n*E\n"})
        static final class kotlinx.coroutines.sync.c.a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            kotlinx.coroutines.sync.c.a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return c.e(null, null, null, this);
            }
        }

        kotlinx.coroutines.sync.c.a c$a0;
        if(d0 instanceof kotlinx.coroutines.sync.c.a) {
            c$a0 = (kotlinx.coroutines.sync.c.a)d0;
            int v = c$a0.o;
            if((v & 0x80000000) == 0) {
                c$a0 = new kotlinx.coroutines.sync.c.a(d0);
            }
            else {
                c$a0.o = v ^ 0x80000000;
            }
        }
        else {
            c$a0 = new kotlinx.coroutines.sync.c.a(d0);
        }
        Object object1 = c$a0.n;
        Object object2 = kotlin.coroutines.intrinsics.b.l();
        switch(c$a0.o) {
            case 0: {
                f0.n(object1);
                c$a0.k = a0;
                c$a0.l = object0;
                c$a0.m = a1;
                c$a0.o = 1;
                if(a0.h(object0, c$a0) == object2) {
                    return object2;
                }
                break;
            }
            case 1: {
                a1 = (A3.a)c$a0.m;
                object0 = c$a0.l;
                a0 = (a)c$a0.k;
                f0.n(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return a1.invoke();
        }
        finally {
            a0.i(object0);
        }
    }

    private static final Object f(a a0, Object object0, A3.a a1, d d0) {
        a0.h(object0, d0);
        try {
            return a1.invoke();
        }
        finally {
            a0.i(object0);
        }
    }

    public static Object g(a a0, Object object0, A3.a a1, d d0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = null;
        }
        a0.h(object0, d0);
        try {
            return a1.invoke();
        }
        finally {
            a0.i(object0);
        }
    }
}

