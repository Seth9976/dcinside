package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.g;
import com.bumptech.glide.request.j;
import com.bumptech.glide.util.pool.a.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

class l implements b, f {
    class a implements Runnable {
        private final j a;
        final l b;

        a(j j0) {
            this.a = j0;
        }

        @Override
        public void run() {
            synchronized(this.a.h()) {
                synchronized(l.this) {
                    if(l.this.a.b(this.a)) {
                        l.this.f(this.a);
                    }
                    l.this.i();
                }
            }
        }
    }

    class com.bumptech.glide.load.engine.l.b implements Runnable {
        private final j a;
        final l b;

        com.bumptech.glide.load.engine.l.b(j j0) {
            this.a = j0;
        }

        @Override
        public void run() {
            synchronized(this.a.h()) {
                synchronized(l.this) {
                    if(l.this.a.b(this.a)) {
                        l.this.v.b();
                        l.this.g(this.a);
                        l.this.s(this.a);
                    }
                    l.this.i();
                }
            }
        }
    }

    @VisibleForTesting
    static class c {
        public p a(v v0, boolean z, g g0, com.bumptech.glide.load.engine.p.a p$a0) {
            return new p(v0, z, true, g0, p$a0);
        }
    }

    static final class d {
        final j a;
        final Executor b;

