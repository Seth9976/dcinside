package com.facebook.imagepipeline.cache;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.l;
import com.facebook.common.internal.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@n(a.a)
@d
public abstract class com.facebook.imagepipeline.cache.a implements q {
    static enum c {
        LFU,
        MFU;

    }

    @VisibleForTesting
    class com.facebook.imagepipeline.cache.a.d {
        private final ArrayList a;
        private final ArrayList b;
        private final int c;
        final com.facebook.imagepipeline.cache.a d;

        public com.facebook.imagepipeline.cache.a.d(int v) {
            this.a = new ArrayList(v);
            this.b = new ArrayList(v);
            this.c = v;
        }

        public void a(Object object0, Integer integer0) {
            if(this.a.size() == this.c) {
                this.a.remove(0);
                this.b.remove(0);
            }
            this.a.add(object0);
            this.b.add(integer0);
        }

        public boolean b(Object object0) {
            return this.a.contains(object0);
        }

        @h
        public Integer c(Object object0) {
            int v = this.a.indexOf(object0);
            return v >= 0 ? ((Integer)this.b.get(v)) : null;
        }

        public void d(Object object0) {
            int v = this.a.indexOf(object0);
            if(v < 0) {
                return;
            }
            Integer integer0 = (int)(((int)(((Integer)this.b.get(v)))) + 1);
            int v1 = this.c;
            if(v == v1 - 1) {
                this.b.set(v1 - 1, integer0);
                return;
            }
            this.a.remove(v);
            this.b.remove(v);
            this.a.add(object0);
            this.b.add(integer0);
        }

        public int e() {
            return this.a.size();
        }
    }

    @VisibleForTesting
    @p3.a("this")
    final p a;
    @VisibleForTesting
    @p3.a("this")
    final p b;
    @VisibleForTesting
    @p3.a("this")
    final p c;
    private final H d;
    private final com.facebook.imagepipeline.cache.B.a e;
    private final com.facebook.common.internal.q f;
    @VisibleForTesting
    @p3.a("this")
    int g;
    private final int h;
    @VisibleForTesting
    @p3.a("this")
    final int i;
    @VisibleForTesting
    @p3.a("this")
    final com.facebook.imagepipeline.cache.a.d j;
    @VisibleForTesting
    @p3.a("this")
    final ArrayList k;
    @VisibleForTesting
    @p3.a("this")
    final int l;
    @p3.a("this")
    protected C m;
    @p3.a("this")
    private long n;
    private static final String o = "AbstractArcCountingMemoryCache";
    static final int p = 500;
    static final int q = 1000;
    @VisibleForTesting
    static final int r = 100;
    static final int s = 900;
    static final int t = 10;

    public com.facebook.imagepipeline.cache.a(com.facebook.common.internal.q q0, com.facebook.imagepipeline.cache.B.a b$a0, H h0, int v, int v1, int v2, int v3) {
        x0.a.i("AbstractArcCountingMemoryCache", "Create Adaptive Replacement Cache");
        this.d = h0;
        this.a = new p(this.T(h0));
        this.b = new p(this.T(h0));
        this.c = new p(this.T(h0));
        this.e = b$a0;
        this.f = q0;
        this.m = (C)com.facebook.common.internal.n.j(((C)q0.get()), "mMemoryCacheParamsSupplier returned null");
        this.n = SystemClock.uptimeMillis();
        this.h = v1;
        this.l = v2;
        this.j = new com.facebook.imagepipeline.cache.a.d(this, v2);
        this.k = new ArrayList(v2);
        if(v3 < 100 || v3 > 900) {
            this.g = 500;
            this.A();
        }
        else {
            this.g = v3;
        }
        if(v > 0 && v < 1000) {
            this.i = v;
            return;
        }
        this.i = 10;
        this.y();
    }

    protected abstract void A();

    private void B(com.facebook.imagepipeline.cache.q.a q$a0) {
        synchronized(this) {
            com.facebook.common.internal.n.i(q$a0);
            com.facebook.common.internal.n.o(!q$a0.d);
            q$a0.d = true;
        }
    }

