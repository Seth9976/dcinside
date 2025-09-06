package androidx.constraintlayout.core.motion.utils;

public class SpringStopEngine implements StopEngine {
    double a;
    private boolean b;
    private double c;
    private double d;
    private double e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private static final double l = 1.797693E+308;

    public SpringStopEngine() {
        this.a = 0.5;
        this.b = false;
        this.k = 0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float a() {
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float b(float f) {
        return this.h;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public String c(String s, float f) {
        return null;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean d() {
        double f = ((double)this.g) - this.d;
        double f1 = (double)this.h;
        return Math.sqrt((f1 * f1 * ((double)this.i) + this.c * f * f) / this.c) <= ((double)this.j);
    }

    private void e(double f) {
        if(f <= 0.0) {
            return;
        }
        double f1 = this.c;
        double f2 = this.a;
        int v = (int)(9.0 / (Math.sqrt(f1 / ((double)this.i)) * f * 4.0) + 1.0);
        double f3 = f / ((double)v);
        for(int v1 = 0; v1 < v; ++v1) {
            float f4 = this.g;
            double f5 = this.d;
            float f6 = this.h;
            float f7 = this.i;
            double f8 = ((double)f6) + (-f1 * (((double)f4) - f5) - ((double)f6) * f2) / ((double)f7) * f3 / 2.0;
            double f9 = (-(((double)f4) + f3 * f8 / 2.0 - f5) * f1 - f8 * f2) / ((double)f7) * f3;
            float f10 = f6 + ((float)f9);
            this.h = f10;
            float f11 = f4 + ((float)((((double)f6) + f9 / 2.0) * f3));
            this.g = f11;
            int v2 = this.k;
            if(v2 > 0) {
                if(f11 < 0.0f && (v2 & 1) == 1) {
                    this.g = -f11;
                    this.h = -f10;
                }
                float f12 = this.g;
                if(f12 > 1.0f && (v2 & 2) == 2) {
                    this.g = 2.0f - f12;
                    this.h = -this.h;
                }
            }
        }
    }

    public float f() {
        return ((float)(-this.c * (((double)this.g) - this.d) - this.a * ((double)this.h))) / this.i;
    }

    void g(String s) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        System.out.println(".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ") " + "g" + "() " + s);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        this.e(((double)(f - this.f)));
        this.f = f;
        if(this.d()) {
            this.g = (float)this.d;
        }
        return this.g;
    }

    public void h(float f, float f1, float f2, float f3, float f4, float f5, float f6, int v) {
        this.d = (double)f1;
        this.a = (double)f5;
        this.b = false;
        this.g = f;
        this.e = (double)f2;
        this.c = (double)f4;
        this.i = f3;
        this.j = f6;
        this.k = v;
        this.f = 0.0f;
    }
}

