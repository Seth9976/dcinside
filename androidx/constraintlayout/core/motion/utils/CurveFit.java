package androidx.constraintlayout.core.motion.utils;

public abstract class CurveFit {
    static class Constant extends CurveFit {
        double d;
        double[] e;

        Constant(double f, double[] arr_f) {
            this.d = f;
            this.e = arr_f;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
        public double c(double f, int v) {
            return this.e[v];
        }

        @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
        public void d(double f, double[] arr_f) {
            System.arraycopy(this.e, 0, arr_f, 0, this.e.length);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
        public void e(double f, float[] arr_f) {
            for(int v = 0; true; ++v) {
                double[] arr_f1 = this.e;
                if(v >= arr_f1.length) {
                    break;
                }
                arr_f[v] = (float)arr_f1[v];
            }
        }

        @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
        public double f(double f, int v) {
            return 0.0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
        public void g(double f, double[] arr_f) {
            for(int v = 0; v < this.e.length; ++v) {
                arr_f[v] = 0.0;
            }
        }

        @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
        public double[] h() {
            return new double[]{this.d};
        }
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public static CurveFit a(int v, double[] arr_f, double[][] arr2_f) {
        if(arr_f.length == 1) {
            v = 2;
        }
        switch(v) {
            case 0: {
                return new MonotonicCurveFit(arr_f, arr2_f);
            }
            case 2: {
                return new Constant(arr_f[0], arr2_f[0]);
            }
            default: {
                return new LinearCurveFit(arr_f, arr2_f);
            }
        }
    }

    public static CurveFit b(int[] arr_v, double[] arr_f, double[][] arr2_f) {
        return new ArcCurveFit(arr_v, arr_f, arr2_f);
    }

    public abstract double c(double arg1, int arg2);

    public abstract void d(double arg1, double[] arg2);

    public abstract void e(double arg1, float[] arg2);

    public abstract double f(double arg1, int arg2);

    public abstract void g(double arg1, double[] arg2);

    public abstract double[] h();
}

