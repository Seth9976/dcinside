package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine.Decelerate;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Transition implements TypedValues {
    static class KeyPosition {
        int a;
        String b;
        int c;
        float d;
        float e;

        KeyPosition(String s, int v, int v1, float f, float f1) {
            this.b = s;
            this.a = v;
            this.c = v1;
            this.d = f;
            this.e = f1;
        }
    }

    static class OnSwipe {
        public static final int A = 6;
        public static final String[] B = null;
        private static final float[][] C = null;
        public static final int D = 0;
        public static final int E = 1;
        public static final int F = 2;
        public static final int G = 3;
        public static final int H = 4;
        public static final int I = 5;
        public static final int J = 6;
        public static final int K = 7;
        public static final String[] L = null;
        public static final int M = 0;
        public static final int N = 1;
        public static final String[] O = null;
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public static final int T = 4;
        public static final int U = 5;
        public static final int V = 6;
        public static final int W = 7;
        public static final String[] X = null;
        public static final int Y = 0;
        public static final int Z = 1;
        String a;
        public static final int a0 = 2;
        private int b;
        public static final int b0 = 3;
        private StopEngine c;
        public static final String[] c0 = null;
        private String d;
        private static final float[][] d0 = null;
        String e;
        private boolean f;
        private int g;
        private float h;
        private float i;
        private int j;
        private float k;
        private float l;
        private int m;
        private float n;
        private float o;
        private float p;
        private float q;
        private float r;
        private int s;
        private long t;
        public static final int u = 0;
        public static final int v = 1;
        public static final int w = 2;
        public static final int x = 3;
        public static final int y = 4;
        public static final int z = 5;

        static {
            OnSwipe.B = new String[]{"top", "left", "right", "bottom", "middle", "start", "end"};
            OnSwipe.C = new float[][]{new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
            OnSwipe.L = new String[]{"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};
            OnSwipe.O = new String[]{"velocity", "spring"};
            OnSwipe.X = new String[]{"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
            OnSwipe.c0 = new String[]{"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
            OnSwipe.d0 = new float[][]{new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        }

        OnSwipe() {
            this.f = true;
            this.g = 0;
            this.h = 1.0f;
            this.i = 10.0f;
            this.j = 0;
            this.k = 4.0f;
            this.l = 1.2f;
            this.m = 0;
            this.n = 1.0f;
            this.o = 400.0f;
            this.p = 10.0f;
            this.q = 0.01f;
            this.r = 0.0f;
            this.s = 0;
        }

        void a(float f, float f1, long v, float f2) {
            SpringStopEngine springStopEngine0;
            StopLogicEngine stopLogicEngine0;
            Decelerate stopLogicEngine$Decelerate0;
            this.t = v;
            float f3 = this.k;
            if(Math.abs(f1) > f3) {
                f1 = Math.signum(f1) * f3;
            }
            float f4 = this.b(f, f1, f2);
            this.r = f4;
            if(f4 == f) {
                this.c = null;
                return;
            }
            if(this.m == 4 && this.j == 0) {
                StopEngine stopEngine0 = this.c;
                if(stopEngine0 instanceof Decelerate) {
                    stopLogicEngine$Decelerate0 = (Decelerate)stopEngine0;
                }
                else {
                    stopLogicEngine$Decelerate0 = new Decelerate();
                    this.c = stopLogicEngine$Decelerate0;
                }
                stopLogicEngine$Decelerate0.e(f, this.r, f1);
                return;
            }
            if(this.j == 0) {
                StopEngine stopEngine1 = this.c;
                if(stopEngine1 instanceof StopLogicEngine) {
                    stopLogicEngine0 = (StopLogicEngine)stopEngine1;
                }
                else {
                    stopLogicEngine0 = new StopLogicEngine();
                    this.c = stopLogicEngine0;
                }
                stopLogicEngine0.f(f, this.r, f1, f2, this.l, this.k);
                return;
            }
            StopEngine stopEngine2 = this.c;
            if(stopEngine2 instanceof SpringStopEngine) {
                springStopEngine0 = (SpringStopEngine)stopEngine2;
            }
            else {
                springStopEngine0 = new SpringStopEngine();
                this.c = springStopEngine0;
            }
            springStopEngine0.h(f, this.r, f1, this.n, this.o, this.p, this.q, this.s);
        }

        float b(float f, float f1, float f2) {
            float f3 = Math.abs(f1) * 0.5f * f1 / this.l + f;
            switch(this.m) {
                case 1: {
                    return f >= 1.0f ? 1.0f : 0.0f;
                }
                case 2: {
                    return f <= 0.0f ? 0.0f : 1.0f;
                }
                case 3: {
                    return NaNf;
                }
                case 4: {
                    return Math.max(0.0f, Math.min(1.0f, f3));
                }
                case 5: {
                    if(f3 > 0.2f && f3 < 0.8f) {
                        return f3;
                    }
                    return f3 > 0.5f ? 1.0f : 0.0f;
                }
                case 6: {
                    return 1.0f;
                }
                case 7: {
                    return 0.0f;
                }
                default: {
                    return ((double)f3) > 0.5 ? 1.0f : 0.0f;
                }
            }
        }

        float[] c() {
            return OnSwipe.d0[this.g];
        }

        float d() {
            return this.h;
        }

        float[] e() {
            return OnSwipe.C[this.b];
        }

        public float f(long v) {
            float f = this.c.getInterpolation(((float)(v - this.t)) * 1.000000E-09f);
            return this.c.d() ? this.r : f;
        }

        // 去混淆评级： 低(20)
        public boolean g(float f) {
            return this.m == 3 ? false : this.c != null && !this.c.d();
        }

        public void h() {
            if(this.j == 0) {
                PrintStream printStream0 = System.out;
                printStream0.println("velocity = " + this.c.a());
                printStream0.println("mMaxAcceleration = " + this.l);
                printStream0.println("mMaxVelocity = " + this.k);
                return;
            }
            PrintStream printStream1 = System.out;
            printStream1.println("mSpringMass          = " + this.n);
            printStream1.println("mSpringStiffness     = " + this.o);
            printStream1.println("mSpringDamping       = " + this.p);
            printStream1.println("mSpringStopThreshold = " + this.q);
            printStream1.println("mSpringBoundary      = " + this.s);
        }

        void i(String s) {
            this.a = s;
        }

        void j(int v) {
            this.b = v;
        }

        void k(int v) {
            this.j = v;
        }

        void l(int v) {
            this.g = v;
            this.f = v < 2;
        }

        void m(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.h = f;
        }

        void n(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.i = f;
        }

        void o(String s) {
            this.e = s;
        }

        void p(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.l = f;
        }

        void q(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.k = f;
        }

        void r(int v) {
            this.m = v;
        }

        void s(String s) {
            this.d = s;
        }

        void t(int v) {
            this.s = v;
        }

        void u(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.p = f;
        }

        void v(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.n = f;
        }

        void w(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.o = f;
        }

        void x(float f) {
            if(Float.isNaN(f)) {
                return;
            }
            this.q = f;
        }
    }

    public static class WidgetState {
        WidgetFrame a;
        WidgetFrame b;
        WidgetFrame c;
        Motion d;
        boolean e;
        MotionWidget f;
        MotionWidget g;
        MotionWidget h;
        KeyCache i;
        int j;
        int k;

        public WidgetState() {
            this.e = true;
            this.i = new KeyCache();
            this.j = -1;
            this.k = -1;
            this.a = new WidgetFrame();
            this.b = new WidgetFrame();
            this.c = new WidgetFrame();
            this.f = new MotionWidget(this.a);
            this.g = new MotionWidget(this.b);
            this.h = new MotionWidget(this.c);
            Motion motion0 = new Motion(this.f);
            this.d = motion0;
            motion0.d0(this.f);
            this.d.Y(this.g);
        }

        public WidgetFrame a(int v) {
            if(v == 0) {
                return this.a;
            }
            return v == 1 ? this.b : this.c;
        }

        String b() {
            return this.d.p();
        }

        public void c(int v, int v1, float f, Transition transition0) {
            this.j = v1;
            this.k = v;
            if(this.e) {
                this.d.h0(v, v1, 1.0f, System.nanoTime());
                this.e = false;
            }
            WidgetFrame.p(v, v1, this.c, this.a, this.b, transition0, f);
            this.c.q = f;
            this.d.R(this.h, f, System.nanoTime(), this.i);
        }

        public void d(TypedBundle typedBundle0) {
            MotionKeyAttributes motionKeyAttributes0 = new MotionKeyAttributes();
            typedBundle0.g(motionKeyAttributes0);
            this.d.f(motionKeyAttributes0);
        }

        public void e(TypedBundle typedBundle0, CustomVariable[] arr_customVariable) {
            MotionKeyAttributes motionKeyAttributes0 = new MotionKeyAttributes();
            typedBundle0.g(motionKeyAttributes0);
            if(arr_customVariable != null) {
                for(int v = 0; v < arr_customVariable.length; ++v) {
                    motionKeyAttributes0.l.put(arr_customVariable[v].k(), arr_customVariable[v]);
                }
            }
            this.d.f(motionKeyAttributes0);
        }

        public void f(TypedBundle typedBundle0) {
            MotionKeyCycle motionKeyCycle0 = new MotionKeyCycle();
            typedBundle0.g(motionKeyCycle0);
            this.d.f(motionKeyCycle0);
        }

        public void g(TypedBundle typedBundle0) {
            MotionKeyPosition motionKeyPosition0 = new MotionKeyPosition();
            typedBundle0.g(motionKeyPosition0);
            this.d.f(motionKeyPosition0);
        }

        public void h(WidgetState transition$WidgetState0) {
            this.d.j0(transition$WidgetState0.d);
        }

        public void i(ConstraintWidget constraintWidget0, int v) {
            switch(v) {
                case 0: {
                    this.a.F(constraintWidget0);
                    this.f.c0(this.f);
                    this.d.d0(this.f);
                    this.e = true;
                    break;
                }
                case 1: {
                    this.b.F(constraintWidget0);
                    this.d.Y(this.g);
                    this.e = true;
                }
            }
            this.k = -1;
        }
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    static final int D = 0;
    static final int E = 1;
    static final int F = 2;
    static final int G = 3;
    static final int H = 4;
    static final int I = 5;
    static final int J = 6;
    private static final int K = -1;
    private static final int L = -2;
    private HashMap h;
    private HashMap i;
    private TypedBundle j;
    private int k;
    private String l;
    private Easing m;
    private int n;
    private int o;
    private float p;
    private OnSwipe q;
    final CorePixelDp r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    boolean y;
    private static final boolean z = false;

    public Transition(@NonNull CorePixelDp corePixelDp0) {
        this.h = new HashMap();
        this.i = new HashMap();
        this.j = new TypedBundle();
        this.k = 0;
        this.l = null;
        this.m = null;
        this.n = 0;
        this.o = 400;
        this.p = 0.0f;
        this.q = null;
        this.r = corePixelDp0;
    }

    public void A(WidgetFrame widgetFrame0, float[] arr_f, float[] arr_f1, float[] arr_f2) {
        int v = 0;
        for(int v1 = 0; v1 <= 100; ++v1) {
            HashMap hashMap0 = (HashMap)this.h.get(v1);
            if(hashMap0 != null) {
                KeyPosition transition$KeyPosition0 = (KeyPosition)hashMap0.get(widgetFrame0.a.o);
                if(transition$KeyPosition0 != null) {
                    arr_f[v] = transition$KeyPosition0.d;
                    arr_f1[v] = transition$KeyPosition0.e;
                    arr_f2[v] = (float)transition$KeyPosition0.a;
                    ++v;
                }
            }
        }
    }

    public KeyPosition B(String s, int v) {
        while(v <= 100) {
            HashMap hashMap0 = (HashMap)this.h.get(v);
            if(hashMap0 != null) {
                KeyPosition transition$KeyPosition0 = (KeyPosition)hashMap0.get(s);
                if(transition$KeyPosition0 != null) {
                    return transition$KeyPosition0;
                }
            }
            ++v;
        }
        return null;
    }

    public KeyPosition C(String s, int v) {
        while(v >= 0) {
            HashMap hashMap0 = (HashMap)this.h.get(v);
            if(hashMap0 != null) {
                KeyPosition transition$KeyPosition0 = (KeyPosition)hashMap0.get(s);
                if(transition$KeyPosition0 != null) {
                    return transition$KeyPosition0;
                }
            }
            --v;
        }
        return null;
    }

    public int D() {
        return this.n;
    }

    public WidgetFrame E(ConstraintWidget constraintWidget0) {
        return this.U(constraintWidget0.o, null, 1).b;
    }

    public WidgetFrame F(String s) {
        WidgetState transition$WidgetState0 = (WidgetState)this.i.get(s);
        return transition$WidgetState0 == null ? null : transition$WidgetState0.b;
    }

    public WidgetFrame G(ConstraintWidget constraintWidget0) {
        return this.U(constraintWidget0.o, null, 2).c;
    }

    public WidgetFrame H(String s) {
        WidgetState transition$WidgetState0 = (WidgetState)this.i.get(s);
        return transition$WidgetState0 == null ? null : transition$WidgetState0.c;
    }

    public int I() {
        return this.x;
    }

    public int J() {
        return this.w;
    }

    public Interpolator K() {
        return Transition.L(this.k, this.l);
    }

    public static Interpolator L(int v, String s) {
        switch(v) {
            case -1: {
                return (float f) -> ((float)Easing.c(s).a(((double)f)));
            }
            case 0: {
                return (float f) -> ((float)Easing.c("standard").a(((double)f)));
            }
            case 1: {
                return (float f) -> ((float)Easing.c("accelerate").a(((double)f)));
            }
            case 2: {
                return (float f) -> ((float)Easing.c("decelerate").a(((double)f)));
            }
            case 3: {
                return (float f) -> ((float)Easing.c("linear").a(((double)f)));
            }
            case 4: {
                return (float f) -> ((float)Easing.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(((double)f)));
            }
            case 5: {
                return (float f) -> ((float)Easing.c("overshoot").a(((double)f)));
            }
            case 6: {
                return (float f) -> ((float)Easing.c("anticipate").a(((double)f)));
            }
            default: {
                return null;
            }
        }
    }

    public int M(String s, float[] arr_f, int[] arr_v, int[] arr_v1) {
        return ((WidgetState)this.i.get(s)).d.j(arr_f, arr_v, arr_v1);
    }

    public Motion N(String s) {
        return this.U(s, null, 0).d;
    }

    public int O(WidgetFrame widgetFrame0) {
        int v = 0;
        for(int v1 = 0; v1 <= 100; ++v1) {
            HashMap hashMap0 = (HashMap)this.h.get(v1);
            if(hashMap0 != null && ((KeyPosition)hashMap0.get(widgetFrame0.a.o)) != null) {
                ++v;
            }
        }
        return v;
    }

    public float[] P(String s) {
        WidgetState transition$WidgetState0 = (WidgetState)this.i.get(s);
        float[] arr_f = new float[0x7C];
        transition$WidgetState0.d.k(arr_f, 62);
        return arr_f;
    }

    public WidgetFrame Q(ConstraintWidget constraintWidget0) {
        return this.U(constraintWidget0.o, null, 0).a;
    }

    public WidgetFrame R(String s) {
        WidgetState transition$WidgetState0 = (WidgetState)this.i.get(s);
        return transition$WidgetState0 == null ? null : transition$WidgetState0.a;
    }

    public float S(long v) {
        return this.q == null ? 0.0f : this.q.f(v);
    }

    private WidgetState T(String s) {
        return (WidgetState)this.i.get(s);
    }

    public WidgetState U(String s, ConstraintWidget constraintWidget0, int v) {
        WidgetState transition$WidgetState0 = (WidgetState)this.i.get(s);
        if(transition$WidgetState0 == null) {
            transition$WidgetState0 = new WidgetState();
            this.j.g(transition$WidgetState0.d);
            transition$WidgetState0.f.c0(transition$WidgetState0.d);
            this.i.put(s, transition$WidgetState0);
            if(constraintWidget0 != null) {
                transition$WidgetState0.i(constraintWidget0, v);
            }
        }
        return transition$WidgetState0;
    }

    public boolean V() {
        return this.q != null;
    }

    public boolean W() {
        return this.h.size() > 0;
    }

    public void X(int v, int v1, float f) {
        if(this.y) {
            this.v(f);
        }
        Easing easing0 = this.m;
        if(easing0 != null) {
            f = (float)easing0.a(((double)f));
        }
        for(Object object0: this.i.keySet()) {
            ((WidgetState)this.i.get(((String)object0))).c(v, v1, f, this);
        }
    }

    public boolean Y() {
        return this.i.isEmpty();
    }

    @RestrictTo({Scope.b})
    public boolean Z(float f, float f1) {
        OnSwipe transition$OnSwipe0 = this.q;
        if(transition$OnSwipe0 == null) {
            return false;
        }
        String s = transition$OnSwipe0.e;
        if(s != null) {
            WidgetState transition$WidgetState0 = (WidgetState)this.i.get(s);
            if(transition$WidgetState0 == null) {
                System.err.println("mLimitBoundsTo target is null");
                return false;
            }
            WidgetFrame widgetFrame0 = transition$WidgetState0.a(2);
            return f >= ((float)widgetFrame0.b) && f < ((float)widgetFrame0.d) && f1 >= ((float)widgetFrame0.c) && f1 < ((float)widgetFrame0.e);
        }
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean a(int v, int v1) {
        return false;
    }

    public boolean a0(float f) {
        return this.q.g(f);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean b(int v, float f) {
        if(v == 706) {
            this.p = f;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static float b0(String s, float f) [...]

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean c(int v, boolean z) {
        return false;
    }

    // 检测为 Lambda 实现
    private static float c0(float f) [...]

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean d(int v, String s) {
        if(v == 705) {
            this.l = s;
            this.m = Easing.c(s);
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static float d0(float f) [...]

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        return 0;
    }

    // 检测为 Lambda 实现
    private static float e0(float f) [...]

    // 检测为 Lambda 实现
    private static float f0(float f) [...]

    // 检测为 Lambda 实现
    private static float g0(float f) [...]

    // 检测为 Lambda 实现
    private static float h0(float f) [...]

    // 检测为 Lambda 实现
    private static float i0(float f) [...]

    void j0() {
        this.q = null;
        this.j.h();
    }

    public void k0(float f, long v, float f1, float f2) {
        OnSwipe transition$OnSwipe0 = this.q;
        if(transition$OnSwipe0 != null) {
            WidgetState transition$WidgetState0 = (WidgetState)this.i.get(transition$OnSwipe0.a);
            float[] arr_f = new float[2];
            float[] arr_f1 = this.q.c();
            float[] arr_f2 = this.q.e();
            transition$WidgetState0.d.u(f, arr_f2[0], arr_f2[1], arr_f);
            if(((double)Math.abs(arr_f1[0] * arr_f[0] + arr_f1[1] * arr_f[1])) < 0.01) {
                arr_f[0] = 0.01f;
                arr_f[1] = 0.01f;
            }
            this.q.a(f, (arr_f1[0] == 0.0f ? f2 / arr_f[1] : f1 / arr_f[0]) * this.q.d(), v, ((float)this.o) * 0.001f);
        }
    }

    public void l0(TypedBundle typedBundle0) {
        typedBundle0.f(this.j);
        typedBundle0.g(this);
    }

    public void m0(ConstraintWidgetContainer constraintWidgetContainer0, int v) {
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidgetContainer0.b0;
        boolean z = true;
        boolean z1 = arr_constraintWidget$DimensionBehaviour[0] == DimensionBehaviour.b;
        this.y = z1;
        if(arr_constraintWidget$DimensionBehaviour[1] != DimensionBehaviour.b) {
            z = false;
        }
        this.y = z1 | z;
        if(v == 0) {
            int v2 = constraintWidgetContainer0.m0();
            this.s = v2;
            this.w = v2;
            int v3 = constraintWidgetContainer0.D();
            this.t = v3;
            this.x = v3;
        }
        else {
            this.u = constraintWidgetContainer0.m0();
            this.v = constraintWidgetContainer0.D();
        }
        ArrayList arrayList0 = constraintWidgetContainer0.m2();
        int v4 = arrayList0.size();
        WidgetState[] arr_transition$WidgetState = new WidgetState[v4];
        for(int v1 = 0; v1 < v4; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v1);
            WidgetState transition$WidgetState0 = this.U(constraintWidget0.o, null, v);
            arr_transition$WidgetState[v1] = transition$WidgetState0;
            transition$WidgetState0.i(constraintWidget0, v);
            String s = transition$WidgetState0.b();
            if(s != null) {
                transition$WidgetState0.h(this.U(s, null, v));
            }
        }
        this.u();
    }

    public void n(int v, String s, String s1, int v1) {
        this.U(s, null, v).a(v).c(s1, v1);
    }

    public void o(int v, String s, String s1, float f) {
        this.U(s, null, v).a(v).d(s1, f);
    }

    public void p(String s, TypedBundle typedBundle0) {
        this.U(s, null, 0).d(typedBundle0);
    }

    public void q(String s, TypedBundle typedBundle0, CustomVariable[] arr_customVariable) {
        this.U(s, null, 0).e(typedBundle0, arr_customVariable);
    }

    public void r(String s, TypedBundle typedBundle0) {
        this.U(s, null, 0).f(typedBundle0);
    }

    public void s(String s, int v, int v1, float f, float f1) {
        TypedBundle typedBundle0 = new TypedBundle();
        typedBundle0.b(510, 2);
        typedBundle0.b(100, v);
        typedBundle0.a(506, f);
        typedBundle0.a(507, f1);
        this.U(s, null, 0).g(typedBundle0);
        KeyPosition transition$KeyPosition0 = new KeyPosition(s, v, v1, f, f1);
        HashMap hashMap0 = (HashMap)this.h.get(v);
        if(hashMap0 == null) {
            hashMap0 = new HashMap();
            this.h.put(v, hashMap0);
        }
        hashMap0.put(s, transition$KeyPosition0);
    }

    public void t(String s, TypedBundle typedBundle0) {
        this.U(s, null, 0).g(typedBundle0);
    }

    public void u() {
        float f3;
        float f2;
        float f = this.p;
        if(f == 0.0f) {
            return;
        }
        float f1 = Math.abs(f);
        Iterator iterator0 = this.i.keySet().iterator();
        while(true) {
            f2 = 3.402823E+38f;
            f3 = -3.402823E+38f;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(Float.isNaN(((WidgetState)this.i.get(((String)object0))).d.F())) {
                continue;
            }
            for(Object object1: this.i.keySet()) {
                float f4 = ((WidgetState)this.i.get(((String)object1))).d.F();
                if(!Float.isNaN(f4)) {
                    f2 = Math.min(f2, f4);
                    f3 = Math.max(f3, f4);
                }
            }
            for(Object object2: this.i.keySet()) {
                Motion motion0 = ((WidgetState)this.i.get(((String)object2))).d;
                float f5 = motion0.F();
                if(!Float.isNaN(f5)) {
                    float f6 = f3 - f2;
                    float f7 = f1 - (f5 - f2) * f1 / f6;
                    if(((double)f) < 0.0) {
                        f7 = f1 - (f3 - f5) / f6 * f1;
                    }
                    motion0.c0(1.0f / (1.0f - f1));
                    motion0.b0(f7);
                }
            }
            return;
        }
        for(Object object3: this.i.keySet()) {
            Motion motion1 = ((WidgetState)this.i.get(((String)object3))).d;
            float f8 = motion1.y() + motion1.z();
            f2 = Math.min(f2, f8);
            f3 = Math.max(f3, f8);
        }
        for(Object object4: this.i.keySet()) {
            Motion motion2 = ((WidgetState)this.i.get(((String)object4))).d;
            float f9 = motion2.y() + motion2.z();
            float f10 = f3 - f2;
            float f11 = f1 - (f9 - f2) * f1 / f10;
            if(((double)f) < 0.0) {
                f11 = f1 - (f3 - f9) / f10 * f1;
            }
            motion2.c0(1.0f / (1.0f - f1));
            motion2.b0(f11);
        }
    }

    private void v(float f) {
        this.w = (int)(((float)this.s) + 0.5f + ((float)(this.u - this.s)) * f);
        this.x = (int)(((float)this.t) + 0.5f + ((float)(this.v - this.t)) * f);
    }

    public void w() {
        this.i.clear();
    }

    public boolean x(String s) {
        return this.i.containsKey(s);
    }

    OnSwipe y() {
        OnSwipe transition$OnSwipe0 = new OnSwipe();
        this.q = transition$OnSwipe0;
        return transition$OnSwipe0;
    }

    public float z(float f, int v, int v1, float f1, float f2) {
        WidgetState transition$WidgetState0;
        Iterator iterator0 = this.i.values().iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            transition$WidgetState0 = (WidgetState)object0;
        }
        else {
            transition$WidgetState0 = null;
        }
        OnSwipe transition$OnSwipe0 = this.q;
        if(transition$OnSwipe0 != null && transition$WidgetState0 != null) {
            String s = transition$OnSwipe0.a;
            if(s == null) {
                float[] arr_f = transition$OnSwipe0.c();
                float f3 = (float)transition$WidgetState0.j;
                float f4 = (float)transition$WidgetState0.j;
                float f5 = arr_f[0];
                return f5 == 0.0f ? f2 * Math.abs(arr_f[1]) / f4 * this.q.d() : f1 * Math.abs(f5) / f3 * this.q.d();
            }
            WidgetState transition$WidgetState1 = (WidgetState)this.i.get(s);
            float[] arr_f1 = this.q.c();
            float[] arr_f2 = this.q.e();
            float[] arr_f3 = new float[2];
            transition$WidgetState1.c(v, v1, f, this);
            transition$WidgetState1.d.u(f, arr_f2[0], arr_f2[1], arr_f3);
            float f6 = arr_f1[0];
            return f6 == 0.0f ? f2 * Math.abs(arr_f1[1]) / arr_f3[1] * this.q.d() : f1 * Math.abs(f6) / arr_f3[0] * this.q.d();
        }
        return transition$WidgetState0 == null ? 1.0f : -f2 / ((float)transition$WidgetState0.j);
    }
}

