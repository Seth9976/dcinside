package androidx.constraintlayout.core.motion.utils;

public class HyperSpline {
    public static class Cubic {
        double a;
        double b;
        double c;
        double d;

        public Cubic(double f, double f1, double f2, double f3) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
        }

        public double a(double f) {
            return ((this.d * f + this.c) * f + this.b) * f + this.a;
        }

        public double b(double f) {
            return (this.d * 3.0 * f + this.c * 2.0) * f + this.b;
        }
    }

    int a;
    Cubic[][] b;
    int c;
    double[] d;
    double e;
    double[][] f;

    public HyperSpline() {
    }

    public HyperSpline(double[][] arr2_f) {
        this.g(arr2_f);
    }

    public double a(Cubic[] arr_hyperSpline$Cubic) {
        int v;
        double[] arr_f = new double[arr_hyperSpline$Cubic.length];
        double f = 0.0;
        double f2 = 0.0;
        for(double f1 = 0.0; true; f1 += 0.1) {
            v = 0;
            if(f1 >= 1.0) {
                break;
            }
            double f3 = 0.0;
            while(v < arr_hyperSpline$Cubic.length) {
                double f4 = arr_f[v];
                double f5 = arr_hyperSpline$Cubic[v].a(f1);
                arr_f[v] = f5;
                f3 += (f4 - f5) * (f4 - f5);
                ++v;
            }
            if(f1 > 0.0) {
                f2 += Math.sqrt(f3);
            }
        }
        while(v < arr_hyperSpline$Cubic.length) {
            double f6 = arr_f[v];
            double f7 = arr_hyperSpline$Cubic[v].a(1.0);
            arr_f[v] = f7;
            f += (f6 - f7) * (f6 - f7);
            ++v;
        }
        return f2 + Math.sqrt(f);
    }

    static Cubic[] b(int v, double[] arr_f) {
        double[] arr_f1 = new double[v];
        double[] arr_f2 = new double[v];
        double[] arr_f3 = new double[v];
        arr_f1[0] = 0.5;
        for(int v3 = 1; v3 < v - 1; ++v3) {
            arr_f1[v3] = 1.0 / (4.0 - arr_f1[v3 - 1]);
        }
        int v4 = v - 2;
        arr_f1[v - 1] = 1.0 / (2.0 - arr_f1[v4]);
        arr_f2[0] = (arr_f[1] - arr_f[0]) * 3.0 * arr_f1[0];
        for(int v2 = 1; v2 < v - 1; ++v2) {
            arr_f2[v2] = ((arr_f[v2 + 1] - arr_f[v2 - 1]) * 3.0 - arr_f2[v2 - 1]) * arr_f1[v2];
        }
        double f = ((arr_f[v - 1] - arr_f[v4]) * 3.0 - arr_f2[v4]) * arr_f1[v - 1];
        arr_f2[v - 1] = f;
        arr_f3[v - 1] = f;
        while(v4 >= 0) {
            arr_f3[v4] = arr_f2[v4] - arr_f1[v4] * arr_f3[v4 + 1];
            --v4;
        }
        Cubic[] arr_hyperSpline$Cubic = new Cubic[v - 1];
        for(int v1 = 0; v1 < v - 1; ++v1) {
            double f1 = arr_f[v1];
            double f2 = arr_f3[v1];
            double f3 = arr_f[v1 + 1];
            double f4 = arr_f3[v1 + 1];
            arr_hyperSpline$Cubic[v1] = new Cubic(((double)(((float)f1))), f2, (f3 - f1) * 3.0 - f2 * 2.0 - f4, (f1 - f3) * 2.0 + f2 + f4);
        }
        return arr_hyperSpline$Cubic;
    }

    public double c(double f, int v) {
        double[] arr_f;
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            arr_f = this.d;
            if(v1 >= arr_f.length - 1) {
                break;
            }
            double f2 = arr_f[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        return this.b[v][v1].a(f1 / arr_f[v1]);
    }

    public void d(double f, double[] arr_f) {
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            double[] arr_f1 = this.d;
            if(v1 >= arr_f1.length - 1) {
                break;
            }
            double f2 = arr_f1[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = this.b[v][v1].a(f1 / this.d[v1]);
        }
    }

    public void e(double f, float[] arr_f) {
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            double[] arr_f1 = this.d;
            if(v1 >= arr_f1.length - 1) {
                break;
            }
            double f2 = arr_f1[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = (float)this.b[v][v1].a(f1 / this.d[v1]);
        }
    }

    public void f(double f, double[] arr_f) {
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            double[] arr_f1 = this.d;
            if(v1 >= arr_f1.length - 1) {
                break;
            }
            double f2 = arr_f1[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = this.b[v][v1].b(f1 / this.d[v1]);
        }
    }

    public void g(double[][] arr2_f) {
        int v3;
        this.c = arr2_f[0].length;
        this.a = arr2_f.length;
        this.f = new double[arr2_f[0].length][arr2_f.length];
        this.b = new Cubic[this.c][];
        for(int v = 0; v < this.c; ++v) {
            for(int v1 = 0; v1 < this.a; ++v1) {
                this.f[v][v1] = arr2_f[v1][v];
            }
        }
        for(int v2 = 0; true; ++v2) {
            v3 = this.c;
            if(v2 >= v3) {
                break;
            }
            Cubic[][] arr2_hyperSpline$Cubic = this.b;
            double[] arr_f = this.f[v2];
            arr2_hyperSpline$Cubic[v2] = HyperSpline.b(arr_f.length, arr_f);
        }
        this.d = new double[this.a - 1];
        this.e = 0.0;
        Cubic[] arr_hyperSpline$Cubic = new Cubic[v3];
        for(int v4 = 0; v4 < this.d.length; ++v4) {
            for(int v5 = 0; v5 < this.c; ++v5) {
                arr_hyperSpline$Cubic[v5] = this.b[v5][v4];
            }
            double f = this.e;
            double[] arr_f1 = this.d;
            double f1 = this.a(arr_hyperSpline$Cubic);
            arr_f1[v4] = f1;
            this.e = f + f1;
        }
    }
}

