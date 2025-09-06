package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.gridlayout.R.dimen;
import androidx.gridlayout.R.styleable;
import androidx.legacy.widget.Space;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GridLayout extends ViewGroup {
    public static abstract class Alignment {
        abstract int a(View arg1, int arg2, int arg3);

        Bounds b() {
            return new Bounds();
        }

        abstract String c();

        abstract int d(View arg1, int arg2);

        int e(View view0, int v, int v1) {
            return v;
        }

        @Override
        public String toString() {
            return "Alignment:" + this.c();
        }
    }

    static final class Arc {
        public final Interval a;
        public final MutableInt b;
        public boolean c;

        public Arc(Interval gridLayout$Interval0, MutableInt gridLayout$MutableInt0) {
            this.c = true;
            this.a = gridLayout$Interval0;
            this.b = gridLayout$MutableInt0;
        }

        @Override
        public String toString() {
            return this.a + " " + (this.c ? "->" : "+>") + " " + this.b;
        }
    }

    static final class Assoc extends ArrayList {
        private final Class a;
        private final Class b;

        private Assoc(Class class0, Class class1) {
            this.a = class0;
            this.b = class1;
        }

        public static Assoc a(Class class0, Class class1) {
            return new Assoc(class0, class1);
        }

        public PackedMap b() {
            int v = this.size();
            Object[] arr_object = (Object[])Array.newInstance(this.a, v);
            Object[] arr_object1 = (Object[])Array.newInstance(this.b, v);
            for(int v1 = 0; v1 < v; ++v1) {
                arr_object[v1] = ((Pair)this.get(v1)).first;
                arr_object1[v1] = ((Pair)this.get(v1)).second;
            }
            return new PackedMap(arr_object, arr_object1);
        }

        public void c(Object object0, Object object1) {
            this.add(Pair.create(object0, object1));
        }
    }

    final class Axis {
        static final int A = 2;
        static final boolean B = false;
        public final boolean a;
        public int b;
        private int c;
        PackedMap d;
        public boolean e;
        PackedMap f;
        public boolean g;
        PackedMap h;
        public boolean i;
        public int[] j;
        public boolean k;
        public int[] l;
        public boolean m;
        public Arc[] n;
        public boolean o;
        public int[] p;
        public boolean q;
        public boolean r;
        public boolean s;
        public int[] t;
        boolean u;
        private MutableInt v;
        private MutableInt w;
        final GridLayout x;
        static final int y = 0;
        static final int z = 1;

        static {
        }

        Axis(boolean z) {
            this.b = 0x80000000;
            this.c = 0x80000000;
            this.e = false;
            this.g = false;
            this.i = false;
            this.k = false;
            this.m = false;
            this.o = false;
            this.q = false;
            this.s = false;
            this.u = true;
            this.v = new MutableInt(0);
            this.w = new MutableInt(-100000);
            this.a = z;
        }

        private boolean A() {
            if(!this.s) {
                this.r = this.g();
                this.s = true;
            }
            return this.r;
        }

        private void B(List list0, Interval gridLayout$Interval0, MutableInt gridLayout$MutableInt0) {
            this.C(list0, gridLayout$Interval0, gridLayout$MutableInt0, true);
        }

        private void C(List list0, Interval gridLayout$Interval0, MutableInt gridLayout$MutableInt0, boolean z) {
            if(gridLayout$Interval0.b() == 0) {
                return;
            }
            if(z) {
                for(Object object0: list0) {
                    if(((Arc)object0).a.equals(gridLayout$Interval0)) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            list0.add(new Arc(gridLayout$Interval0, gridLayout$MutableInt0));
        }

        private void D(int[] arr_v) {
            Arrays.fill(arr_v, 0);
        }

        public void E() {
            this.c = 0x80000000;
            this.d = null;
            this.f = null;
            this.h = null;
            this.j = null;
            this.l = null;
            this.n = null;
            this.p = null;
            this.t = null;
            this.s = false;
            this.F();
        }

        public void F() {
            this.e = false;
            this.g = false;
            this.i = false;
            this.k = false;
            this.m = false;
            this.o = false;
            this.q = false;
        }

        public boolean G() {
            return this.u;
        }

        public void H(int v) {
            this.M(v, v);
            this.u();
        }

        private void I(String s, Arc[] arr_gridLayout$Arc, boolean[] arr_z) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(int v = 0; v < arr_gridLayout$Arc.length; ++v) {
                Arc gridLayout$Arc0 = arr_gridLayout$Arc[v];
                if(arr_z[v]) {
                    arrayList0.add(gridLayout$Arc0);
                }
                if(!gridLayout$Arc0.c) {
                    arrayList1.add(gridLayout$Arc0);
                }
            }
            GridLayout.this.h.println(s + " constraints: " + this.b(arrayList0) + " are inconsistent; permanently removing: " + this.b(arrayList1) + ". ");
        }

        private boolean J(int[] arr_v, Arc gridLayout$Arc0) {
            if(!gridLayout$Arc0.c) {
                return false;
            }
            int v = gridLayout$Arc0.a.b;
            int v1 = arr_v[gridLayout$Arc0.a.a] + gridLayout$Arc0.b.a;
            if(v1 > arr_v[v]) {
                arr_v[v] = v1;
                return true;
            }
            return false;
        }

        public void K(int v) {
            if(v != 0x80000000 && v < this.v()) {
                GridLayout.x(((this.a ? "column" : "row") + "Count must be greater than or equal to the maximum of all grid indices " + "(and spans) defined in the LayoutParams of each child"));
            }
            this.b = v;
        }

        public void L(boolean z) {
            this.u = z;
            this.E();
        }

        private void M(int v, int v1) {
            this.v.a = v;
            this.w.a = -v1;
            this.q = false;
        }

        private void N(int v, float f) {
            Arrays.fill(this.t, 0);
            int v2 = GridLayout.this.getChildCount();
            for(int v1 = 0; v1 < v2; ++v1) {
                View view0 = GridLayout.this.getChildAt(v1);
                if(view0.getVisibility() != 8) {
                    LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                    float f1 = (this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).d;
                    if(f1 != 0.0f) {
                        int v3 = Math.round(((float)v) * f1 / f);
                        this.t[v1] = v3;
                        v -= v3;
                        f -= f1;
                    }
                }
            }
        }

        private int O(int[] arr_v) {
            return arr_v[this.p()];
        }

        private boolean P(int[] arr_v) {
            return this.Q(this.n(), arr_v);
        }

        private boolean Q(Arc[] arr_gridLayout$Arc, int[] arr_v) {
            return this.R(arr_gridLayout$Arc, arr_v, true);
        }

        private boolean R(Arc[] arr_gridLayout$Arc, int[] arr_v, boolean z) {
            String s = this.a ? "horizontal" : "vertical";
            int v = this.p();
            boolean[] arr_z = null;
            for(int v1 = 0; v1 < arr_gridLayout$Arc.length; ++v1) {
                this.D(arr_v);
                for(int v2 = 0; v2 < v + 1; ++v2) {
                    boolean z1 = false;
                    for(int v3 = 0; v3 < arr_gridLayout$Arc.length; ++v3) {
                        z1 |= this.J(arr_v, arr_gridLayout$Arc[v3]);
                    }
                    if(!z1) {
                        if(arr_z != null) {
                            this.I(s, arr_gridLayout$Arc, arr_z);
                        }
                        return true;
                    }
                }
                if(!z) {
                    return false;
                }
                boolean[] arr_z1 = new boolean[arr_gridLayout$Arc.length];
                for(int v4 = 0; v4 < v + 1; ++v4) {
                    for(int v5 = 0; v5 < arr_gridLayout$Arc.length; ++v5) {
                        arr_z1[v5] |= this.J(arr_v, arr_gridLayout$Arc[v5]);
                    }
                }
                if(v1 == 0) {
                    arr_z = arr_z1;
                }
                for(int v6 = 0; v6 < arr_gridLayout$Arc.length; ++v6) {
                    if(arr_z1[v6]) {
                        Arc gridLayout$Arc0 = arr_gridLayout$Arc[v6];
                        if(gridLayout$Arc0.a.a >= gridLayout$Arc0.a.b) {
                            gridLayout$Arc0.c = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }

        private void S(int[] arr_v) {
            Arrays.fill(this.q(), 0);
            this.P(arr_v);
            boolean z = true;
            int v = this.v.a * GridLayout.this.getChildCount() + 1;
            if(v < 2) {
                return;
            }
            float f = this.d();
            int v1 = -1;
            int v2 = 0;
            while(v2 < v) {
                int v3 = (int)((((long)v2) + ((long)v)) / 2L);
                this.F();
                this.N(v3, f);
                boolean z1 = this.R(this.n(), arr_v, false);
                if(z1) {
                    v2 = v3 + 1;
                    v1 = v3;
                }
                else {
                    v = v3;
                }
                z = z1;
            }
            if(v1 > 0 && !z) {
                this.F();
                this.N(v1, f);
                this.P(arr_v);
            }
        }

        private Arc[] T(List list0) {
            return this.U(((Arc[])list0.toArray(new Arc[list0.size()])));
        }

        private Arc[] U(Arc[] arr_gridLayout$Arc) {
            return new Object(arr_gridLayout$Arc) {
                Arc[] a;
                int b;
                Arc[][] c;
                int[] d;
                final Arc[] e;
                final Axis f;
                static final boolean g;

                {
                    Axis.this = gridLayout$Axis0;
                    this.e = arr_gridLayout$Arc;
                    super();
                    Arc[] arr_gridLayout$Arc1 = new Arc[arr_gridLayout$Arc.length];
                    this.a = arr_gridLayout$Arc1;
                    this.b = arr_gridLayout$Arc1.length - 1;
                    this.c = gridLayout$Axis0.z(arr_gridLayout$Arc);
                    this.d = new int[gridLayout$Axis0.p() + 1];
                }

                Arc[] a() {
                    for(int v = 0; v < this.c.length; ++v) {
                        this.b(v);
                    }
                    return this.a;
                }

                void b(int v) {
                    int[] arr_v = this.d;
                    if(arr_v[v] == 0) {
                        arr_v[v] = 1;
                        Arc[] arr_gridLayout$Arc = this.c[v];
                        for(int v1 = 0; v1 < arr_gridLayout$Arc.length; ++v1) {
                            Arc gridLayout$Arc0 = arr_gridLayout$Arc[v1];
                            this.b(gridLayout$Arc0.a.b);
                            int v2 = this.b;
                            this.b = v2 - 1;
                            this.a[v2] = gridLayout$Arc0;
                        }
                        this.d[v] = 2;
                    }
                }
            }.a();
        }

        private void a(List list0, PackedMap gridLayout$PackedMap0) {
            for(int v = 0; true; ++v) {
                Object[] arr_object = gridLayout$PackedMap0.b;
                if(v >= ((Interval[])arr_object).length) {
                    break;
                }
                this.C(list0, ((Interval[])arr_object)[v], ((MutableInt[])gridLayout$PackedMap0.c)[v], false);
            }
        }

        private String b(List list0) {
            StringBuilder stringBuilder1;
            String s = this.a ? "x" : "y";
            StringBuilder stringBuilder0 = new StringBuilder();
            boolean z = true;
            for(Object object0: list0) {
                if(z) {
                    z = false;
                }
                else {
                    stringBuilder0.append(", ");
                }
                int v = ((Arc)object0).a.a;
                int v1 = ((Arc)object0).a.b;
                int v2 = ((Arc)object0).b.a;
                if(v < v1) {
                    stringBuilder1 = new StringBuilder();
                    stringBuilder1.append(s);
                    stringBuilder1.append(v1);
                    stringBuilder1.append("-");
                    stringBuilder1.append(s);
                    stringBuilder1.append(v);
                    stringBuilder1.append(">=");
                }
                else {
                    stringBuilder1 = new StringBuilder();
                    stringBuilder1.append(s);
                    stringBuilder1.append(v);
                    stringBuilder1.append("-");
                    stringBuilder1.append(s);
                    stringBuilder1.append(v1);
                    stringBuilder1.append("<=");
                    v2 = -v2;
                }
                stringBuilder1.append(v2);
                stringBuilder0.append(stringBuilder1.toString());
            }
            return stringBuilder0.toString();
        }

        private int c() {
            int v = GridLayout.this.getChildCount();
            int v2 = -1;
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = GridLayout.this.getChildAt(v1);
                LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                Spec gridLayout$Spec0 = this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a;
                v2 = Math.max(Math.max(Math.max(v2, gridLayout$Spec0.b.a), gridLayout$Spec0.b.b), gridLayout$Spec0.b.b());
            }
            return v2 == -1 ? 0x80000000 : v2;
        }

        private float d() {
            int v = GridLayout.this.getChildCount();
            float f = 0.0f;
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = GridLayout.this.getChildAt(v1);
                if(view0.getVisibility() != 8) {
                    LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                    f += (this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).d;
                }
            }
            return f;
        }

        private void e() {
            this.r();
            this.o();
        }

        private void f() {
            Bounds[] arr_gridLayout$Bounds = (Bounds[])this.d.c;
            for(int v = 0; v < arr_gridLayout$Bounds.length; ++v) {
                arr_gridLayout$Bounds[v].d();
            }
            int v1 = GridLayout.this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = GridLayout.this.getChildAt(v2);
                LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                Spec gridLayout$Spec0 = this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a;
                int v3 = GridLayout.this.v(view0, this.a);
                int v4 = gridLayout$Spec0.d == 0.0f ? 0 : this.q()[v2];
                ((Bounds)this.d.c(v2)).c(GridLayout.this, view0, gridLayout$Spec0, this, v3 + v4);
            }
        }

        private boolean g() {
            int v = GridLayout.this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = GridLayout.this.getChildAt(v1);
                if(view0.getVisibility() != 8) {
                    LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                    if((this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).d != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void h(PackedMap gridLayout$PackedMap0, boolean z) {
            MutableInt[] arr_gridLayout$MutableInt = (MutableInt[])gridLayout$PackedMap0.c;
            for(int v1 = 0; v1 < arr_gridLayout$MutableInt.length; ++v1) {
                arr_gridLayout$MutableInt[v1].a();
            }
            Bounds[] arr_gridLayout$Bounds = (Bounds[])this.s().c;
            for(int v = 0; v < arr_gridLayout$Bounds.length; ++v) {
                int v2 = arr_gridLayout$Bounds[v].e(z);
                MutableInt gridLayout$MutableInt0 = (MutableInt)gridLayout$PackedMap0.c(v);
                int v3 = gridLayout$MutableInt0.a;
                if(!z) {
                    v2 = -v2;
                }
                gridLayout$MutableInt0.a = Math.max(v3, v2);
            }
        }

        private void i(int[] arr_v) {
            if(this.A()) {
                this.S(arr_v);
            }
            else {
                this.P(arr_v);
            }
            if(!this.u) {
                int v1 = arr_v[0];
                for(int v = 0; v < arr_v.length; ++v) {
                    arr_v[v] -= v1;
                }
            }
        }

        private void j(boolean z) {
            int[] arr_v = z ? this.j : this.l;
            int v = GridLayout.this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = GridLayout.this.getChildAt(v1);
                if(view0.getVisibility() != 8) {
                    LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                    Interval gridLayout$Interval0 = (this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).b;
                    int v2 = z ? gridLayout$Interval0.a : gridLayout$Interval0.b;
                    arr_v[v2] = Math.max(arr_v[v2], GridLayout.this.t(view0, this.a, z));
                }
            }
        }

        private Arc[] k() {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            this.a(arrayList0, this.r());
            this.a(arrayList1, this.o());
            if(this.u) {
                for(int v = 0; v < this.p(); ++v) {
                    this.B(arrayList0, new Interval(v, v + 1), new MutableInt(0));
                }
            }
            int v1 = this.p();
            this.C(arrayList0, new Interval(0, v1), this.v, false);
            this.C(arrayList1, new Interval(v1, 0), this.w, false);
            return (Arc[])GridLayout.b(this.T(arrayList0), this.T(arrayList1));
        }

        private PackedMap l() {
            Assoc gridLayout$Assoc0 = Assoc.a(Spec.class, Bounds.class);
            int v = GridLayout.this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = GridLayout.this.getChildAt(v1);
                LayoutParams gridLayout$LayoutParams0 = GridLayout.this.r(view0);
                Spec gridLayout$Spec0 = this.a ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a;
                gridLayout$Assoc0.c(gridLayout$Spec0, gridLayout$Spec0.c(this.a).b());
            }
            return gridLayout$Assoc0.b();
        }

        private PackedMap m(boolean z) {
            Assoc gridLayout$Assoc0 = Assoc.a(Interval.class, MutableInt.class);
            Spec[] arr_gridLayout$Spec = (Spec[])this.s().b;
            for(int v = 0; v < arr_gridLayout$Spec.length; ++v) {
                gridLayout$Assoc0.c((z ? arr_gridLayout$Spec[v].b : arr_gridLayout$Spec[v].b.a()), new MutableInt());
            }
            return gridLayout$Assoc0.b();
        }

        public Arc[] n() {
            if(this.n == null) {
                this.n = this.k();
            }
            if(!this.o) {
                this.e();
                this.o = true;
            }
            return this.n;
        }

        private PackedMap o() {
            if(this.h == null) {
                this.h = this.m(false);
            }
            if(!this.i) {
                this.h(this.h, false);
                this.i = true;
            }
            return this.h;
        }

        public int p() {
            return Math.max(this.b, this.v());
        }

        public int[] q() {
            if(this.t == null) {
                this.t = new int[GridLayout.this.getChildCount()];
            }
            return this.t;
        }

        private PackedMap r() {
            if(this.f == null) {
                this.f = this.m(true);
            }
            if(!this.g) {
                this.h(this.f, true);
                this.g = true;
            }
            return this.f;
        }

        public PackedMap s() {
            if(this.d == null) {
                this.d = this.l();
            }
            if(!this.e) {
                this.f();
                this.e = true;
            }
            return this.d;
        }

        public int[] t() {
            if(this.j == null) {
                this.j = new int[this.p() + 1];
            }
            if(!this.k) {
                this.j(true);
                this.k = true;
            }
            return this.j;
        }

        public int[] u() {
            if(this.p == null) {
                this.p = new int[this.p() + 1];
            }
            if(!this.q) {
                this.i(this.p);
                this.q = true;
            }
            return this.p;
        }

        private int v() {
            if(this.c == 0x80000000) {
                this.c = Math.max(0, this.c());
            }
            return this.c;
        }

        public int w(int v) {
            int v1 = View.MeasureSpec.getMode(v);
            int v2 = View.MeasureSpec.getSize(v);
            switch(v1) {
                case 0x80000000: {
                    return this.x(0, v2);
                }
                case 0: {
                    return this.x(0, 100000);
                }
                default: {
                    return v1 == 0x40000000 ? this.x(v2, v2) : 0;
                }
            }
        }

        private int x(int v, int v1) {
            this.M(v, v1);
            return this.O(this.u());
        }

        public int[] y() {
            if(this.l == null) {
                this.l = new int[this.p() + 1];
            }
            if(!this.m) {
                this.j(false);
                this.m = true;
            }
            return this.l;
        }

        Arc[][] z(Arc[] arr_gridLayout$Arc) {
            int v = this.p();
            Arc[][] arr2_gridLayout$Arc = new Arc[v + 1][];
            int[] arr_v = new int[v + 1];
            for(int v2 = 0; v2 < arr_gridLayout$Arc.length; ++v2) {
                int v3 = arr_gridLayout$Arc[v2].a.a;
                ++arr_v[v3];
            }
            for(int v4 = 0; v4 < v + 1; ++v4) {
                arr2_gridLayout$Arc[v4] = new Arc[arr_v[v4]];
            }
            Arrays.fill(arr_v, 0);
            for(int v1 = 0; v1 < arr_gridLayout$Arc.length; ++v1) {
                Arc gridLayout$Arc0 = arr_gridLayout$Arc[v1];
                Arc[] arr_gridLayout$Arc1 = arr2_gridLayout$Arc[gridLayout$Arc0.a.a];
                int v5 = arr_v[gridLayout$Arc0.a.a];
                arr_v[gridLayout$Arc0.a.a] = v5 + 1;
                arr_gridLayout$Arc1[v5] = gridLayout$Arc0;
            }
            return arr2_gridLayout$Arc;
        }
    }

    static class Bounds {
        public int a;
        public int b;
        public int c;

        Bounds() {
            this.d();
        }

        protected int a(GridLayout gridLayout0, View view0, Alignment gridLayout$Alignment0, int v, boolean z) {
            return this.a - gridLayout$Alignment0.a(view0, v, ViewGroupCompat.d(gridLayout0));
        }

        protected void b(int v, int v1) {
            this.a = Math.max(this.a, v);
            this.b = Math.max(this.b, v1);
        }

        protected final void c(GridLayout gridLayout0, View view0, Spec gridLayout$Spec0, Axis gridLayout$Axis0, int v) {
            this.c &= gridLayout$Spec0.d();
            int v1 = gridLayout$Spec0.c(gridLayout$Axis0.a).a(view0, v, ViewGroupCompat.d(gridLayout0));
            this.b(v1, v - v1);
        }

        protected void d() {
            this.a = 0x80000000;
            this.b = 0x80000000;
            this.c = 2;
        }

        // 去混淆评级： 低(20)
        protected int e(boolean z) {
            return z || !GridLayout.c(this.c) ? this.a + this.b : 100000;
        }

        @Override
        public String toString() {
            return "Bounds{before=" + this.a + ", after=" + this.b + '}';
        }
    }

    static final class Interval {
        public final int a;
        public final int b;

        public Interval(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        Interval a() {
            return new Interval(this.b, this.a);
        }

        int b() {
            return this.b - this.a;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Interval.class == class0 && this.b == ((Interval)object0).b ? this.a == ((Interval)object0).a : false;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a * 0x1F + this.b;
        }

        @Override
        public String toString() {
            return "[" + this.a + ", " + this.b + "]";
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public Spec a;
        public Spec b;
        private static final int c = -2;
        private static final int d = -2;
        private static final int e = 0x80000000;
        private static final int f = 0x80000000;
        private static final int g = 0x80000000;
        private static final Interval h;
        private static final int i;
        private static final int j;
        private static final int k;
        private static final int l;
        private static final int m;
        private static final int n;
        private static final int o;
        private static final int p;
        private static final int q;
        private static final int r;
        private static final int s;
        private static final int t;
        private static final int u;

        static {
            Interval gridLayout$Interval0 = new Interval(0x80000000, 0x80000001);
            LayoutParams.h = gridLayout$Interval0;
            LayoutParams.i = gridLayout$Interval0.b();
            LayoutParams.j = styleable.GridLayout_Layout_android_layout_margin;
            LayoutParams.k = styleable.GridLayout_Layout_android_layout_marginLeft;
            LayoutParams.l = styleable.GridLayout_Layout_android_layout_marginTop;
            LayoutParams.m = styleable.GridLayout_Layout_android_layout_marginRight;
            LayoutParams.n = styleable.GridLayout_Layout_android_layout_marginBottom;
            LayoutParams.o = styleable.GridLayout_Layout_layout_column;
            LayoutParams.p = styleable.GridLayout_Layout_layout_columnSpan;
            LayoutParams.q = styleable.GridLayout_Layout_layout_columnWeight;
            LayoutParams.r = styleable.GridLayout_Layout_layout_row;
            LayoutParams.s = styleable.GridLayout_Layout_layout_rowSpan;
            LayoutParams.t = styleable.GridLayout_Layout_layout_rowWeight;
            LayoutParams.u = styleable.GridLayout_Layout_layout_gravity;
        }

        public LayoutParams() {
            this(Spec.e, Spec.e);
        }

        private LayoutParams(int v, int v1, int v2, int v3, int v4, int v5, Spec gridLayout$Spec0, Spec gridLayout$Spec1) {
            super(v, v1);
            this.a = Spec.e;
            this.b = Spec.e;
            this.setMargins(v2, v3, v4, v5);
            this.a = gridLayout$Spec0;
            this.b = gridLayout$Spec1;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = Spec.e;
            this.b = Spec.e;
            this.b(context0, attributeSet0);
            this.a(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = Spec.e;
            this.b = Spec.e;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = Spec.e;
            this.b = Spec.e;
        }

        public LayoutParams(LayoutParams gridLayout$LayoutParams0) {
            super(gridLayout$LayoutParams0);
            this.a = gridLayout$LayoutParams0.a;
            this.b = gridLayout$LayoutParams0.b;
        }

        public LayoutParams(Spec gridLayout$Spec0, Spec gridLayout$Spec1) {
            this(-2, -2, 0x80000000, 0x80000000, 0x80000000, 0x80000000, gridLayout$Spec0, gridLayout$Spec1);
        }

        private void a(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.GridLayout_Layout);
            try {
                int v1 = typedArray0.getInt(LayoutParams.u, 0);
                this.b = GridLayout.N(typedArray0.getInt(LayoutParams.o, 0x80000000), typedArray0.getInt(LayoutParams.p, LayoutParams.i), GridLayout.n(v1, true), typedArray0.getFloat(LayoutParams.q, 0.0f));
                this.a = GridLayout.N(typedArray0.getInt(LayoutParams.r, 0x80000000), typedArray0.getInt(LayoutParams.s, LayoutParams.i), GridLayout.n(v1, false), typedArray0.getFloat(LayoutParams.t, 0.0f));
            }
            finally {
                typedArray0.recycle();
            }
        }

        private void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.GridLayout_Layout);
            try {
                int v1 = typedArray0.getDimensionPixelSize(LayoutParams.j, 0x80000000);
                this.leftMargin = typedArray0.getDimensionPixelSize(LayoutParams.k, v1);
                this.topMargin = typedArray0.getDimensionPixelSize(LayoutParams.l, v1);
                this.rightMargin = typedArray0.getDimensionPixelSize(LayoutParams.m, v1);
                this.bottomMargin = typedArray0.getDimensionPixelSize(LayoutParams.n, v1);
            }
            finally {
                typedArray0.recycle();
            }
        }

        final void c(Interval gridLayout$Interval0) {
            this.b = this.b.b(gridLayout$Interval0);
        }

        public void d(int v) {
            this.a = this.a.a(GridLayout.n(v, false));
            this.b = this.b.a(GridLayout.n(v, true));
        }

        final void e(Interval gridLayout$Interval0) {
            this.a = this.a.b(gridLayout$Interval0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.b.equals(((LayoutParams)object0).b) ? this.a.equals(((LayoutParams)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        @Override  // android.view.ViewGroup$LayoutParams
        protected void setBaseAttributes(TypedArray typedArray0, int v, int v1) {
            this.width = typedArray0.getLayoutDimension(v, -2);
            this.height = typedArray0.getLayoutDimension(v1, -2);
        }
    }

    static final class MutableInt {
        public int a;

        public MutableInt() {
            this.a();
        }

        public MutableInt(int v) {
            this.a = v;
        }

        public void a() {
            this.a = 0x80000000;
        }

        @Override
        public String toString() {
            return Integer.toString(this.a);
        }
    }

    static final class PackedMap {
        public final int[] a;
        public final Object[] b;
        public final Object[] c;

        PackedMap(Object[] arr_object, Object[] arr_object1) {
            int[] arr_v = PackedMap.b(arr_object);
            this.a = arr_v;
            this.b = PackedMap.a(arr_object, arr_v);
            this.c = PackedMap.a(arr_object1, arr_v);
        }

        private static Object[] a(Object[] arr_object, int[] arr_v) {
            Object[] arr_object1 = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), GridLayout.D(arr_v, -1) + 1);
            for(int v = 0; v < arr_object.length; ++v) {
                arr_object1[arr_v[v]] = arr_object[v];
            }
            return arr_object1;
        }

        private static int[] b(Object[] arr_object) {
            int[] arr_v = new int[arr_object.length];
            HashMap hashMap0 = new HashMap();
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                Integer integer0 = (Integer)hashMap0.get(object0);
                if(integer0 == null) {
                    integer0 = hashMap0.size();
                    hashMap0.put(object0, integer0);
                }
                arr_v[v] = (int)integer0;
            }
            return arr_v;
        }

        public Object c(int v) {
            return this.c[this.a[v]];
        }
    }

    public static class Spec {
        final boolean a;
        final Interval b;
        final Alignment c;
        final float d;
        static final Spec e;
        static final float f;

        static {
            Spec.e = GridLayout.I(0x80000000);
        }

        Spec(boolean z, int v, int v1, Alignment gridLayout$Alignment0, float f) {
            this(z, new Interval(v, v1 + v), gridLayout$Alignment0, f);
        }

        private Spec(boolean z, Interval gridLayout$Interval0, Alignment gridLayout$Alignment0, float f) {
            this.a = z;
            this.b = gridLayout$Interval0;
            this.c = gridLayout$Alignment0;
            this.d = f;
        }

        final Spec a(Alignment gridLayout$Alignment0) {
            return new Spec(this.a, this.b, gridLayout$Alignment0, this.d);
        }

        final Spec b(Interval gridLayout$Interval0) {
            return new Spec(this.a, gridLayout$Interval0, this.c, this.d);
        }

        public Alignment c(boolean z) {
            Alignment gridLayout$Alignment0 = this.c;
            if(gridLayout$Alignment0 != GridLayout.E) {
                return gridLayout$Alignment0;
            }
            if(this.d == 0.0f) {
                return z ? GridLayout.J : GridLayout.O;
            }
            return GridLayout.P;
        }

        final int d() {
            return this.c != GridLayout.E || this.d != 0.0f ? 2 : 0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.c.equals(((Spec)object0).c) ? this.b.equals(((Spec)object0).b) : false;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() * 0x1F + this.c.hashCode();
        }
    }

    private static final int A = 0;
    private static final int B = 0;
    private static final int C = 0;
    private static final int D = 0;
    static final Alignment E = null;
    private static final Alignment F = null;
    private static final Alignment G = null;
    public static final Alignment H = null;
    public static final Alignment I = null;
    public static final Alignment J = null;
    public static final Alignment K = null;
    public static final Alignment L = null;
    public static final Alignment M = null;
    static final int M8 = 2;
    public static final Alignment N = null;
    public static final Alignment O = null;
    public static final Alignment P = null;
    static final int Q = 0;
    final Axis a;
    final Axis b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    Printer h;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 0x80000000;
    public static final int l = 0;
    public static final int m = 1;
    static final int n = 100000;
    static final int o = 0;
    static final int p = 0;
    static final Printer q = null;
    static final Printer r = null;
    private static final int s = 0;
    private static final int t = 0x80000000;
    private static final boolean u = false;
    static final boolean v = true;
    private static final int w = 1;
    private static final int x;
    private static final int y;
    private static final int z;

    static {
        GridLayout.q = new LogPrinter(3, "androidx.gridlayout.widget.GridLayout");
        GridLayout.r = new Printer() {
            @Override  // android.util.Printer
            public void println(String s) {
            }
        };
        GridLayout.x = styleable.GridLayout_orientation;
        GridLayout.y = styleable.GridLayout_rowCount;
        GridLayout.z = styleable.GridLayout_columnCount;
        GridLayout.A = styleable.GridLayout_useDefaultMargins;
        GridLayout.B = styleable.GridLayout_alignmentMode;
        GridLayout.C = styleable.GridLayout_rowOrderPreserved;
        GridLayout.D = styleable.GridLayout_columnOrderPreserved;
        GridLayout.E = new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                return 0x80000000;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "UNDEFINED";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return 0x80000000;
            }
        };
        androidx.gridlayout.widget.GridLayout.3 gridLayout$30 = new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                return 0;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "LEADING";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return 0;
            }
        };
        GridLayout.F = gridLayout$30;
        androidx.gridlayout.widget.GridLayout.4 gridLayout$40 = new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                return v;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "TRAILING";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return v;
            }
        };
        GridLayout.G = gridLayout$40;
        GridLayout.H = gridLayout$30;
        GridLayout.I = gridLayout$40;
        GridLayout.J = gridLayout$30;
        GridLayout.K = gridLayout$40;
        GridLayout.L = GridLayout.h(gridLayout$30, gridLayout$40);
        GridLayout.M = GridLayout.h(gridLayout$40, gridLayout$30);
        GridLayout.N = new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                return v >> 1;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "CENTER";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return v >> 1;
            }
        };
        GridLayout.O = new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                if(view0.getVisibility() == 8) {
                    return 0;
                }
                int v2 = view0.getBaseline();
                return v2 == -1 ? 0x80000000 : v2;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public Bounds b() {
                return new Bounds() {
                    private int d;
                    final androidx.gridlayout.widget.GridLayout.7 e;

                    @Override  // androidx.gridlayout.widget.GridLayout$Bounds
                    protected int a(GridLayout gridLayout0, View view0, Alignment gridLayout$Alignment0, int v, boolean z) {
                        return Math.max(0, super.a(gridLayout0, view0, gridLayout$Alignment0, v, z));
                    }

                    @Override  // androidx.gridlayout.widget.GridLayout$Bounds
                    protected void b(int v, int v1) {
                        super.b(v, v1);
                        this.d = Math.max(this.d, v + v1);
                    }

                    @Override  // androidx.gridlayout.widget.GridLayout$Bounds
                    protected void d() {
                        super.d();
                        this.d = 0x80000000;
                    }

                    @Override  // androidx.gridlayout.widget.GridLayout$Bounds
                    protected int e(boolean z) {
                        return Math.max(super.e(z), this.d);
                    }
                };
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "BASELINE";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return 0;
            }
        };
        GridLayout.P = new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                return 0x80000000;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "FILL";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return 0;
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int e(View view0, int v, int v1) {
                return v1;
            }
        };
    }

    public GridLayout(Context context0) {
        this(context0, null);
    }

    public GridLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public GridLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new Axis(this, true);
        this.b = new Axis(this, false);
        this.c = 0;
        this.d = false;
        this.e = 1;
        this.g = 0;
        this.h = GridLayout.q;
        this.f = context0.getResources().getDimensionPixelOffset(dimen.default_gap);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.GridLayout);
        try {
            this.setRowCount(typedArray0.getInt(GridLayout.y, 0x80000000));
            this.setColumnCount(typedArray0.getInt(GridLayout.z, 0x80000000));
            this.setOrientation(typedArray0.getInt(GridLayout.x, 0));
            this.setUseDefaultMargins(typedArray0.getBoolean(GridLayout.A, false));
            this.setAlignmentMode(typedArray0.getInt(GridLayout.B, 1));
            this.setRowOrderPreserved(typedArray0.getBoolean(GridLayout.C, true));
            this.setColumnOrderPreserved(typedArray0.getBoolean(GridLayout.D, true));
        }
        finally {
            typedArray0.recycle();
        }
    }

    public boolean A() {
        return this.a.G();
    }

    private boolean B() {
        return ViewCompat.e0(this) == 1;
    }

    public boolean C() {
        return this.b.G();
    }

    static int D(int[] arr_v, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    private void E(View view0, int v, int v1, int v2, int v3) {
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.w(view0, true), v2), ViewGroup.getChildMeasureSpec(v1, this.w(view0, false), v3));
    }

    private void F(int v, int v1, boolean z) {
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.getChildAt(v3);
            if(view0.getVisibility() != 8) {
                LayoutParams gridLayout$LayoutParams0 = this.r(view0);
                if(z) {
                    this.E(view0, v, v1, gridLayout$LayoutParams0.width, gridLayout$LayoutParams0.height);
                }
                else {
                    boolean z1 = this.c == 0;
                    Spec gridLayout$Spec0 = z1 ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a;
                    if(gridLayout$Spec0.c(z1) == GridLayout.P) {
                        int[] arr_v = (z1 ? this.a : this.b).u();
                        int v4 = arr_v[gridLayout$Spec0.b.b] - arr_v[gridLayout$Spec0.b.a] - this.w(view0, z1);
                        if(z1) {
                            this.E(view0, v, v1, v4, gridLayout$LayoutParams0.height);
                        }
                        else {
                            this.E(view0, v, v1, gridLayout$LayoutParams0.width, v4);
                        }
                    }
                }
            }
        }
    }

    private static void G(int[] arr_v, int v, int v1, int v2) {
        Arrays.fill(arr_v, Math.min(v, arr_v.length), Math.min(v1, arr_v.length), v2);
    }

    private static void H(LayoutParams gridLayout$LayoutParams0, int v, int v1, int v2, int v3) {
        gridLayout$LayoutParams0.e(new Interval(v, v1 + v));
        gridLayout$LayoutParams0.c(new Interval(v2, v3 + v2));
    }

    public static Spec I(int v) {
        return GridLayout.K(v, 1);
    }

    public static Spec J(int v, float f) {
        return GridLayout.L(v, 1, f);
    }

    public static Spec K(int v, int v1) {
        return GridLayout.M(v, v1, GridLayout.E);
    }

    public static Spec L(int v, int v1, float f) {
        return GridLayout.N(v, v1, GridLayout.E, f);
    }

    public static Spec M(int v, int v1, Alignment gridLayout$Alignment0) {
        return GridLayout.N(v, v1, gridLayout$Alignment0, 0.0f);
    }

    public static Spec N(int v, int v1, Alignment gridLayout$Alignment0, float f) {
        return v == 0x80000000 ? new Spec(false, 0x80000000, v1, gridLayout$Alignment0, f) : new Spec(true, v, v1, gridLayout$Alignment0, f);
    }

    public static Spec O(int v, Alignment gridLayout$Alignment0) {
        return GridLayout.M(v, 1, gridLayout$Alignment0);
    }

    public static Spec P(int v, Alignment gridLayout$Alignment0, float f) {
        return GridLayout.N(v, 1, gridLayout$Alignment0, f);
    }

    private void Q() {
        boolean z = this.c == 0;
        Axis gridLayout$Axis0 = z ? this.a : this.b;
        int v = gridLayout$Axis0.b == 0x80000000 ? 0 : gridLayout$Axis0.b;
        int[] arr_v = new int[v];
        int v1 = this.getChildCount();
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            LayoutParams gridLayout$LayoutParams0 = (LayoutParams)this.getChildAt(v2).getLayoutParams();
            Spec gridLayout$Spec0 = z ? gridLayout$LayoutParams0.a : gridLayout$LayoutParams0.b;
            Interval gridLayout$Interval0 = gridLayout$Spec0.b;
            boolean z1 = gridLayout$Spec0.a;
            int v5 = gridLayout$Interval0.b();
            if(z1) {
                v3 = gridLayout$Interval0.a;
            }
            Spec gridLayout$Spec1 = z ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a;
            Interval gridLayout$Interval1 = gridLayout$Spec1.b;
            boolean z2 = gridLayout$Spec1.a;
            int v6 = GridLayout.e(gridLayout$Interval1, z2, v);
            if(z2) {
                v4 = gridLayout$Interval1.a;
            }
            if(v != 0) {
                if(!z1 || !z2) {
                    while(true) {
                        int v7 = v4 + v6;
                        if(GridLayout.j(arr_v, v3, v4, v7)) {
                            break;
                        }
                        if(z2) {
                            ++v3;
                        }
                        else if(v7 <= v) {
                            ++v4;
                        }
                        else {
                            ++v3;
                            v4 = 0;
                        }
                    }
                }
                GridLayout.G(arr_v, v4, v4 + v6, v3 + v5);
            }
            if(z) {
                GridLayout.H(gridLayout$LayoutParams0, v3, v5, v4, v6);
            }
            else {
                GridLayout.H(gridLayout$LayoutParams0, v4, v6, v3, v5);
            }
            v4 += v6;
        }
    }

    static int a(int v, int v1) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v1 + v), View.MeasureSpec.getMode(v));
    }

    static Object[] b(Object[] arr_object, Object[] arr_object1) {
        Object[] arr_object2 = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), arr_object.length + arr_object1.length);
        System.arraycopy(arr_object, 0, arr_object2, 0, arr_object.length);
        System.arraycopy(arr_object1, 0, arr_object2, arr_object.length, arr_object1.length);
        return arr_object2;
    }

    static boolean c(int v) {
        return (v & 2) != 0;
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            return false;
        }
        this.d(((LayoutParams)viewGroup$LayoutParams0), true);
        this.d(((LayoutParams)viewGroup$LayoutParams0), false);
        return true;
    }

    private void d(LayoutParams gridLayout$LayoutParams0, boolean z) {
        Interval gridLayout$Interval0 = (z ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).b;
        if(gridLayout$Interval0.a != 0x80000000 && gridLayout$Interval0.a < 0) {
            GridLayout.x(((z ? "column" : "row") + " indices must be positive"));
        }
        int v = (z ? this.a : this.b).b;
        if(v != 0x80000000) {
            if(gridLayout$Interval0.b > v) {
                GridLayout.x(((z ? "column" : "row") + " indices (start + span) mustn\'t exceed the " + (z ? "column" : "row") + " count"));
            }
            if(gridLayout$Interval0.b() > v) {
                GridLayout.x(((z ? "column" : "row") + " span mustn\'t exceed the " + (z ? "column" : "row") + " count"));
            }
        }
    }

    private static int e(Interval gridLayout$Interval0, boolean z, int v) {
        int v1 = gridLayout$Interval0.b();
        if(v == 0) {
            return v1;
        }
        return z ? Math.min(v1, v - Math.min(gridLayout$Interval0.a, v)) : Math.min(v1, v);
    }

    private int f() {
        int v = this.getChildCount();
        int v1 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                v1 = v1 * 0x1F + ((LayoutParams)view0.getLayoutParams()).hashCode();
            }
        }
        return v1;
    }

    private void g() {
        int v = this.g;
        if(v == 0) {
            this.Q();
            this.g = this.f();
            return;
        }
        if(v != this.f()) {
            this.h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            this.y();
            this.g();
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.k();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.l(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.m(viewGroup$LayoutParams0);
    }

    public int getAlignmentMode() {
        return this.e;
    }

    public int getColumnCount() {
        return this.a.p();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.h;
    }

    public int getRowCount() {
        return this.b.p();
    }

    public boolean getUseDefaultMargins() {
        return this.d;
    }

    private static Alignment h(Alignment gridLayout$Alignment0, Alignment gridLayout$Alignment1) {
        return new Alignment() {
            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            public int a(View view0, int v, int v1) {
                return ViewCompat.e0(view0) == 1 ? gridLayout$Alignment1.a(view0, v, v1) : gridLayout$Alignment0.a(view0, v, v1);
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            String c() {
                return "SWITCHING[L:" + gridLayout$Alignment0.c() + ", R:" + gridLayout$Alignment1.c() + "]";
            }

            @Override  // androidx.gridlayout.widget.GridLayout$Alignment
            int d(View view0, int v) {
                return ViewCompat.e0(view0) == 1 ? gridLayout$Alignment1.d(view0, v) : gridLayout$Alignment0.d(view0, v);
            }
        };
    }

    private void i(Canvas canvas0, int v, int v1, int v2, int v3, Paint paint0) {
        if(this.B()) {
            int v4 = this.getWidth();
            canvas0.drawLine(((float)(v4 - v)), ((float)v1), ((float)(v4 - v2)), ((float)v3), paint0);
            return;
        }
        canvas0.drawLine(((float)v), ((float)v1), ((float)v2), ((float)v3), paint0);
    }

    private static boolean j(int[] arr_v, int v, int v1, int v2) {
        if(v2 > arr_v.length) {
            return false;
        }
        while(v1 < v2) {
            if(arr_v[v1] > v) {
                return false;
            }
            ++v1;
        }
        return true;
    }

    protected LayoutParams k() {
        return new LayoutParams();
    }

    public LayoutParams l(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    protected LayoutParams m(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    static Alignment n(int v, boolean z) {
        switch((v & (z ? 7 : 0x70)) >> (z ? 0 : 4)) {
            case 1: {
                return GridLayout.N;
            }
            case 3: {
                return z ? GridLayout.L : GridLayout.H;
            }
            case 5: {
                return z ? GridLayout.M : GridLayout.I;
            }
            case 7: {
                return GridLayout.P;
            }
            case 0x800003: {
                return GridLayout.J;
            }
            case 0x800005: {
                return GridLayout.K;
            }
            default: {
                return GridLayout.E;
            }
        }
    }

    private int o(View view0, LayoutParams gridLayout$LayoutParams0, boolean z, boolean z1) {
        boolean z2;
        if(!this.d) {
            return 0;
        }
        Axis gridLayout$Axis0 = z ? this.a : this.b;
        Interval gridLayout$Interval0 = (z ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).b;
        if(!z || !this.B()) {
            z2 = z1;
        }
        else if(!z1) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        if(z2) {
            return gridLayout$Interval0.a == 0 ? this.q(view0, true, z, z1) : this.q(view0, false, z, z1);
        }
        int v = gridLayout$Axis0.p();
        return gridLayout$Interval0.b == v ? this.q(view0, true, z, z1) : this.q(view0, false, z, z1);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.g();
        int v4 = v2 - v;
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingTop();
        int v7 = this.getPaddingRight();
        int v8 = this.getPaddingBottom();
        this.a.H(v4 - v5 - v7);
        this.b.H(v3 - v1 - v6 - v8);
        int[] arr_v = this.a.u();
        int[] arr_v1 = this.b.u();
        int v9 = this.getChildCount();
        for(int v10 = 0; v10 < v9; ++v10) {
            View view0 = this.getChildAt(v10);
            if(view0.getVisibility() != 8) {
                LayoutParams gridLayout$LayoutParams0 = this.r(view0);
                Spec gridLayout$Spec0 = gridLayout$LayoutParams0.b;
                Spec gridLayout$Spec1 = gridLayout$LayoutParams0.a;
                int v11 = arr_v[gridLayout$Spec0.b.a];
                int v12 = arr_v1[gridLayout$Spec1.b.a];
                int v13 = arr_v[gridLayout$Spec0.b.b] - v11;
                int v14 = arr_v1[gridLayout$Spec1.b.b] - v12;
                int v15 = this.u(view0, true);
                int v16 = this.u(view0, false);
                Alignment gridLayout$Alignment0 = gridLayout$Spec0.c(true);
                Alignment gridLayout$Alignment1 = gridLayout$Spec1.c(false);
                Bounds gridLayout$Bounds0 = (Bounds)this.a.s().c(v10);
                Bounds gridLayout$Bounds1 = (Bounds)this.b.s().c(v10);
                int v17 = gridLayout$Alignment0.d(view0, v13 - gridLayout$Bounds0.e(true));
                int v18 = gridLayout$Alignment1.d(view0, v14 - gridLayout$Bounds1.e(true));
                int v19 = this.s(view0, true, true);
                int v20 = this.s(view0, false, true);
                int v21 = this.s(view0, true, false);
                int v22 = v19 + v21;
                int v23 = v20 + this.s(view0, false, false);
                int v24 = gridLayout$Bounds0.a(this, view0, gridLayout$Alignment0, v15 + v22, true);
                int v25 = gridLayout$Bounds1.a(this, view0, gridLayout$Alignment1, v16 + v23, false);
                int v26 = gridLayout$Alignment0.e(view0, v15, v13 - v22);
                int v27 = gridLayout$Alignment1.e(view0, v16, v14 - v23);
                int v28 = v11 + v17 + v24;
                int v29 = this.B() ? v4 - v26 - v7 - v21 - v28 : v5 + v19 + v28;
                int v30 = v6 + v12 + v18 + v25 + v20;
                if(v26 != view0.getMeasuredWidth() || v27 != view0.getMeasuredHeight()) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v26, 0x40000000), View.MeasureSpec.makeMeasureSpec(v27, 0x40000000));
                }
                view0.layout(v29, v30, v26 + v29, v27 + v30);
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v7;
        int v6;
        this.g();
        this.z();
        int v2 = this.getPaddingLeft() + this.getPaddingRight();
        int v3 = this.getPaddingTop() + this.getPaddingBottom();
        int v4 = GridLayout.a(v, -v2);
        int v5 = GridLayout.a(v1, -v3);
        this.F(v4, v5, true);
        if(this.c == 0) {
            v6 = this.a.w(v4);
            this.F(v4, v5, false);
            v7 = this.b.w(v5);
        }
        else {
            int v8 = this.b.w(v5);
            this.F(v4, v5, false);
            v6 = this.a.w(v4);
            v7 = v8;
        }
        int v9 = Math.max(v6 + v2, this.getSuggestedMinimumWidth());
        int v10 = Math.max(v7 + v3, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(v9, v, 0), View.resolveSizeAndState(v10, v1, 0));
    }

    private int p(View view0, boolean z, boolean z1) {
        return view0.getClass() == Space.class || view0.getClass() == android.widget.Space.class ? 0 : this.f / 2;
    }

    private int q(View view0, boolean z, boolean z1, boolean z2) {
        return this.p(view0, z1, z2);
    }

    final LayoutParams r(View view0) {
        return (LayoutParams)view0.getLayoutParams();
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.y();
    }

    private int s(View view0, boolean z, boolean z1) {
        if(this.e == 1) {
            return this.t(view0, z, z1);
        }
        Axis gridLayout$Axis0 = z ? this.a : this.b;
        int[] arr_v = z1 ? gridLayout$Axis0.t() : gridLayout$Axis0.y();
        LayoutParams gridLayout$LayoutParams0 = this.r(view0);
        Interval gridLayout$Interval0 = (z ? gridLayout$LayoutParams0.b : gridLayout$LayoutParams0.a).b;
        return z1 ? arr_v[gridLayout$Interval0.a] : arr_v[gridLayout$Interval0.b];
    }

    public void setAlignmentMode(int v) {
        this.e = v;
        this.requestLayout();
    }

    public void setColumnCount(int v) {
        this.a.K(v);
        this.y();
        this.requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.a.L(z);
        this.y();
        this.requestLayout();
    }

    public void setOrientation(int v) {
        if(this.c != v) {
            this.c = v;
            this.y();
            this.requestLayout();
        }
    }

    public void setPrinter(Printer printer0) {
        if(printer0 == null) {
            printer0 = GridLayout.r;
        }
        this.h = printer0;
    }

    public void setRowCount(int v) {
        this.b.K(v);
        this.y();
        this.requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.b.L(z);
        this.y();
        this.requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.d = z;
        this.requestLayout();
    }

    int t(View view0, boolean z, boolean z1) {
        int v;
        LayoutParams gridLayout$LayoutParams0 = this.r(view0);
        if(z) {
            if(z1) {
                v = gridLayout$LayoutParams0.leftMargin;
                return v == 0x80000000 ? this.o(view0, gridLayout$LayoutParams0, true, true) : v;
            }
            v = gridLayout$LayoutParams0.rightMargin;
            return v == 0x80000000 ? this.o(view0, gridLayout$LayoutParams0, true, false) : v;
        }
        v = z1 ? gridLayout$LayoutParams0.topMargin : gridLayout$LayoutParams0.bottomMargin;
        return v == 0x80000000 ? this.o(view0, gridLayout$LayoutParams0, false, z1) : v;
    }

    // 去混淆评级： 低(20)
    private int u(View view0, boolean z) {
        return z ? view0.getMeasuredWidth() : view0.getMeasuredHeight();
    }

    final int v(View view0, boolean z) {
        return view0.getVisibility() == 8 ? 0 : this.u(view0, z) + this.w(view0, z);
    }

    private int w(View view0, boolean z) {
        return this.s(view0, z, true) + this.s(view0, z, false);
    }

    static void x(String s) {
        throw new IllegalArgumentException(s + ". ");
    }

    private void y() {
        this.g = 0;
        Axis gridLayout$Axis0 = this.a;
        if(gridLayout$Axis0 != null) {
            gridLayout$Axis0.E();
        }
        Axis gridLayout$Axis1 = this.b;
        if(gridLayout$Axis1 != null) {
            gridLayout$Axis1.E();
        }
        this.z();
    }

    private void z() {
        Axis gridLayout$Axis0 = this.a;
        if(gridLayout$Axis0 != null && this.b != null) {
            gridLayout$Axis0.F();
            this.b.F();
        }
    }
}

