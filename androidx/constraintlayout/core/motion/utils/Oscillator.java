package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class Oscillator {
    float[] a;
    double[] b;
    double[] c;
    String d;
    MonotonicCurveFit e;
    int f;
    double g;
    private boolean h;
    public static String i = "Oscillator";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;
    public static final int o = 5;
    public static final int p = 6;
    public static final int q = 7;

    static {
    }

    public Oscillator() {
        this.a = new float[0];
        this.b = new double[0];
        this.g = 6.283185;
        this.h = false;
    }

    public void a(double f, float f1) {
        int v = this.a.length + 1;
        int v1 = Arrays.binarySearch(this.b, f);
        if(v1 < 0) {
            v1 = -v1 - 1;
        }
        this.b = Arrays.copyOf(this.b, v);
        this.a = Arrays.copyOf(this.a, v);
        this.c = new double[v];
        System.arraycopy(this.b, v1, this.b, v1 + 1, v - v1 - 1);
        this.b[v1] = f;
        this.a[v1] = f1;
        this.h = false;
    }

    double b(double f) {
        if(f <= 0.0) {
            return 0.0;
        }
        if(f >= 1.0) {
            return 1.0;
        }
        int v = Arrays.binarySearch(this.b, f);
        if(v < 0) {
            v = -v - 1;
        }
        float[] arr_f = this.a;
        float f1 = arr_f[v];
        float f2 = arr_f[v - 1];
        double[] arr_f1 = this.b;
        double f3 = arr_f1[v];
        double f4 = arr_f1[v - 1];
        double f5 = ((double)(f1 - f2)) / (f3 - f4);
        return f * f5 + (((double)f2) - f5 * f4);
    }

    double c(double f) {
        if(f <= 0.0) {
            return 0.0;
        }
        if(f >= 1.0) {
            return 1.0;
        }
        int v = Arrays.binarySearch(this.b, f);
        if(v < 0) {
            v = -v - 1;
        }
        float[] arr_f = this.a;
        float f1 = arr_f[v];
        float f2 = arr_f[v - 1];
        double[] arr_f1 = this.b;
        double f3 = arr_f1[v];
        double f4 = arr_f1[v - 1];
        double f5 = ((double)(f1 - f2)) / (f3 - f4);
        return this.c[v - 1] + (((double)f2) - f5 * f4) * (f - f4) + f5 * (f * f - f4 * f4) / 2.0;
    }

    public double d(double f, double f1, double f2) {
        double f3 = f1 + this.c(f);
        double f4 = this.b(f) + f2;
        switch(this.f) {
            case 1: {
                return 0.0;
            }
            case 2: {
                return f4 * 4.0 * Math.signum((f3 * 4.0 + 3.0) % 4.0 - 2.0);
            }
            case 3: {
                return f4 * 2.0;
            }
            case 4: {
                return -f4 * 2.0;
            }
            case 5: {
                return -this.g * f4 * Math.sin(this.g * f3);
            }
            case 6: {
                return f4 * 4.0 * ((f3 * 4.0 + 2.0) % 4.0 - 2.0);
            }
            case 7: {
                return this.e.f(f3 % 1.0, 0);
            }
            default: {
                return f4 * this.g * Math.cos(this.g * f3);
            }
        }
    }

    public double e(double f, double f1) {
        double f2 = this.c(f) + f1;
        switch(this.f) {
            case 1: {
                return Math.signum(0.5 - f2 % 1.0);
            }
            case 2: {
                return 1.0 - Math.abs((f2 * 4.0 + 1.0) % 4.0 - 2.0);
            }
            case 3: {
                return (f2 * 2.0 + 1.0) % 2.0 - 1.0;
            }
            case 4: {
                return 1.0 - (f2 * 2.0 + 1.0) % 2.0;
            }
            case 5: {
                return Math.cos(this.g * (f1 + f2));
            }
            case 6: {
                double f3 = Math.abs(f2 * 4.0 % 4.0 - 2.0);
                return 1.0 - (1.0 - f3) * (1.0 - f3);
            }
            case 7: {
                return this.e.c(f2 % 1.0, 0);
            }
            default: {
                return Math.sin(this.g * f2);
            }
        }
    }

    public void f() {
        double f = 0.0;
        for(int v = 0; true; ++v) {
            float[] arr_f = this.a;
            if(v >= arr_f.length) {
                break;
            }
            f += (double)arr_f[v];
        }
        double f1 = 0.0;
        for(int v1 = 1; true; ++v1) {
            float[] arr_f1 = this.a;
            if(v1 >= arr_f1.length) {
                break;
            }
            f1 += (this.b[v1] - this.b[v1 - 1]) * ((double)((arr_f1[v1 - 1] + arr_f1[v1]) / 2.0f));
        }
        for(int v2 = 0; true; ++v2) {
            float[] arr_f2 = this.a;
            if(v2 >= arr_f2.length) {
                break;
            }
            arr_f2[v2] *= (float)(f / f1);
        }
        this.c[0] = 0.0;
        for(int v3 = 1; true; ++v3) {
            float[] arr_f3 = this.a;
            if(v3 >= arr_f3.length) {
                break;
            }
            this.c[v3] = this.c[v3 - 1] + (this.b[v3] - this.b[v3 - 1]) * ((double)((arr_f3[v3 - 1] + arr_f3[v3]) / 2.0f));
        }
        this.h = true;
    }

    public void g(int v, String s) {
        this.f = v;
        this.d = s;
        if(s != null) {
            this.e = MonotonicCurveFit.i(s);
        }
    }

    @Override
    public String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}

