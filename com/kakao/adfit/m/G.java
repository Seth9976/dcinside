package com.kakao.adfit.m;

import A3.a;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.o;

public final class g {
    private final a a;
    private final v b;
    private final v c;
    private final v d;
    private final v e;
    private final v f;
    private final v g;
    static final o[] h;

    static {
        g.h = new o[]{m0.k(new Y(g.class, "isForeground", "isForeground()Z", 0)), m0.k(new Y(g.class, "isAttached", "isAttached()Z", 0)), m0.k(new Y(g.class, "isVisible", "isVisible()Z", 0)), m0.k(new Y(g.class, "isWindowVisible", "isWindowVisible()Z", 0)), m0.k(new Y(g.class, "hasWindowFocus", "getHasWindowFocus()Z", 0)), m0.k(new Y(g.class, "hasLayoutSize", "getHasLayoutSize()Z", 0))};
    }

    public g(a a0) {
        static final class com.kakao.adfit.m.g.a extends N implements Function1 {
            final g a;

            com.kakao.adfit.m.g.a(g g0) {
                this.a = g0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.g();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class b extends N implements Function1 {
            final g a;

            b(g g0) {
                this.a = g0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.g();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class c extends N implements Function1 {
            final g a;

            c(g g0) {
                this.a = g0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.g();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class d extends N implements Function1 {
            final g a;

            d(g g0) {
                this.a = g0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.a.invoke();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class e extends N implements Function1 {
            final g a;

            e(g g0) {
                this.a = g0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.g();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class f extends N implements Function1 {
            final g a;

            f(g g0) {
                this.a = g0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.g();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }

        L.p(a0, "onForegroundStateChanged");
        super();
        this.a = a0;
        this.b = new v(false, new d(this));
        this.c = new v(false, new c(this));
        this.d = new v(false, new e(this));
        this.e = new v(false, new f(this));
        this.f = new v(false, new b(this));
        this.g = new v(false, new com.kakao.adfit.m.g.a(this));
    }

    public final void a(boolean z) {
        this.c.setValue(this, g.h[1], Boolean.valueOf(z));
    }

    public final boolean a() {
        return ((Boolean)this.g.getValue(this, g.h[5])).booleanValue();
    }

    private final void b(boolean z) {
        this.b.setValue(this, g.h[0], Boolean.valueOf(z));
    }

    public final boolean b() {
        return ((Boolean)this.f.getValue(this, g.h[4])).booleanValue();
    }

    public final void c(boolean z) {
        this.g.setValue(this, g.h[5], Boolean.valueOf(z));
    }

    public final boolean c() {
        return ((Boolean)this.c.getValue(this, g.h[1])).booleanValue();
    }

    public final void d(boolean z) {
        this.f.setValue(this, g.h[4], Boolean.valueOf(z));
    }

    public final boolean d() {
        return ((Boolean)this.b.getValue(this, g.h[0])).booleanValue();
    }

    public final void e(boolean z) {
        this.d.setValue(this, g.h[2], Boolean.valueOf(z));
    }

    public final boolean e() {
        return ((Boolean)this.d.getValue(this, g.h[2])).booleanValue();
    }

    public final void f(boolean z) {
        this.e.setValue(this, g.h[3], Boolean.valueOf(z));
    }

    public final boolean f() {
        return ((Boolean)this.e.getValue(this, g.h[3])).booleanValue();
    }

    // 去混淆评级： 低(25)
    private final void g() {
        this.b(this.c() && this.e() && this.f() && this.b() && this.a());
    }
}

