package com.google.common.cache;

import J1.b;
import com.google.common.base.H;
import com.google.common.base.Q;
import com.google.common.base.S;
import com.google.common.base.V;
import com.google.common.base.m;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@b(emulated = true)
@i
public final class d {
    class a implements com.google.common.cache.a.b {
        a() {
            super();
        }

        @Override  // com.google.common.cache.a$b
        public void a(int v) {
        }

        @Override  // com.google.common.cache.a$b
        public void b() {
        }

        @Override  // com.google.common.cache.a$b
        public void c(long v) {
        }

        @Override  // com.google.common.cache.a$b
        public void d(int v) {
        }

        @Override  // com.google.common.cache.a$b
        public void e(long v) {
        }

        @Override  // com.google.common.cache.a$b
        public h f() {
            return d.v;
        }
    }

    class com.google.common.cache.d.b implements Q {
        com.google.common.cache.d.b() {
            super();
        }

        public com.google.common.cache.a.b a() {
            return new com.google.common.cache.a.a();
        }

        @Override  // com.google.common.base.Q
        public Object get() {
            return this.a();
        }
    }

    class c extends V {
        c() {
            super();
        }

        @Override  // com.google.common.base.V
        public long a() {
            return 0L;
        }
    }

    static final class com.google.common.cache.d.d {
        static final Logger a;

        static {
            com.google.common.cache.d.d.a = Logger.getLogger("com.google.common.cache.d");
        }
    }

    static enum e implements v {
        INSTANCE;

        @Override  // com.google.common.cache.v
        public void a(z z0) {
        }

        private static e[] b() [...] // Inlined contents
    }

    static enum f implements B {
        INSTANCE;

        @Override  // com.google.common.cache.B
        public int a(Object object0, Object object1) {
            return 1;
        }

        private static f[] b() [...] // Inlined contents
    }

    boolean a;
    int b;
    int c;
    long d;
    long e;
    @o3.a
    B f;
    @o3.a
    t g;
    @o3.a
    t h;
    long i;
    long j;
    long k;
    @o3.a
    m l;
    @o3.a
    m m;
    @o3.a
    v n;
    @o3.a
    V o;
    Q p;
    private static final int q = 16;
    private static final int r = 4;
    private static final int s = 0;
    private static final int t = 0;
    static final Q u = null;
    static final h v = null;
    static final Q w = null;
    static final V x = null;
    static final int y = -1;

    static {
        d.u = S.d(new a());
        d.v = new h(0L, 0L, 0L, 0L, 0L, 0L);
        d.w = new com.google.common.cache.d.b();
        d.x = new c();
    }

    private d() {
        this.a = true;
        this.b = -1;
        this.c = -1;
        this.d = -1L;
        this.e = -1L;
        this.i = -1L;
        this.j = -1L;
        this.k = -1L;
        this.p = d.u;
    }

    @J1.c
    @O1.a
    d A() {
        this.a = false;
        return this;
    }

    @O1.a
    public d B(long v) {
        boolean z = false;
        H.s0(this.d == -1L, "maximum size was already set to %s", this.d);
        H.s0(this.e == -1L, "maximum weight was already set to %s", this.e);
        H.h0(this.f == null, "maximum size can not be combined with weigher");
        if(v >= 0L) {
            z = true;
        }
        H.e(z, "maximum size must not be negative");
        this.d = v;
        return this;
    }

    @J1.c
    @O1.a
    public d C(long v) {
        boolean z = false;
        H.s0(this.e == -1L, "maximum weight was already set to %s", this.e);
        H.s0(this.d == -1L, "maximum size was already set to %s", this.d);
        if(v >= 0L) {
            z = true;
        }
        H.e(z, "maximum weight must not be negative");
        this.e = v;
        return this;
    }

    public static d D() {
        return new d();
    }

    @O1.a
    public d E() {
        this.p = d.w;
        return this;
    }

    @J1.c
    @O1.a
    public d F(long v, TimeUnit timeUnit0) {
        H.E(timeUnit0);
        boolean z = false;
        H.s0(this.k == -1L, "refresh was already set to %s ns", this.k);
        if(v > 0L) {
            z = true;
        }
        H.t(z, "duration must be positive: %s %s", v, timeUnit0);
        this.k = timeUnit0.toNanos(v);
        return this;
    }

    public d G(v v0) {
        H.g0(this.n == null);
        this.n = (v)H.E(v0);
        return this;
    }

    @O1.a
    d H(t m$t0) {
        H.x0(this.g == null, "Key strength was already set to %s", this.g);
        this.g = (t)H.E(m$t0);
        return this;
    }

    @O1.a
    d I(t m$t0) {
        H.x0(this.h == null, "Value strength was already set to %s", this.h);
        this.h = (t)H.E(m$t0);
        return this;
    }

    @J1.c
    @O1.a
    public d J() {
        return this.I(t.b);
    }

    @O1.a
    public d K(V v0) {
        H.g0(this.o == null);
        this.o = (V)H.E(v0);
        return this;
    }

    @J1.c
    @O1.a
    d L(m m0) {
        H.x0(this.m == null, "value equivalence was already set to %s", this.m);
        this.m = (m)H.E(m0);
        return this;
    }

    @J1.c
    @O1.a
    public d M() {
        return this.H(t.c);
    }

    @J1.c
    @O1.a
    public d N() {
        return this.I(t.c);
    }

