package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class SpringForce implements Force {
    double a;
    double b;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final MassState j;
    public static final float k = 10000.0f;
    public static final float l = 1500.0f;
    public static final float m = 200.0f;
    public static final float n = 50.0f;
    public static final float o = 0.2f;
    public static final float p = 0.5f;
    public static final float q = 0.75f;
    public static final float r = 1.0f;
    private static final double s = 62.5;
    private static final double t = 1.797693E+308;

    public SpringForce() {
        this.a = 38.729833;
        this.b = 0.5;
        this.c = false;
        this.i = 1.797693E+308;
        this.j = new MassState();
    }

    public SpringForce(float f) {
        this.a = 38.729833;
        this.b = 0.5;
        this.c = false;
        this.i = 1.797693E+308;
        this.j = new MassState();
        this.i = (double)f;
    }

    @Override  // androidx.dynamicanimation.animation.Force
    @RestrictTo({Scope.a})
    public float a(float f, float f1) {
        return (float)(-(this.a * this.a) * ((double)(f - this.d())) - this.a * 2.0 * this.b * ((double)f1));
    }

    @Override  // androidx.dynamicanimation.animation.Force
    @RestrictTo({Scope.a})
    public boolean b(float f, float f1) {
        return ((double)Math.abs(f1)) < this.e && ((double)Math.abs(f - this.d())) < this.d;
    }

    public float c() {
        return (float)this.b;
    }

    public float d() {
        return (float)this.i;
    }

    public float e() {
        return (float)(this.a * this.a);
    }

    private void f() {
        if(this.c) {
            return;
        }
        if(this.i == 1.797693E+308) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double f = this.b;
        if(f > 1.0) {
            this.f = -f * this.a + this.a * Math.sqrt(f * f - 1.0);
            this.g = -this.b * this.a - this.a * Math.sqrt(this.b * this.b - 1.0);
        }
        else if(f >= 0.0 && f < 1.0) {
            this.h = this.a * Math.sqrt(1.0 - f * f);
        }
        this.c = true;
    }

    public SpringForce g(@FloatRange(from = 0.0) float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = (double)f;
        this.c = false;
        return this;
    }

    public SpringForce h(float f) {
        this.i = (double)f;
        return this;
    }

    public SpringForce i(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.c = false;
        return this;
    }

    void j(double f) {
        double f1 = Math.abs(f);
        this.d = f1;
        this.e = f1 * 62.5;
    }

    MassState k(double f, double f1, long v) {
        double f9;
        double f8;
        this.f();
        double f2 = f - this.i;
        double f3 = this.b;
        if(f3 > 1.0) {
            double f4 = this.g;
            double f5 = this.f;
            double f6 = f2 - (f4 * f2 - f1) / (f4 - f5);
            double f7 = (f2 * f4 - f1) / (f4 - f5);
            f8 = Math.pow(2.718282, f4 * (((double)v) / 1000.0)) * f6 + Math.pow(2.718282, this.f * (((double)v) / 1000.0)) * f7;
            f9 = f6 * this.g * Math.pow(2.718282, this.g * (((double)v) / 1000.0)) + f7 * this.f * Math.pow(2.718282, this.f * (((double)v) / 1000.0));
        }
        else if(f3 == 1.0) {
            double f10 = f1 + this.a * f2;
            double f11 = f2 + f10 * (((double)v) / 1000.0);
            f8 = Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * f11;
            f9 = f10 * Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) + f11 * Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * -this.a;
        }
        else {
            double f12 = this.a;
            double f13 = 1.0 / this.h * (f3 * f12 * f2 + f1);
            double f14 = Math.pow(2.718282, -f3 * f12 * (((double)v) / 1000.0)) * (Math.cos(this.h * (((double)v) / 1000.0)) * f2 + Math.sin(this.h * (((double)v) / 1000.0)) * f13);
            f9 = -this.a * f14 * this.b + Math.pow(2.718282, -this.b * this.a * (((double)v) / 1000.0)) * (-this.h * f2 * Math.sin(this.h * (((double)v) / 1000.0)) + f13 * this.h * Math.cos(this.h * (((double)v) / 1000.0)));
            f8 = f14;
        }
        this.j.a = (float)(f8 + this.i);
        this.j.b = (float)f9;
        return this.j;
    }
}

