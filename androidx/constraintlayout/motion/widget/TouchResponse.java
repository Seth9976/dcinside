package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R.styleable;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

class TouchResponse {
    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private int F;
    private static final String G = "TouchResponse";
    private static final boolean H = false;
    private static final int I = 1000;
    private static final float J = 1.000000E-07f;
    private static final float[][] K = null;
    private static final float[][] L = null;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 4;
    private static final int X = 5;
    private static final int Y = 6;
    static final int Z = 1;
    private int a;
    static final int a0 = 2;
    private int b;
    static final int b0 = 4;
    private int c;
    public static final int c0 = 0;
    private int d;
    public static final int d0 = 1;
    private int e;
    private int f;
    private float g;
    private float h;
    float i;
    float j;
    private int k;
    boolean l;
    private float m;
    private float n;
    private boolean o;
    private float[] p;
    private int[] q;
    private float r;
    private float s;
    private final MotionLayout t;
    private float u;
    private float v;
    private boolean w;
    private float x;
    private int y;
    private float z;

    static {
        TouchResponse.K = new float[][]{new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        TouchResponse.L = new float[][]{new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    }

    TouchResponse(Context context0, MotionLayout motionLayout0, XmlPullParser xmlPullParser0) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = -1;
        this.l = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.o = false;
        this.p = new float[2];
        this.q = new int[2];
        this.u = 4.0f;
        this.v = 1.2f;
        this.w = true;
        this.x = 1.0f;
        this.y = 0;
        this.z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = NaNf;
        this.D = NaNf;
        this.E = 0;
        this.F = 0;
        this.t = motionLayout0;
        this.c(context0, Xml.asAttributeSet(xmlPullParser0));
    }

    TouchResponse(MotionLayout motionLayout0, OnSwipe onSwipe0) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = -1;
        this.l = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.o = false;
        this.p = new float[2];
        this.q = new int[2];
        this.u = 4.0f;
        this.v = 1.2f;
        this.w = true;
        this.x = 1.0f;
        this.y = 0;
        this.z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = NaNf;
        this.D = NaNf;
        this.E = 0;
        this.F = 0;
        this.t = motionLayout0;
        this.d = onSwipe0.q();
        int v = onSwipe0.r();
        this.a = v;
        if(v != -1) {
            float[] arr_f = TouchResponse.K[v];
            this.h = arr_f[0];
            this.g = arr_f[1];
        }
        int v1 = onSwipe0.b();
        this.b = v1;
        float[][] arr2_f = TouchResponse.L;
        if(v1 < arr2_f.length) {
            float[] arr_f1 = arr2_f[v1];
            this.m = arr_f1[0];
            this.n = arr_f1[1];
        }
        else {
            this.n = NaNf;
            this.m = NaNf;
            this.l = true;
        }
        this.u = onSwipe0.g();
        this.v = onSwipe0.f();
        this.w = onSwipe0.h();
        this.x = onSwipe0.c();
        this.z = onSwipe0.d();
        this.e = onSwipe0.s();
        this.c = onSwipe0.j();
        this.y = onSwipe0.i();
        this.f = onSwipe0.e();
        this.k = onSwipe0.k();
        this.E = onSwipe0.l();
        this.A = onSwipe0.m();
        this.B = onSwipe0.n();
        this.C = onSwipe0.o();
        this.D = onSwipe0.p();
        this.F = onSwipe0.a();
    }

    void A(float f, float f1) {
        this.r = f;
        this.s = f1;
    }

    public void B(float f) {
        this.v = f;
    }

    public void C(float f) {
        this.u = f;
    }

