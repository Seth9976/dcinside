package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

public class LinearLayoutManager extends LayoutManager implements ViewDropHandler, ScrollVectorProvider {
    static class AnchorInfo {
        OrientationHelper a;
        int b;
        int c;
        boolean d;
        boolean e;

        AnchorInfo() {
            this.e();
        }

        void a() {
            this.c = this.d ? this.a.i() : this.a.n();
        }

        public void b(View view0, int v) {
            this.c = this.d ? this.a.d(view0) + this.a.p() : this.a.g(view0);
            this.b = v;
        }

        public void c(View view0, int v) {
            int v1 = this.a.p();
            if(v1 >= 0) {
                this.b(view0, v);
                return;
            }
            this.b = v;
            if(this.d) {
                int v2 = this.a.i() - v1 - this.a.d(view0);
                this.c = this.a.i() - v2;
                if(v2 > 0) {
                    int v3 = this.a.e(view0);
                    int v4 = this.c - v3;
                    int v5 = this.a.n();
                    int v6 = v4 - (v5 + Math.min(this.a.g(view0) - v5, 0));
                    if(v6 < 0) {
                        this.c += Math.min(v2, -v6);
                    }
                }
            }
            else {
                int v7 = this.a.g(view0);
                int v8 = v7 - this.a.n();
                this.c = v7;
                if(v8 > 0) {
                    int v9 = this.a.e(view0);
                    int v10 = this.a.i();
                    int v11 = this.a.d(view0);
                    int v12 = this.a.i() - Math.min(0, v10 - v1 - v11) - (v7 + v9);
                    if(v12 < 0) {
                        this.c -= Math.min(v8, -v12);
                    }
                }
            }
        }

        boolean d(View view0, State recyclerView$State0) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            return !recyclerView$LayoutParams0.g() && recyclerView$LayoutParams0.d() >= 0 && recyclerView$LayoutParams0.d() < recyclerView$State0.d();
        }

        void e() {
            this.b = -1;
            this.c = 0x80000000;
            this.d = false;
            this.e = false;
        }

        @Override
        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    public static class LayoutChunkResult {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class LayoutState {
        boolean a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        boolean j;
        int k;
        List l;
        boolean m;
        static final String n = "LLM#LayoutState";
        static final int o = -1;
        static final int p = 1;
        static final int q = 0x80000000;
        static final int r = -1;
        static final int s = 1;
        static final int t = 0x80000000;

        LayoutState() {
            this.a = true;
            this.h = 0;
            this.i = 0;
            this.j = false;
            this.l = null;
        }

        public void a() {
            this.b(null);
        }

        public void b(View view0) {
            View view1 = this.g(view0);
            if(view1 == null) {
                this.d = -1;
                return;
            }
            this.d = ((LayoutParams)view1.getLayoutParams()).d();
        }

        boolean c(State recyclerView$State0) {
            return this.d >= 0 && this.d < recyclerView$State0.d();
        }

        void d() {
            Log.d("LLM#LayoutState", "avail:" + this.c + ", ind:" + this.d + ", dir:" + this.e + ", offset:" + this.b + ", layoutDir:" + this.f);
        }

        View e(Recycler recyclerView$Recycler0) {
            if(this.l != null) {
                return this.f();
            }
            View view0 = recyclerView$Recycler0.p(this.d);
            this.d += this.e;
            return view0;
        }

        private View f() {
            int v = this.l.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = ((ViewHolder)this.l.get(v1)).itemView;
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(!recyclerView$LayoutParams0.g() && this.d == recyclerView$LayoutParams0.d()) {
                    this.b(view0);
                    return view0;
                }
            }
            return null;
        }

        public View g(View view0) {
            int v = this.l.size();
            View view1 = null;
            int v1 = 0x7FFFFFFF;
            for(int v2 = 0; v2 < v; ++v2) {
                View view2 = ((ViewHolder)this.l.get(v2)).itemView;
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
                if(view2 != view0 && !recyclerView$LayoutParams0.g()) {
                    int v3 = (recyclerView$LayoutParams0.d() - this.d) * this.e;
                    if(v3 >= 0 && v3 < v1) {
                        view1 = view2;
                        if(v3 == 0) {
                            break;
                        }
                        v1 = v3;
                    }
                }
            }
            return view1;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({Scope.a})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        int a;
        int b;
        boolean c;

        static {
            SavedState.CREATOR = new Parcelable.Creator() {
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
            };
        }

        public SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.a = parcel0.readInt();
            this.b = parcel0.readInt();
            this.c = parcel0.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState linearLayoutManager$SavedState0) {
            this.a = linearLayoutManager$SavedState0.a;
            this.b = linearLayoutManager$SavedState0.b;
            this.c = linearLayoutManager$SavedState0.c;
        }

        boolean a() {
            return this.a >= 0;
        }

        void c() {
            this.a = -1;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeInt(this.b);
            parcel0.writeInt(((int)this.c));
        }
    }

