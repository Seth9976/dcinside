package com.facebook.drawee.controller;

import E0.d;
import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.l;
import com.facebook.common.internal.q;
import com.facebook.datasource.j;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import k1.n.a;
import k1.n;
import k1.v;
import o3.h;

@n(a.a)
public abstract class b implements d {
    class com.facebook.drawee.controller.b.a extends c {
        com.facebook.drawee.controller.b.a() {
            super();
        }

        @Override  // com.facebook.drawee.controller.c
        public void e(String s, @h Object object0, @h Animatable animatable0) {
            if(animatable0 != null) {
                animatable0.start();
            }
        }
    }

    public static enum com.facebook.drawee.controller.b.c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE;

    }

    private final Context a;
    @h
    private final Set b;
    @h
    private final Set c;
    @h
    private Object d;
    @h
    private Object e;
    @h
    private Object f;
    @h
    private Object[] g;
    private boolean h;
    @h
    private q i;
    @h
    private com.facebook.drawee.controller.d j;
    @h
    private S0.n k;
    @h
    private e l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    @h
    private String q;
    @h
    private E0.a r;
    private static final com.facebook.drawee.controller.d s;
    private static final NullPointerException t;
    private static final AtomicLong u;

    static {
        b.s = new com.facebook.drawee.controller.b.a();
        b.t = new NullPointerException("No image request was specified!");
        b.u = new AtomicLong();
    }

    protected b(Context context0, Set set0, Set set1) {
        this.p = false;
        this.a = context0;
        this.b = set0;
        this.c = set1;
        this.A();
    }

    private void A() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = true;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.p = false;
        this.r = null;
        this.q = null;
    }

    public boolean B() {
        return this.p;
    }

    protected void C(com.facebook.drawee.controller.a a0) {
        Set set0 = this.b;
        if(set0 != null) {
            for(Object object0: set0) {
                a0.n(((com.facebook.drawee.controller.d)object0));
            }
        }
        Set set1 = this.c;
        if(set1 != null) {
            for(Object object1: set1) {
                a0.o(((S0.b)object1));
            }
        }
        com.facebook.drawee.controller.d d0 = this.j;
        if(d0 != null) {
            a0.n(d0);
        }
        if(this.n) {
            a0.n(b.s);
        }
    }

    protected void D(com.facebook.drawee.controller.a a0) {
        if(a0.x() == null) {
            a0.g0(com.facebook.drawee.gestures.a.c(this.a));
        }
    }

    protected void E(com.facebook.drawee.controller.a a0) {
        if(!this.m) {
            return;
        }
        a0.E().g(this.m);
        this.D(a0);
    }

    @v
    protected abstract com.facebook.drawee.controller.a F();

    protected q G(E0.a a0, String s) {
        q q1;
        q q0 = this.i;
        if(q0 != null) {
            return q0;
        }
        Object object0 = this.e;
        if(object0 == null) {
            q1 = this.g == null ? null : this.r(a0, s, this.g, this.h);
        }
        else {
            q1 = this.p(a0, s, object0);
        }
        if(q1 != null && this.f != null) {
            ArrayList arrayList0 = new ArrayList(2);
            arrayList0.add(q1);
            arrayList0.add(this.p(a0, s, this.f));
            q1 = j.d(arrayList0, false);
        }
        return q1 == null ? com.facebook.datasource.e.a(b.t) : q1;
    }

    public b H() {
        this.A();
        return this;
    }

    public b I(boolean z) {
        this.n = z;
        return this.z();
    }

    public b J(Object object0) {
        this.d = object0;
        return this;
    }

    public b K(String s) {
        this.q = s;
        return this.z();
    }

    public b L(@h com.facebook.drawee.controller.d d0) {
        this.j = d0;
        return this;
    }

    public b M(@h e e0) {
        this.l = e0;
        return this;
    }

    public b N(@h q q0) {
        this.i = q0;
        return this;
    }

    public b O(@h Object[] arr_object) {
        return this.P(arr_object, true);
    }

    public b P(@h Object[] arr_object, boolean z) {
        com.facebook.common.internal.n.e(arr_object == null || arr_object.length > 0, "No requests specified!");
        this.g = arr_object;
        this.h = z;
        return this;
    }

    public b Q(@h Object object0) {
        this.e = object0;
        return this;
    }

    public b R(boolean z) {
        this.p = z;
        return this;
    }

    public b S(@h S0.n n0) {
        this.k = n0;
        return this;
    }

    public b T(@h Object object0) {
        this.f = object0;
        return this;
    }

    public b U(@h E0.a a0) {
        this.r = a0;
        return this;
    }

    public b V(boolean z) {
        this.o = z;
        return this;
    }

    public b W(boolean z) {
        this.m = z;
        return this;
    }

    protected void X() {
        boolean z = true;
        com.facebook.common.internal.n.p(this.g == null || this.e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if(this.i != null && (this.g != null || this.e != null || this.f != null)) {
            z = false;
        }
        com.facebook.common.internal.n.p(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override  // E0.d
    public d a(Object object0) {
        return this.J(object0);
    }

    @Override  // E0.d
    public d b(@h E0.a a0) {
        return this.U(a0);
    }

    @Override  // E0.d
    public E0.a build() {
        return this.e();
    }

    public com.facebook.drawee.controller.a e() {
        this.X();
        if(this.e == null && this.g == null) {
            Object object0 = this.f;
            if(object0 != null) {
                this.e = object0;
                this.f = null;
            }
        }
        return this.f();
    }

    protected com.facebook.drawee.controller.a f() {
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        com.facebook.drawee.controller.a a0 = this.F();
        a0.h0(this.B());
        a0.j0(this.x());
        a0.b(this.j());
        a0.f0(this.m());
        this.E(a0);
        this.C(a0);
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return a0;
    }

    // 去混淆评级： 低(20)
    protected static String g() [...] // 潜在的解密器

    public boolean h() {
        return this.n;
    }

    @h
    public Object i() {
        return this.d;
    }

    @h
    public String j() {
        return this.q;
    }

    protected Context k() {
        return this.a;
    }

    @h
    public com.facebook.drawee.controller.d l() {
        return this.j;
    }

    @h
    public e m() {
        return this.l;
    }

    protected abstract com.facebook.datasource.d n(E0.a arg1, String arg2, Object arg3, Object arg4, com.facebook.drawee.controller.b.c arg5);

    @h
    public q o() {
        return this.i;
    }

    protected q p(E0.a a0, String s, Object object0) {
        return this.q(a0, s, object0, com.facebook.drawee.controller.b.c.a);
    }

    protected q q(E0.a a0, String s, Object object0, com.facebook.drawee.controller.b.c b$c0) {
        class com.facebook.drawee.controller.b.b implements q {
            final E0.a a;
            final String b;
            final Object c;
            final Object d;
            final com.facebook.drawee.controller.b.c e;
            final b f;

            com.facebook.drawee.controller.b.b(E0.a a0, String s, Object object0, Object object1, com.facebook.drawee.controller.b.c b$c0) {
                this.a = a0;
                this.b = s;
                this.c = object0;
                this.d = object1;
                this.e = b$c0;
                super();
            }

            public com.facebook.datasource.d a() {
                return b.this.n(this.a, this.b, this.c, this.d, this.e);
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }

            @Override
            public String toString() {
                return l.e(this).f("request", this.c.toString()).toString();
            }
        }

        return new com.facebook.drawee.controller.b.b(this, a0, s, object0, this.i(), b$c0);
    }

    protected q r(E0.a a0, String s, Object[] arr_object, boolean z) {
        ArrayList arrayList0 = new ArrayList(arr_object.length * 2);
        if(z) {
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                arrayList0.add(this.q(a0, s, arr_object[v1], com.facebook.drawee.controller.b.c.c));
            }
        }
        for(int v = 0; v < arr_object.length; ++v) {
            arrayList0.add(this.p(a0, s, arr_object[v]));
        }
        return com.facebook.datasource.h.b(arrayList0);
    }

    @h
    public Object[] s() {
        return this.g;
    }

    @h
    public Object t() {
        return this.e;
    }

    @h
    public S0.n u() {
        return this.k;
    }

    @h
    public Object v() {
        return this.f;
    }

    @h
    public E0.a w() {
        return this.r;
    }

    public boolean x() {
        return this.o;
    }

    public boolean y() {
        return this.m;
    }

    protected final b z() [...] // Inlined contents
}

