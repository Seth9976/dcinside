package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class Barrier extends ConstraintHelper {
    private int k;
    private int l;
    private androidx.constraintlayout.core.widgets.Barrier m;
    public static final int n = 0;
    public static final int o = 2;
    public static final int p = 1;
    public static final int q = 3;
    public static final int r = 5;
    public static final int s = 6;

    public Barrier(Context context0) {
        super(context0);
        super.setVisibility(8);
    }

    public Barrier(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        super.setVisibility(8);
    }

    public Barrier(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        super.setVisibility(8);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void B(Constraint constraintSet$Constraint0, HelperWidget helperWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        super.B(constraintSet$Constraint0, helperWidget0, constraintLayout$LayoutParams0, sparseArray0);
        if(helperWidget0 instanceof androidx.constraintlayout.core.widgets.Barrier) {
            this.M(((androidx.constraintlayout.core.widgets.Barrier)helperWidget0), constraintSet$Constraint0.e.h0, ((ConstraintWidgetContainer)helperWidget0.U()).P2());
            ((androidx.constraintlayout.core.widgets.Barrier)helperWidget0).u2(constraintSet$Constraint0.e.p0);
            ((androidx.constraintlayout.core.widgets.Barrier)helperWidget0).w2(constraintSet$Constraint0.e.i0);
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void D(ConstraintWidget constraintWidget0, boolean z) {
        this.M(constraintWidget0, this.k, z);
    }

    @Deprecated
    public boolean L() {
        return this.m.p2();
    }

    private void M(ConstraintWidget constraintWidget0, int v, boolean z) {
        this.l = v;
        if(z) {
            int v1 = this.k;
            if(v1 == 5) {
                this.l = 1;
            }
            else if(v1 == 6) {
                this.l = 0;
            }
        }
        else {
            int v2 = this.k;
            if(v2 == 5) {
                this.l = 0;
            }
            else if(v2 == 6) {
                this.l = 1;
            }
        }
        if(constraintWidget0 instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier)constraintWidget0).v2(this.l);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.m.p2();
    }

    public int getMargin() {
        return this.m.r2();
    }

    public int getType() {
        return this.k;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.m.u2(z);
    }

    public void setDpMargin(int v) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.m.w2(((int)(((float)v) * displayMetrics0.density + 0.5f)));
    }

    public void setMargin(int v) {
        this.m.w2(v);
    }

    public void setType(int v) {
        this.k = v;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        this.m = new androidx.constraintlayout.core.widgets.Barrier();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_barrierDirection) {
                    this.setType(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.m.u2(typedArray0.getBoolean(v2, true));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_barrierMargin) {
                    int v3 = typedArray0.getDimensionPixelSize(v2, 0);
                    this.m.w2(v3);
                }
            }
            typedArray0.recycle();
        }
        this.d = this.m;
        this.K();
    }
}

