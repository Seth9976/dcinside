package com.dcinside.app.post.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

@SuppressLint({"RtlHardcoded", "InlinedApi"})
public class b {
    class a implements Interpolator {
        a() {
            super();
        }

        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
        }
    }

    class com.dcinside.app.post.view.b.b implements Runnable {
        final b a;

        @Override
        public void run() {
            b.this.S(0, 0);
        }
    }

    public static abstract class c {
        public int a(@NonNull View view0, int v, int v1) {
            return 0;
        }

        public int b(@NonNull View view0, int v, int v1) {
            return 0;
        }

        public int c(int v) [...] // Inlined contents

        public int d(@NonNull View view0) {
            return 0;
        }

        public int e(@NonNull View view0) [...] // Inlined contents

        public void f(int v, int v1) {
        }

        public boolean g(int v) {
            return false;
        }

        public void h(int v, int v1) {
        }

        public void i(@NonNull View view0, int v) {
        }

        public void j(int v, int v1) {
        }

        public void k(@NonNull View view0, int v, int v1, @Px int v2, @Px int v3) {
        }

        public void l(@NonNull View view0, float f, float f1) {
        }

        public abstract boolean m(@NonNull View arg1, int arg2);
    }

    public static final int A = -1;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 15;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    private static final int M = 20;
    private static final int N = 0x100;
    private static final int O = 400;
    private static final Interpolator P;
    private float a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int[] m;
    private int n;
    private VelocityTracker o;
    private float p;
    private float q;
    private int r;
    private int s;
    private int t;
    private OverScroller u;
    private final c v;
    private View w;
    private boolean x;
    private final ViewGroup y;
    private final Runnable z;

    static {
        b.P = new a();
    }

    private b(@NonNull Context context0, @NonNull ViewGroup viewGroup0, @NonNull c b$c0) {
        this.a = 1.0f;
        this.c = 0;
        this.e = -1;
        this.z = () -> {
            b.this.y.removeCallbacks(b.this.z);
            if(b.this.b != 0) {
                b.this.c = 0;
                b.this.b = 0;
                b.this.v.j(0, 0);
                if(b.this.b == 0) {
                    b.this.w = null;
                }
            }
        };
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if(b$c0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.y = viewGroup0;
        this.v = b$c0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        int v = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.r = v;
        this.s = v;
        this.d = viewConfiguration0.getScaledTouchSlop();
        this.p = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.q = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.u = new OverScroller(context0, b.P);
    }

    @Px
    public int A() {
        return this.s;
    }

    private int B(int v, int v1, int v2) {
        int v3 = v >= this.y.getLeft() + v2 ? 0 : 1;
        if(v1 < this.y.getTop() + v2) {
            v3 |= 4;
        }
        if(v > this.y.getRight() - v2) {
            v3 |= 2;
        }
        return v1 <= this.y.getBottom() - v2 ? v3 : v3 | 8;
    }

    public int C() {
        return this.r;
    }

    public float D() {
        return this.q;
    }

    public float E() {
        return this.a;
    }

    @Px
    public int F() {
        return this.d;
    }

    public int G() {
        return this.b;
    }

    public boolean H(int v, int v1) {
        return this.M(this.w, v, v1);
    }

    public boolean I(int v) {
        for(int v1 = 0; v1 < this.j.length; ++v1) {
            if(this.J(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public boolean J(int v, int v1) {
        return this.K(v1) && (v & this.j[v1]) != 0;
    }

    public boolean K(int v) {
        return (1 << v & this.n) != 0;
    }

    private boolean L(int v) {
        return this.K(v);
    }

    public boolean M(@Nullable View view0, int v, int v1) {
        return view0 == null ? false : v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom();
    }

    public void N(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.c();
        }
        if(this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent0);
        int v2 = 0;
        switch(v) {
            case 0: {
                float f8 = motionEvent0.getX();
                float f9 = motionEvent0.getY();
                int v15 = motionEvent0.getPointerId(0);
                View view1 = this.v(((int)f8), ((int)f9));
                this.Q(f8, f9, v15);
                this.b0(view1, v15);
                int v16 = this.k[v15] & this.t;
                if(v16 != 0) {
                    this.v.h(v16, v15);
                }
                break;
            }
            case 1: {
                if(this.b == 1) {
                    this.O();
                }
                this.c();
                return;
            }
            case 2: {
                if(this.b != 1) {
                    int v13 = motionEvent0.getPointerCount();
                    while(v2 < v13) {
                        int v14 = motionEvent0.getPointerId(v2);
                        if(this.L(v14)) {
                            float f4 = motionEvent0.getX(v2);
                            float f5 = motionEvent0.getY(v2);
                            float f6 = f4 - this.f[v14];
                            float f7 = f5 - this.g[v14];
                            this.P(f6, f7, v14);
                            if(this.b == 1) {
                                break;
                            }
                            View view0 = this.v(((int)f4), ((int)f5));
                            if(!this.h(view0, f6, f7) || !this.b0(view0, v14)) {
                                goto label_70;
                            }
                            break;
                        }
                    label_70:
                        ++v2;
                    }
                    this.R(motionEvent0);
                    return;
                }
                else if(this.L(this.e)) {
                    int v9 = motionEvent0.findPointerIndex(this.e);
                    float f2 = motionEvent0.getX(v9);
                    float f3 = motionEvent0.getY(v9);
                    int v10 = this.e;
                    int v11 = (int)(f2 - this.h[v10]);
                    int v12 = (int)(f3 - this.i[v10]);
                    this.t(this.w.getLeft() + v11, this.w.getTop() + v12, v11, v12);
                    this.R(motionEvent0);
                    return;
                }
                break;
            }
            case 3: {
                if(this.b == 1) {
                    this.r(0.0f, 0.0f);
                }
                this.c();
                return;
            }
            case 5: {
                int v7 = motionEvent0.getPointerId(v1);
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.Q(f, f1, v7);
                if(this.b == 0) {
                    this.b0(this.v(((int)f), ((int)f1)), v7);
                    int v8 = this.k[v7] & this.t;
                    if(v8 != 0) {
                        this.v.h(v8, v7);
                        return;
                    }
                }
                else if(this.H(((int)f), ((int)f1))) {
                    this.b0(this.w, v7);
                    return;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getPointerId(v1);
                if(this.b == 1 && v3 == this.e) {
                    int v4 = motionEvent0.getPointerCount();
                    while(true) {
                        int v5 = -1;
                        if(v2 >= v4) {
                            break;
                        }
                        int v6 = motionEvent0.getPointerId(v2);
                        if(v6 != this.e && (this.v(((int)motionEvent0.getX(v2)), ((int)motionEvent0.getY(v2))) == this.w && this.b0(this.w, v6))) {
                            v5 = this.e;
                            break;
                        }
                        ++v2;
                    }
                    if(v5 == -1) {
                        this.O();
                    }
                }
                this.l(v3);
            }
        }
    }

    private void O() {
        this.o.computeCurrentVelocity(1000, this.p);
        this.r(this.i(this.o.getXVelocity(this.e), this.q, this.p), this.i(this.o.getYVelocity(this.e), this.q, this.p));
    }

    private void P(float f, float f1, int v) {
        boolean z = this.e(f, f1, v, 1);
        if(this.e(f1, f, v, 4)) {
            z |= 4;
        }
        if(this.e(f, f1, v, 2)) {
            z |= 2;
        }
        if(this.e(f1, f, v, 8)) {
            z |= 8;
        }
        if(z) {
            this.l[v] |= true;
            this.v.f(1, v);
        }
    }

    private void Q(float f, float f1, int v) {
        this.u(v);
        float[] arr_f = this.f;
        this.h[v] = f;
        arr_f[v] = f;
        float[] arr_f1 = this.g;
        this.i[v] = f1;
        arr_f1[v] = f1;
        int[] arr_v = this.j;
        arr_v[v] = this.B(((int)f), ((int)f1), this.s);
        int[] arr_v1 = this.k;
        arr_v1[v] = this.B(((int)f), ((int)f1), this.r);
        this.n |= 1 << v;
    }

    private void R(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.L(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.h[v2] = f;
                this.i[v2] = f1;
            }
        }
    }

    // 检测为 Lambda 实现
    void S(int v, int v1) [...]

    public void T(int v) {
        this.s = v;
    }

    public void U(int v) {
        this.t = v;
    }

    public void V(float f) {
        this.q = f;
    }

    public void W(float f) {
        this.a = f;
    }

    public void X(int v) {
        this.d = v;
    }

    public boolean Y(int v, int v1) {
        if(!this.x) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return this.x(v, v1, ((int)this.o.getXVelocity(this.e)), ((int)this.o.getYVelocity(this.e)));
    }

    public boolean Z(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.c();
        }
        if(this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.Q(f, f1, v2);
                View view0 = this.v(((int)f), ((int)f1));
                if(view0 == this.w && this.b == 2) {
                    this.b0(view0, v2);
                }
                int v3 = this.k[v2] & this.t;
                if(v3 != 0) {
                    this.v.h(v3, v2);
                    return this.b == 1;
                }
                break;
            }
            case 2: {
                if(this.f != null && this.g != null) {
                    int v4 = motionEvent0.getPointerCount();
                    int v5 = 0;
                    while(v5 < v4) {
                        int v6 = motionEvent0.getPointerId(v5);
                        if(this.L(v6)) {
                            float f2 = motionEvent0.getX(v5);
                            float f3 = motionEvent0.getY(v5);
                            float f4 = f2 - this.f[v6];
                            float f5 = f3 - this.g[v6];
                            View view1 = this.v(((int)f2), ((int)f3));
                            boolean z = view1 != null && this.h(view1, f4, f5);
                            if(z) {
                                int v7 = view1.getLeft();
                                int v8 = view1.getTop();
                                this.v.b(view1, v8 + ((int)f5), ((int)f5));
                                int v9 = this.v.d(view1);
                                if(v9 != 0 && (v9 <= 0 || this.v.a(view1, v7 + ((int)f4), ((int)f4)) != v7)) {
                                    goto label_42;
                                }
                                break;
                            }
                        label_42:
                            this.P(f4, f5, v6);
                            if(this.b != 1 && (!z || !this.b0(view1, v6))) {
                                goto label_44;
                            }
                            break;
                        }
                    label_44:
                        ++v5;
                    }
                    this.R(motionEvent0);
                    return this.b == 1;
                }
                break;
            }
            case 1: 
            case 3: {
                this.c();
                return this.b == 1;
            }
            case 5: {
                int v10 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.Q(f6, f7, v10);
                int v11 = this.b;
                if(v11 == 0) {
                    int v12 = this.k[v10] & this.t;
                    if(v12 != 0) {
                        this.v.h(v12, v10);
                        return this.b == 1;
                    }
                }
                else if(v11 == 2) {
                    View view2 = this.v(((int)f6), ((int)f7));
                    if(view2 == this.w) {
                        this.b0(view2, v10);
                        return this.b == 1;
                    }
                }
                break;
            }
            case 6: {
                this.l(motionEvent0.getPointerId(v1));
                return this.b == 1;
            }
            default: {
                return this.b == 1;
            }
        }
        return this.b == 1;
    }

    public void a() {
        this.c();
        if(this.b == 2) {
            int v = this.u.getCurrX();
            int v1 = this.u.getCurrY();
            this.u.abortAnimation();
            int v2 = this.u.getCurrX();
            int v3 = this.u.getCurrY();
            this.v.k(this.w, v2, v3, v2 - v, v3 - v1);
        }
        this.S(0, 0);
    }

    public boolean a0(@NonNull View view0, int v, int v1) {
        this.w = view0;
        this.e = -1;
        boolean z = this.x(v, v1, 0, 0);
        if(!z && this.b == 0 && this.w != null) {
            this.w = null;
        }
        return z;
    }

    protected boolean b(@NonNull View view0, boolean z, int v, int v1, int v2, int v3) {
        if(view0 instanceof ViewGroup) {
            int v4 = view0.getScrollX();
            int v5 = view0.getScrollY();
            for(int v6 = ((ViewGroup)view0).getChildCount() - 1; v6 >= 0; --v6) {
                View view1 = ((ViewGroup)view0).getChildAt(v6);
                int v7 = v2 + v4;
                if(v7 >= view1.getLeft() && v7 < view1.getRight()) {
                    int v8 = v3 + v5;
                    if(v8 >= view1.getTop() && v8 < view1.getBottom() && this.b(view1, true, v, v1, v7 - view1.getLeft(), v8 - view1.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && (view0.canScrollHorizontally(-v) || view0.canScrollVertically(-v1));
    }

    boolean b0(View view0, int v) {
        if(view0 == this.w && this.e == v) {
            return true;
        }
        if(view0 != null && this.v.m(view0, v)) {
            this.e = v;
            this.d(view0, v);
            return true;
        }
        return false;
    }

    public void c() {
        this.e = -1;
        this.k();
        VelocityTracker velocityTracker0 = this.o;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.o = null;
        }
    }

    public void d(@NonNull View view0, int v) {
        if(view0.getParent() != this.y) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + this.y + ")");
        }
        this.w = view0;
        this.e = v;
        this.v.i(view0, v);
        this.S(1, 0);
    }

    private boolean e(float f, float f1, int v, int v1) {
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if(v1 != 1 && v1 != 2) {
            if(f3 < this.a * f2) {
                return false;
            }
        }
        else if(f2 < this.a * f3) {
            return false;
        }
        if((this.j[v] & v1) == v1 && (this.t & v1) != 0 && (this.m[v] & v1) != v1 && (this.l[v] & v1) != v1 && (f2 > ((float)this.d) || f3 > ((float)this.d))) {
            if(f2 < f3 * 0.5f && this.v.g(v1)) {
                this.m[v] |= v1;
                return false;
            }
            return (this.l[v] & v1) == 0 && f2 > ((float)this.d);
        }
        return false;
    }

    public boolean f(int v) {
        for(int v1 = 0; v1 < this.f.length; ++v1) {
            if(this.g(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int v, int v1) {
        if(!this.K(v1)) {
            return false;
        }
        boolean z = (v & 1) == 1;
        boolean z1 = (v & 2) == 2;
        float f = this.h[v1] - this.f[v1];
        float f1 = this.i[v1] - this.g[v1];
        if(z && z1) {
            return f * f + f1 * f1 > ((float)(this.d * this.d));
        }
        return z ? Math.abs(f) > ((float)this.d) : z1 && Math.abs(f1) > ((float)this.d);
    }

    // 去混淆评级： 低(30)
    private boolean h(View view0, float f, float f1) {
        return view0 == null ? false : this.v.d(view0) > 0 && Math.abs(f) > ((float)this.d);
    }

    private float i(float f, float f1, float f2) {
        float f3 = Math.abs(f);
        if(f3 < f1) {
            return 0.0f;
        }
        if(f3 > f2) {
            return f > 0.0f ? f2 : -f2;
        }
        return f;
    }

    private int j(int v, int v1, int v2) {
        int v3 = Math.abs(v);
        if(v3 < v1) {
            return 0;
        }
        if(v3 > v2) {
            return v > 0 ? v2 : -v2;
        }
        return v;
    }

    private void k() {
        float[] arr_f = this.f;
        if(arr_f == null) {
            return;
        }
        Arrays.fill(arr_f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0.0f);
        Arrays.fill(this.i, 0.0f);
        Arrays.fill(this.j, 0);
        Arrays.fill(this.k, 0);
        Arrays.fill(this.l, 0);
        Arrays.fill(this.m, 0);
        this.n = 0;
    }

    private void l(int v) {
        if(this.f != null && this.K(v)) {
            this.f[v] = 0.0f;
            this.g[v] = 0.0f;
            this.h[v] = 0.0f;
            this.i[v] = 0.0f;
            this.j[v] = 0;
            this.k[v] = 0;
            this.l[v] = 0;
            this.m[v] = 0;
            this.n &= ~(1 << v);
        }
    }

    private int m(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.y.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 400) : Math.min(Math.round(Math.abs((((float)(v3 / 2)) + this.s(Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3))) * ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 400);
    }

    private int n(View view0, int v, int v1, int v2, int v3) {
        float f1;
        float f;
        int v4 = this.j(v2, ((int)this.q), ((int)this.p));
        int v5 = this.j(v3, ((int)this.q), ((int)this.p));
        int v6 = Math.abs(v);
        int v7 = Math.abs(v1);
        int v8 = Math.abs(v4);
        int v9 = Math.abs(v5);
        int v10 = v8 + v9;
        int v11 = v6 + v7;
        if(v4 != 0) {
            f = (float)v8;
            f1 = (float)v10;
            return v5 == 0 ? ((int)(((float)this.m(v, v4, this.v.d(view0))) * (f / f1) + ((float)this.m(v1, 0, 0)) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.m(v, v4, this.v.d(view0))) * (f / f1) + ((float)this.m(v1, v5, 0)) * (((float)v9) / ((float)v10))));
        }
        f = (float)v6;
        f1 = (float)v11;
        return v5 == 0 ? ((int)(((float)this.m(v, 0, this.v.d(view0))) * (f / f1) + ((float)this.m(v1, 0, 0)) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.m(v, 0, this.v.d(view0))) * (f / f1) + ((float)this.m(v1, v5, 0)) * (((float)v9) / ((float)v10))));
    }

    public boolean o(boolean z) {
        if(this.b == 2) {
            boolean z1 = this.u.computeScrollOffset();
            int v = this.u.getCurrX();
            int v1 = this.u.getCurrY();
            int v2 = v - this.w.getLeft();
            int v3 = v1 - this.w.getTop();
            if(v2 != 0) {
                ViewCompat.k1(this.w, v2);
            }
            if(v3 != 0) {
                ViewCompat.l1(this.w, v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.v.k(this.w, v, v1, v2, v3);
            }
            if(z1 && v == this.u.getFinalX() && v1 == this.u.getFinalY()) {
                this.u.abortAnimation();
                z1 = false;
            }
            if(!z1) {
                if(z) {
                    this.y.post(this.z);
                    return this.b == 2;
                }
                this.S(0, 0);
            }
        }
        return this.b == 2;
    }

    public static b p(@NonNull ViewGroup viewGroup0, float f, @NonNull c b$c0) {
        b b0 = b.q(viewGroup0, b$c0);
        b0.d = (int)(((float)b0.d) * (1.0f / f));
        return b0;
    }

    public static b q(@NonNull ViewGroup viewGroup0, @NonNull c b$c0) {
        return new b(viewGroup0.getContext(), viewGroup0, b$c0);
    }

    private void r(float f, float f1) {
        this.x = true;
        this.v.l(this.w, f, f1);
        this.x = false;
        if(this.b == 1) {
            this.S(0, 0);
        }
    }

    private float s(float f) {
        return (float)Math.sin((f - 0.5f) * 0.471239f);
    }

    private void t(int v, int v1, int v2, int v3) {
        int v4 = this.w.getLeft();
        int v5 = this.w.getTop();
        if(v2 != 0) {
            v = this.v.a(this.w, v, v2);
            ViewCompat.k1(this.w, v - v4);
        }
        if(v3 != 0) {
            v1 = this.v.b(this.w, v1, v3);
            ViewCompat.l1(this.w, v1 - v5);
        }
        if(v2 != 0 || v3 != 0) {
            this.v.k(this.w, v, v1, v - v4, v1 - v5);
        }
    }

    private void u(int v) {
        float[] arr_f = this.f;
        if(arr_f == null || arr_f.length <= v) {
            float[] arr_f1 = new float[v + 1];
            float[] arr_f2 = new float[v + 1];
            float[] arr_f3 = new float[v + 1];
            float[] arr_f4 = new float[v + 1];
            int[] arr_v = new int[v + 1];
            int[] arr_v1 = new int[v + 1];
            int[] arr_v2 = new int[v + 1];
            int[] arr_v3 = new int[v + 1];
            if(arr_f != null) {
                System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                System.arraycopy(this.g, 0, arr_f2, 0, this.g.length);
                System.arraycopy(this.h, 0, arr_f3, 0, this.h.length);
                System.arraycopy(this.i, 0, arr_f4, 0, this.i.length);
                System.arraycopy(this.j, 0, arr_v, 0, this.j.length);
                System.arraycopy(this.k, 0, arr_v1, 0, this.k.length);
                System.arraycopy(this.l, 0, arr_v2, 0, this.l.length);
                System.arraycopy(this.m, 0, arr_v3, 0, this.m.length);
            }
            this.f = arr_f1;
            this.g = arr_f2;
            this.h = arr_f3;
            this.i = arr_f4;
            this.j = arr_v;
            this.k = arr_v1;
            this.l = arr_v2;
            this.m = arr_v3;
        }
    }

    @Nullable
    public View v(int v, int v1) {
        for(int v2 = this.y.getChildCount() - 1; v2 >= 0; --v2) {
            View view0 = this.y.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public void w(int v, int v1, int v2, int v3) {
        if(!this.x) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        int v4 = (int)this.o.getXVelocity(this.e);
        this.u.fling(this.w.getLeft(), this.w.getTop(), v4, ((int)this.o.getYVelocity(this.e)), v, v2, v1, v3);
        this.S(2, v4);
    }

    private boolean x(int v, int v1, int v2, int v3) {
        int v4 = this.w.getLeft();
        int v5 = this.w.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        if(v6 == 0 && v7 == 0) {
            this.u.abortAnimation();
            this.S(0, 0);
            return false;
        }
        int v8 = this.n(this.w, v6, v7, v2, v3);
        this.u.startScroll(v4, v5, v6, v7, v8);
        this.S(2, v6);
        return true;
    }

    public int y() {
        return this.e;
    }

    @Nullable
    public View z() {
        return this.w;
    }
}

