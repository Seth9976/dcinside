package kotlinx.coroutines.flow;

import A3.p;
import kotlin.S0;
import kotlin.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.time.e;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.G;
import kotlinx.coroutines.flow.internal.u;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.y0;
import y4.l;
import y4.m;

@s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
final class r {
    @y0
    @l
    public static final i a(@l i i0, long v) {
        static final class a extends N implements Function1 {
            final long e;

            a(long v) {
                this.e = v;
                super(1);
            }

            @l
            public final Long a(Object object0) {
                return this.e;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        return v1 == 0 ? i0 : r.e(i0, new a(v));
    }

    @U
    @y0
    @l
    public static final i b(@l i i0, @l Function1 function10) {
        return r.e(i0, function10);
    }

    @y0
    @l
    public static final i c(@l i i0, long v) {
        return k.a0(i0, a0.e(v));
    }

    @U
    @y0
    @l
    @z3.i(name = "debounceDuration")
    public static final i d(@l i i0, @l Function1 function10) {
        static final class b extends N implements Function1 {
            final Function1 e;

            b(Function1 function10) {
                this.e = function10;
                super(1);
            }

            @l
            public final Long a(Object object0) {
                return a0.e(((e)this.e.invoke(object0)).A0());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

        return r.e(i0, new b(function10));
    }

    private static final i e(i i0, Function1 function10) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {0xD7, 418}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
        @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n14#2:408\n14#2:410\n1#3:409\n51#4,8:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n212#1:408\n215#1:410\n222#1:411,8\n*E\n"})
        static final class c extends o implements p {
            Object k;
            Object l;
            int m;
            private Object n;
            Object o;
            final Function1 p;
            final i q;

            c(Function1 function10, i i0, d d0) {
                this.p = function10;
                this.q = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l j j0, @m d d0) {
                c r$c0 = new c(this.p, this.q, d0);
                r$c0.n = o0;
                r$c0.o = j0;
                return r$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((j)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {0xE2}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
                static final class kotlinx.coroutines.flow.r.c.a extends o implements Function1 {
                    int k;
                    final j l;
                    final h m;

                    kotlinx.coroutines.flow.r.c.a(j j0, h l0$h0, d d0) {
                        this.l = j0;
                        this.m = l0$h0;
                        super(1, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@l d d0) {
                        return new kotlinx.coroutines.flow.r.c.a(this.l, this.m, d0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((d)object0));
                    }

                    @m
                    public final Object invoke(@m d d0) {
                        return ((kotlinx.coroutines.flow.r.c.a)this.create(d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                if(this.l.emit((this.m.a == u.a ? null : this.m.a), this) == object1) {
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
                        this.m.a = null;
                        return S0.a;
                    }
                }


                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {0xEC}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
                @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n522#2,6:408\n538#2,4:414\n542#2:420\n1#3:418\n14#4:419\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,6\n233#1:414,4\n233#1:420\n236#1:419\n*E\n"})
                static final class kotlinx.coroutines.flow.r.c.b extends o implements A3.o {
                    Object k;
                    int l;
                    Object m;
                    final h n;
                    final j o;

                    kotlinx.coroutines.flow.r.c.b(h l0$h0, j j0, d d0) {
                        this.n = l0$h0;
                        this.o = j0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l Object object0, @m d d0) {
                        return ((kotlinx.coroutines.flow.r.c.b)this.create(kotlinx.coroutines.channels.p.b(object0), d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.r.c.b(this.n, this.o, d0);
                        d1.m = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((kotlinx.coroutines.channels.p)object0).o(), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        h l0$h0;
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.l) {
                            case 0: {
                                f0.n(object0);
                                Object object2 = ((kotlinx.coroutines.channels.p)this.m).o();
                                l0$h0 = this.n;
                                if(!(object2 instanceof kotlinx.coroutines.channels.p.c)) {
                                    l0$h0.a = object2;
                                }
                                j j0 = this.o;
                                if(!(object2 instanceof kotlinx.coroutines.channels.p.c)) {
                                    return S0.a;
                                }
                                Throwable throwable0 = kotlinx.coroutines.channels.p.f(object2);
                                if(throwable0 != null) {
                                    throw throwable0;
                                }
                                Object object3 = l0$h0.a;
                                if(object3 != null) {
                                    if(object3 == u.a) {
                                        object3 = null;
                                    }
                                    this.m = object2;
                                    this.k = l0$h0;
                                    this.l = 1;
                                    if(j0.emit(object3, this) == object1) {
                                        return object1;
                                    }
                                }
                                break;
                            }
                            case 1: {
                                h l0$h1 = (h)this.k;
                                f0.n(object0);
                                l0$h0 = l0$h1;
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        l0$h0.a = u.c;
                        return S0.a;
                    }
                }


                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.r.c.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final i m;

                    kotlinx.coroutines.flow.r.c.c(i i0, d d0) {
                        this.m = i0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.r.c.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((D)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l D d0, @m d d1) {
                        return ((kotlinx.coroutines.flow.r.c.c)this.create(d0, d1)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class kotlinx.coroutines.flow.r.c.c.a implements j {
                            final D a;

                            kotlinx.coroutines.flow.r.c.c.a(D d0) {
                                this.a = d0;
                                super();
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            @m
                            public final Object emit(Object object0, @l d d0) {
                                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
                                static final class kotlinx.coroutines.flow.r.c.c.a.a extends kotlin.coroutines.jvm.internal.d {
                                    Object k;
                                    final kotlinx.coroutines.flow.r.c.c.a l;
                                    int m;

                                    kotlinx.coroutines.flow.r.c.c.a.a(kotlinx.coroutines.flow.r.c.c.a r$c$c$a0, d d0) {
                                        this.l = r$c$c$a0;
                                        super(d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.m |= 0x80000000;
                                        return this.l.emit(null, this);
                                    }
                                }

                                kotlinx.coroutines.flow.r.c.c.a.a r$c$c$a$a0;
                                if(d0 instanceof kotlinx.coroutines.flow.r.c.c.a.a) {
                                    r$c$c$a$a0 = (kotlinx.coroutines.flow.r.c.c.a.a)d0;
                                    int v = r$c$c$a$a0.m;
                                    if((v & 0x80000000) == 0) {
                                        r$c$c$a$a0 = new kotlinx.coroutines.flow.r.c.c.a.a(this, d0);
                                    }
                                    else {
                                        r$c$c$a$a0.m = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    r$c$c$a$a0 = new kotlinx.coroutines.flow.r.c.c.a.a(this, d0);
                                }
                                Object object1 = r$c$c$a$a0.k;
                                Object object2 = kotlin.coroutines.intrinsics.b.l();
                                switch(r$c$c$a$a0.m) {
                                    case 0: {
                                        f0.n(object1);
                                        D d1 = this.a;
                                        if(object0 == null) {
                                            object0 = u.a;
                                        }
                                        r$c$c$a$a0.m = 1;
                                        return d1.I(object0, r$c$c$a$a0) == object2 ? object2 : S0.a;
                                    }
                                    case 1: {
                                        f0.n(object1);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                kotlinx.coroutines.flow.r.c.c.a r$c$c$a0 = new kotlinx.coroutines.flow.r.c.c.a(((D)this.l));
                                this.k = 1;
                                return this.m.collect(r$c$c$a0, this) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }

                j j2;
                F f2;
                h l0$h1;
                g l0$g0;
                F f1;
                j j1;
                h l0$h0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.n;
                        j j0 = (j)this.o;
                        F f0 = B.f(o0, null, 0, new kotlinx.coroutines.flow.r.c.c(this.q, null), 3, null);
                        l0$h0 = new h();
                        j1 = j0;
                        f1 = f0;
                        goto label_25;
                    }
                    case 1: {
                        l0$g0 = (g)this.l;
                        l0$h0 = (h)this.k;
                        f1 = (F)this.o;
                        j1 = (j)this.n;
                        f0.n(object0);
                        l0$h0.a = null;
                        goto label_47;
                    }
                    case 2: {
                        l0$h1 = (h)this.k;
                        f2 = (F)this.o;
                        j2 = (j)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    j1 = j2;
                    f1 = f2;
                    l0$h0 = l0$h1;
                label_25:
                    if(l0$h0.a == u.c) {
                        break;
                    }
                    l0$g0 = new g();
                    Object object2 = l0$h0.a;
                    if(object2 != null) {
                        Function1 function10 = this.p;
                        V v0 = u.a;
                        if(object2 == v0) {
                            object2 = null;
                        }
                        long v1 = ((Number)function10.invoke(object2)).longValue();
                        l0$g0.a = v1;
                        if(v1 < 0L) {
                            throw new IllegalArgumentException("Debounce timeout should not be negative");
                        }
                        if(v1 == 0L) {
                            this.n = j1;
                            this.o = f1;
                            this.k = l0$h0;
                            this.l = l0$g0;
                            this.m = 1;
                            if(j1.emit((l0$h0.a == v0 ? null : l0$h0.a), this) == object1) {
                                return object1;
                            }
                            l0$h0.a = null;
                        }
                    }
                label_47:
                    l0$h1 = l0$h0;
                    f2 = f1;
                    j2 = j1;
                    kotlinx.coroutines.selects.l l0 = new kotlinx.coroutines.selects.l(this.getContext());
                    if(l0$h1.a != null) {
                        kotlinx.coroutines.selects.b.a(l0, l0$g0.a, new kotlinx.coroutines.flow.r.c.a(j2, l0$h1, null));
                    }
                    l0.f(f2.m(), new kotlinx.coroutines.flow.r.c.b(l0$h1, j2, null));
                    this.n = j2;
                    this.o = f2;
                    this.k = l0$h1;
                    this.l = null;
                    this.m = 2;
                    if(l0.w(this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        return kotlinx.coroutines.flow.internal.p.b(new c(function10, i0, null));
    }

    @l
    public static final F f(@l O o0, long v) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
        static final class kotlinx.coroutines.flow.r.d extends o implements A3.o {
            int k;
            private Object l;
            final long m;

            kotlinx.coroutines.flow.r.d(long v, d d0) {
                this.m = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.r.d(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((kotlinx.coroutines.flow.r.d)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                D d0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.l;
                        this.l = d0;
                        this.k = 1;
                        if(a0.b(this.m, this) != object1) {
                            goto label_18;
                        }
                        return object1;
                    }
                    case 2: {
                        d0 = (D)this.l;
                        f0.n(object0);
                        break;
                    }
                    case 1: 
                    case 3: {
                        d0 = (D)this.l;
                        f0.n(object0);
                        goto label_18;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    this.l = d0;
                    this.k = 3;
                    if(a0.b(this.m, this) == object1) {
                        return object1;
                    }
                label_18:
                    G g0 = d0.b();
                    this.l = d0;
                    this.k = 2;
                }
                while(g0.I(S0.a, this) != object1);
                return object1;
            }
        }

        return B.f(o0, null, 0, new kotlinx.coroutines.flow.r.d(v, null), 1, null);
    }

    @y0
    @l
    public static final i g(@l i i0, long v) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {0x19F}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
        @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n51#2,8:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n278#1:408,8\n*E\n"})
        static final class kotlinx.coroutines.flow.r.e extends o implements p {
            Object k;
            Object l;
            int m;
            private Object n;
            Object o;
            final long p;
            final i q;

            kotlinx.coroutines.flow.r.e(long v, i i0, d d0) {
                this.p = v;
                this.q = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l j j0, @m d d0) {
                kotlinx.coroutines.flow.r.e r$e0 = new kotlinx.coroutines.flow.r.e(this.p, this.q, d0);
                r$e0.n = o0;
                r$e0.o = j0;
                return r$e0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((j)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n522#2,6:408\n538#2,4:414\n542#2:419\n1#3:418\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n281#1:408,6\n282#1:414,4\n282#1:419\n*E\n"})
                static final class kotlinx.coroutines.flow.r.e.a extends o implements A3.o {
                    int k;
                    Object l;
                    final h m;
                    final F n;

                    kotlinx.coroutines.flow.r.e.a(h l0$h0, F f0, d d0) {
                        this.m = l0$h0;
                        this.n = f0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l Object object0, @m d d0) {
                        return ((kotlinx.coroutines.flow.r.e.a)this.create(kotlinx.coroutines.channels.p.b(object0), d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.r.e.a(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((kotlinx.coroutines.channels.p)object0).o(), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Object object1 = ((kotlinx.coroutines.channels.p)this.l).o();
                        h l0$h0 = this.m;
                        if(!(object1 instanceof kotlinx.coroutines.channels.p.c)) {
                            l0$h0.a = object1;
                        }
                        F f0 = this.n;
                        if(object1 instanceof kotlinx.coroutines.channels.p.c) {
                            Throwable throwable0 = kotlinx.coroutines.channels.p.f(object1);
                            if(throwable0 != null) {
                                throw throwable0;
                            }
                            f0.e(new kotlinx.coroutines.flow.internal.l());
                            l0$h0.a = u.c;
                            return S0.a;
                        }
                        return S0.a;
                    }
                }


                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
                static final class kotlinx.coroutines.flow.r.e.b extends o implements A3.o {
                    int k;
                    final h l;
                    final j m;

                    kotlinx.coroutines.flow.r.e.b(h l0$h0, j j0, d d0) {
                        this.l = l0$h0;
                        this.m = j0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l S0 s00, @m d d0) {
                        return ((kotlinx.coroutines.flow.r.e.b)this.create(s00, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new kotlinx.coroutines.flow.r.e.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((S0)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                h l0$h0 = this.l;
                                Object object2 = l0$h0.a;
                                if(object2 == null) {
                                    return S0.a;
                                }
                                l0$h0.a = null;
                                j j0 = this.m;
                                if(object2 == u.a) {
                                    object2 = null;
                                }
                                this.k = 1;
                                return j0.emit(object2, this) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }


                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.r.e.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final i m;

                    kotlinx.coroutines.flow.r.e.c(i i0, d d0) {
                        this.m = i0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.r.e.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((D)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l D d0, @m d d1) {
                        return ((kotlinx.coroutines.flow.r.e.c)this.create(d0, d1)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class kotlinx.coroutines.flow.r.e.c.a implements j {
                            final D a;

                            kotlinx.coroutines.flow.r.e.c.a(D d0) {
                                this.a = d0;
                                super();
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            @m
                            public final Object emit(Object object0, @l d d0) {
                                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {273}, m = "emit", n = {}, s = {})
                                static final class kotlinx.coroutines.flow.r.e.c.a.a extends kotlin.coroutines.jvm.internal.d {
                                    Object k;
                                    final kotlinx.coroutines.flow.r.e.c.a l;
                                    int m;

                                    kotlinx.coroutines.flow.r.e.c.a.a(kotlinx.coroutines.flow.r.e.c.a r$e$c$a0, d d0) {
                                        this.l = r$e$c$a0;
                                        super(d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.m |= 0x80000000;
                                        return this.l.emit(null, this);
                                    }
                                }

                                kotlinx.coroutines.flow.r.e.c.a.a r$e$c$a$a0;
                                if(d0 instanceof kotlinx.coroutines.flow.r.e.c.a.a) {
                                    r$e$c$a$a0 = (kotlinx.coroutines.flow.r.e.c.a.a)d0;
                                    int v = r$e$c$a$a0.m;
                                    if((v & 0x80000000) == 0) {
                                        r$e$c$a$a0 = new kotlinx.coroutines.flow.r.e.c.a.a(this, d0);
                                    }
                                    else {
                                        r$e$c$a$a0.m = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    r$e$c$a$a0 = new kotlinx.coroutines.flow.r.e.c.a.a(this, d0);
                                }
                                Object object1 = r$e$c$a$a0.k;
                                Object object2 = kotlin.coroutines.intrinsics.b.l();
                                switch(r$e$c$a$a0.m) {
                                    case 0: {
                                        f0.n(object1);
                                        D d1 = this.a;
                                        if(object0 == null) {
                                            object0 = u.a;
                                        }
                                        r$e$c$a$a0.m = 1;
                                        return d1.I(object0, r$e$c$a$a0) == object2 ? object2 : S0.a;
                                    }
                                    case 1: {
                                        f0.n(object1);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                kotlinx.coroutines.flow.r.e.c.a r$e$c$a0 = new kotlinx.coroutines.flow.r.e.c.a(((D)this.l));
                                this.k = 1;
                                return this.m.collect(r$e$c$a0, this) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }

                h l0$h1;
                F f2;
                F f1;
                j j1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.n;
                        j j0 = (j)this.o;
                        F f0 = B.f(o0, null, -1, new kotlinx.coroutines.flow.r.e.c(this.q, null), 1, null);
                        h l0$h0 = new h();
                        j1 = j0;
                        f1 = k.y0(o0, this.p);
                        f2 = f0;
                        l0$h1 = l0$h0;
                        break;
                    }
                    case 1: {
                        f1 = (F)this.l;
                        l0$h1 = (h)this.k;
                        f2 = (F)this.o;
                        j1 = (j)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(l0$h1.a != u.c) {
                    kotlinx.coroutines.selects.l l0 = new kotlinx.coroutines.selects.l(this.getContext());
                    l0.f(f2.m(), new kotlinx.coroutines.flow.r.e.a(l0$h1, f1, null));
                    l0.f(f1.D(), new kotlinx.coroutines.flow.r.e.b(l0$h1, j1, null));
                    this.n = j1;
                    this.o = f2;
                    this.k = l0$h1;
                    this.l = f1;
                    this.m = 1;
                    if(l0.w(this) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        if(v <= 0L) {
            throw new IllegalArgumentException("Sample period should be positive");
        }
        return kotlinx.coroutines.flow.internal.p.b(new kotlinx.coroutines.flow.r.e(v, i0, null));
    }

    @y0
    @l
    public static final i h(@l i i0, long v) {
        return k.A1(i0, a0.e(v));
    }

    @y0
    @l
    public static final i i(@l i i0, long v) {
        return r.j(i0, v);
    }

    private static final i j(i i0, long v) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {0x1A0}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
        @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:417\n51#3,8:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:417\n392#1:409,8\n*E\n"})
        static final class kotlinx.coroutines.flow.r.f extends o implements p {
            long k;
            int l;
            private Object m;
            Object n;
            final long o;
            final i p;

            kotlinx.coroutines.flow.r.f(long v, i i0, d d0) {
                this.o = v;
                this.p = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l j j0, @m d d0) {
                kotlinx.coroutines.flow.r.f r$f0 = new kotlinx.coroutines.flow.r.f(this.o, this.p, d0);
                r$f0.m = o0;
                r$f0.n = j0;
                return r$f0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((j)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
                @s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n522#2,6:408\n556#2,4:414\n560#2:419\n1#3:418\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,6\n396#1:414,4\n396#1:419\n*E\n"})
                static final class kotlinx.coroutines.flow.r.f.a extends o implements A3.o {
                    int k;
                    Object l;
                    final j m;

                    kotlinx.coroutines.flow.r.f.a(j j0, d d0) {
                        this.m = j0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l Object object0, @m d d0) {
                        return ((kotlinx.coroutines.flow.r.f.a)this.create(kotlinx.coroutines.channels.p.b(object0), d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.r.f.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((kotlinx.coroutines.channels.p)object0).o(), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object2;
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                object2 = ((kotlinx.coroutines.channels.p)this.l).o();
                                j j0 = this.m;
                                if(!(object2 instanceof kotlinx.coroutines.channels.p.c)) {
                                    this.l = object2;
                                    this.k = 1;
                                    if(j0.emit(object2, this) == object1) {
                                        return object1;
                                    }
                                }
                                break;
                            }
                            case 1: {
                                Object object3 = this.l;
                                f0.n(object0);
                                object2 = object3;
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(object2 instanceof kotlinx.coroutines.channels.p.a) {
                            Throwable throwable0 = kotlinx.coroutines.channels.p.f(object2);
                            if(throwable0 != null) {
                                throw throwable0;
                            }
                            return kotlin.coroutines.jvm.internal.b.a(false);
                        }
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                }


                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.r.f.b extends o implements Function1 {
                    int k;
                    final long l;

                    kotlinx.coroutines.flow.r.f.b(long v, d d0) {
                        this.l = v;
                        super(1, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@l d d0) {
                        return new kotlinx.coroutines.flow.r.f.b(this.l, d0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((d)object0));
                    }

                    @m
                    public final Object invoke(@m d d0) {
                        return ((kotlinx.coroutines.flow.r.f.b)this.create(d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        throw new s1("Timed out waiting for " + e.v0(this.l));
                    }
                }

                F f1;
                j j1;
                long v;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.m;
                        j j0 = (j)this.n;
                        if(e.h(this.o, 0L) <= 0) {
                            throw new s1("Timed out immediately");
                        }
                        F f0 = k.n1(kotlinx.coroutines.flow.p.d(this.p, 0, null, 2, null), o0);
                        v = this.o;
                        j1 = j0;
                        f1 = f0;
                        goto label_19;
                    }
                    case 1: {
                        v = this.k;
                        f1 = (F)this.n;
                        j1 = (j)this.m;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    if(!((Boolean)object0).booleanValue()) {
                        return S0.a;
                    }
                label_19:
                    kotlinx.coroutines.selects.l l0 = new kotlinx.coroutines.selects.l(this.getContext());
                    l0.f(f1.m(), new kotlinx.coroutines.flow.r.f.a(j1, null));
                    kotlinx.coroutines.selects.b.b(l0, v, new kotlinx.coroutines.flow.r.f.b(v, null));
                    this.m = j1;
                    this.n = f1;
                    this.k = v;
                    this.l = 1;
                    object0 = l0.w(this);
                }
                while(object0 != object1);
                return object1;
            }
        }

        return kotlinx.coroutines.flow.internal.p.b(new kotlinx.coroutines.flow.r.f(v, i0, null));
    }
}

