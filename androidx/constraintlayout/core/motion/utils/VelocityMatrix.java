package androidx.constraintlayout.core.motion.utils;

public class VelocityMatrix {
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    private static String g = "VelocityMatrix";

    static {
    }

    public void a(float f, float f1, int v, int v1, float[] arr_f) {
        float f2 = (f - 0.5f) * 2.0f;
        float f3 = (f1 - 0.5f) * 2.0f;
        float f4 = arr_f[0] + this.c + this.a * f2;
        float f5 = (float)Math.toRadians(this.e);
        double f6 = (double)(((float)Math.toRadians(this.f)));
        double f7 = (double)(((float)v1) * f3);
        float f8 = arr_f[1] + this.d + this.b * f3 + f5 * ((float)(((double)(((float)v) * f2)) * Math.cos(f6) - f7 * Math.sin(f6)));
        arr_f[0] = f4 + ((float)(((double)(((float)(-v)) * f2)) * Math.sin(f6) - Math.cos(f6) * f7)) * f5;
        arr_f[1] = f8;
    }

    public void b() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public void c(KeyCycleOscillator keyCycleOscillator0, float f) {
        if(keyCycleOscillator0 != null) {
            this.e = keyCycleOscillator0.c(f);
        }
    }

    public void d(SplineSet splineSet0, float f) {
        if(splineSet0 != null) {
            this.e = splineSet0.c(f);
            this.f = splineSet0.a(f);
        }
    }

    public void e(KeyCycleOscillator keyCycleOscillator0, KeyCycleOscillator keyCycleOscillator1, float f) {
        if(keyCycleOscillator0 != null) {
            this.a = keyCycleOscillator0.c(f);
        }
        if(keyCycleOscillator1 != null) {
            this.b = keyCycleOscillator1.c(f);
        }
    }

    public void f(SplineSet splineSet0, SplineSet splineSet1, float f) {
        if(splineSet0 != null) {
            this.a = splineSet0.c(f);
        }
        if(splineSet1 != null) {
            this.b = splineSet1.c(f);
        }
    }

    public void g(KeyCycleOscillator keyCycleOscillator0, KeyCycleOscillator keyCycleOscillator1, float f) {
        if(keyCycleOscillator0 != null) {
            this.c = keyCycleOscillator0.c(f);
        }
        if(keyCycleOscillator1 != null) {
            this.d = keyCycleOscillator1.c(f);
        }
    }

    public void h(SplineSet splineSet0, SplineSet splineSet1, float f) {
        if(splineSet0 != null) {
            this.c = splineSet0.c(f);
        }
        if(splineSet1 != null) {
            this.d = splineSet1.c(f);
        }
    }
}

