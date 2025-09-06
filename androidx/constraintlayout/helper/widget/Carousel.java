package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene.Transition;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import java.util.ArrayList;

public class Carousel extends MotionHelper {
    public interface Adapter {
        void a(int arg1);

        void b(View arg1, int arg2);

        int count();
    }

    private int A;
    private int B;
    private int C;
    private float D;
    private int E;
    private int F;
    int G;
    Runnable H;
    private static final boolean I = false;
    private static final String J = "Carousel";
    public static final int K = 1;
    public static final int L = 2;
    private Adapter o;
    private final ArrayList p;
    private int q;
    private int r;
    private MotionLayout s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;

    public Carousel(Context context0) {
        super(context0);
        this.o = null;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = -1;
        this.u = false;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new Runnable() {
            final Carousel a;

            @Override
            public void run() {
                Carousel.this.s.setProgress(0.0f);
                Carousel.this.d0();
                Carousel.this.o.a(Carousel.this.r);
                float f = Carousel.this.s.getVelocity();
                if(Carousel.this.C == 2 && f > Carousel.this.D && Carousel.this.r < Carousel.this.o.count() - 1) {
                    float f1 = Carousel.this.z;
                    if(Carousel.this.r == 0 && Carousel.this.q > Carousel.this.r) {
                        return;
                    }
                    if(Carousel.this.r == Carousel.this.o.count() - 1 && Carousel.this.q < Carousel.this.r) {
                        return;
                    }
                    androidx.constraintlayout.helper.widget.Carousel.1.1 carousel$1$10 = new Runnable() {
                        final androidx.constraintlayout.helper.widget.Carousel.1 b;

                        @Override
                        public void run() {
                            Carousel.this.s.U0(5, 1.0f, f * f1);
                        }
                    };
                    Carousel.this.s.post(carousel$1$10);
                }
            }
        };
    }

    public Carousel(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.o = null;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = -1;
        this.u = false;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new Runnable() {
            final Carousel a;

            @Override
            public void run() {
                Carousel.this.s.setProgress(0.0f);
                Carousel.this.d0();
                Carousel.this.o.a(Carousel.this.r);
                float f = Carousel.this.s.getVelocity();
                if(Carousel.this.C == 2 && f > Carousel.this.D && Carousel.this.r < Carousel.this.o.count() - 1) {
                    float f1 = Carousel.this.z;
                    if(Carousel.this.r == 0 && Carousel.this.q > Carousel.this.r) {
                        return;
                    }
                    if(Carousel.this.r == Carousel.this.o.count() - 1 && Carousel.this.q < Carousel.this.r) {
                        return;
                    }
                    androidx.constraintlayout.helper.widget.Carousel.1.1 carousel$1$10 = new Runnable() {
                        final androidx.constraintlayout.helper.widget.Carousel.1 b;

                        @Override
                        public void run() {
                            Carousel.this.s.U0(5, 1.0f, f * f1);
                        }
                    };
                    Carousel.this.s.post(carousel$1$10);
                }
            }
        };
        this.X(context0, attributeSet0);
    }

    public Carousel(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.o = null;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = -1;
        this.u = false;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new Runnable() {
            final Carousel a;

            @Override
            public void run() {
                Carousel.this.s.setProgress(0.0f);
                Carousel.this.d0();
                Carousel.this.o.a(Carousel.this.r);
                float f = Carousel.this.s.getVelocity();
                if(Carousel.this.C == 2 && f > Carousel.this.D && Carousel.this.r < Carousel.this.o.count() - 1) {
                    float f1 = Carousel.this.z;
                    if(Carousel.this.r == 0 && Carousel.this.q > Carousel.this.r) {
                        return;
                    }
                    if(Carousel.this.r == Carousel.this.o.count() - 1 && Carousel.this.q < Carousel.this.r) {
                        return;
                    }
                    androidx.constraintlayout.helper.widget.Carousel.1.1 carousel$1$10 = new Runnable() {
                        final androidx.constraintlayout.helper.widget.Carousel.1 b;

                        @Override
                        public void run() {
                            Carousel.this.s.U0(5, 1.0f, f * f1);
                        }
                    };
                    Carousel.this.s.post(carousel$1$10);
                }
            }
        };
        this.X(context0, attributeSet0);
    }

