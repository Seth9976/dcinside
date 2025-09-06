package io.realm.internal.coroutines;

import i3.a;
import io.realm.E;
import io.realm.F0;
import io.realm.G;
import io.realm.P0;
import io.realm.Q0;
import io.realm.T0;
import io.realm.X0;
import io.realm.d1;
import io.realm.e1;
import io.realm.g1;
import io.realm.q0;
import io.realm.v0;
import io.realm.w0;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.P;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class b implements a {
    private final boolean a;

    public b() {
        this(false, 1, null);
    }

    public b(boolean z) {
        this.a = z;
    }

    public b(boolean z, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    @Override  // i3.a
    @l
    public i a(@l E e0, @l T0 t00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$6", f = "InternalFlowFactory.kt", i = {}, l = {0x19F, 443}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.l extends o implements A3.o {
            int k;
            private Object l;
            final T0 m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.l(T0 t00, Q0 q00, b b0, d d0) {
                this.m = t00;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.l(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, T0 t00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.l)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.l.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.l.a e;

                    static {
                        io.realm.internal.coroutines.b.l.a.e = new io.realm.internal.coroutines.b.l.a();
                    }

                    io.realm.internal.coroutines.b.l.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.l.b extends N implements A3.a {
                    final E e;
                    final T0 f;
                    final P0 g;

                    io.realm.internal.coroutines.b.l.b(E e0, T0 t00, P0 p00) {
                        this.e = e0;
                        this.f = t00;
                        this.g = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.B(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.l.a.e, this) == object1 ? object1 : S0.a;
                        }
                        E e0 = E.p2(this.n);
                        io.realm.internal.coroutines.m m0 = (T0 t00) -> if(P.k(d0)) {
                            if(!t00.s()) {
                                kotlinx.coroutines.channels.G.a.a(d0, null, 1, null);
                                return;
                            }
                            if(this.o.a) {
                                T0 t01 = t00.p();
                                L.o(t01, "listenerResults.freeze()");
                                d0.l(t01);
                                return;
                            }
                            d0.l(t00);
                        };
                        this.m.j(m0);
                        if(this.o.a) {
                            T0 t00 = this.m.p();
                            L.o(t00, "realmList.freeze()");
                            d0.l(t00);
                        }
                        else {
                            d0.l(this.m);
                        }
                        io.realm.internal.coroutines.b.l.b b$l$b0 = new io.realm.internal.coroutines.b.l.b(e0, this.m, m0);
                        this.k = 2;
                        return B.a(d0, b$l$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(e0, "dynamicRealm");
        L.p(t00, "realmList");
        return e0.x0() ? k.L0(t00) : k.s(new io.realm.internal.coroutines.b.l(t00, e0.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i b(@l E e0, @l g1 g10) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$4", f = "InternalFlowFactory.kt", i = {}, l = {0xD8, 0xF2}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends o implements A3.o {
            int k;
            private Object l;
            final g1 m;
            final Q0 n;
            final b o;

            j(g1 g10, Q0 q00, b b0, d d0) {
                this.m = g10;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new j(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, g1 g10) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((j)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.j.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.j.a e;

                    static {
                        io.realm.internal.coroutines.b.j.a.e = new io.realm.internal.coroutines.b.j.a();
                    }

                    io.realm.internal.coroutines.b.j.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.j.b extends N implements A3.a {
                    final E e;
                    final g1 f;
                    final P0 g;

                    io.realm.internal.coroutines.b.j.b(E e0, g1 g10, P0 p00) {
                        this.e = e0;
                        this.f = g10;
                        this.g = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.F(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.j.a.e, this) == object1 ? object1 : S0.a;
                        }
                        E e0 = E.p2(this.n);
                        io.realm.internal.coroutines.k k0 = (g1 g10) -> if(P.k(d0)) {
                            if(this.o.a) {
                                g1 g11 = g10.A();
                                L.o(g11, "listenerResults.freeze()");
                                d0.l(g11);
                                return;
                            }
                            d0.l(g10);
                        };
                        this.m.l(k0);
                        if(this.o.a) {
                            g1 g10 = this.m.A();
                            L.o(g10, "results.freeze()");
                            d0.l(g10);
                        }
                        else {
                            d0.l(this.m);
                        }
                        io.realm.internal.coroutines.b.j.b b$j$b0 = new io.realm.internal.coroutines.b.j.b(e0, this.m, k0);
                        this.k = 2;
                        return B.a(d0, b$j$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(e0, "dynamicRealm");
        L.p(g10, "results");
        return e0.x0() ? k.L0(g10) : k.s(new j(g10, e0.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i c(@l E e0, @l G g0) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$8", f = "InternalFlowFactory.kt", i = {}, l = {622, 650}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends o implements A3.o {
            int k;
            private Object l;
            final E m;
            final Q0 n;
            final G o;
            final b p;

            n(E e0, Q0 q00, G g0, b b0, d d0) {
                this.m = e0;
                this.n = q00;
                this.o = g0;
                this.p = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new n(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, G g0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((n)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.n.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.n.a e;

                    static {
                        io.realm.internal.coroutines.b.n.a.e = new io.realm.internal.coroutines.b.n.a();
                    }

                    io.realm.internal.coroutines.b.n.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.n.b extends N implements A3.a {
                    final E e;
                    final G f;
                    final P0 g;

                    io.realm.internal.coroutines.b.n.b(E e0, G g0, P0 p00) {
                        this.e = e0;
                        this.f = g0;
                        this.g = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.M5(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(this.m.isClosed()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.n.a.e, this) == object1 ? object1 : S0.a;
                        }
                        E e0 = E.p2(this.n);
                        io.realm.internal.coroutines.o o0 = (G g0) -> if(P.k(d0)) {
                            if(this.p.a) {
                                X0 x00 = g0.B5();
                                L.o(x00, "listenerObj.freeze()");
                                d0.l(x00);
                                return;
                            }
                            d0.l(g0);
                        };
                        this.o.r5(o0);
                        if(d1.G5(this.o)) {
                            if(this.p.a) {
                                X0 x00 = d1.C5(this.o);
                                L.o(x00, "freeze(dynamicRealmObject)");
                                d0.l(x00);
                            }
                            else {
                                d0.l(this.o);
                            }
                        }
                        io.realm.internal.coroutines.b.n.b b$n$b0 = new io.realm.internal.coroutines.b.n.b(e0, this.o, o0);
                        this.k = 2;
                        return B.a(d0, b$n$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(e0, "dynamicRealm");
        L.p(g0, "dynamicRealmObject");
        return e0.x0() ? k.L0(g0) : k.s(new n(e0, e0.T(), g0, this, null));
    }

    @Override  // i3.a
    @l
    public i d(@l F0 f00, @l T0 t00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$5", f = "InternalFlowFactory.kt", i = {}, l = {314, 342}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.k extends o implements A3.o {
            int k;
            private Object l;
            final T0 m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.k(T0 t00, Q0 q00, b b0, d d0) {
                this.m = t00;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.k(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, T0 t00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.k)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.k.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.k.a e;

                    static {
                        io.realm.internal.coroutines.b.k.a.e = new io.realm.internal.coroutines.b.k.a();
                    }

                    io.realm.internal.coroutines.b.k.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.k.b extends N implements A3.a {
                    final F0 e;
                    final T0 f;
                    final P0 g;

                    io.realm.internal.coroutines.b.k.b(F0 f00, T0 t00, P0 p00) {
                        this.e = f00;
                        this.f = t00;
                        this.g = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.B(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.k.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.l l0 = (T0 t00) -> if(P.k(d0)) {
                            if(!t00.s()) {
                                kotlinx.coroutines.channels.G.a.a(d0, null, 1, null);
                                return;
                            }
                            if(this.o.a) {
                                T0 t01 = t00.p();
                                L.o(t01, "listenerResults.freeze()");
                                d0.l(t01);
                                return;
                            }
                            d0.l(t00);
                        };
                        this.m.j(l0);
                        if(this.o.a) {
                            T0 t00 = this.m.p();
                            L.o(t00, "realmList.freeze()");
                            d0.l(t00);
                        }
                        else {
                            d0.l(this.m);
                        }
                        io.realm.internal.coroutines.b.k.b b$k$b0 = new io.realm.internal.coroutines.b.k.b(f00, this.m, l0);
                        this.k = 2;
                        return B.a(d0, b$k$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(f00, "realm");
        L.p(t00, "realmList");
        return f00.x0() ? k.L0(t00) : k.s(new io.realm.internal.coroutines.b.k(t00, f00.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i e(@l E e0) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$2", f = "InternalFlowFactory.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends o implements A3.o {
            int k;
            private Object l;
            final E m;
            final b n;

            h(E e0, b b0, d d0) {
                this.m = e0;
                this.n = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new h(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, E e0, E e1) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((h)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.h.a extends N implements A3.a {
                    final E e;
                    final P0 f;

                    io.realm.internal.coroutines.b.h.a(E e0, P0 p00) {
                        this.e = e0;
                        this.f = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.C2(this.f);
                        this.e.close();
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        E e0 = E.p2(this.m.T());
                        io.realm.internal.coroutines.i i0 = (E e1) -> if(P.k(d0)) {
                            if(this.n.a) {
                                E e2 = this.m.o2();
                                L.o(e2, "dynamicRealm.freeze()");
                                d0.l(e2);
                                return;
                            }
                            d0.l(e1);
                        };
                        e0.j1(i0);
                        if(this.n.a) {
                            E e1 = e0.o2();
                            L.o(e1, "flowRealm.freeze()");
                            d0.l(e1);
                        }
                        else {
                            L.o(e0, "flowRealm");
                            d0.l(e0);
                        }
                        io.realm.internal.coroutines.b.h.a b$h$a0 = new io.realm.internal.coroutines.b.h.a(e0, i0);
                        this.k = 1;
                        return B.a(d0, b$h$a0, this) == object1 ? object1 : S0.a;
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

        L.p(e0, "dynamicRealm");
        return e0.x0() ? k.L0(e0) : k.s(new h(e0, this, null));
    }

    @Override  // i3.a
    @l
    public i f(@l F0 f00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$1", f = "InternalFlowFactory.kt", i = {}, l = {0x40}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements A3.o {
            int k;
            private Object l;
            final F0 m;
            final b n;

            g(F0 f00, b b0, d d0) {
                this.m = f00;
                this.n = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new g(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, F0 f00, F0 f01) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((g)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.g.a extends N implements A3.a {
                    final F0 e;
                    final P0 f;

                    io.realm.internal.coroutines.b.g.a(F0 f00, P0 p00) {
                        this.e = f00;
                        this.f = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.z4(this.f);
                        this.e.close();
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        F0 f00 = F0.k4(this.m.T());
                        io.realm.internal.coroutines.h h0 = (F0 f01) -> if(P.k(d0)) {
                            if(this.n.a) {
                                F0 f02 = this.m.d4();
                                L.o(f02, "realm.freeze()");
                                d0.l(f02);
                                return;
                            }
                            d0.l(f01);
                        };
                        f00.l1(h0);
                        if(this.n.a) {
                            F0 f01 = f00.d4();
                            L.o(f01, "flowRealm.freeze()");
                            d0.l(f01);
                        }
                        else {
                            L.o(f00, "flowRealm");
                            d0.l(f00);
                        }
                        io.realm.internal.coroutines.b.g.a b$g$a0 = new io.realm.internal.coroutines.b.g.a(f00, h0);
                        this.k = 1;
                        return B.a(d0, b$g$a0, this) == object1 ? object1 : S0.a;
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

        L.p(f00, "realm");
        return f00.x0() ? k.L0(f00) : k.s(new g(f00, this, null));
    }

    @Override  // i3.a
    @l
    public i g(@l F0 f00, @l g1 g10) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$3", f = "InternalFlowFactory.kt", i = {}, l = {0x74, 0x8E}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.i extends o implements A3.o {
            int k;
            private Object l;
            final g1 m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.i(g1 g10, Q0 q00, b b0, d d0) {
                this.m = g10;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.i(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, g1 g10) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.i)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.i.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.i.a e;

                    static {
                        io.realm.internal.coroutines.b.i.a.e = new io.realm.internal.coroutines.b.i.a();
                    }

                    io.realm.internal.coroutines.b.i.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.i.b extends N implements A3.a {
                    final F0 e;
                    final g1 f;
                    final P0 g;

                    io.realm.internal.coroutines.b.i.b(F0 f00, g1 g10, P0 p00) {
                        this.e = f00;
                        this.f = g10;
                        this.g = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.F(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.i.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.j j0 = (g1 g10) -> if(P.k(d0)) {
                            if(this.o.a) {
                                g1 g11 = g10.A();
                                L.o(g11, "listenerResults.freeze()");
                                d0.l(g11);
                                return;
                            }
                            d0.l(g10);
                        };
                        this.m.l(j0);
                        if(this.o.a) {
                            g1 g10 = this.m.A();
                            L.o(g10, "results.freeze()");
                            d0.l(g10);
                        }
                        else {
                            d0.l(this.m);
                        }
                        io.realm.internal.coroutines.b.i.b b$i$b0 = new io.realm.internal.coroutines.b.i.b(f00, this.m, j0);
                        this.k = 2;
                        return B.a(d0, b$i$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(f00, "realm");
        L.p(g10, "results");
        return f00.x0() ? k.L0(g10) : k.s(new io.realm.internal.coroutines.b.i(g10, f00.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i h(@l F0 f00, @l X0 x00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$from$7", f = "InternalFlowFactory.kt", i = {}, l = {0x205, 545}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.m extends o implements A3.o {
            int k;
            private Object l;
            final F0 m;
            final Q0 n;
            final X0 o;
            final b p;

            io.realm.internal.coroutines.b.m(F0 f00, Q0 q00, X0 x00, b b0, d d0) {
                this.m = f00;
                this.n = q00;
                this.o = x00;
                this.p = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.m(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, X0 x00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.m)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.m.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.m.a e;

                    static {
                        io.realm.internal.coroutines.b.m.a.e = new io.realm.internal.coroutines.b.m.a();
                    }

                    io.realm.internal.coroutines.b.m.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.m.b extends N implements A3.a {
                    final F0 e;
                    final X0 f;
                    final P0 g;

                    io.realm.internal.coroutines.b.m.b(F0 f00, X0 x00, P0 p00) {
                        this.e = f00;
                        this.f = x00;
                        this.g = p00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            d1.N5(this.f, this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(this.m.isClosed()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.m.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.n n0 = (X0 x00) -> if(P.k(d0)) {
                            if(this.p.a) {
                                X0 x01 = d1.C5(x00);
                                if(x01 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0");
                                }
                                d0.l(x01);
                                return;
                            }
                            d0.l(x00);
                        };
                        d1.s5(this.o, n0);
                        if(d1.G5(this.o)) {
                            if(this.p.a) {
                                X0 x00 = d1.C5(this.o);
                                L.o(x00, "freeze(realmObject)");
                                d0.l(x00);
                            }
                            else {
                                d0.l(this.o);
                            }
                        }
                        io.realm.internal.coroutines.b.m.b b$m$b0 = new io.realm.internal.coroutines.b.m.b(f00, this.o, n0);
                        this.k = 2;
                        return B.a(d0, b$m$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(f00, "realm");
        L.p(x00, "realmObject");
        return f00.x0() ? k.L0(x00) : k.s(new io.realm.internal.coroutines.b.m(f00, f00.T(), x00, this, null));
    }

    @Override  // i3.a
    @l
    public i i(@l F0 f00, @l T0 t00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$3", f = "InternalFlowFactory.kt", i = {}, l = {366, 394}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.o {
            int k;
            private Object l;
            final T0 m;
            final Q0 n;
            final b o;

            c(T0 t00, Q0 q00, b b0, d d0) {
                this.m = t00;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new c(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, T0 t00, v0 v00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((c)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.c.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.c.a e;

                    static {
                        io.realm.internal.coroutines.b.c.a.e = new io.realm.internal.coroutines.b.c.a();
                    }

                    io.realm.internal.coroutines.b.c.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.c.b extends N implements A3.a {
                    final F0 e;
                    final T0 f;
                    final w0 g;

                    io.realm.internal.coroutines.b.c.b(F0 f00, T0 t00, w0 w00) {
                        this.e = f00;
                        this.f = t00;
                        this.g = w00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.A(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.c.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.d d1 = (T0 t00, v0 v00) -> if(P.k(d0)) {
                            if(!t00.s()) {
                                kotlinx.coroutines.channels.G.a.a(d0, null, 1, null);
                                return;
                            }
                            if(this.o.a) {
                                d0.l(new io.realm.rx.a(t00.p(), v00));
                                return;
                            }
                            d0.l(new io.realm.rx.a(t00, v00));
                        };
                        this.m.i(d1);
                        if(this.o.a) {
                            d0.l(new io.realm.rx.a(this.m.p(), null));
                        }
                        else {
                            d0.l(new io.realm.rx.a(this.m, null));
                        }
                        io.realm.internal.coroutines.b.c.b b$c$b0 = new io.realm.internal.coroutines.b.c.b(f00, this.m, d1);
                        this.k = 2;
                        return B.a(d0, b$c$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(f00, "realm");
        L.p(t00, "list");
        return f00.x0() ? k.L0(new io.realm.rx.a(t00, null)) : k.s(new c(t00, f00.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i j(@l F0 f00, @l X0 x00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5", f = "InternalFlowFactory.kt", i = {}, l = {569, 597}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements A3.o {
            int k;
            private Object l;
            final F0 m;
            final Q0 n;
            final X0 o;
            final b p;

            e(F0 f00, Q0 q00, X0 x00, b b0, d d0) {
                this.m = f00;
                this.n = q00;
                this.o = x00;
                this.p = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new e(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, X0 x00, q0 q00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((e)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.e.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.e.a e;

                    static {
                        io.realm.internal.coroutines.b.e.a.e = new io.realm.internal.coroutines.b.e.a();
                    }

                    io.realm.internal.coroutines.b.e.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.e.b extends N implements A3.a {
                    final F0 e;
                    final X0 f;
                    final e1 g;

                    io.realm.internal.coroutines.b.e.b(F0 f00, X0 x00, e1 e10) {
                        this.e = f00;
                        this.f = x00;
                        this.g = e10;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            d1.O5(this.f, this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(this.m.isClosed()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.e.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.f f0 = (X0 x00, q0 q00) -> if(P.k(d0)) {
                            if(this.p.a) {
                                d0.l(new io.realm.rx.b(d1.C5(x00), q00));
                                return;
                            }
                            d0.l(new io.realm.rx.b(x00, q00));
                        };
                        d1.t5(this.o, f0);
                        if(d1.G5(this.o)) {
                            if(this.p.a) {
                                d0.l(new io.realm.rx.b(d1.C5(this.o), null));
                            }
                            else {
                                d0.l(new io.realm.rx.b(this.o, null));
                            }
                        }
                        io.realm.internal.coroutines.b.e.b b$e$b0 = new io.realm.internal.coroutines.b.e.b(f00, this.o, f0);
                        this.k = 2;
                        return B.a(d0, b$e$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(f00, "realm");
        L.p(x00, "realmObject");
        return f00.x0() ? k.L0(new io.realm.rx.b(x00, null)) : k.s(new e(f00, f00.T(), x00, this, null));
    }

    @Override  // i3.a
    @l
    public i k(@l F0 f00, @l g1 g10) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1", f = "InternalFlowFactory.kt", i = {}, l = {0xA6, 0xC0}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.a extends o implements A3.o {
            int k;
            private Object l;
            final g1 m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.a(g1 g10, Q0 q00, b b0, d d0) {
                this.m = g10;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.a(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, g1 g10, v0 v00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.a)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.a.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.a.a e;

                    static {
                        io.realm.internal.coroutines.b.a.a.e = new io.realm.internal.coroutines.b.a.a();
                    }

                    io.realm.internal.coroutines.b.a.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.a.b extends N implements A3.a {
                    final F0 e;
                    final g1 f;
                    final w0 g;

                    io.realm.internal.coroutines.b.a.b(F0 f00, g1 g10, w0 w00) {
                        this.e = f00;
                        this.f = g10;
                        this.g = w00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.E(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.a.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.a a0 = (g1 g10, v0 v00) -> if(P.k(d0)) {
                            if(this.o.a) {
                                d0.l(new io.realm.rx.a(g10.A(), v00));
                                return;
                            }
                            d0.l(new io.realm.rx.a(g10, v00));
                        };
                        this.m.k(a0);
                        if(this.o.a) {
                            d0.l(new io.realm.rx.a(this.m.A(), null));
                        }
                        else {
                            d0.l(new io.realm.rx.a(this.m, null));
                        }
                        io.realm.internal.coroutines.b.a.b b$a$b0 = new io.realm.internal.coroutines.b.a.b(f00, this.m, a0);
                        this.k = 2;
                        return B.a(d0, b$a$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(f00, "realm");
        L.p(g10, "results");
        return f00.x0() ? k.L0(new io.realm.rx.a(g10, null)) : k.s(new io.realm.internal.coroutines.b.a(g10, f00.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i l(@l E e0, @l G g0) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6", f = "InternalFlowFactory.kt", i = {}, l = {674, 702}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.f extends o implements A3.o {
            int k;
            private Object l;
            final G m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.f(G g0, Q0 q00, b b0, d d0) {
                this.m = g0;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.f(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, G g0, q0 q00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.f)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.f.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.f.a e;

                    static {
                        io.realm.internal.coroutines.b.f.a.e = new io.realm.internal.coroutines.b.f.a();
                    }

                    io.realm.internal.coroutines.b.f.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.f.b extends N implements A3.a {
                    final F0 e;
                    final G f;
                    final e1 g;

                    io.realm.internal.coroutines.b.f.b(F0 f00, G g0, e1 e10) {
                        this.e = f00;
                        this.f = g0;
                        this.g = e10;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            d1.O5(this.f, this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!d1.I5(this.m)) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.f.a.e, this) == object1 ? object1 : S0.a;
                        }
                        F0 f00 = F0.k4(this.n);
                        io.realm.internal.coroutines.g g0 = (G g0, q0 q00) -> if(P.k(d0)) {
                            if(this.o.a) {
                                d0.l(new io.realm.rx.b(d1.C5(g0), q00));
                                return;
                            }
                            d0.l(new io.realm.rx.b(g0, q00));
                        };
                        d1.t5(this.m, g0);
                        if(d1.G5(this.m)) {
                            if(this.o.a) {
                                d0.l(new io.realm.rx.b(d1.C5(this.m), null));
                            }
                            else {
                                d0.l(new io.realm.rx.b(this.m, null));
                            }
                        }
                        io.realm.internal.coroutines.b.f.b b$f$b0 = new io.realm.internal.coroutines.b.f.b(f00, this.m, g0);
                        this.k = 2;
                        return B.a(d0, b$f$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(e0, "dynamicRealm");
        L.p(g0, "dynamicRealmObject");
        return e0.x0() ? k.L0(new io.realm.rx.b(g0, null)) : k.s(new io.realm.internal.coroutines.b.f(g0, e0.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i m(@l E e0, @l g1 g10) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$2", f = "InternalFlowFactory.kt", i = {}, l = {0x10A, 292}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.b extends o implements A3.o {
            int k;
            private Object l;
            final g1 m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.b(g1 g10, Q0 q00, b b0, d d0) {
                this.m = g10;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.b(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, g1 g10, v0 v00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.b)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.b.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.b.a e;

                    static {
                        io.realm.internal.coroutines.b.b.a.e = new io.realm.internal.coroutines.b.b.a();
                    }

                    io.realm.internal.coroutines.b.b.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.b.b extends N implements A3.a {
                    final E e;
                    final g1 f;
                    final w0 g;

                    io.realm.internal.coroutines.b.b.b(E e0, g1 g10, w0 w00) {
                        this.e = e0;
                        this.f = g10;
                        this.g = w00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.E(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.b.a.e, this) == object1 ? object1 : S0.a;
                        }
                        E e0 = E.p2(this.n);
                        io.realm.internal.coroutines.c c0 = (g1 g10, v0 v00) -> if(P.k(d0)) {
                            if(this.o.a) {
                                d0.l(new io.realm.rx.a(g10.A(), v00));
                                return;
                            }
                            d0.l(new io.realm.rx.a(g10, v00));
                        };
                        this.m.k(c0);
                        if(this.o.a) {
                            d0.l(new io.realm.rx.a(this.m.A(), null));
                        }
                        else {
                            d0.l(new io.realm.rx.a(this.m, null));
                        }
                        io.realm.internal.coroutines.b.b.b b$b$b0 = new io.realm.internal.coroutines.b.b.b(e0, this.m, c0);
                        this.k = 2;
                        return B.a(d0, b$b$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(e0, "dynamicRealm");
        L.p(g10, "results");
        return e0.x0() ? k.L0(new io.realm.rx.a(g10, null)) : k.s(new io.realm.internal.coroutines.b.b(g10, e0.T(), this, null));
    }

    @Override  // i3.a
    @l
    public i n(@l E e0, @l T0 t00) {
        @f(c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4", f = "InternalFlowFactory.kt", i = {}, l = {467, 0x1EF}, m = "invokeSuspend", n = {}, s = {})
        static final class io.realm.internal.coroutines.b.d extends o implements A3.o {
            int k;
            private Object l;
            final T0 m;
            final Q0 n;
            final b o;

            io.realm.internal.coroutines.b.d(T0 t00, Q0 q00, b b0, d d0) {
                this.m = t00;
                this.n = q00;
                this.o = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new io.realm.internal.coroutines.b.d(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(D d0, b b0, T0 t00, v0 v00) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((io.realm.internal.coroutines.b.d)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class io.realm.internal.coroutines.b.d.a extends N implements A3.a {
                    public static final io.realm.internal.coroutines.b.d.a e;

                    static {
                        io.realm.internal.coroutines.b.d.a.e = new io.realm.internal.coroutines.b.d.a();
                    }

                    io.realm.internal.coroutines.b.d.a() {
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return S0.a;
                    }

                    public final void invoke() {
                    }
                }


                static final class io.realm.internal.coroutines.b.d.b extends N implements A3.a {
                    final E e;
                    final T0 f;
                    final w0 g;

                    io.realm.internal.coroutines.b.d.b(E e0, T0 t00, w0 w00) {
                        this.e = e0;
                        this.f = t00;
                        this.g = w00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        if(!this.e.isClosed()) {
                            this.f.A(this.g);
                            this.e.close();
                        }
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        if(!this.m.s()) {
                            this.k = 1;
                            return B.a(d0, io.realm.internal.coroutines.b.d.a.e, this) == object1 ? object1 : S0.a;
                        }
                        E e0 = E.p2(this.n);
                        io.realm.internal.coroutines.e e1 = (T0 t00, v0 v00) -> if(P.k(d0)) {
                            if(!t00.s()) {
                                kotlinx.coroutines.channels.G.a.a(d0, null, 1, null);
                                return;
                            }
                            if(this.o.a) {
                                d0.l(new io.realm.rx.a(t00.p(), v00));
                                return;
                            }
                            d0.l(new io.realm.rx.a(t00, v00));
                        };
                        this.m.i(e1);
                        if(this.o.a) {
                            d0.l(new io.realm.rx.a(this.m.p(), null));
                        }
                        else {
                            d0.l(new io.realm.rx.a(this.m, null));
                        }
                        io.realm.internal.coroutines.b.d.b b$d$b0 = new io.realm.internal.coroutines.b.d.b(e0, this.m, e1);
                        this.k = 2;
                        return B.a(d0, b$d$b0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(e0, "dynamicRealm");
        L.p(t00, "list");
        return e0.x0() ? k.L0(new io.realm.rx.a(t00, null)) : k.s(new io.realm.internal.coroutines.b.d(t00, e0.T(), this, null));
    }
}

