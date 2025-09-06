package H1;

public final class a {
    public static final float a = 0.0001f;

    public static float a(float f, float f1, float f2, float f3) {
        return (float)Math.hypot(f2 - f, f3 - f1);
    }

    public static float b(float f, float f1, float f2, float f3, float f4, float f5) {
        return a.g(a.a(f, f1, f2, f3), a.a(f, f1, f4, f3), a.a(f, f1, f4, f5), a.a(f, f1, f2, f5));
    }

    public static float c(float f, int v) {
        int v1 = (int)(f / ((float)v));
        if(Math.signum(f) * ((float)v) < 0.0f && ((float)(v1 * v)) != f) {
            --v1;
        }
        return f - ((float)(v1 * v));
    }

    public static int d(int v, int v1) {
        int v2 = v / v1;
        if((v ^ v1) < 0 && v2 * v1 != v) {
            --v2;
        }
        return v - v2 * v1;
    }

    public static boolean e(float f, float f1, float f2) {
        return f + f2 >= f1;
    }

    public static float f(float f, float f1, float f2) [...] // Inlined contents

    private static float g(float f, float f1, float f2, float f3) {
        if(f <= f1 || f <= f2 || f <= f3) {
            if(f1 > f2 && f1 > f3) {
                return f1;
            }
            return f2 > f3 ? f2 : f3;
        }
        return f;
    }
}

