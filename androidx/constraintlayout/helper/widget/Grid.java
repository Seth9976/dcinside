package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Grid extends VirtualLayout {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean[][] E;
    Set F;
    private int[] G;
    private static final String H = "Grid";
    public static final int I = 1;
    public static final int J = 0;
    private static final boolean K = false;
    private final int m;
    private final int n;
    private View[] o;
    ConstraintLayout p;
    private int q;
    private int r;
    private int s;
    private int t;
    private String u;
    private String v;
    private String w;
    private String x;
    private float y;
    private float z;

    public Grid(Context context0) {
        super(context0);
        this.m = 50;
        this.n = 50;
        this.B = 0;
        this.F = new HashSet();
    }

    public Grid(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.m = 50;
        this.n = 50;
        this.B = 0;
        this.F = new HashSet();
    }

    public Grid(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.m = 50;
        this.n = 50;
        this.B = 0;
        this.F = new HashSet();
    }

    private boolean M() {
        View[] arr_view = this.x(this.p);
        for(int v = 0; v < this.b; ++v) {
            if(!this.F.contains(((int)this.a[v]))) {
                int v1 = this.getNextPosition();
                int v2 = this.T(v1);
                int v3 = this.S(v1);
                if(v1 == -1) {
                    return false;
                }
                this.Q(arr_view[v], v2, v3, 1, 1);
            }
        }
        return true;
    }

    private void N() {
        int v = Math.max(this.q, this.s);
        View[] arr_view = this.o;
        if(arr_view == null) {
            this.o = new View[v];
            for(int v2 = 0; true; ++v2) {
                View[] arr_view1 = this.o;
                if(v2 >= arr_view1.length) {
                    break;
                }
                arr_view1[v2] = this.a0();
            }
        }
        else if(v != arr_view.length) {
            View[] arr_view2 = new View[v];
            for(int v3 = 0; v3 < v; ++v3) {
                View[] arr_view3 = this.o;
                arr_view2[v3] = v3 < arr_view3.length ? arr_view3[v3] : this.a0();
            }
            for(int v4 = v; true; ++v4) {
                View[] arr_view4 = this.o;
                if(v4 >= arr_view4.length) {
                    break;
                }
                this.p.removeView(arr_view4[v4]);
            }
            this.o = arr_view2;
        }
        this.G = new int[v];
        for(int v1 = 0; true; ++v1) {
            View[] arr_view5 = this.o;
            if(v1 >= arr_view5.length) {
                break;
            }
            int[] arr_v = this.G;
            arr_v[v1] = arr_view5[v1].getId();
        }
        this.f0();
        this.e0();
    }

    private void O(View view0) {
        LayoutParams constraintLayout$LayoutParams0 = this.b0(view0);
        constraintLayout$LayoutParams0.L = -1.0f;
        constraintLayout$LayoutParams0.f = -1;
        constraintLayout$LayoutParams0.e = -1;
        constraintLayout$LayoutParams0.g = -1;
        constraintLayout$LayoutParams0.h = -1;
        constraintLayout$LayoutParams0.leftMargin = -1;
        view0.setLayoutParams(constraintLayout$LayoutParams0);
    }

    private void P(View view0) {
        LayoutParams constraintLayout$LayoutParams0 = this.b0(view0);
        constraintLayout$LayoutParams0.M = -1.0f;
        constraintLayout$LayoutParams0.j = -1;
        constraintLayout$LayoutParams0.i = -1;
        constraintLayout$LayoutParams0.k = -1;
        constraintLayout$LayoutParams0.l = -1;
        constraintLayout$LayoutParams0.topMargin = -1;
        view0.setLayoutParams(constraintLayout$LayoutParams0);
    }

    private void Q(View view0, int v, int v1, int v2, int v3) {
        LayoutParams constraintLayout$LayoutParams0 = this.b0(view0);
        int[] arr_v = this.G;
        constraintLayout$LayoutParams0.e = arr_v[v1];
        constraintLayout$LayoutParams0.i = arr_v[v];
        constraintLayout$LayoutParams0.h = arr_v[v1 + v3 - 1];
        constraintLayout$LayoutParams0.l = arr_v[v + v2 - 1];
        view0.setLayoutParams(constraintLayout$LayoutParams0);
    }

    private boolean R(boolean z) {
        boolean z1;
        if(this.p != null && this.q >= 1 && this.s >= 1) {
            if(z) {
                for(int v = 0; v < this.E.length; ++v) {
                    for(int v1 = 0; true; ++v1) {
                        boolean[][] arr2_z = this.E;
                        if(v1 >= arr2_z[0].length) {
                            break;
                        }
                        arr2_z[v][v1] = true;
                    }
                }
                this.F.clear();
            }
            this.B = 0;
            this.N();
            if(this.v == null || this.v.trim().isEmpty()) {
                z1 = true;
            }
            else {
                int[][] arr2_v = this.c0(this.v);
                z1 = arr2_v == null ? true : this.U(arr2_v);
            }
            if(this.u != null && !this.u.trim().isEmpty()) {
                int[][] arr2_v1 = this.c0(this.u);
                if(arr2_v1 != null) {
                    z1 &= this.V(this.a, arr2_v1);
                }
            }
            return (z1 & this.M()) != 0 || !this.C;
        }
        return false;
    }

    private int S(int v) {
        return this.A == 1 ? v / this.q : v % this.s;
    }

    private int T(int v) {
        return this.A == 1 ? v % this.q : v / this.s;
    }

    private boolean U(int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            int v1 = this.T(arr2_v[v][0]);
            int v2 = this.S(arr2_v[v][0]);
            int[] arr_v = arr2_v[v];
            if(!this.X(v1, v2, arr_v[1], arr_v[2])) {
                return false;
            }
        }
        return true;
    }

    private boolean V(int[] arr_v, int[][] arr2_v) {
        View[] arr_view = this.x(this.p);
        for(int v = 0; v < arr2_v.length; ++v) {
            int v1 = this.T(arr2_v[v][0]);
            int v2 = this.S(arr2_v[v][0]);
            int[] arr_v1 = arr2_v[v];
            if(!this.X(v1, v2, arr_v1[1], arr_v1[2])) {
                return false;
            }
            View view0 = arr_view[v];
            int[] arr_v2 = arr2_v[v];
            this.Q(view0, v1, v2, arr_v2[1], arr_v2[2]);
            this.F.add(((int)arr_v[v]));
        }
        return true;
    }

    private void W() {
        int[] arr_v = new int[2];
        arr_v[1] = this.s;
        arr_v[0] = this.q;
        boolean[][] arr2_z = (boolean[][])Array.newInstance(Boolean.TYPE, arr_v);
        this.E = arr2_z;
        for(int v = 0; v < arr2_z.length; ++v) {
            Arrays.fill(arr2_z[v], true);
        }
    }

    private boolean X(int v, int v1, int v2, int v3) {
        int v4 = v;
        while(v4 < v + v2) {
            int v5 = v1;
            while(v5 < v1 + v3) {
                boolean[][] arr2_z = this.E;
                if(v4 < arr2_z.length && v5 < arr2_z[0].length) {
                    boolean[] arr_z = arr2_z[v4];
                    if(!arr_z[v5]) {
                        return false;
                    }
                    arr_z[v5] = false;
                    ++v5;
                    continue;
                }
                return false;
            }
            ++v4;
        }
        return true;
    }

    private boolean Y(CharSequence charSequence0) [...] // Inlined contents

    private boolean Z(String s) [...] // Inlined contents

    private View a0() {
        View view0 = new View(this.getContext());
        view0.setId(View.generateViewId());
        view0.setVisibility(4);
        LayoutParams constraintLayout$LayoutParams0 = new LayoutParams(0, 0);
        this.p.addView(view0, constraintLayout$LayoutParams0);
        return view0;
    }

    private LayoutParams b0(View view0) {
        return (LayoutParams)view0.getLayoutParams();
    }

    private int[][] c0(String s) {
        String[] arr_s = s.split(",");
        int[][] arr2_v = new int[arr_s.length][3];
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].trim().split(":");
            String[] arr_s2 = arr_s1[1].split("x");
            int[] arr_v = arr2_v[v];
            arr_v[0] = Integer.parseInt(arr_s1[0]);
            int[] arr_v1 = arr2_v[v];
            arr_v1[1] = Integer.parseInt(arr_s2[0]);
            int[] arr_v2 = arr2_v[v];
            arr_v2[2] = Integer.parseInt(arr_s2[1]);
        }
        return arr2_v;
    }

    private float[] d0(int v, String s) {
        float[] arr_f = null;
        if(s != null && !s.trim().isEmpty()) {
            String[] arr_s = s.split(",");
            if(arr_s.length != v) {
                return null;
            }
            arr_f = new float[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_f[v1] = Float.parseFloat(arr_s[v1].trim());
            }
        }
        return arr_f;
    }

    private void e0() {
        int v3;
        int v = this.getId();
        int v1 = Math.max(this.q, this.s);
        float[] arr_f = this.d0(this.s, this.x);
        LayoutParams constraintLayout$LayoutParams0 = this.b0(this.o[0]);
        if(this.s == 1) {
            this.O(this.o[0]);
            constraintLayout$LayoutParams0.e = v;
            constraintLayout$LayoutParams0.h = v;
            this.o[0].setLayoutParams(constraintLayout$LayoutParams0);
            return;
        }
        for(int v2 = 0; true; ++v2) {
            v3 = this.s;
            if(v2 >= v3) {
                break;
            }
            LayoutParams constraintLayout$LayoutParams1 = this.b0(this.o[v2]);
            this.O(this.o[v2]);
            if(arr_f != null) {
                constraintLayout$LayoutParams1.L = arr_f[v2];
            }
            if(v2 > 0) {
                constraintLayout$LayoutParams1.f = this.G[v2 - 1];
            }
            else {
                constraintLayout$LayoutParams1.e = v;
            }
            if(v2 < this.s - 1) {
                constraintLayout$LayoutParams1.g = this.G[v2 + 1];
            }
            else {
                constraintLayout$LayoutParams1.h = v;
            }
            if(v2 > 0) {
                constraintLayout$LayoutParams1.leftMargin = (int)this.y;
            }
            this.o[v2].setLayoutParams(constraintLayout$LayoutParams1);
        }
        while(v3 < v1) {
            LayoutParams constraintLayout$LayoutParams2 = this.b0(this.o[v3]);
            this.O(this.o[v3]);
            constraintLayout$LayoutParams2.e = v;
            constraintLayout$LayoutParams2.h = v;
            this.o[v3].setLayoutParams(constraintLayout$LayoutParams2);
            ++v3;
        }
    }

    private void f0() {
        int v3;
        int v = this.getId();
        int v1 = Math.max(this.q, this.s);
        float[] arr_f = this.d0(this.q, this.w);
        if(this.q == 1) {
            LayoutParams constraintLayout$LayoutParams0 = this.b0(this.o[0]);
            this.P(this.o[0]);
            constraintLayout$LayoutParams0.i = v;
            constraintLayout$LayoutParams0.l = v;
            this.o[0].setLayoutParams(constraintLayout$LayoutParams0);
            return;
        }
        for(int v2 = 0; true; ++v2) {
            v3 = this.q;
            if(v2 >= v3) {
                break;
            }
            LayoutParams constraintLayout$LayoutParams1 = this.b0(this.o[v2]);
            this.P(this.o[v2]);
            if(arr_f != null) {
                constraintLayout$LayoutParams1.M = arr_f[v2];
            }
            if(v2 > 0) {
                constraintLayout$LayoutParams1.j = this.G[v2 - 1];
            }
            else {
                constraintLayout$LayoutParams1.i = v;
            }
            if(v2 < this.q - 1) {
                constraintLayout$LayoutParams1.k = this.G[v2 + 1];
            }
            else {
                constraintLayout$LayoutParams1.l = v;
            }
            if(v2 > 0) {
                constraintLayout$LayoutParams1.topMargin = (int)this.y;
            }
            this.o[v2].setLayoutParams(constraintLayout$LayoutParams1);
        }
        while(v3 < v1) {
            LayoutParams constraintLayout$LayoutParams2 = this.b0(this.o[v3]);
            this.P(this.o[v3]);
            constraintLayout$LayoutParams2.i = v;
            constraintLayout$LayoutParams2.l = v;
            this.o[v3].setLayoutParams(constraintLayout$LayoutParams2);
            ++v3;
        }
    }

    private void g0() {
        int v = this.r;
        if(v != 0) {
            int v1 = this.t;
            if(v1 != 0) {
                this.q = v;
                this.s = v1;
                return;
            }
        }
        int v2 = this.t;
        if(v2 > 0) {
            this.s = v2;
            this.q = (this.b + v2 - 1) / v2;
            return;
        }
        if(v > 0) {
            this.q = v;
            this.s = (this.b + v - 1) / v;
            return;
        }
        double f = Math.sqrt(this.b);
        this.q = (int)(f + 1.5);
        this.s = (this.b + ((int)(f + 1.5)) - 1) / ((int)(f + 1.5));
    }

    public String getColumnWeights() {
        return this.x;
    }

    public int getColumns() {
        return this.t;
    }

    public float getHorizontalGaps() {
        return this.y;
    }

    private int getNextPosition() {
        int v = 0;
        boolean z = false;
        while(!z) {
            v = this.B;
            if(v >= this.q * this.s) {
                return -1;
            }
            int v1 = this.T(v);
            int v2 = this.S(this.B);
            boolean[] arr_z = this.E[v1];
            if(arr_z[v2]) {
                arr_z[v2] = false;
                z = true;
            }
            ++this.B;
        }
        return v;
    }

    public int getOrientation() {
        return this.A;
    }

    public String getRowWeights() {
        return this.w;
    }

    public int getRows() {
        return this.r;
    }

    public String getSkips() {
        return this.v;
    }

    public String getSpans() {
        return this.u;
    }

    public float getVerticalGaps() {
        return this.z;
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = (ConstraintLayout)this.getParent();
        this.R(false);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void onDraw(@NonNull Canvas canvas0) {
        super.onDraw(canvas0);
        if(!this.isInEditMode()) {
            return;
        }
        Paint paint0 = new Paint();
        paint0.setColor(0xFFFF0000);
        paint0.setStyle(Paint.Style.STROKE);
        int v = this.getTop();
        int v1 = this.getLeft();
        int v2 = this.getBottom();
        int v3 = this.getRight();
        View[] arr_view = this.o;
        for(int v4 = 0; v4 < arr_view.length; ++v4) {
            View view0 = arr_view[v4];
            int v5 = view0.getLeft();
            int v6 = view0.getTop();
            int v7 = view0.getRight();
            int v8 = view0.getBottom();
            canvas0.drawRect(((float)(v5 - v1)), 0.0f, ((float)(v7 - v1)), ((float)(v2 - v)), paint0);
            canvas0.drawRect(0.0f, ((float)(v6 - v)), ((float)(v3 - v1)), ((float)(v8 - v)), paint0);
        }
    }

    public void setColumnWeights(String s) {
        if(this.x != null && this.x.equals(s)) {
            return;
        }
        this.x = s;
        this.R(true);
        this.invalidate();
    }

    public void setColumns(int v) {
        if(v > 50) {
            return;
        }
        if(this.t == v) {
            return;
        }
        this.t = v;
        this.g0();
        this.W();
        this.R(false);
        this.invalidate();
    }

    public void setHorizontalGaps(float f) {
        if(f < 0.0f) {
            return;
        }
        if(this.y == f) {
            return;
        }
        this.y = f;
        this.R(true);
        this.invalidate();
    }

    public void setOrientation(int v) {
        if(v != 0 && v != 1) {
            return;
        }
        if(this.A == v) {
            return;
        }
        this.A = v;
        this.R(true);
        this.invalidate();
    }

    public void setRowWeights(String s) {
        if(this.w != null && this.w.equals(s)) {
            return;
        }
        this.w = s;
        this.R(true);
        this.invalidate();
    }

    public void setRows(int v) {
        if(v > 50) {
            return;
        }
        if(this.r == v) {
            return;
        }
        this.r = v;
        this.g0();
        this.W();
        this.R(false);
        this.invalidate();
    }

    public void setSkips(String s) {
        if(this.v != null && this.v.equals(s)) {
            return;
        }
        this.v = s;
        this.R(true);
        this.invalidate();
    }

    public void setSpans(CharSequence charSequence0) {
        if(this.u != null && this.u.contentEquals(charSequence0)) {
            return;
        }
        this.u = charSequence0.toString();
        this.R(true);
        this.invalidate();
    }

    public void setVerticalGaps(float f) {
        if(f < 0.0f) {
            return;
        }
        if(this.z == f) {
            return;
        }
        this.z = f;
        this.R(true);
        this.invalidate();
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        this.e = true;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.Grid);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.Grid_grid_rows) {
                    this.r = typedArray0.getInteger(v2, 0);
                }
                else if(v2 == styleable.Grid_grid_columns) {
                    this.t = typedArray0.getInteger(v2, 0);
                }
                else if(v2 == styleable.Grid_grid_spans) {
                    this.u = typedArray0.getString(v2);
                }
                else if(v2 == styleable.Grid_grid_skips) {
                    this.v = typedArray0.getString(v2);
                }
                else if(v2 == styleable.Grid_grid_rowWeights) {
                    this.w = typedArray0.getString(v2);
                }
                else if(v2 == styleable.Grid_grid_columnWeights) {
                    this.x = typedArray0.getString(v2);
                }
                else if(v2 == styleable.Grid_grid_orientation) {
                    this.A = typedArray0.getInt(v2, 0);
                }
                else if(v2 == styleable.Grid_grid_horizontalGaps) {
                    this.y = typedArray0.getDimension(v2, 0.0f);
                }
                else if(v2 == styleable.Grid_grid_verticalGaps) {
                    this.z = typedArray0.getDimension(v2, 0.0f);
                }
                else if(v2 == styleable.Grid_grid_validateInputs) {
                    this.C = typedArray0.getBoolean(v2, false);
                }
                else if(v2 == styleable.Grid_grid_useRtl) {
                    this.D = typedArray0.getBoolean(v2, false);
                }
            }
            this.g0();
            this.W();
            typedArray0.recycle();
        }
    }
}

