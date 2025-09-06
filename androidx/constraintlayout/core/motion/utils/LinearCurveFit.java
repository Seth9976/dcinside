package androidx.constraintlayout.core.motion.utils;

public class LinearCurveFit extends CurveFit {
    private double[] d;
    private double[][] e;
    private double f;
    private boolean g;
    double[] h;
    private static final String i = "LinearCurveFit";

    public LinearCurveFit(double[] arr_f, double[][] arr2_f) {
        this.f = NaN;
        this.g = true;
        int v = arr2_f[0].length;
        this.h = new double[v];
        this.d = arr_f;
        this.e = arr2_f;
        if(v > 2) {
            for(int v1 = 0; v1 < arr_f.length; ++v1) {
                double f = arr2_f[v1][0];
            }
            this.f = 0.0;
        }
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
                double f5 = (f - f3) / (f4 - f3);
                return this.e[v1][v] * (1.0 - f5) + this.e[v1 + 1][v] * f5;
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
                double f5 = (f - f4) / (f3 - f4);
                while(v < v1) {
                    arr_f[v] = this.e[v6][v] * (1.0 - f5) + this.e[v6 + 1][v] * f5;
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
                double f5 = (f - f4) / (f3 - f4);
                while(v < v1) {
                    arr_f[v] = (float)(this.e[v6][v] * (1.0 - f5) + this.e[v6 + 1][v] * f5);
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
            if(f >= f1) {
                f = f1;
            }
        }
        else {
            f = f1;
        }
        for(int v1 = 0; v1 < arr_f.length - 1; ++v1) {
            double[] arr_f1 = this.d;
            double f2 = arr_f1[v1 + 1];
            if(f <= f2) {
                return (this.e[v1 + 1][v] - this.e[v1][v]) / (f2 - arr_f1[v1]);
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
            if(f >= f1) {
                f = f1;
            }
        }
        else {
            f = f1;
        }
        for(int v2 = 0; v2 < arr_f1.length - 1; ++v2) {
            double[] arr_f2 = this.d;
            double f2 = arr_f2[v2 + 1];
            if(f <= f2) {
                double f3 = f2 - arr_f2[v2];
                for(int v = 0; v < v1; ++v) {
                    arr_f[v] = (this.e[v2 + 1][v] - this.e[v2][v]) / f3;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] h() {
        return this.d;
    }

    private double i(double f) {
        if(Double.isNaN(this.f)) {
            return 0.0;
        }
        double[] arr_f = this.d;
        if(f <= arr_f[0]) {
            return 0.0;
        }
        int v = arr_f.length - 1;
        if(f >= arr_f[v]) {
            return this.f;
        }
        double f1 = 0.0;
        double f2 = 0.0;
        int v1 = 0;
        for(double f3 = 0.0; v1 < v; f3 = f5) {
            double[] arr_f1 = this.e[v1];
            double f4 = arr_f1[0];
            double f5 = arr_f1[1];
            if(v1 > 0) {
                f1 += Math.hypot(f4 - f2, f5 - f3);
            }
            double[] arr_f2 = this.d;
            double f6 = arr_f2[v1];
            if(f == f6) {
                return f1;
            }
            double f7 = arr_f2[v1 + 1];
            if(f < f7) {
                double f8 = (f - f6) / (f7 - f6);
                double[][] arr2_f = this.e;
                double[] arr_f3 = arr2_f[v1];
                double f9 = arr_f3[0];
                double[] arr_f4 = arr2_f[v1 + 1];
                return f1 + Math.hypot(f5 - (arr_f3[1] * (1.0 - f8) + arr_f4[1] * f8), f4 - (f9 * (1.0 - f8) + arr_f4[0] * f8));
            }
            ++v1;
            f2 = f4;
        }
        return 0.0;
    }
}

