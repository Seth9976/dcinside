package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

public class StepCurve extends Easing {
    MonotonicCurveFit p;
    private static final boolean q = false;

    StepCurve(String s) {
        this.a = s;
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
        this.p = StepCurve.e(Arrays.copyOf(arr_f, v2 + 1));
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double a(double f) {
        return this.p.c(f, 0);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.Easing
    public double b(double f) {
        return this.p.f(f, 0);
    }

    private static MonotonicCurveFit d(String s) {
        String[] arr_s = s.split("\\s+");
        double[] arr_f = new double[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            arr_f[v] = Double.parseDouble(arr_s[v]);
        }
        return StepCurve.e(arr_f);
    }

    private static MonotonicCurveFit e(double[] arr_f) {
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
        MonotonicCurveFit monotonicCurveFit0 = new MonotonicCurveFit(arr_f1, arr2_f);
        PrintStream printStream0 = System.out;
        printStream0.println(" 0 " + monotonicCurveFit0.c(0.0, 0));
        printStream0.println(" 1 " + monotonicCurveFit0.c(1.0, 0));
        return monotonicCurveFit0;
    }
}

