package kotlinx.coroutines.flow;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.x;
import y4.l;
import y4.m;

@s0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
final class z {
    @l
    public static final I a(@l D d0) {
        return new F(d0, null);
    }

    @l
    public static final U b(@l E e0) {
        return new G(e0, null);
    }

    private static final N c(i i0, int v) {
        int v1 = s.u(v, 0x40) - v;
        if(i0 instanceof e) {
            i i1 = ((e)i0).j();
            if(i1 != null) {
                int v2 = ((e)i0).b;
                if(v2 != -3 && (v2 != -2 && v2 != 0)) {
                    return new N(i1, v2, ((e)i0).c, ((e)i0).a);
                }
                if(((e)i0).c == kotlinx.coroutines.channels.i.a) {
                    return v2 == 0 ? new N(i1, 0, ((e)i0).c, ((e)i0).a) : new N(i1, v1, ((e)i0).c, ((e)i0).a);
                }
                return v == 0 ? new N(i1, 1, ((e)i0).c, ((e)i0).a) : new N(i1, 0, ((e)i0).c, ((e)i0).a);
            }
        }
        return new N(i0, v1, kotlinx.coroutines.channels.i.a, kotlin.coroutines.i.a);
    }

    // 去混淆评级： 低(20)
    private static final I0 d(O o0, g g0, i i0, D d0, kotlinx.coroutines.flow.O o1, Object object0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 0xD6, 0xD7, 0xDD}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            final kotlinx.coroutines.flow.O l;
            final i m;
            final D n;
            final Object o;

