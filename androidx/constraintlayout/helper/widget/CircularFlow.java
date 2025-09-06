package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {
    ConstraintLayout m;
    int n;
    private float[] o;
    private int[] p;
    private int q;
    private int r;
    private String s;
    private String t;
    private Float u;
    private Integer v;
    private static final String w = "CircularFlow";
    private static int x;
    private static float y;

    static {
    }

    public CircularFlow(Context context0) {
        super(context0);
    }

    public CircularFlow(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public CircularFlow(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public int C(View view0) {
        int v = super.C(view0);
        if(v == -1) {
            return -1;
        }
        ConstraintSet constraintSet0 = new ConstraintSet();
        constraintSet0.H(this.m);
        constraintSet0.F(view0.getId(), 8);
        constraintSet0.r(this.m);
        float[] arr_f = this.o;
        if(v < arr_f.length) {
            this.o = this.R(arr_f, v);
            --this.r;
        }
        int[] arr_v = this.p;
        if(v < arr_v.length) {
            this.p = this.U(arr_v, v);
            --this.q;
        }
        this.P();
        return v;
    }

    private void M(String s) {
        if(s == null || s.length() == 0 || this.c == null) {
            return;
        }
        float[] arr_f = this.o;
        if(arr_f == null) {
            return;
        }
        if(this.r + 1 > arr_f.length) {
            this.o = Arrays.copyOf(arr_f, arr_f.length + 1);
        }
        float[] arr_f1 = this.o;
        int v = this.r;
        arr_f1[v] = (float)Integer.parseInt(s);
        ++this.r;
    }

    private void N(String s) {
        if(s == null || s.length() == 0 || this.c == null) {
            return;
        }
        int[] arr_v = this.p;
        if(arr_v == null) {
            return;
        }
        if(this.q + 1 > arr_v.length) {
            this.p = Arrays.copyOf(arr_v, arr_v.length + 1);
        }
        int[] arr_v1 = this.p;
        int v = this.q;
        arr_v1[v] = (int)(((float)Integer.parseInt(s)) * this.c.getResources().getDisplayMetrics().density);
        ++this.q;
    }

    public void O(View view0, int v, float f) {
        if(this.t(view0.getId())) {
            return;
        }
        this.o(view0);
        ++this.r;
        float[] arr_f = this.getAngles();
        this.o = arr_f;
        arr_f[this.r - 1] = f;
        ++this.q;
        int[] arr_v = this.getRadius();
        this.p = arr_v;
        int v1 = this.q - 1;
        arr_v[v1] = (int)(((float)v) * this.c.getResources().getDisplayMetrics().density);
        this.P();
    }

    private void P() {
        this.m = (ConstraintLayout)this.getParent();
        for(int v = 0; v < this.b; ++v) {
            View view0 = this.m.getViewById(this.a[v]);
            if(view0 != null) {
                int v1 = CircularFlow.x;
                float f = CircularFlow.y;
                int[] arr_v = this.p;
                if(arr_v != null && v < arr_v.length) {
                    v1 = arr_v[v];
                }
                else if(this.v == null || ((int)this.v) == -1) {
                    Log.e("CircularFlow", "Added radius to view with id: " + ((String)this.i.get(view0.getId())));
                }
                else {
                    ++this.q;
                    if(this.p == null) {
                        this.p = new int[1];
                    }
                    int[] arr_v1 = this.getRadius();
                    this.p = arr_v1;
                    arr_v1[this.q - 1] = v1;
                }
                float[] arr_f = this.o;
                if(arr_f != null && v < arr_f.length) {
                    f = arr_f[v];
                }
                else if(this.u == null || ((float)this.u) == -1.0f) {
                    Log.e("CircularFlow", "Added angle to view with id: " + ((String)this.i.get(view0.getId())));
                }
                else {
                    ++this.r;
                    if(this.o == null) {
                        this.o = new float[1];
                    }
                    float[] arr_f1 = this.getAngles();
                    this.o = arr_f1;
                    arr_f1[this.r - 1] = f;
                }
                LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                constraintLayout$LayoutParams0.r = f;
                constraintLayout$LayoutParams0.p = this.n;
                constraintLayout$LayoutParams0.q = v1;
                view0.setLayoutParams(constraintLayout$LayoutParams0);
            }
        }
        this.q();
    }

    public boolean Q(View view0) {
        return this.t(view0.getId()) ? this.y(view0.getId()) != -1 : false;
    }

    private float[] R(float[] arr_f, int v) {
        return arr_f == null || v < 0 || v >= this.r ? arr_f : CircularFlow.S(arr_f, v);
    }

    private static float[] S(float[] arr_f, int v) {
        float[] arr_f1 = new float[arr_f.length - 1];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            if(v1 != v) {
                arr_f1[v2] = arr_f[v1];
                ++v2;
            }
        }
        return arr_f1;
    }

    private static int[] T(int[] arr_v, int v) {
        int[] arr_v1 = new int[arr_v.length - 1];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v1 != v) {
                arr_v1[v2] = arr_v[v1];
                ++v2;
            }
        }
        return arr_v1;
    }

    private int[] U(int[] arr_v, int v) {
        return arr_v == null || v < 0 || v >= this.q ? arr_v : CircularFlow.T(arr_v, v);
    }

    public void V(View view0, float f) {
        if(!this.Q(view0)) {
            Log.e("CircularFlow", "It was not possible to update angle to view with id: " + view0.getId());
            return;
        }
        int v = this.y(view0.getId());
        if(v > this.o.length) {
            return;
        }
        float[] arr_f = this.getAngles();
        this.o = arr_f;
        arr_f[v] = f;
        this.P();
    }

    public void W(View view0, int v) {
        if(!this.Q(view0)) {
            Log.e("CircularFlow", "It was not possible to update radius to view with id: " + view0.getId());
            return;
        }
        int v1 = this.y(view0.getId());
        if(v1 > this.p.length) {
            return;
        }
        int[] arr_v = this.getRadius();
        this.p = arr_v;
        arr_v[v1] = (int)(((float)v) * this.c.getResources().getDisplayMetrics().density);
        this.P();
    }

    public void X(View view0, int v, float f) {
        if(!this.Q(view0)) {
            Log.e("CircularFlow", "It was not possible to update radius and angle to view with id: " + view0.getId());
            return;
        }
        int v1 = this.y(view0.getId());
        if(this.getAngles().length > v1) {
            float[] arr_f = this.getAngles();
            this.o = arr_f;
            arr_f[v1] = f;
        }
        if(this.getRadius().length > v1) {
            int[] arr_v = this.getRadius();
            this.p = arr_v;
            arr_v[v1] = (int)(((float)v) * this.c.getResources().getDisplayMetrics().density);
        }
        this.P();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.o, this.r);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.p, this.q);
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.s;
        if(s != null) {
            this.o = new float[1];
            this.setAngles(s);
        }
        String s1 = this.t;
        if(s1 != null) {
            this.p = new int[1];
            this.setRadius(s1);
        }
        Float float0 = this.u;
        if(float0 != null) {
            this.setDefaultAngle(((float)float0));
        }
        Integer integer0 = this.v;
        if(integer0 != null) {
            this.setDefaultRadius(((int)integer0));
        }
        this.P();
    }

    private void setAngles(String s) {
        if(s == null) {
            return;
        }
        int v = 0;
        this.r = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.M(s.substring(v, v1).trim());
            v = v1 + 1;
        }
        this.M(s.substring(v).trim());
    }

    public void setDefaultAngle(float f) {
        CircularFlow.y = f;
    }

    public void setDefaultRadius(int v) {
        CircularFlow.x = v;
    }

    private void setRadius(String s) {
        if(s == null) {
            return;
        }
        int v = 0;
        this.q = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.N(s.substring(v, v1).trim());
            v = v1 + 1;
        }
        this.N(s.substring(v).trim());
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.n = typedArray0.getResourceId(v2, 0);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String s = typedArray0.getString(v2);
                    this.s = s;
                    this.setAngles(s);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String s1 = typedArray0.getString(v2);
                    this.t = s1;
                    this.setRadius(s1);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float float0 = typedArray0.getFloat(v2, CircularFlow.y);
                    this.u = float0;
                    this.setDefaultAngle(((float)float0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer integer0 = typedArray0.getDimensionPixelSize(v2, CircularFlow.x);
                    this.v = integer0;
                    this.setDefaultRadius(((int)integer0));
                }
            }
            typedArray0.recycle();
        }
    }
}

