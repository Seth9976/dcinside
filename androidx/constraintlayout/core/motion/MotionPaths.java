package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

public class MotionPaths implements Comparable {
    static final int A = 3;
    static final int B = 4;
    static final int C = 5;
    public static final int D = 1;
    public static final int E = 0;
    public static final int F = 2;
    static String[] G = null;
    public String a;
    Easing b;
    int c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;
    int l;
    String m;
    float n;
    Motion o;
    HashMap p;
    int q;
    int r;
    double[] s;
    double[] t;
    public static final String u = "MotionPaths";
    public static final boolean v = false;
    public static final boolean w = false;
    static final int x = 0;
    static final int y = 1;
    static final int z = 2;

    static {
        MotionPaths.G = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    public MotionPaths() {
        this.c = 0;
        this.j = NaNf;
        this.k = NaNf;
        this.l = -1;
        this.m = null;
        this.n = NaNf;
        this.o = null;
        this.p = new HashMap();
        this.q = 0;
        this.s = new double[18];
        this.t = new double[18];
    }

    public MotionPaths(int v, int v1, MotionKeyPosition motionKeyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        this.c = 0;
        this.j = NaNf;
        this.k = NaNf;
        this.l = -1;
        this.m = null;
        this.n = NaNf;
        this.o = null;
        this.p = new HashMap();
        this.q = 0;
        this.s = new double[18];
        this.t = new double[18];
        if(motionPaths0.m != null) {
            this.s(v, v1, motionKeyPosition0, motionPaths0, motionPaths1);
            return;
        }
        switch(motionKeyPosition0.I) {
            case 1: {
                this.r(motionKeyPosition0, motionPaths0, motionPaths1);
                return;
            }
            case 2: {
                this.t(v, v1, motionKeyPosition0, motionPaths0, motionPaths1);
                return;
            }
            default: {
                this.p(motionKeyPosition0, motionPaths0, motionPaths1);
            }
        }
    }

    private static float A(float f, float f1, float f2, float f3, float f4, float f5) {
        return (f4 - f2) * f + (f5 - f3) * f1 + f3;
    }

    public void a(MotionWidget motionWidget0) {
        this.b = Easing.c(motionWidget0.i.c);
        this.l = motionWidget0.i.d;
        this.m = motionWidget0.i.a;
        this.j = motionWidget0.i.h;
        this.c = motionWidget0.i.e;
        this.r = motionWidget0.i.b;
        this.k = motionWidget0.j.d;
        WidgetFrame widgetFrame0 = motionWidget0.h;
        if(widgetFrame0 != null) {
            ConstraintWidget constraintWidget0 = widgetFrame0.a;
            if(constraintWidget0 != null) {
                this.n = constraintWidget0.K;
            }
        }
        for(Object object0: motionWidget0.j()) {
            String s = (String)object0;
            CustomVariable customVariable0 = motionWidget0.i(s);
            if(customVariable0 != null && customVariable0.q()) {
                this.p.put(s, customVariable0);
            }
        }
    }

    public int b(MotionPaths motionPaths0) {
        return Float.compare(this.e, motionPaths0.e);
    }

    public void c(Motion motion0) {
        motion0.G(((double)this.k));
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((MotionPaths)object0));
    }

    // 去混淆评级： 低(20)
    private boolean d(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    void e(MotionPaths motionPaths0, boolean[] arr_z, String[] arr_s, boolean z) {
        boolean z1 = this.d(this.f, motionPaths0.f);
        boolean z2 = this.d(this.g, motionPaths0.g);
        boolean z3 = false;
        arr_z[0] |= this.d(this.e, motionPaths0.e);
        arr_z[1] |= z1 || z2 || z;
        boolean z4 = arr_z[2];
        if(z1 || z2 || z) {
            z3 = true;
        }
        arr_z[2] = z4 | z3;
        arr_z[3] |= this.d(this.h, motionPaths0.h);
        arr_z[4] |= this.d(this.i, motionPaths0.i);
    }

    void f(double[] arr_f, int[] arr_v) {
        float[] arr_f1 = new float[6];
        arr_f1[0] = this.e;
        arr_f1[1] = this.f;
        arr_f1[2] = this.g;
        arr_f1[3] = this.h;
        arr_f1[4] = this.i;
        arr_f1[5] = this.j;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v2 = arr_v[v];
            if(v2 < 6) {
                arr_f[v1] = (double)arr_f1[v2];
                ++v1;
            }
        }
    }

