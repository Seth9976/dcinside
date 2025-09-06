package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.cache.j.a;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.f;
import com.bumptech.glide.util.i;
import com.bumptech.glide.util.pool.a.d;
import java.util.Map;
import java.util.concurrent.Executor;

public class k implements a, m, com.bumptech.glide.load.engine.p.a {
    @VisibleForTesting
    static class com.bumptech.glide.load.engine.k.a {
        class com.bumptech.glide.load.engine.k.a.a implements d {
            final com.bumptech.glide.load.engine.k.a a;

            @Override  // com.bumptech.glide.util.pool.a$d
            public Object a() {
                return this.b();
            }

            public h b() {
                return new h(com.bumptech.glide.load.engine.k.a.this.a, com.bumptech.glide.load.engine.k.a.this.b);
            }
        }

        final e a;
        final Pool b;
        private int c;

        com.bumptech.glide.load.engine.k.a(e h$e0) {
            this.b = com.bumptech.glide.util.pool.a.e(150, new com.bumptech.glide.load.engine.k.a.a(this));
            this.a = h$e0;
        }

        h a(com.bumptech.glide.e e0, Object object0, n n0, g g0, int v, int v1, Class class0, Class class1, j j0, com.bumptech.glide.load.engine.j j1, Map map0, boolean z, boolean z1, boolean z2, com.bumptech.glide.load.j j2, b h$b0) {
            h h0 = (h)com.bumptech.glide.util.m.e(((h)this.b.b()));
            int v2 = this.c;
            ++this.c;
            return h0.n(e0, object0, n0, g0, v, v1, class0, class1, j0, j1, map0, z, z1, z2, j2, h$b0, v2);
        }
    }

    @VisibleForTesting
    static class com.bumptech.glide.load.engine.k.b {
        class com.bumptech.glide.load.engine.k.b.a implements d {
            final com.bumptech.glide.load.engine.k.b a;

            @Override  // com.bumptech.glide.util.pool.a$d
            public Object a() {
                return this.b();
            }

            public l b() {
                return new l(com.bumptech.glide.load.engine.k.b.this.a, com.bumptech.glide.load.engine.k.b.this.b, com.bumptech.glide.load.engine.k.b.this.c, com.bumptech.glide.load.engine.k.b.this.d, com.bumptech.glide.load.engine.k.b.this.e, com.bumptech.glide.load.engine.k.b.this.f, com.bumptech.glide.load.engine.k.b.this.g);
            }
        }

        final com.bumptech.glide.load.engine.executor.a a;
        final com.bumptech.glide.load.engine.executor.a b;
        final com.bumptech.glide.load.engine.executor.a c;
        final com.bumptech.glide.load.engine.executor.a d;
        final m e;
        final com.bumptech.glide.load.engine.p.a f;
        final Pool g;

        com.bumptech.glide.load.engine.k.b(com.bumptech.glide.load.engine.executor.a a0, com.bumptech.glide.load.engine.executor.a a1, com.bumptech.glide.load.engine.executor.a a2, com.bumptech.glide.load.engine.executor.a a3, m m0, com.bumptech.glide.load.engine.p.a p$a0) {
            this.g = com.bumptech.glide.util.pool.a.e(150, new com.bumptech.glide.load.engine.k.b.a(this));
            this.a = a0;
            this.b = a1;
            this.c = a2;
            this.d = a3;
            this.e = m0;
            this.f = p$a0;
        }

        l a(g g0, boolean z, boolean z1, boolean z2, boolean z3) {
            return ((l)com.bumptech.glide.util.m.e(((l)this.g.b()))).l(g0, z, z1, z2, z3);
        }

        @VisibleForTesting
        void b() {
            f.c(this.a);
            f.c(this.b);
            f.c(this.c);
            f.c(this.d);
        }
    }

    static class c implements e {
        private final com.bumptech.glide.load.engine.cache.a.a a;
        private volatile com.bumptech.glide.load.engine.cache.a b;

        c(com.bumptech.glide.load.engine.cache.a.a a$a0) {
            this.a = a$a0;
        }

        @Override  // com.bumptech.glide.load.engine.h$e
        public com.bumptech.glide.load.engine.cache.a a() {
            if(this.b == null) {
                synchronized(this) {
                    if(this.b == null) {
                        this.b = this.a.build();
                    }
                    if(this.b == null) {
                        this.b = new com.bumptech.glide.load.engine.cache.b();
                    }
                }
            }
            return this.b;
        }

        @VisibleForTesting
        void b() {
            synchronized(this) {
                if(this.b == null) {
                    return;
                }
                this.b.clear();
            }
        }
    }

    public class com.bumptech.glide.load.engine.k.d {
        private final l a;
        private final com.bumptech.glide.request.j b;
        final k c;

        com.bumptech.glide.load.engine.k.d(com.bumptech.glide.request.j j0, l l0) {
            this.b = j0;
            this.a = l0;
        }

        public void a() {
            synchronized(k.this) {
                this.a.s(this.b);
            }
        }
    }

    private final s a;
    private final o b;
    private final com.bumptech.glide.load.engine.cache.j c;
    private final com.bumptech.glide.load.engine.k.b d;
    private final y e;
    private final c f;
    private final com.bumptech.glide.load.engine.k.a g;
    private final com.bumptech.glide.load.engine.a h;
    private static final String i = "Engine";
    private static final int j = 150;
    private static final boolean k;

    static {
        k.k = Log.isLoggable("Engine", 2);
    }

