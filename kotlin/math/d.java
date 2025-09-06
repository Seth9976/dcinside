package kotlin.math;

import kotlin.W0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.r;

class d extends c {
    @h0(version = "1.2")
    @f
    private static final double A(double f) {
        return Math.cos(f);
    }

    @h0(version = "1.2")
    @f
    private static final double A0(double f, double f1) {
        return Math.nextAfter(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float B(float f) {
        return (float)Math.cos(f);
    }

    @h0(version = "1.2")
    @f
    private static final float B0(float f, float f1) {
        return Math.nextAfter(f, ((double)f1));
    }

    @h0(version = "1.2")
    @f
    private static final double C(double f) {
        return Math.cosh(f);
    }

    @h0(version = "1.2")
    @f
    private static final double C0(double f) {
        return Math.nextUp(f);
    }

    @h0(version = "1.2")
    @f
    private static final float D(float f) {
        return (float)Math.cosh(f);
    }

    @h0(version = "1.2")
    @f
    private static final float D0(float f) {
        return Math.nextUp(f);
    }

    @h0(version = "1.2")
    @f
    private static final double E(double f) {
        return Math.exp(f);
    }

    @h0(version = "1.2")
    @f
    private static final double E0(double f, double f1) {
        return Math.pow(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float F(float f) {
        return (float)Math.exp(f);
    }

    @h0(version = "1.2")
    @f
    private static final double F0(double f, int v) {
        return Math.pow(f, v);
    }

    @h0(version = "1.2")
    @f
    private static final double G(double f) {
        return Math.expm1(f);
    }

    @h0(version = "1.2")
    @f
    private static final float G0(float f, float f1) {
        return (float)Math.pow(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float H(float f) {
        return (float)Math.expm1(f);
    }

    @h0(version = "1.2")
    @f
    private static final float H0(float f, int v) {
        return (float)Math.pow(f, v);
    }

    @h0(version = "1.2")
    @f
    private static final double I(double f) {
        return Math.floor(f);
    }

    @h0(version = "1.2")
    @f
    private static final double I0(double f) {
        return Math.rint(f);
    }

    @h0(version = "1.2")
    @f
    private static final float J(float f) {
        return (float)Math.floor(f);
    }

    @h0(version = "1.2")
    @f
    private static final float J0(float f) {
        return (float)Math.rint(f);
    }

    private static final double K(double f) {
        return Math.abs(f);
    }

    @h0(version = "1.2")
    public static int K0(double f) {
        if(Double.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if(f > 2147483647.0) {
            return 0x7FFFFFFF;
        }
        return f < -2147483648.0 ? 0x80000000 : ((int)Math.round(f));
    }

    private static final float L(float f) {
        return Math.abs(f);
    }

    @h0(version = "1.2")
    public static int L0(float f) {
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    private static final int M(int v) {
        return Math.abs(v);
    }

    @h0(version = "1.2")
    public static long M0(double f) {
        if(Double.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    private static final long N(long v) {
        return Math.abs(v);
    }

    @h0(version = "1.2")
    public static long N0(float f) {
        return b.M0(f);
    }

    @h0(version = "1.2")
    @f
    public static void O(double f) {
    }

    @h0(version = "1.2")
    @f
    private static final double O0(double f) {
        return Math.signum(f);
    }

    @h0(version = "1.2")
    @f
    public static void P(float f) {
    }

    @h0(version = "1.2")
    @f
    private static final float P0(float f) {
        return Math.signum(f);
    }

    @h0(version = "1.2")
    @f
    public static void Q(int v) {
    }

    @h0(version = "1.2")
    @f
    private static final double Q0(double f) {
        return Math.sin(f);
    }

    @h0(version = "1.2")
    @f
    public static void R(long v) {
    }

    @h0(version = "1.2")
    @f
    private static final float R0(float f) {
        return (float)Math.sin(f);
    }

    private static final double S(double f) {
        return Math.signum(f);
    }

    @h0(version = "1.2")
    @f
    private static final double S0(double f) {
        return Math.sinh(f);
    }

    private static final float T(float f) {
        return Math.signum(f);
    }

    @h0(version = "1.2")
    @f
    private static final float T0(float f) {
        return (float)Math.sinh(f);
    }

    public static int U(int v) {
        return Integer.signum(v);
    }

    @h0(version = "1.2")
    @f
    private static final double U0(double f) {
        return Math.sqrt(f);
    }

    public static int V(long v) {
        return Long.signum(v);
    }

    @h0(version = "1.2")
    @f
    private static final float V0(float f) {
        return (float)Math.sqrt(f);
    }

    @h0(version = "1.2")
    @f
    public static void W(double f) {
    }

    @h0(version = "1.2")
    @f
    private static final double W0(double f) {
        return Math.tan(f);
    }

    @h0(version = "1.2")
    @f
    public static void X(float f) {
    }

    @h0(version = "1.2")
    @f
    private static final float X0(float f) {
        return (float)Math.tan(f);
    }

    @h0(version = "1.2")
    public static void Y(int v) {
    }

    @h0(version = "1.2")
    @f
    private static final double Y0(double f) {
        return Math.tanh(f);
    }

    @h0(version = "1.2")
    public static void Z(long v) {
    }

    @h0(version = "1.2")
    @f
    private static final float Z0(float f) {
        return (float)Math.tanh(f);
    }

    private static final double a0(double f) {
        return Math.ulp(f);
    }

    @h0(version = "1.2")
    public static final double a1(double f) {
        if(!Double.isNaN(f) && !Double.isInfinite(f)) {
            return f > 0.0 ? Math.floor(f) : Math.ceil(f);
        }
        return f;
    }

    private static final float b0(float f) {
        return Math.ulp(f);
    }

    @h0(version = "1.2")
    public static final float b1(float f) {
        if(!Float.isNaN(f) && !Float.isInfinite(f)) {
            return f > 0.0f ? ((float)Math.floor(f)) : ((float)Math.ceil(f));
        }
        return f;
    }

    @h0(version = "1.2")
    @f
    private static final double c(double f, double f1) {
        return Math.IEEEremainder(f, f1);
    }

    @h0(version = "1.2")
    @f
    public static void c0(double f) {
    }

    @h0(version = "1.2")
    @f
    private static final double c1(double f, double f1) {
        return Math.copySign(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float d(float f, float f1) {
        return (float)Math.IEEEremainder(f, f1);
    }

    @h0(version = "1.2")
    @f
    public static void d0(float f) {
    }

    @h0(version = "1.2")
    @f
    private static final double d1(double f, int v) {
        return Math.copySign(f, v);
    }

    @h0(version = "1.2")
    @f
    private static final double e(double f) {
        return Math.abs(f);
    }

    @h0(version = "1.2")
    @f
    private static final double e0(double f, double f1) {
        return Math.hypot(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float e1(float f, float f1) {
        return Math.copySign(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float f(float f) {
        return Math.abs(f);
    }

    @h0(version = "1.2")
    @f
    private static final float f0(float f, float f1) {
        return (float)Math.hypot(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float f1(float f, int v) {
        return Math.copySign(f, v);
    }

    @h0(version = "1.2")
    @f
    private static final int g(int v) {
        return Math.abs(v);
    }

    @h0(version = "1.2")
    @f
    private static final double g0(double f) {
        return Math.log(f);
    }

    @h0(version = "1.2")
    @f
    private static final long h(long v) {
        return Math.abs(v);
    }

    @h0(version = "1.2")
    @f
    private static final float h0(float f) {
        return (float)Math.log(f);
    }

    @h0(version = "1.2")
    @f
    private static final double i(double f) {
        return Math.acos(f);
    }

    @h0(version = "1.2")
    @f
    private static final double i0(double f) {
        return Math.log1p(f);
    }

    @h0(version = "1.2")
    @f
    private static final float j(float f) {
        return (float)Math.acos(f);
    }

    @h0(version = "1.2")
    @f
    private static final float j0(float f) {
        return (float)Math.log1p(f);
    }

    @h0(version = "1.2")
    public static final double k(double f) {
        if(f < 1.0) {
            return NaN;
        }
        if(f > a.f) {
            return Math.log(f) + a.b;
        }
        if(f - 1.0 >= a.e) {
            return Math.log(f + Math.sqrt(f * f - 1.0));
        }
        double f1 = Math.sqrt(f - 1.0);
        return (f1 >= a.d ? f1 - f1 * f1 * f1 / 12.0 : Math.sqrt(f - 1.0)) * 1.414214;
    }

    @h0(version = "1.2")
    public static final double k0(double f, double f1) {
        return f1 <= 0.0 || f1 == 1.0 ? NaN : Math.log(f) / Math.log(f1);
    }

    @h0(version = "1.2")
    @f
    private static final float l(float f) {
        return (float)d.k(f);
    }

    @h0(version = "1.2")
    public static final float l0(float f, float f1) {
        return f1 <= 0.0f || f1 == 1.0f ? NaNf : ((float)(Math.log(f) / Math.log(f1)));
    }

    @h0(version = "1.2")
    @f
    private static final double m(double f) {
        return Math.asin(f);
    }

    @h0(version = "1.2")
    @f
    private static final double m0(double f) {
        return Math.log10(f);
    }

    @h0(version = "1.2")
    @f
    private static final float n(float f) {
        return (float)Math.asin(f);
    }

    @h0(version = "1.2")
    @f
    private static final float n0(float f) {
        return (float)Math.log10(f);
    }

    @h0(version = "1.2")
    public static final double o(double f) {
        double f1 = a.e;
        if(f >= f1) {
            if(f > a.g) {
                return f > a.f ? Math.log(f) + a.b : Math.log(f * 2.0 + 1.0 / (f * 2.0));
            }
            return Math.log(f + Math.sqrt(f * f + 1.0));
        }
        if(f <= -f1) {
            return -d.o(-f);
        }
        return Math.abs(f) >= a.d ? f - f * f * f / 6.0 : f;
    }

    @h0(version = "1.2")
    public static final double o0(double f) {
        return Math.log(f) / a.b;
    }

    @h0(version = "1.2")
    @f
    private static final float p(float f) {
        return (float)d.o(f);
    }

    @h0(version = "1.2")
    public static final float p0(float f) {
        return (float)(Math.log(f) / a.b);
    }

    @h0(version = "1.2")
    @f
    private static final double q(double f) {
        return Math.atan(f);
    }

    @h0(version = "1.2")
    @f
    private static final double q0(double f, double f1) {
        return Math.max(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float r(float f) {
        return (float)Math.atan(f);
    }

    @h0(version = "1.2")
    @f
    private static final float r0(float f, float f1) {
        return Math.max(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final double s(double f, double f1) {
        return Math.atan2(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final int s0(int v, int v1) {
        return Math.max(v, v1);
    }

    @h0(version = "1.2")
    @f
    private static final float t(float f, float f1) {
        return (float)Math.atan2(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final long t0(long v, long v1) {
        return Math.max(v, v1);
    }

    @h0(version = "1.2")
    public static final double u(double f) {
        if(Math.abs(f) < a.e) {
            return Math.abs(f) > a.d ? f + f * f * f / 3.0 : f;
        }
        return Math.log((f + 1.0) / (1.0 - f)) / 2.0;
    }

    @h0(version = "1.2")
    @f
    private static final double u0(double f, double f1) {
        return Math.min(f, f1);
    }

    @h0(version = "1.2")
    @f
    private static final float v(float f) {
        return (float)d.u(f);
    }

    @h0(version = "1.2")
    @f
    private static final float v0(float f, float f1) {
        return Math.min(f, f1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.8")
    @f
    private static final double w(double f) {
        return Math.cbrt(f);
    }

    @h0(version = "1.2")
    @f
    private static final int w0(int v, int v1) {
        return Math.min(v, v1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.8")
    @f
    private static final float x(float f) {
        return (float)Math.cbrt(f);
    }

    @h0(version = "1.2")
    @f
    private static final long x0(long v, long v1) {
        return Math.min(v, v1);
    }

    @h0(version = "1.2")
    @f
    private static final double y(double f) {
        return Math.ceil(f);
    }

    @h0(version = "1.2")
    @f
    private static final double y0(double f) {
        return Math.nextAfter(f, -Infinity);
    }

    @h0(version = "1.2")
    @f
    private static final float z(float f) {
        return (float)Math.ceil(f);
    }

    @h0(version = "1.2")
    @f
    private static final float z0(float f) {
        return Math.nextAfter(f, -Infinity);
    }
}

