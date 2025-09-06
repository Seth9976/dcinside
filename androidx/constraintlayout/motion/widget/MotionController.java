package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class MotionController {
    private ArrayList A;
    private HashMap B;
    private HashMap C;
    private HashMap D;
    private KeyTrigger[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;
    String[] M;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;
    Rect a;
    public static final int a0 = 1;
    View b;
    public static final int b0 = 2;
    int c;
    private static final String c0 = "MotionController";
    boolean d;
    private static final boolean d0 = false;
    String e;
    private static final boolean e0 = false;
    private int f;
    static final int f0 = 0;
    private MotionPaths g;
    static final int g0 = 1;
    private MotionPaths h;
    static final int h0 = 2;
    private MotionConstrainedPoint i;
    static final int i0 = 3;
    private MotionConstrainedPoint j;
    static final int j0 = 4;
    private CurveFit[] k;
    static final int k0 = 5;
    private CurveFit l;
    private static final int l0 = -1;
    float m;
    private static final int m0 = -2;
    float n;
    private static final int n0 = -3;
    float o;
    float p;
    float q;
    private int[] r;
    private double[] s;
    private double[] t;
    private String[] u;
    private int[] v;
    private int w;
    private float[] x;
    private ArrayList y;
    private float[] z;

    MotionController(View view0) {
        this.a = new Rect();
        this.d = false;
        this.f = -1;
        this.g = new MotionPaths();
        this.h = new MotionPaths();
        this.i = new MotionConstrainedPoint();
        this.j = new MotionConstrainedPoint();
        this.m = NaNf;
        this.n = 0.0f;
        this.o = 1.0f;
        this.w = 4;
        this.x = new float[4];
        this.y = new ArrayList();
        this.z = new float[1];
        this.A = new ArrayList();
        this.F = Key.f;
        this.G = Key.f;
        this.H = null;
        this.I = Key.f;
        this.J = NaNf;
        this.K = null;
        this.L = false;
        this.Z(view0);
    }

    double[] A(double f) {
        this.k[0].d(f, this.s);
        CurveFit curveFit0 = this.l;
        if(curveFit0 != null) {
            double[] arr_f = this.s;
            if(arr_f.length > 0) {
                curveFit0.d(f, arr_f);
            }
        }
        return this.s;
    }

    KeyPositionBase B(int v, int v1, float f, float f1) {
        RectF rectF0 = new RectF();
        rectF0.left = this.g.e;
        rectF0.top = this.g.f;
        rectF0.right = this.g.e + this.g.g;
        rectF0.bottom = this.g.f + this.g.h;
        RectF rectF1 = new RectF();
        rectF1.left = this.h.e;
        rectF1.top = this.h.f;
        rectF1.right = this.h.e + this.h.g;
        rectF1.bottom = this.h.f + this.h.h;
        for(Object object0: this.A) {
            Key key0 = (Key)object0;
            if(key0 instanceof KeyPositionBase && ((KeyPositionBase)key0).r(v, v1, rectF0, rectF1, f, f1)) {
                return (KeyPositionBase)key0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    void C(float f, int v, int v1, float f1, float f2, float[] arr_f) {
        double[] arr_f2;
        float f3 = this.j(f, this.z);
        ViewOscillator viewOscillator0 = null;
        SplineSet splineSet0 = this.C == null ? null : ((SplineSet)this.C.get("translationX"));
        SplineSet splineSet1 = this.C == null ? null : ((SplineSet)this.C.get("translationY"));
        SplineSet splineSet2 = this.C == null ? null : ((SplineSet)this.C.get("rotation"));
        SplineSet splineSet3 = this.C == null ? null : ((SplineSet)this.C.get("scaleX"));
        SplineSet splineSet4 = this.C == null ? null : ((SplineSet)this.C.get("scaleY"));
        ViewOscillator viewOscillator1 = this.D == null ? null : ((ViewOscillator)this.D.get("translationX"));
        ViewOscillator viewOscillator2 = this.D == null ? null : ((ViewOscillator)this.D.get("translationY"));
        ViewOscillator viewOscillator3 = this.D == null ? null : ((ViewOscillator)this.D.get("rotation"));
        ViewOscillator viewOscillator4 = this.D == null ? null : ((ViewOscillator)this.D.get("scaleX"));
        HashMap hashMap0 = this.D;
        if(hashMap0 != null) {
            viewOscillator0 = (ViewOscillator)hashMap0.get("scaleY");
        }
        VelocityMatrix velocityMatrix0 = new VelocityMatrix();
        velocityMatrix0.b();
        velocityMatrix0.d(splineSet2, f3);
        velocityMatrix0.h(splineSet0, splineSet1, f3);
        velocityMatrix0.f(splineSet3, splineSet4, f3);
        velocityMatrix0.c(viewOscillator3, f3);
        velocityMatrix0.g(viewOscillator1, viewOscillator2, f3);
        velocityMatrix0.e(viewOscillator4, viewOscillator0, f3);
        CurveFit curveFit0 = this.l;
        if(curveFit0 != null) {
            double[] arr_f1 = this.s;
            if(arr_f1.length > 0) {
                curveFit0.d(((double)f3), arr_f1);
                this.l.g(((double)f3), this.t);
                this.g.w(f1, f2, arr_f, this.r, this.t, this.s);
            }
            velocityMatrix0.a(f1, f2, v, v1, arr_f);
            return;
        }
        if(this.k != null) {
            float f4 = this.j(f3, this.z);
            this.k[0].g(((double)f4), this.t);
            this.k[0].d(((double)f4), this.s);
            float f5 = this.z[0];
            for(int v2 = 0; true; ++v2) {
                arr_f2 = this.t;
                if(v2 >= arr_f2.length) {
                    break;
                }
                arr_f2[v2] *= (double)f5;
            }
            this.g.w(f1, f2, arr_f, this.r, arr_f2, this.s);
            velocityMatrix0.a(f1, f2, v, v1, arr_f);
            return;
        }
        float f6 = this.h.e - this.g.e;
        float f7 = this.h.f - this.g.f;
        float f8 = this.h.h - this.g.h + f7;
        arr_f[0] = f6 * (1.0f - f1) + (this.h.g - this.g.g + f6) * f1;
        arr_f[1] = f7 * (1.0f - f2) + f8 * f2;
        velocityMatrix0.b();
        velocityMatrix0.d(splineSet2, f3);
        velocityMatrix0.h(splineSet0, splineSet1, f3);
        velocityMatrix0.f(splineSet3, splineSet4, f3);
        velocityMatrix0.c(viewOscillator3, f3);
        velocityMatrix0.g(viewOscillator1, viewOscillator2, f3);
        velocityMatrix0.e(viewOscillator4, viewOscillator0, f3);
        velocityMatrix0.a(f1, f2, v, v1, arr_f);
    }

    private float D() {
        float[] arr_f = new float[2];
        double f = 0.0;
        float f2 = 0.0f;
        int v = 0;
        for(double f1 = 0.0; v < 100; f1 = (double)arr_f[1]) {
            float f3 = ((float)v) * 0.010101f;
            double f4 = (double)f3;
            Easing easing0 = this.g.a;
            float f5 = NaNf;
            float f6 = 0.0f;
            for(Object object0: this.y) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.a;
                if(easing1 != null) {
                    float f7 = motionPaths0.c;
                    if(f7 < f3) {
                        easing0 = easing1;
                        f6 = f7;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.c;
                    }
                }
            }
            if(easing0 != null) {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f4 = (double)(((float)easing0.a(((double)((f3 - f6) / (f5 - f6))))) * (f5 - f6) + f6);
            }
            this.k[0].d(f4, this.s);
            this.g.h(f4, this.r, this.s, arr_f, 0);
            if(v > 0) {
                f2 += (float)Math.hypot(f1 - ((double)arr_f[1]), f - ((double)arr_f[0]));
            }
            f = (double)arr_f[0];
            ++v;
        }
        return f2;
    }

    public float E() {
        return this.g.h;
    }

    public float F() {
        return this.g.g;
    }

    public float G() {
        return this.g.e;
    }

    public float H() {
        return this.g.f;
    }

    public int I() {
        return this.G;
    }

    public View J() {
        return this.b;
    }

    private void K(MotionPaths motionPaths0) {
        int v = Collections.binarySearch(this.y, motionPaths0);
        if(v == 0) {
            Log.e("MotionController", " KeyPath position \"" + motionPaths0.d + "\" outside of range");
        }
        this.y.add(-v - 1, motionPaths0);
    }

    boolean L(View view0, float f, long v, KeyCache keyCache0) {
        double f5;
        PathRotate viewTimeCycle$PathRotate1;
        boolean z1;
        float f4;
        float f1 = this.j(f, null);
        int v1 = this.I;
        if(v1 != Key.f) {
            float f2 = ((float)Math.floor(f1 / (1.0f / ((float)v1)))) * (1.0f / ((float)v1));
            float f3 = f1 % (1.0f / ((float)v1)) / (1.0f / ((float)v1));
            if(!Float.isNaN(this.J)) {
                f3 = (f3 + this.J) % 1.0f;
            }
            Interpolator interpolator0 = this.K;
            if(interpolator0 == null) {
                f4 = ((double)f3) > 0.5 ? 1.0f : 0.0f;
            }
            else {
                f4 = interpolator0.getInterpolation(f3);
            }
            f1 = f4 * (1.0f / ((float)v1)) + f2;
        }
        HashMap hashMap0 = this.C;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.values()) {
                ((ViewSpline)object0).m(view0, f1);
            }
        }
        HashMap hashMap1 = this.B;
        if(hashMap1 == null) {
            viewTimeCycle$PathRotate1 = null;
            z1 = false;
        }
        else {
            PathRotate viewTimeCycle$PathRotate0 = null;
            boolean z = false;
            for(Object object1: hashMap1.values()) {
                ViewTimeCycle viewTimeCycle0 = (ViewTimeCycle)object1;
                if(viewTimeCycle0 instanceof PathRotate) {
                    viewTimeCycle$PathRotate0 = (PathRotate)viewTimeCycle0;
                }
                else {
                    z |= viewTimeCycle0.j(view0, f1, v, keyCache0);
                }
            }
            z1 = z;
            viewTimeCycle$PathRotate1 = viewTimeCycle$PathRotate0;
        }
        CurveFit[] arr_curveFit = this.k;
        if(arr_curveFit == null) {
            float f8 = this.g.h;
            float f9 = this.g.e + (this.h.e - this.g.e) * f1 + 0.5f;
            float f10 = this.g.f + (this.h.f - this.g.f) * f1 + 0.5f;
            int v8 = (int)(f9 + ((this.h.g - this.g.g) * f1 + this.g.g));
            int v9 = (int)(f10 + ((this.h.h - f8) * f1 + f8));
            if(this.h.g != this.g.g || this.h.h != f8 || this.d) {
                view0.measure(View.MeasureSpec.makeMeasureSpec(v8 - ((int)f9), 0x40000000), View.MeasureSpec.makeMeasureSpec(v9 - ((int)f10), 0x40000000));
                this.d = false;
            }
            view0.layout(((int)f9), ((int)f10), v8, v9);
        }
        else {
            arr_curveFit[0].d(((double)f1), this.s);
            this.k[0].g(((double)f1), this.t);
            CurveFit curveFit0 = this.l;
            if(curveFit0 != null) {
                double[] arr_f = this.s;
                if(arr_f.length > 0) {
                    curveFit0.d(((double)f1), arr_f);
                    this.l.g(((double)f1), this.t);
                }
            }
            if(this.L) {
                f5 = (double)f1;
            }
            else {
                f5 = (double)f1;
                this.g.y(f1, view0, this.r, this.s, this.t, null, this.d);
                this.d = false;
            }
            if(this.G != Key.f) {
                if(this.H == null) {
                    this.H = ((View)view0.getParent()).findViewById(this.G);
                }
                View view1 = this.H;
                if(view1 != null) {
                    int v2 = view1.getTop();
                    int v3 = this.H.getBottom();
                    int v4 = this.H.getLeft();
                    int v5 = this.H.getRight();
                    if(view0.getRight() - view0.getLeft() > 0 && view0.getBottom() - view0.getTop() > 0) {
                        float f6 = ((float)(v4 + v5)) / 2.0f - ((float)view0.getLeft());
                        float f7 = ((float)(v2 + v3)) / 2.0f - ((float)view0.getTop());
                        view0.setPivotX(f6);
                        view0.setPivotY(f7);
                    }
                }
            }
            HashMap hashMap2 = this.C;
            if(hashMap2 != null) {
                for(Object object2: hashMap2.values()) {
                    SplineSet splineSet0 = (SplineSet)object2;
                    if(splineSet0 instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) {
                        double[] arr_f1 = this.t;
                        if(arr_f1.length > 1) {
                            ((androidx.constraintlayout.motion.utils.ViewSpline.PathRotate)splineSet0).n(view0, f1, arr_f1[0], arr_f1[1]);
                        }
                    }
                }
            }
            if(viewTimeCycle$PathRotate1 != null) {
                z1 |= viewTimeCycle$PathRotate1.k(view0, keyCache0, f1, v, this.t[0], this.t[1]);
            }
            for(int v6 = 1; true; ++v6) {
                CurveFit[] arr_curveFit1 = this.k;
                if(v6 >= arr_curveFit1.length) {
                    break;
                }
                arr_curveFit1[v6].e(f5, this.x);
                CustomSupport.b(((ConstraintAttribute)this.g.o.get(this.u[v6 - 1])), view0, this.x);
            }
            MotionConstrainedPoint motionConstrainedPoint0 = this.i;
            if(motionConstrainedPoint0.b == 0) {
                if(f1 <= 0.0f) {
                    view0.setVisibility(motionConstrainedPoint0.c);
                }
                else if(f1 >= 1.0f) {
                    view0.setVisibility(this.j.c);
                }
                else if(this.j.c != motionConstrainedPoint0.c) {
                    view0.setVisibility(0);
                }
            }
            if(this.E != null) {
                for(int v7 = 0; true; ++v7) {
                    KeyTrigger[] arr_keyTrigger = this.E;
                    if(v7 >= arr_keyTrigger.length) {
                        break;
                    }
                    arr_keyTrigger[v7].A(f1, view0);
                }
            }
        }
        HashMap hashMap3 = this.D;
        if(hashMap3 != null) {
            for(Object object3: hashMap3.values()) {
                ViewOscillator viewOscillator0 = (ViewOscillator)object3;
                if(viewOscillator0 instanceof PathRotateSet) {
                    ((PathRotateSet)viewOscillator0).n(view0, f1, this.t[0], this.t[1]);
                }
                else {
                    viewOscillator0.m(view0, f1);
                }
            }
        }
        return z1;
    }

    String M() {
        return this.b.getContext().getResources().getResourceEntryName(this.b.getId());
    }

    void N(View view0, KeyPositionBase keyPositionBase0, float f, float f1, String[] arr_s, float[] arr_f) {
        RectF rectF0 = new RectF();
        rectF0.left = this.g.e;
        rectF0.top = this.g.f;
        rectF0.right = this.g.e + this.g.g;
        rectF0.bottom = this.g.f + this.g.h;
        RectF rectF1 = new RectF();
        rectF1.left = this.h.e;
        rectF1.top = this.h.f;
        rectF1.right = this.h.e + this.h.g;
        rectF1.bottom = this.h.f + this.h.h;
        keyPositionBase0.s(view0, rectF0, rectF1, f, f1, arr_s, arr_f);
    }

    private void O(MotionPaths motionPaths0) {
        motionPaths0.v(((float)(((int)this.b.getX()))), ((float)(((int)this.b.getY()))), ((float)this.b.getWidth()), ((float)this.b.getHeight()));
    }

    public void P() {
        this.d = true;
    }

    void Q(Rect rect0, Rect rect1, int v, int v1, int v2) {
        switch(v) {
            case 1: {
                int v3 = rect0.left + rect0.right;
                rect1.left = (rect0.top + rect0.bottom - rect0.width()) / 2;
                rect1.top = v2 - (v3 + rect0.height()) / 2;
                rect1.right = rect1.left + rect0.width();
                rect1.bottom = rect1.top + rect0.height();
                return;
            }
            case 2: {
                int v4 = rect0.left + rect0.right;
                rect1.left = v1 - (rect0.top + rect0.bottom + rect0.width()) / 2;
                rect1.top = (v4 - rect0.height()) / 2;
                rect1.right = rect1.left + rect0.width();
                rect1.bottom = rect1.top + rect0.height();
                return;
            }
            case 3: {
                int v5 = rect0.left + rect0.right;
                rect1.left = rect0.height() / 2 + rect0.top - v5 / 2;
                rect1.top = v2 - (v5 + rect0.height()) / 2;
                rect1.right = rect1.left + rect0.width();
                rect1.bottom = rect1.top + rect0.height();
                return;
            }
            case 4: {
                int v6 = rect0.left + rect0.right;
                rect1.left = v1 - (rect0.bottom + rect0.top + rect0.width()) / 2;
                rect1.top = (v6 - rect0.height()) / 2;
                rect1.right = rect1.left + rect0.width();
                rect1.bottom = rect1.top + rect0.height();
            }
        }
    }

    void R(View view0) {
        this.g.c = 0.0f;
        this.g.d = 0.0f;
        this.L = true;
        this.g.v(view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
        this.h.v(view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
        this.i.p(view0);
        this.j.p(view0);
    }

    public void S(int v) {
        this.g.b = v;
    }

    void T(Rect rect0, ConstraintSet constraintSet0, int v, int v1) {
        int v2 = constraintSet0.e;
        if(v2 != 0) {
            this.Q(rect0, this.a, v2, v, v1);
            rect0 = this.a;
        }
        this.h.c = 1.0f;
        this.h.d = 1.0f;
        this.O(this.h);
        this.h.v(((float)rect0.left), ((float)rect0.top), ((float)rect0.width()), ((float)rect0.height()));
        this.h.a(constraintSet0.q0(this.c));
        this.j.n(rect0, constraintSet0, v2, this.c);
    }

    public void U(int v) {
        this.F = v;
    }

    void V(View view0) {
        this.g.c = 0.0f;
        this.g.d = 0.0f;
        this.g.v(view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
        this.i.p(view0);
    }

    void W(Rect rect0, ConstraintSet constraintSet0, int v, int v1) {
        int v2 = constraintSet0.e;
        if(v2 != 0) {
            this.Q(rect0, this.a, v2, v, v1);
        }
        this.g.c = 0.0f;
        this.g.d = 0.0f;
        this.O(this.g);
        this.g.v(((float)rect0.left), ((float)rect0.top), ((float)rect0.width()), ((float)rect0.height()));
        Constraint constraintSet$Constraint0 = constraintSet0.q0(this.c);
        this.g.a(constraintSet$Constraint0);
        this.m = constraintSet$Constraint0.d.g;
        this.i.n(rect0, constraintSet0, v2, this.c);
        this.G = constraintSet$Constraint0.f.i;
        this.I = constraintSet$Constraint0.d.k;
        this.J = constraintSet$Constraint0.d.j;
        this.K = MotionController.v(this.b.getContext(), constraintSet$Constraint0.d.m, constraintSet$Constraint0.d.l, constraintSet$Constraint0.d.n);
    }

    public void X(ViewState viewState0, View view0, int v, int v1, int v2) {
        this.g.c = 0.0f;
        this.g.d = 0.0f;
        Rect rect0 = new Rect();
        switch(v) {
            case 1: {
                int v3 = viewState0.b + viewState0.d;
                rect0.left = (viewState0.c + viewState0.e - viewState0.c()) / 2;
                rect0.top = v1 - (v3 + viewState0.b()) / 2;
                rect0.right = rect0.left + viewState0.c();
                rect0.bottom = rect0.top + viewState0.b();
                break;
            }
            case 2: {
                int v4 = viewState0.b + viewState0.d;
                rect0.left = v2 - (viewState0.c + viewState0.e + viewState0.c()) / 2;
                rect0.top = (v4 - viewState0.b()) / 2;
                rect0.right = rect0.left + viewState0.c();
                rect0.bottom = rect0.top + viewState0.b();
            }
        }
        this.g.v(((float)rect0.left), ((float)rect0.top), ((float)rect0.width()), ((float)rect0.height()));
        this.i.m(rect0, view0, v, viewState0.a);
    }

    public void Y(int v) {
        this.G = v;
        this.H = null;
    }

    public void Z(View view0) {
        this.b = view0;
        this.c = view0.getId();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            this.e = ((LayoutParams)viewGroup$LayoutParams0).a();
        }
    }

    public void a(Key key0) {
        this.A.add(key0);
    }

    public void a0(int v, int v1, float f, long v2) {
        double[][] arr2_f1;
        String[] arr_s1;
        ViewTimeCycle viewTimeCycle0;
        int v5;
        ViewSpline viewSpline0;
        ArrayList arrayList1;
        new HashSet();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap0 = new HashMap();
        int v3 = this.F;
        if(v3 != Key.f) {
            this.g.k = v3;
        }
        this.i.f(this.j, hashSet1);
        ArrayList arrayList0 = this.A;
        if(arrayList0 == null) {
            arrayList1 = null;
        }
        else {
            arrayList1 = null;
            for(Object object0: arrayList0) {
                Key key0 = (Key)object0;
                if(key0 instanceof KeyPosition) {
                    this.K(new MotionPaths(v, v1, ((KeyPosition)key0), this.g, this.h));
                    int v4 = ((KeyPosition)key0).D;
                    if(v4 == Key.f) {
                        continue;
                    }
                    this.f = v4;
                }
                else if(key0 instanceof KeyCycle) {
                    key0.d(hashSet2);
                }
                else if(key0 instanceof KeyTimeCycle) {
                    key0.d(hashSet0);
                }
                else if(key0 instanceof KeyTrigger) {
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    arrayList1.add(((KeyTrigger)key0));
                }
                else {
                    key0.i(hashMap0);
                    key0.d(hashSet1);
                }
            }
        }
        if(arrayList1 != null) {
            this.E = (KeyTrigger[])arrayList1.toArray(new KeyTrigger[0]);
        }
        if(!hashSet1.isEmpty()) {
            this.C = new HashMap();
            for(Object object1: hashSet1) {
                String s = (String)object1;
                if(s.startsWith("CUSTOM,")) {
                    SparseArray sparseArray0 = new SparseArray();
                    String s1 = s.split(",")[1];
                    for(Object object2: this.A) {
                        Key key1 = (Key)object2;
                        HashMap hashMap1 = key1.e;
                        if(hashMap1 != null) {
                            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap1.get(s1);
                            if(constraintAttribute0 != null) {
                                sparseArray0.append(key1.a, constraintAttribute0);
                            }
                        }
                    }
                    viewSpline0 = ViewSpline.k(s, sparseArray0);
                }
                else {
                    viewSpline0 = ViewSpline.l(s);
                }
                if(viewSpline0 != null) {
                    viewSpline0.i(s);
                    this.C.put(s, viewSpline0);
                }
            }
            ArrayList arrayList2 = this.A;
            if(arrayList2 != null) {
                for(Object object3: arrayList2) {
                    Key key2 = (Key)object3;
                    if(key2 instanceof KeyAttributes) {
                        key2.a(this.C);
                    }
                }
            }
            this.i.a(this.C, 0);
            this.j.a(this.C, 100);
            for(Object object4: this.C.keySet()) {
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
                SplineSet splineSet0 = (SplineSet)this.C.get(s2);
                if(splineSet0 != null) {
                    splineSet0.j(v5);
                }
            }
        }
        if(!hashSet0.isEmpty()) {
            if(this.B == null) {
                this.B = new HashMap();
            }
            for(Object object5: hashSet0) {
                String s3 = (String)object5;
                if(!this.B.containsKey(s3)) {
                    if(s3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray1 = new SparseArray();
                        String s4 = s3.split(",")[1];
                        for(Object object6: this.A) {
                            Key key3 = (Key)object6;
                            HashMap hashMap2 = key3.e;
                            if(hashMap2 != null) {
                                ConstraintAttribute constraintAttribute1 = (ConstraintAttribute)hashMap2.get(s4);
                                if(constraintAttribute1 != null) {
                                    sparseArray1.append(key3.a, constraintAttribute1);
                                }
                            }
                        }
                        viewTimeCycle0 = ViewTimeCycle.h(s3, sparseArray1);
                    }
                    else {
                        viewTimeCycle0 = ViewTimeCycle.i(s3, v2);
                    }
                    if(viewTimeCycle0 != null) {
                        viewTimeCycle0.e(s3);
                        this.B.put(s3, viewTimeCycle0);
                    }
                }
            }
            ArrayList arrayList3 = this.A;
            if(arrayList3 != null) {
                for(Object object7: arrayList3) {
                    Key key4 = (Key)object7;
                    if(key4 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle)key4).W(this.B);
                    }
                }
            }
            for(Object object8: this.B.keySet()) {
                String s5 = (String)object8;
                int v6 = hashMap0.containsKey(s5) ? ((int)(((Integer)hashMap0.get(s5)))) : 0;
                ((ViewTimeCycle)this.B.get(s5)).f(v6);
            }
        }
        int v7 = this.y.size();
        MotionPaths[] arr_motionPaths = new MotionPaths[v7 + 2];
        arr_motionPaths[0] = this.g;
        arr_motionPaths[v7 + 1] = this.h;
        if(this.y.size() > 0 && this.f == -1) {
            this.f = 0;
        }
        int v8 = 1;
        for(Object object9: this.y) {
            arr_motionPaths[v8] = (MotionPaths)object9;
            ++v8;
        }
        HashSet hashSet3 = new HashSet();
        for(Object object10: this.h.o.keySet()) {
            String s6 = (String)object10;
            if(this.g.o.containsKey(s6) && !hashSet1.contains("CUSTOM," + s6)) {
                hashSet3.add(s6);
            }
        }
        String[] arr_s = (String[])hashSet3.toArray(new String[0]);
        this.u = arr_s;
        this.v = new int[arr_s.length];
        for(int v9 = 0; true; ++v9) {
            arr_s1 = this.u;
            if(v9 >= arr_s1.length) {
                break;
            }
            String s7 = arr_s1[v9];
            this.v[v9] = 0;
            for(int v10 = 0; v10 < v7 + 2; ++v10) {
                if(arr_motionPaths[v10].o.containsKey(s7)) {
                    ConstraintAttribute constraintAttribute2 = (ConstraintAttribute)arr_motionPaths[v10].o.get(s7);
                    if(constraintAttribute2 != null) {
                        this.v[v9] += constraintAttribute2.p();
                        break;
                    }
                }
            }
        }
        boolean z = arr_motionPaths[0].k != Key.f;
        int v11 = arr_s1.length + 18;
        boolean[] arr_z = new boolean[v11];
        for(int v12 = 1; v12 < v7 + 2; ++v12) {
            arr_motionPaths[v12].e(arr_motionPaths[v12 - 1], arr_z, this.u, z);
        }
        int v14 = 0;
        for(int v13 = 1; v13 < v11; ++v13) {
            if(arr_z[v13]) {
                ++v14;
            }
        }
        this.r = new int[v14];
        int v15 = Math.max(2, v14);
        this.s = new double[v15];
        this.t = new double[v15];
        int v17 = 0;
        for(int v16 = 1; v16 < v11; ++v16) {
            if(arr_z[v16]) {
                this.r[v17] = v16;
                ++v17;
            }
        }
        double[][] arr2_f = new double[v7 + 2][this.r.length];
        double[] arr_f = new double[v7 + 2];
        for(int v18 = 0; v18 < v7 + 2; ++v18) {
            arr_motionPaths[v18].f(arr2_f[v18], this.r);
            arr_f[v18] = (double)arr_motionPaths[v18].c;
        }
        for(int v19 = 0; true; ++v19) {
            int[] arr_v = this.r;
            if(v19 >= arr_v.length) {
                break;
            }
            if(arr_v[v19] < MotionPaths.F.length) {
                String s8 = MotionPaths.F[this.r[v19]] + " [";
                for(int v20 = 0; v20 < v7 + 2; ++v20) {
                    s8 = s8 + arr2_f[v20][v19];
                }
            }
        }
        this.k = new CurveFit[this.u.length + 1];
        int v21 = 0;
        while(true) {
            String[] arr_s2 = this.u;
            if(v21 >= arr_s2.length) {
                break;
            }
            String s9 = arr_s2[v21];
            int v22 = 0;
            double[] arr_f1 = null;
            int v23 = 0;
            Object[] arr_object = null;
            while(v22 < v7 + 2) {
                if(arr_motionPaths[v22].n(s9)) {
                    if(arr_object == null) {
                        arr_f1 = new double[v7 + 2];
                        int[] arr_v1 = {v7 + 2, arr_motionPaths[v22].l(s9)};
                        arr_object = (double[][])Array.newInstance(Double.TYPE, arr_v1);
                    }
                    MotionPaths motionPaths0 = arr_motionPaths[v22];
                    arr2_f1 = arr2_f;
                    arr_f1[v23] = (double)motionPaths0.c;
                    motionPaths0.k(s9, ((double[])arr_object[v23]), 0);
                    ++v23;
                }
                else {
                    arr2_f1 = arr2_f;
                }
                ++v22;
                arr2_f = arr2_f1;
            }
            double[] arr_f2 = Arrays.copyOf(arr_f1, v23);
            double[][] arr2_f2 = (double[][])Arrays.copyOf(arr_object, v23);
            CurveFit[] arr_curveFit = this.k;
            ++v21;
            arr_curveFit[v21] = CurveFit.a(this.f, arr_f2, arr2_f2);
        }
        CurveFit[] arr_curveFit1 = this.k;
        arr_curveFit1[0] = CurveFit.a(this.f, arr_f, arr2_f);
        if(arr_motionPaths[0].k != Key.f) {
            int[] arr_v2 = new int[v7 + 2];
            double[] arr_f3 = new double[v7 + 2];
            double[][] arr2_f3 = new double[v7 + 2][2];
            for(int v24 = 0; v24 < v7 + 2; ++v24) {
                MotionPaths motionPaths1 = arr_motionPaths[v24];
                arr_v2[v24] = motionPaths1.k;
                arr_f3[v24] = (double)motionPaths1.c;
                double[] arr_f4 = arr2_f3[v24];
                arr_f4[0] = (double)motionPaths1.e;
                arr_f4[1] = (double)motionPaths1.f;
            }
            this.l = CurveFit.b(arr_v2, arr_f3, arr2_f3);
        }
        this.D = new HashMap();
        if(this.A != null) {
            float f1 = NaNf;
            for(Object object11: hashSet2) {
                String s10 = (String)object11;
                ViewOscillator viewOscillator0 = ViewOscillator.l(s10);
                if(viewOscillator0 != null) {
                    if(viewOscillator0.k() && Float.isNaN(f1)) {
                        f1 = this.D();
                    }
                    viewOscillator0.i(s10);
                    this.D.put(s10, viewOscillator0);
                }
            }
            for(Object object12: this.A) {
                Key key5 = (Key)object12;
                if(key5 instanceof KeyCycle) {
                    ((KeyCycle)key5).a0(this.D);
                }
            }
            for(Object object13: this.D.values()) {
                ((ViewOscillator)object13).j(f1);
            }
        }
    }

    void b(ArrayList arrayList0) {
        this.A.addAll(arrayList0);
    }

    public void b0(MotionController motionController0) {
        this.g.z(motionController0, motionController0.g);
        this.h.z(motionController0, motionController0.h);
    }

    void c(float[] arr_f, int v) {
        HashMap hashMap0 = this.C;
        if(hashMap0 != null) {
            SplineSet splineSet0 = (SplineSet)hashMap0.get("translationX");
        }
        HashMap hashMap1 = this.C;
        if(hashMap1 != null) {
            SplineSet splineSet1 = (SplineSet)hashMap1.get("translationY");
        }
        HashMap hashMap2 = this.D;
        if(hashMap2 != null) {
            ViewOscillator viewOscillator0 = (ViewOscillator)hashMap2.get("translationX");
        }
        HashMap hashMap3 = this.D;
        if(hashMap3 != null) {
            ViewOscillator viewOscillator1 = (ViewOscillator)hashMap3.get("translationY");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            float f = ((float)v1) * (1.0f / ((float)(v - 1)));
            float f1 = this.o;
            float f2 = 0.0f;
            if(f1 != 1.0f) {
                float f3 = this.n;
                if(f < f3) {
                    f = 0.0f;
                }
                if(f > f3 && ((double)f) < 1.0) {
                    f = Math.min((f - f3) * f1, 1.0f);
                }
            }
            double f4 = (double)f;
            Easing easing0 = this.g.a;
            float f5 = NaNf;
            for(Object object0: this.y) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.a;
                if(easing1 != null) {
                    float f6 = motionPaths0.c;
                    if(f6 < f) {
                        easing0 = easing1;
                        f2 = f6;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.c;
                    }
                }
            }
            if(easing0 != null) {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f4 = (double)(((float)easing0.a(((double)((f - f2) / (f5 - f2))))) * (f5 - f2) + f2);
            }
            this.k[0].d(f4, this.s);
            CurveFit curveFit0 = this.l;
            if(curveFit0 != null) {
                double[] arr_f1 = this.s;
                if(arr_f1.length > 0) {
                    curveFit0.d(f4, arr_f1);
                }
            }
            this.g.g(this.r, this.s, arr_f, v1 * 2);
        }
    }

    int d(float[] arr_f, int[] arr_v) {
        if(arr_f != null) {
            double[] arr_f1 = this.k[0].h();
            if(arr_v != null) {
                int v = 0;
                for(Object object0: this.y) {
                    arr_v[v] = ((MotionPaths)object0).p;
                    ++v;
                }
            }
            int v2 = 0;
            for(int v1 = 0; v1 < arr_f1.length; ++v1) {
                this.k[0].d(arr_f1[v1], this.s);
                this.g.g(this.r, this.s, arr_f, v2);
                v2 += 2;
            }
            return v2 / 2;
        }
        return 0;
    }

    int e(float[] arr_f, int[] arr_v) {
        if(arr_f != null) {
            double[] arr_f1 = this.k[0].h();
            if(arr_v != null) {
                int v = 0;
                for(Object object0: this.y) {
                    arr_v[v] = ((MotionPaths)object0).p;
                    ++v;
                }
            }
            int v2 = 0;
            for(int v1 = 0; v1 < arr_f1.length; ++v1) {
                this.k[0].d(arr_f1[v1], this.s);
                this.g.h(arr_f1[v1], this.r, this.s, arr_f, v2);
                v2 += 2;
            }
            return v2 / 2;
        }
        return 0;
    }

    void f(float[] arr_f, int v) {
        ViewOscillator viewOscillator0 = null;
        SplineSet splineSet0 = this.C == null ? null : ((SplineSet)this.C.get("translationX"));
        SplineSet splineSet1 = this.C == null ? null : ((SplineSet)this.C.get("translationY"));
        ViewOscillator viewOscillator1 = this.D == null ? null : ((ViewOscillator)this.D.get("translationX"));
        HashMap hashMap0 = this.D;
        if(hashMap0 != null) {
            viewOscillator0 = (ViewOscillator)hashMap0.get("translationY");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            float f = ((float)v1) * (1.0f / ((float)(v - 1)));
            float f1 = this.o;
            float f2 = 0.0f;
            if(f1 != 1.0f) {
                float f3 = this.n;
                if(f < f3) {
                    f = 0.0f;
                }
                if(f > f3 && ((double)f) < 1.0) {
                    f = Math.min((f - f3) * f1, 1.0f);
                }
            }
            double f4 = (double)f;
            Easing easing0 = this.g.a;
            float f5 = NaNf;
            for(Object object0: this.y) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.a;
                if(easing1 != null) {
                    float f6 = motionPaths0.c;
                    if(f6 < f) {
                        f2 = f6;
                        easing0 = easing1;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.c;
                    }
                }
            }
            if(easing0 != null) {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f4 = (double)(((float)easing0.a(((double)((f - f2) / (f5 - f2))))) * (f5 - f2) + f2);
            }
            this.k[0].d(f4, this.s);
            CurveFit curveFit0 = this.l;
            if(curveFit0 != null) {
                double[] arr_f1 = this.s;
                if(arr_f1.length > 0) {
                    curveFit0.d(f4, arr_f1);
                }
            }
            this.g.h(f4, this.r, this.s, arr_f, v1 * 2);
            if(viewOscillator1 != null) {
                arr_f[v1 * 2] += viewOscillator1.a(f);
            }
            else if(splineSet0 != null) {
                arr_f[v1 * 2] += splineSet0.a(f);
            }
            if(viewOscillator0 != null) {
                int v2 = v1 * 2 + 1;
                arr_f[v2] += viewOscillator0.a(f);
            }
            else if(splineSet1 != null) {
                int v3 = v1 * 2 + 1;
                arr_f[v3] += splineSet1.a(f);
            }
        }
    }

    void g(float f, float[] arr_f, int v) {
        float f1 = this.j(f, null);
        this.k[0].d(((double)f1), this.s);
        this.g.m(this.r, this.s, arr_f, v);
    }

    void h(float[] arr_f, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            float f = this.j(((float)v1) * (1.0f / ((float)(v - 1))), null);
            this.k[0].d(((double)f), this.s);
            this.g.m(this.r, this.s, arr_f, v1 * 8);
        }
    }

    void i(boolean z) {
        if("button".equals(Debug.k(this.b)) && this.E != null) {
            for(int v = 0; true; ++v) {
                KeyTrigger[] arr_keyTrigger = this.E;
                if(v >= arr_keyTrigger.length) {
                    break;
                }
                arr_keyTrigger[v].A((z ? -100.0f : 100.0f), this.b);
            }
        }
    }

    private float j(float f, float[] arr_f) {
        float f1 = 0.0f;
        float f2 = 1.0f;
        if(arr_f == null) {
            float f3 = this.o;
            if(((double)f3) != 1.0) {
                float f4 = this.n;
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
        Easing easing0 = this.g.a;
        float f5 = NaNf;
        for(Object object0: this.y) {
            MotionPaths motionPaths0 = (MotionPaths)object0;
            Easing easing1 = motionPaths0.a;
            if(easing1 != null) {
                float f6 = motionPaths0.c;
                if(f6 < f) {
                    easing0 = easing1;
                    f1 = f6;
                }
                else if(Float.isNaN(f5)) {
                    f5 = motionPaths0.c;
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

    public int k() {
        return this.g.l;
    }

    int l(String s, float[] arr_f, int v) {
        SplineSet splineSet0 = (SplineSet)this.C.get(s);
        if(splineSet0 == null) {
            return -1;
        }
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            arr_f[v1] = splineSet0.a(((float)(v1 / (arr_f.length - 1))));
        }
        return arr_f.length;
    }

    public void m(double f, float[] arr_f, float[] arr_f1) {
        double[] arr_f2 = new double[4];
        double[] arr_f3 = new double[4];
        this.k[0].d(f, arr_f2);
        this.k[0].g(f, arr_f3);
        Arrays.fill(arr_f1, 0.0f);
        this.g.i(f, this.r, arr_f2, arr_f, arr_f3, arr_f1);
    }

    public float n() {
        return this.p;
    }

    public float o() {
        return this.q;
    }

    void p(float f, float f1, float f2, float[] arr_f) {
        double[] arr_f1;
        float f3 = this.j(f, this.z);
        CurveFit[] arr_curveFit = this.k;
        if(arr_curveFit != null) {
            arr_curveFit[0].g(((double)f3), this.t);
            this.k[0].d(((double)f3), this.s);
            float f4 = this.z[0];
            for(int v = 0; true; ++v) {
                arr_f1 = this.t;
                if(v >= arr_f1.length) {
                    break;
                }
                arr_f1[v] *= (double)f4;
            }
            CurveFit curveFit0 = this.l;
            if(curveFit0 != null) {
                double[] arr_f2 = this.s;
                if(arr_f2.length > 0) {
                    curveFit0.d(((double)f3), arr_f2);
                    this.l.g(((double)f3), this.t);
                    this.g.w(f1, f2, arr_f, this.r, this.t, this.s);
                }
                return;
            }
            this.g.w(f1, f2, arr_f, this.r, arr_f1, this.s);
            return;
        }
        float f5 = this.h.e - this.g.e;
        float f6 = this.h.f - this.g.f;
        float f7 = this.h.h - this.g.h + f6;
        arr_f[0] = f5 * (1.0f - f1) + (this.h.g - this.g.g + f5) * f1;
        arr_f[1] = f6 * (1.0f - f2) + f7 * f2;
    }

    public int q() {
        int v = this.g.b;
        for(Object object0: this.y) {
            v = Math.max(v, ((MotionPaths)object0).b);
        }
        return Math.max(v, this.h.b);
    }

    public float r() {
        return this.h.h;
    }

    public float s() {
        return this.h.g;
    }

    public float t() {
        return this.h.e;
    }

    @Override
    public String toString() {
        return " start: x: " + this.g.e + " y: " + this.g.f + " end: x: " + this.h.e + " y: " + this.h.f;
    }

    public float u() {
        return this.h.f;
    }

    private static Interpolator v(Context context0, int v, String s, int v1) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new Interpolator() {
                        @Override  // android.animation.TimeInterpolator
                        public float getInterpolation(float f) {
                            return (float)Easing.c(s).a(((double)f));
                        }
                    };
                }
                case 0: {
                    return new AccelerateDecelerateInterpolator();
                }
                case 1: {
                    return new AccelerateInterpolator();
                }
                case 2: {
                    return new DecelerateInterpolator();
                }
                case 4: {
                    return new BounceInterpolator();
                }
                case 5: {
                    return new OvershootInterpolator();
                }
                default: {
                    return null;
                }
            }
        }
        return AnimationUtils.loadInterpolator(context0, v1);
    }

    MotionPaths w(int v) {
        return (MotionPaths)this.y.get(v);
    }

    public int x(int v, int[] arr_v) {
        float[] arr_f = new float[2];
        int v1 = 0;
        int v2 = 0;
        for(Object object0: this.A) {
            Key key0 = (Key)object0;
            int v3 = key0.d;
            if(v3 == v || v != -1) {
                arr_v[v2] = 0;
                arr_v[v2 + 1] = v3;
                int v4 = key0.a;
                arr_v[v2 + 2] = v4;
                double f = (double)(((float)v4) / 100.0f);
                this.k[0].d(f, this.s);
                this.g.h(f, this.r, this.s, arr_f, 0);
                arr_v[v2 + 3] = Float.floatToIntBits(arr_f[0]);
                int v5 = v2 + 4;
                arr_v[v5] = Float.floatToIntBits(arr_f[1]);
                if(key0 instanceof KeyPosition) {
                    arr_v[v2 + 5] = ((KeyPosition)key0).O;
                    arr_v[v2 + 6] = Float.floatToIntBits(((KeyPosition)key0).K);
                    v5 = v2 + 7;
                    arr_v[v5] = Float.floatToIntBits(((KeyPosition)key0).L);
                }
                arr_v[v2] = v5 + 1 - v2;
                ++v1;
                v2 = v5 + 1;
            }
        }
        return v1;
    }

    float y(int v, float f, float f1) {
        float f2 = this.h.e - this.g.e;
        float f3 = this.h.f - this.g.f;
        float f4 = this.g.e + this.g.g / 2.0f;
        float f5 = this.g.f + this.g.h / 2.0f;
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

    public int z(int[] arr_v, float[] arr_f) {
        int v = 0;
        int v1 = 0;
        for(Object object0: this.A) {
            int v2 = ((Key)object0).a;
            arr_v[v] = ((Key)object0).d * 1000 + v2;
            double f = (double)(((float)v2) / 100.0f);
            this.k[0].d(f, this.s);
            this.g.h(f, this.r, this.s, arr_f, v1);
            v1 += 2;
            ++v;
        }
        return v;
    }
}

