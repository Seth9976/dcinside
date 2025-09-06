package androidx.constraintlayout.motion.widget;

import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import java.util.Arrays;
import java.util.LinkedHashMap;

class MotionPaths implements Comparable {
    static final int A = 4;
    static final int B = 5;
    static final int C = 1;
    static final int D = 0;
    static final int E = 2;
    static String[] F = null;
    Easing a;
    int b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    int k;
    int l;
    float m;
    MotionController n;
    LinkedHashMap o;
    int p;
    int q;
    double[] r;
    double[] s;
    public static final String t = "MotionPaths";
    public static final boolean u = false;
    public static final boolean v = false;
    static final int w = 0;
    static final int x = 1;
    static final int y = 2;
    static final int z = 3;

    static {
        MotionPaths.F = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    MotionPaths() {
        this.b = 0;
        this.i = NaNf;
        this.j = NaNf;
        this.k = Key.f;
        this.l = Key.f;
        this.m = NaNf;
        this.n = null;
        this.o = new LinkedHashMap();
        this.p = 0;
        this.r = new double[18];
        this.s = new double[18];
    }

    MotionPaths(int v, int v1, KeyPosition keyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        this.b = 0;
        this.i = NaNf;
        this.j = NaNf;
        this.k = Key.f;
        this.l = Key.f;
        this.m = NaNf;
        this.n = null;
        this.o = new LinkedHashMap();
        this.p = 0;
        this.r = new double[18];
        this.s = new double[18];
        if(motionPaths0.l != Key.f) {
            this.t(v, v1, keyPosition0, motionPaths0, motionPaths1);
            return;
        }
        switch(keyPosition0.O) {
            case 1: {
                this.s(keyPosition0, motionPaths0, motionPaths1);
                return;
            }
            case 2: {
                this.u(v, v1, keyPosition0, motionPaths0, motionPaths1);
                return;
            }
            case 3: {
                this.p(keyPosition0, motionPaths0, motionPaths1);
                return;
            }
            default: {
                this.r(keyPosition0, motionPaths0, motionPaths1);
            }
        }
    }

    private static float A(float f, float f1, float f2, float f3, float f4, float f5) {
        return (f4 - f2) * f1 - (f5 - f3) * f + f2;
    }

    private static float B(float f, float f1, float f2, float f3, float f4, float f5) {
        return (f4 - f2) * f + (f5 - f3) * f1 + f3;
    }

    public void a(Constraint constraintSet$Constraint0) {
        this.a = Easing.c(constraintSet$Constraint0.d.d);
        this.k = constraintSet$Constraint0.d.e;
        this.l = constraintSet$Constraint0.d.b;
        this.i = constraintSet$Constraint0.d.i;
        this.b = constraintSet$Constraint0.d.f;
        this.q = constraintSet$Constraint0.d.c;
        this.j = constraintSet$Constraint0.c.e;
        this.m = constraintSet$Constraint0.e.D;
        for(Object object0: constraintSet$Constraint0.g.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)constraintSet$Constraint0.g.get(s);
            if(constraintAttribute0 != null && constraintAttribute0.n()) {
                this.o.put(s, constraintAttribute0);
            }
        }
    }

    public int b(@NonNull MotionPaths motionPaths0) {
        return Float.compare(this.d, motionPaths0.d);
    }

    public void c(MotionController motionController0) {
        motionController0.A(((double)this.j));
    }

    @Override
    public int compareTo(@NonNull Object object0) {
        return this.b(((MotionPaths)object0));
    }