    private void C(@h ArrayList arrayList0) {
        synchronized(this) {
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    this.B(((com.facebook.imagepipeline.cache.q.a)object0));
                }
            }
        }
    }

    private void D(@h ArrayList arrayList0, @h ArrayList arrayList1) {
        synchronized(this) {
            this.C(arrayList0);
            this.C(arrayList1);
        }
    }

    private boolean E(com.facebook.imagepipeline.cache.q.a q$a0) {
        synchronized(this) {
            if(!q$a0.d && q$a0.c == 0) {
                if(q$a0.f > this.h) {
                    this.b.k(q$a0.a, q$a0);
                }
                else {
                    this.a.k(q$a0.a, q$a0);
                }
                return true;
            }
            return false;
        }
    }

    private void F(@h ArrayList arrayList0) {
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                com.facebook.common.references.a.j(this.P(((com.facebook.imagepipeline.cache.q.a)object0)));
            }
        }
    }

    private void G(@h ArrayList arrayList0, @h ArrayList arrayList1) {
        this.F(arrayList0);
        this.F(arrayList1);
    }

    private void H(@h ArrayList arrayList0, @h ArrayList arrayList1) {
        this.L(arrayList0);
        this.L(arrayList1);
    }

    private static void I(@h com.facebook.imagepipeline.cache.q.a q$a0) {
        if(q$a0 != null) {
            b q$b0 = q$a0.e;
            if(q$b0 != null) {
                q$b0.a(q$a0.a, true);
            }
        }
    }

    private static void J(@h com.facebook.imagepipeline.cache.q.a q$a0) {
        if(q$a0 != null) {
            b q$b0 = q$a0.e;
            if(q$b0 != null) {
                q$b0.a(q$a0.a, false);
            }
        }
    }

    private void K(@h com.facebook.imagepipeline.cache.q.a q$a0, @h com.facebook.imagepipeline.cache.q.a q$a1) {
        com.facebook.imagepipeline.cache.a.J(q$a0);
        com.facebook.imagepipeline.cache.a.J(q$a1);
    }

    private void L(@h ArrayList arrayList0) {
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                com.facebook.imagepipeline.cache.a.J(((com.facebook.imagepipeline.cache.q.a)object0));
            }
        }
    }

    private void M(Object object0) {
        synchronized(this) {
            if(this.j.b(object0)) {
                int v1 = this.g;
                int v2 = this.i;
                if(v1 + v2 <= 900) {
                    this.g = v1 + v2;
                }
                this.j.d(object0);
            }
            else if(this.g - this.i >= 100 && this.k.contains(object0)) {
                this.g -= this.i;
            }
        }
    }

    private void N() {
        synchronized(this) {
            if(this.n + this.m.f > SystemClock.uptimeMillis()) {
                return;
            }
            this.n = SystemClock.uptimeMillis();
            this.m = (C)com.facebook.common.internal.n.j(((C)this.f.get()), "mMemoryCacheParamsSupplier returned null");
        }
    }

    private com.facebook.common.references.a O(com.facebook.imagepipeline.cache.q.a q$a0) {
        class com.facebook.imagepipeline.cache.a.b implements com.facebook.common.references.h {
            final com.facebook.imagepipeline.cache.q.a a;
            final com.facebook.imagepipeline.cache.a b;

            com.facebook.imagepipeline.cache.a.b(com.facebook.imagepipeline.cache.q.a q$a0) {
                this.a = q$a0;
                super();
            }

            @Override  // com.facebook.common.references.h
            public void a(Object object0) {
                com.facebook.imagepipeline.cache.a.this.Q(this.a);
            }
        }

        synchronized(this) {
            this.x(q$a0);
            return com.facebook.common.references.a.w(q$a0.b.n(), new com.facebook.imagepipeline.cache.a.b(this, q$a0));
        }
    }

    @h
    private com.facebook.common.references.a P(com.facebook.imagepipeline.cache.q.a q$a0) {
        synchronized(this) {
            com.facebook.common.internal.n.i(q$a0);
            return !q$a0.d || q$a0.c != 0 ? null : q$a0.b;
        }
    }

    private void Q(com.facebook.imagepipeline.cache.q.a q$a0) {
        com.facebook.common.references.a a0;
        com.facebook.common.internal.n.i(q$a0);
        synchronized(this) {
            this.u(q$a0);
            boolean z = this.E(q$a0);
            a0 = this.P(q$a0);
        }
        com.facebook.common.references.a.j(a0);
        if(!z) {
            q$a0 = null;
        }
        com.facebook.imagepipeline.cache.a.I(q$a0);
        this.N();
        this.l();
    }

    public String R() {
        return l.f("CountingMemoryCache").d("cached_entries_count:", this.c.d()).d("exclusive_entries_count", this.m()).toString();
    }

    @h
    private ArrayList S(int v, int v1, p p0, c a$c0) {
        synchronized(this) {
            int v3 = Math.max(v, 0);
            int v4 = Math.max(v1, 0);
            if(p0.d() <= v3 && p0.h() <= v4) {
                return null;
            }
            ArrayList arrayList0 = new ArrayList();
            while(p0.d() > v3 || p0.h() > v4) {
                Object object0 = com.facebook.common.internal.n.i(p0.e());
                this.s(object0, ((com.facebook.imagepipeline.cache.q.a)com.facebook.common.internal.n.i(((com.facebook.imagepipeline.cache.q.a)p0.c(object0)))).f, a$c0);
                p0.l(object0);
                arrayList0.add(((com.facebook.imagepipeline.cache.q.a)this.c.l(object0)));
            }
            return arrayList0;
        }
    }

    private H T(H h0) {
        class com.facebook.imagepipeline.cache.a.a implements H {
            final H a;
            final com.facebook.imagepipeline.cache.a b;

            com.facebook.imagepipeline.cache.a.a(H h0) {
                this.a = h0;
                super();
            }

            @Override  // com.facebook.imagepipeline.cache.H
            public int a(Object object0) {
                return this.b(((com.facebook.imagepipeline.cache.q.a)object0));
            }

            public int b(com.facebook.imagepipeline.cache.q.a q$a0) {
                Object object0 = q$a0.b.n();
                return this.a.a(object0);
            }
        }

        return new com.facebook.imagepipeline.cache.a.a(this, h0);
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public void b(Object object0) {
        com.facebook.common.internal.n.i(object0);
        synchronized(this) {
            com.facebook.imagepipeline.cache.q.a q$a0 = (com.facebook.imagepipeline.cache.q.a)this.a.l(object0);
            if(q$a0 == null) {
                q$a0 = (com.facebook.imagepipeline.cache.q.a)this.b.l(object0);
            }
            if(q$a0 != null) {
                this.w(q$a0);
                this.E(q$a0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.cache.B
    @h
    public com.facebook.common.references.a c(Object object0, com.facebook.common.references.a a0) {
        return this.h(object0, a0, null);
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public void clear() {
        ArrayList arrayList2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        synchronized(this) {
            arrayList0 = this.a.a();
            arrayList1 = this.b.a();
            arrayList2 = this.c.a();
            this.C(arrayList2);
        }
        this.F(arrayList2);
        this.H(arrayList0, arrayList1);
        this.N();
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public boolean contains(Object object0) {
        synchronized(this) {
            return this.c.b(object0);
        }
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public p d() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public int e() {
        synchronized(this) {
            int v1 = this.a.h();
            int v2 = this.b.h();
            return v1 + v2;
        }
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public C f() {
        return this.m;
    }

    @Override  // com.facebook.imagepipeline.cache.B
    @h
    public com.facebook.common.references.a get(Object object0) {
        com.facebook.imagepipeline.cache.q.a q$a1;
        com.facebook.imagepipeline.cache.q.a q$a0;
        com.facebook.common.references.a a0;
        com.facebook.common.internal.n.i(object0);
        synchronized(this) {
            q$a0 = (com.facebook.imagepipeline.cache.q.a)this.a.l(object0);
            q$a1 = (com.facebook.imagepipeline.cache.q.a)this.b.l(object0);
            com.facebook.imagepipeline.cache.q.a q$a2 = (com.facebook.imagepipeline.cache.q.a)this.c.c(object0);
            if(q$a2 == null) {
                this.M(object0);
                a0 = null;
            }
            else {
                a0 = this.O(q$a2);
            }
        }
        this.K(q$a0, q$a1);
        this.N();
        this.l();
        return a0;
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public int getCount() {
        synchronized(this) {
            return this.c.d();
        }
    }

    @Override  // com.facebook.imagepipeline.cache.q
    @h
    public com.facebook.common.references.a h(Object object0, com.facebook.common.references.a a0, @h b q$b0) {
        com.facebook.common.references.a a1;
        com.facebook.imagepipeline.cache.q.a q$a1;
        com.facebook.imagepipeline.cache.q.a q$a0;
        com.facebook.common.references.a a2;
        com.facebook.common.internal.n.i(object0);
        com.facebook.common.internal.n.i(a0);
        this.N();
        synchronized(this) {
            q$a0 = (com.facebook.imagepipeline.cache.q.a)this.a.l(object0);
            q$a1 = (com.facebook.imagepipeline.cache.q.a)this.b.l(object0);
            int v1 = 0;
            com.facebook.common.internal.n.o(q$a0 == null || q$a1 == null);
            com.facebook.imagepipeline.cache.q.a q$a2 = (com.facebook.imagepipeline.cache.q.a)this.c.l(object0);
            a1 = null;
            if(q$a2 == null) {
                a2 = null;
            }
            else {
                this.B(q$a2);
                a2 = this.P(q$a2);
            }
            if(this.t(a0.n())) {
                com.facebook.imagepipeline.cache.q.a q$a3 = com.facebook.imagepipeline.cache.q.a.b(object0, a0, q$b0);
                Integer integer0 = this.j.c(object0);
                if(integer0 != null) {
                    v1 = (int)integer0;
                }
                q$a3.f = v1;
                this.c.k(object0, q$a3);
                a1 = this.O(q$a3);
            }
        }
        com.facebook.common.references.a.j(a2);
        this.K(q$a0, q$a1);
        this.l();
        return a1;
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public int i(o o0) {
        ArrayList arrayList2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        synchronized(this) {
            arrayList0 = this.a.m(o0);
            arrayList1 = this.b.m(o0);
            arrayList2 = this.c.m(o0);
            this.C(arrayList2);
        }
        this.F(arrayList2);
        this.H(arrayList0, arrayList1);
        this.N();
        this.l();
        return arrayList2.size();
    }

    @Override  // com.facebook.imagepipeline.cache.q
    @h
    public com.facebook.common.references.a j(Object object0) {
        com.facebook.imagepipeline.cache.q.a q$a0;
        com.facebook.common.references.a a0;
        com.facebook.common.internal.n.i(object0);
        synchronized(this) {
            q$a0 = (com.facebook.imagepipeline.cache.q.a)this.a.l(object0);
            if(q$a0 == null) {
                q$a0 = (com.facebook.imagepipeline.cache.q.a)this.b.l(object0);
            }
            boolean z = false;
            if(q$a0 == null) {
                a0 = null;
            }
            else {
                com.facebook.imagepipeline.cache.q.a q$a1 = (com.facebook.imagepipeline.cache.q.a)this.c.l(object0);
                com.facebook.common.internal.n.i(q$a1);
                if(q$a1.c == 0) {
                    z = true;
                }
                com.facebook.common.internal.n.o(z);
                a0 = q$a1.b;
                z = true;
            }
        }
        if(z) {
            com.facebook.imagepipeline.cache.a.J(q$a0);
        }
        return a0;
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public int k() {
        synchronized(this) {
            int v1 = this.c.h();
            int v2 = this.a.h();
            int v3 = this.b.h();
            return v1 - v2 - v3;
        }
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public void l() {
        ArrayList arrayList1;
        ArrayList arrayList0;
        synchronized(this) {
            int v1 = Math.min(this.m.d, this.m.b - this.v());
            int v2 = Math.min(this.m.c, this.m.a - this.k());
            int v3 = (int)(((long)v1) * ((long)this.g) / 1000L);
            int v4 = (int)(((long)v2) * ((long)this.g) / 1000L);
            arrayList0 = this.S(v3, v4, this.a, c.a);
            arrayList1 = this.S(v1 - v3, v2 - v4, this.b, c.b);
            this.D(arrayList0, arrayList1);
        }
        this.G(arrayList0, arrayList1);
        this.H(arrayList0, arrayList1);
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public int m() {
        synchronized(this) {
            int v1 = this.a.d();
            int v2 = this.b.d();
            return v1 + v2;
        }
    }

    @Override  // com.facebook.imagepipeline.cache.B
    @h
    public Object n(Object object0) {
        com.facebook.imagepipeline.cache.q.a q$a0 = (com.facebook.imagepipeline.cache.q.a)this.c.c(object0);
        return q$a0 == null ? null : q$a0.b.n();
    }

    @Override  // com.facebook.imagepipeline.cache.q
    public Map o() {
        return Collections.emptyMap();
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public boolean p(o o0) {
        synchronized(this) {
            boolean z = this.c.g(o0).isEmpty();
            return !z;
        }
    }

    @Override  // com.facebook.common.memory.d
    public void q(com.facebook.common.memory.c c0) {
        ArrayList arrayList1;
        ArrayList arrayList0;
        double f = this.e.a(c0);
        synchronized(this) {
            int v1 = 0;
            int v2 = Math.max(0, ((int)(((double)this.c.h()) * (1.0 - f))) - this.k());
            int v3 = this.b.h();
            int v4 = Math.max(0, v2 - v3);
            if(v2 > v3) {
                v2 = v3;
                v1 = v4;
            }
            arrayList0 = this.S(0x7FFFFFFF, v1, this.a, c.a);
            arrayList1 = this.S(0x7FFFFFFF, v2, this.b, c.b);
            this.D(arrayList0, arrayList1);
        }
        this.G(arrayList0, arrayList1);
        this.H(arrayList0, arrayList1);
        this.N();
        this.l();
    }

    private void s(Object object0, int v, c a$c0) {
        synchronized(this) {
            if(a$c0 == c.a) {
                this.j.a(object0, v);
            }
            else {
                if(this.k.size() == this.l) {
                    this.k.remove(0);
                }
                this.k.add(object0);
            }
        }
    }

    private boolean t(Object object0) {
        synchronized(this) {
            boolean z = true;
            int v1 = this.d.a(object0);
            if(v1 > this.m.e || this.v() > this.m.b - 1 || this.k() > this.m.a - v1) {
                z = false;
            }
            return z;
        }
    }

    private void u(com.facebook.imagepipeline.cache.q.a q$a0) {
        synchronized(this) {
            com.facebook.common.internal.n.i(q$a0);
            com.facebook.common.internal.n.o(q$a0.c > 0);
            --q$a0.c;
        }
    }

    public int v() {
        synchronized(this) {
            int v1 = this.c.d();
            int v2 = this.a.d();
            int v3 = this.b.d();
            return v1 - v2 - v3;
        }
    }

    private void w(com.facebook.imagepipeline.cache.q.a q$a0) {
        synchronized(this) {
            com.facebook.common.internal.n.i(q$a0);
            com.facebook.common.internal.n.o(!q$a0.d);
            ++q$a0.f;
        }
    }

    private void x(com.facebook.imagepipeline.cache.q.a q$a0) {
        synchronized(this) {
            com.facebook.common.internal.n.i(q$a0);
            com.facebook.common.internal.n.o(!q$a0.d);
            ++q$a0.c;
            this.w(q$a0);
        }
    }

    protected abstract void y();

    @Override  // com.facebook.imagepipeline.cache.B
    public int z() {
        synchronized(this) {
            return this.c.h();
        }
    }
}

