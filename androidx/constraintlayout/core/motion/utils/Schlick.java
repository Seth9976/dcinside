package androidx.constraintlayout.core.motion.utils;

public class Schlick extends Easing {
    double p;
    double q;
    double r;
    private static final boolean s = false;

    Schlick(String s) {
        this.a = s;
        int v = s.indexOf(40);
        int v1 = s.indexOf(44, v);
        this.p = Double.parseDouble(s.substring(v + 1, v1).trim());
        this.q = Double.parseDouble(s.substring(v1 + 1, s.indexOf(44, v1 + 1)).trim());
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double a(double f) {
        return this.e(f);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double b(double f) {
        return this.d(f);
    }

    private double d(double f) {
        return f < this.q ? this.p * this.q * this.q / (((this.q - f) * this.p + f) * (this.p * (this.q - f) + f)) : (this.q - 1.0) * this.p * (this.q - 1.0) / ((-this.p * (this.q - f) - f + 1.0) * (-this.p * (this.q - f) - f + 1.0));
    }

    private double e(double f) {
        return f < this.q ? this.q * f / (f + this.p * (this.q - f)) : (1.0 - this.q) * (f - 1.0) / (1.0 - f - this.p * (this.q - f));
    }
}

