package androidx.constraintlayout.core.motion.utils;

public class Easing {
    static class CubicEasing extends Easing {
        double p;
        double q;
        double r;
        double s;
        private static double t = 0.01;
        private static double u = 0.0001;

        static {
        }

        CubicEasing(double f, double f1, double f2, double f3) {
            this.h(f, f1, f2, f3);
        }

        CubicEasing(String s) {
            this.a = s;
            int v = s.indexOf(40);
            int v1 = s.indexOf(44, v);
            this.p = Double.parseDouble(s.substring(v + 1, v1).trim());
            int v2 = s.indexOf(44, v1 + 1);
            this.q = Double.parseDouble(s.substring(v1 + 1, v2).trim());
            int v3 = s.indexOf(44, v2 + 1);
            this.r = Double.parseDouble(s.substring(v2 + 1, v3).trim());
            this.s = Double.parseDouble(s.substring(v3 + 1, s.indexOf(41, v3 + 1)).trim());
        }

        @Override  // androidx.constraintlayout.core.motion.utils.Easing
        public double a(double f) {
            if(f <= 0.0) {
                return 0.0;
            }
            if(f >= 1.0) {
                return 1.0;
            }
            double f1 = 0.5;
            double f2 = 0.5;
            while(f1 > CubicEasing.t) {
                f1 *= 0.5;
                if(this.f(f2) < f) {
                    f2 += f1;
                }
                else {
                    f2 -= f1;
                }
            }
            double f3 = f2 - f1;
            double f4 = this.f(f3);
            double f5 = f2 + f1;
            double f6 = this.f(f5);
            double f7 = this.g(f3);
            return (this.g(f5) - f7) * (f - f4) / (f6 - f4) + f7;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.Easing
        public double b(double f) {
            double f1 = 0.5;
            double f2 = 0.5;
            while(f1 > CubicEasing.u) {
                f1 *= 0.5;
                if(this.f(f2) < f) {
                    f2 += f1;
                }
                else {
                    f2 -= f1;
                }
            }
            return (this.g(f2 + f1) - this.g(f2 - f1)) / (this.f(f2 + f1) - this.f(f2 - f1));
        }

        private double d(double f) {
            return (1.0 - f) * 3.0 * (1.0 - f) * this.p + (1.0 - f) * 6.0 * f * (this.r - this.p) + 3.0 * f * f * (1.0 - this.r);
        }

        private double e(double f) {
            return (1.0 - f) * 3.0 * (1.0 - f) * this.q + (1.0 - f) * 6.0 * f * (this.s - this.q) + 3.0 * f * f * (1.0 - this.s);
        }

        private double f(double f) {
            double f1 = 3.0 * (1.0 - f);
            return this.p * ((1.0 - f) * f1 * f) + this.r * (f1 * f * f) + f * f * f;
        }

        private double g(double f) {
            double f1 = 3.0 * (1.0 - f);
            return this.q * ((1.0 - f) * f1 * f) + this.s * (f1 * f * f) + f * f * f;
        }

        void h(double f, double f1, double f2, double f3) {
            this.p = f;
            this.q = f1;
            this.r = f2;
            this.s = f3;
        }
    }

    String a;
    static Easing b = null;
    private static final String c = "cubic(0.4, 0.0, 0.2, 1)";
    private static final String d = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String e = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String f = "cubic(1, 1, 0, 0)";
    private static final String g = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String h = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String i = "decelerate";
    private static final String j = "accelerate";
    private static final String k = "standard";
    private static final String l = "linear";
    private static final String m = "anticipate";
    private static final String n = "overshoot";
    public static String[] o;

    static {
        Easing.b = new Easing();
        Easing.o = new String[]{"standard", "accelerate", "decelerate", "linear"};
    }

    public Easing() {
        this.a = "identity";
    }

    public double a(double f) {
        return f;
    }

    public double b(double f) {
        return 1.0;
    }

    public static Easing c(String s) {
        if(s == null) {
            return null;
        }
        if(s.startsWith("cubic")) {
            return new CubicEasing(s);
        }
        if(s.startsWith("spline")) {
            return new StepCurve(s);
        }
        if(s.startsWith("Schlick")) {
            return new Schlick(s);
        }
        switch(s) {
            case "accelerate": {
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            }
            case "anticipate": {
                return new CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
            }
            case "decelerate": {
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            }
            case "linear": {
                return new CubicEasing("cubic(1, 1, 0, 0)");
            }
            case "overshoot": {
                return new CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
            }
            case "standard": {
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            }
            default: {
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or [standard, accelerate, decelerate, linear]");
                return Easing.b;
            }
        }
    }

    @Override
    public String toString() {
        return this.a;
    }
}

