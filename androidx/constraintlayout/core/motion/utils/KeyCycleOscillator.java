package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class KeyCycleOscillator {
    static class CoreSpline extends KeyCycleOscillator {
        String i;
        int j;

        CoreSpline(String s) {
            this.i = s;
            this.j = c.a(s);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void h(MotionWidget motionWidget0, float f) {
            motionWidget0.b(this.j, this.a(f));
        }
    }

    static class CycleOscillator {
        private final int a;
        Oscillator b;
        private final int c;
        private final int d;
        private final int e;
        float[] f;
        double[] g;
        float[] h;
        float[] i;
        float[] j;
        float[] k;
        int l;
        CurveFit m;
        double[] n;
        double[] o;
        float p;
        static final int q = -1;
        private static final String r = "CycleOscillator";

        CycleOscillator(int v, String s, int v1, int v2) {
            Oscillator oscillator0 = new Oscillator();
            this.b = oscillator0;
            this.c = 0;
            this.d = 1;
            this.e = 2;
            this.l = v;
            this.a = v1;
            oscillator0.g(v, s);
            this.f = new float[v2];
            this.g = new double[v2];
            this.h = new float[v2];
            this.i = new float[v2];
            this.j = new float[v2];
            this.k = new float[v2];
        }

        public double a() {
            return this.n[1];
        }

        public double b(float f) {
            CurveFit curveFit0 = this.m;
            if(curveFit0 == null) {
                double[] arr_f = this.o;
                arr_f[0] = 0.0;
                arr_f[1] = 0.0;
                arr_f[2] = 0.0;
            }
            else {
                curveFit0.g(((double)f), this.o);
                this.m.d(((double)f), this.n);
            }
            double f1 = this.b.e(((double)f), this.n[1]);
            double f2 = this.b.d(((double)f), this.n[1], this.o[1]);
            return this.o[0] + f1 * this.o[2] + f2 * this.n[2];
        }

        public double c(float f) {
            CurveFit curveFit0 = this.m;
            if(curveFit0 != null) {
                curveFit0.d(((double)f), this.n);
                return this.n[0] + this.b.e(((double)f), this.n[1]) * this.n[2];
            }
            double[] arr_f = this.n;
            arr_f[0] = (double)this.i[0];
            arr_f[1] = (double)this.j[0];
            arr_f[2] = (double)this.f[0];
            return this.n[0] + this.b.e(((double)f), this.n[1]) * this.n[2];
        }

        public void d(int v, int v1, float f, float f1, float f2, float f3) {
            this.g[v] = ((double)v1) / 100.0;
            this.h[v] = f;
            this.i[v] = f1;
            this.j[v] = f2;
            this.f[v] = f3;
        }

        public void e(float f) {
            this.p = f;
            double[][] arr2_f = new double[this.g.length][3];
            float[] arr_f = this.f;
            this.n = new double[arr_f.length + 2];
            this.o = new double[arr_f.length + 2];
            if(this.g[0] > 0.0) {
                this.b.a(0.0, this.h[0]);
            }
            int v = this.g.length - 1;
            if(this.g[v] < 1.0) {
                this.b.a(1.0, this.h[v]);
            }
            for(int v1 = 0; v1 < arr2_f.length; ++v1) {
                double[] arr_f1 = arr2_f[v1];
                arr_f1[0] = (double)this.i[v1];
                arr_f1[1] = (double)this.j[v1];
                arr_f1[2] = (double)this.f[v1];
                this.b.a(this.g[v1], this.h[v1]);
            }
            this.b.f();
            double[] arr_f2 = this.g;
            if(arr_f2.length > 1) {
                this.m = CurveFit.a(0, arr_f2, arr2_f);
                return;
            }
            this.m = null;
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        String i;
        int j;

        public PathRotateSet(String s) {
            this.i = s;
            this.j = c.a(s);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void h(MotionWidget motionWidget0, float f) {
            motionWidget0.b(this.j, this.a(f));
        }

        public void l(MotionWidget motionWidget0, float f, double f1, double f2) {
            motionWidget0.R(this.a(f) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
        }
    }

    static class WavePoint {
        int a;
        float b;
        float c;
        float d;
        float e;

        WavePoint(int v, float f, float f1, float f2, float f3) {
            this.a = v;
            this.b = f3;
            this.c = f1;
            this.d = f;
            this.e = f2;
        }
    }

    private CurveFit a;
    private CycleOscillator b;
    private String c;
    private int d;
    private String e;
    public int f;
    ArrayList g;
    private static final String h = "KeyCycleOscillator";

    public KeyCycleOscillator() {
        this.d = 0;
        this.e = null;
        this.f = 0;
        this.g = new ArrayList();
    }

    public float a(float f) {
        return (float)this.b.c(f);
    }

    public CurveFit b() {
        return this.a;
    }

    public float c(float f) {
        return (float)this.b.b(f);
    }

    public static KeyCycleOscillator d(String s) {
        return s.equals("pathRotate") ? new PathRotateSet(s) : new CoreSpline(s);
    }

    protected void e(Object object0) {
    }

    public void f(int v, int v1, String s, int v2, float f, float f1, float f2, float f3) {
        this.g.add(new WavePoint(v, f, f1, f2, f3));
        if(v2 != -1) {
            this.f = v2;
        }
        this.d = v1;
        this.e = s;
    }

    public void g(int v, int v1, String s, int v2, float f, float f1, float f2, float f3, Object object0) {
        this.g.add(new WavePoint(v, f, f1, f2, f3));
        if(v2 != -1) {
            this.f = v2;
        }
        this.d = v1;
        this.e(object0);
        this.e = s;
    }

    public void h(MotionWidget motionWidget0, float f) {
    }

    public void i(String s) {
        this.c = s;
    }

    public void j(float f) {
        int v = this.g.size();
        if(v == 0) {
            return;
        }
        Collections.sort(this.g, new Comparator() {
            final KeyCycleOscillator a;

            public int b(WavePoint keyCycleOscillator$WavePoint0, WavePoint keyCycleOscillator$WavePoint1) {
                return Integer.compare(keyCycleOscillator$WavePoint0.a, keyCycleOscillator$WavePoint1.a);
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((WavePoint)object0), ((WavePoint)object1));
            }
        });
        double[] arr_f = new double[v];
        double[][] arr2_f = new double[v][3];
        this.b = new CycleOscillator(this.d, this.e, this.f, v);
        int v1 = 0;
        for(Object object0: this.g) {
            float f1 = ((WavePoint)object0).d;
            arr_f[v1] = ((double)f1) * 0.01;
            double[] arr_f1 = arr2_f[v1];
            float f2 = ((WavePoint)object0).b;
            arr_f1[0] = (double)f2;
            float f3 = ((WavePoint)object0).c;
            arr_f1[1] = (double)f3;
            float f4 = ((WavePoint)object0).e;
            arr_f1[2] = (double)f4;
            this.b.d(v1, ((WavePoint)object0).a, f1, f3, f4, f2);
            ++v1;
        }
        this.b.e(f);
        this.a = CurveFit.a(0, arr_f, arr2_f);
    }

    public boolean k() {
        return this.f == 1;
    }

    @Override
    public String toString() {
        String s = this.c;
        DecimalFormat decimalFormat0 = new DecimalFormat("##.##");
        for(Object object0: this.g) {
            s = s + "[" + ((WavePoint)object0).a + " , " + decimalFormat0.format(((double)((WavePoint)object0).b)) + "] ";
        }
        return s;
    }
}