    int A;
    int B;
    private boolean C;
    SavedState D;
    final AnchorInfo E;
    private final LayoutChunkResult F;
    private int G;
    private int[] H;
    private static final String I = "LinearLayoutManager";
    static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 0x80000000;
    private static final float N = 0.333333f;
    int s;
    private LayoutState t;
    OrientationHelper u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context0) {
        this(context0, 1, false);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context0, int v, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = 0x80000000;
        this.D = null;
        this.E = new AnchorInfo();
        this.F = new LayoutChunkResult();
        this.G = 2;
        this.H = new int[2];
        this.s3(v);
        this.u3(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = 0x80000000;
        this.D = null;
        this.E = new AnchorInfo();
        this.F = new LayoutChunkResult();
        this.G = 2;
        this.H = new int[2];
        Properties recyclerView$LayoutManager$Properties0 = LayoutManager.L0(context0, attributeSet0, v, v1);
        this.s3(recyclerView$LayoutManager$Properties0.a);
        this.u3(recyclerView$LayoutManager$Properties0.c);
        this.v3(recyclerView$LayoutManager$Properties0.d);
    }

    private void A3(int v, int v1) {
        LayoutState linearLayoutManager$LayoutState0 = this.t;
        linearLayoutManager$LayoutState0.c = this.u.i() - v1;
        this.t.e = this.x ? -1 : 1;
        this.t.d = v;
        this.t.f = 1;
        this.t.b = v1;
        this.t.g = 0x80000000;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void B(String s) {
        if(this.D == null) {
            super.B(s);
        }
    }

    private void B3(AnchorInfo linearLayoutManager$AnchorInfo0) {
        this.A3(linearLayoutManager$AnchorInfo0.b, linearLayoutManager$AnchorInfo0.c);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean C2() {
        return this.D == null && this.v == this.y;
    }

    private void C3(int v, int v1) {
        LayoutState linearLayoutManager$LayoutState0 = this.t;
        linearLayoutManager$LayoutState0.c = v1 - this.u.n();
        this.t.d = v;
        this.t.e = this.x ? 1 : -1;
        this.t.f = -1;
        this.t.b = v1;
        this.t.g = 0x80000000;
    }

    protected void D2(@NonNull State recyclerView$State0, @NonNull int[] arr_v) {
        int v1;
        int v = this.Z2(recyclerView$State0);
        if(this.t.f == -1) {
            v1 = 0;
        }
        else {
            v1 = v;
            v = 0;
        }
        arr_v[0] = v;
        arr_v[1] = v1;
    }

    private void D3(AnchorInfo linearLayoutManager$AnchorInfo0) {
        this.C3(linearLayoutManager$AnchorInfo0.b, linearLayoutManager$AnchorInfo0.c);
    }

    void E2(State recyclerView$State0, LayoutState linearLayoutManager$LayoutState0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v = linearLayoutManager$LayoutState0.d;
        if(v >= 0 && v < recyclerView$State0.d()) {
            recyclerView$LayoutManager$LayoutPrefetchRegistry0.a(v, Math.max(0, linearLayoutManager$LayoutState0.g));
        }
    }

    void E3() {
        Log.d("LinearLayoutManager", "validating child count " + this.j0());
        boolean z = true;
        if(this.j0() < 1) {
            return;
        }
        int v = this.K0(this.i0(0));
        int v1 = this.u.g(this.i0(0));
        if(this.x) {
            int v2 = 1;
            while(v2 < this.j0()) {
                View view0 = this.i0(v2);
                int v3 = this.K0(view0);
                int v4 = this.u.g(view0);
                if(v3 < v) {
                    this.h3();
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("detected invalid position. loc invalid? ");
                    if(v4 >= v1) {
                        z = false;
                    }
                    stringBuilder0.append(z);
                    throw new RuntimeException(stringBuilder0.toString());
                }
                if(v4 <= v1) {
                    ++v2;
                    continue;
                }
                this.h3();
                throw new RuntimeException("detected invalid location");
            }
        }
        else {
            int v5 = 1;
            while(v5 < this.j0()) {
                View view1 = this.i0(v5);
                int v6 = this.K0(view1);
                int v7 = this.u.g(view1);
                if(v6 < v) {
                    this.h3();
                    StringBuilder stringBuilder1 = new StringBuilder();
                    stringBuilder1.append("detected invalid position. loc invalid? ");
                    if(v7 >= v1) {
                        z = false;
                    }
                    stringBuilder1.append(z);
                    throw new RuntimeException(stringBuilder1.toString());
                }
                if(v7 >= v1) {
                    ++v5;
                    continue;
                }
                this.h3();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    private int F2(State recyclerView$State0) {
        if(this.j0() == 0) {
            return 0;
        }
        this.K2();
        return ScrollbarHelper.a(recyclerView$State0, this.u, this.O2(!this.z, true), this.N2(!this.z, true), this, this.z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean G() {
        return this.s == 0;
    }

    private int G2(State recyclerView$State0) {
        if(this.j0() == 0) {
            return 0;
        }
        this.K2();
        return ScrollbarHelper.b(recyclerView$State0, this.u, this.O2(!this.z, true), this.N2(!this.z, true), this, this.z, this.x);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean H() {
        return this.s == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v19;
        int v18;
        int v17;
        int v11;
        int v8;
        int v6;
        int v5;
        int v = -1;
        if((this.D != null || this.A != -1) && recyclerView$State0.d() == 0) {
            this.W1(recyclerView$Recycler0);
            return;
        }
        if(this.D != null && this.D.a()) {
            this.A = this.D.a;
        }
        this.K2();
        this.t.a = false;
        this.o3();
        View view0 = this.w0();
        AnchorInfo linearLayoutManager$AnchorInfo0 = this.E;
        if(!linearLayoutManager$AnchorInfo0.e || this.A != -1 || this.D != null) {
            linearLayoutManager$AnchorInfo0.e();
            this.E.d = this.x ^ this.y;
            this.y3(recyclerView$Recycler0, recyclerView$State0, this.E);
            this.E.e = true;
        }
        else if(view0 != null && (this.u.g(view0) >= this.u.i() || this.u.d(view0) <= this.u.n())) {
            int v1 = this.K0(view0);
            this.E.c(view0, v1);
        }
        this.t.f = this.t.k < 0 ? -1 : 1;
        int[] arr_v = this.H;
        arr_v[0] = 0;
        arr_v[1] = 0;
        this.D2(recyclerView$State0, arr_v);
        int v2 = Math.max(0, this.H[0]) + this.u.n();
        int v3 = Math.max(0, this.H[1]) + this.u.j();
        if(recyclerView$State0.j()) {
            int v4 = this.A;
            if(v4 != -1 && this.B != 0x80000000) {
                View view1 = this.c0(v4);
                if(view1 != null) {
                    if(this.x) {
                        v5 = this.u.i() - this.u.d(view1);
                        v6 = this.B;
                    }
                    else {
                        v6 = this.u.g(view1) - this.u.n();
                        v5 = this.B;
                    }
                    int v7 = v5 - v6;
                    if(v7 > 0) {
                        v2 += v7;
                    }
                    else {
                        v3 -= v7;
                    }
                }
            }
        }
        AnchorInfo linearLayoutManager$AnchorInfo1 = this.E;
        if(!linearLayoutManager$AnchorInfo1.d) {
            if(!this.x) {
                v = 1;
            }
        }
        else if(this.x) {
            v = 1;
        }
        this.i3(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$AnchorInfo1, v);
        this.S(recyclerView$Recycler0);
        LayoutState linearLayoutManager$LayoutState0 = this.t;
        linearLayoutManager$LayoutState0.m = this.n3();
        this.t.j = recyclerView$State0.j();
        this.t.i = 0;
        AnchorInfo linearLayoutManager$AnchorInfo2 = this.E;
        if(linearLayoutManager$AnchorInfo2.d) {
            this.D3(linearLayoutManager$AnchorInfo2);
            this.t.h = v2;
            this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            v8 = this.t.b;
            int v9 = this.t.d;
            int v10 = this.t.c;
            if(v10 > 0) {
                v3 += v10;
            }
            this.B3(this.E);
            this.t.h = v3;
            this.t.d += this.t.e;
            this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            v11 = this.t.b;
            int v12 = this.t.c;
            if(v12 > 0) {
                this.C3(v9, v8);
                this.t.h = v12;
                this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
                v8 = this.t.b;
            }
        }
        else {
            this.B3(linearLayoutManager$AnchorInfo2);
            this.t.h = v3;
            this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            v11 = this.t.b;
            int v13 = this.t.d;
            int v14 = this.t.c;
            if(v14 > 0) {
                v2 += v14;
            }
            this.D3(this.E);
            this.t.h = v2;
            this.t.d += this.t.e;
            this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            v8 = this.t.b;
            int v15 = this.t.c;
            if(v15 > 0) {
                this.A3(v13, v11);
                this.t.h = v15;
                this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
                v11 = this.t.b;
            }
        }
        if(this.j0() > 0) {
            if((this.x ^ this.y) == 0) {
                int v20 = this.W2(v8, recyclerView$Recycler0, recyclerView$State0, true);
                v17 = v8 + v20;
                v18 = v11 + v20;
                v19 = this.V2(v18, recyclerView$Recycler0, recyclerView$State0, false);
            }
            else {
                int v16 = this.V2(v11, recyclerView$Recycler0, recyclerView$State0, true);
                v17 = v8 + v16;
                v18 = v11 + v16;
                v19 = this.W2(v17, recyclerView$Recycler0, recyclerView$State0, false);
            }
            v8 = v17 + v19;
            v11 = v18 + v19;
        }
        this.g3(recyclerView$Recycler0, recyclerView$State0, v8, v11);
        if(recyclerView$State0.j()) {
            this.E.e();
        }
        else {
            this.u.u();
        }
        this.v = this.y;
    }

    private int H2(State recyclerView$State0) {
        if(this.j0() == 0) {
            return 0;
        }
        this.K2();
        return ScrollbarHelper.c(recyclerView$State0, this.u, this.O2(!this.z, true), this.N2(!this.z, true), this, this.z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void I1(State recyclerView$State0) {
        super.I1(recyclerView$State0);
        this.D = null;
        this.A = -1;
        this.B = 0x80000000;
        this.E.e();
    }

    int I2(int v) {
        switch(v) {
            case 1: {
                if(this.s == 1) {
                    return -1;
                }
                return this.l() ? 1 : -1;
            }
            case 2: {
                if(this.s == 1) {
                    return 1;
                }
                return this.l() ? -1 : 1;
            }
            case 17: {
                return this.s == 0 ? -1 : 0x80000000;
            }
            case 33: {
                return this.s == 1 ? -1 : 0x80000000;
            }
            case 66: {
                return this.s == 0 ? 1 : 0x80000000;
            }
            case 130: {
                return this.s == 1 ? 1 : 0x80000000;
            }
            default: {
                return 0x80000000;
            }
        }
    }

    LayoutState J2() {
        return new LayoutState();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void K(int v, int v1, State recyclerView$State0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        if(this.s != 0) {
            v = v1;
        }
        if(this.j0() != 0 && v != 0) {
            this.K2();
            this.z3((v <= 0 ? -1 : 1), Math.abs(v), true, recyclerView$State0);
            this.E2(recyclerView$State0, this.t, recyclerView$LayoutManager$LayoutPrefetchRegistry0);
        }
    }

    void K2() {
        if(this.t == null) {
            this.t = this.J2();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void L(int v, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v2;
        boolean z;
        int v1 = -1;
        if(this.D == null || !this.D.a()) {
            this.o3();
            z = this.x;
            v2 = this.A;
            if(v2 == -1) {
                v2 = z ? v - 1 : 0;
            }
        }
        else {
            z = this.D.c;
            v2 = this.D.a;
        }
        if(!z) {
            v1 = 1;
        }
        for(int v3 = 0; v3 < this.G && v2 >= 0 && v2 < v; ++v3) {
            recyclerView$LayoutManager$LayoutPrefetchRegistry0.a(v2, 0);
            v2 += v1;
        }
    }

    int L2(Recycler recyclerView$Recycler0, LayoutState linearLayoutManager$LayoutState0, State recyclerView$State0, boolean z) {
        int v = linearLayoutManager$LayoutState0.c;
        int v1 = linearLayoutManager$LayoutState0.g;
        if(v1 != 0x80000000) {
            if(v < 0) {
                linearLayoutManager$LayoutState0.g = v1 + v;
            }
            this.j3(recyclerView$Recycler0, linearLayoutManager$LayoutState0);
        }
        int v2 = linearLayoutManager$LayoutState0.c + linearLayoutManager$LayoutState0.h;
        LayoutChunkResult linearLayoutManager$LayoutChunkResult0 = this.F;
        while((linearLayoutManager$LayoutState0.m || v2 > 0) && linearLayoutManager$LayoutState0.c(recyclerView$State0)) {
            linearLayoutManager$LayoutChunkResult0.a();
            this.f3(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$LayoutState0, linearLayoutManager$LayoutChunkResult0);
            if(linearLayoutManager$LayoutChunkResult0.b) {
                break;
            }
            linearLayoutManager$LayoutState0.b += linearLayoutManager$LayoutChunkResult0.a * linearLayoutManager$LayoutState0.f;
            if(!linearLayoutManager$LayoutChunkResult0.c || linearLayoutManager$LayoutState0.l != null || !recyclerView$State0.j()) {
                linearLayoutManager$LayoutState0.c -= linearLayoutManager$LayoutChunkResult0.a;
                v2 -= linearLayoutManager$LayoutChunkResult0.a;
            }
            int v3 = linearLayoutManager$LayoutState0.g;
            if(v3 != 0x80000000) {
                int v4 = v3 + linearLayoutManager$LayoutChunkResult0.a;
                linearLayoutManager$LayoutState0.g = v4;
                int v5 = linearLayoutManager$LayoutState0.c;
                if(v5 < 0) {
                    linearLayoutManager$LayoutState0.g = v4 + v5;
                }
                this.j3(recyclerView$Recycler0, linearLayoutManager$LayoutState0);
            }
            if(z && linearLayoutManager$LayoutChunkResult0.d) {
                break;
            }
        }
        return v - linearLayoutManager$LayoutState0.c;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int M(State recyclerView$State0) {
        return this.F2(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void M1(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.D = (SavedState)parcelable0;
            if(this.A != -1) {
                ((SavedState)parcelable0).c();
            }
            this.g2();
        }
    }

    private View M2() {
        return this.Q2(0, this.j0());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int N(State recyclerView$State0) {
        return this.G2(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable N1() {
        if(this.D != null) {
            return new SavedState(this.D);
        }
        Parcelable parcelable0 = new SavedState();
        if(this.j0() > 0) {
            this.K2();
            int v = this.v ^ this.x;
            parcelable0.c = v;
            if(v != 0) {
                View view0 = this.X2();
                parcelable0.b = this.u.i() - this.u.d(view0);
                parcelable0.a = this.K0(view0);
                return parcelable0;
            }
            View view1 = this.Y2();
            parcelable0.a = this.K0(view1);
            parcelable0.b = this.u.g(view1) - this.u.n();
            return parcelable0;
        }
        ((SavedState)parcelable0).c();
        return parcelable0;
    }

    // 去混淆评级： 低(20)
    View N2(boolean z, boolean z1) {
        return this.x ? this.R2(0, this.j0(), z, z1) : this.R2(this.j0() - 1, -1, z, z1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int O(State recyclerView$State0) {
        return this.H2(recyclerView$State0);
    }

    // 去混淆评级： 低(20)
    View O2(boolean z, boolean z1) {
        return this.x ? this.R2(this.j0() - 1, -1, z, z1) : this.R2(0, this.j0(), z, z1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int P(State recyclerView$State0) {
        return this.F2(recyclerView$State0);
    }

    private View P2() {
        return this.Q2(this.j0() - 1, -1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int Q(State recyclerView$State0) {
        return this.G2(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    boolean Q1(int v, @Nullable Bundle bundle0) {
        int v2;
        if(super.Q1(v, bundle0)) {
            return true;
        }
        if(v == 0x1020037 && bundle0 != null) {
            if(this.s == 1) {
                int v1 = bundle0.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if(v1 < 0) {
                    return false;
                }
                v2 = Math.min(v1, this.N0(this.b.mRecycler, this.b.mState) - 1);
            }
            else {
                int v3 = bundle0.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if(v3 < 0) {
                    return false;
                }
                v2 = Math.min(v3, this.o0(this.b.mRecycler, this.b.mState) - 1);
            }
            if(v2 >= 0) {
                this.q3(v2, 0);
                return true;
            }
        }
        return false;
    }

    View Q2(int v, int v1) {
        this.K2();
        if(v1 > v || v1 < v) {
            if(this.u.g(this.i0(v)) < this.u.n()) {
                return this.s == 0 ? this.e.a(v, v1, 0x4104, 0x4004) : this.f.a(v, v1, 0x4104, 0x4004);
            }
            return this.s == 0 ? this.e.a(v, v1, 0x1041, 0x1001) : this.f.a(v, v1, 0x1041, 0x1001);
        }
        return this.i0(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int R(State recyclerView$State0) {
        return this.H2(recyclerView$State0);
    }

    View R2(int v, int v1, boolean z, boolean z1) {
        this.K2();
        int v2 = 320;
        int v3 = z ? 0x6003 : 320;
        if(!z1) {
            v2 = 0;
        }
        return this.s == 0 ? this.e.a(v, v1, v3, v2) : this.f.a(v, v1, v3, v2);
    }

    // 去混淆评级： 低(20)
    private View S2() {
        return this.x ? this.M2() : this.P2();
    }

    // 去混淆评级： 低(20)
    private View T2() {
        return this.x ? this.P2() : this.M2();
    }

    View U2(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z, boolean z1) {
        int v3;
        int v2;
        int v1;
        this.K2();
        int v = this.j0();
        if(z1) {
            v1 = this.j0() - 1;
            v2 = -1;
            v3 = -1;
        }
        else {
            v2 = v;
            v1 = 0;
            v3 = 1;
        }
        int v4 = recyclerView$State0.d();
        int v5 = this.u.n();
        int v6 = this.u.i();
        View view0 = null;
        View view1 = null;
        View view2 = null;
        while(v1 != v2) {
            View view3 = this.i0(v1);
            int v7 = this.K0(view3);
            int v8 = this.u.g(view3);
            int v9 = this.u.d(view3);
            if(v7 >= 0 && v7 < v4) {
                if(!((LayoutParams)view3.getLayoutParams()).g()) {
                    boolean z2 = v9 <= v5 && v8 < v5;
                    boolean z3 = v8 >= v6 && v9 > v6;
                    if(!z2 && !z3) {
                        return view3;
                    }
                    if(!z) {
                        if(z2) {
                            view1 = view3;
                        }
                        else if(view0 == null) {
                            view0 = view3;
                        }
                    }
                    else if(z3) {
                        view1 = view3;
                    }
                    else if(view0 == null) {
                        view0 = view3;
                    }
                }
                else if(view2 == null) {
                    view2 = view3;
                }
            }
            v1 += v3;
        }
        if(view0 == null) {
            return view1 == null ? view2 : view1;
        }
        return view0;
    }

    private int V2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v1 = this.u.i() - v;
        if(v1 > 0) {
            int v2 = this.p3(-v1, recyclerView$Recycler0, recyclerView$State0);
            if(z) {
                int v3 = this.u.i() - (v - v2);
                if(v3 > 0) {
                    this.u.t(v3);
                    return v3 - v2;
                }
            }
            return -v2;
        }
        return 0;
    }

    private int W2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v1 = v - this.u.n();
        if(v1 > 0) {
            int v2 = -this.p3(v1, recyclerView$Recycler0, recyclerView$State0);
            if(z) {
                int v3 = v + v2 - this.u.n();
                if(v3 > 0) {
                    this.u.t(-v3);
                    return v2 - v3;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean X0() {
        return true;
    }

    // 去混淆评级： 低(20)
    private View X2() {
        return this.x ? this.i0(0) : this.i0(this.j0() - 1);
    }

    // 去混淆评级： 低(20)
    private View Y2() {
        return this.x ? this.i0(this.j0() - 1) : this.i0(0);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    protected int Z2(State recyclerView$State0) {
        return recyclerView$State0.h() ? this.u.o() : 0;
    }

    public int a3() {
        return this.G;
    }

    public int b3() {
        return this.s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View c0(int v) {
        int v1 = this.j0();
        if(v1 == 0) {
            return null;
        }
        int v2 = v - this.K0(this.i0(0));
        if(v2 >= 0 && v2 < v1) {
            View view0 = this.i0(v2);
            return this.K0(view0) == v ? view0 : super.c0(v);
        }
        return super.c0(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean c1() {
        return this.w;
    }

    public boolean c3() {
        return this.C;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public LayoutParams d0() {
        return new LayoutParams(-2, -2);
    }

    public boolean d3() {
        return this.w;
    }

    public boolean e3() {
        return this.y;
    }

    public int f() {
        View view0 = this.R2(0, this.j0(), true, false);
        return view0 == null ? -1 : this.K0(view0);
    }

    void f3(Recycler recyclerView$Recycler0, State recyclerView$State0, LayoutState linearLayoutManager$LayoutState0, LayoutChunkResult linearLayoutManager$LayoutChunkResult0) {
        int v4;
        int v3;
        int v2;
        int v1;
        int v;
        View view0 = linearLayoutManager$LayoutState0.e(recyclerView$Recycler0);
        if(view0 == null) {
            linearLayoutManager$LayoutChunkResult0.b = true;
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(linearLayoutManager$LayoutState0.l != null) {
            if(this.x == (linearLayoutManager$LayoutState0.f == -1)) {
                this.v(view0);
            }
            else {
                this.w(view0, 0);
            }
        }
        else if(this.x == (linearLayoutManager$LayoutState0.f == -1)) {
            this.x(view0);
        }
        else {
            this.y(view0, 0);
        }
        this.k1(view0, 0, 0);
        linearLayoutManager$LayoutChunkResult0.a = this.u.e(view0);
        if(this.s == 1) {
            if(this.l()) {
                v = this.R0() - this.H0();
                v1 = v - this.u.f(view0);
            }
            else {
                v1 = this.G0();
                v = this.u.f(view0) + v1;
            }
            if(linearLayoutManager$LayoutState0.f == -1) {
                v2 = linearLayoutManager$LayoutState0.b;
                v3 = v;
                v4 = linearLayoutManager$LayoutState0.b - linearLayoutManager$LayoutChunkResult0.a;
            }
            else {
                v4 = linearLayoutManager$LayoutState0.b;
                v3 = v;
                v2 = linearLayoutManager$LayoutChunkResult0.a + linearLayoutManager$LayoutState0.b;
            }
        }
        else {
            int v5 = this.J0();
            int v6 = this.u.f(view0) + v5;
            if(linearLayoutManager$LayoutState0.f == -1) {
                v3 = linearLayoutManager$LayoutState0.b;
                v4 = v5;
                v2 = v6;
                v1 = linearLayoutManager$LayoutState0.b - linearLayoutManager$LayoutChunkResult0.a;
            }
            else {
                v4 = v5;
                v3 = linearLayoutManager$LayoutChunkResult0.a + linearLayoutManager$LayoutState0.b;
                v2 = v6;
                v1 = linearLayoutManager$LayoutState0.b;
            }
        }
        this.i1(view0, v1, v4, v3, v2);
        if(((LayoutParams)viewGroup$LayoutParams0).g() || ((LayoutParams)viewGroup$LayoutParams0).f()) {
            linearLayoutManager$LayoutChunkResult0.c = true;
        }
        linearLayoutManager$LayoutChunkResult0.d = view0.hasFocusable();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF g(int v) {
        if(this.j0() == 0) {
            return null;
        }
        boolean z = false;
        int v1 = 1;
        if(v < this.K0(this.i0(0))) {
            z = true;
        }
        if(z != this.x) {
            v1 = -1;
        }
        return this.s == 0 ? new PointF(((float)v1), 0.0f) : new PointF(0.0f, ((float)v1));
    }

    private void g3(Recycler recyclerView$Recycler0, State recyclerView$State0, int v, int v1) {
        if(recyclerView$State0.n() && this.j0() != 0 && !recyclerView$State0.j() && this.C2()) {
            List list0 = recyclerView$Recycler0.l();
            int v2 = list0.size();
            int v3 = this.K0(this.i0(0));
            int v5 = 0;
            int v6 = 0;
            for(int v4 = 0; v4 < v2; ++v4) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)list0.get(v4);
                if(!recyclerView$ViewHolder0.isRemoved()) {
                    if(recyclerView$ViewHolder0.getLayoutPosition() < v3 == this.x) {
                        v6 += this.u.e(recyclerView$ViewHolder0.itemView);
                    }
                    else {
                        v5 += this.u.e(recyclerView$ViewHolder0.itemView);
                    }
                }
            }
            this.t.l = list0;
            if(v5 > 0) {
                this.C3(this.K0(this.Y2()), v);
                this.t.h = v5;
                this.t.c = 0;
                this.t.a();
                this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            }
            if(v6 > 0) {
                this.A3(this.K0(this.X2()), v1);
                this.t.h = v6;
                this.t.c = 0;
                this.t.a();
                this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            }
            this.t.l = null;
        }
    }

    public boolean h() {
        return this.z;
    }

    private void h3() {
        Log.d("LinearLayoutManager", "internal representation of views on the screen");
        for(int v = 0; v < this.j0(); ++v) {
            View view0 = this.i0(v);
            Log.d("LinearLayoutManager", "item " + this.K0(view0) + ", coord:" + this.u.g(view0));
        }
        Log.d("LinearLayoutManager", "==============");
    }

    public int i() {
        View view0 = this.R2(this.j0() - 1, -1, false, true);
        return view0 == null ? -1 : this.K0(view0);
    }

    void i3(Recycler recyclerView$Recycler0, State recyclerView$State0, AnchorInfo linearLayoutManager$AnchorInfo0, int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int j2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.s == 1 ? 0 : this.p3(v, recyclerView$Recycler0, recyclerView$State0);
    }

    private void j3(Recycler recyclerView$Recycler0, LayoutState linearLayoutManager$LayoutState0) {
        if(linearLayoutManager$LayoutState0.a && !linearLayoutManager$LayoutState0.m) {
            int v = linearLayoutManager$LayoutState0.g;
            int v1 = linearLayoutManager$LayoutState0.i;
            if(linearLayoutManager$LayoutState0.f == -1) {
                this.l3(recyclerView$Recycler0, v, v1);
                return;
            }
            this.m3(recyclerView$Recycler0, v, v1);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void k2(int v) {
        this.A = v;
        this.B = 0x80000000;
        SavedState linearLayoutManager$SavedState0 = this.D;
        if(linearLayoutManager$SavedState0 != null) {
            linearLayoutManager$SavedState0.c();
        }
        this.g2();
    }

    private void k3(Recycler recyclerView$Recycler0, int v, int v1) {
        if(v == v1) {
            return;
        }
        if(v1 > v) {
            for(int v2 = v1 - 1; v2 >= v; --v2) {
                this.Z1(v2, recyclerView$Recycler0);
            }
            return;
        }
        while(v > v1) {
            this.Z1(v, recyclerView$Recycler0);
            --v;
        }
    }

    protected boolean l() {
        return this.A0() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.s == 0 ? 0 : this.p3(v, recyclerView$Recycler0, recyclerView$State0);
    }

    private void l3(Recycler recyclerView$Recycler0, int v, int v1) {
        int v2 = this.j0();
        if(v < 0) {
            return;
        }
        int v3 = this.u.h() - v + v1;
        if(this.x) {
            int v4 = 0;
            while(v4 < v2) {
                View view0 = this.i0(v4);
                if(this.u.g(view0) >= v3 && this.u.r(view0) >= v3) {
                    ++v4;
                    continue;
                }
                this.k3(recyclerView$Recycler0, 0, v4);
                return;
            }
        }
        else {
            int v5 = v2 - 1;
            while(v5 >= 0) {
                View view1 = this.i0(v5);
                if(this.u.g(view1) >= v3 && this.u.r(view1) >= v3) {
                    --v5;
                }
                else {
                    this.k3(recyclerView$Recycler0, v2 - 1, v5);
                    if(true) {
                        break;
                    }
                }
            }
        }
    }

    public int m() {
        View view0 = this.R2(this.j0() - 1, -1, true, false);
        return view0 == null ? -1 : this.K0(view0);
    }

    private void m3(Recycler recyclerView$Recycler0, int v, int v1) {
        if(v < 0) {
            return;
        }
        int v2 = v - v1;
        int v3 = this.j0();
        if(this.x) {
            int v4 = v3 - 1;
            while(v4 >= 0) {
                View view0 = this.i0(v4);
                if(this.u.d(view0) <= v2 && this.u.q(view0) <= v2) {
                    --v4;
                    continue;
                }
                this.k3(recyclerView$Recycler0, v3 - 1, v4);
                return;
            }
        }
        else {
            int v5 = 0;
            while(v5 < v3) {
                View view1 = this.i0(v5);
                if(this.u.d(view1) <= v2 && this.u.q(view1) <= v2) {
                    ++v5;
                }
                else {
                    this.k3(recyclerView$Recycler0, 0, v5);
                    if(true) {
                        break;
                    }
                }
            }
        }
    }

    boolean n3() {
        return this.u.l() == 0 && this.u.h() == 0;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$ViewDropHandler
    public void o(@NonNull View view0, @NonNull View view1, int v, int v1) {
        this.B("Cannot drop a view during a scroll or layout calculation");
        this.K2();
        this.o3();
        int v2 = this.K0(view0);
        int v3 = this.K0(view1);
        int v4 = v2 >= v3 ? -1 : 1;
        if(this.x) {
            if(v4 == 1) {
                this.q3(v3, this.u.i() - (this.u.g(view1) + this.u.e(view0)));
                return;
            }
            this.q3(v3, this.u.i() - this.u.d(view1));
            return;
        }
        if(v4 == -1) {
            this.q3(v3, this.u.g(view1));
            return;
        }
        this.q3(v3, this.u.d(view1) - this.u.e(view0));
    }

    private void o3() {
        if(this.s != 1 && this.l()) {
            this.x = !this.w;
            return;
        }
        this.x = this.w;
    }

    int p3(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.j0() != 0 && v != 0) {
            this.K2();
            this.t.a = true;
            int v1 = v <= 0 ? -1 : 1;
            int v2 = Math.abs(v);
            this.z3(v1, v2, true, recyclerView$State0);
            int v3 = this.t.g + this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, false);
            if(v3 < 0) {
                return 0;
            }
            if(v2 > v3) {
                v = v1 * v3;
            }
            this.u.t(-v);
            this.t.k = v;
            return v;
        }
        return 0;
    }

    public void q(boolean z) {
        this.z = z;
    }

    public void q3(int v, int v1) {
        this.A = v;
        this.B = v1;
        SavedState linearLayoutManager$SavedState0 = this.D;
        if(linearLayoutManager$SavedState0 != null) {
            linearLayoutManager$SavedState0.c();
        }
        this.g2();
    }

    public void r3(int v) {
        this.G = v;
    }

    public int s() {
        View view0 = this.R2(0, this.j0(), false, true);
        return view0 == null ? -1 : this.K0(view0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void s1(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        super.s1(recyclerView0, recyclerView$Recycler0);
        if(this.C) {
            this.W1(recyclerView$Recycler0);
            recyclerView$Recycler0.d();
        }
    }

    public void s3(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.B(null);
        if(v != this.s || this.u == null) {
            OrientationHelper orientationHelper0 = OrientationHelper.b(this, v);
            this.u = orientationHelper0;
            this.E.a = orientationHelper0;
            this.s = v;
            this.g2();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View t1(View view0, int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.o3();
        if(this.j0() == 0) {
            return null;
        }
        int v1 = this.I2(v);
        if(v1 == 0x80000000) {
            return null;
        }
        this.K2();
        this.z3(v1, ((int)(((float)this.u.o()) * 0.333333f)), false, recyclerView$State0);
        this.t.g = 0x80000000;
        this.t.a = false;
        this.L2(recyclerView$Recycler0, this.t, recyclerView$State0, true);
        View view1 = v1 == -1 ? this.T2() : this.S2();
        View view2 = v1 == -1 ? this.Y2() : this.X2();
        if(view2.hasFocusable()) {
            return view1 == null ? null : view2;
        }
        return view1;
    }

    public void t3(boolean z) {
        this.C = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void u1(AccessibilityEvent accessibilityEvent0) {
        super.u1(accessibilityEvent0);
        if(this.j0() > 0) {
            accessibilityEvent0.setFromIndex(this.s());
            accessibilityEvent0.setToIndex(this.i());
        }
    }

    public void u3(boolean z) {
        this.B(null);
        if(z == this.w) {
            return;
        }
        this.w = z;
        this.g2();
    }

    public void v3(boolean z) {
        this.B(null);
        if(this.y == z) {
            return;
        }
        this.y = z;
        this.g2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    boolean w2() {
        return this.y0() != 0x40000000 && this.S0() != 0x40000000 && this.T0();
    }

    private boolean w3(Recycler recyclerView$Recycler0, State recyclerView$State0, AnchorInfo linearLayoutManager$AnchorInfo0) {
        boolean z = false;
        if(this.j0() == 0) {
            return false;
        }
        View view0 = this.w0();
        if(view0 != null && linearLayoutManager$AnchorInfo0.d(view0, recyclerView$State0)) {
            linearLayoutManager$AnchorInfo0.c(view0, this.K0(view0));
            return true;
        }
        boolean z1 = this.y;
        if(this.v != z1) {
            return false;
        }
        View view1 = this.U2(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$AnchorInfo0.d, z1);
        if(view1 != null) {
            linearLayoutManager$AnchorInfo0.b(view1, this.K0(view1));
            if(!recyclerView$State0.j() && this.C2()) {
                int v = this.u.g(view1);
                int v1 = this.u.d(view1);
                int v2 = this.u.n();
                int v3 = this.u.i();
                if(v >= v3 && v1 > v3) {
                    z = true;
                }
                if(v1 <= v2 && v < v2 || z) {
                    if(linearLayoutManager$AnchorInfo0.d) {
                        v2 = v3;
                    }
                    linearLayoutManager$AnchorInfo0.c = v2;
                }
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void x1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.x1(recyclerView$Recycler0, recyclerView$State0, accessibilityNodeInfoCompat0);
        Adapter recyclerView$Adapter0 = this.b.mAdapter;
        if(recyclerView$Adapter0 != null && recyclerView$Adapter0.getItemCount() > 0 && Build.VERSION.SDK_INT >= 23) {
            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.C);
        }
    }

    private boolean x3(State recyclerView$State0, AnchorInfo linearLayoutManager$AnchorInfo0) {
        boolean z = false;
        if(!recyclerView$State0.j()) {
            int v = this.A;
            if(v != -1) {
                if(v >= 0 && v < recyclerView$State0.d()) {
                    linearLayoutManager$AnchorInfo0.b = this.A;
                    if(this.D != null && this.D.a()) {
                        linearLayoutManager$AnchorInfo0.d = this.D.c;
                        if(this.D.c) {
                            linearLayoutManager$AnchorInfo0.c = this.u.i() - this.D.b;
                            return true;
                        }
                        linearLayoutManager$AnchorInfo0.c = this.u.n() + this.D.b;
                        return true;
                    }
                    if(this.B == 0x80000000) {
                        View view0 = this.c0(this.A);
                        if(view0 != null) {
                            if(this.u.e(view0) > this.u.o()) {
                                linearLayoutManager$AnchorInfo0.a();
                                return true;
                            }
                            if(this.u.g(view0) - this.u.n() < 0) {
                                linearLayoutManager$AnchorInfo0.c = this.u.n();
                                linearLayoutManager$AnchorInfo0.d = false;
                                return true;
                            }
                            if(this.u.i() - this.u.d(view0) < 0) {
                                linearLayoutManager$AnchorInfo0.c = this.u.i();
                                linearLayoutManager$AnchorInfo0.d = true;
                                return true;
                            }
                            linearLayoutManager$AnchorInfo0.c = linearLayoutManager$AnchorInfo0.d ? this.u.d(view0) + this.u.p() : this.u.g(view0);
                            return true;
                        }
                        if(this.j0() > 0) {
                            int v1 = this.K0(this.i0(0));
                            if(this.A < v1 == this.x) {
                                z = true;
                            }
                            linearLayoutManager$AnchorInfo0.d = z;
                        }
                        linearLayoutManager$AnchorInfo0.a();
                        return true;
                    }
                    linearLayoutManager$AnchorInfo0.d = this.x;
                    if(this.x) {
                        linearLayoutManager$AnchorInfo0.c = this.u.i() - this.B;
                        return true;
                    }
                    linearLayoutManager$AnchorInfo0.c = this.u.n() + this.B;
                    return true;
                }
                this.A = -1;
                this.B = 0x80000000;
            }
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        LinearSmoothScroller linearSmoothScroller0 = new LinearSmoothScroller(recyclerView0.getContext());
        linearSmoothScroller0.q(v);
        this.z2(linearSmoothScroller0);
    }

    private void y3(Recycler recyclerView$Recycler0, State recyclerView$State0, AnchorInfo linearLayoutManager$AnchorInfo0) {
        if(this.x3(recyclerView$State0, linearLayoutManager$AnchorInfo0)) {
            return;
        }
        if(this.w3(recyclerView$Recycler0, recyclerView$State0, linearLayoutManager$AnchorInfo0)) {
            return;
        }
        linearLayoutManager$AnchorInfo0.a();
        linearLayoutManager$AnchorInfo0.b = this.y ? recyclerView$State0.d() - 1 : 0;
    }

    private void z3(int v, int v1, boolean z, State recyclerView$State0) {
        int v7;
        LayoutState linearLayoutManager$LayoutState0 = this.t;
        linearLayoutManager$LayoutState0.m = this.n3();
        this.t.f = v;
        int[] arr_v = this.H;
        boolean z1 = false;
        arr_v[0] = 0;
        int v2 = 1;
        arr_v[1] = 0;
        this.D2(recyclerView$State0, arr_v);
        int v3 = Math.max(0, this.H[0]);
        int v4 = Math.max(0, this.H[1]);
        if(v == 1) {
            z1 = true;
        }
        LayoutState linearLayoutManager$LayoutState1 = this.t;
        int v5 = z1 ? v4 : v3;
        linearLayoutManager$LayoutState1.h = v5;
        if(!z1) {
            v3 = v4;
        }
        linearLayoutManager$LayoutState1.i = v3;
        if(z1) {
            linearLayoutManager$LayoutState1.h = v5 + this.u.j();
            View view0 = this.X2();
            LayoutState linearLayoutManager$LayoutState2 = this.t;
            if(this.x) {
                v2 = -1;
            }
            linearLayoutManager$LayoutState2.e = v2;
            int v6 = this.K0(view0);
            LayoutState linearLayoutManager$LayoutState3 = this.t;
            linearLayoutManager$LayoutState2.d = v6 + linearLayoutManager$LayoutState3.e;
            linearLayoutManager$LayoutState3.b = this.u.d(view0);
            v7 = this.u.d(view0) - this.u.i();
        }
        else {
            View view1 = this.Y2();
            LayoutState linearLayoutManager$LayoutState4 = this.t;
            linearLayoutManager$LayoutState4.h += this.u.n();
            LayoutState linearLayoutManager$LayoutState5 = this.t;
            if(!this.x) {
                v2 = -1;
            }
            linearLayoutManager$LayoutState5.e = v2;
            int v8 = this.K0(view1);
            LayoutState linearLayoutManager$LayoutState6 = this.t;
            linearLayoutManager$LayoutState5.d = v8 + linearLayoutManager$LayoutState6.e;
            linearLayoutManager$LayoutState6.b = this.u.g(view1);
            v7 = -this.u.g(view1) + this.u.n();
        }
        LayoutState linearLayoutManager$LayoutState7 = this.t;
        linearLayoutManager$LayoutState7.c = v1;
        if(z) {
            linearLayoutManager$LayoutState7.c = v1 - v7;
        }
        linearLayoutManager$LayoutState7.g = v7;
    }
}

