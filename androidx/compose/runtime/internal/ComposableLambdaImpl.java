package androidx.compose.runtime.internal;

import A3.b;
import A3.c;
import A3.e;
import A3.f;
import A3.g;
import A3.h;
import A3.i;
import A3.j;
import A3.k;
import A3.o;
import A3.p;
import A3.q;
import A3.r;
import A3.s;
import A3.t;
import A3.u;
import A3.v;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

@Stable
public final class ComposableLambdaImpl implements ComposableLambda {
    private final int a;
    private final boolean b;
    @m
    private Object c;
    @m
    private RecomposeScope d;
    @m
    private List e;

    public ComposableLambdaImpl(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // A3.h
    public Object A0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        return this.o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, ((Composer)object13), ((Number)object14).intValue(), ((Number)object15).intValue());
    }

    @Override  // A3.v
    public Object C1(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return this.i(object0, object1, object2, object3, object4, object5, object6, ((Composer)object7), ((Number)object8).intValue());
    }

    @Override  // A3.b
    public Object G1(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return this.j(object0, object1, object2, object3, object4, object5, object6, object7, ((Composer)object8), ((Number)object9).intValue());
    }

    @Override  // A3.r
    public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return this.e(object0, object1, object2, ((Composer)object3), ((Number)object4).intValue());
    }

    @Override  // A3.m
    public Object L0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        return this.t(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, ((Composer)object18), ((Number)object19).intValue(), ((Number)object20).intValue());
    }

    @Override  // A3.q
    public Object T0(Object object0, Object object1, Object object2, Object object3) {
        return this.d(object0, object1, ((Composer)object2), ((Number)object3).intValue());
    }

    @Override  // A3.u
    public Object U0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.h(object0, object1, object2, object3, object4, object5, ((Composer)object6), ((Number)object7).intValue());
    }

    @Override  // A3.f
    public Object X0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        return this.m(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, ((Composer)object11), ((Number)object12).intValue(), ((Number)object13).intValue());
    }

    @Override  // A3.i
    public Object Y0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        return this.p(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, ((Composer)object14), ((Number)object15).intValue(), ((Number)object16).intValue());
    }

    public final int a() {
        return this.a;
    }

    @m
    public Object b(@l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(0) : ComposableLambdaKt.f(0);
        Object object0 = this.c;
        L.n(object0, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object1 = ((o)v0.q(object0, 2)).invoke(composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            L.n(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            scopeUpdateScope0.a(((o)v0.q(this, 2)));
        }
        return object1;
    }

    @m
    public Object c(@m Object object0, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(1) : ComposableLambdaKt.f(1);
        Object object1 = this.c;
        L.n(object1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object2 = ((p)v0.q(object1, 3)).invoke(object0, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final int g;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.c(this.f, composer0, this.g | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object2;
    }

    @m
    public Object d(@m Object object0, @m Object object1, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(2) : ComposableLambdaKt.f(2);
        Object object2 = this.c;
        L.n(object2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object3 = ((q)v0.q(object2, 4)).T0(object0, object1, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final int h;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.d(this.f, this.g, composer0, this.h | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object3;
    }

    @Override  // A3.t
    public Object d1(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return this.g(object0, object1, object2, object3, object4, ((Composer)object5), ((Number)object6).intValue());
    }

    @m
    public Object e(@m Object object0, @m Object object1, @m Object object2, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(3) : ComposableLambdaKt.f(3);
        Object object3 = this.c;
        L.n(object3, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object4 = ((r)v0.q(object3, 5)).K0(object0, object1, object2, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final int i;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.e(this.f, this.g, this.h, composer0, this.i | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object4;
    }

    @Override  // A3.c
    public Object e0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return this.k(object0, object1, object2, object3, object4, object5, object6, object7, object8, ((Composer)object9), ((Number)object10).intValue());
    }

    @m
    public Object f(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(4) : ComposableLambdaKt.f(4);
        Object object4 = this.c;
        L.n(object4, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object5 = ((s)v0.q(object4, 6)).invoke(object0, object1, object2, object3, composer1, ((int)(v1 | v)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final int j;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.f(this.f, this.g, this.h, this.i, composer0, this.j | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object5;
    }

    @m
    public Object g(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(5) : ComposableLambdaKt.f(5);
        Object object5 = this.c;
        L.n(object5, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object6 = ((t)v0.q(object5, 7)).d1(object0, object1, object2, object3, object4, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final int k;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.g(this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object6;
    }

    @m
    public Object h(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(6) : ComposableLambdaKt.f(6);
        Object object6 = this.c;
        L.n(object6, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object7 = ((u)v0.q(object6, 8)).U0(object0, object1, object2, object3, object4, object5, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final int l;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.h(this.f, this.g, this.h, this.i, this.j, this.k, composer0, this.l | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object7;
    }

    @m
    public Object i(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(7) : ComposableLambdaKt.f(7);
        Object object7 = this.c;
        L.n(object7, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object8 = ((v)v0.q(object7, 9)).C1(object0, object1, object2, object3, object4, object5, object6, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final int m;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.i(this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer0, this.m | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object8;
    }

    @Override  // A3.g
    public Object i1(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        return this.n(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, ((Composer)object12), ((Number)object13).intValue(), ((Number)object14).intValue());
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.b(((Composer)object0), ((Number)object1).intValue());
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.c(object0, ((Composer)object1), ((Number)object2).intValue());
    }

    @Override  // A3.s
    public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        return this.f(object0, object1, object2, object3, ((Composer)object4), ((Number)object5).intValue());
    }

    @m
    public Object j(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(8) : ComposableLambdaKt.f(8);
        Object object8 = this.c;
        L.n(object8, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object9 = ((b)v0.q(object8, 10)).G1(object0, object1, object2, object3, object4, object5, object6, object7, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final int n;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.j(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer0, this.n | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object9;
    }

    @Override  // A3.l
    public Object j0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        return this.s(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, ((Composer)object17), ((Number)object18).intValue(), ((Number)object19).intValue());
    }

    @m
    public Object k(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @l Composer composer0, int v) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v1 = composer1.t(this) ? ComposableLambdaKt.d(9) : ComposableLambdaKt.f(9);
        Object object9 = this.c;
        L.n(object9, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>");
        Object object10 = ((c)v0.q(object9, 11)).e0(object0, object1, object2, object3, object4, object5, object6, object7, object8, composer1, ((int)(v | v1)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final int o;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.k(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer0, this.o | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object10;
    }

    @m
    public Object l(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(10) : ComposableLambdaKt.f(10);
        Object object10 = this.c;
        L.n(object10, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object11 = ((e)v0.q(object10, 13)).m0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, v) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final int p;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = v;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.l(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer0, this.p | 1, this.p);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object11;
    }

    @m
    public Object m(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(11) : ComposableLambdaKt.f(11);
        Object object11 = this.c;
        L.n(object11, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object12 = ((f)v0.q(object11, 14)).X0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final int q;
                final int r;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = v;
                    this.r = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.m(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, composer0, this.q | 1, this.r);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object12;
    }

    @Override  // A3.e
    public Object m0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        return this.l(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, ((Composer)object10), ((Number)object11).intValue(), ((Number)object12).intValue());
    }

    @m
    public Object n(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(12) : ComposableLambdaKt.f(12);
        Object object12 = this.c;
        L.n(object12, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object13 = ((g)v0.q(object12, 15)).i1(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final int r;
                final int s;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = v;
                    this.s = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.n(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, composer0, this.r | 1, this.s);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object13;
    }

    @Override  // A3.j
    public Object n1(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        return this.q(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, ((Composer)object15), ((Number)object16).intValue(), ((Number)object17).intValue());
    }

    @m
    public Object o(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @m Object object12, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(13) : ComposableLambdaKt.f(13);
        Object object13 = this.c;
        L.n(object13, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object14 = ((h)v0.q(object13, 16)).A0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final Object r;
                final int s;
                final int t;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = object12;
                    this.s = v;
                    this.t = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.o(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, composer0, this.s | 1, this.t);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object14;
    }

    @m
    public Object p(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @m Object object12, @m Object object13, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(14) : ComposableLambdaKt.f(14);
        Object object14 = this.c;
        L.n(object14, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object15 = ((i)v0.q(object14, 17)).Y0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final Object r;
                final Object s;
                final int t;
                final int u;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = object12;
                    this.s = object13;
                    this.t = v;
                    this.u = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.p(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, composer0, this.t | 1, this.u);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object15;
    }

    @m
    public Object q(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @m Object object12, @m Object object13, @m Object object14, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(15) : ComposableLambdaKt.f(15);
        Object object15 = this.c;
        L.n(object15, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object16 = ((j)v0.q(object15, 18)).n1(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final Object r;
                final Object s;
                final Object t;
                final int u;
                final int v;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = object12;
                    this.s = object13;
                    this.t = object14;
                    this.u = v;
                    this.v = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.q(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, composer0, this.u | 1, this.v);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object16;
    }

    @m
    public Object r(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @m Object object12, @m Object object13, @m Object object14, @m Object object15, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(16) : ComposableLambdaKt.f(16);
        Object object16 = this.c;
        L.n(object16, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object17 = ((k)v0.q(object16, 19)).z0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final Object r;
                final Object s;
                final Object t;
                final Object u;
                final int v;
                final int w;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = object12;
                    this.s = object13;
                    this.t = object14;
                    this.u = object15;
                    this.v = v;
                    this.w = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.r(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, composer0, this.v | 1, this.w);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object17;
    }

    @m
    public Object s(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @m Object object12, @m Object object13, @m Object object14, @m Object object15, @m Object object16, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(17) : ComposableLambdaKt.f(17);
        Object object17 = this.c;
        L.n(object17, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'p17\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object18 = ((A3.l)v0.q(object17, 20)).j0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final Object r;
                final Object s;
                final Object t;
                final Object u;
                final Object v;
                final int w;
                final int x;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = object12;
                    this.s = object13;
                    this.t = object14;
                    this.u = object15;
                    this.v = object16;
                    this.w = v;
                    this.x = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.s(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, composer0, this.w | 1, this.x);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object18;
    }

    @m
    public Object t(@m Object object0, @m Object object1, @m Object object2, @m Object object3, @m Object object4, @m Object object5, @m Object object6, @m Object object7, @m Object object8, @m Object object9, @m Object object10, @m Object object11, @m Object object12, @m Object object13, @m Object object14, @m Object object15, @m Object object16, @m Object object17, @l Composer composer0, int v, int v1) {
        L.p(composer0, "c");
        Composer composer1 = composer0.G(this.a);
        this.u(composer1);
        int v2 = composer1.t(this) ? ComposableLambdaKt.d(18) : ComposableLambdaKt.f(18);
        Object object18 = this.c;
        L.n(object18, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'p6\')] kotlin.Any?, @[ParameterName(name = \'p7\')] kotlin.Any?, @[ParameterName(name = \'p8\')] kotlin.Any?, @[ParameterName(name = \'p9\')] kotlin.Any?, @[ParameterName(name = \'p10\')] kotlin.Any?, @[ParameterName(name = \'p11\')] kotlin.Any?, @[ParameterName(name = \'p12\')] kotlin.Any?, @[ParameterName(name = \'p13\')] kotlin.Any?, @[ParameterName(name = \'p14\')] kotlin.Any?, @[ParameterName(name = \'p15\')] kotlin.Any?, @[ParameterName(name = \'p16\')] kotlin.Any?, @[ParameterName(name = \'p17\')] kotlin.Any?, @[ParameterName(name = \'p18\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, @[ParameterName(name = \'changed1\')] kotlin.Int, kotlin.Any?>");
        Object object19 = ((A3.m)v0.q(object18, 21)).L0(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, composer1, v, ((int)(v1 | v2)));
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, v, v1) {
                final ComposableLambdaImpl e;
                final Object f;
                final Object g;
                final Object h;
                final Object i;
                final Object j;
                final Object k;
                final Object l;
                final Object m;
                final Object n;
                final Object o;
                final Object p;
                final Object q;
                final Object r;
                final Object s;
                final Object t;
                final Object u;
                final Object v;
                final Object w;
                final int x;
                final int y;

                {
                    this.e = composableLambdaImpl0;
                    this.f = object0;
                    this.g = object1;
                    this.h = object2;
                    this.i = object3;
                    this.j = object4;
                    this.k = object5;
                    this.l = object6;
                    this.m = object7;
                    this.n = object8;
                    this.o = object9;
                    this.p = object10;
                    this.q = object11;
                    this.r = object12;
                    this.s = object13;
                    this.t = object14;
                    this.u = object15;
                    this.v = object16;
                    this.w = object17;
                    this.x = v;
                    this.y = v1;
                    super(2);
                }

                public final void a(@l Composer composer0, int v) {
                    L.p(composer0, "nc");
                    this.e.t(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, composer0, this.x | 1, this.y);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
        return object19;
    }

    private final void u(Composer composer0) {
        if(this.b) {
            RecomposeScope recomposeScope0 = composer0.T();
            if(recomposeScope0 != null) {
                composer0.q(recomposeScope0);
                if(ComposableLambdaKt.e(this.d, recomposeScope0)) {
                    this.d = recomposeScope0;
                    return;
                }
                List list0 = this.e;
                if(list0 == null) {
                    ArrayList arrayList0 = new ArrayList();
                    this.e = arrayList0;
                    arrayList0.add(recomposeScope0);
                    return;
                }
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(ComposableLambdaKt.e(((RecomposeScope)list0.get(v1)), recomposeScope0)) {
                        list0.set(v1, recomposeScope0);
                        return;
                    }
                }
                list0.add(recomposeScope0);
            }
        }
    }

    private final void v() {
        if(this.b) {
            RecomposeScope recomposeScope0 = this.d;
            if(recomposeScope0 != null) {
                recomposeScope0.invalidate();
                this.d = null;
            }
            List list0 = this.e;
            if(list0 != null) {
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((RecomposeScope)list0.get(v1)).invalidate();
                }
                list0.clear();
            }
        }
    }

    public final void w(@l Object object0) {
        L.p(object0, "block");
        if(!L.g(this.c, object0)) {
            boolean z = this.c == null;
            this.c = object0;
            if(!z) {
                this.v();
            }
        }
    }

    @Override  // A3.k
    public Object z0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        return this.r(object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, ((Composer)object16), ((Number)object17).intValue(), ((Number)object18).intValue());
    }
}