    void g(int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f = this.h;
        float f1 = this.i;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f2 = (float)arr_f[v1];
            switch(arr_v[v1]) {
                case 3: {
                    f = f2;
                    break;
                }
                case 4: {
                    f1 = f2;
                }
            }
        }
        arr_f1[v] = f;
        arr_f1[v + 1] = f1;
    }

    void h(double f, int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f1 = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f5 = (float)arr_f[v1];
            switch(arr_v[v1]) {
                case 1: {
                    f1 = f5;
                    break;
                }
                case 2: {
                    f2 = f5;
                    break;
                }
                case 3: {
                    f3 = f5;
                    break;
                }
                case 4: {
                    f4 = f5;
                }
            }
        }
        Motion motion0 = this.o;
        if(motion0 != null) {
            float[] arr_f2 = new float[2];
            motion0.r(f, arr_f2, new float[2]);
            float f6 = (float)(((double)arr_f2[1]) - ((double)f1) * Math.cos(f2) - ((double)(f4 / 2.0f)));
            f1 = (float)(((double)arr_f2[0]) + Math.sin(f2) * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f6;
        }
        arr_f1[v] = f1 + f3 / 2.0f + 0.0f;
        arr_f1[v + 1] = f2 + f4 / 2.0f + 0.0f;
    }

    void i(double f, int[] arr_v, double[] arr_f, float[] arr_f1, double[] arr_f2, float[] arr_f3) {
        float f1 = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = f3;
        float f5 = this.i;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            float f10 = (float)arr_f[v];
            float f11 = (float)arr_f2[v];
            switch(arr_v[v]) {
                case 1: {
                    f1 = f10;
                    f6 = f11;
                    break;
                }
                case 2: {
                    f2 = f10;
                    f8 = f11;
                    break;
                }
                case 3: {
                    f3 = f10;
                    f7 = f11;
                    break;
                }
                case 4: {
                    f5 = f10;
                    f9 = f11;
                }
            }
        }
        float f12 = f7 / 2.0f + f6;
        float f13 = f9 / 2.0f + f8;
        Motion motion0 = this.o;
        if(motion0 != null) {
            float[] arr_f4 = new float[2];
            float[] arr_f5 = new float[2];
            motion0.r(f, arr_f4, arr_f5);
            float f14 = (float)(((double)arr_f4[1]) - ((double)f1) * Math.cos(f2) - ((double)(f5 / 2.0f)));
            f13 = (float)(((double)arr_f5[1]) - ((double)f6) * Math.cos(f2) + Math.sin(f2) * ((double)f8));
            f12 = (float)(((double)arr_f5[0]) + Math.sin(f2) * ((double)f6) + Math.cos(f2) * ((double)f8));
            f1 = (float)(((double)arr_f4[0]) + Math.sin(f2) * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f14;
        }
        arr_f1[0] = f1 + f4 / 2.0f + 0.0f;
        arr_f1[1] = f2 + f5 / 2.0f + 0.0f;
        arr_f3[0] = f12;
        arr_f3[1] = f13;
    }

    void j(double f, int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f1 = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f5 = (float)arr_f[v1];
            switch(arr_v[v1]) {
                case 1: {
                    f1 = f5;
                    break;
                }
                case 2: {
                    f2 = f5;
                    break;
                }
                case 3: {
                    f3 = f5;
                    break;
                }
                case 4: {
                    f4 = f5;
                }
            }
        }
        Motion motion0 = this.o;
        if(motion0 != null) {
            float[] arr_f2 = new float[2];
            motion0.r(f, arr_f2, new float[2]);
            float f6 = (float)(((double)arr_f2[1]) - ((double)f1) * Math.cos(f2) - ((double)(f4 / 2.0f)));
            f1 = (float)(((double)arr_f2[0]) + Math.sin(f2) * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f6;
        }
        arr_f1[v] = f1 + f3 / 2.0f + 0.0f;
        arr_f1[v + 1] = f2 + f4 / 2.0f + 0.0f;
    }

    int k(String s, double[] arr_f, int v) {
        CustomVariable customVariable0 = (CustomVariable)this.p.get(s);
        int v1 = 0;
        if(customVariable0 == null) {
            return 0;
        }
        if(customVariable0.r() == 1) {
            arr_f[v] = (double)customVariable0.n();
            return 1;
        }
        int v2 = customVariable0.r();
        float[] arr_f1 = new float[v2];
        customVariable0.o(arr_f1);
        while(v1 < v2) {
            arr_f[v] = (double)arr_f1[v1];
            ++v1;
            ++v;
        }
        return v2;
    }

    int l(String s) {
        CustomVariable customVariable0 = (CustomVariable)this.p.get(s);
        return customVariable0 == null ? 0 : customVariable0.r();
    }

    void m(int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f = this.f;
        float f1 = this.g;
        float f2 = this.h;
        float f3 = this.i;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f4 = (float)arr_f[v1];
            switch(arr_v[v1]) {
                case 1: {
                    f = f4;
                    break;
                }
                case 2: {
                    f1 = f4;
                    break;
                }
                case 3: {
                    f2 = f4;
                    break;
                }
                case 4: {
                    f3 = f4;
                }
            }
        }
        Motion motion0 = this.o;
        if(motion0 != null) {
            double f5 = Math.sin(f1);
            f1 = (float)(((double)this.o.t()) - ((double)f) * Math.cos(f1) - ((double)(f3 / 2.0f)));
            f = (float)(((double)motion0.s()) + f5 * ((double)f) - ((double)(f2 / 2.0f)));
        }
        float f6 = f2 + f;
        float f7 = f3 + f1;
        arr_f1[v] = f + 0.0f;
        arr_f1[v + 1] = f1 + 0.0f;
        arr_f1[v + 2] = f6 + 0.0f;
        arr_f1[v + 3] = f1 + 0.0f;
        arr_f1[v + 4] = f6 + 0.0f;
        arr_f1[v + 5] = f7 + 0.0f;
        arr_f1[v + 6] = f + 0.0f;
        arr_f1[v + 7] = f7 + 0.0f;
    }

    boolean n(String s) {
        return this.p.containsKey(s);
    }

    void p(MotionKeyPosition motionKeyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)motionKeyPosition0.h) / 100.0f;
        this.d = f;
        this.c = motionKeyPosition0.B;
        this.e = this.d;
        float f1 = motionPaths1.f + motionPaths1.h / 2.0f - (motionPaths0.h / 2.0f + motionPaths0.f);
        float f2 = motionPaths1.g + motionPaths1.i / 2.0f - (motionPaths0.g + motionPaths0.i / 2.0f);
        float f3 = (motionPaths1.h - motionPaths0.h) * (Float.isNaN(motionKeyPosition0.C) ? f : motionKeyPosition0.C);
        this.f = (float)(((int)(motionPaths0.f + f1 * f - f3 / 2.0f)));
        float f4 = (motionPaths1.i - motionPaths0.i) * (Float.isNaN(motionKeyPosition0.D) ? f : motionKeyPosition0.D);
        this.g = (float)(((int)(motionPaths0.g + f2 * f - f4 / 2.0f)));
        this.h = (float)(((int)(motionPaths0.h + f3)));
        this.i = (float)(((int)(motionPaths0.i + f4)));
        float f5 = Float.isNaN(motionKeyPosition0.E) ? f : motionKeyPosition0.E;
        float f6 = 0.0f;
        float f7 = Float.isNaN(motionKeyPosition0.H) ? 0.0f : motionKeyPosition0.H;
        if(!Float.isNaN(motionKeyPosition0.F)) {
            f = motionKeyPosition0.F;
        }
        if(!Float.isNaN(motionKeyPosition0.G)) {
            f6 = motionKeyPosition0.G;
        }
        this.q = 0;
        this.f = (float)(((int)(motionPaths0.f + f5 * f1 + f6 * f2 - f3 / 2.0f)));
        this.g = (float)(((int)(motionPaths0.g + f1 * f7 + f2 * f - f4 / 2.0f)));
        this.b = Easing.c(motionKeyPosition0.z);
        this.l = motionKeyPosition0.A;
    }

    void r(MotionKeyPosition motionKeyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)motionKeyPosition0.h) / 100.0f;
        this.d = f;
        this.c = motionKeyPosition0.B;
        float f1 = Float.isNaN(motionKeyPosition0.C) ? f : motionKeyPosition0.C;
        float f2 = Float.isNaN(motionKeyPosition0.D) ? f : motionKeyPosition0.D;
        float f3 = motionPaths1.h - motionPaths0.h;
        float f4 = motionPaths1.i - motionPaths0.i;
        this.e = this.d;
        if(!Float.isNaN(motionKeyPosition0.E)) {
            f = motionKeyPosition0.E;
        }
        float f5 = motionPaths1.f + motionPaths1.h / 2.0f - (motionPaths0.h / 2.0f + motionPaths0.f);
        float f6 = motionPaths1.g + motionPaths1.i / 2.0f - (motionPaths0.i / 2.0f + motionPaths0.g);
        float f7 = f3 * f1;
        float f8 = f4 * f2;
        this.h = (float)(((int)(motionPaths0.h + f7)));
        this.i = (float)(((int)(motionPaths0.i + f8)));
        float f9 = Float.isNaN(motionKeyPosition0.F) ? 0.0f : motionKeyPosition0.F;
        this.q = 1;
        this.f = ((float)(((int)(motionPaths0.f + f5 * f - f7 / 2.0f)))) + -f6 * f9;
        this.g = ((float)(((int)(motionPaths0.g + f * f6 - f8 / 2.0f)))) + f5 * f9;
        this.m = this.m;
        this.b = Easing.c(motionKeyPosition0.z);
        this.l = motionKeyPosition0.A;
    }

    void s(int v, int v1, MotionKeyPosition motionKeyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)motionKeyPosition0.h) / 100.0f;
        this.d = f;
        this.c = motionKeyPosition0.B;
        this.q = motionKeyPosition0.I;
        float f1 = Float.isNaN(motionKeyPosition0.C) ? f : motionKeyPosition0.C;
        float f2 = Float.isNaN(motionKeyPosition0.D) ? f : motionKeyPosition0.D;
        this.e = this.d;
        this.h = (float)(((int)(motionPaths0.h + (motionPaths1.h - motionPaths0.h) * f1)));
        this.i = (float)(((int)(motionPaths0.i + (motionPaths1.i - motionPaths0.i) * f2)));
        switch(motionKeyPosition0.I) {
            case 1: {
                this.f = (Float.isNaN(motionKeyPosition0.E) ? f : motionKeyPosition0.E) * (motionPaths1.f - motionPaths0.f) + motionPaths0.f;
                if(!Float.isNaN(motionKeyPosition0.F)) {
                    f = motionKeyPosition0.F;
                }
                this.g = f * (motionPaths1.g - motionPaths0.g) + motionPaths0.g;
                break;
            }
            case 2: {
                this.f = Float.isNaN(motionKeyPosition0.E) ? (motionPaths1.f - motionPaths0.f) * f + motionPaths0.f : Math.min(f2, f1) * motionKeyPosition0.E;
                this.g = Float.isNaN(motionKeyPosition0.F) ? f * (motionPaths1.g - motionPaths0.g) + motionPaths0.g : motionKeyPosition0.F;
                break;
            }
            default: {
                this.f = (Float.isNaN(motionKeyPosition0.E) ? f : motionKeyPosition0.E) * (motionPaths1.f - motionPaths0.f) + motionPaths0.f;
                if(!Float.isNaN(motionKeyPosition0.F)) {
                    f = motionKeyPosition0.F;
                }
                this.g = f * (motionPaths1.g - motionPaths0.g) + motionPaths0.g;
            }
        }
        this.m = motionPaths0.m;
        this.b = Easing.c(motionKeyPosition0.z);
        this.l = motionKeyPosition0.A;
    }

    void t(int v, int v1, MotionKeyPosition motionKeyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)motionKeyPosition0.h) / 100.0f;
        this.d = f;
        this.c = motionKeyPosition0.B;
        this.e = this.d;
        float f1 = (motionPaths1.h - motionPaths0.h) * (Float.isNaN(motionKeyPosition0.C) ? f : motionKeyPosition0.C);
        this.f = (float)(((int)(motionPaths0.f + (motionPaths1.f + motionPaths1.h / 2.0f - (motionPaths0.h / 2.0f + motionPaths0.f)) * f - f1 / 2.0f)));
        float f2 = (motionPaths1.i - motionPaths0.i) * (Float.isNaN(motionKeyPosition0.D) ? f : motionKeyPosition0.D);
        this.g = (float)(((int)(motionPaths0.g + (motionPaths1.g + motionPaths1.i / 2.0f - (motionPaths0.g + motionPaths0.i / 2.0f)) * f - f2 / 2.0f)));
        this.h = (float)(((int)(motionPaths0.h + f1)));
        this.i = (float)(((int)(motionPaths0.i + f2)));
        this.q = 2;
        if(!Float.isNaN(motionKeyPosition0.E)) {
            this.f = (float)(((int)(motionKeyPosition0.E * ((float)(v - ((int)this.h))))));
        }
        if(!Float.isNaN(motionKeyPosition0.F)) {
            this.g = (float)(((int)(motionKeyPosition0.F * ((float)(v1 - ((int)this.i))))));
        }
        this.m = this.m;
        this.b = Easing.c(motionKeyPosition0.z);
        this.l = motionKeyPosition0.A;
    }

    void u(float f, float f1, float f2, float f3) {
        this.f = f;
        this.g = f1;
        this.h = f2;
        this.i = f3;
    }

    void v(float f, float f1, float[] arr_f, int[] arr_v, double[] arr_f1, double[] arr_f2) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            float f6 = (float)arr_f1[v];
            switch(arr_v[v]) {
                case 1: {
                    f2 = f6;
                    break;
                }
                case 2: {
                    f4 = f6;
                    break;
                }
                case 3: {
                    f3 = f6;
                    break;
                }
                case 4: {
                    f5 = f6;
                }
            }
        }
        float f7 = f2 - 0.0f * f3 / 2.0f;
        float f8 = f4 - 0.0f * f5 / 2.0f;
        arr_f[0] = f7 * (1.0f - f) + (f3 * 1.0f + f7) * f + 0.0f;
        arr_f[1] = f8 * (1.0f - f1) + (f5 * 1.0f + f8) * f1 + 0.0f;
    }

    void w(float f, MotionWidget motionWidget0, int[] arr_v, double[] arr_f, double[] arr_f1, double[] arr_f2) {
        float f1 = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        float f5 = f4;
        if(arr_v.length != 0 && this.s.length <= arr_v[arr_v.length - 1]) {
            int v = arr_v[arr_v.length - 1] + 1;
            this.s = new double[v];
            this.t = new double[v];
        }
        Arrays.fill(this.s, NaN);
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            double[] arr_f3 = this.s;
            int v2 = arr_v[v1];
            arr_f3[v2] = arr_f[v1];
            this.t[v2] = arr_f1[v1];
        }
        float f6 = NaNf;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for(int v3 = 0; true; ++v3) {
            double f11 = 0.0;
            double[] arr_f4 = this.s;
            if(v3 >= arr_f4.length) {
                break;
            }
            if(!Double.isNaN(arr_f4[v3]) || arr_f2 != null && arr_f2[v3] != 0.0) {
                if(arr_f2 != null) {
                    f11 = arr_f2[v3];
                }
                if(!Double.isNaN(this.s[v3])) {
                    f11 = this.s[v3] + f11;
                }
                float f12 = (float)this.t[v3];
                switch(v3) {
                    case 1: {
                        f7 = f12;
                        f1 = (float)f11;
                        break;
                    }
                    case 2: {
                        f8 = f12;
                        f2 = (float)f11;
                        break;
                    }
                    case 3: {
                        f9 = f12;
                        f3 = (float)f11;
                        break;
                    }
                    case 4: {
                        f10 = f12;
                        f4 = (float)f11;
                        break;
                    }
                    case 5: {
                        f6 = (float)f11;
                    }
                }
            }
        }
        Motion motion0 = this.o;
        if(motion0 != null) {
            float[] arr_f5 = new float[2];
            float[] arr_f6 = new float[2];
            motion0.r(((double)f), arr_f5, arr_f6);
            float f13 = arr_f5[0];
            double f14 = Math.sin(f2);
            float f15 = (float)(((double)arr_f5[1]) - Math.cos(f2) * ((double)f1) - ((double)(f4 / 2.0f)));
            float f16 = (float)(((double)arr_f6[0]) + Math.sin(f2) * ((double)f7) + Math.cos(f2) * ((double)f1) * ((double)f8));
            float f17 = (float)(((double)arr_f6[1]) - ((double)f7) * Math.cos(f2) + ((double)f1) * Math.sin(f2) * ((double)f8));
            if(arr_f1.length >= 2) {
                arr_f1[0] = (double)f16;
                arr_f1[1] = (double)f17;
            }
            if(!Float.isNaN(f6)) {
                motionWidget0.R(((float)(((double)f6) + Math.toDegrees(Math.atan2(f17, f16)))));
            }
            f1 = (float)(((double)f13) + f14 * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f15;
        }
        else if(!Float.isNaN(f6)) {
            motionWidget0.R(((float)(((double)f6) + Math.toDegrees(Math.atan2(f8 + f10 / 2.0f, f7 + f9 / 2.0f)))) + 0.0f);
        }
        motionWidget0.G(((int)(f1 + 0.5f)), ((int)(f2 + 0.5f)), ((int)(f1 + 0.5f + f3)), ((int)(f2 + 0.5f + f5)));
    }

    public void y(Motion motion0, MotionPaths motionPaths0) {
        double f = (double)(this.f + this.h / 2.0f - motionPaths0.f - motionPaths0.h / 2.0f);
        double f1 = (double)(this.g + this.i / 2.0f - motionPaths0.g - motionPaths0.i / 2.0f);
        this.o = motion0;
        this.f = (float)Math.hypot(f1, f);
        if(Float.isNaN(this.n)) {
            this.g = (float)(Math.atan2(f1, f) + 1.570796);
            return;
        }
        this.g = (float)Math.toRadians(this.n);
    }

    private static float z(float f, float f1, float f2, float f3, float f4, float f5) {
        return (f4 - f2) * f1 - (f5 - f3) * f + f2;
    }
}

