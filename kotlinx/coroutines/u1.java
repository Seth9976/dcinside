package kotlinx.coroutines;

import A3.o;
import M3.b;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.time.g;
import kotlin.time.h;
import y4.l;
import y4.m;

public final class u1 {
    @l
    public static final s1 a(long v, @l Z z0, @l I0 i00) {
        b0 b00 = z0 instanceof b0 ? ((b0)z0) : null;
        if(b00 != null) {
            String s = b00.b(g.n0(v, h.d));
            return s == null ? new s1("Timed out waiting for " + v + " ms", i00) : new s1(s, i00);
        }
        return new s1("Timed out waiting for " + v + " ms", i00);
    }

    private static final Object b(t1 t10, o o0) {
        M0.y(t10, a0.d(t10.d.getContext()).Y(t10.e, t10, t10.getContext()));
        return b.e(t10, t10, o0);
    }

    @m
    public static final Object c(long v, @l o o0, @l d d0) {
        if(v <= 0L) {
            throw new s1("Timed out immediately");
        }
        Object object0 = u1.b(new t1(v, d0), o0);
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(d0);
        }
        return object0;
    }

    @m
    public static final Object d(long v, @l o o0, @l d d0) {
        return u1.c(a0.e(v), o0, d0);
    }

    @m
    public static final Object e(long v, @l o o0, @l d d0) {
        @f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {101}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            long k;
            Object l;
            Object m;
            Object n;
            int o;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u1.e(0L, null, this);
            }
        }

        kotlin.jvm.internal.l0.h l0$h1;
        a u1$a0;
        if(d0 instanceof a) {
            u1$a0 = (a)d0;
            int v1 = u1$a0.o;
            if((v1 & 0x80000000) == 0) {
                u1$a0 = new a(d0);
            }
            else {
                u1$a0.o = v1 ^ 0x80000000;
            }
        }
        else {
            u1$a0 = new a(d0);
        }
        Object object0 = u1$a0.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(u1$a0.o) {
            case 0: {
                f0.n(object0);
                if(v <= 0L) {
                    return null;
                }
                kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
                try {
                    u1$a0.l = o0;
                    u1$a0.m = l0$h0;
                    u1$a0.k = v;
                    u1$a0.o = 1;
                    t1 t10 = new t1(v, u1$a0);
                    l0$h0.a = t10;
                    Object object2 = u1.b(t10, o0);
                    if(object2 == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(u1$a0);
                        return object2 == object1 ? object1 : object2;
                    }
                    return object2 == object1 ? object1 : object2;
                }
                catch(s1 s10) {
                    l0$h1 = l0$h0;
                    goto label_36;
                }
            }
            case 1: {
                l0$h1 = (kotlin.jvm.internal.l0.h)u1$a0.m;
                o o1 = (o)u1$a0.l;
                try {
                    f0.n(object0);
                    return object0;
                }
                catch(s1 s10) {
                }
            label_36:
                if(s10.a != l0$h1.a) {
                    throw s10;
                }
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object f(long v, @l o o0, @l d d0) {
        return u1.e(a0.e(v), o0, d0);
    }
}

