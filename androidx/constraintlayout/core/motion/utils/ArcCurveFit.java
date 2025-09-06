package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class ArcCurveFit extends CurveFit {
    static class Arc {
        double[] a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r;
        private static final String s = "Arc";
        private static double[] t = null;
        private static final double u = 0.001;

        static {
            Arc.t = new double[91];
        }

        Arc(int v, double f, double f1, double f2, double f3, double f4, double f5) {
            boolean z = false;
            boolean z1 = false;
            super();
            this.r = false;
            double f6 = f4 - f2;
            double f7 = f5 - f3;
            int v1 = 1;
            if(v == 1) {
                this.q = true;
            }
            else {
                switch(v) {
                    case 4: {
                        if(f7 > 0.0) {
                            z1 = true;
                        }
                        this.q = z1;
                        break;
                    }
                    case 5: {
                        if(f7 < 0.0) {
                            z = true;
                        }
                        this.q = z;
                        break;
                    }
                    default: {
                        this.q = false;
                    }
                }
            }
            this.c = f;
            this.d = f1;
            this.i = 1.0 / (f1 - f);
            if(3 == v) {
                this.r = true;
            }
            if(!this.r && Math.abs(f6) >= 0.001 && Math.abs(f7) >= 0.001) {
                this.a = new double[101];
                boolean z2 = this.q;
                this.j = f6 * ((double)(z2 ? -1 : 1));
                if(!z2) {
                    v1 = -1;
                }
                this.k = f7 * ((double)v1);
                this.l = z2 ? f4 : f2;
                this.m = z2 ? f3 : f5;
                this.a(f2, f3, f4, f5);
                this.n = this.b * this.i;
                return;
            }
            this.r = true;
            this.e = f2;
            this.f = f4;
            this.g = f3;
            this.h = f5;
            double f8 = Math.hypot(f7, f6);
            this.b = f8;
            this.n = f8 * this.i;
            double f9 = this.d;
            double f10 = this.c;
            this.l = f6 / (f9 - f10);
            this.m = f7 / (f9 - f10);
        }

        private void a(double f, double f1, double f2, double f3) {
            double f10;
            int v = 0;
            double f4 = 0.0;
            double f6 = 0.0;
            for(double f5 = 0.0; true; f5 = f8) {
                double[] arr_f = Arc.t;
                if(v >= arr_f.length) {
                    break;
                }
                double f7 = Math.toRadians(((double)v) * 90.0 / ((double)(arr_f.length - 1)));
                double f8 = Math.sin(f7) * (f2 - f);
                double f9 = Math.cos(f7) * (f1 - f3);
                if(v > 0) {
                    f10 = Math.hypot(f8 - f5, f9 - f6) + f4;
                    Arc.t[v] = f10;
                }
                else {
                    f10 = f4;
                }
                ++v;
                f6 = f9;
                f4 = f10;
            }
            this.b = f4;
            for(int v1 = 0; true; ++v1) {
                double[] arr_f1 = Arc.t;
                if(v1 >= arr_f1.length) {
                    break;
                }
                arr_f1[v1] /= f4;
            }
            for(int v2 = 0; true; ++v2) {
                double[] arr_f2 = this.a;
                if(v2 >= arr_f2.length) {
                    break;
                }
                double f11 = ((double)v2) / ((double)(arr_f2.length - 1));
                int v3 = Arrays.binarySearch(Arc.t, f11);
                if(v3 >= 0) {
                    this.a[v2] = ((double)v3) / ((double)(Arc.t.length - 1));
                }
                else if(v3 == -1) {
                    this.a[v2] = 0.0;
                }
                else {
                    double[] arr_f3 = Arc.t;
                    double f12 = arr_f3[-v3 - 2];
                    this.a[v2] = (((double)(-v3 - 2)) + (f11 - f12) / (arr_f3[-v3 - 1] - f12)) / ((double)(arr_f3.length - 1));
                }
            }
        }

        double b() {
            double f = this.j * this.p;
            double f1 = this.n / Math.hypot(f, -this.k * this.o);
            if(this.q) {
                f = -f;
            }
            return f * f1;
        }

        double c() {
            double f = -this.k * this.o;
            double f1 = this.n / Math.hypot(this.j * this.p, f);
            return this.q ? -f * f1 : f * f1;
        }

        public double d(double f) {
            return this.l;
        }

        public double e(double f) {
            return this.m;
        }

        public double f(double f) {
            return this.e + (f - this.c) * this.i * (this.f - this.e);
        }

        public double g(double f) {
            return this.g + (f - this.c) * this.i * (this.h - this.g);
        }

        double h() {
            return this.l + this.j * this.o;
        }

        double i() {
            return this.m + this.k * this.p;
        }

        double j(double f) {
            if(f <= 0.0) {
                return 0.0;
            }
            if(f >= 1.0) {
                return 1.0;
            }
            double[] arr_f = this.a;
            double f1 = f * ((double)(arr_f.length - 1));
            double f2 = arr_f[((int)f1)];
            return f2 + (f1 - ((double)(((int)f1)))) * (arr_f[((int)f1) + 1] - f2);
        }

        void k(double f) {
            double f1 = this.j((this.q ? this.d - f : f - this.c) * this.i);
            this.o = Math.sin(f1 * 1.570796);
            this.p = Math.cos(f1 * 1.570796);
        }
    }

    private final double[] d;
    Arc[] e;
    private boolean f;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;

    public ArcCurveFit(int[] arr_v, double[] arr_f, double[][] arr2_f) {
        this.f = true;
        this.d = arr_f;
        this.e = new Arc[arr_f.length - 1];
        int v1 = 1;
        int v2 = 1;
        for(int v = 0; true; ++v) {
            Arc[] arr_arcCurveFit$Arc = this.e;
            if(v >= arr_arcCurveFit$Arc.length) {
                break;
            }
            switch(arr_v[v]) {
                case 0: {
                    v2 = 3;
                    break;
                }
                case 1: {
                    v1 = 1;
                    v2 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    v2 = 2;
                    break;
                }
                case 3: {
                    v1 = v1 == 1 ? 2 : 1;
                    v2 = v1;
                    break;
                }
                case 4: {
                    v2 = 4;
                    break;
                }
                case 5: {
                    v2 = 5;
                }
            }
            double f = arr_f[v];
            double f1 = arr_f[v + 1];
            double[] arr_f1 = arr2_f[v];
            double f2 = arr_f1[0];
            double f3 = arr_f1[1];
            double[] arr_f2 = arr2_f[v + 1];
            arr_arcCurveFit$Arc[v] = new Arc(v2, f, f1, f2, f3, arr_f2[0], arr_f2[1]);
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double c(double f, int v) {
        if(this.f) {
            Arc[] arr_arcCurveFit$Arc = this.e;
            Arc arcCurveFit$Arc0 = arr_arcCurveFit$Arc[0];
            double f1 = arcCurveFit$Arc0.c;
            if(f < f1) {
                double f2 = f - f1;
                if(arcCurveFit$Arc0.r) {
                    return v == 0 ? arcCurveFit$Arc0.f(f1) + f2 * this.e[0].d(f1) : arcCurveFit$Arc0.g(f1) + f2 * this.e[0].e(f1);
                }
                arcCurveFit$Arc0.k(f1);
                return v == 0 ? this.e[0].h() + f2 * this.e[0].b() : this.e[0].i() + f2 * this.e[0].c();
            }
            if(f > arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d) {
                double f3 = arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d;
                int v2 = arr_arcCurveFit$Arc.length - 1;
                return v == 0 ? arr_arcCurveFit$Arc[v2].f(f3) + (f - f3) * this.e[v2].d(f3) : arr_arcCurveFit$Arc[v2].g(f3) + (f - f3) * this.e[v2].e(f3);
            }
        }
        else {
            Arc[] arr_arcCurveFit$Arc1 = this.e;
            double f4 = arr_arcCurveFit$Arc1[0].c;
            if(f < f4) {
                f = f4;
            }
            else if(f > arr_arcCurveFit$Arc1[arr_arcCurveFit$Arc1.length - 1].d) {
                f = arr_arcCurveFit$Arc1[arr_arcCurveFit$Arc1.length - 1].d;
            }
        }
        for(int v1 = 0; true; ++v1) {
            Arc[] arr_arcCurveFit$Arc2 = this.e;
            if(v1 >= arr_arcCurveFit$Arc2.length) {
                break;
            }
            Arc arcCurveFit$Arc1 = arr_arcCurveFit$Arc2[v1];
            if(f <= arcCurveFit$Arc1.d) {
                if(arcCurveFit$Arc1.r) {
                    return v == 0 ? arcCurveFit$Arc1.f(f) : arcCurveFit$Arc1.g(f);
                }
                arcCurveFit$Arc1.k(f);
                return v == 0 ? this.e[v1].h() : this.e[v1].i();
            }
        }
        return NaN;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void d(double f, double[] arr_f) {
        if(this.f) {
            Arc[] arr_arcCurveFit$Arc = this.e;
            Arc arcCurveFit$Arc0 = arr_arcCurveFit$Arc[0];
            double f1 = arcCurveFit$Arc0.c;
            if(f < f1) {
                double f2 = f - f1;
                if(arcCurveFit$Arc0.r) {
                    arr_f[0] = arcCurveFit$Arc0.f(f1) + this.e[0].d(f1) * f2;
                    arr_f[1] = this.e[0].g(f1) + f2 * this.e[0].e(f1);
                    return;
                }
                arcCurveFit$Arc0.k(f1);
                arr_f[0] = this.e[0].h() + this.e[0].b() * f2;
                arr_f[1] = this.e[0].i() + f2 * this.e[0].c();
                return;
            }
            if(f > arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d) {
                double f3 = arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d;
                double f4 = f - f3;
                int v = arr_arcCurveFit$Arc.length - 1;
                Arc arcCurveFit$Arc1 = arr_arcCurveFit$Arc[v];
                if(arcCurveFit$Arc1.r) {
                    arr_f[0] = arcCurveFit$Arc1.f(f3) + this.e[v].d(f3) * f4;
                    arr_f[1] = this.e[v].g(f3) + f4 * this.e[v].e(f3);
                    return;
                }
                arcCurveFit$Arc1.k(f);
                arr_f[0] = this.e[v].h() + this.e[v].b() * f4;
                arr_f[1] = this.e[v].i() + f4 * this.e[v].c();
                return;
            }
        }
        else {
            Arc[] arr_arcCurveFit$Arc1 = this.e;
            double f5 = arr_arcCurveFit$Arc1[0].c;
            if(f < f5) {
                f = f5;
            }
            if(f > arr_arcCurveFit$Arc1[arr_arcCurveFit$Arc1.length - 1].d) {
                f = arr_arcCurveFit$Arc1[arr_arcCurveFit$Arc1.length - 1].d;
            }
        }
        for(int v1 = 0; true; ++v1) {
            Arc[] arr_arcCurveFit$Arc2 = this.e;
            if(v1 >= arr_arcCurveFit$Arc2.length) {
                break;
            }
            Arc arcCurveFit$Arc2 = arr_arcCurveFit$Arc2[v1];
            if(f <= arcCurveFit$Arc2.d) {
                if(arcCurveFit$Arc2.r) {
                    arr_f[0] = arcCurveFit$Arc2.f(f);
                    arr_f[1] = this.e[v1].g(f);
                    return;
                }
                arcCurveFit$Arc2.k(f);
                arr_f[0] = this.e[v1].h();
                arr_f[1] = this.e[v1].i();
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void e(double f, float[] arr_f) {
        if(this.f) {
            Arc[] arr_arcCurveFit$Arc = this.e;
            Arc arcCurveFit$Arc0 = arr_arcCurveFit$Arc[0];
            double f1 = arcCurveFit$Arc0.c;
            if(f < f1) {
                double f2 = f - f1;
                if(arcCurveFit$Arc0.r) {
                    arr_f[0] = (float)(arcCurveFit$Arc0.f(f1) + this.e[0].d(f1) * f2);
                    arr_f[1] = (float)(this.e[0].g(f1) + f2 * this.e[0].e(f1));
                    return;
                }
                arcCurveFit$Arc0.k(f1);
                arr_f[0] = (float)(this.e[0].h() + this.e[0].b() * f2);
                arr_f[1] = (float)(this.e[0].i() + f2 * this.e[0].c());
                return;
            }
            if(f > arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d) {
                double f3 = arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d;
                double f4 = f - f3;
                int v = arr_arcCurveFit$Arc.length - 1;
                Arc arcCurveFit$Arc1 = arr_arcCurveFit$Arc[v];
                if(arcCurveFit$Arc1.r) {
                    arr_f[0] = (float)(arcCurveFit$Arc1.f(f3) + this.e[v].d(f3) * f4);
                    arr_f[1] = (float)(this.e[v].g(f3) + f4 * this.e[v].e(f3));
                    return;
                }
                arcCurveFit$Arc1.k(f);
                arr_f[0] = (float)this.e[v].h();
                arr_f[1] = (float)this.e[v].i();
                return;
            }
        }
        else {
            Arc[] arr_arcCurveFit$Arc1 = this.e;
            double f5 = arr_arcCurveFit$Arc1[0].c;
            if(f < f5) {
                f = f5;
            }
            else if(f > arr_arcCurveFit$Arc1[arr_arcCurveFit$Arc1.length - 1].d) {
                f = arr_arcCurveFit$Arc1[arr_arcCurveFit$Arc1.length - 1].d;
            }
        }
        for(int v1 = 0; true; ++v1) {
            Arc[] arr_arcCurveFit$Arc2 = this.e;
            if(v1 >= arr_arcCurveFit$Arc2.length) {
                break;
            }
            Arc arcCurveFit$Arc2 = arr_arcCurveFit$Arc2[v1];
            if(f <= arcCurveFit$Arc2.d) {
                if(arcCurveFit$Arc2.r) {
                    arr_f[0] = (float)arcCurveFit$Arc2.f(f);
                    arr_f[1] = (float)this.e[v1].g(f);
                    return;
                }
                arcCurveFit$Arc2.k(f);
                arr_f[0] = (float)this.e[v1].h();
                arr_f[1] = (float)this.e[v1].i();
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double f(double f, int v) {
        Arc[] arr_arcCurveFit$Arc = this.e;
        double f1 = arr_arcCurveFit$Arc[0].c;
        if(f < f1) {
            f = f1;
        }
        if(f > arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d) {
            f = arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d;
        }
        for(int v1 = 0; true; ++v1) {
            Arc[] arr_arcCurveFit$Arc1 = this.e;
            if(v1 >= arr_arcCurveFit$Arc1.length) {
                break;
            }
            Arc arcCurveFit$Arc0 = arr_arcCurveFit$Arc1[v1];
            if(f <= arcCurveFit$Arc0.d) {
                if(arcCurveFit$Arc0.r) {
                    return v == 0 ? arcCurveFit$Arc0.d(f) : arcCurveFit$Arc0.e(f);
                }
                arcCurveFit$Arc0.k(f);
                return v == 0 ? this.e[v1].b() : this.e[v1].c();
            }
        }
        return NaN;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void g(double f, double[] arr_f) {
        Arc[] arr_arcCurveFit$Arc = this.e;
        double f1 = arr_arcCurveFit$Arc[0].c;
        if(f < f1) {
            f = f1;
        }
        else if(f > arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d) {
            f = arr_arcCurveFit$Arc[arr_arcCurveFit$Arc.length - 1].d;
        }
        for(int v = 0; true; ++v) {
            Arc[] arr_arcCurveFit$Arc1 = this.e;
            if(v >= arr_arcCurveFit$Arc1.length) {
                break;
            }
            Arc arcCurveFit$Arc0 = arr_arcCurveFit$Arc1[v];
            if(f <= arcCurveFit$Arc0.d) {
                if(arcCurveFit$Arc0.r) {
                    arr_f[0] = arcCurveFit$Arc0.d(f);
                    arr_f[1] = this.e[v].e(f);
                    return;
                }
                arcCurveFit$Arc0.k(f);
                arr_f[0] = this.e[v].b();
                arr_f[1] = this.e[v].c();
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] h() {
        return this.d;
    }
}

