package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

public final class SpringAnimation extends DynamicAnimation {
    private SpringForce G;
    private float H;
    private boolean I;
    private static final float J = 3.402823E+38f;

    public SpringAnimation(FloatValueHolder floatValueHolder0) {
        super(floatValueHolder0);
        this.G = null;
        this.H = 3.402823E+38f;
        this.I = false;
    }

    public SpringAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0) {
        super(object0, floatPropertyCompat0);
        this.G = null;
        this.H = 3.402823E+38f;
        this.I = false;
    }

    public SpringAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0, float f) {
        super(object0, floatPropertyCompat0);
        this.H = 3.402823E+38f;
        this.I = false;
        this.G = new SpringForce(f);
    }

    public boolean A() {
        return this.G.b > 0.0;
    }

    public SpringForce B() {
        return this.G;
    }

    private void C() {
        SpringForce springForce0 = this.G;
        if(springForce0 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double f = (double)springForce0.d();
        if(f > ((double)this.g)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if(f < ((double)this.h)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public SpringAnimation D(SpringForce springForce0) {
        this.G = springForce0;
        return this;
    }

    public void E() {
        if(!this.A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if(this.f) {
            this.I = true;
        }
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    float f(float f, float f1) {
        return this.G.a(f, f1);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    boolean j(float f, float f1) {
        return this.G.b(f, f1);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    void v(float f) {
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public void w() {
        this.C();
        this.G.j(((double)this.i()));
        super.w();
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    boolean y(long v) {
        if(this.I) {
            float f = this.H;
            if(f != 3.402823E+38f) {
                this.G.h(f);
                this.H = 3.402823E+38f;
            }
            this.b = this.G.d();
            this.a = 0.0f;
            this.I = false;
            return true;
        }
        if(this.H == 3.402823E+38f) {
            MassState dynamicAnimation$MassState2 = this.G.k(((double)this.b), ((double)this.a), v);
            this.b = dynamicAnimation$MassState2.a;
            this.a = dynamicAnimation$MassState2.b;
        }
        else {
            MassState dynamicAnimation$MassState0 = this.G.k(((double)this.b), ((double)this.a), v / 2L);
            this.G.h(this.H);
            this.H = 3.402823E+38f;
            MassState dynamicAnimation$MassState1 = this.G.k(((double)dynamicAnimation$MassState0.a), ((double)dynamicAnimation$MassState0.b), v / 2L);
            this.b = dynamicAnimation$MassState1.a;
            this.a = dynamicAnimation$MassState1.b;
        }
        float f1 = Math.min(Math.max(this.b, this.h), this.g);
        this.b = f1;
        if(this.j(f1, this.a)) {
            this.b = this.G.d();
            this.a = 0.0f;
            return true;
        }
        return false;
    }

    public void z(float f) {
        if(this.k()) {
            this.H = f;
            return;
        }
        if(this.G == null) {
            this.G = new SpringForce(f);
        }
        this.G.h(f);
        this.w();
    }
}

