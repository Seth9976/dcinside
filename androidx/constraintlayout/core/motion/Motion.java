package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Motion implements TypedValues {
    private String[] A;
    private int[] B;
    private int C;
    private float[] D;
    private ArrayList E;
    private float[] F;
    private ArrayList G;
    private HashMap H;
    private HashMap I;
    private HashMap J;
    private MotionKeyTrigger[] K;
    private int L;
    private int M;
    private MotionWidget N;
    private int O;
    private float P;
    private DifferentialInterpolator Q;
    private boolean R;
    Motion S;
    String[] T;
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int Z = 5;
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    public static final int d0 = 3;
    public static final int e0 = 4;
    public static final int f0 = 5;
    public static final int g0 = 6;
    Rect h;
    public static final int h0 = 1;
    MotionWidget i;
    public static final int i0 = 2;
    public String j;
    private static final String j0 = "MotionController";
    String k;
    private static final boolean k0 = false;
    private int l;
    private static final boolean l0 = false;
    private MotionPaths m;
    static final int m0 = 0;
    private MotionPaths n;
    static final int n0 = 1;
    private MotionConstrainedPoint o;
    static final int o0 = 2;
    private MotionConstrainedPoint p;
    static final int p0 = 3;
    private CurveFit[] q;
    static final int q0 = 4;
    private CurveFit r;
    static final int r0 = 5;
    float s;
    private static final int s0 = -1;
    float t;
    private static final int t0 = -2;
    float u;
    private static final int u0 = -3;
    float v;
    float w;
    private int[] x;
    private double[] y;
    private double[] z;

    public Motion(MotionWidget motionWidget0) {
        this.h = new Rect();
        this.l = 0;
        this.m = new MotionPaths();
        this.n = new MotionPaths();
        this.o = new MotionConstrainedPoint();
        this.p = new MotionConstrainedPoint();
        this.s = NaNf;
        this.t = 0.0f;
        this.u = 1.0f;
        this.C = 4;
        this.D = new float[4];
        this.E = new ArrayList();
        this.F = new float[1];
        this.G = new ArrayList();
        this.L = -1;
        this.M = -1;
        this.N = null;
        this.O = -1;
        this.P = NaNf;
        this.Q = null;
        this.R = false;
        this.g0(motionWidget0);
    }

    private static DifferentialInterpolator A(int v, String s, int v1) {
        return v != -1 ? null : new DifferentialInterpolator() {
            float a;

            @Override  // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float a() {
                return (float)Easing.c(s).b(((double)this.a));
            }

            @Override  // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f) {
                this.a = f;
                return (float)Easing.c(s).a(((double)f));
            }
        };
    }

    public MotionPaths B(int v) {
        return (MotionPaths)this.E.get(v);
    }

    public int C(int v, int[] arr_v) {
        float[] arr_f = new float[2];
        int v1 = 0;
        int v2 = 0;
        for(Object object0: this.G) {
            MotionKey motionKey0 = (MotionKey)object0;
            int v3 = motionKey0.k;
            if(v3 == v || v != -1) {
                arr_v[v2] = 0;
                arr_v[v2 + 1] = v3;
                int v4 = motionKey0.h;
                arr_v[v2 + 2] = v4;
                double f = (double)(((float)v4) / 100.0f);
                this.q[0].d(f, this.y);
                this.m.h(f, this.x, this.y, arr_f, 0);
                arr_v[v2 + 3] = Float.floatToIntBits(arr_f[0]);
                int v5 = v2 + 4;
                arr_v[v5] = Float.floatToIntBits(arr_f[1]);
                if(motionKey0 instanceof MotionKeyPosition) {
                    arr_v[v2 + 5] = ((MotionKeyPosition)motionKey0).I;
                    arr_v[v2 + 6] = Float.floatToIntBits(((MotionKeyPosition)motionKey0).E);
                    v5 = v2 + 7;
                    arr_v[v5] = Float.floatToIntBits(((MotionKeyPosition)motionKey0).F);
                }
                arr_v[v2] = v5 + 1 - v2;
                ++v1;
                v2 = v5 + 1;
            }
        }
        return v1;
    }

    float D(int v, float f, float f1) {
        float f2 = this.n.f - this.m.f;
        float f3 = this.n.g - this.m.g;
        float f4 = this.m.f + this.m.h / 2.0f;
        float f5 = this.m.g + this.m.i / 2.0f;
        float f6 = (float)Math.hypot(f2, f3);
        if(((double)f6) < 1.000000E-07) {
            return NaNf;
        }
        float f7 = f - f4;
        float f8 = f1 - f5;
        if(((float)Math.hypot(f7, f8)) == 0.0f) {
            return 0.0f;
        }
        float f9 = f7 * f2 + f8 * f3;
        switch(v) {
            case 0: {
                return f9 / f6;
            }
            case 1: {
                return (float)Math.sqrt(f6 * f6 - f9 * f9);
            }
            case 2: {
                return f7 / f2;
            }
            case 3: {
                return f8 / f2;
            }
            case 4: {
                return f7 / f3;
            }
            case 5: {
                return f8 / f3;
            }
            default: {
                return 0.0f;
            }
        }
    }

    public int E(int[] arr_v, float[] arr_f) {
        int v = 0;
        int v1 = 0;
        for(Object object0: this.G) {
            int v2 = ((MotionKey)object0).h;
            arr_v[v] = ((MotionKey)object0).k * 1000 + v2;
            double f = (double)(((float)v2) / 100.0f);
            this.q[0].d(f, this.y);
            this.m.h(f, this.x, this.y, arr_f, v1);
            v1 += 2;
            ++v;
        }
        return v;
    }

    public float F() {
        return this.s;
    }

    double[] G(double f) {
        this.q[0].d(f, this.y);
        CurveFit curveFit0 = this.r;
        if(curveFit0 != null) {
            double[] arr_f = this.y;
            if(arr_f.length > 0) {
                curveFit0.d(f, arr_f);
            }
        }
        return this.y;
    }

    MotionKeyPosition H(int v, int v1, float f, float f1) {
        FloatRect floatRect0 = new FloatRect();
        floatRect0.b = this.m.f;
        floatRect0.d = this.m.g;
        floatRect0.c = this.m.f + this.m.h;
        floatRect0.a = this.m.g + this.m.i;
        FloatRect floatRect1 = new FloatRect();
        floatRect1.b = this.n.f;
        floatRect1.d = this.n.g;
        floatRect1.c = this.n.f + this.n.h;
        floatRect1.a = this.n.g + this.n.i;
        for(Object object0: this.G) {
            MotionKey motionKey0 = (MotionKey)object0;
            if(motionKey0 instanceof MotionKeyPosition && ((MotionKeyPosition)motionKey0).B(v, v1, floatRect0, floatRect1, f, f1)) {
                return (MotionKeyPosition)motionKey0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    void I(float f, int v, int v1, float f1, float f2, float[] arr_f) {
        double[] arr_f2;
        float f3 = this.o(f, this.F);
        KeyCycleOscillator keyCycleOscillator0 = null;
        SplineSet splineSet0 = this.I == null ? null : ((SplineSet)this.I.get("translationX"));
        SplineSet splineSet1 = this.I == null ? null : ((SplineSet)this.I.get("translationY"));
        SplineSet splineSet2 = this.I == null ? null : ((SplineSet)this.I.get("rotationZ"));
        SplineSet splineSet3 = this.I == null ? null : ((SplineSet)this.I.get("scaleX"));
        SplineSet splineSet4 = this.I == null ? null : ((SplineSet)this.I.get("scaleY"));
        KeyCycleOscillator keyCycleOscillator1 = this.J == null ? null : ((KeyCycleOscillator)this.J.get("translationX"));
        KeyCycleOscillator keyCycleOscillator2 = this.J == null ? null : ((KeyCycleOscillator)this.J.get("translationY"));
        KeyCycleOscillator keyCycleOscillator3 = this.J == null ? null : ((KeyCycleOscillator)this.J.get("rotationZ"));
        KeyCycleOscillator keyCycleOscillator4 = this.J == null ? null : ((KeyCycleOscillator)this.J.get("scaleX"));
        HashMap hashMap0 = this.J;
        if(hashMap0 != null) {
            keyCycleOscillator0 = (KeyCycleOscillator)hashMap0.get("scaleY");
        }
        VelocityMatrix velocityMatrix0 = new VelocityMatrix();
        velocityMatrix0.b();
        velocityMatrix0.d(splineSet2, f3);
        velocityMatrix0.h(splineSet0, splineSet1, f3);
        velocityMatrix0.f(splineSet3, splineSet4, f3);
        velocityMatrix0.c(keyCycleOscillator3, f3);
        velocityMatrix0.g(keyCycleOscillator1, keyCycleOscillator2, f3);
        velocityMatrix0.e(keyCycleOscillator4, keyCycleOscillator0, f3);
        CurveFit curveFit0 = this.r;
        if(curveFit0 != null) {
            double[] arr_f1 = this.y;
            if(arr_f1.length > 0) {
                curveFit0.d(((double)f3), arr_f1);
                this.r.g(((double)f3), this.z);
                this.m.v(f1, f2, arr_f, this.x, this.z, this.y);
            }
            velocityMatrix0.a(f1, f2, v, v1, arr_f);
            return;
        }
        if(this.q != null) {
            float f4 = this.o(f3, this.F);
            this.q[0].g(((double)f4), this.z);
            this.q[0].d(((double)f4), this.y);
            float f5 = this.F[0];
            for(int v2 = 0; true; ++v2) {
                arr_f2 = this.z;
                if(v2 >= arr_f2.length) {
                    break;
                }
                arr_f2[v2] *= (double)f5;
            }
            this.m.v(f1, f2, arr_f, this.x, arr_f2, this.y);
            velocityMatrix0.a(f1, f2, v, v1, arr_f);
            return;
        }
        float f6 = this.n.f - this.m.f;
        float f7 = this.n.g - this.m.g;
        float f8 = this.n.i - this.m.i + f7;
        arr_f[0] = f6 * (1.0f - f1) + (this.n.h - this.m.h + f6) * f1;
        arr_f[1] = f7 * (1.0f - f2) + f8 * f2;
        velocityMatrix0.b();
        velocityMatrix0.d(splineSet2, f3);
        velocityMatrix0.h(splineSet0, splineSet1, f3);
        velocityMatrix0.f(splineSet3, splineSet4, f3);
        velocityMatrix0.c(keyCycleOscillator3, f3);
        velocityMatrix0.g(keyCycleOscillator1, keyCycleOscillator2, f3);
        velocityMatrix0.e(keyCycleOscillator4, keyCycleOscillator0, f3);
        velocityMatrix0.a(f1, f2, v, v1, arr_f);
    }

    private float J() {
        float[] arr_f = new float[2];
        double f = 0.0;
        float f2 = 0.0f;
        int v = 0;
        for(double f1 = 0.0; v < 100; f1 = (double)arr_f[1]) {
            float f3 = ((float)v) * 0.010101f;
            double f4 = (double)f3;
            Easing easing0 = this.m.b;
            float f5 = NaNf;
            float f6 = 0.0f;
            for(Object object0: this.E) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.b;
                if(easing1 != null) {
                    float f7 = motionPaths0.d;
                    if(f7 < f3) {
                        easing0 = easing1;
                        f6 = f7;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.d;
                    }
                }
            }
            if(easing0 != null) {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f4 = (double)(((float)easing0.a(((double)((f3 - f6) / (f5 - f6))))) * (f5 - f6) + f6);
            }
            this.q[0].d(f4, this.y);
            this.m.h(f4, this.x, this.y, arr_f, 0);
            if(v > 0) {
                f2 += (float)Math.hypot(f1 - ((double)arr_f[1]), f - ((double)arr_f[0]));
            }
            f = (double)arr_f[0];
            ++v;
        }
        return f2;
    }

    public float K() {
        return this.m.i;
    }

    public float L() {
        return this.m.h;
    }

    public float M() {
        return this.m.f;
    }

    public float N() {
        return this.m.g;
    }

    public int O() {
        return this.M;
    }

    public MotionWidget P() {
        return this.i;
    }

    private void Q(MotionPaths motionPaths0) {
        MotionPaths motionPaths1 = null;
        for(Object object0: this.E) {
            MotionPaths motionPaths2 = (MotionPaths)object0;
            if(motionPaths0.e == motionPaths2.e) {
                motionPaths1 = motionPaths2;
            }
        }
        if(motionPaths1 != null) {
            this.E.remove(motionPaths1);
        }
        int v = Collections.binarySearch(this.E, motionPaths0);
        if(v == 0) {
            Utils.f("MotionController", " KeyPath position \"" + motionPaths0.e + "\" outside of range");
        }
        this.E.add(-v - 1, motionPaths0);
    }

    public boolean R(MotionWidget motionWidget0, float f, long v, KeyCache keyCache0) {
        double f5;
        float f4;
        float f1 = this.o(f, null);
        int v1 = this.O;
        if(v1 != -1) {
            float f2 = ((float)Math.floor(f1 / (1.0f / ((float)v1)))) * (1.0f / ((float)v1));
            float f3 = f1 % (1.0f / ((float)v1)) / (1.0f / ((float)v1));
            if(!Float.isNaN(this.P)) {
                f3 = (f3 + this.P) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator0 = this.Q;
            if(differentialInterpolator0 == null) {
                f4 = ((double)f3) > 0.5 ? 1.0f : 0.0f;
            }
            else {
                f4 = differentialInterpolator0.getInterpolation(f3);
            }
            f1 = f4 * (1.0f / ((float)v1)) + f2;
        }
        HashMap hashMap0 = this.I;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.values()) {
                ((SplineSet)object0).h(motionWidget0, f1);
            }
        }
        CurveFit[] arr_curveFit = this.q;
        if(arr_curveFit == null) {
            float f6 = this.m.f + (this.n.f - this.m.f) * f1 + 0.5f;
            float f7 = this.m.g + (this.n.g - this.m.g) * f1 + 0.5f;
            motionWidget0.G(((int)f6), ((int)f7), ((int)(f6 + (this.m.h + (this.n.h - this.m.h) * f1))), ((int)(f7 + (this.m.i + (this.n.i - this.m.i) * f1))));
        }
        else {
            arr_curveFit[0].d(((double)f1), this.y);
            this.q[0].g(((double)f1), this.z);
            CurveFit curveFit0 = this.r;
            if(curveFit0 != null) {
                double[] arr_f = this.y;
                if(arr_f.length > 0) {
                    curveFit0.d(((double)f1), arr_f);
                    this.r.g(((double)f1), this.z);
                }
            }
            if(this.R) {
                f5 = (double)f1;
            }
            else {
                f5 = (double)f1;
                this.m.w(f1, motionWidget0, this.x, this.y, this.z, null);
            }
            if(this.M != -1) {
                if(this.N == null) {
                    this.N = null;
                }
                MotionWidget motionWidget1 = this.N;
                if(motionWidget1 != null) {
                    int v2 = motionWidget1.w();
                    int v3 = this.N.h();
                    int v4 = this.N.l();
                    int v5 = this.N.q();
                    if(motionWidget0.q() - motionWidget0.l() > 0 && motionWidget0.h() - motionWidget0.w() > 0) {
                        motionWidget0.N(((float)(v4 + v5)) / 2.0f - ((float)motionWidget0.l()));
                        motionWidget0.O(((float)(v2 + v3)) / 2.0f - ((float)motionWidget0.w()));
                    }
                }
            }
            for(int v6 = 1; true; ++v6) {
                CurveFit[] arr_curveFit1 = this.q;
                if(v6 >= arr_curveFit1.length) {
                    break;
                }
                arr_curveFit1[v6].e(f5, this.D);
                ((CustomVariable)this.m.p.get(this.A[v6 - 1])).w(motionWidget0, this.D);
            }
            MotionConstrainedPoint motionConstrainedPoint0 = this.o;
            if(motionConstrainedPoint0.b == 0) {
                if(f1 <= 0.0f) {
                    motionWidget0.b0(motionConstrainedPoint0.c);
                }
                else if(f1 >= 1.0f) {
                    motionWidget0.b0(this.p.c);
                }
                else if(this.p.c != motionConstrainedPoint0.c) {
                    motionWidget0.b0(4);
                }
            }
            if(this.K != null) {
                for(int v7 = 0; v7 < this.K.length; ++v7) {
                }
            }
        }
        HashMap hashMap1 = this.J;
        if(hashMap1 != null) {
            for(Object object1: hashMap1.values()) {
                KeyCycleOscillator keyCycleOscillator0 = (KeyCycleOscillator)object1;
                if(keyCycleOscillator0 instanceof PathRotateSet) {
                    ((PathRotateSet)keyCycleOscillator0).l(motionWidget0, f1, this.z[0], this.z[1]);
                }
                else {
                    keyCycleOscillator0.h(motionWidget0, f1);
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    String S() {
        return "unknown";
    }

    void T(MotionWidget motionWidget0, MotionKeyPosition motionKeyPosition0, float f, float f1, String[] arr_s, float[] arr_f) {
        FloatRect floatRect0 = new FloatRect();
        floatRect0.b = this.m.f;
        floatRect0.d = this.m.g;
        floatRect0.c = this.m.f + this.m.h;
        floatRect0.a = this.m.g + this.m.i;
        FloatRect floatRect1 = new FloatRect();
        floatRect1.b = this.n.f;
        floatRect1.d = this.n.g;
        floatRect1.c = this.n.f + this.n.h;
        floatRect1.a = this.n.g + this.n.i;
        motionKeyPosition0.C(motionWidget0, floatRect0, floatRect1, f, f1, arr_s, arr_f);
    }

    private void U(MotionPaths motionPaths0) {
        motionPaths0.u(((float)this.i.E()), ((float)this.i.F()), ((float)this.i.D()), ((float)this.i.k()));
    }

    void V(Rect rect0, Rect rect1, int v, int v1, int v2) {
        switch(v) {
            case 1: {
                int v3 = rect0.b + rect0.c;
                rect1.b = (rect0.d + rect0.a - rect0.b()) / 2;
                rect1.d = v2 - (v3 + rect0.a()) / 2;
                rect1.c = rect1.b + rect0.b();
                rect1.a = rect1.d + rect0.a();
                return;
            }
            case 2: {
                int v4 = rect0.b + rect0.c;
                rect1.b = v1 - (rect0.d + rect0.a + rect0.b()) / 2;
                rect1.d = (v4 - rect0.a()) / 2;
                rect1.c = rect1.b + rect0.b();
                rect1.a = rect1.d + rect0.a();
                return;
            }
            case 3: {
                int v5 = rect0.b + rect0.c;
                rect1.b = rect0.a() / 2 + rect0.d - v5 / 2;
                rect1.d = v2 - (v5 + rect0.a()) / 2;
                rect1.c = rect1.b + rect0.b();
                rect1.a = rect1.d + rect0.a();
                return;
            }
            case 4: {
                int v6 = rect0.b + rect0.c;
                rect1.b = v1 - (rect0.a + rect0.d + rect0.b()) / 2;
                rect1.d = (v6 - rect0.a()) / 2;
                rect1.c = rect1.b + rect0.b();
                rect1.a = rect1.d + rect0.a();
            }
        }
    }

    void W(MotionWidget motionWidget0) {
        this.m.d = 0.0f;
        this.m.e = 0.0f;
        this.R = true;
        this.m.u(((float)motionWidget0.E()), ((float)motionWidget0.F()), ((float)motionWidget0.D()), ((float)motionWidget0.k()));
        this.n.u(((float)motionWidget0.E()), ((float)motionWidget0.F()), ((float)motionWidget0.D()), ((float)motionWidget0.k()));
        this.o.l(motionWidget0);
        this.p.l(motionWidget0);
    }

    public void X(int v) {
        this.m.c = v;
    }

    public void Y(MotionWidget motionWidget0) {
        this.n.d = 1.0f;
        this.n.e = 1.0f;
        this.U(this.n);
        this.n.u(((float)motionWidget0.l()), ((float)motionWidget0.w()), ((float)motionWidget0.D()), ((float)motionWidget0.k()));
        this.n.a(motionWidget0);
        this.p.l(motionWidget0);
    }

    public void Z(String s) {
        this.j = s;
        this.m.a = s;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean a(int v, int v1) {
        switch(v) {
            case 509: {
                this.a0(v1);
                return true;
            }
            case 610: {
                this.O = v1;
                return true;
            }
            case 704: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public void a0(int v) {
        this.L = v;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean b(int v, float f) {
        if(602 == v) {
            this.P = f;
            return true;
        }
        if(600 == v) {
            this.s = f;
            return true;
        }
        return false;
    }

    public void b0(float f) {
        this.t = f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean c(int v, boolean z) {
        return false;
    }

    public void c0(float f) {
        this.u = f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean d(int v, String s) {
        if(705 != v && 611 != v) {
            if(605 == v) {
                this.m.m = s;
                return true;
            }
            return false;
        }
        this.Q = Motion.A(-1, s, 0);
        return true;
    }

    public void d0(MotionWidget motionWidget0) {
        this.m.d = 0.0f;
        this.m.e = 0.0f;
        this.m.u(((float)motionWidget0.E()), ((float)motionWidget0.F()), ((float)motionWidget0.D()), ((float)motionWidget0.k()));
        this.m.a(motionWidget0);
        this.o.l(motionWidget0);
        TypedBundle typedBundle0 = motionWidget0.C().m();
        if(typedBundle0 != null) {
            typedBundle0.g(this);
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        return 0;
    }

    public void e0(ViewState viewState0, MotionWidget motionWidget0, int v, int v1, int v2) {
        this.m.d = 0.0f;
        this.m.e = 0.0f;
        Rect rect0 = new Rect();
        switch(v) {
            case 1: {
                int v3 = viewState0.b + viewState0.d;
                rect0.b = (viewState0.c + viewState0.e - viewState0.c()) / 2;
                rect0.d = v1 - (v3 + viewState0.b()) / 2;
                rect0.c = rect0.b + viewState0.c();
                rect0.a = rect0.d + viewState0.b();
                break;
            }
            case 2: {
                int v4 = viewState0.b + viewState0.d;
                rect0.b = v2 - (viewState0.c + viewState0.e + viewState0.c()) / 2;
                rect0.d = (v4 - viewState0.b()) / 2;
                rect0.c = rect0.b + viewState0.c();
                rect0.a = rect0.d + viewState0.b();
            }
        }
        this.m.u(((float)rect0.b), ((float)rect0.d), ((float)rect0.b()), ((float)rect0.a()));
        this.o.m(rect0, motionWidget0, v, viewState0.a);
    }

    public void f(MotionKey motionKey0) {
        this.G.add(motionKey0);
    }

    public void f0(int v) {
        this.M = v;
        this.N = null;
    }

    void g(ArrayList arrayList0) {
        this.G.addAll(arrayList0);
    }

    public void g0(MotionWidget motionWidget0) {
        this.i = motionWidget0;
    }

    void h(float[] arr_f, int v) {
        HashMap hashMap0 = this.I;
        if(hashMap0 != null) {
            SplineSet splineSet0 = (SplineSet)hashMap0.get("translationX");
        }
        HashMap hashMap1 = this.I;
        if(hashMap1 != null) {
            SplineSet splineSet1 = (SplineSet)hashMap1.get("translationY");
        }
        HashMap hashMap2 = this.J;
        if(hashMap2 != null) {
            KeyCycleOscillator keyCycleOscillator0 = (KeyCycleOscillator)hashMap2.get("translationX");
        }
        HashMap hashMap3 = this.J;
        if(hashMap3 != null) {
            KeyCycleOscillator keyCycleOscillator1 = (KeyCycleOscillator)hashMap3.get("translationY");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            float f = ((float)v1) * (1.0f / ((float)(v - 1)));
            float f1 = this.u;
            float f2 = 0.0f;
            if(f1 != 1.0f) {
                float f3 = this.t;
                if(f < f3) {
                    f = 0.0f;
                }
                if(f > f3 && ((double)f) < 1.0) {
                    f = Math.min((f - f3) * f1, 1.0f);
                }
            }
            double f4 = (double)f;
            Easing easing0 = this.m.b;
            float f5 = NaNf;
            for(Object object0: this.E) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.b;
                if(easing1 != null) {
                    float f6 = motionPaths0.d;
                    if(f6 < f) {
                        easing0 = easing1;
                        f2 = f6;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.d;
                    }
                }
            }
            if(easing0 != null) {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f4 = (double)(((float)easing0.a(((double)((f - f2) / (f5 - f2))))) * (f5 - f2) + f2);
            }
            this.q[0].d(f4, this.y);
            CurveFit curveFit0 = this.r;
            if(curveFit0 != null) {
                double[] arr_f1 = this.y;
                if(arr_f1.length > 0) {
                    curveFit0.d(f4, arr_f1);
                }
            }
            this.m.g(this.x, this.y, arr_f, v1 * 2);
        }
    }

    public void h0(int v, int v1, float f, long v2) {
        int v25;
        String[] arr_s1;
        SplineSet splineSet2;
        int v5;
        SplineSet splineSet0;
        ArrayList arrayList1;
        new HashSet();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap0 = new HashMap();
        this.i0();
        int v3 = this.L;
        if(v3 != -1) {
            MotionPaths motionPaths0 = this.m;
            if(motionPaths0.l == -1) {
                motionPaths0.l = v3;
            }
        }
        this.o.e(this.p, hashSet1);
        ArrayList arrayList0 = this.G;
        if(arrayList0 == null) {
            arrayList1 = null;
        }
        else {
            arrayList1 = null;
            for(Object object0: arrayList0) {
                MotionKey motionKey0 = (MotionKey)object0;
                if(motionKey0 instanceof MotionKeyPosition) {
                    this.Q(new MotionPaths(v, v1, ((MotionKeyPosition)motionKey0), this.m, this.n));
                    int v4 = ((MotionKeyPosition)motionKey0).y;
                    if(v4 == -1) {
                        continue;
                    }
                    this.l = v4;
                }
                else if(motionKey0 instanceof MotionKeyCycle) {
                    motionKey0.i(hashSet2);
                }
                else if(motionKey0 instanceof MotionKeyTimeCycle) {
                    motionKey0.i(hashSet0);
                }
                else if(motionKey0 instanceof MotionKeyTrigger) {
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    arrayList1.add(((MotionKeyTrigger)motionKey0));
                }
                else {
                    motionKey0.q(hashMap0);
                    motionKey0.i(hashSet1);
                }
            }
        }
        if(arrayList1 != null) {
            this.K = (MotionKeyTrigger[])arrayList1.toArray(new MotionKeyTrigger[0]);
        }
        if(!hashSet1.isEmpty()) {
            this.I = new HashMap();
            for(Object object1: hashSet1) {
                String s = (String)object1;
                if(s.startsWith("CUSTOM,")) {
                    CustomVar keyFrameArray$CustomVar0 = new CustomVar();
                    String s1 = s.split(",")[1];
                    for(Object object2: this.G) {
                        MotionKey motionKey1 = (MotionKey)object2;
                        HashMap hashMap1 = motionKey1.l;
                        if(hashMap1 != null) {
                            CustomVariable customVariable0 = (CustomVariable)hashMap1.get(s1);
                            if(customVariable0 != null) {
                                keyFrameArray$CustomVar0.a(motionKey1.h, customVariable0);
                            }
                        }
                    }
                    splineSet0 = SplineSet.e(s, keyFrameArray$CustomVar0);
                }
                else {
                    splineSet0 = SplineSet.f(s, v2);
                }
                if(splineSet0 != null) {
                    splineSet0.i(s);
                    this.I.put(s, splineSet0);
                }
            }
            ArrayList arrayList2 = this.G;
            if(arrayList2 != null) {
                for(Object object3: arrayList2) {
                    MotionKey motionKey2 = (MotionKey)object3;
                    if(motionKey2 instanceof MotionKeyAttributes) {
                        motionKey2.f(this.I);
                    }
                }
            }
            this.o.a(this.I, 0);
            this.p.a(this.I, 100);
            for(Object object4: this.I.keySet()) {
                String s2 = (String)object4;
                if(hashMap0.containsKey(s2)) {
                    Integer integer0 = (Integer)hashMap0.get(s2);
                    if(integer0 != null) {
                        v5 = (int)integer0;
                    }
                }
                else {
                    v5 = 0;
                }
                SplineSet splineSet1 = (SplineSet)this.I.get(s2);
                if(splineSet1 != null) {
                    splineSet1.j(v5);
                }
            }
        }
        if(!hashSet0.isEmpty()) {
            if(this.H == null) {
                this.H = new HashMap();
            }
            for(Object object5: hashSet0) {
                String s3 = (String)object5;
                if(!this.H.containsKey(s3)) {
                    if(s3.startsWith("CUSTOM,")) {
                        CustomVar keyFrameArray$CustomVar1 = new CustomVar();
                        String s4 = s3.split(",")[1];
                        for(Object object6: this.G) {
                            MotionKey motionKey3 = (MotionKey)object6;
                            HashMap hashMap2 = motionKey3.l;
                            if(hashMap2 != null) {
                                CustomVariable customVariable1 = (CustomVariable)hashMap2.get(s4);
                                if(customVariable1 != null) {
                                    keyFrameArray$CustomVar1.a(motionKey3.h, customVariable1);
                                }
                            }
                        }
                        splineSet2 = SplineSet.e(s3, keyFrameArray$CustomVar1);
                    }
                    else {
                        splineSet2 = SplineSet.f(s3, v2);
                    }
                    if(splineSet2 != null) {
                        splineSet2.i(s3);
                    }
                }
            }
            ArrayList arrayList3 = this.G;
            if(arrayList3 != null) {
                for(Object object7: arrayList3) {
                    MotionKey motionKey4 = (MotionKey)object7;
                    if(motionKey4 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle)motionKey4).v(this.H);
                    }
                }
            }
            for(Object object8: this.H.keySet()) {
                String s5 = (String)object8;
                int v6 = hashMap0.containsKey(s5) ? ((int)(((Integer)hashMap0.get(s5)))) : 0;
                ((TimeCycleSplineSet)this.H.get(s5)).f(v6);
            }
        }
        int v7 = this.E.size();
        int v8 = v7 + 2;
        MotionPaths[] arr_motionPaths = new MotionPaths[v8];
        arr_motionPaths[0] = this.m;
        arr_motionPaths[v7 + 1] = this.n;
        if(this.E.size() > 0 && this.l == MotionKey.m) {
            this.l = 0;
        }
        int v9 = 1;
        for(Object object9: this.E) {
            arr_motionPaths[v9] = (MotionPaths)object9;
            ++v9;
        }
        HashSet hashSet3 = new HashSet();
        for(Object object10: this.n.p.keySet()) {
            String s6 = (String)object10;
            if(this.m.p.containsKey(s6) && !hashSet1.contains("CUSTOM," + s6)) {
                hashSet3.add(s6);
            }
        }
        String[] arr_s = (String[])hashSet3.toArray(new String[0]);
        this.A = arr_s;
        this.B = new int[arr_s.length];
        for(int v10 = 0; true; ++v10) {
            arr_s1 = this.A;
            if(v10 >= arr_s1.length) {
                break;
            }
            String s7 = arr_s1[v10];
            this.B[v10] = 0;
            for(int v11 = 0; v11 < v8; ++v11) {
                if(arr_motionPaths[v11].p.containsKey(s7)) {
                    CustomVariable customVariable2 = (CustomVariable)arr_motionPaths[v11].p.get(s7);
                    if(customVariable2 != null) {
                        this.B[v10] += customVariable2.r();
                        break;
                    }
                }
            }
        }
        boolean z = arr_motionPaths[0].l != -1;
        int v12 = arr_s1.length + 18;
        boolean[] arr_z = new boolean[v12];
        for(int v13 = 1; v13 < v8; ++v13) {
            arr_motionPaths[v13].e(arr_motionPaths[v13 - 1], arr_z, this.A, z);
        }
        int v15 = 0;
        for(int v14 = 1; v14 < v12; ++v14) {
            if(arr_z[v14]) {
                ++v15;
            }
        }
        this.x = new int[v15];
        int v16 = Math.max(2, v15);
        this.y = new double[v16];
        this.z = new double[v16];
        int v18 = 0;
        for(int v17 = 1; v17 < v12; ++v17) {
            if(arr_z[v17]) {
                this.x[v18] = v17;
                ++v18;
            }
        }
        double[][] arr2_f = new double[v8][this.x.length];
        double[] arr_f = new double[v8];
        for(int v19 = 0; v19 < v8; ++v19) {
            arr_motionPaths[v19].f(arr2_f[v19], this.x);
            arr_f[v19] = (double)arr_motionPaths[v19].d;
        }
        for(int v20 = 0; true; ++v20) {
            int[] arr_v = this.x;
            if(v20 >= arr_v.length) {
                break;
            }
            if(arr_v[v20] < MotionPaths.G.length) {
                String s8 = MotionPaths.G[this.x[v20]] + " [";
                for(int v21 = 0; v21 < v8; ++v21) {
                    s8 = s8 + arr2_f[v21][v20];
                }
            }
        }
        this.q = new CurveFit[this.A.length + 1];
        int v22 = 0;
        while(true) {
            String[] arr_s2 = this.A;
            if(v22 >= arr_s2.length) {
                break;
            }
            String s9 = arr_s2[v22];
            int v23 = 0;
            int v24 = 0;
            double[] arr_f1 = null;
            Object[] arr_object = null;
            while(v23 < v8) {
                if(arr_motionPaths[v23].n(s9)) {
                    if(arr_object == null) {
                        arr_f1 = new double[v8];
                        int[] arr_v1 = {v8, arr_motionPaths[v23].l(s9)};
                        arr_object = (double[][])Array.newInstance(Double.TYPE, arr_v1);
                    }
                    MotionPaths motionPaths1 = arr_motionPaths[v23];
                    v25 = v8;
                    arr_f1[v24] = (double)motionPaths1.d;
                    motionPaths1.k(s9, ((double[])arr_object[v24]), 0);
                    ++v24;
                }
                else {
                    v25 = v8;
                }
                ++v23;
                v8 = v25;
            }
            double[] arr_f2 = Arrays.copyOf(arr_f1, v24);
            double[][] arr2_f1 = (double[][])Arrays.copyOf(arr_object, v24);
            CurveFit[] arr_curveFit = this.q;
            ++v22;
            arr_curveFit[v22] = CurveFit.a(this.l, arr_f2, arr2_f1);
        }
        CurveFit[] arr_curveFit1 = this.q;
        arr_curveFit1[0] = CurveFit.a(this.l, arr_f, arr2_f);
        if(arr_motionPaths[0].l != -1) {
            int[] arr_v2 = new int[v8];
            double[] arr_f3 = new double[v8];
            double[][] arr2_f2 = new double[v8][2];
            for(int v26 = 0; v26 < v8; ++v26) {
                MotionPaths motionPaths2 = arr_motionPaths[v26];
                arr_v2[v26] = motionPaths2.l;
                arr_f3[v26] = (double)motionPaths2.d;
                double[] arr_f4 = arr2_f2[v26];
                arr_f4[0] = (double)motionPaths2.f;
                arr_f4[1] = (double)motionPaths2.g;
            }
            this.r = CurveFit.b(arr_v2, arr_f3, arr2_f2);
        }
        this.J = new HashMap();
        if(this.G != null) {
            float f1 = NaNf;
            for(Object object11: hashSet2) {
                String s10 = (String)object11;
                KeyCycleOscillator keyCycleOscillator0 = KeyCycleOscillator.d(s10);
                if(keyCycleOscillator0 != null) {
                    if(keyCycleOscillator0.k() && Float.isNaN(f1)) {
                        f1 = this.J();
                    }
                    keyCycleOscillator0.i(s10);
                    this.J.put(s10, keyCycleOscillator0);
                }
            }
            for(Object object12: this.G) {
                MotionKey motionKey5 = (MotionKey)object12;
                if(motionKey5 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle)motionKey5).v(this.J);
                }
            }
            for(Object object13: this.J.values()) {
                ((KeyCycleOscillator)object13).j(f1);
            }
        }
    }

    int i(float[] arr_f, int[] arr_v) {
        if(arr_f != null) {
            double[] arr_f1 = this.q[0].h();
            if(arr_v != null) {
                int v = 0;
                for(Object object0: this.E) {
                    arr_v[v] = ((MotionPaths)object0).q;
                    ++v;
                }
            }
            int v2 = 0;
            for(int v1 = 0; v1 < arr_f1.length; ++v1) {
                this.q[0].d(arr_f1[v1], this.y);
                this.m.g(this.x, this.y, arr_f, v2);
                v2 += 2;
            }
            return v2 / 2;
        }
        return 0;
    }

    private void i0() {
        Motion motion0 = this.S;
        if(motion0 == null) {
            return;
        }
        this.m.y(motion0, motion0.m);
        this.n.y(this.S, this.S.n);
    }

    public int j(float[] arr_f, int[] arr_v, int[] arr_v1) {
        if(arr_f != null) {
            double[] arr_f1 = this.q[0].h();
            if(arr_v != null) {
                int v = 0;
                for(Object object0: this.E) {
                    arr_v[v] = ((MotionPaths)object0).q;
                    ++v;
                }
            }
            if(arr_v1 != null) {
                int v1 = 0;
                for(Object object1: this.E) {
                    arr_v1[v1] = (int)(((MotionPaths)object1).e * 100.0f);
                    ++v1;
                }
            }
            int v3 = 0;
            for(int v2 = 0; v2 < arr_f1.length; ++v2) {
                this.q[0].d(arr_f1[v2], this.y);
                this.m.h(arr_f1[v2], this.x, this.y, arr_f, v3);
                v3 += 2;
            }
            return v3 / 2;
        }
        return 0;
    }

    public void j0(Motion motion0) {
        this.S = motion0;
    }

    public void k(float[] arr_f, int v) {
        KeyCycleOscillator keyCycleOscillator0 = null;
        SplineSet splineSet0 = this.I == null ? null : ((SplineSet)this.I.get("translationX"));
        SplineSet splineSet1 = this.I == null ? null : ((SplineSet)this.I.get("translationY"));
        KeyCycleOscillator keyCycleOscillator1 = this.J == null ? null : ((KeyCycleOscillator)this.J.get("translationX"));
        HashMap hashMap0 = this.J;
        if(hashMap0 != null) {
            keyCycleOscillator0 = (KeyCycleOscillator)hashMap0.get("translationY");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            float f = ((float)v1) * (1.0f / ((float)(v - 1)));
            float f1 = this.u;
            float f2 = 0.0f;
            if(f1 != 1.0f) {
                float f3 = this.t;
                if(f < f3) {
                    f = 0.0f;
                }
                if(f > f3 && ((double)f) < 1.0) {
                    f = Math.min((f - f3) * f1, 1.0f);
                }
            }
            double f4 = (double)f;
            Easing easing0 = this.m.b;
            float f5 = NaNf;
            for(Object object0: this.E) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.b;
                if(easing1 != null) {
                    float f6 = motionPaths0.d;
                    if(f6 < f) {
                        f2 = f6;
                        easing0 = easing1;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.d;
                    }
                }
            }
            if(easing0 != null) {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f4 = (double)(((float)easing0.a(((double)((f - f2) / (f5 - f2))))) * (f5 - f2) + f2);
            }
            this.q[0].d(f4, this.y);
            CurveFit curveFit0 = this.r;
            if(curveFit0 != null) {
                double[] arr_f1 = this.y;
                if(arr_f1.length > 0) {
                    curveFit0.d(f4, arr_f1);
                }
            }
            this.m.h(f4, this.x, this.y, arr_f, v1 * 2);
            if(keyCycleOscillator1 != null) {
                arr_f[v1 * 2] += keyCycleOscillator1.a(f);
            }
            else if(splineSet0 != null) {
                arr_f[v1 * 2] += splineSet0.a(f);
            }
            if(keyCycleOscillator0 != null) {
                int v2 = v1 * 2 + 1;
                arr_f[v2] += keyCycleOscillator0.a(f);
            }
            else if(splineSet1 != null) {
                int v3 = v1 * 2 + 1;
                arr_f[v3] += splineSet1.a(f);
            }
        }
    }

    public void l(float f, float[] arr_f, int v) {
        float f1 = this.o(f, null);
        this.q[0].d(((double)f1), this.y);
        this.m.m(this.x, this.y, arr_f, v);
    }

    void m(float[] arr_f, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            float f = this.o(((float)v1) * (1.0f / ((float)(v - 1))), null);
            this.q[0].d(((double)f), this.y);
            this.m.m(this.x, this.y, arr_f, v1 * 8);
        }
    }

    void n(boolean z) {
    }

    private float o(float f, float[] arr_f) {
        float f1 = 0.0f;
        float f2 = 1.0f;
        if(arr_f == null) {
            float f3 = this.u;
            if(((double)f3) != 1.0) {
                float f4 = this.t;
                if(f < f4) {
                    f = 0.0f;
                }
                if(f > f4 && ((double)f) < 1.0) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        else {
            arr_f[0] = 1.0f;
        }
        Easing easing0 = this.m.b;
        float f5 = NaNf;
        for(Object object0: this.E) {
            MotionPaths motionPaths0 = (MotionPaths)object0;
            Easing easing1 = motionPaths0.b;
            if(easing1 != null) {
                float f6 = motionPaths0.d;
                if(f6 < f) {
                    easing0 = easing1;
                    f1 = f6;
                }
                else if(Float.isNaN(f5)) {
                    f5 = motionPaths0.d;
                }
            }
        }
        if(easing0 != null) {
            if(!Float.isNaN(f5)) {
                f2 = f5;
            }
            float f7 = f2 - f1;
            double f8 = (double)((f - f1) / f7);
            f = ((float)easing0.a(f8)) * f7 + f1;
            if(arr_f != null) {
                arr_f[0] = (float)easing0.b(f8);
            }
        }
        return f;
    }

    public String p() {
        return this.m.m;
    }

    int q(String s, float[] arr_f, int v) {
        SplineSet splineSet0 = (SplineSet)this.I.get(s);
        if(splineSet0 == null) {
            return -1;
        }
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            arr_f[v1] = splineSet0.a(((float)(v1 / (arr_f.length - 1))));
        }
        return arr_f.length;
    }

    public void r(double f, float[] arr_f, float[] arr_f1) {
        double[] arr_f2 = new double[4];
        double[] arr_f3 = new double[4];
        this.q[0].d(f, arr_f2);
        this.q[0].g(f, arr_f3);
        Arrays.fill(arr_f1, 0.0f);
        this.m.i(f, this.x, arr_f2, arr_f, arr_f3, arr_f1);
    }

    public float s() {
        return this.v;
    }

    public float t() {
        return this.w;
    }

    @Override
    public String toString() {
        return " start: x: " + this.m.f + " y: " + this.m.g + " end: x: " + this.n.f + " y: " + this.n.g;
    }

    public void u(float f, float f1, float f2, float[] arr_f) {
        double[] arr_f1;
        float f3 = this.o(f, this.F);
        CurveFit[] arr_curveFit = this.q;
        if(arr_curveFit != null) {
            arr_curveFit[0].g(((double)f3), this.z);
            this.q[0].d(((double)f3), this.y);
            float f4 = this.F[0];
            for(int v = 0; true; ++v) {
                arr_f1 = this.z;
                if(v >= arr_f1.length) {
                    break;
                }
                arr_f1[v] *= (double)f4;
            }
            CurveFit curveFit0 = this.r;
            if(curveFit0 != null) {
                double[] arr_f2 = this.y;
                if(arr_f2.length > 0) {
                    curveFit0.d(((double)f3), arr_f2);
                    this.r.g(((double)f3), this.z);
                    this.m.v(f1, f2, arr_f, this.x, this.z, this.y);
                }
                return;
            }
            this.m.v(f1, f2, arr_f, this.x, arr_f1, this.y);
            return;
        }
        float f5 = this.n.f - this.m.f;
        float f6 = this.n.g - this.m.g;
        float f7 = this.n.i - this.m.i + f6;
        arr_f[0] = f5 * (1.0f - f1) + (this.n.h - this.m.h + f5) * f1;
        arr_f[1] = f6 * (1.0f - f2) + f7 * f2;
    }

    public int v() {
        int v = this.m.c;
        for(Object object0: this.E) {
            v = Math.max(v, ((MotionPaths)object0).c);
        }
        return Math.max(v, this.n.c);
    }

    public float w() {
        return this.n.i;
    }

    public float x() {
        return this.n.h;
    }

    public float y() {
        return this.n.f;
    }

    public float z() {
        return this.n.g;
    }
}