    @VisibleForTesting
    k(com.bumptech.glide.load.engine.cache.j j0, com.bumptech.glide.load.engine.cache.a.a a$a0, com.bumptech.glide.load.engine.executor.a a0, com.bumptech.glide.load.engine.executor.a a1, com.bumptech.glide.load.engine.executor.a a2, com.bumptech.glide.load.engine.executor.a a3, s s0, o o0, com.bumptech.glide.load.engine.a a4, com.bumptech.glide.load.engine.k.b k$b0, com.bumptech.glide.load.engine.k.a k$a0, y y0, boolean z) {
        this.c = j0;
        c k$c0 = new c(a$a0);
        this.f = k$c0;
        com.bumptech.glide.load.engine.a a5 = a4 == null ? new com.bumptech.glide.load.engine.a(z) : a4;
        this.h = a5;
        a5.g(this);
        this.b = o0 == null ? new o() : o0;
        this.a = s0 == null ? new s() : s0;
        this.d = k$b0 == null ? new com.bumptech.glide.load.engine.k.b(a0, a1, a2, a3, this, this) : k$b0;
        this.g = k$a0 == null ? new com.bumptech.glide.load.engine.k.a(k$c0) : k$a0;
        this.e = y0 == null ? new y() : y0;
        j0.h(this);
    }

    public k(com.bumptech.glide.load.engine.cache.j j0, com.bumptech.glide.load.engine.cache.a.a a$a0, com.bumptech.glide.load.engine.executor.a a0, com.bumptech.glide.load.engine.executor.a a1, com.bumptech.glide.load.engine.executor.a a2, com.bumptech.glide.load.engine.executor.a a3, boolean z) {
        this(j0, a$a0, a0, a1, a2, a3, null, null, null, null, null, null, z);
    }

    @Override  // com.bumptech.glide.load.engine.m
    public void a(l l0, g g0, p p0) {
        synchronized(this) {
            if(p0 != null && p0.d()) {
                this.h.a(g0, p0);
            }
            this.a.e(g0, l0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.m
    public void b(l l0, g g0) {
        synchronized(this) {
            this.a.e(g0, l0);
        }
    }

    @Override  // com.bumptech.glide.load.engine.p$a
    public void c(g g0, p p0) {
        this.h.d(g0);
        if(p0.d()) {
            this.c.f(g0, p0);
            return;
        }
        this.e.a(p0, false);
    }

    @Override  // com.bumptech.glide.load.engine.cache.j$a
    public void d(@NonNull v v0) {
        this.e.a(v0, true);
    }

    public void e() {
        this.f.a().clear();
    }

    private p f(g g0) {
        v v0 = this.c.g(g0);
        if(v0 == null) {
            return null;
        }
        return v0 instanceof p ? ((p)v0) : new p(v0, true, true, g0, this);
    }

    public com.bumptech.glide.load.engine.k.d g(com.bumptech.glide.e e0, Object object0, g g0, int v, int v1, Class class0, Class class1, j j0, com.bumptech.glide.load.engine.j j1, Map map0, boolean z, boolean z1, com.bumptech.glide.load.j j2, boolean z2, boolean z3, boolean z4, boolean z5, com.bumptech.glide.request.j j3, Executor executor0) {
        p p0;
        long v2 = k.k ? i.b() : 0L;
        n n0 = this.b.a(object0, g0, v, v1, map0, class0, class1, j2);
        synchronized(this) {
            p0 = this.j(n0, z2, v2);
            if(p0 == null) {
                return this.n(e0, object0, g0, v, v1, class0, class1, j0, j1, map0, z, z1, j2, z2, z3, z4, z5, j3, executor0, n0, v2);
            }
        }
        j3.c(p0, com.bumptech.glide.load.a.e, false);
        return null;
    }

    @Nullable
    private p h(g g0) {
        p p0 = this.h.e(g0);
        if(p0 != null) {
            p0.b();
        }
        return p0;
    }

    private p i(g g0) {
        p p0 = this.f(g0);
        if(p0 != null) {
            p0.b();
            this.h.a(g0, p0);
        }
        return p0;
    }

    @Nullable
    private p j(n n0, boolean z, long v) {
        if(!z) {
            return null;
        }
        p p0 = this.h(n0);
        if(p0 != null) {
            if(k.k) {
                k.k("Loaded resource from active resources", v, n0);
            }
            return p0;
        }
        p p1 = this.i(n0);
        if(p1 != null) {
            if(k.k) {
                k.k("Loaded resource from cache", v, n0);
            }
            return p1;
        }
        return null;
    }

    private static void k(String s, long v, g g0) {
        Log.v("Engine", s + " in " + i.a(v) + "ms, key: " + g0);
    }

    public void l(v v0) {
        if(!(v0 instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p)v0).e();
    }

    @VisibleForTesting
    public void m() {
        this.d.b();
        this.f.b();
        this.h.h();
    }

    private com.bumptech.glide.load.engine.k.d n(com.bumptech.glide.e e0, Object object0, g g0, int v, int v1, Class class0, Class class1, j j0, com.bumptech.glide.load.engine.j j1, Map map0, boolean z, boolean z1, com.bumptech.glide.load.j j2, boolean z2, boolean z3, boolean z4, boolean z5, com.bumptech.glide.request.j j3, Executor executor0, n n0, long v2) {
        l l0 = this.a.a(n0, z5);
        if(l0 != null) {
            l0.a(j3, executor0);
            if(k.k) {
                k.k("Added to existing load", v2, n0);
            }
            return new com.bumptech.glide.load.engine.k.d(this, j3, l0);
        }
        l l1 = this.d.a(n0, z2, z3, z4, z5);
        h h0 = this.g.a(e0, object0, n0, g0, v, v1, class0, class1, j0, j1, map0, z, z1, z5, j2, l1);
        this.a.d(n0, l1);
        l1.a(j3, executor0);
        l1.t(h0);
        if(k.k) {
            k.k("Started new load", v2, n0);
        }
        return new com.bumptech.glide.load.engine.k.d(this, j3, l1);
    }
}

