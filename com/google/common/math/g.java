package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.H;

@c
@d
@e
public abstract class g {
    static class a {
    }

    public static final class b {
        private final double a;
        private final double b;

        private b(double f, double f1) {
            this.a = f;
            this.b = f1;
        }

        b(double f, double f1, a g$a0) {
            this(f, f1);
        }

        public g a(double f, double f1) {
            boolean z = false;
            H.d(com.google.common.math.d.d(f) && com.google.common.math.d.d(f1));
            double f2 = this.a;
            if(f == f2) {
                if(f1 != this.b) {
                    z = true;
                }
                H.d(z);
                return new com.google.common.math.g.e(this.a);
            }
            return this.b((f1 - this.b) / (f - f2));
        }

        public g b(double f) {
            H.d(!Double.isNaN(f));
            return com.google.common.math.d.d(f) ? new com.google.common.math.g.d(f, this.b - this.a * f) : new com.google.common.math.g.e(this.a);
        }
    }

    static final class com.google.common.math.g.c extends g {
        static final com.google.common.math.g.c a;

        static {
            com.google.common.math.g.c.a = new com.google.common.math.g.c();
        }

        @Override  // com.google.common.math.g
        public g c() {
            return this;
        }

        @Override  // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override  // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override  // com.google.common.math.g
        public double g() {
            return NaN;
        }

        @Override  // com.google.common.math.g
        public double h(double f) {
            return NaN;
        }

        @Override
        public String toString() {
            return "NaN";
        }
    }

    static final class com.google.common.math.g.d extends g {
        final double a;
        final double b;
        @P1.b
        @o3.a
        g c;

        com.google.common.math.g.d(double f, double f1) {
            this.a = f;
            this.b = f1;
            this.c = null;
        }

        com.google.common.math.g.d(double f, double f1, g g0) {
            this.a = f;
            this.b = f1;
            this.c = g0;
        }

        @Override  // com.google.common.math.g
        public g c() {
            g g0 = this.c;
            if(g0 == null) {
                g0 = this.j();
                this.c = g0;
            }
            return g0;
        }

        @Override  // com.google.common.math.g
        public boolean d() {
            return this.a == 0.0;
        }

        @Override  // com.google.common.math.g
        public boolean e() {
            return false;
        }

        @Override  // com.google.common.math.g
        public double g() {
            return this.a;
        }

        @Override  // com.google.common.math.g
        public double h(double f) {
            return f * this.a + this.b;
        }

        private g j() {
            double f = this.a;
            return f != 0.0 ? new com.google.common.math.g.d(1.0 / f, this.b * -1.0 / f, this) : new com.google.common.math.g.e(this.b, this);
        }

        @Override
        public String toString() {
            return String.format("y = %g * x + %g", this.a, this.b);
        }
    }

    static final class com.google.common.math.g.e extends g {
        final double a;
        @P1.b
        @o3.a
        g b;

        com.google.common.math.g.e(double f) {
            this.a = f;
            this.b = null;
        }

        com.google.common.math.g.e(double f, g g0) {
            this.a = f;
            this.b = g0;
        }

        @Override  // com.google.common.math.g
        public g c() {
            g g0 = this.b;
            if(g0 == null) {
                g0 = this.j();
                this.b = g0;
            }
            return g0;
        }

        @Override  // com.google.common.math.g
        public boolean d() {
            return false;
        }

        @Override  // com.google.common.math.g
        public boolean e() {
            return true;
        }

        @Override  // com.google.common.math.g
        public double g() {
            throw new IllegalStateException();
        }

        @Override  // com.google.common.math.g
        public double h(double f) {
            throw new IllegalStateException();
        }

        private g j() {
            return new com.google.common.math.g.d(0.0, this.a, this);
        }

        @Override
        public String toString() {
            return String.format("x = %g", this.a);
        }
    }

    public static g a() {
        return com.google.common.math.g.c.a;
    }

    public static g b(double f) {
        H.d(com.google.common.math.d.d(f));
        return new com.google.common.math.g.d(0.0, f);
    }

    public abstract g c();

    public abstract boolean d();

    public abstract boolean e();

    public static b f(double f, double f1) {
        H.d(com.google.common.math.d.d(f) && com.google.common.math.d.d(f1));
        return new b(f, f1, null);
    }

    public abstract double g();

    public abstract double h(double arg1);

    public static g i(double f) {
        H.d(com.google.common.math.d.d(f));
        return new com.google.common.math.g.e(f);
    }
}

