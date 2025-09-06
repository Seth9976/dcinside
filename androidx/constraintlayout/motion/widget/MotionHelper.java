package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {
    private boolean k;
    private boolean l;
    private float m;
    protected View[] n;

    public MotionHelper(Context context0) {
        super(context0);
        this.k = false;
        this.l = false;
    }

    public MotionHelper(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.k = false;
        this.l = false;
        this.z(attributeSet0);
    }

    public MotionHelper(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k = false;
        this.l = false;
        this.z(attributeSet0);
    }

    public void L(View view0, float f) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void a(MotionLayout motionLayout0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void b(MotionLayout motionLayout0, HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void c(Canvas canvas0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean d() {
        return this.k;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean e() {
        return this.l;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean f() {
        return false;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener
    public void g(MotionLayout motionLayout0, int v, int v1, float f) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.m;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void h(Canvas canvas0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener
    public void i(MotionLayout motionLayout0, int v) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener
    public void j(MotionLayout motionLayout0, int v, int v1) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener
    public void k(MotionLayout motionLayout0, int v, boolean z, float f) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float f) {
        this.m = f;
        int v = 0;
        if(this.b > 0) {
            this.n = this.x(((ConstraintLayout)this.getParent()));
            while(v < this.b) {
                ++v;
            }
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.getParent();
        int v1 = viewGroup0.getChildCount();
        while(v < v1) {
            boolean z = viewGroup0.getChildAt(v) instanceof MotionHelper;
            ++v;
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void z(AttributeSet attributeSet0) {
        super.z(attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.MotionHelper);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionHelper_onShow) {
                    this.k = typedArray0.getBoolean(v2, this.k);
                }
                else if(v2 == styleable.MotionHelper_onHide) {
                    this.l = typedArray0.getBoolean(v2, this.l);
                }
            }
            typedArray0.recycle();
        }
    }
}

