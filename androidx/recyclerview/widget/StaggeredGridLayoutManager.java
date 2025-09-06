package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    class AnchorInfo {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;
        final StaggeredGridLayoutManager g;

        AnchorInfo() {
            this.c();
        }

        void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.n();
        }

        void b(int v) {
            if(this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - v;
                return;
            }
            this.b = StaggeredGridLayoutManager.this.u.n() + v;
        }

        void c() {
            this.a = -1;
            this.b = 0x80000000;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] arr_v = this.f;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
        }

        void d(Span[] arr_staggeredGridLayoutManager$Span) {
            if(this.f == null || this.f.length < arr_staggeredGridLayoutManager$Span.length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for(int v = 0; v < arr_staggeredGridLayoutManager$Span.length; ++v) {
                int[] arr_v = this.f;
                arr_v[v] = arr_staggeredGridLayoutManager$Span[v].u(0x80000000);
            }
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        Span e;
        boolean f;
        public static final int g = -1;

        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
            super(recyclerView$LayoutParams0);
        }

        public final int j() {
            return this.e == null ? -1 : this.e.e;
        }

        public boolean k() {
            return this.f;
        }

        public void l(boolean z) {
            this.f = z;
        }
    }

    static class LazySpanLookup {
        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator CREATOR;
            int a;
            int b;
            int[] c;
            boolean d;

            static {
                FullSpanItem.CREATOR = new Parcelable.Creator() {
                    public FullSpanItem a(Parcel parcel0) {
                        return new FullSpanItem(parcel0);
                    }

                    public FullSpanItem[] b(int v) {
                        return new FullSpanItem[v];
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

            FullSpanItem() {
            }

            FullSpanItem(Parcel parcel0) {
                this.a = parcel0.readInt();
                this.b = parcel0.readInt();
                this.d = parcel0.readInt() == 1;
                int v = parcel0.readInt();
                if(v > 0) {
                    int[] arr_v = new int[v];
                    this.c = arr_v;
                    parcel0.readIntArray(arr_v);
                }
            }

            int a(int v) {
                return this.c == null ? 0 : this.c[v];
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override
            public String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(Parcel parcel0, int v) {
                parcel0.writeInt(this.a);
                parcel0.writeInt(this.b);
                parcel0.writeInt(((int)this.d));
                int[] arr_v = this.c;
                if(arr_v != null && arr_v.length > 0) {
                    parcel0.writeInt(arr_v.length);
                    parcel0.writeIntArray(this.c);
                    return;
                }
                parcel0.writeInt(0);
            }
        }

        int[] a;
        List b;
        private static final int c = 10;

        public void a(FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0) {
            if(this.b == null) {
                this.b = new ArrayList();
            }
            int v = this.b.size();
            for(int v1 = 0; v1 < v; ++v1) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = (FullSpanItem)this.b.get(v1);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.a == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a) {
                    this.b.remove(v1);
                }
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.a >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a) {
                    this.b.add(v1, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
                    return;
                }
            }
            this.b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
        }

        void b() {
            int[] arr_v = this.a;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            this.b = null;
        }

        void c(int v) {
            int[] arr_v = this.a;
            if(arr_v == null) {
                int[] arr_v1 = new int[Math.max(v, 10) + 1];
                this.a = arr_v1;
                Arrays.fill(arr_v1, -1);
                return;
            }
            if(v >= arr_v.length) {
                int[] arr_v2 = new int[this.o(v)];
                this.a = arr_v2;
                System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
                Arrays.fill(this.a, arr_v.length, this.a.length, -1);
            }
        }

        int d(int v) {
            List list0 = this.b;
            if(list0 != null) {
                for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                    if(((FullSpanItem)this.b.get(v1)).a >= v) {
                        this.b.remove(v1);
                    }
                }
            }
            return this.h(v);
        }

        public FullSpanItem e(int v, int v1, int v2, boolean z) {
            List list0 = this.b;
            if(list0 == null) {
                return null;
            }
            int v3 = list0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v4);
                int v5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a;
                if(v5 >= v1) {
                    return null;
                }
                if(v5 >= v && (v2 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.b == v2 || z && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.d)) {
                    return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
                }
            }
            return null;
        }

        public FullSpanItem f(int v) {
            List list0 = this.b;
            if(list0 == null) {
                return null;
            }
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v1);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a == v) {
                    return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
                }
            }
            return null;
        }

        int g(int v) {
            return this.a == null || v >= this.a.length ? -1 : this.a[v];
        }

        int h(int v) {
            int[] arr_v = this.a;
            if(arr_v == null) {
                return -1;
            }
            if(v >= arr_v.length) {
                return -1;
            }
            int v1 = this.i(v);
            if(v1 == -1) {
                Arrays.fill(this.a, v, this.a.length, -1);
                return this.a.length;
            }
            int v2 = Math.min(v1 + 1, this.a.length);
            Arrays.fill(this.a, v, v2, -1);
            return v2;
        }

        private int i(int v) {
            if(this.b == null) {
                return -1;
            }
            FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = this.f(v);
            if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null) {
                this.b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
            }
            int v1 = this.b.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((FullSpanItem)this.b.get(v2)).a >= v) {
                    break;
                }
            }
            if(v2 != -1) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = (FullSpanItem)this.b.get(v2);
                this.b.remove(v2);
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.a;
            }
            return -1;
        }

        void j(int v, int v1) {
            if(this.a != null && v < this.a.length) {
                int v2 = v + v1;
                this.c(v2);
                System.arraycopy(this.a, v, this.a, v2, this.a.length - v - v1);
                Arrays.fill(this.a, v, v2, -1);
                this.l(v, v1);
            }
        }

        void k(int v, int v1) {
            if(this.a != null && v < this.a.length) {
                int v2 = v + v1;
                this.c(v2);
                System.arraycopy(this.a, v2, this.a, v, this.a.length - v - v1);
                Arrays.fill(this.a, this.a.length - v1, this.a.length, -1);
                this.m(v, v1);
            }
        }

        private void l(int v, int v1) {
            List list0 = this.b;
            if(list0 == null) {
                return;
            }
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v2);
                int v3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a;
                if(v3 >= v) {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a = v3 + v1;
                }
            }
        }

        private void m(int v, int v1) {
            List list0 = this.b;
            if(list0 == null) {
                return;
            }
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v2);
                int v3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a;
                if(v3 >= v) {
                    if(v3 < v + v1) {
                        this.b.remove(v2);
                    }
                    else {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a = v3 - v1;
                    }
                }
            }
        }

        void n(int v, Span staggeredGridLayoutManager$Span0) {
            this.c(v);
            this.a[v] = staggeredGridLayoutManager$Span0.e;
        }

        int o(int v) {
            int v1;
            for(v1 = this.a.length; v1 <= v; v1 *= 2) {
            }
            return v1;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({Scope.a})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List g;
        boolean h;
        boolean i;
        boolean j;

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
            int v = parcel0.readInt();
            this.c = v;
            if(v > 0) {
                int[] arr_v = new int[v];
                this.d = arr_v;
                parcel0.readIntArray(arr_v);
            }
            int v1 = parcel0.readInt();
            this.e = v1;
            if(v1 > 0) {
                int[] arr_v1 = new int[v1];
                this.f = arr_v1;
                parcel0.readIntArray(arr_v1);
            }
            boolean z = false;
            this.h = parcel0.readInt() == 1;
            this.i = parcel0.readInt() == 1;
            if(parcel0.readInt() == 1) {
                z = true;
            }
            this.j = z;
            this.g = parcel0.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState staggeredGridLayoutManager$SavedState0) {
            this.c = staggeredGridLayoutManager$SavedState0.c;
            this.a = staggeredGridLayoutManager$SavedState0.a;
            this.b = staggeredGridLayoutManager$SavedState0.b;
            this.d = staggeredGridLayoutManager$SavedState0.d;
            this.e = staggeredGridLayoutManager$SavedState0.e;
            this.f = staggeredGridLayoutManager$SavedState0.f;
            this.h = staggeredGridLayoutManager$SavedState0.h;
            this.i = staggeredGridLayoutManager$SavedState0.i;
            this.j = staggeredGridLayoutManager$SavedState0.j;
            this.g = staggeredGridLayoutManager$SavedState0.g;
        }

        void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        void c() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeInt(this.b);
            parcel0.writeInt(this.c);
            if(this.c > 0) {
                parcel0.writeIntArray(this.d);
            }
            parcel0.writeInt(this.e);
            if(this.e > 0) {
                parcel0.writeIntArray(this.f);
            }
            parcel0.writeInt(((int)this.h));
            parcel0.writeInt(((int)this.i));
            parcel0.writeInt(((int)this.j));
            parcel0.writeList(this.g);
        }
    }

    class Span {
        ArrayList a;
        int b;
        int c;
        int d;
        final int e;
        final StaggeredGridLayoutManager f;
        static final int g = 0x80000000;

        Span(int v) {
            this.a = new ArrayList();
            this.b = 0x80000000;
            this.c = 0x80000000;
            this.d = 0;
            this.e = v;
        }

        void A(int v) {
            this.b = v;
            this.c = v;
        }

        void a(View view0) {
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = this.s(view0);
            staggeredGridLayoutManager$LayoutParams0.e = this;
            this.a.add(view0);
            this.c = 0x80000000;
            if(this.a.size() == 1) {
                this.b = 0x80000000;
            }
            if(staggeredGridLayoutManager$LayoutParams0.g() || staggeredGridLayoutManager$LayoutParams0.f()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view0);
            }
        }

        void b(boolean z, int v) {
            int v1 = z ? this.q(0x80000000) : this.u(0x80000000);
            this.e();
            if(v1 == 0x80000000) {
                return;
            }
            if(z && v1 < StaggeredGridLayoutManager.this.u.i() || !z && v1 > StaggeredGridLayoutManager.this.u.n()) {
                return;
            }
            if(v != 0x80000000) {
                v1 += v;
            }
            this.c = v1;
            this.b = v1;
        }

        void c() {
            View view0 = (View)this.a.get(this.a.size() - 1);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = this.s(view0);
            this.c = StaggeredGridLayoutManager.this.u.d(view0);
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.f(staggeredGridLayoutManager$LayoutParams0.d());
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.b == 1) {
                    this.c += staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a(this.e);
                }
            }
        }

        void d() {
            View view0 = (View)this.a.get(0);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = this.s(view0);
            this.b = StaggeredGridLayoutManager.this.u.g(view0);
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.f(staggeredGridLayoutManager$LayoutParams0.d());
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.b == -1) {
                    this.b -= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a(this.e);
                }
            }
        }

        void e() {
            this.a.clear();
            this.v();
            this.d = 0;
        }

        // 去混淆评级： 低(20)
        public int f() {
            return StaggeredGridLayoutManager.this.z ? this.n(this.a.size() - 1, -1, true) : this.n(0, this.a.size(), true);
        }

        // 去混淆评级： 低(20)
        public int g() {
            return StaggeredGridLayoutManager.this.z ? this.m(this.a.size() - 1, -1, true) : this.m(0, this.a.size(), true);
        }

        // 去混淆评级： 低(20)
        public int h() {
            return StaggeredGridLayoutManager.this.z ? this.n(this.a.size() - 1, -1, false) : this.n(0, this.a.size(), false);
        }

        // 去混淆评级： 低(20)
        public int i() {
            return StaggeredGridLayoutManager.this.z ? this.n(0, this.a.size(), true) : this.n(this.a.size() - 1, -1, true);
        }

        // 去混淆评级： 低(20)
        public int j() {
            return StaggeredGridLayoutManager.this.z ? this.m(0, this.a.size(), true) : this.m(this.a.size() - 1, -1, true);
        }

        // 去混淆评级： 低(20)
        public int k() {
            return StaggeredGridLayoutManager.this.z ? this.n(0, this.a.size(), false) : this.n(this.a.size() - 1, -1, false);
        }

        int l(int v, int v1, boolean z, boolean z1, boolean z2) {
            boolean z4;
            int v2 = StaggeredGridLayoutManager.this.u.n();
            int v3 = StaggeredGridLayoutManager.this.u.i();
            int v4 = v1 <= v ? -1 : 1;
            while(v != v1) {
                View view0 = (View)this.a.get(v);
                int v5 = StaggeredGridLayoutManager.this.u.g(view0);
                int v6 = StaggeredGridLayoutManager.this.u.d(view0);
                boolean z3 = false;
                if(!z2) {
                    if(v5 < v3) {
                        z4 = true;
                    }
                }
                else if(v5 <= v3) {
                    z4 = true;
                }
                else {
                    z4 = false;
                }
                if(!z2) {
                    if(v6 > v2) {
                        z3 = true;
                    }
                }
                else if(v6 >= v2) {
                    z3 = true;
                }
                if(z4 && z3) {
                    if(!z || !z1) {
                        if(z1) {
                            return StaggeredGridLayoutManager.this.K0(view0);
                        }
                        if(v5 < v2 || v6 > v3) {
                            return StaggeredGridLayoutManager.this.K0(view0);
                        }
                    }
                    else if(v5 >= v2 && v6 <= v3) {
                        return StaggeredGridLayoutManager.this.K0(view0);
                    }
                }
                v += v4;
            }
            return -1;
        }

        int m(int v, int v1, boolean z) {
            return this.l(v, v1, false, false, z);
        }

        int n(int v, int v1, boolean z) {
            return this.l(v, v1, z, true, false);
        }

        public int o() {
            return this.d;
        }

        int p() {
            int v = this.c;
            if(v != 0x80000000) {
                return v;
            }
            this.c();
            return this.c;
        }

        int q(int v) {
            int v1 = this.c;
            if(v1 != 0x80000000) {
                return v1;
            }
            if(this.a.size() == 0) {
                return v;
            }
            this.c();
            return this.c;
        }

        public View r(int v, int v1) {
            View view0 = null;
            if(v1 == -1) {
                int v2 = this.a.size();
                int v3 = 0;
                while(v3 < v2) {
                    View view1 = (View)this.a.get(v3);
                    if(StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.K0(view1) <= v || (!StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.K0(view1) >= v || !view1.hasFocusable())) {
                        return view0;
                    }
                    ++v3;
                    view0 = view1;
                }
                return view0;
            }
            else {
                int v4 = this.a.size() - 1;
                while(v4 >= 0) {
                    View view2 = (View)this.a.get(v4);
                    if(StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.K0(view2) >= v || (!StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.K0(view2) <= v || !view2.hasFocusable())) {
                        break;
                    }
                    --v4;
                    view0 = view2;
                }
            }
            return view0;
        }

        LayoutParams s(View view0) {
            return (LayoutParams)view0.getLayoutParams();
        }

        int t() {
            int v = this.b;
            if(v != 0x80000000) {
                return v;
            }
            this.d();
            return this.b;
        }

        int u(int v) {
            int v1 = this.b;
            if(v1 != 0x80000000) {
                return v1;
            }
            if(this.a.size() == 0) {
                return v;
            }
            this.d();
            return this.b;
        }

        void v() {
            this.b = 0x80000000;
            this.c = 0x80000000;
        }

        void w(int v) {
            int v1 = this.b;
            if(v1 != 0x80000000) {
                this.b = v1 + v;
            }
            int v2 = this.c;
            if(v2 != 0x80000000) {
                this.c = v2 + v;
            }
        }

        void x() {
            int v = this.a.size();
            View view0 = (View)this.a.remove(v - 1);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = this.s(view0);
            staggeredGridLayoutManager$LayoutParams0.e = null;
            if(staggeredGridLayoutManager$LayoutParams0.g() || staggeredGridLayoutManager$LayoutParams0.f()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view0);
            }
            if(v == 1) {
                this.b = 0x80000000;
            }
            this.c = 0x80000000;
        }

        void y() {
            View view0 = (View)this.a.remove(0);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = this.s(view0);
            staggeredGridLayoutManager$LayoutParams0.e = null;
            if(this.a.size() == 0) {
                this.c = 0x80000000;
            }
            if(staggeredGridLayoutManager$LayoutParams0.g() || staggeredGridLayoutManager$LayoutParams0.f()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view0);
            }
            this.b = 0x80000000;
        }

        void z(View view0) {
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = this.s(view0);
            staggeredGridLayoutManager$LayoutParams0.e = this;
            this.a.add(0, view0);
            this.b = 0x80000000;
            if(this.a.size() == 1) {
                this.c = 0x80000000;
            }
            if(staggeredGridLayoutManager$LayoutParams0.g() || staggeredGridLayoutManager$LayoutParams0.f()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view0);
            }
        }
    }

    boolean A;
    private BitSet B;
    int C;
    int D;
    LazySpanLookup E;
    private int F;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private final Rect K;
    private final AnchorInfo L;
    private boolean M;
    private boolean N;
    private int[] O;
    private final Runnable P;
    private static final String Q = "StaggeredGridLManager";
    static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;
    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    static final int X = 0x80000000;
    private static final float Y = 0.333333f;
    private int s;
    Span[] t;
    @NonNull
    OrientationHelper u;
    @NonNull
    OrientationHelper v;
    private int w;
    private int x;
    @NonNull
    private final LayoutState y;
    boolean z;

    public StaggeredGridLayoutManager(int v, int v1) {
        this.s = -1;
        this.z = false;
        this.A = false;
        this.C = -1;
        this.D = 0x80000000;
        this.E = new LazySpanLookup();
        this.F = 2;
        this.K = new Rect();
        this.L = new AnchorInfo(this);
        this.M = false;
        this.N = true;
        this.P = () -> {
            int v1;
            int v;
            if(StaggeredGridLayoutManager.this.j0() != 0 && StaggeredGridLayoutManager.this.F != 0 && StaggeredGridLayoutManager.this.W0()) {
                if(StaggeredGridLayoutManager.this.A) {
                    v = StaggeredGridLayoutManager.this.g3();
                    v1 = StaggeredGridLayoutManager.this.e3();
                }
                else {
                    v = StaggeredGridLayoutManager.this.e3();
                    v1 = StaggeredGridLayoutManager.this.g3();
                }
                if(v == 0 && StaggeredGridLayoutManager.this.q3() != null) {
                    StaggeredGridLayoutManager.this.E.b();
                    StaggeredGridLayoutManager.this.h2();
                    StaggeredGridLayoutManager.this.g2();
                    return true;
                }
                if(!StaggeredGridLayoutManager.this.M) {
                    return false;
                }
                int v2 = StaggeredGridLayoutManager.this.A ? -1 : 1;
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.e(v, v1 + 1, v2, true);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 == null) {
                    StaggeredGridLayoutManager.this.M = false;
                    StaggeredGridLayoutManager.this.E.d(v1 + 1);
                    return false;
                }
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = StaggeredGridLayoutManager.this.E.e(v, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a, -v2, true);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 == null) {
                    StaggeredGridLayoutManager.this.E.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a);
                }
                else {
                    StaggeredGridLayoutManager.this.E.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.a + 1);
                }
                StaggeredGridLayoutManager.this.h2();
                StaggeredGridLayoutManager.this.g2();
                return true;
            }
            return false;
        };
        this.w = v1;
        this.J3(v);
        this.y = new LayoutState();
        this.R2();
    }

    public StaggeredGridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.s = -1;
        this.z = false;
        this.A = false;
        this.C = -1;
        this.D = 0x80000000;
        this.E = new LazySpanLookup();
        this.F = 2;
        this.K = new Rect();
        this.L = new AnchorInfo(this);
        this.M = false;
        this.N = true;
        this.P = () -> {
            int v1;
            int v;
            if(StaggeredGridLayoutManager.this.j0() != 0 && StaggeredGridLayoutManager.this.F != 0 && StaggeredGridLayoutManager.this.W0()) {
                if(StaggeredGridLayoutManager.this.A) {
                    v = StaggeredGridLayoutManager.this.g3();
                    v1 = StaggeredGridLayoutManager.this.e3();
                }
                else {
                    v = StaggeredGridLayoutManager.this.e3();
                    v1 = StaggeredGridLayoutManager.this.g3();
                }
                if(v == 0 && StaggeredGridLayoutManager.this.q3() != null) {
                    StaggeredGridLayoutManager.this.E.b();
                    StaggeredGridLayoutManager.this.h2();
                    StaggeredGridLayoutManager.this.g2();
                    return true;
                }
                if(!StaggeredGridLayoutManager.this.M) {
                    return false;
                }
                int v2 = StaggeredGridLayoutManager.this.A ? -1 : 1;
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.e(v, v1 + 1, v2, true);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 == null) {
                    StaggeredGridLayoutManager.this.M = false;
                    StaggeredGridLayoutManager.this.E.d(v1 + 1);
                    return false;
                }
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = StaggeredGridLayoutManager.this.E.e(v, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a, -v2, true);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 == null) {
                    StaggeredGridLayoutManager.this.E.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a);
                }
                else {
                    StaggeredGridLayoutManager.this.E.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.a + 1);
                }
                StaggeredGridLayoutManager.this.h2();
                StaggeredGridLayoutManager.this.g2();
                return true;
            }
            return false;
        };
        Properties recyclerView$LayoutManager$Properties0 = LayoutManager.L0(context0, attributeSet0, v, v1);
        this.H3(recyclerView$LayoutManager$Properties0.a);
        this.J3(recyclerView$LayoutManager$Properties0.b);
        this.I3(recyclerView$LayoutManager$Properties0.c);
        this.y = new LayoutState();
        this.R2();
    }

    private void A3(Recycler recyclerView$Recycler0, int v) {
        while(this.j0() > 0) {
            View view0 = this.i0(0);
            if(this.u.d(view0) > v || this.u.q(view0) > v) {
                break;
            }
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                for(int v2 = 0; v2 < this.s; ++v2) {
                    if(this.t[v2].a.size() == 1) {
                        return;
                    }
                }
                for(int v1 = 0; v1 < this.s; ++v1) {
                    this.t[v1].y();
                }
            }
            else {
                if(staggeredGridLayoutManager$LayoutParams0.e.a.size() == 1) {
                    return;
                }
                staggeredGridLayoutManager$LayoutParams0.e.y();
            }
            this.Y1(view0, recyclerView$Recycler0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void B(String s) {
        if(this.I == null) {
            super.B(s);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void B1(RecyclerView recyclerView0, int v, int v1) {
        this.p3(v, v1, 1);
    }

    private void B3() {
        if(this.v.l() == 0x40000000) {
            return;
        }
        int v = this.j0();
        float f = 0.0f;
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = this.i0(v2);
            float f1 = (float)this.v.e(view0);
            if(f1 >= f) {
                if(((LayoutParams)view0.getLayoutParams()).k()) {
                    f1 = f1 * 1.0f / ((float)this.s);
                }
                f = Math.max(f, f1);
            }
        }
        int v3 = this.x;
        int v4 = Math.round(f * ((float)this.s));
        this.P3((this.v.l() == 0x80000000 ? Math.min(v4, this.v.o()) : Math.round(f * ((float)this.s))));
        if(this.x == v3) {
            return;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.i0(v1);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
            if(!staggeredGridLayoutManager$LayoutParams0.f) {
                if(!this.l() || this.w != 1) {
                    int v5 = this.x * staggeredGridLayoutManager$LayoutParams0.e.e;
                    int v6 = staggeredGridLayoutManager$LayoutParams0.e.e * v3;
                    if(this.w == 1) {
                        view1.offsetLeftAndRight(v5 - v6);
                    }
                    else {
                        view1.offsetTopAndBottom(v5 - v6);
                    }
                }
                else {
                    view1.offsetLeftAndRight(-(this.s - 1 - staggeredGridLayoutManager$LayoutParams0.e.e) * this.x - -(this.s - 1 - staggeredGridLayoutManager$LayoutParams0.e.e) * v3);
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void C1(RecyclerView recyclerView0) {
        this.E.b();
        this.g2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean C2() {
        return this.I == null;
    }

    private void C3() {
        if(this.w != 1 && this.l()) {
            this.A = !this.z;
            return;
        }
        this.A = this.z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void D1(RecyclerView recyclerView0, int v, int v1, int v2) {
        this.p3(v, v1, 8);
    }

    private void D2(View view0) {
        for(int v = this.s - 1; v >= 0; --v) {
            this.t[v].a(view0);
        }
    }

    int D3(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.j0() != 0 && v != 0) {
            this.w3(v, recyclerView$State0);
            int v1 = this.S2(recyclerView$Recycler0, this.y, recyclerView$State0);
            if(this.y.b >= v1) {
                v = v >= 0 ? v1 : -v1;
            }
            this.u.t(-v);
            this.G = this.A;
            this.y.b = 0;
            this.y3(recyclerView$Recycler0, this.y);
            return v;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void E1(RecyclerView recyclerView0, int v, int v1) {
        this.p3(v, v1, 2);
    }

    private void E2(AnchorInfo staggeredGridLayoutManager$AnchorInfo0) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        int v = staggeredGridLayoutManager$SavedState0.c;
        if(v > 0) {
            if(v == this.s) {
                for(int v1 = 0; v1 < this.s; ++v1) {
                    this.t[v1].e();
                    SavedState staggeredGridLayoutManager$SavedState1 = this.I;
                    int v2 = staggeredGridLayoutManager$SavedState1.d[v1];
                    if(v2 != 0x80000000) {
                        v2 += (staggeredGridLayoutManager$SavedState1.i ? this.u.i() : this.u.n());
                    }
                    this.t[v1].A(v2);
                }
            }
            else {
                staggeredGridLayoutManager$SavedState0.c();
                this.I.a = this.I.b;
            }
        }
        this.H = this.I.j;
        this.I3(this.I.h);
        this.C3();
        SavedState staggeredGridLayoutManager$SavedState2 = this.I;
        int v3 = staggeredGridLayoutManager$SavedState2.a;
        if(v3 == -1) {
            staggeredGridLayoutManager$AnchorInfo0.c = this.A;
        }
        else {
            this.C = v3;
            staggeredGridLayoutManager$AnchorInfo0.c = staggeredGridLayoutManager$SavedState2.i;
        }
        if(staggeredGridLayoutManager$SavedState2.e > 1) {
            this.E.a = staggeredGridLayoutManager$SavedState2.f;
            this.E.b = staggeredGridLayoutManager$SavedState2.g;
        }
    }

    public void E3(int v, int v1) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        if(staggeredGridLayoutManager$SavedState0 != null) {
            staggeredGridLayoutManager$SavedState0.a();
        }
        this.C = v;
        this.D = v1;
        this.g2();
    }

    boolean F2() {
        int v = this.t[0].q(0x80000000);
        for(int v1 = 1; v1 < this.s; ++v1) {
            if(this.t[v1].q(0x80000000) != v) {
                return false;
            }
        }
        return true;
    }

    public void F3(int v) {
        this.B(null);
        if(v == this.F) {
            return;
        }
        if(v != 0 && v != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.F = v;
        this.g2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean G() {
        return this.w == 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void G1(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.p3(v, v1, 4);
    }

    boolean G2() {
        int v = this.t[0].u(0x80000000);
        for(int v1 = 1; v1 < this.s; ++v1) {
            if(this.t[v1].u(0x80000000) != v) {
                return false;
            }
        }
        return true;
    }

    private void G3(int v) {
        this.y.e = v;
        this.y.d = this.A == (v == -1) ? 1 : -1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean H() {
        return this.w == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.u3(recyclerView$Recycler0, recyclerView$State0, true);
    }

    private void H2(View view0, LayoutParams staggeredGridLayoutManager$LayoutParams0, LayoutState layoutState0) {
        if(layoutState0.e == 1) {
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                this.D2(view0);
                return;
            }
            staggeredGridLayoutManager$LayoutParams0.e.a(view0);
            return;
        }
        if(staggeredGridLayoutManager$LayoutParams0.f) {
            this.x3(view0);
            return;
        }
        staggeredGridLayoutManager$LayoutParams0.e.z(view0);
    }

    public void H3(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.B(null);
        if(v == this.w) {
            return;
        }
        this.w = v;
        OrientationHelper orientationHelper0 = this.u;
        this.u = this.v;
        this.v = orientationHelper0;
        this.g2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean I(androidx.recyclerview.widget.RecyclerView.LayoutParams recyclerView$LayoutParams0) {
        return recyclerView$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void I1(State recyclerView$State0) {
        super.I1(recyclerView$State0);
        this.C = -1;
        this.D = 0x80000000;
        this.I = null;
        this.L.c();
    }

    private int I2(int v) {
        if(this.j0() == 0) {
            return this.A ? 1 : -1;
        }
        return v < this.e3() == this.A ? 1 : -1;
    }

    public void I3(boolean z) {
        this.B(null);
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.h != z) {
            staggeredGridLayoutManager$SavedState0.h = z;
        }
        this.z = z;
        this.g2();
    }

    // 检测为 Lambda 实现
    boolean J2() [...]

    public void J3(int v) {
        this.B(null);
        if(v != this.s) {
            this.r3();
            this.s = v;
            this.B = new BitSet(this.s);
            this.t = new Span[this.s];
            for(int v1 = 0; v1 < this.s; ++v1) {
                Span[] arr_staggeredGridLayoutManager$Span = this.t;
                arr_staggeredGridLayoutManager$Span[v1] = new Span(this, v1);
            }
            this.g2();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @RestrictTo({Scope.a})
    public void K(int v, int v1, State recyclerView$State0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v6;
        int v5;
        if(this.w != 0) {
            v = v1;
        }
        if(this.j0() != 0 && v != 0) {
            this.w3(v, recyclerView$State0);
            if(this.O == null || this.O.length < this.s) {
                this.O = new int[this.s];
            }
            int v4 = 0;
            for(int v3 = 0; v3 < this.s; ++v3) {
                LayoutState layoutState0 = this.y;
                if(layoutState0.d == -1) {
                    v5 = layoutState0.f;
                    v6 = this.t[v3].u(v5);
                }
                else {
                    v5 = this.t[v3].q(layoutState0.g);
                    v6 = this.y.g;
                }
                int v7 = v5 - v6;
                if(v7 >= 0) {
                    this.O[v4] = v7;
                    ++v4;
                }
            }
            Arrays.sort(this.O, 0, v4);
            for(int v2 = 0; v2 < v4 && this.y.a(recyclerView$State0); ++v2) {
                recyclerView$LayoutManager$LayoutPrefetchRegistry0.a(this.y.c, this.O[v2]);
                this.y.c += this.y.d;
            }
        }
    }

    private boolean K2(Span staggeredGridLayoutManager$Span0) {
        if(this.A) {
            return staggeredGridLayoutManager$Span0.p() >= this.u.i() ? false : !staggeredGridLayoutManager$Span0.s(((View)staggeredGridLayoutManager$Span0.a.get(staggeredGridLayoutManager$Span0.a.size() - 1))).f;
        }
        return staggeredGridLayoutManager$Span0.t() <= this.u.n() ? false : !staggeredGridLayoutManager$Span0.s(((View)staggeredGridLayoutManager$Span0.a.get(0))).f;
    }

    private void K3(int v, int v1) {
        for(int v2 = 0; v2 < this.s; ++v2) {
            if(!this.t[v2].a.isEmpty()) {
                this.Q3(this.t[v2], v, v1);
            }
        }
    }

    private int L2(State recyclerView$State0) {
        return this.j0() == 0 ? 0 : ScrollbarHelper.a(recyclerView$State0, this.u, this.W2(!this.N), this.V2(!this.N), this, this.N);
    }

    private boolean L3(State recyclerView$State0, AnchorInfo staggeredGridLayoutManager$AnchorInfo0) {
        staggeredGridLayoutManager$AnchorInfo0.a = this.G ? this.a3(recyclerView$State0.d()) : this.U2(recyclerView$State0.d());
        staggeredGridLayoutManager$AnchorInfo0.b = 0x80000000;
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int M(State recyclerView$State0) {
        return this.L2(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void M1(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.I = (SavedState)parcelable0;
            if(this.C != -1) {
                ((SavedState)parcelable0).a();
                this.I.c();
            }
            this.g2();
        }
    }

    private int M2(State recyclerView$State0) {
        return this.j0() == 0 ? 0 : ScrollbarHelper.b(recyclerView$State0, this.u, this.W2(!this.N), this.V2(!this.N), this, this.N, this.A);
    }

    boolean M3(State recyclerView$State0, AnchorInfo staggeredGridLayoutManager$AnchorInfo0) {
        boolean z = false;
        if(!recyclerView$State0.j()) {
            int v = this.C;
            if(v != -1) {
                if(v >= 0 && v < recyclerView$State0.d()) {
                    if(this.I != null && this.I.a != -1 && this.I.c >= 1) {
                        staggeredGridLayoutManager$AnchorInfo0.b = 0x80000000;
                        staggeredGridLayoutManager$AnchorInfo0.a = this.C;
                        return true;
                    }
                    View view0 = this.c0(this.C);
                    if(view0 != null) {
                        staggeredGridLayoutManager$AnchorInfo0.a = this.A ? this.g3() : this.e3();
                        if(this.D != 0x80000000) {
                            if(staggeredGridLayoutManager$AnchorInfo0.c) {
                                staggeredGridLayoutManager$AnchorInfo0.b = this.u.i() - this.D - this.u.d(view0);
                                return true;
                            }
                            staggeredGridLayoutManager$AnchorInfo0.b = this.u.n() + this.D - this.u.g(view0);
                            return true;
                        }
                        if(this.u.e(view0) > this.u.o()) {
                            staggeredGridLayoutManager$AnchorInfo0.b = staggeredGridLayoutManager$AnchorInfo0.c ? this.u.i() : this.u.n();
                            return true;
                        }
                        int v1 = this.u.g(view0) - this.u.n();
                        if(v1 < 0) {
                            staggeredGridLayoutManager$AnchorInfo0.b = -v1;
                            return true;
                        }
                        int v2 = this.u.i() - this.u.d(view0);
                        if(v2 < 0) {
                            staggeredGridLayoutManager$AnchorInfo0.b = v2;
                            return true;
                        }
                        staggeredGridLayoutManager$AnchorInfo0.b = 0x80000000;
                        return true;
                    }
                    int v3 = this.C;
                    staggeredGridLayoutManager$AnchorInfo0.a = v3;
                    int v4 = this.D;
                    if(v4 == 0x80000000) {
                        if(this.I2(v3) == 1) {
                            z = true;
                        }
                        staggeredGridLayoutManager$AnchorInfo0.c = z;
                        staggeredGridLayoutManager$AnchorInfo0.a();
                    }
                    else {
                        staggeredGridLayoutManager$AnchorInfo0.b(v4);
                    }
                    staggeredGridLayoutManager$AnchorInfo0.d = true;
                    return true;
                }
                this.C = -1;
                this.D = 0x80000000;
            }
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int N(State recyclerView$State0) {
        return this.M2(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int N0(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
        return this.w == 0 ? Math.min(this.s, recyclerView$State0.d()) : -1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public Parcelable N1() {
        int v1;
        if(this.I != null) {
            return new SavedState(this.I);
        }
        Parcelable parcelable0 = new SavedState();
        parcelable0.h = this.z;
        parcelable0.i = this.G;
        parcelable0.j = this.H;
        LazySpanLookup staggeredGridLayoutManager$LazySpanLookup0 = this.E;
        if(staggeredGridLayoutManager$LazySpanLookup0 == null) {
            parcelable0.e = 0;
        }
        else {
            int[] arr_v = staggeredGridLayoutManager$LazySpanLookup0.a;
            if(arr_v == null) {
                parcelable0.e = 0;
            }
            else {
                parcelable0.f = arr_v;
                parcelable0.e = arr_v.length;
                parcelable0.g = staggeredGridLayoutManager$LazySpanLookup0.b;
            }
        }
        if(this.j0() > 0) {
            parcelable0.a = this.G ? this.g3() : this.e3();
            parcelable0.b = this.X2();
            parcelable0.c = this.s;
            parcelable0.d = new int[this.s];
            for(int v = 0; v < this.s; ++v) {
                if(this.G) {
                    v1 = this.t[v].q(0x80000000);
                    if(v1 != 0x80000000) {
                        v1 -= this.u.i();
                    }
                }
                else {
                    v1 = this.t[v].u(0x80000000);
                    if(v1 != 0x80000000) {
                        v1 -= this.u.n();
                    }
                }
                parcelable0.d[v] = v1;
            }
            return parcelable0;
        }
        parcelable0.a = -1;
        parcelable0.b = -1;
        parcelable0.c = 0;
        return parcelable0;
    }

    private int N2(State recyclerView$State0) {
        return this.j0() == 0 ? 0 : ScrollbarHelper.c(recyclerView$State0, this.u, this.W2(!this.N), this.V2(!this.N), this, this.N);
    }

    void N3(State recyclerView$State0, AnchorInfo staggeredGridLayoutManager$AnchorInfo0) {
        if(this.M3(recyclerView$State0, staggeredGridLayoutManager$AnchorInfo0)) {
            return;
        }
        if(this.L3(recyclerView$State0, staggeredGridLayoutManager$AnchorInfo0)) {
            return;
        }
        staggeredGridLayoutManager$AnchorInfo0.a();
        staggeredGridLayoutManager$AnchorInfo0.a = 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int O(State recyclerView$State0) {
        return this.N2(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void O1(int v) {
        if(v == 0) {
            this.J2();
        }
    }

    private int O2(int v) {
        switch(v) {
            case 1: {
                if(this.w == 1) {
                    return -1;
                }
                return this.l() ? 1 : -1;
            }
            case 2: {
                if(this.w == 1) {
                    return 1;
                }
                return this.l() ? -1 : 1;
            }
            case 17: {
                return this.w == 0 ? -1 : 0x80000000;
            }
            case 33: {
                return this.w == 1 ? -1 : 0x80000000;
            }
            case 66: {
                return this.w == 0 ? 1 : 0x80000000;
            }
            case 130: {
                return this.w == 1 ? 1 : 0x80000000;
            }
            default: {
                return 0x80000000;
            }
        }
    }

    private void O3(int v, State recyclerView$State0) {
        int v3;
        int v2;
        boolean z = false;
        this.y.b = 0;
        this.y.c = v;
        if(this.f1()) {
            int v1 = recyclerView$State0.g();
            if(v1 == -1) {
                v2 = 0;
                v3 = 0;
            }
            else if(this.A == v1 < v) {
                v2 = this.u.o();
                v3 = 0;
            }
            else {
                v3 = this.u.o();
                v2 = 0;
            }
        }
        else {
            v2 = 0;
            v3 = 0;
        }
        if(this.n0()) {
            this.y.f = this.u.n() - v3;
            this.y.g = this.u.i() + v2;
        }
        else {
            this.y.g = this.u.h() + v2;
            this.y.f = -v3;
        }
        LayoutState layoutState0 = this.y;
        layoutState0.h = false;
        layoutState0.a = true;
        if(this.u.l() == 0 && this.u.h() == 0) {
            z = true;
        }
        layoutState0.i = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int P(State recyclerView$State0) {
        return this.L2(recyclerView$State0);
    }

    private FullSpanItem P2(int v) {
        FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = new FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.c = new int[this.s];
        for(int v1 = 0; v1 < this.s; ++v1) {
            int[] arr_v = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.c;
            arr_v[v1] = v - this.t[v1].q(v);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
    }

    void P3(int v) {
        this.x = v / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(v, this.v.l());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int Q(State recyclerView$State0) {
        return this.M2(recyclerView$State0);
    }

    private FullSpanItem Q2(int v) {
        FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = new FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.c = new int[this.s];
        for(int v1 = 0; v1 < this.s; ++v1) {
            int[] arr_v = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.c;
            arr_v[v1] = this.t[v1].u(v) - v;
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
    }

    private void Q3(Span staggeredGridLayoutManager$Span0, int v, int v1) {
        int v2 = staggeredGridLayoutManager$Span0.o();
        if(v == -1) {
            if(staggeredGridLayoutManager$Span0.t() + v2 <= v1) {
                this.B.set(staggeredGridLayoutManager$Span0.e, false);
            }
        }
        else if(staggeredGridLayoutManager$Span0.p() - v2 >= v1) {
            this.B.set(staggeredGridLayoutManager$Span0.e, false);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int R(State recyclerView$State0) {
        return this.N2(recyclerView$State0);
    }

    private void R2() {
        this.u = OrientationHelper.b(this, this.w);
        this.v = OrientationHelper.b(this, 1 - this.w);
    }

    private int R3(int v, int v1, int v2) {
        if(v1 == 0 && v2 == 0) {
            return v;
        }
        int v3 = View.MeasureSpec.getMode(v);
        return v3 == 0x80000000 || v3 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(v) - v1 - v2), v3) : v;
    }

    private int S2(Recycler recyclerView$Recycler0, LayoutState layoutState0, State recyclerView$State0) {
        int v14;
        int v11;
        int v10;
        int v7;
        int v6;
        Span staggeredGridLayoutManager$Span0;
        int v;
        this.B.set(0, this.s, true);
        if(!this.y.i) {
            v = layoutState0.e == 1 ? layoutState0.g + layoutState0.b : layoutState0.f - layoutState0.b;
        }
        else if(layoutState0.e == 1) {
            v = 0x7FFFFFFF;
        }
        else {
            v = 0x80000000;
        }
        this.K3(layoutState0.e, v);
        int v1 = this.A ? this.u.i() : this.u.n();
        boolean z;
        for(z = false; layoutState0.a(recyclerView$State0) && (this.y.i || !this.B.isEmpty()); z = true) {
            View view0 = layoutState0.b(recyclerView$Recycler0);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = staggeredGridLayoutManager$LayoutParams0.d();
            int v3 = this.E.g(v2);
            boolean z1 = v3 == -1;
            if(z1) {
                staggeredGridLayoutManager$Span0 = staggeredGridLayoutManager$LayoutParams0.f ? this.t[0] : this.l3(layoutState0);
                this.E.n(v2, staggeredGridLayoutManager$Span0);
            }
            else {
                staggeredGridLayoutManager$Span0 = this.t[v3];
            }
            staggeredGridLayoutManager$LayoutParams0.e = staggeredGridLayoutManager$Span0;
            if(layoutState0.e == 1) {
                this.x(view0);
            }
            else {
                this.y(view0, 0);
            }
            this.t3(view0, staggeredGridLayoutManager$LayoutParams0, false);
            if(layoutState0.e == 1) {
                int v4 = staggeredGridLayoutManager$LayoutParams0.f ? this.h3(v1) : staggeredGridLayoutManager$Span0.q(v1);
                int v5 = this.u.e(view0);
                if(z1 && staggeredGridLayoutManager$LayoutParams0.f) {
                    FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = this.P2(v4);
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.b = -1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a = v2;
                    this.E.a(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
                }
                v6 = v5 + v4;
                v7 = v4;
            }
            else {
                int v8 = staggeredGridLayoutManager$LayoutParams0.f ? this.k3(v1) : staggeredGridLayoutManager$Span0.u(v1);
                v7 = v8 - this.u.e(view0);
                if(z1 && staggeredGridLayoutManager$LayoutParams0.f) {
                    FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = this.Q2(v8);
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.b = 1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.a = v2;
                    this.E.a(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1);
                }
                v6 = v8;
            }
            if(staggeredGridLayoutManager$LayoutParams0.f && layoutState0.d == -1) {
                if(z1) {
                    this.M = true;
                }
                else if(!(layoutState0.e == 1 ? this.F2() : this.G2()) != 0) {
                    FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = this.E.f(v2);
                    if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 != null) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.d = true;
                    }
                    this.M = true;
                }
            }
            this.H2(view0, staggeredGridLayoutManager$LayoutParams0, layoutState0);
            if(!this.l() || this.w != 1) {
                int v12 = staggeredGridLayoutManager$LayoutParams0.f ? this.v.n() : staggeredGridLayoutManager$Span0.e * this.x + this.v.n();
                v11 = v12;
                v10 = this.v.e(view0) + v12;
            }
            else {
                int v9 = staggeredGridLayoutManager$LayoutParams0.f ? this.v.i() : this.v.i() - (this.s - 1 - staggeredGridLayoutManager$Span0.e) * this.x;
                v10 = v9;
                v11 = v9 - this.v.e(view0);
            }
            if(this.w == 1) {
                this.i1(view0, v11, v7, v10, v6);
            }
            else {
                this.i1(view0, v7, v11, v6, v10);
            }
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                this.K3(this.y.e, v);
            }
            else {
                this.Q3(staggeredGridLayoutManager$Span0, this.y.e, v);
            }
            this.y3(recyclerView$Recycler0, this.y);
            if(this.y.h && view0.hasFocusable()) {
                if(staggeredGridLayoutManager$LayoutParams0.f) {
                    this.B.clear();
                }
                else {
                    this.B.set(staggeredGridLayoutManager$Span0.e, false);
                }
            }
        }
        if(!z) {
            this.y3(recyclerView$Recycler0, this.y);
        }
        if(this.y.e == -1) {
            int v13 = this.k3(this.u.n());
            v14 = this.u.n() - v13;
            return v14 <= 0 ? 0 : Math.min(layoutState0.b, v14);
        }
        v14 = this.h3(this.u.i()) - this.u.i();
        return v14 <= 0 ? 0 : Math.min(layoutState0.b, v14);
    }

    public int[] T2(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.s];
        }
        else if(arr_v.length >= this.s) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.s; ++v) {
            arr_v[v] = this.t[v].f();
        }
        return arr_v;
    }

    private int U2(int v) {
        int v1 = this.j0();
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = this.K0(this.i0(v2));
            if(v3 >= 0 && v3 < v) {
                return v3;
            }
        }
        return 0;
    }

    View V2(boolean z) {
        int v = this.u.n();
        int v1 = this.u.i();
        int v2 = this.j0() - 1;
        View view0 = null;
        while(v2 >= 0) {
            View view1 = this.i0(v2);
            int v3 = this.u.g(view1);
            int v4 = this.u.d(view1);
            if(v4 > v && v3 < v1) {
                if(v4 <= v1 || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
            --v2;
        }
        return view0;
    }

    View W2(boolean z) {
        int v = this.u.n();
        int v1 = this.u.i();
        int v2 = this.j0();
        View view0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = this.i0(v3);
            int v4 = this.u.g(view1);
            if(this.u.d(view1) > v && v4 < v1) {
                if(v4 >= v || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
        }
        return view0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean X0() {
        return this.F != 0;
    }

    int X2() {
        View view0 = this.A ? this.V2(true) : this.W2(true);
        return view0 == null ? -1 : this.K0(view0);
    }

    public int[] Y2(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.s];
        }
        else if(arr_v.length >= this.s) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.s; ++v) {
            arr_v[v] = this.t[v].h();
        }
        return arr_v;
    }

    public int[] Z2(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.s];
        }
        else if(arr_v.length >= this.s) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.s; ++v) {
            arr_v[v] = this.t[v].i();
        }
        return arr_v;
    }

    private int a3(int v) {
        for(int v1 = this.j0() - 1; v1 >= 0; --v1) {
            int v2 = this.K0(this.i0(v1));
            if(v2 >= 0 && v2 < v) {
                return v2;
            }
        }
        return 0;
    }

    public int[] b3(int[] arr_v) {
        if(arr_v == null) {
            arr_v = new int[this.s];
        }
        else if(arr_v.length >= this.s) {
        }
        else {
            throw new IllegalArgumentException("Provided int[]\'s size must be more than or equal to span count. Expected:" + this.s + ", array size:" + arr_v.length);
        }
        for(int v = 0; v < this.s; ++v) {
            arr_v[v] = this.t[v].k();
        }
        return arr_v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean c1() {
        return this.z;
    }

    private void c3(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v = this.h3(0x80000000);
        if(v == 0x80000000) {
            return;
        }
        int v1 = this.u.i() - v;
        if(v1 > 0) {
            int v2 = v1 - -this.D3(-v1, recyclerView$Recycler0, recyclerView$State0);
            if(z && v2 > 0) {
                this.u.t(v2);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams d0() {
        return this.w == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    private void d3(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v = this.k3(0x7FFFFFFF);
        if(v == 0x7FFFFFFF) {
            return;
        }
        int v1 = v - this.u.n();
        if(v1 > 0) {
            int v2 = v1 - this.D3(v1, recyclerView$Recycler0, recyclerView$State0);
            if(z && v2 > 0) {
                this.u.t(-v2);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams e0(Context context0, AttributeSet attributeSet0) {
        return new LayoutParams(context0, attributeSet0);
    }

    int e3() {
        return this.j0() == 0 ? 0 : this.K0(this.i0(0));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams f0(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    public int f3() {
        return this.F;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    public PointF g(int v) {
        int v1 = this.I2(v);
        PointF pointF0 = new PointF();
        if(v1 == 0) {
            return null;
        }
        if(this.w == 0) {
            pointF0.x = (float)v1;
            pointF0.y = 0.0f;
            return pointF0;
        }
        pointF0.x = 0.0f;
        pointF0.y = (float)v1;
        return pointF0;
    }

    int g3() {
        int v = this.j0();
        return v == 0 ? 0 : this.K0(this.i0(v - 1));
    }

    private int h3(int v) {
        int v1 = this.t[0].q(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].q(v);
            if(v3 > v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    private int i3(int v) {
        int v1 = this.t[0].u(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].u(v);
            if(v3 > v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int j2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.D3(v, recyclerView$Recycler0, recyclerView$State0);
    }

    private int j3(int v) {
        int v1 = this.t[0].q(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].q(v);
            if(v3 < v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void k2(int v) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.a != v) {
            staggeredGridLayoutManager$SavedState0.a();
        }
        this.C = v;
        this.D = 0x80000000;
        this.g2();
    }

    private int k3(int v) {
        int v1 = this.t[0].u(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].u(v);
            if(v3 < v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    boolean l() {
        return this.A0() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.D3(v, recyclerView$Recycler0, recyclerView$State0);
    }

    private Span l3(LayoutState layoutState0) {
        int v2;
        int v1;
        int v;
        if(this.v3(layoutState0.e)) {
            v = this.s - 1;
            v1 = -1;
            v2 = -1;
        }
        else {
            v1 = this.s;
            v = 0;
            v2 = 1;
        }
        Span staggeredGridLayoutManager$Span0 = null;
        if(layoutState0.e == 1) {
            int v3 = this.u.n();
            int v4 = 0x7FFFFFFF;
            while(v != v1) {
                Span staggeredGridLayoutManager$Span1 = this.t[v];
                int v5 = staggeredGridLayoutManager$Span1.q(v3);
                if(v5 < v4) {
                    staggeredGridLayoutManager$Span0 = staggeredGridLayoutManager$Span1;
                    v4 = v5;
                }
                v += v2;
            }
            return staggeredGridLayoutManager$Span0;
        }
        int v6 = this.u.i();
        int v7 = 0x80000000;
        while(v != v1) {
            Span staggeredGridLayoutManager$Span2 = this.t[v];
            int v8 = staggeredGridLayoutManager$Span2.u(v6);
            if(v8 > v7) {
                staggeredGridLayoutManager$Span0 = staggeredGridLayoutManager$Span2;
                v7 = v8;
            }
            v += v2;
        }
        return staggeredGridLayoutManager$Span0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void m1(int v) {
        super.m1(v);
        for(int v1 = 0; v1 < this.s; ++v1) {
            this.t[v1].w(v);
        }
    }

    public int m3() {
        return this.w;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void n1(int v) {
        super.n1(v);
        for(int v1 = 0; v1 < this.s; ++v1) {
            this.t[v1].w(v);
        }
    }

    public boolean n3() {
        return this.z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int o0(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
        return this.w == 1 ? Math.min(this.s, recyclerView$State0.d()) : -1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void o1(@Nullable Adapter recyclerView$Adapter0, @Nullable Adapter recyclerView$Adapter1) {
        this.E.b();
        for(int v = 0; v < this.s; ++v) {
            this.t[v].e();
        }
    }

    public int o3() {
        return this.s;
    }

    private void p3(int v, int v1, int v2) {
        int v5;
        int v4;
        int v3 = this.A ? this.g3() : this.e3();
        if(v2 != 8) {
            v4 = v + v1;
            v5 = v;
        }
        else if(v < v1) {
            v4 = v1 + 1;
            v5 = v;
        }
        else {
            v4 = v + 1;
            v5 = v1;
        }
        this.E.h(v5);
        if(v2 == 1) {
            this.E.j(v, v1);
        }
        else {
            switch(v2) {
                case 2: {
                    this.E.k(v, v1);
                    break;
                }
                case 8: {
                    this.E.k(v, 1);
                    this.E.j(v1, 1);
                }
            }
        }
        if(v4 <= v3) {
            return;
        }
        if(v5 <= (this.A ? this.e3() : this.g3())) {
            this.g2();
        }
    }

    View q3() {
        int v = this.j0();
        int v1 = v - 1;
        BitSet bitSet0 = new BitSet(this.s);
        bitSet0.set(0, this.s, true);
        int v2 = -1;
        int v3 = this.w != 1 || !this.l() ? -1 : 1;
        if(this.A) {
            v = -1;
        }
        else {
            v1 = 0;
        }
        if(v1 < v) {
            v2 = 1;
        }
        while(v1 != v) {
            View view0 = this.i0(v1);
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(bitSet0.get(staggeredGridLayoutManager$LayoutParams0.e.e)) {
                if(this.K2(staggeredGridLayoutManager$LayoutParams0.e)) {
                    return view0;
                }
                bitSet0.clear(staggeredGridLayoutManager$LayoutParams0.e.e);
            }
            if(!staggeredGridLayoutManager$LayoutParams0.f) {
                int v4 = v1 + v2;
                if(v4 != v) {
                    View view1 = this.i0(v4);
                    if(this.A) {
                        int v5 = this.u.d(view0);
                        int v6 = this.u.d(view1);
                        if(v5 < v6) {
                            return view0;
                        }
                        if(v5 == v6) {
                            goto label_35;
                        }
                    }
                    else {
                        int v7 = this.u.g(view0);
                        int v8 = this.u.g(view1);
                        if(v7 > v8) {
                            return view0;
                        }
                        if(v7 == v8) {
                        label_35:
                            LayoutParams staggeredGridLayoutManager$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
                            if((staggeredGridLayoutManager$LayoutParams0.e.e - staggeredGridLayoutManager$LayoutParams1.e.e >= 0 ? 0 : 1) != (v3 >= 0 ? 0 : 1)) {
                                return view0;
                            }
                        }
                    }
                }
            }
            v1 += v2;
        }
        return null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void r2(Rect rect0, int v, int v1) {
        int v5;
        int v4;
        int v2 = this.G0() + this.H0();
        int v3 = this.J0() + this.E0();
        if(this.w == 1) {
            v4 = LayoutManager.J(v1, rect0.height() + v3, this.C0());
            v5 = LayoutManager.J(v, this.x * this.s + v2, this.D0());
        }
        else {
            v5 = LayoutManager.J(v, rect0.width() + v2, this.D0());
            v4 = LayoutManager.J(v1, this.x * this.s + v3, this.C0());
        }
        this.q2(v5, v4);
    }

    public void r3() {
        this.E.b();
        this.g2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void s1(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        super.s1(recyclerView0, recyclerView$Recycler0);
        this.a2(this.P);
        for(int v = 0; v < this.s; ++v) {
            this.t[v].e();
        }
        recyclerView0.requestLayout();
    }

    private void s3(View view0, int v, int v1, boolean z) {
        this.F(view0, this.K);
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = this.R3(v, staggeredGridLayoutManager$LayoutParams0.leftMargin + this.K.left, staggeredGridLayoutManager$LayoutParams0.rightMargin + this.K.right);
        int v3 = this.R3(v1, staggeredGridLayoutManager$LayoutParams0.topMargin + this.K.top, staggeredGridLayoutManager$LayoutParams0.bottomMargin + this.K.bottom);
        if((z ? this.x2(view0, v2, v3, staggeredGridLayoutManager$LayoutParams0) : this.v2(view0, v2, v3, staggeredGridLayoutManager$LayoutParams0))) {
            view0.measure(v2, v3);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @Nullable
    public View t1(View view0, int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.j0() == 0) {
            return null;
        }
        View view1 = this.b0(view0);
        if(view1 == null) {
            return null;
        }
        this.C3();
        int v1 = this.O2(v);
        if(v1 == 0x80000000) {
            return null;
        }
        LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
        boolean z = staggeredGridLayoutManager$LayoutParams0.f;
        Span staggeredGridLayoutManager$Span0 = staggeredGridLayoutManager$LayoutParams0.e;
        int v2 = v1 == 1 ? this.g3() : this.e3();
        this.O3(v2, recyclerView$State0);
        this.G3(v1);
        this.y.c = this.y.d + v2;
        this.y.b = (int)(((float)this.u.o()) * 0.333333f);
        this.y.h = true;
        this.y.a = false;
        this.S2(recyclerView$Recycler0, this.y, recyclerView$State0);
        this.G = this.A;
        if(!z) {
            View view2 = staggeredGridLayoutManager$Span0.r(v2, v1);
            if(view2 != null && view2 != view1) {
                return view2;
            }
        }
        if(this.v3(v1)) {
            for(int v4 = this.s - 1; v4 >= 0; --v4) {
                View view3 = this.t[v4].r(v2, v1);
                if(view3 != null && view3 != view1) {
                    return view3;
                }
            }
        }
        else {
            for(int v5 = 0; v5 < this.s; ++v5) {
                View view4 = this.t[v5].r(v2, v1);
                if(view4 != null && view4 != view1) {
                    return view4;
                }
            }
        }
        boolean z1 = !this.z == (v1 == -1 ? 1 : 0);
        if(!z) {
            View view5 = this.c0((z1 ? staggeredGridLayoutManager$Span0.g() : staggeredGridLayoutManager$Span0.j()));
            if(view5 != null && view5 != view1) {
                return view5;
            }
        }
        if(this.v3(v1)) {
            for(int v6 = this.s - 1; v6 >= 0; --v6) {
                if(v6 != staggeredGridLayoutManager$Span0.e) {
                    View view6 = this.c0((z1 ? this.t[v6].g() : this.t[v6].j()));
                    if(view6 != null && view6 != view1) {
                        return view6;
                    }
                }
            }
            return null;
        }
        for(int v3 = 0; v3 < this.s; ++v3) {
            View view7 = this.c0((z1 ? this.t[v3].g() : this.t[v3].j()));
            if(view7 != null && view7 != view1) {
                return view7;
            }
        }
        return null;
    }

    private void t3(View view0, LayoutParams staggeredGridLayoutManager$LayoutParams0, boolean z) {
        if(staggeredGridLayoutManager$LayoutParams0.f) {
            if(this.w == 1) {
                this.s3(view0, this.J, LayoutManager.k0(this.x0(), this.y0(), this.J0() + this.E0(), staggeredGridLayoutManager$LayoutParams0.height, true), z);
                return;
            }
            this.s3(view0, LayoutManager.k0(this.R0(), this.S0(), this.G0() + this.H0(), staggeredGridLayoutManager$LayoutParams0.width, true), this.J, z);
            return;
        }
        if(this.w == 1) {
            this.s3(view0, LayoutManager.k0(this.x, this.S0(), 0, staggeredGridLayoutManager$LayoutParams0.width, false), LayoutManager.k0(this.x0(), this.y0(), this.J0() + this.E0(), staggeredGridLayoutManager$LayoutParams0.height, true), z);
            return;
        }
        this.s3(view0, LayoutManager.k0(this.R0(), this.S0(), this.G0() + this.H0(), staggeredGridLayoutManager$LayoutParams0.width, true), LayoutManager.k0(this.x, this.y0(), 0, staggeredGridLayoutManager$LayoutParams0.height, false), z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void u1(AccessibilityEvent accessibilityEvent0) {
        super.u1(accessibilityEvent0);
        if(this.j0() > 0) {
            View view0 = this.W2(false);
            View view1 = this.V2(false);
            if(view0 != null && view1 != null) {
                int v = this.K0(view0);
                int v1 = this.K0(view1);
                if(v < v1) {
                    accessibilityEvent0.setFromIndex(v);
                    accessibilityEvent0.setToIndex(v1);
                    return;
                }
                accessibilityEvent0.setFromIndex(v1);
                accessibilityEvent0.setToIndex(v);
            }
        }
    }

    private void u3(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        boolean z1 = true;
        AnchorInfo staggeredGridLayoutManager$AnchorInfo0 = this.L;
        if((this.I != null || this.C != -1) && recyclerView$State0.d() == 0) {
            this.W1(recyclerView$Recycler0);
            staggeredGridLayoutManager$AnchorInfo0.c();
            return;
        }
        boolean z2 = !staggeredGridLayoutManager$AnchorInfo0.e || this.C != -1 || this.I != null;
        if(z2) {
            staggeredGridLayoutManager$AnchorInfo0.c();
            if(this.I == null) {
                this.C3();
                staggeredGridLayoutManager$AnchorInfo0.c = this.A;
            }
            else {
                this.E2(staggeredGridLayoutManager$AnchorInfo0);
            }
            this.N3(recyclerView$State0, staggeredGridLayoutManager$AnchorInfo0);
            staggeredGridLayoutManager$AnchorInfo0.e = true;
        }
        if(this.I == null && this.C == -1 && (staggeredGridLayoutManager$AnchorInfo0.c != this.G || this.l() != this.H)) {
            this.E.b();
            staggeredGridLayoutManager$AnchorInfo0.d = true;
        }
        if(this.j0() > 0 && (this.I == null || this.I.c < 1)) {
            if(staggeredGridLayoutManager$AnchorInfo0.d) {
                for(int v = 0; v < this.s; ++v) {
                    this.t[v].e();
                    int v1 = staggeredGridLayoutManager$AnchorInfo0.b;
                    if(v1 != 0x80000000) {
                        this.t[v].A(v1);
                    }
                }
            }
            else if(z2 || this.L.f == null) {
                for(int v3 = 0; v3 < this.s; ++v3) {
                    this.t[v3].b(this.A, staggeredGridLayoutManager$AnchorInfo0.b);
                }
                this.L.d(this.t);
            }
            else {
                for(int v2 = 0; v2 < this.s; ++v2) {
                    Span staggeredGridLayoutManager$Span0 = this.t[v2];
                    staggeredGridLayoutManager$Span0.e();
                    staggeredGridLayoutManager$Span0.A(this.L.f[v2]);
                }
            }
        }
        this.S(recyclerView$Recycler0);
        this.y.a = false;
        this.M = false;
        this.P3(this.v.o());
        this.O3(staggeredGridLayoutManager$AnchorInfo0.a, recyclerView$State0);
        if(staggeredGridLayoutManager$AnchorInfo0.c) {
            this.G3(-1);
            this.S2(recyclerView$Recycler0, this.y, recyclerView$State0);
            this.G3(1);
        }
        else {
            this.G3(1);
            this.S2(recyclerView$Recycler0, this.y, recyclerView$State0);
            this.G3(-1);
        }
        this.y.c = staggeredGridLayoutManager$AnchorInfo0.a + this.y.d;
        this.S2(recyclerView$Recycler0, this.y, recyclerView$State0);
        this.B3();
        if(this.j0() > 0) {
            if(this.A) {
                this.c3(recyclerView$Recycler0, recyclerView$State0, true);
                this.d3(recyclerView$Recycler0, recyclerView$State0, false);
            }
            else {
                this.d3(recyclerView$Recycler0, recyclerView$State0, true);
                this.c3(recyclerView$Recycler0, recyclerView$State0, false);
            }
        }
        if(!z || recyclerView$State0.j() || this.F == 0 || this.j0() <= 0 || !this.M && this.q3() == null) {
            z1 = false;
        }
        else {
            this.a2(this.P);
            if(!this.J2()) {
                z1 = false;
            }
        }
        if(recyclerView$State0.j()) {
            this.L.c();
        }
        this.G = staggeredGridLayoutManager$AnchorInfo0.c;
        this.H = this.l();
        if(z1) {
            this.L.c();
            this.u3(recyclerView$Recycler0, recyclerView$State0, false);
        }
    }

    private boolean v3(int v) {
        return this.w == 0 ? v == -1 != this.A : v == -1 == this.A == this.l();
    }

    void w3(int v, State recyclerView$State0) {
        int v2;
        int v1;
        if(v > 0) {
            v1 = this.g3();
            v2 = 1;
        }
        else {
            v1 = this.e3();
            v2 = -1;
        }
        this.y.a = true;
        this.O3(v1, recyclerView$State0);
        this.G3(v2);
        this.y.c = v1 + this.y.d;
        this.y.b = Math.abs(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void x1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.x1(recyclerView$Recycler0, recyclerView$State0, accessibilityNodeInfoCompat0);
        accessibilityNodeInfoCompat0.k1("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    private void x3(View view0) {
        for(int v = this.s - 1; v >= 0; --v) {
            this.t[v].z(view0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        LinearSmoothScroller linearSmoothScroller0 = new LinearSmoothScroller(recyclerView0.getContext());
        linearSmoothScroller0.q(v);
        this.z2(linearSmoothScroller0);
    }

    private void y3(Recycler recyclerView$Recycler0, LayoutState layoutState0) {
        if(layoutState0.a && !layoutState0.i) {
            if(layoutState0.b == 0) {
                if(layoutState0.e == -1) {
                    this.z3(recyclerView$Recycler0, layoutState0.g);
                    return;
                }
                this.A3(recyclerView$Recycler0, layoutState0.f);
                return;
            }
            if(layoutState0.e == -1) {
                int v = layoutState0.f - this.i3(layoutState0.f);
                this.z3(recyclerView$Recycler0, (v >= 0 ? layoutState0.g - Math.min(v, layoutState0.b) : layoutState0.g));
                return;
            }
            int v1 = this.j3(layoutState0.g) - layoutState0.g;
            this.A3(recyclerView$Recycler0, (v1 >= 0 ? Math.min(v1, layoutState0.b) + layoutState0.f : layoutState0.f));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void z1(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            super.y1(view0, accessibilityNodeInfoCompat0);
            return;
        }
        if(this.w == 0) {
            accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(((LayoutParams)viewGroup$LayoutParams0).j(), (((LayoutParams)viewGroup$LayoutParams0).f ? this.s : 1), -1, -1, false, false));
            return;
        }
        accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(-1, -1, ((LayoutParams)viewGroup$LayoutParams0).j(), (((LayoutParams)viewGroup$LayoutParams0).f ? this.s : 1), false, false));
    }

    private void z3(Recycler recyclerView$Recycler0, int v) {
        for(int v1 = this.j0() - 1; v1 >= 0; --v1) {
            View view0 = this.i0(v1);
            if(this.u.g(view0) < v || this.u.r(view0) < v) {
                break;
            }
            LayoutParams staggeredGridLayoutManager$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(staggeredGridLayoutManager$LayoutParams0.f) {
                for(int v3 = 0; v3 < this.s; ++v3) {
                    if(this.t[v3].a.size() == 1) {
                        return;
                    }
                }
                for(int v2 = 0; v2 < this.s; ++v2) {
                    this.t[v2].x();
                }
            }
            else {
                if(staggeredGridLayoutManager$LayoutParams0.e.a.size() == 1) {
                    return;
                }
                staggeredGridLayoutManager$LayoutParams0.e.x();
            }
            this.Y1(view0, recyclerView$Recycler0);
        }
    }

    class androidx.recyclerview.widget.StaggeredGridLayoutManager.1 implements Runnable {
        final StaggeredGridLayoutManager a;

        @Override
        public void run() {
            StaggeredGridLayoutManager.this.J2();
        }
    }

}