    private void V(boolean z) {
        for(Object object0: this.s.getDefinedTransitions()) {
            ((Transition)object0).P(z);
        }
    }

    private boolean W(int v, boolean z) {
        if(v == -1) {
            return false;
        }
        MotionLayout motionLayout0 = this.s;
        if(motionLayout0 == null) {
            return false;
        }
        Transition motionScene$Transition0 = motionLayout0.y0(v);
        if(motionScene$Transition0 == null) {
            return false;
        }
        if(z == motionScene$Transition0.K()) {
            return false;
        }
        motionScene$Transition0.P(z);
        return true;
    }

    private void X(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Carousel);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.Carousel_carousel_firstView) {
                    this.t = typedArray0.getResourceId(v2, this.t);
                }
                else if(v2 == styleable.Carousel_carousel_backwardTransition) {
                    this.v = typedArray0.getResourceId(v2, this.v);
                }
                else if(v2 == styleable.Carousel_carousel_forwardTransition) {
                    this.w = typedArray0.getResourceId(v2, this.w);
                }
                else if(v2 == styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.B = typedArray0.getInt(v2, this.B);
                }
                else if(v2 == styleable.Carousel_carousel_previousState) {
                    this.x = typedArray0.getResourceId(v2, this.x);
                }
                else if(v2 == styleable.Carousel_carousel_nextState) {
                    this.y = typedArray0.getResourceId(v2, this.y);
                }
                else if(v2 == styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.z = typedArray0.getFloat(v2, this.z);
                }
                else if(v2 == styleable.Carousel_carousel_touchUpMode) {
                    this.C = typedArray0.getInt(v2, this.C);
                }
                else if(v2 == styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.D = typedArray0.getFloat(v2, this.D);
                }
                else if(v2 == styleable.Carousel_carousel_infinite) {
                    this.u = typedArray0.getBoolean(v2, this.u);
                }
            }
            typedArray0.recycle();
        }
    }

    public boolean Y() {
        return this.u;
    }

    public void Z(int v) {
        this.r = Math.max(0, Math.min(this.getCount() - 1, v));
        this.b0();
    }

    // 检测为 Lambda 实现
    private void a0() [...]

    public void b0() {
        int v = this.p.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)this.p.get(v1);
            if(this.o.count() == 0) {
                this.f0(view0, this.B);
            }
            else {
                this.f0(view0, 0);
            }
        }
        this.s.M0();
        this.d0();
    }

    public void c0(int v, int v1) {
        this.E = Math.max(0, Math.min(this.getCount() - 1, v));
        int v2 = Math.max(0, v1);
        this.F = v2;
        this.s.setTransitionDuration(v2);
        if(v < this.r) {
            this.s.b1(this.x, this.F);
            return;
        }
        this.s.b1(this.y, this.F);
    }

    private void d0() {
        Adapter carousel$Adapter0 = this.o;
        if(carousel$Adapter0 == null) {
            return;
        }
        if(this.s == null) {
            return;
        }
        if(carousel$Adapter0.count() == 0) {
            return;
        }
        int v = this.p.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)this.p.get(v1);
            int v2 = this.r + v1 - this.A;
            if(this.u) {
                if(v2 < 0) {
                    int v3 = this.B;
                    if(v3 == 4) {
                        this.f0(view0, 0);
                    }
                    else {
                        this.f0(view0, v3);
                    }
                    if(v2 % this.o.count() == 0) {
                        this.o.b(view0, 0);
                    }
                    else {
                        this.o.b(view0, this.o.count() + v2 % this.o.count());
                    }
                }
                else {
                    if(v2 >= this.o.count()) {
                        if(v2 == this.o.count()) {
                            v2 = 0;
                        }
                        else if(v2 > this.o.count()) {
                            v2 %= this.o.count();
                        }
                        int v4 = this.B;
                        if(v4 == 4) {
                            this.f0(view0, 0);
                        }
                        else {
                            this.f0(view0, v4);
                        }
                    }
                    else {
                        this.f0(view0, 0);
                    }
                    this.o.b(view0, v2);
                }
            }
            else if(v2 < 0) {
                this.f0(view0, this.B);
            }
            else if(v2 >= this.o.count()) {
                this.f0(view0, this.B);
            }
            else {
                this.f0(view0, 0);
                this.o.b(view0, v2);
            }
        }
        int v5 = this.E;
        if(v5 != -1 && v5 != this.r) {
            this.s.post(() -> {
                this.s.setTransitionDuration(this.F);
                if(this.E < this.r) {
                    this.s.b1(this.x, this.F);
                    return;
                }
                this.s.b1(this.y, this.F);
            });
        }
        else if(v5 == this.r) {
            this.E = -1;
        }
        if(this.v != -1 && this.w != -1) {
            if(this.u) {
                return;
            }
            int v6 = this.o.count();
            if(this.r == 0) {
                this.W(this.v, false);
            }
            else {
                this.W(this.v, true);
                this.s.setTransition(this.v);
            }
            if(this.r == v6 - 1) {
                this.W(this.w, false);
                return;
            }
            this.W(this.w, true);
            this.s.setTransition(this.w);
            return;
        }
        Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
    }

    private boolean e0(int v, View view0, int v1) {
        ConstraintSet constraintSet0 = this.s.u0(v);
        if(constraintSet0 == null) {
            return false;
        }
        Constraint constraintSet$Constraint0 = constraintSet0.k0(view0.getId());
        if(constraintSet$Constraint0 == null) {
            return false;
        }
        constraintSet$Constraint0.c.c = 1;
        view0.setVisibility(v1);
        return true;
    }

    private boolean f0(View view0, int v) {
        MotionLayout motionLayout0 = this.s;
        if(motionLayout0 == null) {
            return false;
        }
        int[] arr_v = motionLayout0.getConstraintSetIds();
        boolean z = false;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            z |= this.e0(arr_v[v1], view0, v);
        }
        return z;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public void g(MotionLayout motionLayout0, int v, int v1, float f) {
        this.G = v;
    }

    public int getCount() {
        return this.o == null ? 0 : this.o.count();
    }

    public int getCurrentIndex() {
        return this.r;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public void i(MotionLayout motionLayout0, int v) {
        int v1 = this.r;
        this.q = v1;
        if(v == this.y) {
            this.r = v1 + 1;
        }
        else if(v == this.x) {
            this.r = v1 - 1;
        }
        if(this.u) {
            if(this.r >= this.o.count()) {
                this.r = 0;
            }
            if(this.r < 0) {
                this.r = this.o.count() - 1;
            }
        }
        else {
            if(this.r >= this.o.count()) {
                this.r = this.o.count() - 1;
            }
            if(this.r < 0) {
                this.r = 0;
            }
        }
        if(this.q != this.r) {
            this.s.post(this.H);
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.getParent() instanceof MotionLayout) {
            MotionLayout motionLayout0 = (MotionLayout)this.getParent();
            this.p.clear();
            for(int v = 0; v < this.b; ++v) {
                int v1 = this.a[v];
                View view0 = motionLayout0.getViewById(v1);
                if(this.t == v1) {
                    this.A = v;
                }
                this.p.add(view0);
            }
            this.s = motionLayout0;
            if(this.C == 2) {
                Transition motionScene$Transition0 = motionLayout0.y0(this.w);
                if(motionScene$Transition0 != null) {
                    motionScene$Transition0.T(5);
                }
                Transition motionScene$Transition1 = this.s.y0(this.v);
                if(motionScene$Transition1 != null) {
                    motionScene$Transition1.T(5);
                }
            }
            this.d0();
        }
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.clear();
    }

    public void setAdapter(Adapter carousel$Adapter0) {
        this.o = carousel$Adapter0;
    }

    public void setInfinite(boolean z) {
        this.u = z;
    }
}

