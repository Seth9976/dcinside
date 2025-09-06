package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.text.DecimalFormat;

public abstract class TimeCycleSplineSet {
    public static class CustomSet extends TimeCycleSplineSet {
        String p;
        CustomArray q;
        FloatArray r;
        float[] s;
        float[] t;

        public CustomSet(String s, CustomArray keyFrameArray$CustomArray0) {
            this.r = new FloatArray();
            this.p = s.split(",")[1];
            this.q = keyFrameArray$CustomArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void c(int v, float f, float f1, int v1, float f2) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void f(int v) {
            int v1 = this.q.f();
            int v2 = this.q.g(0).h();
            double[] arr_f = new double[v1];
            this.s = new float[v2 + 2];
            this.t = new float[v2];
            double[][] arr2_f = new double[v1][v2 + 2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.q.d(v3);
                CustomAttribute customAttribute0 = this.q.g(v3);
                float[] arr_f1 = this.r.g(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                customAttribute0.e(this.s);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f2 = this.s;
                    if(v5 >= arr_f2.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f2[v5];
                }
                double[] arr_f3 = arr2_f[v3];
                arr_f3[v2] = (double)arr_f1[0];
                arr_f3[v2 + 1] = (double)arr_f1[1];
            }
            this.a = CurveFit.a(v, arr_f, arr2_f);
        }

        public void g(int v, CustomAttribute customAttribute0, float f, int v1, float f1) {
            this.q.a(v, customAttribute0);
            this.r.a(v, new float[]{f, f1});
            this.b = Math.max(this.b, v1);
        }

        public boolean h(MotionWidget motionWidget0, float f, long v, KeyCache keyCache0) {
            this.a.e(((double)f), this.s);
            float[] arr_f = this.s;
            float f1 = arr_f[arr_f.length - 2];
            float f2 = arr_f[arr_f.length - 1];
            long v1 = v - this.i;
            if(Float.isNaN(this.j)) {
                float f3 = keyCache0.a(motionWidget0, this.p, 0);
                this.j = f3;
                if(Float.isNaN(f3)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float)((((double)this.j) + ((double)v1) * 1.000000E-09 * ((double)f1)) % 1.0);
            this.j = f4;
            this.i = v;
            float f5 = this.a(f4);
            this.h = false;
            for(int v2 = 0; true; ++v2) {
                float[] arr_f1 = this.t;
                if(v2 >= arr_f1.length) {
                    break;
                }
                boolean z = this.h;
                float f6 = this.s[v2];
                this.h = z | ((double)f6) != 0.0;
                arr_f1[v2] = f6 * f5 + f2;
            }
            motionWidget0.M(this.q.g(0), this.t);
            if(f1 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
        String p;
        CustomVar q;
        FloatArray r;
        float[] s;
        float[] t;

        public CustomVarSet(String s, CustomVar keyFrameArray$CustomVar0) {
            this.r = new FloatArray();
            this.p = s.split(",")[1];
            this.q = keyFrameArray$CustomVar0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void c(int v, float f, float f1, int v1, float f2) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void f(int v) {
            int v1 = this.q.f();
            int v2 = this.q.g(0).r();
            double[] arr_f = new double[v1];
            this.s = new float[v2 + 2];
            this.t = new float[v2];
            double[][] arr2_f = new double[v1][v2 + 2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.q.d(v3);
                CustomVariable customVariable0 = this.q.g(v3);
                float[] arr_f1 = this.r.g(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                customVariable0.o(this.s);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f2 = this.s;
                    if(v5 >= arr_f2.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f2[v5];
                }
                double[] arr_f3 = arr2_f[v3];
                arr_f3[v2] = (double)arr_f1[0];
                arr_f3[v2 + 1] = (double)arr_f1[1];
            }
            this.a = CurveFit.a(v, arr_f, arr2_f);
        }

        public void g(int v, CustomVariable customVariable0, float f, int v1, float f1) {
            this.q.a(v, customVariable0);
            this.r.a(v, new float[]{f, f1});
            this.b = Math.max(this.b, v1);
        }

        public boolean h(MotionWidget motionWidget0, float f, long v, KeyCache keyCache0) {
            this.a.e(((double)f), this.s);
            float[] arr_f = this.s;
            float f1 = arr_f[arr_f.length - 2];
            float f2 = arr_f[arr_f.length - 1];
            long v1 = v - this.i;
            if(Float.isNaN(this.j)) {
                float f3 = keyCache0.a(motionWidget0, this.p, 0);
                this.j = f3;
                if(Float.isNaN(f3)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float)((((double)this.j) + ((double)v1) * 1.000000E-09 * ((double)f1)) % 1.0);
            this.j = f4;
            this.i = v;
            float f5 = this.a(f4);
            this.h = false;
            for(int v2 = 0; true; ++v2) {
                float[] arr_f1 = this.t;
                if(v2 >= arr_f1.length) {
                    break;
                }
                boolean z = this.h;
                float f6 = this.s[v2];
                this.h = z | ((double)f6) != 0.0;
                arr_f1[v2] = f6 * f5 + f2;
            }
            this.q.g(0).w(motionWidget0, this.t);
            if(f1 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }
    }

    public static class Sort {
        static void a(int[] arr_v, float[][] arr2_f, int v, int v1) {
            int[] arr_v1 = new int[arr_v.length + 10];
            arr_v1[0] = v1;
            arr_v1[1] = v;
            int v2 = 2;
            while(v2 > 0) {
                int v3 = arr_v1[v2 - 1];
                int v4 = arr_v1[v2 - 2];
                if(v3 < v4) {
                    int v5 = Sort.b(arr_v, arr2_f, v3, v4);
                    arr_v1[v2 - 2] = v5 - 1;
                    arr_v1[v2 - 1] = v3;
                    int v6 = v2 + 1;
                    arr_v1[v2] = v4;
                    v2 += 2;
                    arr_v1[v6] = v5 + 1;
                }
                else {
                    v2 -= 2;
                }
            }
        }

        private static int b(int[] arr_v, float[][] arr2_f, int v, int v1) {
            int v2 = arr_v[v1];
            int v3 = v;
            while(v < v1) {
                if(arr_v[v] <= v2) {
                    Sort.c(arr_v, arr2_f, v3, v);
                    ++v3;
                }
                ++v;
            }
            Sort.c(arr_v, arr2_f, v3, v1);
            return v3;
        }

        private static void c(int[] arr_v, float[][] arr2_f, int v, int v1) {
            int v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
            float[] arr_f = arr2_f[v];
            arr2_f[v] = arr2_f[v1];
            arr2_f[v1] = arr_f;
        }
    }

    protected CurveFit a;
    protected int b;
    protected int[] c;
    protected float[][] d;
    protected int e;
    protected String f;
    protected float[] g;
    protected boolean h;
    protected long i;
    protected float j;
    private static final String k = "SplineSet";
    protected static final int l = 0;
    protected static final int m = 1;
    protected static final int n = 2;
    protected static float o = 6.283185f;

    static {
    }

    public TimeCycleSplineSet() {
        this.b = 0;
        this.c = new int[10];
        this.d = new float[10][3];
        this.g = new float[3];
        this.h = false;
        this.j = NaNf;
    }

    protected float a(float f) {
        switch(this.b) {
            case 1: {
                return Math.signum(f * TimeCycleSplineSet.o);
            }
            case 2: {
                return 1.0f - Math.abs(f);
            }
            case 3: {
                return (f * 2.0f + 1.0f) % 2.0f - 1.0f;
            }
            case 4: {
                return 1.0f - (f * 2.0f + 1.0f) % 2.0f;
            }
            case 5: {
                return (float)Math.cos(f * TimeCycleSplineSet.o);
            }
            case 6: {
                float f1 = Math.abs(f * 4.0f % 4.0f - 2.0f);
                return 1.0f - (1.0f - f1) * (1.0f - f1);
            }
            default: {
                return (float)Math.sin(f * TimeCycleSplineSet.o);
            }
        }
    }

    public CurveFit b() {
        return this.a;
    }

    public void c(int v, float f, float f1, int v1, float f2) {
        int v2 = this.e;
        this.c[v2] = v;
        float[] arr_f = this.d[v2];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        this.b = Math.max(this.b, v1);
        ++this.e;
    }

    protected void d(long v) {
        this.i = v;
    }

    public void e(String s) {
        this.f = s;
    }

    public void f(int v) {
        int v1 = this.e;
        if(v1 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        Sort.a(this.c, this.d, 0, v1 - 1);
        int v3 = 0;
        for(int v2 = 1; true; ++v2) {
            int[] arr_v = this.c;
            if(v2 >= arr_v.length) {
                break;
            }
            if(arr_v[v2] != arr_v[v2 - 1]) {
                ++v3;
            }
        }
        if(v3 == 0) {
            v3 = 1;
        }
        double[] arr_f = new double[v3];
        double[][] arr2_f = new double[v3][3];
        int v5 = 0;
        for(int v4 = 0; v4 < this.e; ++v4) {
            if(v4 <= 0 || this.c[v4] != this.c[v4 - 1]) {
                arr_f[v5] = ((double)this.c[v4]) * 0.01;
                double[] arr_f1 = arr2_f[v5];
                float[] arr_f2 = this.d[v4];
                arr_f1[0] = (double)arr_f2[0];
                arr_f1[1] = (double)arr_f2[1];
                arr_f1[2] = (double)arr_f2[2];
                ++v5;
            }
        }
        this.a = CurveFit.a(v, arr_f, arr2_f);
    }

    @Override
    public String toString() {
        String s = this.f;
        DecimalFormat decimalFormat0 = new DecimalFormat("##.##");
        for(int v = 0; v < this.e; ++v) {
            s = s + "[" + this.c[v] + " , " + decimalFormat0.format(this.d[v]) + "] ";
        }
        return s;
    }
}

