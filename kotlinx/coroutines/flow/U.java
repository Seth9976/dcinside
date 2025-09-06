package kotlinx.coroutines.flow;

import A3.p;
import A3.q;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.o;
import kotlinx.coroutines.I0;
import y4.l;
import y4.m;

@s0({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
final class u {
    @l
    public static final i a(@l i i0, @l p p0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,111:1\n55#2,3:112\n*E\n"})
        public static final class a implements i {
            final i a;
            final p b;

            public a(i i0, p p0) {
                this.a = i0;
                this.b = p0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {0x70, 0x71}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.u.a.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final a m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.u.a.a(a u$a0, d d0) {
                        this.m = u$a0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                a u$a0;
                kotlinx.coroutines.flow.u.a.a u$a$a0;
                if(d0 instanceof kotlinx.coroutines.flow.u.a.a) {
                    u$a$a0 = (kotlinx.coroutines.flow.u.a.a)d0;
                    int v = u$a$a0.l;
                    if((v & 0x80000000) == 0) {
                        u$a$a0 = new kotlinx.coroutines.flow.u.a.a(this, d0);
                    }
                    else {
                        u$a$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    u$a$a0 = new kotlinx.coroutines.flow.u.a.a(this, d0);
                }
                Object object0 = u$a$a0.k;
                Object object1 = b.l();
                switch(u$a$a0.l) {
                    case 0: {
                        f0.n(object0);
                        u$a$a0.n = this;
                        u$a$a0.o = j0;
                        u$a$a0.l = 1;
                        object0 = k.v(this.a, j0, u$a$a0);
                        if(object0 == object1) {
                            return object1;
                        }
                        u$a0 = this;
                        break;
                    }
                    case 1: {
                        j0 = (j)u$a$a0.o;
                        u$a0 = (a)u$a$a0.n;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((Throwable)object0) != null) {
                    u$a$a0.n = null;
                    u$a$a0.o = null;
                    u$a$a0.l = 2;
                    if(u$a0.b.invoke(j0, ((Throwable)object0), u$a$a0) == object1) {
                        return object1;
                    }
                }
                return S0.a;
            }
        }

        return new a(i0, p0);
    }

    @m
    public static final Object b(@l i i0, @l j j0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {0x98}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.u.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.u.b(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.v(null, null, this);
            }
        }


        static final class c implements j {
            final j a;
            final h b;

            c(j j0, h l0$h0) {
                this.a = j0;
                this.b = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {0x9A}, m = "emit", n = {"this"}, s = {"L$0"})
                static final class kotlinx.coroutines.flow.u.c.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    final c m;
                    int n;

                    kotlinx.coroutines.flow.u.c.a(c u$c0, d d0) {
                        this.m = u$c0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return this.m.emit(null, this);
                    }
                }

                c u$c0;
                kotlinx.coroutines.flow.u.c.a u$c$a0;
                if(d0 instanceof kotlinx.coroutines.flow.u.c.a) {
                    u$c$a0 = (kotlinx.coroutines.flow.u.c.a)d0;
                    int v = u$c$a0.n;
                    if((v & 0x80000000) == 0) {
                        u$c$a0 = new kotlinx.coroutines.flow.u.c.a(this, d0);
                    }
                    else {
                        u$c$a0.n = v ^ 0x80000000;
                    }
                }
                else {
                    u$c$a0 = new kotlinx.coroutines.flow.u.c.a(this, d0);
                }
                Object object1 = u$c$a0.l;
                Object object2 = b.l();
                switch(u$c$a0.n) {
                    case 0: {
                        f0.n(object1);
                        try {
                            u$c$a0.k = this;
                            u$c$a0.n = 1;
                            return this.a.emit(object0, u$c$a0) == object2 ? object2 : S0.a;
                        }
                        catch(Throwable throwable0) {
                            u$c0 = this;
                            u$c0.b.a = throwable0;
                            throw throwable0;
                        }
                    }
                    case 1: {
                        u$c0 = (c)u$c$a0.k;
                        try {
                            f0.n(object1);
                            return S0.a;
                        }
                        catch(Throwable throwable0) {
                        }
                        u$c0.b.a = throwable0;
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        h l0$h1;
        kotlinx.coroutines.flow.u.b u$b0;
        if(d0 instanceof kotlinx.coroutines.flow.u.b) {
            u$b0 = (kotlinx.coroutines.flow.u.b)d0;
            int v = u$b0.m;
            if((v & 0x80000000) == 0) {
                u$b0 = new kotlinx.coroutines.flow.u.b(d0);
            }
            else {
                u$b0.m = v ^ 0x80000000;
            }
        }
        else {
            u$b0 = new kotlinx.coroutines.flow.u.b(d0);
        }
        Object object0 = u$b0.l;
        Object object1 = b.l();
        switch(u$b0.m) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                try {
                    c u$c0 = new c(j0, l0$h0);
                    u$b0.k = l0$h0;
                    u$b0.m = 1;
                    return i0.collect(u$c0, u$b0) == object1 ? object1 : null;
                }
                catch(Throwable object2) {
                    l0$h1 = l0$h0;
                    goto label_29;
                }
                return object1;
            }
            case 1: {
                l0$h1 = (h)u$b0.k;
                try {
                    f0.n(object0);
                    return null;
                }
                catch(Throwable object2) {
                }
            label_29:
                Throwable throwable0 = (Throwable)l0$h1.a;
                if(u.d(((Throwable)object2), throwable0) || u.c(((Throwable)object2), u$b0.getContext())) {
                    throw object2;
                }
                if(throwable0 == null) {
                    return object2;
                }
                if(object2 instanceof CancellationException) {
                    o.a(throwable0, ((Throwable)object2));
                    throw throwable0;
                }
                o.a(((Throwable)object2), throwable0);
                throw object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private static final boolean c(Throwable throwable0, g g0) {
        I0 i00 = (I0)g0.get(I0.B8);
        return i00 == null || !i00.isCancelled() ? false : u.d(throwable0, i00.L0());
    }

    private static final boolean d(Throwable throwable0, Throwable throwable1) {
        return throwable1 != null && L.g(throwable1, throwable0);
    }

    @l
    public static final i e(@l i i0, long v, @l A3.o o0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements q {
            int k;
            Object l;
            long m;
            final long n;
            final A3.o o;

            e(long v, A3.o o0, d d0) {
                this.n = v;
                this.o = o0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((j)object0), ((Throwable)object1), ((Number)object2).longValue(), ((d)object3));
            }

            @m
            public final Object a(@l j j0, @l Throwable throwable0, long v, @m d d0) {
                e u$e0 = new e(this.n, this.o, d0);
                u$e0.l = throwable0;
                u$e0.m = v;
                return u$e0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                boolean z = true;
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Throwable throwable0 = (Throwable)this.l;
                        if(this.m >= this.n) {
                            return kotlin.coroutines.jvm.internal.b.a(false);
                        }
                        this.k = 1;
                        object0 = this.o.invoke(throwable0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!((Boolean)object0).booleanValue()) {
                    z = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z);
            }
        }

        if(v <= 0L) {
            throw new IllegalArgumentException(("Expected positive amount of retries, but had " + v).toString());
        }
        return k.x1(i0, new e(v, o0, null));
    }

    public static i f(i i0, long v, A3.o o0, int v1, Object object0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.u.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;

            kotlinx.coroutines.flow.u.d(d d0) {
                super(2, d0);
            }

            @m
            public final Object a(@l Throwable throwable0, @m d d0) {
                return ((kotlinx.coroutines.flow.u.d)this.create(throwable0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new kotlinx.coroutines.flow.u.d(d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Throwable)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
        }

        if((v1 & 1) != 0) {
            v = 0x7FFFFFFFFFFFFFFFL;
        }
        if((v1 & 2) != 0) {
            o0 = new kotlinx.coroutines.flow.u.d(null);
        }
        return k.v1(i0, v, o0);
    }

    @l
    public static final i g(@l i i0, @l q q0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,111:1\n129#2,15:112\n*E\n"})
        public static final class kotlinx.coroutines.flow.u.f implements i {
            final i a;
            final q b;

            public kotlinx.coroutines.flow.u.f(i i0, q q0) {
                this.a = i0;
                this.b = q0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {0x74, 0x76}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.u.f.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.u.f m;
                    Object n;
                    Object o;
                    Object p;
                    long q;
                    int r;

                    public kotlinx.coroutines.flow.u.f.a(kotlinx.coroutines.flow.u.f u$f0, d d0) {
                        this.m = u$f0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Throwable throwable0;
                kotlinx.coroutines.flow.u.f u$f1;
                j j1;
                int v2;
                kotlinx.coroutines.flow.u.f u$f0;
                long v1;
                kotlinx.coroutines.flow.u.f.a u$f$a0;
                if(d0 instanceof kotlinx.coroutines.flow.u.f.a) {
                    u$f$a0 = (kotlinx.coroutines.flow.u.f.a)d0;
                    int v = u$f$a0.l;
                    if((v & 0x80000000) == 0) {
                        u$f$a0 = new kotlinx.coroutines.flow.u.f.a(this, d0);
                    }
                    else {
                        u$f$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    u$f$a0 = new kotlinx.coroutines.flow.u.f.a(this, d0);
                }
                Object object0 = u$f$a0.k;
                Object object1 = b.l();
                switch(u$f$a0.l) {
                    case 0: {
                        f0.n(object0);
                        v1 = 0L;
                        u$f0 = this;
                        goto label_35;
                    }
                    case 1: {
                        v2 = u$f$a0.r;
                        v1 = u$f$a0.q;
                        j1 = (j)u$f$a0.o;
                        u$f1 = (kotlinx.coroutines.flow.u.f)u$f$a0.n;
                        f0.n(object0);
                        goto label_48;
                    }
                    case 2: {
                        v1 = u$f$a0.q;
                        throwable0 = (Throwable)u$f$a0.p;
                        j1 = (j)u$f$a0.o;
                        u$f1 = (kotlinx.coroutines.flow.u.f)u$f$a0.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(((Boolean)object0).booleanValue()) {
                    ++v1;
                    u$f0 = u$f1;
                    v2 = 1;
                    while(true) {
                        if(v2 == 0) {
                            return S0.a;
                        }
                        j0 = j1;
                    label_35:
                        u$f$a0.n = u$f0;
                        u$f$a0.o = j0;
                        u$f$a0.p = null;
                        u$f$a0.q = v1;
                        u$f$a0.r = 0;
                        u$f$a0.l = 1;
                        Object object2 = k.v(u$f0.a, j0, u$f$a0);
                        if(object2 == object1) {
                            return object1;
                        }
                        u$f1 = u$f0;
                        object0 = object2;
                        j1 = j0;
                        v2 = 0;
                    label_48:
                        if(((Throwable)object0) != null) {
                            break;
                        }
                        u$f0 = u$f1;
                    }
                    u$f$a0.n = u$f1;
                    u$f$a0.o = j1;
                    u$f$a0.p = (Throwable)object0;
                    u$f$a0.q = v1;
                    u$f$a0.l = 2;
                    Object object3 = u$f1.b.T0(j1, ((Throwable)object0), kotlin.coroutines.jvm.internal.b.g(v1), u$f$a0);
                    if(object3 == object1) {
                        return object1;
                    }
                    Throwable throwable1 = (Throwable)object0;
                    object0 = object3;
                    throwable0 = throwable1;
                }
                throw throwable0;
            }
        }

        return new kotlinx.coroutines.flow.u.f(i0, q0);
    }
}

