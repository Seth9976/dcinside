package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.anchor.c;
import com.beloo.widget.chipslayoutmanager.gravity.n;
import com.beloo.widget.chipslayoutmanager.layouter.C;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.i;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.r;
import com.beloo.widget.chipslayoutmanager.layouter.e;
import com.beloo.widget.chipslayoutmanager.layouter.g;
import com.beloo.widget.chipslayoutmanager.layouter.h;
import com.beloo.widget.chipslayoutmanager.layouter.m;
import com.beloo.widget.chipslayoutmanager.layouter.t;
import com.beloo.widget.chipslayoutmanager.layouter.v;
import com.beloo.widget.chipslayoutmanager.util.log.d;
import java.util.Locale;

public class ChipsLayoutManager extends LayoutManager implements f, k, a {
    static class com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.a {
    }

    public class b {
        private Integer a;
        final ChipsLayoutManager b;

        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.a chipsLayoutManager$a0) {
        }

        public ChipsLayoutManager a() {
            if(ChipsLayoutManager.this.w == null) {
                Integer integer0 = this.a;
                if(integer0 == null) {
                    com.beloo.widget.chipslayoutmanager.gravity.b b0 = new com.beloo.widget.chipslayoutmanager.gravity.b();
                    ChipsLayoutManager.this.w = b0;
                }
                else {
                    com.beloo.widget.chipslayoutmanager.gravity.k k0 = new com.beloo.widget.chipslayoutmanager.gravity.k(((int)integer0));
                    ChipsLayoutManager.this.w = k0;
                }
            }
            ChipsLayoutManager chipsLayoutManager0 = ChipsLayoutManager.this;
            C c0 = chipsLayoutManager0.A == 1 ? new C(ChipsLayoutManager.this) : new e(ChipsLayoutManager.this);
            chipsLayoutManager0.M = c0;
            g g0 = ChipsLayoutManager.this.M.h();
            ChipsLayoutManager.this.s = g0;
            c c1 = ChipsLayoutManager.this.M.m();
            ChipsLayoutManager.this.O = c1;
            j j0 = ChipsLayoutManager.this.M.f();
            ChipsLayoutManager.this.P = j0;
            AnchorViewState anchorViewState0 = ChipsLayoutManager.this.O.a();
            ChipsLayoutManager.this.L = anchorViewState0;
            com.beloo.widget.chipslayoutmanager.c c2 = new com.beloo.widget.chipslayoutmanager.c(ChipsLayoutManager.this.s, ChipsLayoutManager.this.u, ChipsLayoutManager.this.M);
            ChipsLayoutManager.this.t = c2;
            return ChipsLayoutManager.this;
        }

        public b b(int v) {
            this.a = v;
            return this;
        }

        public b c(@NonNull n n0) {
            com.beloo.widget.chipslayoutmanager.util.a.d(n0, "gravity resolver couldn\'t be null");
            ChipsLayoutManager.this.w = n0;
            return this;
        }

        public b d(@IntRange(from = 1L) int v) {
            if(v < 1) {
                throw new IllegalArgumentException("maxViewsInRow should be positive, but is = " + v);
            }
            ChipsLayoutManager.this.y = v;
            return this;
        }

        public b e(@Orientation int v) {
            if(v != 1 && v != 2) {
                return this;
            }
            ChipsLayoutManager.this.A = v;
            return this;
        }

        public b f(@NonNull i i0) {
            com.beloo.widget.chipslayoutmanager.util.a.d(i0, "breaker couldn\'t be null");
            ChipsLayoutManager.this.z = i0;
            return this;
        }

        public com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.c g(int v) {
            ChipsLayoutManager.this.B = v;
            return (com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.c)this;
        }

