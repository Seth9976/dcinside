package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class SplineSet {
    static class CoreSpline extends SplineSet {
        String g;
        long h;

        CoreSpline(String s, long v) {
            this.g = s;
            this.h = v;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void h(TypedValues typedValues0, float f) {
            typedValues0.b(typedValues0.e(this.g), this.a(f));
        }
    }

    public static class CustomSet extends SplineSet {
        String g;
        CustomArray h;
        float[] i;

        public CustomSet(String s, CustomArray keyFrameArray$CustomArray0) {
            this.g = s.split(",")[1];
            this.h = keyFrameArray$CustomArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void g(int v, float f) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void j(int v) {
            int v1 = this.h.f();
            int v2 = this.h.g(0).h();
            double[] arr_f = new double[v1];
            this.i = new float[v2];
            double[][] arr2_f = new double[v1][v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.h.d(v3);
                CustomAttribute customAttribute0 = this.h.g(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                customAttribute0.e(this.i);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f1 = this.i;
                    if(v5 >= arr_f1.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f1[v5];
                }
            }
            this.a = CurveFit.a(v, arr_f, arr2_f);
        }

        public void k(int v, CustomAttribute customAttribute0) {
            this.h.a(v, customAttribute0);
        }

        public void l(WidgetFrame widgetFrame0, float f) {
            this.a.e(((double)f), this.i);
            widgetFrame0.B(this.h.g(0), this.i);
        }
    }

    public static class CustomSpline extends SplineSet {
        String g;
        CustomVar h;
        float[] i;

        public CustomSpline(String s, CustomVar keyFrameArray$CustomVar0) {
            this.g = s.split(",")[1];
            this.h = keyFrameArray$CustomVar0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void g(int v, float f) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void h(TypedValues typedValues0, float f) {
            this.l(((MotionWidget)typedValues0), f);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void j(int v) {
            int v1 = this.h.f();
            int v2 = this.h.g(0).r();
            double[] arr_f = new double[v1];
            this.i = new float[v2];
            double[][] arr2_f = new double[v1][v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.h.d(v3);
                CustomVariable customVariable0 = this.h.g(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                customVariable0.o(this.i);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f1 = this.i;
                    if(v5 >= arr_f1.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f1[v5];
                }
            }
            this.a = CurveFit.a(v, arr_f, arr2_f);
        }

        public void k(int v, CustomVariable customVariable0) {
            this.h.a(v, customVariable0);
        }

        public void l(MotionWidget motionWidget0, float f) {
            this.a.e(((double)f), this.i);
            this.h.g(0).w(motionWidget0, this.i);
        }
    }

    static class Sort {
        static void a(int[] arr_v, float[] arr_f, int v, int v1) {
            int[] arr_v1 = new int[arr_v.length + 10];
            arr_v1[0] = v1;
            arr_v1[1] = v;
            int v2 = 2;
            while(v2 > 0) {
                int v3 = arr_v1[v2 - 1];
                int v4 = arr_v1[v2 - 2];
                if(v3 < v4) {
                    int v5 = Sort.b(arr_v, arr_f, v3, v4);
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

        private static int b(int[] arr_v, float[] arr_f, int v, int v1) {
            int v2 = arr_v[v1];
            int v3 = v;
            while(v < v1) {
                if(arr_v[v] <= v2) {
                    Sort.c(arr_v, arr_f, v3, v);
                    ++v3;
                }
                ++v;
            }
            Sort.c(arr_v, arr_f, v3, v1);
            return v3;
        }

        private static void c(int[] arr_v, float[] arr_f, int v, int v1) {
            int v2 = arr_v[v];
            arr_v[v] = arr_v[v1];
            arr_v[v1] = v2;
            float f = arr_f[v];
            arr_f[v] = arr_f[v1];
            arr_f[v1] = f;
        }
    }

    protected CurveFit a;
    protected int[] b;
    protected float[] c;
    private int d;
    private String e;
    private static final String f = "SplineSet";

    public SplineSet() {
        this.b = new int[10];
        this.c = new float[10];
    }

    public float a(float f) {
        return (float)this.a.c(((double)f), 0);
    }

    public CurveFit b() {
        return this.a;
    }

    public float c(float f) {
        return (float)this.a.f(((double)f), 0);
    }

    public static SplineSet d(String s, CustomArray keyFrameArray$CustomArray0) {
        return new CustomSet(s, keyFrameArray$CustomArray0);
    }

    public static SplineSet e(String s, CustomVar keyFrameArray$CustomVar0) {
        return new CustomSpline(s, keyFrameArray$CustomVar0);
    }

    public static SplineSet f(String s, long v) {
        return new CoreSpline(s, v);
    }

    public void g(int v, float f) {
        int[] arr_v = this.b;
        if(arr_v.length < this.d + 1) {
            this.b = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.c = Arrays.copyOf(this.c, this.c.length * 2);
        }
        int v1 = this.d;
        this.b[v1] = v;
        this.c[v1] = f;
        this.d = v1 + 1;
    }

    public void h(TypedValues typedValues0, float f) {
        typedValues0.b(a.a(this.e), this.a(f));
    }

    public void i(String s) {
        this.e = s;
    }

    public void j(int v) {
        int v1 = this.d;
        if(v1 == 0) {
            return;
        }
        Sort.a(this.b, this.c, 0, v1 - 1);
        int v3 = 1;
        for(int v2 = 1; v2 < this.d; ++v2) {
            if(this.b[v2 - 1] != this.b[v2]) {
                ++v3;
            }
        }
        double[] arr_f = new double[v3];
        double[][] arr2_f = new double[v3][1];
        int v5 = 0;
        for(int v4 = 0; v4 < this.d; ++v4) {
            if(v4 <= 0 || this.b[v4] != this.b[v4 - 1]) {
                arr_f[v5] = ((double)this.b[v4]) * 0.01;
                arr2_f[v5][0] = (double)this.c[v4];
                ++v5;
            }
        }
        this.a = CurveFit.a(v, arr_f, arr2_f);
    }

    @Override
    public String toString() {
        String s = this.e;
        DecimalFormat decimalFormat0 = new DecimalFormat("##.##");
        for(int v = 0; v < this.d; ++v) {
            s = s + "[" + this.b[v] + " , " + decimalFormat0.format(((double)this.c[v])) + "] ";
        }
        return s;
    }
}

