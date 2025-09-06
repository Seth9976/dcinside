package androidx.core.math;

public class MathUtils {
    public static int a(int v, int v1) {
        int v2 = v + v1;
        int v3 = 0;
        if((v < 0 ? 0 : 1) == (v1 < 0 ? 0 : 1)) {
            if(v2 >= 0) {
                v3 = 1;
            }
            if((v < 0 ? 0 : 1) != v3) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return v2;
    }

    public static long b(long v, long v1) {
        long v2 = v + v1;
        int v3 = 0;
        int v4 = Long.compare(v, 0L);
        if((v4 < 0 ? 0 : 1) == (v1 < 0L ? 0 : 1)) {
            if(v2 >= 0L) {
                v3 = 1;
            }
            if((v4 < 0 ? 0 : 1) != v3) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return v2;
    }

    public static double c(double f, double f1, double f2) {
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    public static float d(float f, float f1, float f2) {
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    public static int e(int v, int v1, int v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static long f(long v, long v1, long v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static int g(int v) {
        if(v == 0x80000000) {
            throw new ArithmeticException("integer overflow");
        }
        return v - 1;
    }

    public static long h(long v) {
        if(v == 0x8000000000000000L) {
            throw new ArithmeticException("integer overflow");
        }
        return v - 1L;
    }

    public static int i(int v) {
        if(v == 0x7FFFFFFF) {
            throw new ArithmeticException("integer overflow");
        }
        return v + 1;
    }

    public static long j(long v) {
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            throw new ArithmeticException("integer overflow");
        }
        return v + 1L;
    }

    public static int k(int v, int v1) {
        int v2 = v * v1;
        if(v != 0 && v1 != 0 && (v2 / v != v1 || v2 / v1 != v)) {
            throw new ArithmeticException("integer overflow");
        }
        return v2;
    }

    public static long l(long v, long v1) {
        long v2 = v * v1;
        if(v != 0L && v1 != 0L && (v2 / v != v1 || v2 / v1 != v)) {
            throw new ArithmeticException("integer overflow");
        }
        return v2;
    }

    public static int m(int v) {
        if(v == 0x80000000) {
            throw new ArithmeticException("integer overflow");
        }
        return -v;
    }

    public static long n(long v) {
        if(v == 0x8000000000000000L) {
            throw new ArithmeticException("integer overflow");
        }
        return -v;
    }

    public static int o(int v, int v1) {
        int v2 = v - v1;
        int v3 = 0;
        if((v >= 0 ? 0 : 1) != (v1 >= 0 ? 0 : 1)) {
            if(v2 < 0) {
                v3 = 1;
            }
            if((v >= 0 ? 0 : 1) != v3) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return v2;
    }

    public static long p(long v, long v1) {
        long v2 = v - v1;
        int v3 = 0;
        int v4 = Long.compare(v, 0L);
        if((v4 >= 0 ? 0 : 1) != (v1 >= 0L ? 0 : 1)) {
            if(v2 < 0L) {
                v3 = 1;
            }
            if((v4 >= 0 ? 0 : 1) != v3) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return v2;
    }

    public static int q(long v) {
        if(v > 0x7FFFFFFFL || v < 0xFFFFFFFF80000000L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int)v;
    }
}

