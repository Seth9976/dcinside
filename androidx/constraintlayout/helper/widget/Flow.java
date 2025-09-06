package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.VirtualLayout;

public class Flow extends VirtualLayout {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    private androidx.constraintlayout.core.widgets.Flow m;
    private static final String n = "Flow";
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z;

    public Flow(Context context0) {
        super(context0);
    }

    public Flow(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public Flow(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void B(Constraint constraintSet$Constraint0, HelperWidget helperWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        super.B(constraintSet$Constraint0, helperWidget0, constraintLayout$LayoutParams0, sparseArray0);
        if(helperWidget0 instanceof androidx.constraintlayout.core.widgets.Flow) {
            int v = constraintLayout$LayoutParams0.Z;
            if(v != -1) {
                ((androidx.constraintlayout.core.widgets.Flow)helperWidget0).y3(v);
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void D(ConstraintWidget constraintWidget0, boolean z) {
        this.m.n2(z);
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    public void L(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout0, int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        if(virtualLayout0 != null) {
            virtualLayout0.w2(v2, v3, v4, v5);
            this.setMeasuredDimension(virtualLayout0.r2(), virtualLayout0.q2());
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int v, int v1) {
        this.L(this.m, v, v1);
    }

    public void setFirstHorizontalBias(float f) {
        this.m.l3(f);
        this.requestLayout();
    }

    public void setFirstHorizontalStyle(int v) {
        this.m.m3(v);
        this.requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.m.n3(f);
        this.requestLayout();
    }

    public void setFirstVerticalStyle(int v) {
        this.m.o3(v);
        this.requestLayout();
    }

    public void setHorizontalAlign(int v) {
        this.m.p3(v);
        this.requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.m.q3(f);
        this.requestLayout();
    }

    public void setHorizontalGap(int v) {
        this.m.r3(v);
        this.requestLayout();
    }

    public void setHorizontalStyle(int v) {
        this.m.s3(v);
        this.requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.m.t3(f);
        this.requestLayout();
    }

    public void setLastHorizontalStyle(int v) {
        this.m.u3(v);
        this.requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.m.v3(f);
        this.requestLayout();
    }

    public void setLastVerticalStyle(int v) {
        this.m.w3(v);
        this.requestLayout();
    }

    public void setMaxElementsWrap(int v) {
        this.m.x3(v);
        this.requestLayout();
    }

    public void setOrientation(int v) {
        this.m.y3(v);
        this.requestLayout();
    }

    public void setPadding(int v) {
        this.m.C2(v);
        this.requestLayout();
    }

    public void setPaddingBottom(int v) {
        this.m.D2(v);
        this.requestLayout();
    }

    public void setPaddingLeft(int v) {
        this.m.F2(v);
        this.requestLayout();
    }

    public void setPaddingRight(int v) {
        this.m.G2(v);
        this.requestLayout();
    }

    public void setPaddingTop(int v) {
        this.m.I2(v);
        this.requestLayout();
    }

    public void setVerticalAlign(int v) {
        this.m.z3(v);
        this.requestLayout();
    }

    public void setVerticalBias(float f) {
        this.m.A3(f);
        this.requestLayout();
    }

    public void setVerticalGap(int v) {
        this.m.B3(v);
        this.requestLayout();
    }

    public void setVerticalStyle(int v) {
        this.m.C3(v);
        this.requestLayout();
    }

    public void setWrapMode(int v) {
        this.m.D3(v);
        this.requestLayout();
    }

    @Override  // androidx.constraintlayout.widget.VirtualLayout
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        this.m = new androidx.constraintlayout.core.widgets.Flow();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_android_orientation) {
                    this.m.y3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_padding) {
                    this.m.C2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.m.H2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.m.E2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.m.F2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.m.I2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.m.G2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.m.D2(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.m.D3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.m.s3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.m.C3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.m.m3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.m.u3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.m.o3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.m.w3(typedArray0.getInt(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.m.q3(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.m.l3(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.m.t3(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.m.n3(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.m.v3(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.m.A3(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.m.p3(typedArray0.getInt(v2, 2));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.m.z3(typedArray0.getInt(v2, 2));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.m.r3(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.m.B3(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.m.x3(typedArray0.getInt(v2, -1));
                }
            }
            typedArray0.recycle();
        }
        this.d = this.m;
        this.K();
    }
}