        public b h(boolean z) {
            ChipsLayoutManager.this.b(z);
            return this;
        }
    }

    public class com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.c extends b {
        final ChipsLayoutManager c;

        public com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.c() {
            super(null);
        }

        public b i(boolean z) {
            ChipsLayoutManager.this.C = z;
            return this;
        }
    }

    @Orientation
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private com.beloo.widget.chipslayoutmanager.cache.a E;
    @Nullable
    private Integer F;
    private SparseArray G;
    private ParcelableContainer H;
    private com.beloo.widget.chipslayoutmanager.util.log.c I;
    private boolean J;
    private int K;
    private AnchorViewState L;
    private m M;
    private com.beloo.widget.chipslayoutmanager.layouter.k N;
    private c O;
    private j P;
    private com.beloo.widget.chipslayoutmanager.layouter.placer.g Q;
    private o.b R;
    private boolean S;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;
    private static final String a0 = "ChipsLayoutManager";
    private static final int b0 = 10;
    private static final int c0 = 5;
    private static final float d0 = 2.0f;
    private g s;
    private com.beloo.widget.chipslayoutmanager.g t;
    private com.beloo.widget.chipslayoutmanager.b u;
    private SparseArray v;
    private n w;
    private boolean x;
    private Integer y;
    private i z;

    static {
    }

    @VisibleForTesting
    ChipsLayoutManager(Context context0) {
        this.u = new com.beloo.widget.chipslayoutmanager.b(this);
        this.v = new SparseArray();
        this.x = true;
        this.y = null;
        this.z = new com.beloo.widget.chipslayoutmanager.layouter.breaker.e();
        this.A = 1;
        this.B = 1;
        this.D = false;
        this.F = null;
        this.G = new SparseArray();
        this.H = new ParcelableContainer();
        this.J = false;
        this.Q = new com.beloo.widget.chipslayoutmanager.layouter.placer.g(this);
        this.R = new o.a();
        this.K = context0.getResources().getConfiguration().orientation;
        this.I = new com.beloo.widget.chipslayoutmanager.util.log.g().a(this.G);
        this.E = new com.beloo.widget.chipslayoutmanager.cache.b(this).a();
        this.N = new v(this);
        this.m2(true);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void B1(RecyclerView recyclerView0, int v, int v1) {
        d.b("onItemsAdded", "starts from = " + v + ", item count = " + v1, 1);
        super.B1(recyclerView0, v, v1);
        this.k3(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void C1(RecyclerView recyclerView0) {
        d.b("onItemsChanged", "", 1);
        super.C1(recyclerView0);
        this.E.i();
        this.k3(0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean C2() {
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void D1(RecyclerView recyclerView0, int v, int v1, int v2) {
        d.b("onItemsMoved", String.format(Locale.US, "from = %d, to = %d, itemCount = %d", v, v1, v2), 1);
        super.D1(recyclerView0, v, v1, v2);
        this.k3(Math.min(v, v1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void E1(RecyclerView recyclerView0, int v, int v1) {
        d.b("onItemsRemoved", "starts from = " + v + ", item count = " + v1, 1);
        super.E1(recyclerView0, v, v1);
        this.k3(v);
        this.N.b(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void F1(RecyclerView recyclerView0, int v, int v1) {
        d.b("onItemsUpdated", "starts from = " + v + ", item count = " + v1, 1);
        super.F1(recyclerView0, v, v1);
        this.k3(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean G() {
        return this.P.k();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void G1(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.F1(recyclerView0, v, v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean H() {
        return this.P.i();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.R.a(recyclerView$Recycler0, recyclerView$State0);
        d.a("ChipsLayoutManager", "onLayoutChildren. State =" + recyclerView$State0);
        if(this.getItemCount() == 0) {
            this.S(recyclerView$Recycler0);
            return;
        }
        d.e("onLayoutChildren", "isPreLayout = " + recyclerView$State0.j(), 4);
        if(this.l() != this.J) {
            this.J = this.l();
            this.S(recyclerView$Recycler0);
        }
        this.W2(recyclerView$Recycler0);
        if(recyclerView$State0.j()) {
            int v = this.t.a(recyclerView$Recycler0);
            d.b("LayoutManager", "height =" + this.x0(), 4);
            d.b("onDeletingHeightCalc", "additional height  = " + v, 4);
            AnchorViewState anchorViewState0 = this.O.b();
            this.L = anchorViewState0;
            this.O.c(anchorViewState0);
            d.h("ChipsLayoutManager", "anchor state in pre-layout = " + this.L);
            this.S(recyclerView$Recycler0);
            com.beloo.widget.chipslayoutmanager.layouter.criteria.a a0 = this.M.i();
            a0.d(5);
            a0.c(v);
            t t0 = this.M.l(a0, this.Q.b());
            this.I.d(this.L);
            this.X2(recyclerView$Recycler0, t0.j(this.L), t0.k(this.L));
            this.S = true;
        }
        else {
            this.S(recyclerView$Recycler0);
            this.E.l(((int)this.L.d()));
            if(this.F != null && ((int)this.L.d()) <= ((int)this.F)) {
                this.F = null;
            }
            com.beloo.widget.chipslayoutmanager.layouter.criteria.a a1 = this.M.i();
            a1.d(5);
            t t1 = this.M.l(a1, this.Q.b());
            h h0 = t1.j(this.L);
            h h1 = t1.k(this.L);
            this.X2(recyclerView$Recycler0, h0, h1);
            if(this.P.b(recyclerView$Recycler0, null)) {
                d.a("ChipsLayoutManager", "normalize gaps");
                this.L = this.O.b();
                this.n3();
            }
            if(this.S) {
                this.i3(recyclerView$Recycler0, h0, h1);
            }
            this.S = false;
        }
        this.t.reset();
        if(!recyclerView$State0.i()) {
            this.N.a();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int M(State recyclerView$State0) {
        return this.P.j(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void M1(Parcelable parcelable0) {
        this.H = (ParcelableContainer)parcelable0;
        this.L = ((ParcelableContainer)parcelable0).a();
        if(this.K != this.H.d()) {
            Integer integer0 = this.L.d();
            integer0.intValue();
            AnchorViewState anchorViewState0 = this.O.a();
            this.L = anchorViewState0;
            anchorViewState0.h(integer0);
        }
        this.E.d(this.H.e(this.K));
        this.F = this.H.c(this.K);
        d.a("ChipsLayoutManager", "RESTORE. last cache position before cleanup = " + this.E.f());
        Integer integer1 = this.F;
        if(integer1 != null) {
            this.E.l(((int)integer1));
        }
        this.E.l(((int)this.L.d()));
        d.a("ChipsLayoutManager", "RESTORE. anchor position =" + this.L.d());
        d.a("ChipsLayoutManager", "RESTORE. layoutOrientation = " + this.K + " normalizationPos = " + this.F);
        d.a("ChipsLayoutManager", "RESTORE. last cache position = " + this.E.f());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int N(State recyclerView$State0) {
        return this.P.e(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public Parcelable N1() {
        this.H.f(this.L);
        this.H.i(this.K, this.E.a());
        this.H.h(this.K);
        d.a("ChipsLayoutManager", "STORE. last cache position =" + this.E.f());
        Integer integer0 = this.F == null ? this.E.f() : this.F;
        d.a("ChipsLayoutManager", "STORE. layoutOrientation = " + this.K + " normalizationPos = " + integer0);
        this.H.g(this.K, integer0);
        return this.H;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int O(State recyclerView$State0) {
        return this.P.l(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int P(State recyclerView$State0) {
        return this.P.h(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int Q(State recyclerView$State0) {
        return this.P.c(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int R(State recyclerView$State0) {
        return this.P.d(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void S(Recycler recyclerView$Recycler0) {
        super.S(recyclerView$Recycler0);
        this.v.clear();
    }

    private void V2() {
        this.v.clear();
        for(Object object0: this.u) {
            int v = this.K0(((View)object0));
            this.v.put(v, ((View)object0));
        }
    }

    private void W2(Recycler recyclerView$Recycler0) {
        recyclerView$Recycler0.M(((int)(((float)(this.y == null ? 10 : ((int)this.y))) * 2.0f)));
    }

    private void X2(Recycler recyclerView$Recycler0, h h0, h h1) {
        int v = (int)this.L.d();
        this.Y2();
        for(int v2 = 0; v2 < this.G.size(); ++v2) {
            this.V(((View)this.G.valueAt(v2)));
        }
        this.I.e(v - 1);
        if(this.L.a() != null) {
            this.Z2(recyclerView$Recycler0, h0, v - 1);
        }
        this.I.e(v);
        this.Z2(recyclerView$Recycler0, h1, v);
        this.I.b();
        for(int v1 = 0; v1 < this.G.size(); ++v1) {
            this.Y1(((View)this.G.valueAt(v1)), recyclerView$Recycler0);
            this.I.a(v1);
        }
        this.s.j();
        this.V2();
        this.G.clear();
        this.I.c();
    }

    private void Y2() {
        int v = this.j0();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.i0(v1);
            int v2 = this.K0(view0);
            this.G.put(v2, view0);
        }
    }

    private void Z2(Recycler recyclerView$Recycler0, h h0, int v) {
        View view1;
        if(v < 0) {
            return;
        }
        com.beloo.widget.chipslayoutmanager.layouter.b b0 = h0.y();
        b0.a(v);
        while(b0.hasNext()) {
            Object object0 = b0.next();
            int v1 = (int)(((Integer)object0));
            View view0 = (View)this.G.get(v1);
            if(view0 == null) {
                try {
                    view1 = recyclerView$Recycler0.p(v1);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    break;
                }
                this.I.h();
                if(h0.n(view1)) {
                    continue;
                }
                recyclerView$Recycler0.H(view1);
                this.I.f();
                break;
            }
            if(!h0.B(view0)) {
                break;
            }
            this.G.remove(v1);
        }
        this.I.g();
        h0.l();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f
    public boolean a() {
        return this.x;
    }

    @NonNull
    @RestrictTo({Scope.b})
    AnchorViewState a3() {
        return this.L;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f
    public void b(boolean z) {
        this.x = z;
    }

    @RestrictTo({Scope.b})
    public g b3() {
        return this.s;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f, com.beloo.widget.chipslayoutmanager.k
    @Orientation
    public int c() {
        return this.A;
    }

    public n c3() {
        return this.w;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.m$a
    public void d(j j0, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.m3();
        this.L = this.O.b();
        com.beloo.widget.chipslayoutmanager.layouter.criteria.a a0 = this.M.i();
        a0.d(1);
        t t0 = this.M.l(a0, this.Q.b());
        this.X2(recyclerView$Recycler0, t0.j(this.L), t0.k(this.L));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public LayoutParams d0() {
        return new LayoutParams(-2, -2);
    }

    @Nullable
    View d3(int v) {
        return (View)this.v.get(v);
    }

    public int e3() {
        int v = 0;
        for(Object object0: this.u) {
            if(this.s.k(((View)object0))) {
                ++v;
            }
        }
        return v;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.h
    public int f() {
        for(Object object0: this.u) {
            View view0 = (View)object0;
            Rect rect0 = this.s.i(view0);
            if(this.s.h(rect0) && this.s.s(rect0)) {
                return this.K0(view0);
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @RestrictTo({Scope.b})
    public com.beloo.widget.chipslayoutmanager.cache.a f3() {
        return this.E;
    }

    public com.beloo.widget.chipslayoutmanager.d g3() {
        return new com.beloo.widget.chipslayoutmanager.d(this, this.M, this);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int getItemCount() {
        return super.getItemCount() + this.t.b();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.i
    public boolean h() {
        return this.D;
    }

    @RestrictTo({Scope.b})
    public boolean h3() {
        return this.C;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.h
    public int i() {
        return this.j0() == 0 ? -1 : ((int)this.s.D());
    }

    private void i3(Recycler recyclerView$Recycler0, @NonNull h h0, h h1) {
        r r0 = new r();
        t t0 = this.M.l(r0, this.Q.a());
        com.beloo.widget.chipslayoutmanager.c.a c$a0 = this.t.c(recyclerView$Recycler0);
        if(c$a0.e() > 0) {
            d.a("disappearing views", "count = " + c$a0.e());
            d.a("fill disappearing views", "");
            h h2 = t0.c(h1);
            for(int v1 = 0; v1 < c$a0.d().size(); ++v1) {
                h2.n(recyclerView$Recycler0.p(c$a0.d().keyAt(v1)));
            }
            h2.l();
            h h3 = t0.b(h0);
            for(int v = 0; v < c$a0.c().size(); ++v) {
                h3.n(recyclerView$Recycler0.p(c$a0.c().keyAt(v)));
            }
            h3.l();
        }
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f
    public void j(@IntRange(from = 1L) Integer integer0) {
        if(((int)integer0) < 1) {
            throw new IllegalArgumentException("maxViewsInRow should be positive, but is = " + integer0);
        }
        this.y = integer0;
        this.l3();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int j2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.P.g(v, recyclerView$Recycler0, recyclerView$State0);
    }

    public static b j3(Context context0) {
        if(context0 == null) {
            throw new IllegalArgumentException("you have passed null context to builder");
        }
        return new com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.c(new ChipsLayoutManager(context0));
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f
    public Integer k() {
        return this.y;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void k2(int v) {
        if(v < this.getItemCount() && v >= 0) {
            Integer integer0 = this.E.f();
            this.F = this.F == null ? integer0 : this.F;
            if(integer0 != null && v < ((int)integer0)) {
                v = this.E.e(v);
            }
            AnchorViewState anchorViewState0 = this.O.a();
            this.L = anchorViewState0;
            anchorViewState0.h(v);
            super.g2();
            return;
        }
        d.c("span layout manager", "Cannot scroll to " + v + ", item count " + this.getItemCount());
    }

    private void k3(int v) {
        d.a("ChipsLayoutManager", "cache purged from position " + v);
        this.E.l(v);
        int v1 = this.E.e(v);
        Integer integer0 = this.F;
        if(integer0 != null) {
            v1 = Math.min(((int)integer0), v1);
        }
        this.F = v1;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.k
    public boolean l() {
        return this.A0() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.b})
    public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.P.f(v, recyclerView$Recycler0, recyclerView$State0);
    }

    private void l3() {
        this.F = 0;
        this.E.i();
        this.n3();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.h
    public int m() {
        for(int v = this.j0() - 1; v >= 0; --v) {
            View view0 = this.i0(v);
            Rect rect0 = this.s.i(view0);
            if(this.s.h(rect0) && this.s.p(view0)) {
                return this.K0(view0);
            }
        }
        return -1;
    }

    private void m3() {
        if(this.F != null && this.j0() > 0) {
            int v = this.K0(this.i0(0));
            if(v < ((int)this.F) || ((int)this.F) == 0 && ((int)this.F) == v) {
                d.a("normalization", "position = " + this.F + " top view position = " + v);
                d.a("ChipsLayoutManager", "cache purged from position " + v);
                this.E.l(v);
                this.F = null;
                this.n3();
            }
        }
    }

    private void n3() {
        com.beloo.widget.chipslayoutmanager.util.b.a(this);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void o1(Adapter recyclerView$Adapter0, Adapter recyclerView$Adapter1) {
        if(recyclerView$Adapter0 != null && this.N.d()) {
            try {
                this.N.c(false);
                recyclerView$Adapter0.unregisterAdapterDataObserver(((AdapterDataObserver)this.N));
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(recyclerView$Adapter1 != null) {
            this.N.c(true);
            recyclerView$Adapter1.registerAdapterDataObserver(((AdapterDataObserver)this.N));
        }
        this.V1();
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    void o3(o.b b0) {
        this.R = b0;
    }

    public p p3() {
        return new p(this, this.M, this);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.i
    public void q(boolean z) {
        this.D = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void q2(int v, int v1) {
        this.N.measure(v, v1);
        d.d("ChipsLayoutManager", "measured dimension = " + v1);
        super.q2(this.N.getMeasuredWidth(), this.N.getMeasuredHeight());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.h
    public int s() {
        return this.j0() == 0 ? -1 : ((int)this.s.v());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f
    public int t() {
        return this.B;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.f
    public i u() {
        return this.z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        if(v < this.getItemCount() && v >= 0) {
            SmoothScroller recyclerView$SmoothScroller0 = this.P.a(recyclerView0.getContext(), v, 150, this.L);
            recyclerView$SmoothScroller0.q(v);
            this.z2(recyclerView$SmoothScroller0);
            return;
        }
        d.c("span layout manager", "Cannot scroll to " + v + ", item count " + this.getItemCount());
    }
}

