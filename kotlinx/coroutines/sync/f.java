package kotlinx.coroutines.sync;

import A3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.a0;
import y4.l;
import y4.m;

public final class f {
    private static final int a;
    @l
    private static final V b;
    @l
    private static final V c;
    @l
    private static final V d;
    @l
    private static final V e;
    private static final int f;

    static {
        f.a = a0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f.b = new V("PERMIT");
        f.c = new V("TAKEN");
        f.d = new V("BROKEN");
        f.e = new V("CANCELLED");
        f.f = a0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
    }

    @l
    public static final d a(int v, int v1) {
        return new e(v, v1);
    }

    public static d b(int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return f.a(v, v1);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int h() [...] // 潜在的解密器

    private static final g j(long v, g g0) {
        return new g(v, g0, 0);
    }

    @m
    public static final Object k(@l d d0, @l a a0, @l kotlin.coroutines.d d1) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
        @s0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt$withPermit$1\n*L\n1#1,392:1\n*E\n"})
        static final class kotlinx.coroutines.sync.f.a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            kotlinx.coroutines.sync.f.a(kotlin.coroutines.d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return f.k(null, null, this);
            }
        }

        kotlinx.coroutines.sync.f.a f$a0;
        if(d1 instanceof kotlinx.coroutines.sync.f.a) {
            f$a0 = (kotlinx.coroutines.sync.f.a)d1;
            int v = f$a0.n;
            if((v & 0x80000000) == 0) {
                f$a0 = new kotlinx.coroutines.sync.f.a(d1);
            }
            else {
                f$a0.n = v ^ 0x80000000;
            }
        }
        else {
            f$a0 = new kotlinx.coroutines.sync.f.a(d1);
        }
        Object object0 = f$a0.m;
        Object object1 = b.l();
        switch(f$a0.n) {
            case 0: {
                f0.n(object0);
                f$a0.k = d0;
                f$a0.l = a0;
                f$a0.n = 1;
                if(d0.g(f$a0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                a0 = (a)f$a0.l;
                d0 = (d)f$a0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return a0.invoke();
        }
        finally {
            d0.release();
        }
    }

    private static final Object l(d d0, a a0, kotlin.coroutines.d d1) {
        d0.g(d1);
        try {
            return a0.invoke();
        }
        finally {
            d0.release();
        }
    }
}

