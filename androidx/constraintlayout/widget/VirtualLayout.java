package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

public abstract class VirtualLayout extends ConstraintHelper {
    private boolean k;
    private boolean l;

    public VirtualLayout(Context context0) {
        super(context0);
    }

    public VirtualLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public VirtualLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public void L(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout0, int v, int v1) {
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.k || this.l) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 instanceof ConstraintLayout) {
                int v = this.getVisibility();
                float f = this.getElevation();
                for(int v1 = 0; v1 < this.b; ++v1) {
                    View view0 = ((ConstraintLayout)viewParent0).getViewById(this.a[v1]);
                    if(view0 != null) {
                        if(this.k) {
                            view0.setVisibility(v);
                        }
                        if(this.l && f > 0.0f) {
                            view0.setTranslationZ(view0.getTranslationZ() + f);
                        }
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
    public void setVisibility(int v) {
        super.setVisibility(v);
        this.q();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_android_visibility) {
                    this.k = true;
                }
                else if(v2 == styleable.ConstraintLayout_Layout_android_elevation) {
                    this.l = true;
                }
            }
            typedArray0.recycle();
        }
    }
}