    @J1.c
    @O1.a
    public d O(B b0) {
        boolean z = false;
        H.g0(this.f == null);
        if(this.a) {
            long v = this.d;
            if(v == -1L) {
                z = true;
            }
            H.s0(z, "weigher can not be combined with maximum size (%s provided)", v);
        }
        this.f = (B)H.E(b0);
        return this;
    }

    public com.google.common.cache.c a() {
        this.d();
        this.c();
        return new o(this);
    }

    public l b(g g0) {
        this.d();
        return new n(this, g0);
    }

    private void c() {
        H.h0(this.k == -1L, "refreshAfterWrite requires a LoadingCache");
    }

    private void d() {
        boolean z = false;
        if(this.f == null) {
            if(this.e == -1L) {
                z = true;
            }
            H.h0(z, "maximumWeight requires weigher");
            return;
        }
        if(this.a) {
            if(this.e != -1L) {
                z = true;
            }
            H.h0(z, "weigher requires maximumWeight");
            return;
        }
        if(this.e == -1L) {
            com.google.common.cache.d.d.a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @O1.a
    public d e(int v) {
        boolean z = false;
        H.n0(this.c == -1, "concurrency level was already set to %s", this.c);
        if(v > 0) {
            z = true;
        }
        H.d(z);
        this.c = v;
        return this;
    }

    @O1.a
    public d f(long v, TimeUnit timeUnit0) {
        boolean z = false;
        H.s0(this.j == -1L, "expireAfterAccess was already set to %s ns", this.j);
        if(v >= 0L) {
            z = true;
        }
        H.t(z, "duration cannot be negative: %s %s", v, timeUnit0);
        this.j = timeUnit0.toNanos(v);
        return this;
    }

    @O1.a
    public d g(long v, TimeUnit timeUnit0) {
        boolean z = false;
        H.s0(this.i == -1L, "expireAfterWrite was already set to %s ns", this.i);
        if(v >= 0L) {
            z = true;
        }
        H.t(z, "duration cannot be negative: %s %s", v, timeUnit0);
        this.i = timeUnit0.toNanos(v);
        return this;
    }

    @J1.c
    public static d h(com.google.common.cache.e e0) {
        return e0.f().A();
    }

    @J1.c
    public static d i(String s) {
        return d.h(com.google.common.cache.e.e(s));
    }

    int j() {
        return this.c == -1 ? 4 : this.c;
    }

    long k() {
        return this.j == -1L ? 0L : this.j;
    }

    long l() {
        return this.i == -1L ? 0L : this.i;
    }

    int m() {
        return this.b == -1 ? 16 : this.b;
    }

    m n() {
        return (m)com.google.common.base.z.a(this.l, this.o().b());
    }

    t o() {
        return (t)com.google.common.base.z.a(this.g, t.a);
    }

    long p() {
        if(this.i != 0L && this.j != 0L) {
            return this.f == null ? this.d : this.e;
        }
        return 0L;
    }

    long q() {
        return this.k == -1L ? 0L : this.k;
    }

    v r() {
        return (v)com.google.common.base.z.a(this.n, e.a);
    }

    Q s() {
        return this.p;
    }

    V t(boolean z) {
        V v0 = this.o;
        if(v0 != null) {
            return v0;
        }
        return z ? V.b() : d.x;
    }

    @Override
    public String toString() {
        com.google.common.base.z.b z$b0 = com.google.common.base.z.c(this);
        int v = this.b;
        if(v != -1) {
            z$b0.d("initialCapacity", v);
        }
        int v1 = this.c;
        if(v1 != -1) {
            z$b0.d("concurrencyLevel", v1);
        }
        long v2 = this.d;
        if(v2 != -1L) {
            z$b0.e("maximumSize", v2);
        }
        long v3 = this.e;
        if(v3 != -1L) {
            z$b0.e("maximumWeight", v3);
        }
        if(this.i != -1L) {
            z$b0.f("expireAfterWrite", this.i + "ns");
        }
        if(this.j != -1L) {
            z$b0.f("expireAfterAccess", this.j + "ns");
        }
        t m$t0 = this.g;
        if(m$t0 != null) {
            z$b0.f("keyStrength", com.google.common.base.c.g(m$t0.toString()));
        }
        t m$t1 = this.h;
        if(m$t1 != null) {
            z$b0.f("valueStrength", com.google.common.base.c.g(m$t1.toString()));
        }
        if(this.l != null) {
            z$b0.s("keyEquivalence");
        }
        if(this.m != null) {
            z$b0.s("valueEquivalence");
        }
        if(this.n != null) {
            z$b0.s("removalListener");
        }
        return z$b0.toString();
    }

    m u() {
        return (m)com.google.common.base.z.a(this.m, this.v().b());
    }

    t v() {
        return (t)com.google.common.base.z.a(this.h, t.a);
    }

    B w() {
        return (B)com.google.common.base.z.a(this.f, f.a);
    }

    @O1.a
    public d x(int v) {
        boolean z = false;
        H.n0(this.b == -1, "initial capacity was already set to %s", this.b);
        if(v >= 0) {
            z = true;
        }
        H.d(z);
        this.b = v;
        return this;
    }

    boolean y() {
        return this.p == d.w;
    }

    @J1.c
    @O1.a
    d z(m m0) {
        H.x0(this.l == null, "key equivalence was already set to %s", this.l);
        this.l = (m)H.E(m0);
        return this;
    }
}

