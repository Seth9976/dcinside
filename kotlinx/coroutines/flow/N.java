package kotlinx.coroutines.flow;

import A3.o;
import A3.p;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import y4.l;

final class n {
    @k(level = m.c, message = "Backwards compatibility with JS and K/N")
    public static final Object a(i i0, o o0, d d0) {
        @s0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n*L\n1#1,114:1\n*E\n"})
        public static final class a implements j {
            final o a;

            public a(o o0) {
                this.a = o0;
                super();
            }

            @y4.m
            public Object a(Object object0, @l d d0) {
                new kotlinx.coroutines.flow.n.a.a(this, d0);
                this.a.invoke(object0, d0);
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            @y4.m
            public Object emit(Object object0, @l d d0) {
                @s0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1\n*L\n1#1,114:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.n.a.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final a l;
                    int m;

                    public kotlinx.coroutines.flow.n.a.a(a n$a0, d d0) {
                        this.l = n$a0;
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

                Object object1 = this.a.invoke(object0, d0);
                return object1 == b.l() ? object1 : S0.a;
            }
        }

        Object object0 = i0.collect(new a(o0), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @y4.m
    public static final Object b(@l i i0, @l d d0) {
        Object object0 = i0.collect((Object object0, d d0) -> S0.a, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @k(level = m.c, message = "Backwards compatibility with JS and K/N")
    private static final Object c(i i0, o o0, d d0) {
        i0.collect(new a(o0), d0);
        return S0.a;
    }

    @y4.m
    public static final Object d(@l i i0, @l p p0, @l d d0) {
        @s0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,114:1\n29#2,4:115\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
        public static final class kotlinx.coroutines.flow.n.b implements j {
            private int a;
            final p b;

            public kotlinx.coroutines.flow.n.b(p p0) {
                this.b = p0;
                super();
            }

            @y4.m
            public Object a(Object object0, @l d d0) {
                new kotlinx.coroutines.flow.n.b.a(this, d0);
                p p0 = this.b;
                int v = this.a;
                this.a = v + 1;
                if(v < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                p0.invoke(v, object0, d0);
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            @y4.m
            public Object emit(Object object0, @l d d0) {
                @s0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2$emit$1\n*L\n1#1,114:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.n.b.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final kotlinx.coroutines.flow.n.b l;
                    int m;

                    public kotlinx.coroutines.flow.n.b.a(kotlinx.coroutines.flow.n.b n$b0, d d0) {
                        this.l = n$b0;
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

                p p0 = this.b;
                int v = this.a;
                this.a = v + 1;
                if(v < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                Object object1 = p0.invoke(kotlin.coroutines.jvm.internal.b.f(v), object0, d0);
                return object1 == b.l() ? object1 : S0.a;
            }
        }

        Object object0 = i0.collect(new kotlinx.coroutines.flow.n.b(p0), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final Object e(i i0, p p0, d d0) {
        i0.collect(new kotlinx.coroutines.flow.n.b(p0), d0);
        return S0.a;
    }

    @y4.m
    public static final Object f(@l i i0, @l o o0, @l d d0) {
        Object object0 = kotlinx.coroutines.flow.k.y(kotlinx.coroutines.flow.p.d(kotlinx.coroutines.flow.k.W0(i0, o0), 0, null, 2, null), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @y4.m
    public static final Object g(@l j j0, @l i i0, @l d d0) {
        kotlinx.coroutines.flow.k.o0(j0);
        Object object0 = i0.collect(j0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @l
    public static final I0 h(@l i i0, @l O o0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            final i l;

            c(i i0, d d0) {
                this.l = i0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new c(this.l, d0);
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
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return kotlinx.coroutines.flow.k.y(this.l, this) == object1 ? object1 : S0.a;
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

        return kotlinx.coroutines.k.f(o0, null, null, new c(i0, null), 3, null);
    }
}

