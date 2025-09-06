package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

public final class FlingAnimation extends DynamicAnimation {
    static final class DragForce implements Force {
        private float a;
        private float b;
        private final MassState c;
        private static final float d = -4.2f;
        private static final float e = 62.5f;

        DragForce() {
            this.a = -4.2f;
            this.c = new MassState();
        }

        @Override  // androidx.dynamicanimation.animation.Force
        public float a(float f, float f1) {
            return f1 * this.a;
        }

        @Override  // androidx.dynamicanimation.animation.Force
        public boolean b(float f, float f1) {
            return Math.abs(f1) < this.b;
        }

        float c() {
            return this.a / -4.2f;
        }

        void d(float f) {
            this.a = f * -4.2f;
        }

        void e(float f) {
            this.b = f * 62.5f;
        }

        MassState f(float f, float f1, long v) {
            this.c.b = (float)(((double)f1) * Math.exp(((float)v) / 1000.0f * this.a));
            this.c.a = (float)(((double)(f - f1 / this.a)) + ((double)(f1 / this.a)) * Math.exp(this.a * ((float)v) / 1000.0f));
            if(this.b(this.c.a, this.c.b)) {
                this.c.b = 0.0f;
            }
            return this.c;
        }
    }

    private final DragForce G;

    public FlingAnimation(FloatValueHolder floatValueHolder0) {
        super(floatValueHolder0);
        DragForce flingAnimation$DragForce0 = new DragForce();
        this.G = flingAnimation$DragForce0;
        flingAnimation$DragForce0.e(this.i());
    }

    public FlingAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0) {
        super(object0, floatPropertyCompat0);
        DragForce flingAnimation$DragForce0 = new DragForce();
        this.G = flingAnimation$DragForce0;
        flingAnimation$DragForce0.e(this.i());
    }

    public FlingAnimation A(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.G.d(f);
        return this;
    }

    public FlingAnimation B(float f) {
        super.p(f);
        return this;
    }

    public FlingAnimation C(float f) {
        super.q(f);
        return this;
    }

    public FlingAnimation D(float f) {
        super.u(f);
        return this;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    float f(float f, float f1) {
        return this.G.a(f, f1);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    boolean j(float f, float f1) {
        return f >= this.g || f <= this.h || this.G.b(f, f1);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public DynamicAnimation p(float f) {
        return this.B(f);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public DynamicAnimation q(float f) {
        return this.C(f);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    public DynamicAnimation u(float f) {
        return this.D(f);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    void v(float f) {
        this.G.e(f);
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation
    boolean y(long v) {
        MassState dynamicAnimation$MassState0 = this.G.f(this.b, this.a, v);
        float f = dynamicAnimation$MassState0.a;
        this.b = f;
        float f1 = dynamicAnimation$MassState0.b;
        this.a = f1;
        float f2 = this.h;
        if(f < f2) {
            this.b = f2;
            return true;
        }
        float f3 = this.g;
        if(f > f3) {
            this.b = f3;
            return true;
        }
        return this.j(f, f1);
    }

    public float z() {
        return this.G.c();
    }
}

