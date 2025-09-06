package androidx.compose.animation.core;

public final class SpringSimulation {
    private float a;
    private double b;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private float g;

    public SpringSimulation(float f) {
        this.a = f;
        this.b = 7.071068;
        this.g = 1.0f;
    }

    public final float a(float f, float f1) {
        return (float)(-(this.b * this.b) * ((double)(f - this.a)) - this.b * 2.0 * ((double)this.g) * ((double)f1));
    }

    public final float b() {
        return this.g;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return (float)(this.b * this.b);
    }

    private final void e() {
        if(this.c) {
            return;
        }
        if(this.a == 3.402823E+38f) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.g;
        double f1 = ((double)f) * ((double)f);
        if(f > 1.0f) {
            this.d = ((double)(-f)) * this.b + this.b * Math.sqrt(f1 - 1.0);
            this.e = ((double)(-this.g)) * this.b - this.b * Math.sqrt(f1 - 1.0);
        }
        else if(f >= 0.0f && f < 1.0f) {
            this.f = this.b * Math.sqrt(1.0 - f1);
        }
        this.c = true;
    }

    public final void f(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.g = f;
        this.c = false;
    }

    public final void g(float f) {
        this.a = f;
    }

    public final void h(float f) {
        if(this.d() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.b = Math.sqrt(f);
        this.c = false;
    }

    public final long i(float f, float f1, long v) {
        this.e();
        float f2 = f - this.a;
        float f3 = this.g;
        if(f3 > 1.0f) {
            double f4 = this.e;
            double f5 = this.d;
            double f6 = ((double)f2) - (f4 * ((double)f2) - ((double)f1)) / (f4 - f5);
            double f7 = (((double)f2) * f4 - ((double)f1)) / (f4 - f5);
            return SpringSimulationKt.a(((float)(Math.exp(f4 * (((double)v) / 1000.0)) * f6 + Math.exp(this.d * (((double)v) / 1000.0)) * f7 + ((double)this.a))), ((float)(f6 * this.e * Math.exp(this.e * (((double)v) / 1000.0)) + f7 * this.d * Math.exp(this.d * (((double)v) / 1000.0)))));
        }
        if(f3 == 1.0f) {
            double f8 = ((double)f1) + this.b * ((double)f2);
            double f9 = ((double)f2) + f8 * (((double)v) / 1000.0);
            return SpringSimulationKt.a(((float)(Math.exp(-this.b * (((double)v) / 1000.0)) * f9 + ((double)this.a))), ((float)(f9 * Math.exp(-this.b * (((double)v) / 1000.0)) * -this.b + f8 * Math.exp(-this.b * (((double)v) / 1000.0)))));
        }
        double f10 = this.b;
        double f11 = 1.0 / this.f * (((double)f3) * f10 * ((double)f2) + ((double)f1));
        double f12 = Math.exp(((double)(-f3)) * f10 * (((double)v) / 1000.0)) * (Math.cos(this.f * (((double)v) / 1000.0)) * ((double)f2) + Math.sin(this.f * (((double)v) / 1000.0)) * f11);
        return SpringSimulationKt.a(((float)(f12 + ((double)this.a))), ((float)(-this.b * f12 * ((double)this.g) + Math.exp(((double)(-this.g)) * this.b * (((double)v) / 1000.0)) * (-this.f * ((double)f2) * Math.sin(this.f * (((double)v) / 1000.0)) + f11 * this.f * Math.cos(this.f * (((double)v) / 1000.0))))));
    }
}