            a(kotlinx.coroutines.flow.O o0, i i0, D d0, Object object0, d d1) {
                this.l = o0;
                this.m = i0;
                this.n = d0;
                this.o = object0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new a(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.z.a.a extends o implements A3.o {
                    int k;
                    int l;

                    kotlinx.coroutines.flow.z.a.a(d d0) {
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.z.a.a(d0);
                        d1.l = ((Number)object0).intValue();
                        return d1;
                    }

                    @m
                    public final Object invoke(int v, @m d d0) {
                        return ((kotlinx.coroutines.flow.z.a.a)this.create(v, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((Number)object0).intValue(), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        return this.l <= 0 ? b.a(false) : b.a(true);
                    }
                }


                @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {0xDF}, m = "invokeSuspend", n = {}, s = {})
                static final class kotlinx.coroutines.flow.z.a.b extends o implements A3.o {
                    public final class kotlinx.coroutines.flow.z.a.b.a {
                        public static final int[] a;

                        static {
                            int[] arr_v = new int[M.values().length];
                            try {
                                arr_v[M.a.ordinal()] = 1;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            try {
                                arr_v[M.b.ordinal()] = 2;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            try {
                                arr_v[M.c.ordinal()] = 3;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            kotlinx.coroutines.flow.z.a.b.a.a = arr_v;
                        }
                    }

                    int k;
                    Object l;
                    final i m;
                    final D n;
                    final Object o;

                    kotlinx.coroutines.flow.z.a.b(i i0, D d0, Object object0, d d1) {
                        this.m = i0;
                        this.n = d0;
                        this.o = object0;
                        super(2, d1);
                    }

                    @m
                    public final Object a(@l M m0, @m d d0) {
                        return ((kotlinx.coroutines.flow.z.a.b)this.create(m0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new kotlinx.coroutines.flow.z.a.b(this.m, this.n, this.o, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((M)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                switch(((M)this.l)) {
                                    case 1: {
                                        this.k = 1;
                                        return this.m.collect(this.n, this) == object1 ? object1 : S0.a;
                                    }
                                    case 3: {
                                        Object object2 = this.o;
                                        if(object2 == K.a) {
                                            this.n.b();
                                            return S0.a;
                                        }
                                        this.n.d(object2);
                                        return S0.a;
                                    }
                                    default: {
                                        return S0.a;
                                    }
                                }
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

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        kotlinx.coroutines.flow.O.a o$a0 = kotlinx.coroutines.flow.O.a;
                        if(this.l == o$a0.c()) {
                            this.k = 1;
                            if(this.m.collect(this.n, this) == object1) {
                                return object1;
                            }
                        }
                        else if(this.l == o$a0.d()) {
                            U u0 = this.n.e();
                            kotlinx.coroutines.flow.z.a.a z$a$a0 = new kotlinx.coroutines.flow.z.a.a(null);
                            this.k = 2;
                            if(k.u0(u0, z$a$a0, this) == object1) {
                                return object1;
                            }
                        label_19:
                            this.k = 3;
                            if(this.m.collect(this.n, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            U u1 = this.n.e();
                            i i0 = k.g0(this.l.a(u1));
                            kotlinx.coroutines.flow.z.a.b z$a$b0 = new kotlinx.coroutines.flow.z.a.b(this.m, this.n, this.o, null);
                            this.k = 4;
                            if(k.A(i0, z$a$b0, this) == object1) {
                                return object1;
                            }
                        }
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        goto label_19;
                    }
                    case 1: 
                    case 3: 
                    case 4: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }

        return L.g(o1, kotlinx.coroutines.flow.O.a.c()) ? kotlinx.coroutines.i.d(o0, g0, Q.a, new a(o1, i0, d0, object0, null)) : kotlinx.coroutines.i.d(o0, g0, Q.d, new a(o1, i0, d0, object0, null));
    }

    private static final void e(O o0, g g0, i i0, x x0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {0x150}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.z.b extends o implements A3.o {
            int k;
            private Object l;
            final i m;
            final x n;

            kotlinx.coroutines.flow.z.b(i i0, x x0, d d0) {
                this.m = i0;
                this.n = x0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.z.b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((kotlinx.coroutines.flow.z.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @s0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
                static final class kotlinx.coroutines.flow.z.b.a implements j {
                    final h a;
                    final O b;
                    final x c;

                    kotlinx.coroutines.flow.z.b.a(h l0$h0, O o0, x x0) {
                        this.a = l0$h0;
                        this.b = o0;
                        this.c = x0;
                        super();
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        S0 s00;
                        E e0 = (E)this.a.a;
                        if(e0 == null) {
                            s00 = null;
                        }
                        else {
                            e0.setValue(object0);
                            s00 = S0.a;
                        }
                        if(s00 == null) {
                            E e1 = W.a(object0);
                            G g0 = new G(e1, M0.B(this.b.getCoroutineContext()));
                            this.c.Q(g0);
                            this.a.a = e1;
                        }
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        try {
                            kotlinx.coroutines.flow.z.b.a z$b$a0 = new kotlinx.coroutines.flow.z.b.a(new h(), o0, this.n);
                            this.k = 1;
                            return this.m.collect(z$b$a0, this) == object1 ? object1 : S0.a;
                        label_10:
                            f0.n(object0);
                            return S0.a;
                        }
                        catch(Throwable throwable0) {
                            this.n.f(throwable0);
                            throw throwable0;
                        }
                    }
                    case 1: {
                        goto label_10;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        kotlinx.coroutines.k.f(o0, g0, null, new kotlinx.coroutines.flow.z.b(i0, x0, null), 2, null);
    }

    @l
    public static final I f(@l I i0, @l A3.o o0) {
        return new Z(i0, o0);
    }

    @l
    public static final I g(@l i i0, @l O o0, @l kotlinx.coroutines.flow.O o1, int v) {
        N n0 = z.c(i0, v);
        D d0 = K.a(v, n0.b, n0.c);
        return new F(d0, z.d(o0, n0.d, n0.a, d0, o1, K.a));
    }

    public static I h(i i0, O o0, kotlinx.coroutines.flow.O o1, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return k.F1(i0, o0, o1, v);
    }

    @m
    public static final Object i(@l i i0, @l O o0, @l d d0) {
        N n0 = z.c(i0, 1);
        x x0 = kotlinx.coroutines.z.c(null, 1, null);
        z.e(o0, n0.d, n0.a, x0);
        return x0.o(d0);
    }

    @l
    public static final U j(@l i i0, @l O o0, @l kotlinx.coroutines.flow.O o1, Object object0) {
        N n0 = z.c(i0, 1);
        E e0 = W.a(object0);
        return new G(e0, z.d(o0, n0.d, n0.a, e0, o1, object0));
    }
}

