package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonotonicCurveFit extends CurveFit {
    private double[] d;
    private double[][] e;
    private double[][] f;
    private boolean g;
    double[] h;
    private static final String i = "MonotonicCurveFit";

    public MonotonicCurveFit(double[] arr_f, double[][] arr2_f) {
        this.g = true;
        int v = arr2_f[0].length;
        this.h = new double[v];
        int v1 = arr_f.length - 1;
        Class class0 = Double.TYPE;
        double[][] arr2_f1 = (double[][])Array.newInstance(class0, new int[]{v1, v});
        double[][] arr2_f2 = (double[][])Array.newInstance(class0, new int[]{arr_f.length, v});
        for(int v2 = 0; v2 < v; ++v2) {
            for(int v3 = 0; v3 < v1; ++v3) {
                double f = arr_f[v3 + 1] - arr_f[v3];
                double[] arr_f1 = arr2_f1[v3];
                double f1 = (arr2_f[v3 + 1][v2] - arr2_f[v3][v2]) / f;
                arr_f1[v2] = f1;
                if(v3 == 0) {
                    arr2_f2[0][v2] = f1;
                }
                else {
                    arr2_f2[v3][v2] = (arr2_f1[v3 - 1][v2] + f1) * 0.5;
                }
            }
            arr2_f2[v1][v2] = arr2_f1[arr_f.length - 2][v2];
        }
        for(int v4 = 0; v4 < v1; ++v4) {
            for(int v5 = 0; v5 < v; ++v5) {
                double f2 = arr2_f1[v4][v5];
                if(f2 == 0.0) {
                    arr2_f2[v4][v5] = 0.0;
                    arr2_f2[v4 + 1][v5] = 0.0;
                }
                else {
                    double f3 = arr2_f2[v4][v5] / f2;
                    double f4 = arr2_f2[v4 + 1][v5] / f2;
                    double f5 = Math.hypot(f3, f4);
                    if(f5 > 9.0) {
                        double[] arr_f2 = arr2_f2[v4];
                        double[] arr_f3 = arr2_f1[v4];
                        arr_f2[v5] = f3 * (3.0 / f5) * arr_f3[v5];
                        arr2_f2[v4 + 1][v5] = 3.0 / f5 * f4 * arr_f3[v5];
                    }
                }
            }
        }
        this.d = arr_f;
        this.e = arr2_f;
        this.f = arr2_f2;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double c(double f, int v) {
        double[] arr_f = this.d;
        if(this.g) {
            double f1 = arr_f[0];
            if(f <= f1) {
                return this.e[0][v] + (f - f1) * this.f(f1, v);
            }
            int v2 = arr_f.length - 1;
            double f2 = arr_f[v2];
            if(f >= f2) {
                return this.e[v2][v] + (f - f2) * this.f(f2, v);
            }
        }
        else {
            if(f <= arr_f[0]) {
                return this.e[0][v];
            }
            int v3 = arr_f.length - 1;
            if(f >= arr_f[v3]) {
                return this.e[v3][v];
            }
        }
        for(int v1 = 0; v1 < arr_f.length - 1; ++v1) {
            double[] arr_f1 = this.d;
            double f3 = arr_f1[v1];
            if(f == f3) {
                return this.e[v1][v];
            }
            double f4 = arr_f1[v1 + 1];
            if(f < f4) {
                return MonotonicCurveFit.l(f4 - f3, (f - f3) / (f4 - f3), this.e[v1][v], this.e[v1 + 1][v], this.f[v1][v], this.f[v1 + 1][v]);
            }
        }
        return 0.0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void d(double f, double[] arr_f) {
        double[] arr_f1 = this.d;
        int v = 0;
        int v1 = this.e[0].length;
        if(this.g) {
            double f1 = arr_f1[0];
            if(f <= f1) {
                this.g(f1, this.h);
                for(int v2 = 0; v2 < v1; ++v2) {
                    arr_f[v2] = this.e[0][v2] + (f - this.d[0]) * this.h[v2];
                }
                return;
            }
            int v3 = arr_f1.length - 1;
            double f2 = arr_f1[v3];
            if(f >= f2) {
                this.g(f2, this.h);
                while(v < v1) {
                    arr_f[v] = this.e[v3][v] + (f - this.d[v3]) * this.h[v];
                    ++v;
                }
                return;
            }
        }
        else {
            if(f <= arr_f1[0]) {
                for(int v4 = 0; v4 < v1; ++v4) {
                    arr_f[v4] = this.e[0][v4];
                }
                return;
            }
            int v5 = arr_f1.length - 1;
            if(f >= arr_f1[v5]) {
                while(v < v1) {
                    arr_f[v] = this.e[v5][v];
                    ++v;
                }
                return;
            }
        }
        for(int v6 = 0; v6 < arr_f1.length - 1; ++v6) {
            if(f == this.d[v6]) {
                for(int v7 = 0; v7 < v1; ++v7) {
                    arr_f[v7] = this.e[v6][v7];
                }
            }
            double[] arr_f2 = this.d;
            double f3 = arr_f2[v6 + 1];
            if(f < f3) {
                double f4 = arr_f2[v6];
                while(v < v1) {
                    arr_f[v] = MonotonicCurveFit.l(f3 - f4, (f - f4) / (f3 - f4), this.e[v6][v], this.e[v6 + 1][v], this.f[v6][v], this.f[v6 + 1][v]);
                    ++v;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void e(double f, float[] arr_f) {
        double[] arr_f1 = this.d;
        int v = 0;
        int v1 = this.e[0].length;
        if(this.g) {
            double f1 = arr_f1[0];
            if(f <= f1) {
                this.g(f1, this.h);
                for(int v2 = 0; v2 < v1; ++v2) {
                    arr_f[v2] = (float)(this.e[0][v2] + (f - this.d[0]) * this.h[v2]);
                }
                return;
            }
            int v3 = arr_f1.length - 1;
            double f2 = arr_f1[v3];
            if(f >= f2) {
                this.g(f2, this.h);
                while(v < v1) {
                    arr_f[v] = (float)(this.e[v3][v] + (f - this.d[v3]) * this.h[v]);
                    ++v;
                }
                return;
            }
        }
        else {
            if(f <= arr_f1[0]) {
                for(int v4 = 0; v4 < v1; ++v4) {
                    arr_f[v4] = (float)this.e[0][v4];
                }
                return;
            }
            int v5 = arr_f1.length - 1;
            if(f >= arr_f1[v5]) {
                while(v < v1) {
                    arr_f[v] = (float)this.e[v5][v];
                    ++v;
                }
                return;
            }
        }
        for(int v6 = 0; v6 < arr_f1.length - 1; ++v6) {
            if(f == this.d[v6]) {
                for(int v7 = 0; v7 < v1; ++v7) {
                    arr_f[v7] = (float)this.e[v6][v7];
                }
            }
            double[] arr_f2 = this.d;
            double f3 = arr_f2[v6 + 1];
            if(f < f3) {
                double f4 = arr_f2[v6];
                while(v < v1) {
                    arr_f[v] = (float)MonotonicCurveFit.l(f3 - f4, (f - f4) / (f3 - f4), this.e[v6][v], this.e[v6 + 1][v], this.f[v6][v], this.f[v6 + 1][v]);
                    ++v;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double f(double f, int v) {
        double[] arr_f = this.d;
        double f1 = arr_f[0];
        if(f >= f1) {
            f1 = arr_f[arr_f.length - 1];
            if(f < f1) {
                f1 = f;
            }
        }
        for(int v1 = 0; v1 < arr_f.length - 1; ++v1) {
            double[] arr_f1 = this.d;
            double f2 = arr_f1[v1 + 1];
            if(f1 <= f2) {
                double f3 = arr_f1[v1];
                double f4 = f2 - f3;
                return MonotonicCurveFit.k(f4, (f1 - f3) / f4, this.e[v1][v], this.e[v1 + 1][v], this.f[v1][v], this.f[v1 + 1][v]) / f4;
            }
        }
        return 0.0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void g(double f, double[] arr_f) {
        double[] arr_f1 = this.d;
        int v1 = this.e[0].length;
        double f1 = arr_f1[0];
        if(f > f1) {
            f1 = arr_f1[arr_f1.length - 1];
            if(f < f1) {
                f1 = f;
            }
        }
        for(int v2 = 0; v2 < arr_f1.length - 1; ++v2) {
            double[] arr_f2 = this.d;
            double f2 = arr_f2[v2 + 1];
            if(f1 <= f2) {
                double f3 = arr_f2[v2];
                double f4 = f2 - f3;
                for(int v = 0; v < v1; ++v) {
                    arr_f[v] = MonotonicCurveFit.k(f4, (f1 - f3) / f4, this.e[v2][v], this.e[v2 + 1][v], this.f[v2][v], this.f[v2 + 1][v]) / f4;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] h() {
        return this.d;
    }

    public static MonotonicCurveFit i(String s) {
        double[] arr_f = new double[s.length() / 2];
        int v = s.indexOf(40) + 1;
        int v1 = s.indexOf(44, v);
        int v2;
        for(v2 = 0; v1 != -1; ++v2) {
            arr_f[v2] = Double.parseDouble(s.substring(v, v1).trim());
            v = v1 + 1;
            v1 = s.indexOf(44, v);
        }
        arr_f[v2] = Double.parseDouble(s.substring(v, s.indexOf(41, v)).trim());
        return MonotonicCurveFit.j(Arrays.copyOf(arr_f, v2 + 1));
    }

    private static MonotonicCurveFit j(double[] arr_f) {
        int v = arr_f.length * 3 - 2;
        int v1 = arr_f.length - 1;
        double[][] arr2_f = new double[v][1];
        double[] arr_f1 = new double[v];
        for(int v2 = 0; v2 < arr_f.length; ++v2) {
            double f = arr_f[v2];
            int v3 = v2 + v1;
            arr2_f[v3][0] = f;
            double f1 = ((double)v2) * (1.0 / ((double)v1));
            arr_f1[v3] = f1;
            if(v2 > 0) {
                int v4 = v1 * 2 + v2;
                arr2_f[v4][0] = f + 1.0;
                arr_f1[v4] = f1 + 1.0;
                arr2_f[v2 - 1][0] = f - 1.0 - 1.0 / ((double)v1);
                arr_f1[v2 - 1] = f1 - 1.0 - 1.0 / ((double)v1);
            }
        }
        return new MonotonicCurveFit(arr_f1, arr2_f);
    }

    private static double k(double f, double f1, double f2, double f3, double f4, double f5) {
        double f6 = f1 * f1;
        return -6.0 * f6 * f3 + f1 * 6.0 * f3 + 6.0 * f6 * f2 - f1 * 6.0 * f2 + 3.0 * f * f5 * f6 + 3.0 * f * f4 * f6 - 2.0 * f * f5 * f1 - 4.0 * f * f4 * f1 + f * f4;
    }

    private static double l(double f, double f1, double f2, double f3, double f4, double f5) {
        double f6 = f1 * f1;
        double f7 = f6 * f1;
        return -2.0 * f7 * f3 + 3.0 * f6 * f3 + f7 * 2.0 * f2 - 3.0 * f6 * f2 + f2 + f * f5 * f7 + f7 * (f * f4) - f * f5 * f6 - f * 2.0 * f4 * f6 + f * f4 * f1;
    }
}