        d(j j0, Executor executor0) {
            this.a = j0;
            this.b = executor0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof d ? this.a.equals(((d)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    static final class e implements Iterable {
        private final List a;

        e() {
            this(new ArrayList(2));
        }

        e(List list0) {
            this.a = list0;
        }

        void a(j j0, Executor executor0) {
            d l$d0 = new d(j0, executor0);
            this.a.add(l$d0);
        }

        boolean b(j j0) {
            d l$d0 = e.d(j0);
            return this.a.contains(l$d0);
        }

        e c() {
            return new e(new ArrayList(this.a));
        }

        void clear() {
            this.a.clear();
        }

        private static d d(j j0) {
            return new d(j0, com.bumptech.glide.util.f.a());
        }

        void g(j j0) {
            d l$d0 = e.d(j0);
            this.a.remove(l$d0);
        }

        boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        @NonNull
        public Iterator iterator() {
            return this.a.iterator();
        }

        int size() {
            return this.a.size();
        }
    }

    final e a;
    private final com.bumptech.glide.util.pool.c b;
    private final com.bumptech.glide.load.engine.p.a c;
    private final Pool d;
    private final c e;
    private final m f;
    private final com.bumptech.glide.load.engine.executor.a g;
    private final com.bumptech.glide.load.engine.executor.a h;
    private final com.bumptech.glide.load.engine.executor.a i;
    private final com.bumptech.glide.load.engine.executor.a j;
    private final AtomicInteger k;
    private g l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private v q;
    com.bumptech.glide.load.a r;
    private boolean s;
    q t;
    private boolean u;
    p v;
    private h w;
    private volatile boolean x;
    private boolean y;
    private static final c z;

    static {
        l.z = new c();
    }

    l(com.bumptech.glide.load.engine.executor.a a0, com.bumptech.glide.load.engine.executor.a a1, com.bumptech.glide.load.engine.executor.a a2, com.bumptech.glide.load.engine.executor.a a3, m m0, com.bumptech.glide.load.engine.p.a p$a0, Pool pools$Pool0) {
        this(a0, a1, a2, a3, m0, p$a0, pools$Pool0, l.z);
    }

    @VisibleForTesting
    l(com.bumptech.glide.load.engine.executor.a a0, com.bumptech.glide.load.engine.executor.a a1, com.bumptech.glide.load.engine.executor.a a2, com.bumptech.glide.load.engine.executor.a a3, m m0, com.bumptech.glide.load.engine.p.a p$a0, Pool pools$Pool0, c l$c0) {
        this.a = new e();
        this.b = com.bumptech.glide.util.pool.c.a();
        this.k = new AtomicInteger();
        this.g = a0;
        this.h = a1;
        this.i = a2;
        this.j = a3;
        this.f = m0;
        this.c = p$a0;
        this.d = pools$Pool0;
        this.e = l$c0;
    }

    void a(j j0, Executor executor0) {
        synchronized(this) {
            this.b.c();
            this.a.a(j0, executor0);
            if(this.s) {
                this.k(1);
                executor0.execute(new com.bumptech.glide.load.engine.l.b(this, j0));
            }
            else if(this.u) {
                this.k(1);
                executor0.execute(new a(this, j0));
            }
            else {
                com.bumptech.glide.util.m.b(!this.x, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.h$b
    public void b(q q0) {
        synchronized(this) {
            this.t = q0;
        }
        this.o();
    }

    @Override  // com.bumptech.glide.load.engine.h$b
    public void c(v v0, com.bumptech.glide.load.a a0, boolean z) {
        synchronized(this) {
            this.q = v0;
            this.r = a0;
            this.y = z;
        }
        this.p();
    }

    @Override  // com.bumptech.glide.load.engine.h$b
    public void d(h h0) {
        this.j().execute(h0);
    }

    @Override  // com.bumptech.glide.util.pool.a$f
    @NonNull
    public com.bumptech.glide.util.pool.c e() {
        return this.b;
    }

    @GuardedBy("this")
    void f(j j0) {
        try {
            j0.b(this.t);
        }
        catch(Throwable throwable0) {
            throw new com.bumptech.glide.load.engine.b(throwable0);
        }
    }

    @GuardedBy("this")
    void g(j j0) {
        try {
            j0.c(this.v, this.r, this.y);
        }
        catch(Throwable throwable0) {
            throw new com.bumptech.glide.load.engine.b(throwable0);
        }
    }

    void h() {
        if(this.n()) {
            return;
        }
        this.x = true;
        this.w.a();
        this.f.b(this, this.l);
    }

    void i() {
        p p0;
        synchronized(this) {
            this.b.c();
            com.bumptech.glide.util.m.b(this.n(), "Not yet complete!");
            int v1 = this.k.decrementAndGet();
            com.bumptech.glide.util.m.b(v1 >= 0, "Can\'t decrement below 0");
            if(v1 == 0) {
                p0 = this.v;
                this.r();
            }
            else {
                p0 = null;
            }
        }
        if(p0 != null) {
            p0.e();
        }
    }

    private com.bumptech.glide.load.engine.executor.a j() {
        if(this.n) {
            return this.i;
        }
        return this.o ? this.j : this.h;
    }

    void k(int v) {
        synchronized(this) {
            com.bumptech.glide.util.m.b(this.n(), "Not yet complete!");
            if(this.k.getAndAdd(v) == 0) {
                p p0 = this.v;
                if(p0 != null) {
                    p0.b();
                }
            }
        }
    }

    @VisibleForTesting
    l l(g g0, boolean z, boolean z1, boolean z2, boolean z3) {
        synchronized(this) {
            this.l = g0;
            this.m = z;
            this.n = z1;
            this.o = z2;
            this.p = z3;
        }
        return this;
    }

    boolean m() {
        synchronized(this) {
        }
        return this.x;
    }

    // 去混淆评级： 低(30)
    private boolean n() {
        return this.u || this.s || this.x;
    }

    void o() {
        synchronized(this) {
            this.b.c();
            if(this.x) {
                this.r();
                return;
            }
            if(!this.a.isEmpty()) {
                if(this.u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.u = true;
                g g0 = this.l;
                e l$e0 = this.a.c();
                this.k(l$e0.size() + 1);
                this.f.a(this, g0, null);
                for(Object object0: l$e0) {
                    a l$a0 = new a(this, ((d)object0).a);
                    ((d)object0).b.execute(l$a0);
                }
                this.i();
                return;
            }
        }
        throw new IllegalStateException("Received an exception without any callbacks to notify");
    }

    void p() {
        synchronized(this) {
            this.b.c();
            if(this.x) {
                this.q.recycle();
                this.r();
                return;
            }
            if(!this.a.isEmpty()) {
                if(this.s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.v = this.e.a(this.q, this.m, this.l, this.c);
                this.s = true;
                e l$e0 = this.a.c();
                this.k(l$e0.size() + 1);
                this.f.a(this, this.l, this.v);
                for(Object object0: l$e0) {
                    com.bumptech.glide.load.engine.l.b l$b0 = new com.bumptech.glide.load.engine.l.b(this, ((d)object0).a);
                    ((d)object0).b.execute(l$b0);
                }
                this.i();
                return;
            }
        }
        throw new IllegalStateException("Received a resource without any callbacks to notify");
    }

    boolean q() {
        return this.p;
    }

    private void r() {
        synchronized(this) {
            if(this.l != null) {
                this.a.clear();
                this.l = null;
                this.v = null;
                this.q = null;
                this.u = false;
                this.x = false;
                this.s = false;
                this.y = false;
                this.w.z(false);
                this.w = null;
                this.t = null;
                this.r = null;
                this.d.a(this);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    void s(j j0) {
        synchronized(this) {
            this.b.c();
            this.a.g(j0);
            if(this.a.isEmpty()) {
                this.h();
                if((this.s || this.u) && this.k.get() == 0) {
                    this.r();
                }
            }
        }
    }

    public void t(h h0) {
        synchronized(this) {
            this.w = h0;
            (h0.G() ? this.g : this.j()).execute(h0);
        }
    }
}

