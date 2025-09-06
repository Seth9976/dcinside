package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class GridLayoutManager extends LinearLayoutManager {
    @RequiresApi(21)
    static class Api21Impl {
        static boolean a(@NonNull View view0) {
            return view0.isAccessibilityFocused();
        }
    }

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int e(int v, int v1) {
            return v % v1;
        }

        @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
        public int f(int v) {
            return 1;
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        int e;
        int f;
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

        public int j() {
            return this.e;
        }

        public int k() {
            return this.f;
        }
    }

    public static abstract class SpanSizeLookup {
        final SparseIntArray a;
        final SparseIntArray b;
        private boolean c;
        private boolean d;

        public SpanSizeLookup() {
            this.a = new SparseIntArray();
            this.b = new SparseIntArray();
            this.c = false;
            this.d = false;
        }

        static int a(SparseIntArray sparseIntArray0, int v) {
            int v1 = sparseIntArray0.size() - 1;
            int v2 = 0;
            while(v2 <= v1) {
                int v3 = v2 + v1 >>> 1;
                if(sparseIntArray0.keyAt(v3) < v) {
                    v2 = v3 + 1;
                }
                else {
                    v1 = v3 - 1;
                }
            }
            return v2 - 1 < 0 || v2 - 1 >= sparseIntArray0.size() ? -1 : sparseIntArray0.keyAt(v2 - 1);
        }

        int b(int v, int v1) {
            if(!this.d) {
                return this.d(v, v1);
            }
            int v2 = this.b.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = this.d(v, v1);
            this.b.put(v, v3);
            return v3;
        }

        int c(int v, int v1) {
            if(!this.c) {
                return this.e(v, v1);
            }
            int v2 = this.a.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = this.e(v, v1);
            this.a.put(v, v3);
            return v3;
        }

        public int d(int v, int v1) {
            int v5;
            int v4;
            int v3;
            if(this.d) {
                int v2 = SpanSizeLookup.a(this.b, v);
                if(v2 == -1) {
                    v3 = 0;
                    v4 = 0;
                    v5 = 0;
                }
                else {
                    v3 = this.b.get(v2);
                    v4 = v2 + 1;
                    v5 = this.c(v2, v1) + this.f(v2);
                    if(v5 == v1) {
                        ++v3;
                        v5 = 0;
                    }
                }
            }
            else {
                v3 = 0;
                v4 = 0;
                v5 = 0;
            }
            int v6 = this.f(v);
            while(v4 < v) {
                int v7 = this.f(v4);
                v5 += v7;
                if(v5 == v1) {
                    ++v3;
                    v5 = 0;
                }
                else if(v5 > v1) {
                    ++v3;
                    v5 = v7;
                }
                ++v4;
            }
            return v5 + v6 <= v1 ? v3 : v3 + 1;
        }

        public int e(int v, int v1) {
            int v4;
            int v3;
            int v2 = this.f(v);
            if(v2 == v1) {
                return 0;
            }
            if(this.c) {
                v3 = SpanSizeLookup.a(this.a, v);
                if(v3 >= 0) {
                    v4 = this.a.get(v3) + this.f(v3);
                    ++v3;
                }
                else {
                    v3 = 0;
                    v4 = 0;
                }
            }
            else {
                v3 = 0;
                v4 = 0;
            }
            while(v3 < v) {
                int v5 = this.f(v3);
                v4 += v5;
                if(v4 == v1) {
                    v4 = 0;
                }
                else if(v4 > v1) {
                    v4 = v5;
                }
                ++v3;
            }
            return v2 + v4 > v1 ? 0 : v4;
        }

        public abstract int f(int arg1);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }

        public boolean i() {
            return this.d;
        }

        public boolean j() {
            return this.c;
        }

        public void k(boolean z) {
            if(!z) {
                this.b.clear();
            }
            this.d = z;
        }

        public void l(boolean z) {
            if(!z) {
                this.b.clear();
            }
            this.c = z;
        }
    }

    boolean O;
    int P;
    int[] Q;
    View[] R;
    final SparseIntArray S;
    final SparseIntArray T;
    SpanSizeLookup U;
    final Rect V;
    private boolean W;
    private int X;
    int Y;
    int Z;
    private static final boolean a0 = false;
    private static final String b0 = "GridLayoutManager";
    public static final int c0 = -1;
    private static final int d0 = -1;
    private static final Set e0;

    static {
        GridLayoutManager.e0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{17, 66, 33, 130})));
    }

    public GridLayoutManager(Context context0, int v) {
        super(context0);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new DefaultSpanSizeLookup();
        this.V = new Rect();
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.l4(v);
    }

    public GridLayoutManager(Context context0, int v, int v1, boolean z) {
        super(context0, v1, z);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new DefaultSpanSizeLookup();
        this.V = new Rect();
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.l4(v);
    }

    public GridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new DefaultSpanSizeLookup();
        this.V = new Rect();
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.l4(LayoutManager.L0(context0, attributeSet0, v, v1).b);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void B1(RecyclerView recyclerView0, int v, int v1) {
        this.U.h();
        this.U.g();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void C1(RecyclerView recyclerView0) {
        this.U.h();
        this.U.g();
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public boolean C2() {
        return this.D == null && !this.O;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void D1(RecyclerView recyclerView0, int v, int v1, int v2) {
        this.U.h();
        this.U.g();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void E1(RecyclerView recyclerView0, int v, int v1) {
        this.U.h();
        this.U.g();
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    void E2(State recyclerView$State0, LayoutState linearLayoutManager$LayoutState0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v = this.P;
        for(int v1 = 0; v1 < this.P && linearLayoutManager$LayoutState0.c(recyclerView$State0) && v > 0; ++v1) {
            int v2 = linearLayoutManager$LayoutState0.d;
            recyclerView$LayoutManager$LayoutPrefetchRegistry0.a(v2, Math.max(0, linearLayoutManager$LayoutState0.g));
            v -= this.U.f(v2);
            linearLayoutManager$LayoutState0.d += linearLayoutManager$LayoutState0.e;
        }
    }

    private void F3(Recycler recyclerView$Recycler0, State recyclerView$State0, int v, boolean z) {
        int v4;
        int v3;
        int v2;
        int v1 = 0;
        if(z) {
            v2 = v;
            v3 = 0;
            v4 = 1;
        }
        else {
            v3 = v - 1;
            v2 = -1;
            v4 = -1;
        }
        while(v3 != v2) {
            View view0 = this.R[v3];
            LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v5 = this.e4(recyclerView$Recycler0, recyclerView$State0, this.K0(view0));
            gridLayoutManager$LayoutParams0.f = v5;
            gridLayoutManager$LayoutParams0.e = v1;
            v1 += v5;
            v3 += v4;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void G1(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.U.h();
        this.U.g();
    }

    private void G3() {
        int v = this.j0();
        for(int v1 = 0; v1 < v; ++v1) {
            LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)this.i0(v1).getLayoutParams();
            int v2 = gridLayoutManager$LayoutParams0.d();
            this.S.put(v2, gridLayoutManager$LayoutParams0.k());
            this.T.put(v2, gridLayoutManager$LayoutParams0.j());
        }
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(recyclerView$State0.j()) {
            this.G3();
        }
        super.H1(recyclerView$Recycler0, recyclerView$State0);
        this.J3();
    }

    private void H3(int v) {
        this.Q = GridLayoutManager.I3(this.Q, this.P, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean I(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
        return recyclerView$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void I1(State recyclerView$State0) {
        super.I1(recyclerView$State0);
        this.O = false;
        int v = this.X;
        if(v != -1) {
            View view0 = this.c0(v);
            if(view0 != null) {
                view0.sendAccessibilityEvent(0x4000000);
                this.X = -1;
            }
        }
    }

    static int[] I3(int[] arr_v, int v, int v1) {
        int v7;
        if(arr_v == null || arr_v.length != v + 1 || arr_v[arr_v.length - 1] != v1) {
            arr_v = new int[v + 1];
        }
        int v3 = 0;
        arr_v[0] = 0;
        int v4 = v1 / v;
        int v5 = v1 % v;
        int v6 = 0;
        for(int v2 = 1; v2 <= v; ++v2) {
            v3 += v5;
            if(v3 <= 0 || v - v3 >= v5) {
                v7 = v4;
            }
            else {
                v7 = v4 + 1;
                v3 -= v;
            }
            v6 += v7;
            arr_v[v2] = v6;
        }
        return arr_v;
    }

    private void J3() {
        this.S.clear();
        this.T.clear();
    }

    private int K3(State recyclerView$State0) {
        if(this.j0() != 0 && recyclerView$State0.d() != 0) {
            this.K2();
            boolean z = this.h();
            View view0 = this.O2(!z, true);
            View view1 = this.N2(!z, true);
            if(view0 != null && view1 != null) {
                int v = this.U.b(this.K0(view0), this.P);
                int v1 = this.U.b(this.K0(view1), this.P);
                int v2 = this.U.b(recyclerView$State0.d() - 1, this.P);
                int v3 = this.x ? Math.max(0, v2 + 1 - Math.max(v, v1) - 1) : Math.max(0, Math.min(v, v1));
                if(!z) {
                    return v3;
                }
                int v4 = this.u.d(view1);
                int v5 = this.u.g(view0);
                int v6 = this.U.b(this.K0(view0), this.P);
                return Math.round(((float)v3) * (((float)Math.abs(v4 - v5)) / ((float)(this.U.b(this.K0(view1), this.P) - v6 + 1))) + ((float)(this.u.n() - this.u.g(view0))));
            }
        }
        return 0;
    }

    private int L3(State recyclerView$State0) {
        if(this.j0() != 0 && recyclerView$State0.d() != 0) {
            this.K2();
            View view0 = this.O2(!this.h(), true);
            View view1 = this.N2(!this.h(), true);
            if(view0 != null && view1 != null) {
                if(!this.h()) {
                    return this.U.b(recyclerView$State0.d() - 1, this.P) + 1;
                }
                int v = this.u.d(view1);
                int v1 = this.u.g(view0);
                int v2 = this.U.b(this.K0(view0), this.P);
                return (int)(((float)(v - v1)) / ((float)(this.U.b(this.K0(view1), this.P) - v2 + 1)) * ((float)(this.U.b(recyclerView$State0.d() - 1, this.P) + 1)));
            }
        }
        return 0;
    }

    private void M3(Recycler recyclerView$Recycler0, State recyclerView$State0, AnchorInfo linearLayoutManager$AnchorInfo0, int v) {
        int v1 = this.d4(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$AnchorInfo0.b);
        if(v == 1) {
            while(v1 > 0) {
                int v2 = linearLayoutManager$AnchorInfo0.b;
                if(v2 <= 0) {
                    return;
                }
                linearLayoutManager$AnchorInfo0.b = v2 - 1;
                v1 = this.d4(recyclerView$Recycler0, recyclerView$State0, v2 - 1);
            }
        }
        else {
            int v3 = recyclerView$State0.d();
            int v4 = linearLayoutManager$AnchorInfo0.b;
            while(v4 < v3 - 1) {
                int v5 = this.d4(recyclerView$Recycler0, recyclerView$State0, v4 + 1);
                if(v5 <= v1) {
                    break;
                }
                ++v4;
                v1 = v5;
            }
            linearLayoutManager$AnchorInfo0.b = v4;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int N(State recyclerView$State0) {
        return this.W ? this.K3(recyclerView$State0) : super.N(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int N0(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.s == 0) {
            return Math.min(this.P, this.getItemCount());
        }
        return recyclerView$State0.d() >= 1 ? this.c4(recyclerView$Recycler0, recyclerView$State0, recyclerView$State0.d() - 1) + 1 : 0;
    }

    private void N3() {
        if(this.R == null || this.R.length != this.P) {
            this.R = new View[this.P];
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int O(State recyclerView$State0) {
        return this.W ? this.L3(recyclerView$State0) : super.O(recyclerView$State0);
    }

    @Nullable
    private View O3() {
        for(int v = 0; v < this.j0(); ++v) {
            View view0 = this.i0(v);
            Objects.requireNonNull(view0);
            if(Api21Impl.a(view0)) {
                return this.i0(v);
            }
        }
        return null;
    }

    int P3(int v) {
        if(v < 0) {
            return -1;
        }
        if(this.s == 1) {
            return -1;
        }
        TreeMap treeMap0 = new TreeMap();
        for(int v1 = 0; v1 < this.getItemCount(); ++v1) {
            for(Object object0: this.Y3(v1)) {
                Integer integer0 = (Integer)object0;
                if(((int)integer0) < 0) {
                    return -1;
                }
                if(!treeMap0.containsKey(integer0)) {
                    treeMap0.put(integer0, v1);
                }
            }
        }
        for(Object object1: treeMap0.keySet()) {
            Integer integer1 = (Integer)object1;
            int v2 = (int)integer1;
            if(v2 > v) {
                int v3 = (int)(((Integer)treeMap0.get(integer1)));
                this.Y = v2;
                this.Z = 0;
                return v3;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int Q(State recyclerView$State0) {
        return this.W ? this.K3(recyclerView$State0) : super.Q(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    boolean Q1(int v, @Nullable Bundle bundle0) {
        int v7;
        if(v == AccessibilityActionCompat.W.b() && v != -1) {
            View view0 = this.O3();
            if(view0 == null) {
                return false;
            }
            if(bundle0 == null) {
                return false;
            }
            int v1 = bundle0.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
            if(!GridLayoutManager.e0.contains(v1)) {
                return false;
            }
            ViewHolder recyclerView$ViewHolder0 = this.b.getChildViewHolder(view0);
            if(recyclerView$ViewHolder0 == null) {
                return false;
            }
            int v2 = recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
            int v3 = this.X3(v2);
            int v4 = this.V3(v2);
            if(v3 >= 0 && v4 >= 0) {
                if(this.h4(v2)) {
                    this.Y = v3;
                    this.Z = v4;
                }
                int v5 = this.Y == -1 ? v3 : this.Y;
                int v6 = this.Z;
                if(v6 != -1) {
                    v4 = v6;
                }
                if(v1 == 17) {
                    v7 = this.T3(v5, v4, v2);
                }
                else {
                    switch(v1) {
                        case 33: {
                            v7 = this.R3(v5, v4, v2);
                            break;
                        }
                        case 66: {
                            v7 = this.U3(v5, v4, v2);
                            break;
                        }
                        default: {
                            if(v1 != 130) {
                                return false;
                            }
                            v7 = this.S3(v5, v4, v2);
                        }
                    }
                }
                if(v7 == -1 && this.s == 0) {
                    if(v1 == 17) {
                        v7 = this.Q3(v3);
                    }
                    else if(v1 == 66) {
                        v7 = this.P3(v3);
                    }
                }
                if(v7 != -1) {
                    this.k2(v7);
                    this.X = v7;
                    return true;
                }
            }
            return false;
        }
        if(v == 0x1020037 && bundle0 != null) {
            int v8 = bundle0.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int v9 = bundle0.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if(v8 != -1 && v9 != -1) {
                int v10 = this.b.mAdapter.getItemCount();
                int v11;
                for(v11 = 0; true; ++v11) {
                    if(v11 >= v10) {
                        v11 = -1;
                        break;
                    }
                    int v12 = this.d4(this.b.mRecycler, this.b.mState, v11);
                    int v13 = this.c4(this.b.mRecycler, this.b.mState, v11);
                    if((this.s == 1 ? v12 == v9 && v13 == v8 : v12 == v8 && v13 == v9)) {
                        break;
                    }
                }
                if(v11 > -1) {
                    this.q3(v11, 0);
                    return true;
                }
            }
            return false;
        }
        return super.Q1(v, bundle0);
    }

    int Q3(int v) {
        if(v < 0) {
            return -1;
        }
        if(this.s == 1) {
            return -1;
        }
        TreeMap treeMap0 = new TreeMap(Collections.reverseOrder());
        for(int v1 = 0; v1 < this.getItemCount(); ++v1) {
            for(Object object0: this.Y3(v1)) {
                if(((int)(((Integer)object0))) < 0) {
                    return -1;
                }
                treeMap0.put(((Integer)object0), v1);
            }
        }
        for(Object object1: treeMap0.keySet()) {
            Integer integer0 = (Integer)object1;
            int v2 = (int)integer0;
            if(v2 < v) {
                int v3 = (int)(((Integer)treeMap0.get(integer0)));
                this.Y = v2;
                this.Z = this.V3(v3);
                return v3;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int R(State recyclerView$State0) {
        return this.W ? this.L3(recyclerView$State0) : super.R(recyclerView$State0);
    }

    private int R3(int v, int v1, int v2) {
        int v3 = v2 - 1;
        while(v3 >= 0) {
            int v4 = this.X3(v3);
            int v5 = this.V3(v3);
            if(v4 >= 0 && v5 >= 0) {
                if(this.s == 1) {
                    if(v4 < v && this.W3(v3).contains(v1)) {
                        this.Y = v4;
                        return v3;
                    }
                }
                else if(v4 < v && v5 == v1) {
                    this.Y = (int)(((Integer)Collections.max(this.Y3(v3))));
                    return v3;
                }
                --v3;
                continue;
            }
            return -1;
        }
        return -1;
    }

    private int S3(int v, int v1, int v2) {
        int v3 = v2 + 1;
        while(v3 < this.getItemCount()) {
            int v4 = this.X3(v3);
            int v5 = this.V3(v3);
            if(v4 >= 0 && v5 >= 0) {
                if(this.s == 1) {
                    if(v4 > v && (v5 == v1 || this.W3(v3).contains(v1))) {
                        this.Y = v4;
                        return v3;
                    }
                }
                else if(v4 > v && v5 == v1) {
                    this.Y = this.X3(v3);
                    return v3;
                }
                ++v3;
                continue;
            }
            return -1;
        }
        return -1;
    }

    private int T3(int v, int v1, int v2) {
        int v3 = v2 - 1;
        while(v3 >= 0) {
            int v4 = this.X3(v3);
            int v5 = this.V3(v3);
            if(v4 >= 0 && v5 >= 0) {
                if(this.s == 1) {
                    if(v4 == v && v5 < v1 || v4 < v) {
                        this.Y = v4;
                        this.Z = v5;
                        return v3;
                    }
                }
                else if(this.Y3(v3).contains(v) && v5 < v1) {
                    this.Z = v5;
                    return v3;
                }
                --v3;
                continue;
            }
            return -1;
        }
        return -1;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    View U2(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z, boolean z1) {
        int v3;
        int v2;
        int v = this.j0();
        int v1 = 1;
        if(z1) {
            v2 = this.j0() - 1;
            v3 = -1;
            v1 = -1;
        }
        else {
            v3 = v;
            v2 = 0;
        }
        int v4 = recyclerView$State0.d();
        this.K2();
        int v5 = this.u.n();
        int v6 = this.u.i();
        View view0 = null;
        View view1 = null;
        while(v2 != v3) {
            View view2 = this.i0(v2);
            int v7 = this.K0(view2);
            if(v7 >= 0 && v7 < v4 && this.d4(recyclerView$Recycler0, recyclerView$State0, v7) == 0) {
                if(!((androidx.recyclerview.widget.RecyclerView.LayoutParams)view2.getLayoutParams()).g()) {
                    if(this.u.g(view2) < v6 && this.u.d(view2) >= v5) {
                        return view2;
                    }
                    if(view0 == null) {
                        view0 = view2;
                    }
                }
                else if(view1 == null) {
                    view1 = view2;
                }
            }
            v2 += v1;
        }
        return view0 == null ? view1 : view0;
    }

    private int U3(int v, int v1, int v2) {
        for(int v3 = v2 + 1; v3 < this.getItemCount(); ++v3) {
            int v4 = this.X3(v3);
            int v5 = this.V3(v3);
            if(v4 < 0 || v5 < 0) {
                break;
            }
            if(this.s == 1) {
                if(v4 == v && v5 > v1 || v4 > v) {
                    this.Y = v4;
                    this.Z = v5;
                    return v3;
                }
            }
            else if(v5 > v1 && this.Y3(v3).contains(v)) {
                this.Z = v5;
                return v3;
            }
        }
        return -1;
    }

    private int V3(int v) {
        return this.s == 0 ? this.c4(this.b.mRecycler, this.b.mState, v) : this.d4(this.b.mRecycler, this.b.mState, v);
    }

    private Set W3(int v) {
        return this.Z3(this.V3(v), v);
    }

    private int X3(int v) {
        return this.s == 1 ? this.c4(this.b.mRecycler, this.b.mState, v) : this.d4(this.b.mRecycler, this.b.mState, v);
    }

    private Set Y3(int v) {
        return this.Z3(this.X3(v), v);
    }

    private Set Z3(int v, int v1) {
        Set set0 = new HashSet();
        int v2 = this.e4(this.b.mRecycler, this.b.mState, v1);
        for(int v3 = v; v3 < v + v2; ++v3) {
            set0.add(v3);
        }
        return set0;
    }

    int a4(int v, int v1) {
        return this.s != 1 || !this.l() ? this.Q[v1 + v] - this.Q[v] : this.Q[this.P - v] - this.Q[this.P - v - v1];
    }

    public int b4() {
        return this.P;
    }

    private int c4(Recycler recyclerView$Recycler0, State recyclerView$State0, int v) {
        if(!recyclerView$State0.j()) {
            return this.U.b(v, this.P);
        }
        int v1 = recyclerView$Recycler0.g(v);
        if(v1 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + v);
            return 0;
        }
        return this.U.b(v1, this.P);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams d0() {
        return this.s == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    private int d4(Recycler recyclerView$Recycler0, State recyclerView$State0, int v) {
        if(!recyclerView$State0.j()) {
            return this.U.c(v, this.P);
        }
        int v1 = this.T.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = recyclerView$Recycler0.g(v);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + v);
            return 0;
        }
        return this.U.c(v2, this.P);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams e0(Context context0, AttributeSet attributeSet0) {
        return new LayoutParams(context0, attributeSet0);
    }

    private int e4(Recycler recyclerView$Recycler0, State recyclerView$State0, int v) {
        if(!recyclerView$State0.j()) {
            return this.U.f(v);
        }
        int v1 = this.S.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = recyclerView$Recycler0.g(v);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + v);
            return 1;
        }
        return this.U.f(v2);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams f0(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    void f3(Recycler recyclerView$Recycler0, State recyclerView$State0, LayoutState linearLayoutManager$LayoutState0, LayoutChunkResult linearLayoutManager$LayoutChunkResult0) {
        int v31;
        int v29;
        int v28;
        int v27;
        int v24;
        int v23;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v16;
        int v15;
        int v = this.u.m();
        int v1 = this.j0() <= 0 ? 0 : this.Q[this.P];
        if(v != 0x40000000) {
            this.o4();
        }
        boolean z = linearLayoutManager$LayoutState0.e == 1;
        int v2 = z ? this.P : this.d4(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$LayoutState0.d) + this.e4(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$LayoutState0.d);
        int v3;
        for(v3 = 0; v3 < this.P && linearLayoutManager$LayoutState0.c(recyclerView$State0) && v2 > 0; ++v3) {
            int v4 = linearLayoutManager$LayoutState0.d;
            int v5 = this.e4(recyclerView$Recycler0, recyclerView$State0, v4);
            if(v5 > this.P) {
                throw new IllegalArgumentException("Item at position " + v4 + " requires " + v5 + " spans but GridLayoutManager has only " + this.P + " spans.");
            }
            v2 -= v5;
            if(v2 < 0) {
                break;
            }
            View view0 = linearLayoutManager$LayoutState0.e(recyclerView$Recycler0);
            if(view0 == null) {
                break;
            }
            this.R[v3] = view0;
        }
        if(v3 == 0) {
            linearLayoutManager$LayoutChunkResult0.b = true;
            return;
        }
        this.F3(recyclerView$Recycler0, recyclerView$State0, v3, z);
        float f = 0.0f;
        int v7 = 0;
        for(int v6 = 0; v6 < v3; ++v6) {
            View view1 = this.R[v6];
            if(linearLayoutManager$LayoutState0.l == null) {
                if(z) {
                    this.x(view1);
                }
                else {
                    this.y(view1, 0);
                }
            }
            else if(z) {
                this.v(view1);
            }
            else {
                this.w(view1, 0);
            }
            this.F(view1, this.V);
            this.j4(view1, v, false);
            int v8 = this.u.e(view1);
            if(v8 > v7) {
                v7 = v8;
            }
            LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
            float f1 = ((float)this.u.f(view1)) * 1.0f / ((float)gridLayoutManager$LayoutParams0.f);
            if(f1 > f) {
                f = f1;
            }
        }
        if(v != 0x40000000) {
            this.g4(f, v1);
            v7 = 0;
            for(int v9 = 0; v9 < v3; ++v9) {
                View view2 = this.R[v9];
                this.j4(view2, 0x40000000, true);
                int v10 = this.u.e(view2);
                if(v10 > v7) {
                    v7 = v10;
                }
            }
        }
        for(int v11 = 0; v11 < v3; ++v11) {
            View view3 = this.R[v11];
            if(this.u.e(view3) != v7) {
                LayoutParams gridLayoutManager$LayoutParams1 = (LayoutParams)view3.getLayoutParams();
                int v12 = gridLayoutManager$LayoutParams1.b.top + gridLayoutManager$LayoutParams1.b.bottom + gridLayoutManager$LayoutParams1.topMargin + gridLayoutManager$LayoutParams1.bottomMargin;
                int v13 = gridLayoutManager$LayoutParams1.b.left + gridLayoutManager$LayoutParams1.b.right + gridLayoutManager$LayoutParams1.leftMargin + gridLayoutManager$LayoutParams1.rightMargin;
                int v14 = this.a4(gridLayoutManager$LayoutParams1.e, gridLayoutManager$LayoutParams1.f);
                if(this.s == 1) {
                    v15 = LayoutManager.k0(v14, 0x40000000, v13, gridLayoutManager$LayoutParams1.width, false);
                    v16 = View.MeasureSpec.makeMeasureSpec(v7 - v12, 0x40000000);
                }
                else {
                    int v17 = View.MeasureSpec.makeMeasureSpec(v7 - v13, 0x40000000);
                    v16 = LayoutManager.k0(v14, 0x40000000, v12, gridLayoutManager$LayoutParams1.height, false);
                    v15 = v17;
                }
                this.k4(view3, v15, v16, true);
            }
        }
        linearLayoutManager$LayoutChunkResult0.a = v7;
        if(this.s == 1) {
            if(linearLayoutManager$LayoutState0.f == -1) {
                v18 = linearLayoutManager$LayoutState0.b;
                v19 = v18 - v7;
            }
            else {
                v19 = linearLayoutManager$LayoutState0.b;
                v18 = v19 + v7;
            }
            v20 = v19;
            v21 = 0;
            v22 = 0;
        }
        else {
            if(linearLayoutManager$LayoutState0.f == -1) {
                v23 = linearLayoutManager$LayoutState0.b;
                v24 = v23 - v7;
            }
            else {
                v24 = linearLayoutManager$LayoutState0.b;
                v23 = v24 + v7;
            }
            v22 = v24;
            v20 = 0;
            v21 = v23;
            v18 = 0;
        }
        int v25 = 0;
        while(v25 < v3) {
            View view4 = this.R[v25];
            LayoutParams gridLayoutManager$LayoutParams2 = (LayoutParams)view4.getLayoutParams();
            if(this.s == 1) {
                if(this.l()) {
                    int v26 = this.G0() + this.Q[this.P - gridLayoutManager$LayoutParams2.e];
                    v27 = v18;
                    v28 = v26;
                    v29 = v26 - this.u.f(view4);
                }
                else {
                    int v30 = this.G0() + this.Q[gridLayoutManager$LayoutParams2.e];
                    v27 = v18;
                    v29 = v30;
                    v28 = this.u.f(view4) + v30;
                }
                v31 = v20;
            }
            else {
                int v32 = this.J0() + this.Q[gridLayoutManager$LayoutParams2.e];
                v31 = v32;
                v28 = v21;
                v29 = v22;
                v27 = this.u.f(view4) + v32;
            }
            this.i1(view4, v29, v31, v28, v27);
            if(gridLayoutManager$LayoutParams2.g() || gridLayoutManager$LayoutParams2.f()) {
                linearLayoutManager$LayoutChunkResult0.c = true;
            }
            linearLayoutManager$LayoutChunkResult0.d |= view4.hasFocusable();
            ++v25;
            v18 = v27;
            v21 = v28;
            v22 = v29;
            v20 = v31;
        }
        Arrays.fill(this.R, null);
    }

    public SpanSizeLookup f4() {
        return this.U;
    }

    private void g4(float f, int v) {
        this.H3(Math.max(Math.round(f * ((float)this.P)), v));
    }

    // 去混淆评级： 低(20)
    private boolean h4(int v) {
        return !this.Y3(v).contains(this.Y) || !this.W3(v).contains(this.Z);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    void i3(Recycler recyclerView$Recycler0, State recyclerView$State0, AnchorInfo linearLayoutManager$AnchorInfo0, int v) {
        super.i3(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$AnchorInfo0, v);
        this.o4();
        if(recyclerView$State0.d() > 0 && !recyclerView$State0.j()) {
            this.M3(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$AnchorInfo0, v);
        }
        this.N3();
    }

    public boolean i4() {
        return this.W;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int j2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.o4();
        this.N3();
        return super.j2(v, recyclerView$Recycler0, recyclerView$State0);
    }

    private void j4(View view0, int v, boolean z) {
        int v5;
        int v4;
        LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = gridLayoutManager$LayoutParams0.b.top + gridLayoutManager$LayoutParams0.b.bottom + gridLayoutManager$LayoutParams0.topMargin + gridLayoutManager$LayoutParams0.bottomMargin;
        int v2 = gridLayoutManager$LayoutParams0.b.left + gridLayoutManager$LayoutParams0.b.right + gridLayoutManager$LayoutParams0.leftMargin + gridLayoutManager$LayoutParams0.rightMargin;
        int v3 = this.a4(gridLayoutManager$LayoutParams0.e, gridLayoutManager$LayoutParams0.f);
        if(this.s == 1) {
            v4 = LayoutManager.k0(v3, v, v2, gridLayoutManager$LayoutParams0.width, false);
            v5 = LayoutManager.k0(this.u.o(), this.y0(), v1, gridLayoutManager$LayoutParams0.height, true);
        }
        else {
            v5 = LayoutManager.k0(v3, v, v1, gridLayoutManager$LayoutParams0.height, false);
            v4 = LayoutManager.k0(this.u.o(), this.S0(), v2, gridLayoutManager$LayoutParams0.width, true);
        }
        this.k4(view0, v4, v5, z);
    }

    private void k4(View view0, int v, int v1, boolean z) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams)view0.getLayoutParams();
        if((z ? this.x2(view0, v, v1, recyclerView$LayoutParams0) : this.v2(view0, v, v1, recyclerView$LayoutParams0))) {
            view0.measure(v, v1);
        }
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.o4();
        this.N3();
        return super.l2(v, recyclerView$Recycler0, recyclerView$State0);
    }

    public void l4(int v) {
        if(v == this.P) {
            return;
        }
        this.O = true;
        if(v < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + v);
        }
        this.P = v;
        this.U.h();
        this.g2();
    }

    public void m4(SpanSizeLookup gridLayoutManager$SpanSizeLookup0) {
        this.U = gridLayoutManager$SpanSizeLookup0;
    }

    public void n4(boolean z) {
        this.W = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int o0(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.s == 1) {
            return Math.min(this.P, this.getItemCount());
        }
        return recyclerView$State0.d() >= 1 ? this.c4(recyclerView$Recycler0, recyclerView$State0, recyclerView$State0.d() - 1) + 1 : 0;
    }

    private void o4() {
        int v1;
        int v;
        if(this.b3() == 1) {
            v = this.R0() - this.H0();
            v1 = this.G0();
        }
        else {
            v = this.x0() - this.E0();
            v1 = this.J0();
        }
        this.H3(v - v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void r2(Rect rect0, int v, int v1) {
        int v5;
        int v4;
        if(this.Q == null) {
            super.r2(rect0, v, v1);
        }
        int v2 = this.G0() + this.H0();
        int v3 = this.J0() + this.E0();
        if(this.s == 1) {
            v4 = LayoutManager.J(v1, rect0.height() + v3, this.C0());
            v5 = LayoutManager.J(v, this.Q[this.Q.length - 1] + v2, this.D0());
        }
        else {
            v5 = LayoutManager.J(v, rect0.width() + v2, this.D0());
            v4 = LayoutManager.J(v1, this.Q[this.Q.length - 1] + v3, this.C0());
        }
        this.q2(v5, v4);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public View t1(View view0, int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v17;
        int v16;
        int v15;
        int v14;
        View view5;
        int v5;
        int v4;
        int v3;
        View view1 = this.b0(view0);
        View view2 = null;
        if(view1 == null) {
            return null;
        }
        LayoutParams gridLayoutManager$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
        int v1 = gridLayoutManager$LayoutParams0.e;
        int v2 = gridLayoutManager$LayoutParams0.f + v1;
        if(super.t1(view0, v, recyclerView$Recycler0, recyclerView$State0) == null) {
            return null;
        }
        if(this.I2(v) == 1 == this.x) {
            v4 = this.j0();
            v3 = 0;
            v5 = 1;
        }
        else {
            v3 = this.j0() - 1;
            v4 = -1;
            v5 = -1;
        }
        int v6 = this.s != 1 || !this.l() ? 0 : 1;
        int v7 = this.c4(recyclerView$Recycler0, recyclerView$State0, v3);
        int v8 = v3;
        int v9 = 0;
        int v10 = -1;
        int v11 = -1;
        int v12 = 0;
        View view3 = null;
        while(v8 != v4) {
            int v13 = this.c4(recyclerView$Recycler0, recyclerView$State0, v8);
            View view4 = this.i0(v8);
            if(view4 == view1) {
                break;
            }
            if(!view4.hasFocusable() || v13 == v7) {
                LayoutParams gridLayoutManager$LayoutParams1 = (LayoutParams)view4.getLayoutParams();
                int v18 = gridLayoutManager$LayoutParams1.e;
                int v19 = gridLayoutManager$LayoutParams1.f + v18;
                if(view4.hasFocusable() && v18 == v1 && v19 == v2) {
                    return view4;
                }
                if((!view4.hasFocusable() || view2 != null) && (view4.hasFocusable() || view3 != null)) {
                    view5 = view3;
                    int v20 = Math.min(v19, v2) - Math.max(v18, v1);
                    if(view4.hasFocusable()) {
                        if(v20 <= v9 && (v20 != v9 || v6 != (v18 <= v10 ? 0 : 1))) {
                            v14 = v9;
                            v15 = v4;
                            v16 = v11;
                            v17 = v12;
                            goto label_95;
                        }
                        else {
                        label_49:
                            v14 = v9;
                            v15 = v4;
                            v16 = v11;
                            v17 = v12;
                            goto label_73;
                        }
                        goto label_59;
                    }
                    else {
                    label_59:
                        if(view2 == null) {
                            v14 = v9;
                            v15 = v4;
                            int v21 = 1;
                            if(this.g1(view4, false, true)) {
                                v17 = v12;
                                if(v20 > v17) {
                                    v16 = v11;
                                    goto label_73;
                                }
                                else if(v20 == v17) {
                                    v16 = v11;
                                    if(v18 <= v16) {
                                        v21 = 0;
                                    }
                                    if(v6 == v21) {
                                    label_73:
                                        if(view4.hasFocusable()) {
                                            v10 = gridLayoutManager$LayoutParams1.e;
                                            v11 = v16;
                                            v12 = v17;
                                            view3 = view5;
                                            view2 = view4;
                                            v9 = Math.min(v19, v2) - Math.max(v18, v1);
                                        }
                                        else {
                                            v12 = Math.min(v19, v2) - Math.max(v18, v1);
                                            v11 = gridLayoutManager$LayoutParams1.e;
                                            v9 = v14;
                                            view3 = view4;
                                        }
                                        goto label_99;
                                    }
                                }
                                else {
                                    v16 = v11;
                                }
                            }
                            else {
                                v16 = v11;
                                v17 = v12;
                            }
                        }
                        else {
                            v14 = v9;
                            v15 = v4;
                            v16 = v11;
                            v17 = v12;
                        }
                    }
                }
                else {
                    view5 = view3;
                    goto label_49;
                }
            }
            else {
                if(view2 != null) {
                    break;
                }
                view5 = view3;
                v14 = v9;
                v15 = v4;
                v16 = v11;
                v17 = v12;
            }
        label_95:
            v11 = v16;
            v12 = v17;
            v9 = v14;
            view3 = view5;
        label_99:
            v8 += v5;
            v4 = v15;
        }
        return view2 == null ? view3 : view2;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void v3(boolean z) {
        if(z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.v3(false);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void x1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.x1(recyclerView$Recycler0, recyclerView$State0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.k1("android.widget.GridView");
        Adapter recyclerView$Adapter0 = this.b.mAdapter;
        if(recyclerView$Adapter0 != null && recyclerView$Adapter0.getItemCount() > 1) {
            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.W);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void z1(Recycler recyclerView$Recycler0, State recyclerView$State0, View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            super.y1(view0, accessibilityNodeInfoCompat0);
            return;
        }
        int v = this.c4(recyclerView$Recycler0, recyclerView$State0, ((LayoutParams)viewGroup$LayoutParams0).d());
        if(this.s == 0) {
            accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(((LayoutParams)viewGroup$LayoutParams0).j(), ((LayoutParams)viewGroup$LayoutParams0).k(), v, 1, false, false));
            return;
        }
        accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(v, 1, ((LayoutParams)viewGroup$LayoutParams0).j(), ((LayoutParams)viewGroup$LayoutParams0).k(), false, false));
    }
}

