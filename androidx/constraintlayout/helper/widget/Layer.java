package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;

public class Layer extends ConstraintHelper {
    private boolean A;
    private boolean B;
    private static final String C = "Layer";
    private float k;
    private float l;
    private float m;
    ConstraintLayout n;
    private float o;
    private float p;
    protected float q;
    protected float r;
    protected float s;
    protected float t;
    protected float u;
    protected float v;
    boolean w;
    View[] x;
    private float y;
    private float z;

    public Layer(Context context0) {
        super(context0);
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.t = NaNf;
        this.u = NaNf;
        this.v = NaNf;
        this.w = true;
        this.x = null;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public Layer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.t = NaNf;
        this.u = NaNf;
        this.v = NaNf;
        this.w = true;
        this.x = null;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public Layer(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.t = NaNf;
        this.u = NaNf;
        this.v = NaNf;
        this.w = true;
        this.x = null;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void F(ConstraintLayout constraintLayout0) {
        this.M();
        this.q = NaNf;
        this.r = NaNf;
        ConstraintWidget constraintWidget0 = ((LayoutParams)this.getLayoutParams()).b();
        constraintWidget0.d2(0);
        constraintWidget0.z1(0);
        this.L();
        this.layout(((int)this.u) - this.getPaddingLeft(), ((int)this.v) - this.getPaddingTop(), ((int)this.s) + this.getPaddingRight(), ((int)this.t) + this.getPaddingBottom());
        this.N();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void H(ConstraintLayout constraintLayout0) {
        this.n = constraintLayout0;
        float f = this.getRotation();
        if(f != 0.0f) {
            this.m = f;
        }
        else if(!Float.isNaN(this.m)) {
            this.m = 0.0f;
        }
    }

    protected void L() {
        if(this.n == null) {
            return;
        }
        if(!this.w && !Float.isNaN(this.q) && !Float.isNaN(this.r)) {
            return;
        }
        if(!Float.isNaN(this.k) && !Float.isNaN(this.l)) {
            this.r = this.l;
            this.q = this.k;
            return;
        }
        View[] arr_view = this.x(this.n);
        int v1 = arr_view[0].getLeft();
        int v2 = arr_view[0].getTop();
        int v3 = arr_view[0].getRight();
        int v4 = arr_view[0].getBottom();
        for(int v = 0; v < this.b; ++v) {
            View view0 = arr_view[v];
            v1 = Math.min(v1, view0.getLeft());
            v2 = Math.min(v2, view0.getTop());
            v3 = Math.max(v3, view0.getRight());
            v4 = Math.max(v4, view0.getBottom());
        }
        this.s = (float)v3;
        this.t = (float)v4;
        this.u = (float)v1;
        this.v = (float)v2;
        this.q = Float.isNaN(this.k) ? ((float)((v1 + v3) / 2)) : this.k;
        if(Float.isNaN(this.l)) {
            this.r = (float)((v2 + v4) / 2);
            return;
        }
        this.r = this.l;
    }

    private void M() {
        if(this.n == null) {
            return;
        }
        int v = this.b;
        if(v == 0) {
            return;
        }
        if(this.x == null || this.x.length != v) {
            this.x = new View[v];
        }
        for(int v1 = 0; v1 < this.b; ++v1) {
            View[] arr_view = this.x;
            arr_view[v1] = this.n.getViewById(this.a[v1]);
        }
    }

    private void N() {
        if(this.n == null) {
            return;
        }
        if(this.x == null) {
            this.M();
        }
        this.L();
        double f = Float.isNaN(this.m) ? 0.0 : Math.toRadians(this.m);
        float f1 = (float)Math.sin(f);
        float f2 = (float)Math.cos(f);
        float f3 = this.o * f2;
        float f4 = -this.p * f1;
        float f5 = this.o * f1;
        float f6 = this.p * f2;
        for(int v = 0; v < this.b; ++v) {
            View view0 = this.x[v];
            int v1 = view0.getLeft();
            int v2 = view0.getRight();
            int v3 = view0.getTop();
            int v4 = view0.getBottom();
            float f7 = ((float)((v1 + v2) / 2)) - this.q;
            float f8 = ((float)((v3 + v4) / 2)) - this.r;
            float f9 = f7 * f5 + f6 * f8 - f8 + this.z;
            view0.setTranslationX(f3 * f7 + f4 * f8 - f7 + this.y);
            view0.setTranslationY(f9);
            view0.setScaleY(this.p);
            view0.setScaleX(this.o);
            if(!Float.isNaN(this.m)) {
                view0.setRotation(this.m);
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = (ConstraintLayout)this.getParent();
        if(this.A || this.B) {
            int v = this.getVisibility();
            float f = this.getElevation();
            for(int v1 = 0; v1 < this.b; ++v1) {
                View view0 = this.n.getViewById(this.a[v1]);
                if(view0 != null) {
                    if(this.A) {
                        view0.setVisibility(v);
                    }
                    if(this.B && f > 0.0f) {
                        view0.setTranslationZ(view0.getTranslationZ() + f);
                    }
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void s(ConstraintLayout constraintLayout0) {
        this.r(constraintLayout0);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        this.q();
    }

    @Override  // android.view.View
    public void setPivotX(float f) {
        this.k = f;
        this.N();
    }

    @Override  // android.view.View
    public void setPivotY(float f) {
        this.l = f;
        this.N();
    }

    @Override  // android.view.View
    public void setRotation(float f) {
        this.m = f;
        this.N();
    }

    @Override  // android.view.View
    public void setScaleX(float f) {
        this.o = f;
        this.N();
    }

    @Override  // android.view.View
    public void setScaleY(float f) {
        this.p = f;
        this.N();
    }

    @Override  // android.view.View
    public void setTranslationX(float f) {
        this.y = f;
        this.N();
    }

    @Override  // android.view.View
    public void setTranslationY(float f) {
        this.z = f;
        this.N();
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        this.q();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        this.e = false;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v1 = typedArray0.getIndexCount();
            for(int v = 0; v < v1; ++v) {
                int v2 = typedArray0.getIndex(v);
                if(v2 == styleable.ConstraintLayout_Layout_android_visibility) {
                    this.A = true;
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_elevation) {
                    this.B = true;
                }
            }
            typedArray0.recycle();
        }
    }
}

