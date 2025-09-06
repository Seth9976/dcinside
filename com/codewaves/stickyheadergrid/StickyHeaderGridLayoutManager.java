package com.codewaves.stickyheadergrid;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

public class StickyHeaderGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        private int e;
        private int f;
        public static final int g = -1;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
            super(recyclerView$LayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public int l() {
            return this.e;
        }

        public int m() {
            return this.f;
        }
    }

    public static class SavedState implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        private int a;
        private int b;
        private int c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.a = parcel0.readInt();
            this.b = parcel0.readInt();
            this.c = parcel0.readInt();
        }

        public SavedState(SavedState stickyHeaderGridLayoutManager$SavedState0) {
            this.a = stickyHeaderGridLayoutManager$SavedState0.a;
            this.b = stickyHeaderGridLayoutManager$SavedState0.b;
            this.c = stickyHeaderGridLayoutManager$SavedState0.c;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        boolean h() {
            return this.a >= 0;
        }

        void i() {
            this.a = -1;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeInt(this.b);
            parcel0.writeInt(this.c);
        }
    }

    static class b {
        private int a;
        private int b;
        private int c;

        public b() {
            this.g();
        }

        public void g() {
            this.a = -1;
            this.b = 0;
            this.c = 0;
        }
    }

    public static final class c extends h {
        @Override  // com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager$h
        public int a(int v, int v1, int v2) {
            return v1 % v2;
        }

        @Override  // com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager$h
        public int b(int v, int v1) {
            return 1;
        }
    }

    static class d {
        private View a;
        private int b;
        private int c;
        private int d;

        private d() {
        }

        d(com.codewaves.stickyheadergrid.c c0) {
        }
    }

    public static enum e {
        NORMAL,
        STICKY,
        PUSHED;

        private static e[] a() [...] // Inlined contents
    }

    public interface f {
        void a(int arg1, View arg2, e arg3, int arg4);
    }

    static class g {
        private boolean a;
        private View b;
        private int c;
        private int d;
        private int e;
        private int f;

        public g(int v, int v1, int v2, int v3) {
            this.a = false;
            this.b = null;
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.f = v3;
        }

        public g(View view0, int v, int v1, int v2, int v3) {
            this.a = true;
            this.b = view0;
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.f = v3;
        }

        int i() {
            return this.f - this.e;
        }
    }

    public static abstract class h {
        public int a(int v, int v1, int v2) {
            int v3 = this.b(v, v1);
            if(v3 >= v2) {
                return 0;
            }
            int v5 = 0;
            for(int v4 = 0; v4 < v1; ++v4) {
                int v6 = this.b(v, v4);
                v5 += v6;
                if(v5 == v2) {
                    v5 = 0;
                }
                else if(v5 > v2) {
                    v5 = v6;
                }
            }
            return v3 + v5 > v2 ? 0 : v5;
        }

        public abstract int b(int arg1, int arg2);
    }

    private int A;
    private f B;
    private int C;
    private View D;
    private e E;
    private View[] F;
    private SavedState G;
    private int H;
    private int I;
    private b J;
    private final d K;
    private ArrayList L;
    public static final String M = "StickyLayoutManager";
    private static final int N = 16;
    private int s;
    private h t;
    private com.codewaves.stickyheadergrid.a u;
    private int v;
    private View w;
    private int x;
    private int y;
    private int z;

    public StickyHeaderGridLayoutManager(int v) {
        this.t = new c();
        this.C = -1;
        this.H = -1;
        this.J = new b();
        this.K = new d(null);
        this.L = new ArrayList(16);
        this.s = v;
        this.F = new View[v];
        this.A = 0;
        if(v < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + v);
        }
    }

    private void E2(Recycler recyclerView$Recycler0, State recyclerView$State0, int v, int v1, boolean z) {
        if(z) {
            while(true) {
                g stickyHeaderGridLayoutManager$g0 = this.O2();
                int v2 = stickyHeaderGridLayoutManager$g0.c + stickyHeaderGridLayoutManager$g0.d;
                if(stickyHeaderGridLayoutManager$g0.f >= this.P2(recyclerView$State0) + v1 || v2 >= recyclerView$State0.d()) {
                    break;
                }
                this.F2(recyclerView$Recycler0, recyclerView$State0, false, v2, stickyHeaderGridLayoutManager$g0.f);
            }
        }
        else {
            while(true) {
                g stickyHeaderGridLayoutManager$g1 = this.f3();
                int v3 = stickyHeaderGridLayoutManager$g1.c;
                if(stickyHeaderGridLayoutManager$g1.e < v - this.P2(recyclerView$State0) || v3 - 1 < 0) {
                    break;
                }
                this.F2(recyclerView$Recycler0, recyclerView$State0, true, v3 - 1, stickyHeaderGridLayoutManager$g1.e);
            }
        }
    }

    private void F2(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z, int v, int v1) {
        int v2 = this.G0();
        int v3 = this.R0() - this.H0();
        if(z && this.w != null && v == this.x) {
            this.l3(recyclerView$Recycler0);
        }
        if(this.u.C(v) == 0) {
            View view0 = recyclerView$Recycler0.p(v);
            if(z) {
                this.y(view0, this.v);
            }
            else {
                this.x(view0);
            }
            this.k1(view0, 0, 0);
            int v4 = this.s0(view0);
            int v5 = v4 < this.A ? v4 : this.A;
            if(z) {
                int v6 = v1 - v4 + v5;
                this.h1(view0, v2, v6, v3, v1 + v5);
                this.L.add(0, new g(view0, v, 1, v6, v1));
            }
            else {
                int v7 = v1 + v4;
                this.h1(view0, v2, v1, v3, v7);
                this.L.add(new g(view0, v, 1, v1, v7 - v5));
            }
            this.z = v4 - v5;
            return;
        }
        if(z) {
            d stickyHeaderGridLayoutManager$d0 = this.K2(recyclerView$Recycler0, recyclerView$State0, v, v1);
            this.L.add(0, new g(stickyHeaderGridLayoutManager$d0.b, stickyHeaderGridLayoutManager$d0.c, v1 - stickyHeaderGridLayoutManager$d0.d, v1));
            return;
        }
        d stickyHeaderGridLayoutManager$d1 = this.J2(recyclerView$Recycler0, recyclerView$State0, v, v1);
        this.L.add(new g(stickyHeaderGridLayoutManager$d1.b, stickyHeaderGridLayoutManager$d1.c, v1, stickyHeaderGridLayoutManager$d1.d + v1));
    }

    private void G2(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        if(this.L.size() <= 0) {
            return;
        }
        int v = this.J0();
        int v1 = this.x0() - this.E0();
        if(z) {
            for(g stickyHeaderGridLayoutManager$g0 = this.f3(); stickyHeaderGridLayoutManager$g0.f < v - this.P2(recyclerView$State0) || stickyHeaderGridLayoutManager$g0.e > v1; stickyHeaderGridLayoutManager$g0 = this.f3()) {
                if(stickyHeaderGridLayoutManager$g0.a) {
                    this.Z1(this.v + (this.w == null ? 0 : 1), recyclerView$Recycler0);
                }
                else {
                    for(int v2 = 0; v2 < stickyHeaderGridLayoutManager$g0.d; ++v2) {
                        this.Z1(0, recyclerView$Recycler0);
                        --this.v;
                    }
                }
                this.L.remove(0);
            }
            return;
        }
        for(g stickyHeaderGridLayoutManager$g1 = this.O2(); stickyHeaderGridLayoutManager$g1.f < v || stickyHeaderGridLayoutManager$g1.e > this.P2(recyclerView$State0) + v1; stickyHeaderGridLayoutManager$g1 = this.O2()) {
            if(stickyHeaderGridLayoutManager$g1.a) {
                this.Z1(this.j0() - 1, recyclerView$Recycler0);
            }
            else {
                for(int v3 = 0; v3 < stickyHeaderGridLayoutManager$g1.d; ++v3) {
                    this.Z1(this.v - 1, recyclerView$Recycler0);
                    --this.v;
                }
            }
            this.L.remove(this.L.size() - 1);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean H() {
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v12;
        int v1;
        if(this.u != null && recyclerView$State0.d() != 0) {
            int v = this.H;
            if(v >= 0) {
                v1 = this.I;
            }
            else if(this.G == null || !this.G.h()) {
                v = this.N2(this.J);
                v1 = this.J.c;
            }
            else {
                v = this.M2(this.G.a, this.G.b);
                v1 = this.G.c;
                this.G = null;
            }
            if(v < 0 || v >= recyclerView$State0.d()) {
                this.H = -1;
                v = 0;
                v1 = 0;
            }
            if(v1 > 0) {
                v1 = 0;
            }
            this.S(recyclerView$Recycler0);
            this.H2();
            int v2 = this.L2(v);
            int v3 = this.G0();
            int v4 = this.R0();
            int v5 = this.H0();
            int v6 = this.x0() - this.E0();
            int v7 = this.J0() + v1;
            int v8 = v2;
            while(v8 < recyclerView$State0.d()) {
                if(this.u.C(v8) == 0) {
                    View view0 = recyclerView$Recycler0.p(v8);
                    this.x(view0);
                    this.k1(view0, 0, 0);
                    int v9 = this.s0(view0);
                    int v10 = v9 < this.A ? v9 : this.A;
                    int v11 = v7 + v9;
                    this.h1(view0, v3, v7, v4 - v5, v11);
                    v12 = v11 - v10;
                    this.L.add(new g(view0, v8, 1, v7, v12));
                    ++v8;
                    this.z = v9 - v10;
                }
                else {
                    d stickyHeaderGridLayoutManager$d0 = this.J2(recyclerView$Recycler0, recyclerView$State0, v8, v7);
                    int v13 = stickyHeaderGridLayoutManager$d0.d + v7;
                    this.L.add(new g(stickyHeaderGridLayoutManager$d0.b, stickyHeaderGridLayoutManager$d0.c, v7, v13));
                    v8 += stickyHeaderGridLayoutManager$d0.c;
                    v12 = v13;
                }
                if(v12 >= this.P2(recyclerView$State0) + v6) {
                    break;
                }
                v7 = v12;
            }
            if(this.O2().f < v6) {
                this.l2(this.O2().f - v6, recyclerView$Recycler0, recyclerView$State0);
            }
            else {
                this.I2(recyclerView$Recycler0, recyclerView$State0, false);
            }
            if(this.H >= 0) {
                this.H = -1;
                int v14 = this.b3(v2);
                if(v14 != 0) {
                    this.l2(-v14, recyclerView$Recycler0, recyclerView$State0);
                }
            }
            return;
        }
        this.W1(recyclerView$Recycler0);
        this.H2();
    }

    private void H2() {
        this.v = 0;
        this.y = 0;
        this.w = null;
        this.x = -1;
        this.z = 0;
        this.L.clear();
        int v = this.C;
        if(v != -1) {
            f stickyHeaderGridLayoutManager$f0 = this.B;
            if(stickyHeaderGridLayoutManager$f0 != null) {
                stickyHeaderGridLayoutManager$f0.a(v, this.D, e.a, 0);
            }
            this.C = -1;
            this.D = null;
            this.E = e.a;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean I(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
        return recyclerView$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void I1(State recyclerView$State0) {
        super.I1(recyclerView$State0);
        this.G = null;
    }

    private void I2(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        this.G2(recyclerView$Recycler0, recyclerView$State0, z);
        if(this.j0() > 0) {
            this.p3(recyclerView$Recycler0);
        }
        this.q3();
    }

    private d J2(Recycler recyclerView$Recycler0, State recyclerView$State0, int v, int v1) {
        int v2 = this.R0() - this.G0() - this.H0();
        int v3 = this.u.z(v);
        int v4 = this.u.B(v3, v);
        int v5 = this.t.b(v3, v4);
        int v6 = this.t.a(v3, v4, this.s);
        Arrays.fill(this.F, null);
        int v7 = v;
        int v8 = 0;
        int v9 = 0;
        int v10;
        while((v10 = v6 + v5) <= this.s) {
            int v11 = this.e3(v2, v6, v5);
            View view0 = recyclerView$Recycler0.p(v7);
            LayoutParams stickyHeaderGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            stickyHeaderGridLayoutManager$LayoutParams0.e = v6;
            stickyHeaderGridLayoutManager$LayoutParams0.f = v5;
            this.y(view0, this.v);
            ++this.v;
            this.k1(view0, v2 - v11, 0);
            this.F[v8] = view0;
            ++v8;
            int v12 = this.s0(view0);
            if(v9 < v12) {
                v9 = v12;
            }
            ++v7;
            ++v4;
            if(v4 >= this.u.H(v3)) {
                break;
            }
            v5 = this.t.b(v3, v4);
            v6 = v10;
        }
        int v13 = this.G0();
        int v14 = 0;
        while(v14 < v8) {
            View view1 = this.F[v14];
            int v15 = this.s0(view1);
            int v16 = v13 + this.t0(view1);
            this.h1(view1, v13, v1, v16, v1 + v15);
            ++v14;
            v13 = v16;
        }
        this.K.a = this.F[v8 - 1];
        this.K.b = v;
        this.K.c = v8;
        this.K.d = v9;
        return this.K;
    }

    private d K2(Recycler recyclerView$Recycler0, State recyclerView$State0, int v, int v1) {
        int v2 = this.R0() - this.G0() - this.H0();
        int v3 = this.u.z(v);
        int v4 = this.u.B(v3, v);
        int v5 = this.t.b(v3, v4);
        int v6 = this.t.a(v3, v4, this.s);
        Arrays.fill(this.F, null);
        int v7 = 0;
        int v8 = 0;
        while(v6 >= 0) {
            int v9 = this.e3(v2, v6, v5);
            View view0 = recyclerView$Recycler0.p(v);
            LayoutParams stickyHeaderGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            stickyHeaderGridLayoutManager$LayoutParams0.e = v6;
            stickyHeaderGridLayoutManager$LayoutParams0.f = v5;
            this.y(view0, 0);
            ++this.v;
            this.k1(view0, v2 - v9, 0);
            this.F[v7] = view0;
            ++v7;
            int v10 = this.s0(view0);
            if(v8 < v10) {
                v8 = v10;
            }
            --v;
            --v4;
            if(v4 < 0) {
                break;
            }
            v5 = this.t.b(v3, v4);
            v6 -= v5;
        }
        int v11 = this.G0();
        int v12 = v7 - 1;
        while(v12 >= 0) {
            View view1 = this.F[v12];
            int v13 = this.s0(view1);
            int v14 = v11 + this.t0(view1);
            this.h1(view1, v11, v1 - v8, v14, v1 - (v8 - v13));
            --v12;
            v11 = v14;
        }
        this.K.a = this.F[v7 - 1];
        this.K.b = v + 1;
        this.K.c = v7;
        this.K.d = v8;
        return this.K;
    }

    private int L2(int v) {
        int v1 = this.u.z(v);
        int v2 = this.u.B(v1, v);
        while(v2 > 0 && this.t.a(v1, v2, this.s) != 0) {
            --v2;
            --v;
        }
        return v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void M1(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.G = (SavedState)parcelable0;
            this.g2();
            return;
        }
        Log.d("StickyLayoutManager", "invalid saved state class");
    }

    private int M2(int v, int v1) {
        if(v >= 0 && v < this.u.E()) {
            return v1 < 0 || v1 >= this.u.H(v) ? this.u.F(v) : this.u.I(v, v1);
        }
        return -1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public Parcelable N1() {
        if(this.G != null) {
            return new SavedState(this.G);
        }
        Parcelable parcelable0 = new SavedState();
        if(this.j0() > 0) {
            ((SavedState)parcelable0).a = this.J.a;
            ((SavedState)parcelable0).b = this.J.b;
            ((SavedState)parcelable0).c = this.J.c;
            return parcelable0;
        }
        ((SavedState)parcelable0).i();
        return parcelable0;
    }

    private int N2(b stickyHeaderGridLayoutManager$b0) {
        if(stickyHeaderGridLayoutManager$b0.a >= 0 && stickyHeaderGridLayoutManager$b0.a < this.u.E()) {
            if(stickyHeaderGridLayoutManager$b0.b >= 0 && stickyHeaderGridLayoutManager$b0.b < this.u.H(stickyHeaderGridLayoutManager$b0.a)) {
                return this.u.I(stickyHeaderGridLayoutManager$b0.a, stickyHeaderGridLayoutManager$b0.b);
            }
            stickyHeaderGridLayoutManager$b0.c = 0;
            return this.u.F(stickyHeaderGridLayoutManager$b0.a);
        }
        stickyHeaderGridLayoutManager$b0.g();
        return -1;
    }

    private g O2() {
        return (g)this.L.get(this.L.size() - 1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int P(State recyclerView$State0) {
        if(this.v != 0 && recyclerView$State0.d() != 0) {
            View view0 = this.i0(0);
            View view1 = this.i0(this.v - 1);
            return view0 == null || view1 == null ? 0 : Math.abs(this.K0(view0) - this.K0(view1)) + 1;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    private int P2(State recyclerView$State0) {
        return recyclerView$State0.h() ? this.x0() : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int Q(State recyclerView$State0) {
        if(this.v != 0 && recyclerView$State0.d() != 0) {
            View view0 = this.i0(0);
            View view1 = this.i0(this.v - 1);
            if(view0 == null || view1 == null || Math.max(this.J0() - this.f3().e, 0) == 0) {
                return 0;
            }
            int v = Math.min(this.K0(view0), this.K0(view1));
            this.K0(view0);
            this.K0(view1);
            return Math.max(0, v);
        }
        return 0;
    }

    public int Q2(boolean z) {
        return this.S2(0, z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int R(State recyclerView$State0) {
        return this.v == 0 || recyclerView$State0.d() == 0 || (this.i0(0) == null || this.i0(this.v - 1) == null) ? 0 : recyclerView$State0.d();
    }

    public int R2(boolean z) {
        return this.S2(1, z);
    }

    private int S2(int v, boolean z) {
        if(v == 1 && this.v <= 0) {
            return -1;
        }
        if(v == 0 && this.v >= this.j0()) {
            return -1;
        }
        int v1 = v == 1 ? 0 : this.v;
        int v2 = v == 1 ? this.v : this.j0();
        int v3 = this.J0();
        while(v1 < v2) {
            View view0 = this.i0(v1);
            int v4 = this.K0(view0);
            int v5 = this.b3(v4);
            int v6 = this.v0(view0);
            int v7 = this.p0(view0);
            if(z) {
                if(v6 >= v5 + v3) {
                    return v4;
                }
            }
            else if(v7 >= v5 + v3) {
                return v4;
            }
            ++v1;
        }
        return -1;
    }

    private g T2() {
        int v = this.J0();
        for(Object object0: this.L) {
            g stickyHeaderGridLayoutManager$g0 = (g)object0;
            if(stickyHeaderGridLayoutManager$g0.f > v) {
                return stickyHeaderGridLayoutManager$g0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private int U2() {
        int v = this.J0();
        int v1 = this.L.size();
        int v3 = -1;
        for(int v2 = 0; v2 < v1; ++v2) {
            g stickyHeaderGridLayoutManager$g0 = (g)this.L.get(v2);
            if(stickyHeaderGridLayoutManager$g0.a) {
                v3 = v2;
            }
            if(stickyHeaderGridLayoutManager$g0.f > v) {
                return v3;
            }
        }
        return -1;
    }

    private g V2(int v) {
        int v1 = this.L.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            g stickyHeaderGridLayoutManager$g0 = (g)this.L.get(v2);
            if(stickyHeaderGridLayoutManager$g0.a && stickyHeaderGridLayoutManager$g0.c == v) {
                return stickyHeaderGridLayoutManager$g0;
            }
        }
        return null;
    }

    public f W2() {
        return this.B;
    }

    public int X2() {
        return this.Z2(0);
    }

    public int Y2() {
        return this.Z2(1);
    }

    private int Z2(int v) {
        if(v == 1 && this.v <= 0) {
            return -1;
        }
        if(v == 0 && this.v >= this.j0()) {
            return -1;
        }
        int v1 = (v == 1 ? this.v : this.j0()) - 1;
        int v2 = v == 1 ? 0 : this.v;
        int v3 = this.x0();
        int v4 = this.E0();
        while(v1 >= v2) {
            View view0 = this.i0(v1);
            if(this.v0(view0) < v3 - v4) {
                return this.K0(view0);
            }
            --v1;
        }
        return -1;
    }

    private g a3(int v) {
        int v1 = v + 1;
        int v2 = this.L.size();
        while(v1 < v2) {
            g stickyHeaderGridLayoutManager$g0 = (g)this.L.get(v1);
            if(stickyHeaderGridLayoutManager$g0.a) {
                return stickyHeaderGridLayoutManager$g0;
            }
            ++v1;
        }
        return null;
    }

    private int b3(int v) {
        int v1 = this.u.z(v);
        if(v1 >= 0 && this.u.L(v1) && this.u.B(v1, v) >= 0) {
            int v2 = this.u.F(v1);
            View view0 = this.w;
            if(view0 != null && v2 == this.x) {
                return Math.max(0, this.s0(view0) - this.A);
            }
            g stickyHeaderGridLayoutManager$g0 = this.V2(v2);
            return stickyHeaderGridLayoutManager$g0 == null ? this.z : stickyHeaderGridLayoutManager$g0.i();
        }
        return 0;
    }

    private int c3(int v, int v1) {
        return v / this.s * v1 + Math.min(v - this.s * (v / this.s), v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams d0() {
        return new LayoutParams(-1, -2);
    }

    public h d3() {
        return this.t;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams e0(Context context0, AttributeSet attributeSet0) {
        return new LayoutParams(context0, attributeSet0);
    }

    private int e3(int v, int v1, int v2) {
        return v / this.s * v2 + Math.min(Math.max(0, v - this.s * (v / this.s) - v1), v2);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams f0(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    private g f3() {
        return (g)this.L.get(0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    public PointF g(int v) {
        if(this.j0() == 0) {
            return null;
        }
        g stickyHeaderGridLayoutManager$g0 = this.T2();
        return stickyHeaderGridLayoutManager$g0 == null ? null : new PointF(0.0f, ((float)(v - stickyHeaderGridLayoutManager$g0.c)));
    }

    private int g3(int v) {
        return this.u.getItemViewType(v) & 0xFF;
    }

    private int h3(View view0) {
        return this.z0(view0) & 0xFF;
    }

    private void i3(int v) {
        for(Object object0: this.L) {
            ((g)object0).e += v;
            ((g)object0).f += v;
        }
        this.n1(v);
    }

    private void j3(int v, View view0, e stickyHeaderGridLayoutManager$e0, int v1) {
        if(this.C != -1 && v != this.C) {
            this.k3();
        }
        boolean z = this.C != v || !this.E.equals(stickyHeaderGridLayoutManager$e0) || stickyHeaderGridLayoutManager$e0.equals(e.c);
        this.C = v;
        this.D = view0;
        this.E = stickyHeaderGridLayoutManager$e0;
        if(z) {
            f stickyHeaderGridLayoutManager$f0 = this.B;
            if(stickyHeaderGridLayoutManager$f0 != null) {
                stickyHeaderGridLayoutManager$f0.a(v, view0, stickyHeaderGridLayoutManager$e0, v1);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void k2(int v) {
        if(v < 0 || v > this.getItemCount()) {
            throw new IndexOutOfBoundsException("adapter position out of range");
        }
        this.H = v;
        this.I = 0;
        SavedState stickyHeaderGridLayoutManager$SavedState0 = this.G;
        if(stickyHeaderGridLayoutManager$SavedState0 != null) {
            stickyHeaderGridLayoutManager$SavedState0.i();
        }
        this.g2();
    }

    private void k3() {
        int v = this.C;
        if(v != -1) {
            f stickyHeaderGridLayoutManager$f0 = this.B;
            if(stickyHeaderGridLayoutManager$f0 != null) {
                stickyHeaderGridLayoutManager$f0.a(v, this.D, e.a, 0);
            }
            this.C = -1;
            this.D = null;
            this.E = e.a;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v6;
        boolean z = false;
        if(this.j0() == 0) {
            return 0;
        }
        this.G0();
        this.H0();
        int v1 = this.J0();
        int v2 = this.x0() - this.E0();
        int v3 = this.U2();
        if(v3 != -1) {
            ((g)this.L.get(v3)).b.offsetTopAndBottom(-this.y);
        }
        int v4 = 0;
        if(v >= 0) {
            while(v4 < v) {
                g stickyHeaderGridLayoutManager$g0 = this.O2();
                int v5 = Math.min(Math.max(stickyHeaderGridLayoutManager$g0.f - v2, 0), v - v4);
                this.i3(-v5);
                v6 = v4 - -v5;
                int v7 = stickyHeaderGridLayoutManager$g0.c + stickyHeaderGridLayoutManager$g0.d;
                if(v6 >= v || v7 >= recyclerView$State0.d()) {
                    goto label_34;
                }
                this.F2(recyclerView$Recycler0, recyclerView$State0, false, v7, stickyHeaderGridLayoutManager$g0.f);
                v4 = v6;
            }
        }
        else {
            while(v4 > v) {
                g stickyHeaderGridLayoutManager$g1 = this.f3();
                int v8 = Math.min(Math.max(v1 - stickyHeaderGridLayoutManager$g1.e, 0), v4 - v);
                this.i3(v8);
                v6 = v4 - v8;
                int v9 = stickyHeaderGridLayoutManager$g1.c;
                if(v6 <= v || v9 - 1 >= recyclerView$State0.d() || v9 - 1 < 0) {
                    goto label_34;
                }
                this.F2(recyclerView$Recycler0, recyclerView$State0, true, v9 - 1, stickyHeaderGridLayoutManager$g1.e);
                v4 = v6;
            }
        }
        v6 = v4;
    label_34:
        if(v6 == v) {
            this.E2(recyclerView$Recycler0, recyclerView$State0, v1, v2, v >= 0);
        }
        if(v >= 0) {
            z = true;
        }
        this.I2(recyclerView$Recycler0, recyclerView$State0, z);
        return v6;
    }

    private void l3(Recycler recyclerView$Recycler0) {
        View view0 = this.w;
        if(view0 == null) {
            return;
        }
        this.w = null;
        this.x = -1;
        this.Y1(view0, recyclerView$Recycler0);
    }

    public void m3(int v) {
        this.A = v;
    }

    public void n3(f stickyHeaderGridLayoutManager$f0) {
        this.B = stickyHeaderGridLayoutManager$f0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void o1(Adapter recyclerView$Adapter0, Adapter recyclerView$Adapter1) {
        super.o1(recyclerView$Adapter0, recyclerView$Adapter1);
        try {
            this.u = (com.codewaves.stickyheadergrid.a)recyclerView$Adapter1;
        }
        catch(ClassCastException unused_ex) {
            throw new ClassCastException("Adapter used with StickyHeaderGridLayoutManager must be kind of StickyHeaderGridAdapter");
        }
        this.V1();
        this.H2();
    }

    public void o3(h stickyHeaderGridLayoutManager$h0) {
        this.t = stickyHeaderGridLayoutManager$h0;
        if(stickyHeaderGridLayoutManager$h0 == null) {
            this.t = new c();
        }
    }

    private void p3(Recycler recyclerView$Recycler0) {
        int v14;
        int v = this.U2();
        int v1 = this.J0();
        int v2 = this.G0();
        int v3 = this.R0();
        int v4 = this.H0();
        int v5 = 0;
        if(v != -1) {
            this.l3(recyclerView$Recycler0);
            g stickyHeaderGridLayoutManager$g0 = (g)this.L.get(v);
            int v6 = this.u.z(stickyHeaderGridLayoutManager$g0.c);
            if(this.u.L(v6)) {
                g stickyHeaderGridLayoutManager$g1 = this.a3(v);
                if(stickyHeaderGridLayoutManager$g1 != null) {
                    int v7 = stickyHeaderGridLayoutManager$g0.i();
                    v5 = Math.min(Math.max(v1 - stickyHeaderGridLayoutManager$g1.e, -v7) + v7, v7);
                }
                this.y = v1 - stickyHeaderGridLayoutManager$g0.e - v5;
                stickyHeaderGridLayoutManager$g0.b.offsetTopAndBottom(this.y);
                this.j3(v6, stickyHeaderGridLayoutManager$g0.b, (v5 == 0 ? e.b : e.c), v5);
                return;
            }
            this.k3();
            this.y = 0;
            return;
        }
        g stickyHeaderGridLayoutManager$g2 = this.T2();
        if(stickyHeaderGridLayoutManager$g2 != null) {
            int v8 = this.u.z(stickyHeaderGridLayoutManager$g2.c);
            if(this.u.L(v8)) {
                int v9 = this.u.F(v8);
                if(this.w == null || this.x != v9) {
                    this.l3(recyclerView$Recycler0);
                    View view0 = recyclerView$Recycler0.p(v9);
                    this.y(view0, this.v);
                    this.k1(view0, 0, 0);
                    this.w = view0;
                    this.x = v9;
                }
                int v10 = this.s0(this.w);
                int v11 = this.j0();
                int v12 = this.v;
                if(v11 - v12 > 1) {
                    View view1 = this.i0(v12 + 1);
                    int v13 = Math.max(0, v10 - this.A);
                    v14 = v13 + Math.max(v1 - this.v0(view1), -v13);
                }
                else {
                    v14 = 0;
                }
                this.h1(this.w, v2, v1 - v14, v3 - v4, v1 + v10 - v14);
                this.j3(v8, this.w, (v14 == 0 ? e.b : e.c), v14);
                return;
            }
            this.k3();
            return;
        }
        this.k3();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void q1(RecyclerView recyclerView0) {
        super.q1(recyclerView0);
        try {
            this.u = (com.codewaves.stickyheadergrid.a)recyclerView0.getAdapter();
        }
        catch(ClassCastException unused_ex) {
            throw new ClassCastException("Adapter used with StickyHeaderGridLayoutManager must be kind of StickyHeaderGridAdapter");
        }
    }

    private void q3() {
        if(this.j0() == 0) {
            this.J.g();
        }
        g stickyHeaderGridLayoutManager$g0 = this.T2();
        if(stickyHeaderGridLayoutManager$g0 != null) {
            this.J.a = this.u.z(stickyHeaderGridLayoutManager$g0.c);
            this.J.b = this.u.B(this.J.a, stickyHeaderGridLayoutManager$g0.c);
            this.J.c = Math.min(stickyHeaderGridLayoutManager$g0.e - this.J0(), 0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        class com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.a extends LinearSmoothScroller {
            final StickyHeaderGridLayoutManager x;

            com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            public int v(View view0, int v) {
                LayoutManager recyclerView$LayoutManager0 = this.e();
                if(recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.H()) {
                    int v1 = StickyHeaderGridLayoutManager.this.K0(view0);
                    int v2 = StickyHeaderGridLayoutManager.this.b3(v1);
                    return this.t(recyclerView$LayoutManager0.v0(view0), recyclerView$LayoutManager0.p0(view0), recyclerView$LayoutManager0.J0() + v2, recyclerView$LayoutManager0.x0() - recyclerView$LayoutManager0.E0(), v);
                }
                return 0;
            }
        }

        com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.a stickyHeaderGridLayoutManager$a0 = new com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.a(this, recyclerView0.getContext());
        stickyHeaderGridLayoutManager$a0.q(v);
        this.z2(stickyHeaderGridLayoutManager$a0);
    }
}