    // 去混淆评级： 低(20)
    private boolean d(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    void e(MotionPaths motionPaths0, boolean[] arr_z, String[] arr_s, boolean z) {
        boolean z1 = this.d(this.e, motionPaths0.e);
        boolean z2 = this.d(this.f, motionPaths0.f);
        arr_z[0] |= this.d(this.d, motionPaths0.d);
        int v = z1 | z2 | z;
        arr_z[1] |= v;
        arr_z[2] |= v;
        arr_z[3] |= this.d(this.g, motionPaths0.g);
        arr_z[4] |= this.d(this.h, motionPaths0.h);
    }

    void f(double[] arr_f, int[] arr_v) {
        float[] arr_f1 = new float[6];
        arr_f1[0] = this.d;
        arr_f1[1] = this.e;
        arr_f1[2] = this.f;
        arr_f1[3] = this.g;
        arr_f1[4] = this.h;
        arr_f1[5] = this.i;
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
        float f = this.g;
        float f1 = this.h;
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
        float f1 = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
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
        MotionController motionController0 = this.n;
        if(motionController0 != null) {
            float[] arr_f2 = new float[2];
            motionController0.m(f, arr_f2, new float[2]);
            float f6 = (float)(((double)arr_f2[1]) - ((double)f1) * Math.cos(f2) - ((double)(f4 / 2.0f)));
            f1 = (float)(((double)arr_f2[0]) + Math.sin(f2) * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f6;
        }
        arr_f1[v] = f1 + f3 / 2.0f + 0.0f;
        arr_f1[v + 1] = f2 + f4 / 2.0f + 0.0f;
    }

    void i(double f, int[] arr_v, double[] arr_f, float[] arr_f1, double[] arr_f2, float[] arr_f3) {
        float f1 = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = f3;
        float f5 = this.h;
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
        MotionController motionController0 = this.n;
        if(motionController0 != null) {
            float[] arr_f4 = new float[2];
            float[] arr_f5 = new float[2];
            motionController0.m(f, arr_f4, arr_f5);
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
        float f1 = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
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
        MotionController motionController0 = this.n;
        if(motionController0 != null) {
            float[] arr_f2 = new float[2];
            motionController0.m(f, arr_f2, new float[2]);
            float f6 = (float)(((double)arr_f2[1]) - ((double)f1) * Math.cos(f2) - ((double)(f4 / 2.0f)));
            f1 = (float)(((double)arr_f2[0]) + Math.sin(f2) * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f6;
        }
        arr_f1[v] = f1 + f3 / 2.0f + 0.0f;
        arr_f1[v + 1] = f2 + f4 / 2.0f + 0.0f;
    }

    int k(String s, double[] arr_f, int v) {
        ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.o.get(s);
        int v1 = 0;
        if(constraintAttribute0 == null) {
            return 0;
        }
        if(constraintAttribute0.p() == 1) {
            arr_f[v] = (double)constraintAttribute0.k();
            return 1;
        }
        int v2 = constraintAttribute0.p();
        float[] arr_f1 = new float[v2];
        constraintAttribute0.l(arr_f1);
        while(v1 < v2) {
            arr_f[v] = (double)arr_f1[v1];
            ++v1;
            ++v;
        }
        return v2;
    }

    int l(String s) {
        ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.o.get(s);
        return constraintAttribute0 == null ? 0 : constraintAttribute0.p();
    }

    void m(int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f = this.e;
        float f1 = this.f;
        float f2 = this.g;
        float f3 = this.h;
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
        MotionController motionController0 = this.n;
        if(motionController0 != null) {
            double f5 = Math.sin(f1);
            f1 = (float)(((double)this.n.o()) - ((double)f) * Math.cos(f1) - ((double)(f3 / 2.0f)));
            f = (float)(((double)motionController0.n()) + f5 * ((double)f) - ((double)(f2 / 2.0f)));
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
        return this.o.containsKey(s);
    }

    void p(KeyPosition keyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)keyPosition0.a) / 100.0f;
        this.c = f;
        this.b = keyPosition0.H;
        float f1 = Float.isNaN(keyPosition0.I) ? f : keyPosition0.I;
        float f2 = Float.isNaN(keyPosition0.J) ? f : keyPosition0.J;
        float f3 = motionPaths0.g;
        float f4 = motionPaths1.g - f3;
        float f5 = motionPaths0.h;
        float f6 = motionPaths1.h - f5;
        this.d = this.c;
        float f7 = motionPaths0.e;
        float f8 = f3 / 2.0f + f7;
        float f9 = motionPaths0.f;
        float f10 = f9 + f5 / 2.0f;
        float f11 = motionPaths1.e + motionPaths1.g / 2.0f;
        float f12 = motionPaths1.f + motionPaths1.h / 2.0f;
        if(f8 > f11) {
            float f13 = f8;
            f8 = f11;
            f11 = f13;
        }
        if(f10 <= f12) {
            float f14 = f10;
            f10 = f12;
            f12 = f14;
        }
        float f15 = f11 - f8;
        float f16 = f10 - f12;
        float f17 = f4 * f1;
        this.e = (float)(((int)(f7 + f15 * f - f17 / 2.0f)));
        float f18 = f6 * f2;
        this.f = (float)(((int)(f9 + f16 * f - f18 / 2.0f)));
        this.g = (float)(((int)(f3 + f17)));
        this.h = (float)(((int)(f5 + f18)));
        float f19 = Float.isNaN(keyPosition0.K) ? f : keyPosition0.K;
        float f20 = 0.0f;
        float f21 = Float.isNaN(keyPosition0.N) ? 0.0f : keyPosition0.N;
        if(!Float.isNaN(keyPosition0.L)) {
            f = keyPosition0.L;
        }
        if(!Float.isNaN(keyPosition0.M)) {
            f20 = keyPosition0.M;
        }
        this.p = 0;
        this.e = (float)(((int)(motionPaths0.e + f19 * f15 + f20 * f16 - f17 / 2.0f)));
        this.f = (float)(((int)(motionPaths0.f + f15 * f21 + f16 * f - f18 / 2.0f)));
        this.a = Easing.c(keyPosition0.F);
        this.k = keyPosition0.G;
    }

    void r(KeyPosition keyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)keyPosition0.a) / 100.0f;
        this.c = f;
        this.b = keyPosition0.H;
        this.d = this.c;
        float f1 = motionPaths1.e + motionPaths1.g / 2.0f - (motionPaths0.g / 2.0f + motionPaths0.e);
        float f2 = motionPaths1.f + motionPaths1.h / 2.0f - (motionPaths0.f + motionPaths0.h / 2.0f);
        float f3 = (motionPaths1.g - motionPaths0.g) * (Float.isNaN(keyPosition0.I) ? f : keyPosition0.I);
        this.e = (float)(((int)(motionPaths0.e + f1 * f - f3 / 2.0f)));
        float f4 = (motionPaths1.h - motionPaths0.h) * (Float.isNaN(keyPosition0.J) ? f : keyPosition0.J);
        this.f = (float)(((int)(motionPaths0.f + f2 * f - f4 / 2.0f)));
        this.g = (float)(((int)(motionPaths0.g + f3)));
        this.h = (float)(((int)(motionPaths0.h + f4)));
        float f5 = Float.isNaN(keyPosition0.K) ? f : keyPosition0.K;
        float f6 = 0.0f;
        float f7 = Float.isNaN(keyPosition0.N) ? 0.0f : keyPosition0.N;
        if(!Float.isNaN(keyPosition0.L)) {
            f = keyPosition0.L;
        }
        if(!Float.isNaN(keyPosition0.M)) {
            f6 = keyPosition0.M;
        }
        this.p = 0;
        this.e = (float)(((int)(motionPaths0.e + f5 * f1 + f6 * f2 - f3 / 2.0f)));
        this.f = (float)(((int)(motionPaths0.f + f1 * f7 + f2 * f - f4 / 2.0f)));
        this.a = Easing.c(keyPosition0.F);
        this.k = keyPosition0.G;
    }

    void s(KeyPosition keyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)keyPosition0.a) / 100.0f;
        this.c = f;
        this.b = keyPosition0.H;
        float f1 = Float.isNaN(keyPosition0.I) ? f : keyPosition0.I;
        float f2 = Float.isNaN(keyPosition0.J) ? f : keyPosition0.J;
        float f3 = motionPaths1.g - motionPaths0.g;
        float f4 = motionPaths1.h - motionPaths0.h;
        this.d = this.c;
        if(!Float.isNaN(keyPosition0.K)) {
            f = keyPosition0.K;
        }
        float f5 = motionPaths1.e + motionPaths1.g / 2.0f - (motionPaths0.g / 2.0f + motionPaths0.e);
        float f6 = motionPaths1.f + motionPaths1.h / 2.0f - (motionPaths0.h / 2.0f + motionPaths0.f);
        float f7 = f3 * f1;
        float f8 = f4 * f2;
        this.g = (float)(((int)(motionPaths0.g + f7)));
        this.h = (float)(((int)(motionPaths0.h + f8)));
        float f9 = Float.isNaN(keyPosition0.L) ? 0.0f : keyPosition0.L;
        this.p = 1;
        this.e = ((float)(((int)(motionPaths0.e + f5 * f - f7 / 2.0f)))) + -f6 * f9;
        this.f = ((float)(((int)(motionPaths0.f + f * f6 - f8 / 2.0f)))) + f5 * f9;
        this.l = this.l;
        this.a = Easing.c(keyPosition0.F);
        this.k = keyPosition0.G;
    }

    void t(int v, int v1, KeyPosition keyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)keyPosition0.a) / 100.0f;
        this.c = f;
        this.b = keyPosition0.H;
        this.p = keyPosition0.O;
        float f1 = Float.isNaN(keyPosition0.I) ? f : keyPosition0.I;
        float f2 = Float.isNaN(keyPosition0.J) ? f : keyPosition0.J;
        this.d = this.c;
        this.g = (float)(((int)(motionPaths0.g + (motionPaths1.g - motionPaths0.g) * f1)));
        this.h = (float)(((int)(motionPaths0.h + (motionPaths1.h - motionPaths0.h) * f2)));
        if(keyPosition0.O == 2) {
            this.e = Float.isNaN(keyPosition0.K) ? (motionPaths1.e - motionPaths0.e) * f + motionPaths0.e : Math.min(f2, f1) * keyPosition0.K;
            this.f = Float.isNaN(keyPosition0.L) ? f * (motionPaths1.f - motionPaths0.f) + motionPaths0.f : keyPosition0.L;
        }
        else {
            this.e = (Float.isNaN(keyPosition0.K) ? f : keyPosition0.K) * (motionPaths1.e - motionPaths0.e) + motionPaths0.e;
            if(!Float.isNaN(keyPosition0.L)) {
                f = keyPosition0.L;
            }
            this.f = f * (motionPaths1.f - motionPaths0.f) + motionPaths0.f;
        }
        this.l = motionPaths0.l;
        this.a = Easing.c(keyPosition0.F);
        this.k = keyPosition0.G;
    }

    void u(int v, int v1, KeyPosition keyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        float f = ((float)keyPosition0.a) / 100.0f;
        this.c = f;
        this.b = keyPosition0.H;
        this.d = this.c;
        float f1 = (motionPaths1.g - motionPaths0.g) * (Float.isNaN(keyPosition0.I) ? f : keyPosition0.I);
        this.e = (float)(((int)(motionPaths0.e + (motionPaths1.e + motionPaths1.g / 2.0f - (motionPaths0.g / 2.0f + motionPaths0.e)) * f - f1 / 2.0f)));
        float f2 = (motionPaths1.h - motionPaths0.h) * (Float.isNaN(keyPosition0.J) ? f : keyPosition0.J);
        this.f = (float)(((int)(motionPaths0.f + (motionPaths1.f + motionPaths1.h / 2.0f - (motionPaths0.f + motionPaths0.h / 2.0f)) * f - f2 / 2.0f)));
        this.g = (float)(((int)(motionPaths0.g + f1)));
        this.h = (float)(((int)(motionPaths0.h + f2)));
        this.p = 2;
        if(!Float.isNaN(keyPosition0.K)) {
            this.e = (float)(((int)(keyPosition0.K * ((float)(v - ((int)this.g))))));
        }
        if(!Float.isNaN(keyPosition0.L)) {
            this.f = (float)(((int)(keyPosition0.L * ((float)(v1 - ((int)this.h))))));
        }
        this.l = this.l;
        this.a = Easing.c(keyPosition0.F);
        this.k = keyPosition0.G;
    }

    void v(float f, float f1, float f2, float f3) {
        this.e = f;
        this.f = f1;
        this.g = f2;
        this.h = f3;
    }

    void w(float f, float f1, float[] arr_f, int[] arr_v, double[] arr_f1, double[] arr_f2) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            float f6 = (float)arr_f1[v];
            double f7 = arr_f2[v];
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
        float f8 = f2 - 0.0f * f3 / 2.0f;
        float f9 = f4 - 0.0f * f5 / 2.0f;
        arr_f[0] = f8 * (1.0f - f) + (f3 * 1.0f + f8) * f + 0.0f;
        arr_f[1] = f9 * (1.0f - f1) + (f5 * 1.0f + f9) * f1 + 0.0f;
    }

    void y(float f, View view0, int[] arr_v, double[] arr_f, double[] arr_f1, double[] arr_f2, boolean z) {
        float f1 = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = f4;
        if(arr_v.length != 0 && this.r.length <= arr_v[arr_v.length - 1]) {
            int v = arr_v[arr_v.length - 1] + 1;
            this.r = new double[v];
            this.s = new double[v];
        }
        Arrays.fill(this.r, NaN);
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            double[] arr_f3 = this.r;
            int v2 = arr_v[v1];
            arr_f3[v2] = arr_f[v1];
            this.s[v2] = arr_f1[v1];
        }
        float f6 = NaNf;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for(int v3 = 0; true; ++v3) {
            double f11 = 0.0;
            double[] arr_f4 = this.r;
            if(v3 >= arr_f4.length) {
                break;
            }
            if(!Double.isNaN(arr_f4[v3]) || arr_f2 != null && arr_f2[v3] != 0.0) {
                if(arr_f2 != null) {
                    f11 = arr_f2[v3];
                }
                if(!Double.isNaN(this.r[v3])) {
                    f11 = this.r[v3] + f11;
                }
                float f12 = (float)this.s[v3];
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
        MotionController motionController0 = this.n;
        if(motionController0 != null) {
            float[] arr_f5 = new float[2];
            float[] arr_f6 = new float[2];
            motionController0.m(((double)f), arr_f5, arr_f6);
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
                view0.setRotation(((float)(((double)f6) + Math.toDegrees(Math.atan2(f17, f16)))));
            }
            f1 = (float)(((double)f13) + f14 * ((double)f1) - ((double)(f3 / 2.0f)));
            f2 = f15;
        }
        else if(!Float.isNaN(f6)) {
            view0.setRotation(f6 + ((float)Math.toDegrees(Math.atan2(f8 + f10 / 2.0f, f7 + f9 / 2.0f))) + 0.0f);
        }
        if(view0 instanceof FloatLayout) {
            ((FloatLayout)view0).a(f1, f2, f3 + f1, f2 + f5);
            return;
        }
        int v4 = (int)(f1 + 0.5f + f3);
        int v5 = (int)(f2 + 0.5f + f5);
        int v6 = v4 - ((int)(f1 + 0.5f));
        int v7 = v5 - ((int)(f2 + 0.5f));
        if(v6 != view0.getMeasuredWidth() || v7 != view0.getMeasuredHeight() || z) {
            view0.measure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x40000000));
        }
        view0.layout(((int)(f1 + 0.5f)), ((int)(f2 + 0.5f)), v4, v5);
    }

    public void z(MotionController motionController0, MotionPaths motionPaths0) {
        double f = (double)(this.e + this.g / 2.0f - motionPaths0.e - motionPaths0.g / 2.0f);
        double f1 = (double)(this.f + this.h / 2.0f - motionPaths0.f - motionPaths0.h / 2.0f);
        this.n = motionController0;
        this.e = (float)Math.hypot(f1, f);
        if(Float.isNaN(this.m)) {
            this.f = (float)(Math.atan2(f1, f) + 1.570796);
            return;
        }
        this.f = (float)Math.toRadians(this.m);
    }
}

