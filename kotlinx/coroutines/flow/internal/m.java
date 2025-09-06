package kotlinx.coroutines.flow.internal;

import A3.a;
import A3.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.S0;
import kotlin.b0;
import kotlin.collections.P;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.A1;
import kotlinx.coroutines.A;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.G;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import y4.l;

@s0({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,140:1\n105#2:141\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n83#1:141\n*E\n"})
public final class m {
    @b0
    @y4.m
    public static final Object a(@l j j0, @l i[] arr_i, @l a a0, @l p p0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
        static final class kotlinx.coroutines.flow.internal.m.a extends o implements A3.o {
            Object k;
            Object l;
            int m;
            int n;
            int o;
            private Object p;
            final i[] q;
            final a r;
            final p s;
            final j t;

            kotlinx.coroutines.flow.internal.m.a(i[] arr_i, a a0, p p0, j j0, d d0) {
                this.q = arr_i;
                this.r = a0;
                this.s = p0;
                this.t = j0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.internal.m.a(this.q, this.r, this.s, this.t, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((kotlinx.coroutines.flow.internal.m.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.internal.m.a.a extends o implements A3.o {
                    int k;
                    final i[] l;
                    final int m;
                    final AtomicInteger n;
                    final kotlinx.coroutines.channels.l o;

                    kotlinx.coroutines.flow.internal.m.a.a(i[] arr_i, int v, AtomicInteger atomicInteger0, kotlinx.coroutines.channels.l l0, d d0) {
                        this.l = arr_i;
                        this.m = v;
                        this.n = atomicInteger0;
                        this.o = l0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        return new kotlinx.coroutines.flow.internal.m.a.a(this.l, this.m, this.n, this.o, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m d d0) {
                        return ((kotlinx.coroutines.flow.internal.m.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class kotlinx.coroutines.flow.internal.m.a.a.a implements j {
                            final kotlinx.coroutines.channels.l a;
                            final int b;

                            kotlinx.coroutines.flow.internal.m.a.a.a(kotlinx.coroutines.channels.l l0, int v) {
                                this.a = l0;
                                this.b = v;
                                super();
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            @y4.m
                            public final Object emit(Object object0, @l d d0) {
                                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
                                static final class kotlinx.coroutines.flow.internal.m.a.a.a.a extends kotlin.coroutines.jvm.internal.d {
                                    Object k;
                                    final kotlinx.coroutines.flow.internal.m.a.a.a l;
                                    int m;

                                    kotlinx.coroutines.flow.internal.m.a.a.a.a(kotlinx.coroutines.flow.internal.m.a.a.a m$a$a$a0, d d0) {
                                        this.l = m$a$a$a0;
                                        super(d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @y4.m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.m |= 0x80000000;
                                        return this.l.emit(null, this);
                                    }
                                }

                                kotlinx.coroutines.flow.internal.m.a.a.a.a m$a$a$a$a0;
                                if(d0 instanceof kotlinx.coroutines.flow.internal.m.a.a.a.a) {
                                    m$a$a$a$a0 = (kotlinx.coroutines.flow.internal.m.a.a.a.a)d0;
                                    int v = m$a$a$a$a0.m;
                                    if((v & 0x80000000) == 0) {
                                        m$a$a$a$a0 = new kotlinx.coroutines.flow.internal.m.a.a.a.a(this, d0);
                                    }
                                    else {
                                        m$a$a$a$a0.m = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    m$a$a$a$a0 = new kotlinx.coroutines.flow.internal.m.a.a.a.a(this, d0);
                                }
                                Object object1 = m$a$a$a$a0.k;
                                Object object2 = b.l();
                                switch(m$a$a$a$a0.m) {
                                    case 0: {
                                        f0.n(object1);
                                        P p0 = new P(this.b, object0);
                                        m$a$a$a$a0.m = 1;
                                        if(this.a.I(p0, m$a$a$a$a0) == object2) {
                                            return object2;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        f0.n(object1);
                                        break;
                                    }
                                    case 2: {
                                        f0.n(object1);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                m$a$a$a$a0.m = 2;
                                return A1.a(m$a$a$a$a0) == object2 ? object2 : S0.a;
                            }
                        }

                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                try {
                                    i i0 = this.l[this.m];
                                    kotlinx.coroutines.flow.internal.m.a.a.a m$a$a$a0 = new kotlinx.coroutines.flow.internal.m.a.a.a(this.o, this.m);
                                    this.k = 1;
                                    if(i0.collect(m$a$a$a0, this) == object1) {
                                        return object1;
                                    label_9:
                                        f0.n(object0);
                                    }
                                    break;
                                }
                                catch(Throwable throwable0) {
                                    goto label_12;
                                }
                            }
                            case 1: {
                                goto label_9;
                            label_12:
                                if(this.n.decrementAndGet() == 0) {
                                    kotlinx.coroutines.channels.G.a.a(this.o, null, 1, null);
                                }
                                throw throwable0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(this.n.decrementAndGet() == 0) {
                            kotlinx.coroutines.channels.G.a.a(this.o, null, 1, null);
                        }
                        return S0.a;
                    }
                }

                int v4;
                Object object2;
                Object[] arr_object1;
                kotlinx.coroutines.channels.l l1;
                int v2;
                byte[] arr_b;
                int v;
                Object[] arr_object;
                Object object1 = b.l();
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.p;
                        if(this.q.length == 0) {
                            return S0.a;
                        }
                        arr_object = new Object[this.q.length];
                        kotlin.collections.l.V1(arr_object, u.b, 0, 0, 6, null);
                        kotlinx.coroutines.channels.l l0 = kotlinx.coroutines.channels.o.d(this.q.length, null, null, 6, null);
                        AtomicInteger atomicInteger0 = new AtomicInteger(this.q.length);
                        v = 0;
                        for(int v1 = 0; v1 < this.q.length; ++v1) {
                            k.f(o0, null, null, new kotlinx.coroutines.flow.internal.m.a.a(this.q, v1, atomicInteger0, l0, null), 3, null);
                        }
                        arr_b = new byte[this.q.length];
                        v2 = this.q.length;
                        l1 = l0;
                        goto label_42;
                    }
                    case 1: {
                        int v3 = this.n;
                        v2 = this.m;
                        byte[] arr_b1 = (byte[])this.l;
                        kotlinx.coroutines.channels.l l2 = (kotlinx.coroutines.channels.l)this.k;
                        arr_object1 = (Object[])this.p;
                        f0.n(object0);
                        object2 = ((kotlinx.coroutines.channels.p)object0).o();
                        v4 = v3;
                        arr_b = arr_b1;
                        l1 = l2;
                        goto label_53;
                    }
                    case 2: 
                    case 3: {
                        int v5 = this.n;
                        v2 = this.m;
                        byte[] arr_b2 = (byte[])this.l;
                        kotlinx.coroutines.channels.l l3 = (kotlinx.coroutines.channels.l)this.k;
                        arr_object1 = (Object[])this.p;
                        f0.n(object0);
                        v = v5;
                        arr_b = arr_b2;
                        l1 = l3;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    arr_object = arr_object1;
                label_42:
                    v4 = (byte)(v + 1);
                    this.p = arr_object;
                    this.k = l1;
                    this.l = arr_b;
                    this.m = v2;
                    this.n = v4;
                    this.o = 1;
                    object2 = l1.z(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    arr_object1 = arr_object;
                label_53:
                    P p0 = (P)kotlinx.coroutines.channels.p.h(object2);
                    if(p0 == null) {
                        return S0.a;
                    }
                    while(true) {
                        int v6 = p0.e();
                        Object object3 = arr_object1[v6];
                        arr_object1[v6] = p0.f();
                        if(object3 == u.b) {
                            --v2;
                        }
                        if(arr_b[v6] == v4) {
                            break;
                        }
                        arr_b[v6] = (byte)v4;
                        P p1 = (P)kotlinx.coroutines.channels.p.h(l1.v());
                        if(p1 == null) {
                            break;
                        }
                        p0 = p1;
                    }
                    if(v2 == 0) {
                        Object[] arr_object2 = (Object[])this.r.invoke();
                        if(arr_object2 == null) {
                            this.p = arr_object1;
                            this.k = l1;
                            this.l = arr_b;
                            this.m = 0;
                            this.n = v4;
                            this.o = 2;
                            if(this.s.invoke(this.t, arr_object1, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            kotlin.collections.l.K0(arr_object1, arr_object2, 0, 0, 0, 14, null);
                            this.p = arr_object1;
                            this.k = l1;
                            this.l = arr_b;
                            this.m = 0;
                            this.n = v4;
                            this.o = 3;
                            if(this.s.invoke(this.t, arr_object2, this) == object1) {
                                return object1;
                            }
                        }
                    }
                    v = v4;
                }
            }
        }

        Object object0 = kotlinx.coroutines.flow.internal.p.a(new kotlinx.coroutines.flow.internal.m.a(arr_i, a0, p0, j0, null), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @l
    public static final i b(@l i i0, @l i i1, @l p p0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,111:1\n84#2:112\n139#2:113\n*E\n"})
        public static final class kotlinx.coroutines.flow.internal.m.b implements i {
            final i a;
            final i b;
            final p c;

            public kotlinx.coroutines.flow.internal.m.b(i i0, i i1, p p0) {
                this.a = i0;
                this.b = i1;
                this.c = p0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @y4.m
            public Object collect(@l j j0, @l d d0) {
                Object object0 = kotlinx.coroutines.P.g(new c(this.a, this.b, j0, this.c, null), d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {0x7B}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
        static final class c extends o implements A3.o {
            Object k;
            int l;
            private Object m;
            final i n;
            final i o;
            final j p;
            final p q;

            c(i i0, i i1, j j0, p p0, d d0) {
                this.n = i0;
                this.o = i1;
                this.p = j0;
                this.q = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new c(this.n, this.o, this.p, this.q, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                static final class kotlinx.coroutines.flow.internal.m.c.a extends N implements Function1 {
                    final A e;

                    kotlinx.coroutines.flow.internal.m.c.a(A a0) {
                        this.e = a0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Throwable)object0));
                        return S0.a;
                    }

                    public final void invoke(@y4.m Throwable throwable0) {
                        if(this.e.isActive()) {
                            kotlinx.coroutines.flow.internal.a a0 = new kotlinx.coroutines.flow.internal.a(this.e);
                            this.e.e(a0);
                        }
                    }
                }


                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {0x7C}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.internal.m.c.b extends o implements A3.o {
                    int k;
                    final i l;
                    final g m;
                    final Object n;
                    final F o;
                    final j p;
                    final p q;
                    final A r;

                    kotlinx.coroutines.flow.internal.m.c.b(i i0, g g0, Object object0, F f0, j j0, p p0, A a0, d d0) {
                        this.l = i0;
                        this.m = g0;
                        this.n = object0;
                        this.o = f0;
                        this.p = j0;
                        this.q = p0;
                        this.r = a0;
                        super(2, d0);
                    }

                    @y4.m
                    public final Object a(@l S0 s00, @y4.m d d0) {
                        return ((kotlinx.coroutines.flow.internal.m.c.b)this.create(s00, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        return new kotlinx.coroutines.flow.internal.m.c.b(this.l, this.m, this.n, this.o, this.p, this.q, this.r, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((S0)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class kotlinx.coroutines.flow.internal.m.c.b.a implements j {
                            final g a;
                            final Object b;
                            final F c;
                            final j d;
                            final p e;
                            final A f;

                            kotlinx.coroutines.flow.internal.m.c.b.a(g g0, Object object0, F f0, j j0, p p0, A a0) {
                                this.a = g0;
                                this.b = object0;
                                this.c = f0;
                                this.d = j0;
                                this.e = p0;
                                this.f = a0;
                                super();
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            @y4.m
                            public final Object emit(Object object0, @l d d0) {
                                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {0x7E, 0x81, 0x81}, m = "invokeSuspend", n = {}, s = {})
                                @s0({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n509#2,5:141\n14#3:146\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141,5\n129#1:146\n*E\n"})
                                static final class kotlinx.coroutines.flow.internal.m.c.b.a.a extends o implements A3.o {
                                    Object k;
                                    int l;
                                    final F m;
                                    final j n;
                                    final p o;
                                    final Object p;
                                    final A q;

                                    kotlinx.coroutines.flow.internal.m.c.b.a.a(F f0, j j0, p p0, Object object0, A a0, d d0) {
                                        this.m = f0;
                                        this.n = j0;
                                        this.o = p0;
                                        this.p = object0;
                                        this.q = a0;
                                        super(2, d0);
                                    }

                                    @y4.m
                                    public final Object a(@l S0 s00, @y4.m d d0) {
                                        return ((kotlinx.coroutines.flow.internal.m.c.b.a.a)this.create(s00, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@y4.m Object object0, @l d d0) {
                                        return new kotlinx.coroutines.flow.internal.m.c.b.a.a(this.m, this.n, this.o, this.p, this.q, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.a(((S0)object0), ((d)object1));
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @y4.m
                                    public final Object invokeSuspend(@l Object object0) {
                                        j j0;
                                        Object object2;
                                        Object object1 = b.l();
                                        switch(this.l) {
                                            case 0: {
                                                f0.n(object0);
                                                this.l = 1;
                                                object2 = this.m.z(this);
                                                if(object2 == object1) {
                                                    return object1;
                                                }
                                                goto label_12;
                                            }
                                            case 1: {
                                                f0.n(object0);
                                                object2 = ((kotlinx.coroutines.channels.p)object0).o();
                                            label_12:
                                                A a0 = this.q;
                                                if(object2 instanceof kotlinx.coroutines.channels.p.c) {
                                                    Throwable throwable0 = kotlinx.coroutines.channels.p.f(object2);
                                                    if(throwable0 == null) {
                                                        throwable0 = new kotlinx.coroutines.flow.internal.a(a0);
                                                    }
                                                    throw throwable0;
                                                }
                                                j0 = this.n;
                                                p p0 = this.o;
                                                Object object3 = this.p;
                                                if(object2 == u.a) {
                                                    object2 = null;
                                                }
                                                this.k = j0;
                                                this.l = 2;
                                                object0 = p0.invoke(object3, object2, this);
                                                if(object0 == object1) {
                                                    return object1;
                                                }
                                                this.k = null;
                                                this.l = 3;
                                                return j0.emit(object0, this) == object1 ? object1 : S0.a;
                                            }
                                            case 2: {
                                                break;
                                            }
                                            case 3: {
                                                f0.n(object0);
                                                return S0.a;
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                        j0 = (j)this.k;
                                        f0.n(object0);
                                        this.k = null;
                                        this.l = 3;
                                        return j0.emit(object0, this) == object1 ? object1 : S0.a;
                                    }
                                }


                                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {0x7D}, m = "emit", n = {}, s = {})
                                static final class kotlinx.coroutines.flow.internal.m.c.b.a.b extends kotlin.coroutines.jvm.internal.d {
                                    Object k;
                                    final kotlinx.coroutines.flow.internal.m.c.b.a l;
                                    int m;

                                    kotlinx.coroutines.flow.internal.m.c.b.a.b(kotlinx.coroutines.flow.internal.m.c.b.a m$c$b$a0, d d0) {
                                        this.l = m$c$b$a0;
                                        super(d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @y4.m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.m |= 0x80000000;
                                        return this.l.emit(null, this);
                                    }
                                }

                                kotlinx.coroutines.flow.internal.m.c.b.a.b m$c$b$a$b0;
                                if(d0 instanceof kotlinx.coroutines.flow.internal.m.c.b.a.b) {
                                    m$c$b$a$b0 = (kotlinx.coroutines.flow.internal.m.c.b.a.b)d0;
                                    int v = m$c$b$a$b0.m;
                                    if((v & 0x80000000) == 0) {
                                        m$c$b$a$b0 = new kotlinx.coroutines.flow.internal.m.c.b.a.b(this, d0);
                                    }
                                    else {
                                        m$c$b$a$b0.m = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    m$c$b$a$b0 = new kotlinx.coroutines.flow.internal.m.c.b.a.b(this, d0);
                                }
                                Object object1 = m$c$b$a$b0.k;
                                Object object2 = b.l();
                                switch(m$c$b$a$b0.m) {
                                    case 0: {
                                        f0.n(object1);
                                        kotlinx.coroutines.flow.internal.m.c.b.a.a m$c$b$a$a0 = new kotlinx.coroutines.flow.internal.m.c.b.a.a(this.c, this.d, this.e, object0, this.f, null);
                                        m$c$b$a$b0.m = 1;
                                        return kotlinx.coroutines.flow.internal.f.c(this.a, S0.a, this.b, m$c$b$a$a0, m$c$b$a$b0) == object2 ? object2 : S0.a;
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

                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                kotlinx.coroutines.flow.internal.m.c.b.a m$c$b$a0 = new kotlinx.coroutines.flow.internal.m.c.b.a(this.m, this.n, this.o, this.p, this.q, this.r);
                                this.k = 1;
                                return this.l.collect(m$c$b$a0, this) == object1 ? object1 : S0.a;
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


                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.internal.m.c.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final i m;

                    kotlinx.coroutines.flow.internal.m.c.c(i i0, d d0) {
                        this.m = i0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@y4.m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.internal.m.c.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((D)object0), ((d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l D d0, @y4.m d d1) {
                        return ((kotlinx.coroutines.flow.internal.m.c.c)this.create(d0, d1)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class kotlinx.coroutines.flow.internal.m.c.c.a implements j {
                            final D a;

                            kotlinx.coroutines.flow.internal.m.c.c.a(D d0) {
                                this.a = d0;
                                super();
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            @y4.m
                            public final Object emit(Object object0, @l d d0) {
                                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {87}, m = "emit", n = {}, s = {})
                                static final class kotlinx.coroutines.flow.internal.m.c.c.a.a extends kotlin.coroutines.jvm.internal.d {
                                    Object k;
                                    final kotlinx.coroutines.flow.internal.m.c.c.a l;
                                    int m;

                                    kotlinx.coroutines.flow.internal.m.c.c.a.a(kotlinx.coroutines.flow.internal.m.c.c.a m$c$c$a0, d d0) {
                                        this.l = m$c$c$a0;
                                        super(d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @y4.m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.k = object0;
                                        this.m |= 0x80000000;
                                        return this.l.emit(null, this);
                                    }
                                }

                                kotlinx.coroutines.flow.internal.m.c.c.a.a m$c$c$a$a0;
                                if(d0 instanceof kotlinx.coroutines.flow.internal.m.c.c.a.a) {
                                    m$c$c$a$a0 = (kotlinx.coroutines.flow.internal.m.c.c.a.a)d0;
                                    int v = m$c$c$a$a0.m;
                                    if((v & 0x80000000) == 0) {
                                        m$c$c$a$a0 = new kotlinx.coroutines.flow.internal.m.c.c.a.a(this, d0);
                                    }
                                    else {
                                        m$c$c$a$a0.m = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    m$c$c$a$a0 = new kotlinx.coroutines.flow.internal.m.c.c.a.a(this, d0);
                                }
                                Object object1 = m$c$c$a$a0.k;
                                Object object2 = b.l();
                                switch(m$c$c$a$a0.m) {
                                    case 0: {
                                        f0.n(object1);
                                        G g0 = this.a.b();
                                        if(object0 == null) {
                                            object0 = u.a;
                                        }
                                        m$c$c$a$a0.m = 1;
                                        return g0.I(object0, m$c$c$a$a0) == object2 ? object2 : S0.a;
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

                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                kotlinx.coroutines.flow.internal.m.c.c.a m$c$c$a0 = new kotlinx.coroutines.flow.internal.m.c.c.a(((D)this.l));
                                this.k = 1;
                                return this.m.collect(m$c$c$a0, this) == object1 ? object1 : S0.a;
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

                A a3;
                F f2;
                A a2;
                F f1;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.m;
                        F f0 = B.f(o0, null, 0, new kotlinx.coroutines.flow.internal.m.c.c(this.n, null), 3, null);
                        A a0 = O0.c(null, 1, null);
                        L.n(f0, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                        ((G)f0).h(new kotlinx.coroutines.flow.internal.m.c.a(a0));
                        try {
                            try {
                                g g0 = o0.getCoroutineContext();
                                Object object2 = kotlinx.coroutines.internal.b0.b(g0);
                                g g1 = o0.getCoroutineContext().plus(a0);
                                f1 = f0;
                                a2 = a0;
                                kotlinx.coroutines.flow.internal.m.c.b m$c$b0 = new kotlinx.coroutines.flow.internal.m.c.b(this.o, g0, object2, f0, this.p, this.q, a0, null);
                                this.m = f0;
                                this.k = a0;
                                this.l = 1;
                                a2 = a0;
                                f1 = f0;
                            }
                            catch(kotlinx.coroutines.flow.internal.a a1) {
                                f1 = f0;
                                f2 = f1;
                                a3 = a2;
                                goto label_41;
                            }
                            try {
                                if(kotlinx.coroutines.flow.internal.f.d(g1, S0.a, null, m$c$b0, this, 4, null) == object1) {
                                    return object1;
                                }
                                f2 = f1;
                                break;
                            }
                            catch(kotlinx.coroutines.flow.internal.a a1) {
                            }
                            f2 = f1;
                            a3 = a2;
                            goto label_41;
                        }
                        catch(Throwable throwable0) {
                            f2 = f1;
                            kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                            throw throwable0;
                        }
                    }
                    case 1: {
                        a3 = (A)this.k;
                        f2 = (F)this.m;
                        try {
                            try {
                                f0.n(object0);
                                break;
                            }
                            catch(kotlinx.coroutines.flow.internal.a a1) {
                            }
                        label_41:
                            q.b(a1, a3);
                            break;
                        }
                        catch(Throwable throwable0) {
                        }
                        kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.internal.m.b(i1, i0, p0);
    }
}

