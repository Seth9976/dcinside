package com.kakao.adfit.b;

import A3.a;
import com.kakao.adfit.m.v;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.o;

public final class c {
    private final a a;
    private final v b;
    private final v c;
    private final v d;
    private final v e;
    private final v f;
    static final o[] g;

    static {
        c.g = new o[]{m0.k(new Y(c.class, "isAvailable", "isAvailable()Z", 0)), m0.k(new Y(c.class, "isExecuted", "isExecuted()Z", 0)), m0.k(new Y(c.class, "isRequesting", "isRequesting()Z", 0)), m0.k(new Y(c.class, "isPaused", "isPaused()Z", 0)), m0.k(new Y(c.class, "isTerminated", "isTerminated()Z", 0))};
    }

    public c(a a0) {
        static final class com.kakao.adfit.b.c.a extends N implements Function1 {
            final c a;

            com.kakao.adfit.b.c.a(c c0) {
                this.a = c0;
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


        static final class b extends N implements Function1 {
            final c a;

            b(c c0) {
                this.a = c0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.f();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class com.kakao.adfit.b.c.c extends N implements Function1 {
            final c a;

            com.kakao.adfit.b.c.c(c c0) {
                this.a = c0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.f();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class d extends N implements Function1 {
            final c a;

            d(c c0) {
                this.a = c0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.f();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }


        static final class e extends N implements Function1 {
            final c a;

            e(c c0) {
                this.a = c0;
                super(1);
            }

            public final void a(boolean z) {
                this.a.f();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0).booleanValue());
                return S0.a;
            }
        }

        L.p(a0, "onAvailableStateChanged");
        super();
        this.a = a0;
        this.b = new v(false, new com.kakao.adfit.b.c.a(this));
        this.c = new v(false, new b(this));
        this.d = new v(false, new d(this));
        this.e = new v(false, new com.kakao.adfit.b.c.c(this));
        this.f = new v(false, new e(this));
    }

    private final void a(boolean z) {
        this.b.setValue(this, c.g[0], Boolean.valueOf(z));
    }

    public final boolean a() {
        return ((Boolean)this.b.getValue(this, c.g[0])).booleanValue();
    }

    public final void b(boolean z) {
        this.c.setValue(this, c.g[1], Boolean.valueOf(z));
    }

    public final boolean b() {
        return ((Boolean)this.c.getValue(this, c.g[1])).booleanValue();
    }

    public final void c(boolean z) {
        this.e.setValue(this, c.g[3], Boolean.valueOf(z));
    }

    public final boolean c() {
        return ((Boolean)this.e.getValue(this, c.g[3])).booleanValue();
    }

    public final void d(boolean z) {
        this.d.setValue(this, c.g[2], Boolean.valueOf(z));
    }

    public final boolean d() {
        return ((Boolean)this.d.getValue(this, c.g[2])).booleanValue();
    }

    public final void e(boolean z) {
        this.f.setValue(this, c.g[4], Boolean.valueOf(z));
    }

    public final boolean e() {
        return ((Boolean)this.f.getValue(this, c.g[4])).booleanValue();
    }

    // 去混淆评级： 低(20)
    private final void f() {
        this.a(this.b() && !this.d() && !this.c() && !this.e());
    }
}