    public void D(boolean z) {
        if(z) {
            TouchResponse.L[4] = TouchResponse.L[3];
            TouchResponse.L[5] = TouchResponse.L[2];
            TouchResponse.K[5] = TouchResponse.K[2];
            TouchResponse.K[6] = TouchResponse.K[1];
        }
        else {
            TouchResponse.L[4] = TouchResponse.L[2];
            TouchResponse.L[5] = TouchResponse.L[3];
            TouchResponse.K[5] = TouchResponse.K[1];
            TouchResponse.K[6] = TouchResponse.K[2];
        }
        float[] arr_f = TouchResponse.K[this.a];
        this.h = arr_f[0];
        this.g = arr_f[1];
        int v = this.b;
        float[][] arr2_f = TouchResponse.L;
        if(v >= arr2_f.length) {
            return;
        }
        float[] arr_f1 = arr2_f[v];
        this.m = arr_f1[0];
        this.n = arr_f1[1];
    }

    public void E(float f, float f1) {
        this.h = f;
        this.g = f1;
    }

    public void F(int v) {
        this.c = v;
    }

    void G(float f, float f1) {
        this.r = f;
        this.s = f1;
        this.o = false;
    }

    void H() {
        View view0;
        int v = this.d;
        if(v == -1) {
            view0 = null;
        }
        else {
            view0 = this.t.findViewById(v);
            if(view0 == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.i(this.t.getContext(), this.d));
            }
        }
        if(view0 instanceof NestedScrollView) {
            ((NestedScrollView)view0).setOnTouchListener(new View.OnTouchListener() {
                final TouchResponse a;

                @Override  // android.view.View$OnTouchListener
                public boolean onTouch(View view0, MotionEvent motionEvent0) {
                    return false;
                }
            });
            ((NestedScrollView)view0).setOnScrollChangeListener(new OnScrollChangeListener() {
                final TouchResponse a;

                @Override  // androidx.core.widget.NestedScrollView$OnScrollChangeListener
                public void a(NestedScrollView nestedScrollView0, int v, int v1, int v2, int v3) {
                }
            });
        }
    }

    float a(float f, float f1) {
        return f * this.m + f1 * this.n;
    }

    private void b(TypedArray typedArray0) {
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.OnSwipe_touchAnchorId) {
                this.d = typedArray0.getResourceId(v2, this.d);
            }
            else if(v2 == styleable.OnSwipe_touchAnchorSide) {
                int v3 = typedArray0.getInt(v2, this.a);
                this.a = v3;
                float[] arr_f = TouchResponse.K[v3];
                this.h = arr_f[0];
                this.g = arr_f[1];
            }
            else if(v2 == styleable.OnSwipe_dragDirection) {
                int v4 = typedArray0.getInt(v2, this.b);
                this.b = v4;
                float[][] arr2_f = TouchResponse.L;
                if(v4 < arr2_f.length) {
                    float[] arr_f1 = arr2_f[v4];
                    this.m = arr_f1[0];
                    this.n = arr_f1[1];
                }
                else {
                    this.n = NaNf;
                    this.m = NaNf;
                    this.l = true;
                }
            }
            else if(v2 == styleable.OnSwipe_maxVelocity) {
                this.u = typedArray0.getFloat(v2, this.u);
            }
            else if(v2 == styleable.OnSwipe_maxAcceleration) {
                this.v = typedArray0.getFloat(v2, this.v);
            }
            else if(v2 == styleable.OnSwipe_moveWhenScrollAtTop) {
                this.w = typedArray0.getBoolean(v2, this.w);
            }
            else if(v2 == styleable.OnSwipe_dragScale) {
                this.x = typedArray0.getFloat(v2, this.x);
            }
            else if(v2 == styleable.OnSwipe_dragThreshold) {
                this.z = typedArray0.getFloat(v2, this.z);
            }
            else if(v2 == styleable.OnSwipe_touchRegionId) {
                this.e = typedArray0.getResourceId(v2, this.e);
            }
            else if(v2 == styleable.OnSwipe_onTouchUp) {
                this.c = typedArray0.getInt(v2, this.c);
            }
            else if(v2 == styleable.OnSwipe_nestedScrollFlags) {
                this.y = typedArray0.getInteger(v2, 0);
            }
            else if(v2 == styleable.OnSwipe_limitBoundsTo) {
                this.f = typedArray0.getResourceId(v2, 0);
            }
            else if(v2 == styleable.OnSwipe_rotationCenterId) {
                this.k = typedArray0.getResourceId(v2, this.k);
            }
            else if(v2 == styleable.OnSwipe_springDamping) {
                this.A = typedArray0.getFloat(v2, this.A);
            }
            else if(v2 == styleable.OnSwipe_springMass) {
                this.B = typedArray0.getFloat(v2, this.B);
            }
            else if(v2 == styleable.OnSwipe_springStiffness) {
                this.C = typedArray0.getFloat(v2, this.C);
            }
            else if(v2 == styleable.OnSwipe_springStopThreshold) {
                this.D = typedArray0.getFloat(v2, this.D);
            }
            else if(v2 == styleable.OnSwipe_springBoundary) {
                this.E = typedArray0.getInt(v2, this.E);
            }
            else if(v2 == styleable.OnSwipe_autoCompleteMode) {
                this.F = typedArray0.getInt(v2, this.F);
            }
        }
    }

    private void c(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.OnSwipe);
        this.b(typedArray0);
        typedArray0.recycle();
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.F;
    }

    public int f() {
        return this.y;
    }

    RectF g(ViewGroup viewGroup0, RectF rectF0) {
        int v = this.f;
        if(v == -1) {
            return null;
        }
        View view0 = viewGroup0.findViewById(v);
        if(view0 == null) {
            return null;
        }
        rectF0.set(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom()));
        return rectF0;
    }

    int h() {
        return this.f;
    }

    float i() {
        return this.v;
    }

    public float j() {
        return this.u;
    }

    boolean k() {
        return this.w;
    }

    float l(float f, float f1) {
        this.t.t0(this.d, this.t.getProgress(), this.h, this.g, this.p);
        float f2 = this.m;
        if(f2 != 0.0f) {
            float[] arr_f = this.p;
            if(arr_f[0] == 0.0f) {
                arr_f[0] = 1.000000E-07f;
            }
            return f * f2 / arr_f[0];
        }
        float[] arr_f1 = this.p;
        if(arr_f1[1] == 0.0f) {
            arr_f1[1] = 1.000000E-07f;
        }
        return f1 * this.n / arr_f1[1];
    }

    public int m() {
        return this.E;
    }

    public float n() {
        return this.A;
    }

    public float o() {
        return this.B;
    }

    public float p() {
        return this.C;
    }

    public float q() {
        return this.D;
    }

    RectF r(ViewGroup viewGroup0, RectF rectF0) {
        int v = this.e;
        if(v == -1) {
            return null;
        }
        View view0 = viewGroup0.findViewById(v);
        if(view0 == null) {
            return null;
        }
        rectF0.set(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom()));
        return rectF0;
    }

    int s() {
        return this.e;
    }

    boolean t() {
        return this.o;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return Float.isNaN(this.m) ? "rotation" : this.m + " , " + this.n;
    }

    void u(MotionEvent motionEvent0, MotionTracker motionLayout$MotionTracker0, int v, MotionScene motionScene0) {
        if(this.l) {
            this.v(motionEvent0, motionLayout$MotionTracker0, v, motionScene0);
            return;
        }
        motionLayout$MotionTracker0.b(motionEvent0);
        switch(motionEvent0.getAction()) {
            case 0: {
                this.r = motionEvent0.getRawX();
                this.s = motionEvent0.getRawY();
                this.o = false;
                return;
            }
            case 1: {
                this.o = false;
                motionLayout$MotionTracker0.e(1000);
                float f = motionLayout$MotionTracker0.f();
                float f1 = motionLayout$MotionTracker0.c();
                float f2 = this.t.getProgress();
                int v1 = this.d;
                if(v1 == -1) {
                    float f3 = (float)Math.min(this.t.getWidth(), this.t.getHeight());
                    float[] arr_f = this.p;
                    arr_f[1] = this.n * f3;
                    arr_f[0] = f3 * this.m;
                }
                else {
                    this.t.t0(v1, f2, this.h, this.g, this.p);
                }
                float f4 = this.m == 0.0f ? f1 / this.p[1] : f / this.p[0];
                float f5 = Float.isNaN(f4) ? f2 : f4 / 3.0f + f2;
                if(f5 == 0 || f5 == 0x3F800000) {
                label_41:
                    if(0.0f >= f5 || 1.0f <= f5) {
                        this.t.setState(TransitionState.d);
                        return;
                    }
                }
                else {
                    int v2 = this.c;
                    if(v2 == 3) {
                        goto label_41;
                    }
                    else {
                        float f6 = ((double)f5) < 0.5 ? 0.0f : 1.0f;
                        if(v2 == 6) {
                            if(f2 + f4 < 0.0f) {
                                f4 = Math.abs(f4);
                            }
                            f6 = 1.0f;
                        }
                        if(this.c == 7) {
                            if(f2 + f4 > 1.0f) {
                                f4 = -Math.abs(f4);
                            }
                            f6 = 0.0f;
                        }
                        this.t.U0(this.c, f6, f4);
                        if(0.0f >= f2 || 1.0f <= f2) {
                            this.t.setState(TransitionState.d);
                            return;
                        }
                    }
                }
                break;
            }
            case 2: {
                float f7 = motionEvent0.getRawY() - this.s;
                float f8 = motionEvent0.getRawX() - this.r;
                if(Math.abs(this.m * f8 + this.n * f7) > this.z || this.o) {
                    float f9 = this.t.getProgress();
                    if(!this.o) {
                        this.o = true;
                        this.t.setProgress(f9);
                    }
                    int v3 = this.d;
                    if(v3 == -1) {
                        float f10 = (float)Math.min(this.t.getWidth(), this.t.getHeight());
                        float[] arr_f1 = this.p;
                        arr_f1[1] = this.n * f10;
                        arr_f1[0] = f10 * this.m;
                    }
                    else {
                        this.t.t0(v3, f9, this.h, this.g, this.p);
                    }
                    if(((double)Math.abs((this.m * this.p[0] + this.n * this.p[1]) * this.x)) < 0.01) {
                        float[] arr_f2 = this.p;
                        arr_f2[0] = 0.01f;
                        arr_f2[1] = 0.01f;
                    }
                    float f11 = this.m == 0.0f ? f7 / this.p[1] : f8 / this.p[0];
                    float f12 = this.c == 6 ? Math.max(Math.max(Math.min(f9 + f11, 1.0f), 0.0f), 0.01f) : Math.max(Math.min(f9 + f11, 1.0f), 0.0f);
                    if(this.c == 7) {
                        f12 = Math.min(f12, 0.99f);
                    }
                    float f13 = this.t.getProgress();
                    if(f12 == f13) {
                        this.t.d = 0.0f;
                    }
                    else {
                        int v4 = Float.compare(f13, 0.0f);
                        if(v4 == 0 || f13 == 1.0f) {
                            this.t.m0(v4 == 0);
                        }
                        this.t.setProgress(f12);
                        motionLayout$MotionTracker0.e(1000);
                        float f14 = motionLayout$MotionTracker0.f();
                        float f15 = motionLayout$MotionTracker0.c();
                        this.t.d = this.m == 0.0f ? f15 / this.p[1] : f14 / this.p[0];
                    }
                    this.r = motionEvent0.getRawX();
                    this.s = motionEvent0.getRawY();
                    return;
                }
                break;
            }
        }
    }

    void v(MotionEvent motionEvent0, MotionTracker motionLayout$MotionTracker0, int v, MotionScene motionScene0) {
        float f5;
        motionLayout$MotionTracker0.b(motionEvent0);
        boolean z = false;
        switch(motionEvent0.getAction()) {
            case 0: {
                this.r = motionEvent0.getRawX();
                this.s = motionEvent0.getRawY();
                this.o = false;
                return;
            }
            case 1: {
                this.o = false;
                motionLayout$MotionTracker0.e(16);
                float f = motionLayout$MotionTracker0.f();
                float f1 = motionLayout$MotionTracker0.c();
                float f2 = this.t.getProgress();
                float f3 = ((float)this.t.getWidth()) / 2.0f;
                float f4 = ((float)this.t.getHeight()) / 2.0f;
                int v1 = this.k;
                if(v1 == -1) {
                    int v2 = this.d;
                    if(v2 != -1) {
                        int v3 = this.t.x0(v2).k();
                        View view1 = this.t.findViewById(v3);
                        this.t.getLocationOnScreen(this.q);
                        f5 = ((float)this.q[0]) + ((float)(view1.getLeft() + view1.getRight())) / 2.0f;
                        f4 = ((float)this.q[1]) + ((float)(view1.getTop() + view1.getBottom())) / 2.0f;
                        f3 = f5;
                    }
                }
                else {
                    View view0 = this.t.findViewById(v1);
                    this.t.getLocationOnScreen(this.q);
                    f5 = ((float)this.q[0]) + ((float)(view0.getLeft() + view0.getRight())) / 2.0f;
                    f4 = ((float)this.q[1]) + ((float)(view0.getTop() + view0.getBottom())) / 2.0f;
                    f3 = f5;
                }
                float f6 = motionEvent0.getRawX() - f3;
                float f7 = motionEvent0.getRawY() - f4;
                double f8 = Math.toDegrees(Math.atan2(f7, f6));
                int v4 = this.d;
                if(v4 == -1) {
                    this.p[1] = 360.0f;
                }
                else {
                    this.t.t0(v4, f2, this.h, this.g, this.p);
                    this.p[1] = (float)Math.toDegrees(this.p[1]);
                }
                float f9 = ((float)(Math.toDegrees(Math.atan2(f1 + f7, f + f6)) - f8)) * 62.5f;
                float f10 = Float.isNaN(f9) ? f2 : f9 * 3.0f * this.x / this.p[1] + f2;
                if(f10 == 0 || f10 == 0x3F800000) {
                label_59:
                    if(0.0f >= f10 || 1.0f <= f10) {
                        this.t.setState(TransitionState.d);
                        return;
                    }
                }
                else {
                    int v5 = this.c;
                    if(v5 == 3) {
                        goto label_59;
                    }
                    else {
                        float f11 = f9 * this.x / this.p[1];
                        float f12 = ((double)f10) < 0.5 ? 0.0f : 1.0f;
                        if(v5 == 6) {
                            if(f2 + f11 < 0.0f) {
                                f11 = Math.abs(f11);
                            }
                            f12 = 1.0f;
                        }
                        if(this.c == 7) {
                            if(f2 + f11 > 1.0f) {
                                f11 = -Math.abs(f11);
                            }
                            f12 = 0.0f;
                        }
                        this.t.U0(this.c, f12, f11 * 3.0f);
                        if(0.0f >= f2 || 1.0f <= f2) {
                            this.t.setState(TransitionState.d);
                            return;
                        }
                    }
                }
                break;
            }
            case 2: {
                motionEvent0.getRawY();
                motionEvent0.getRawX();
                float f13 = ((float)this.t.getWidth()) / 2.0f;
                float f14 = ((float)this.t.getHeight()) / 2.0f;
                int v6 = this.k;
                if(v6 == -1) {
                    int v9 = this.d;
                    if(v9 != -1) {
                        int v10 = this.t.x0(v9).k();
                        View view3 = this.t.findViewById(v10);
                        if(view3 == null) {
                            Log.e("TouchResponse", "could not find view to animate to");
                        }
                        else {
                            this.t.getLocationOnScreen(this.q);
                            f13 = ((float)this.q[0]) + ((float)(view3.getLeft() + view3.getRight())) / 2.0f;
                            f14 = ((float)this.q[1]) + ((float)(view3.getTop() + view3.getBottom())) / 2.0f;
                        }
                    }
                }
                else {
                    View view2 = this.t.findViewById(v6);
                    this.t.getLocationOnScreen(this.q);
                    float f15 = (float)this.q[0];
                    int v7 = view2.getLeft();
                    int v8 = view2.getRight();
                    float f16 = (float)this.q[1];
                    f14 = ((float)(view2.getTop() + view2.getBottom())) / 2.0f + f16;
                    f13 = f15 + ((float)(v7 + v8)) / 2.0f;
                }
                float f17 = motionEvent0.getRawX();
                float f18 = motionEvent0.getRawY();
                double f19 = Math.atan2(motionEvent0.getRawY() - f14, motionEvent0.getRawX() - f13);
                float f20 = (float)((f19 - Math.atan2(this.s - f14, this.r - f13)) * 180.0 / 3.141593);
                if(f20 > 330.0f) {
                    f20 -= 360.0f;
                }
                else if(f20 < -330.0f) {
                    f20 += 360.0f;
                }
                if(((double)Math.abs(f20)) > 0.01 || this.o) {
                    float f21 = this.t.getProgress();
                    if(!this.o) {
                        this.o = true;
                        this.t.setProgress(f21);
                    }
                    int v11 = this.d;
                    if(v11 == -1) {
                        this.p[1] = 360.0f;
                    }
                    else {
                        this.t.t0(v11, f21, this.h, this.g, this.p);
                        this.p[1] = (float)Math.toDegrees(this.p[1]);
                    }
                    float f22 = Math.max(Math.min(f21 + f20 * this.x / this.p[1], 1.0f), 0.0f);
                    float f23 = this.t.getProgress();
                    if(f22 == f23) {
                        this.t.d = 0.0f;
                    }
                    else {
                        int v12 = Float.compare(f23, 0.0f);
                        if(v12 == 0 || f23 == 1.0f) {
                            MotionLayout motionLayout0 = this.t;
                            if(v12 == 0) {
                                z = true;
                            }
                            motionLayout0.m0(z);
                        }
                        this.t.setProgress(f22);
                        motionLayout$MotionTracker0.e(1000);
                        float f24 = motionLayout$MotionTracker0.f();
                        double f25 = (double)motionLayout$MotionTracker0.c();
                        this.t.d = (float)Math.toDegrees(((float)(Math.hypot(f25, f24) * Math.sin(Math.atan2(f25, f24) - f19) / Math.hypot(f17 - f13, f18 - f14))));
                    }
                    this.r = motionEvent0.getRawX();
                    this.s = motionEvent0.getRawY();
                    return;
                }
                break;
            }
        }
    }

    void w(float f, float f1) {
        float f2 = this.t.getProgress();
        if(!this.o) {
            this.o = true;
            this.t.setProgress(f2);
        }
        this.t.t0(this.d, f2, this.h, this.g, this.p);
        if(((double)Math.abs(this.m * this.p[0] + this.n * this.p[1])) < 0.01) {
            float[] arr_f = this.p;
            arr_f[0] = 0.01f;
            arr_f[1] = 0.01f;
        }
        float f3 = Math.max(Math.min(f2 + (this.m == 0.0f ? f1 * this.n / this.p[1] : f * this.m / this.p[0]), 1.0f), 0.0f);
        if(f3 != this.t.getProgress()) {
            this.t.setProgress(f3);
        }
    }

    void x(float f, float f1) {
        this.o = false;
        float f2 = this.t.getProgress();
        this.t.t0(this.d, f2, this.h, this.g, this.p);
        float f3 = 0.0f;
        float f4 = this.m == 0.0f ? f1 * this.n / this.p[1] : f * this.m / this.p[0];
        if(!Float.isNaN(f4)) {
            f2 += f4 / 3.0f;
        }
        if(f2 != 0 && f2 != 0x3F800000) {
            int v = this.c;
            if(v != 3) {
                MotionLayout motionLayout0 = this.t;
                if(((double)f2) >= 0.5) {
                    f3 = 1.0f;
                }
                motionLayout0.U0(v, f3, f4);
            }
        }
    }

    public void y(int v) {
        this.d = v;
    }

    void z(int v) {
        this.F = v;
    }
}

