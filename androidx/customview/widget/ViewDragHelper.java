package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class ViewDragHelper {
    public static abstract class Callback {
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

        public int e(@NonNull View view0) {
            return 0;
        }

        public void f(int v, int v1) {
        }

        public boolean g(int v) {
            return false;
        }

        public void h(int v, int v1) {
        }

        public void i(@NonNull View view0, int v) {
        }

        public void j(int v) {
        }

        public void k(@NonNull View view0, int v, int v1, @Px int v2, @Px int v3) {
        }

        public void l(@NonNull View view0, float f, float f1) {
        }

        public abstract boolean m(@NonNull View arg1, int arg2);
    }

    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    private static final int K = 20;
    private static final int L = 0x100;
    private static final int M = 600;
    private static final Interpolator N = null;
    private int a;
    private int b;
    private int c;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final Callback s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w;
    private static final String x = "ViewDragHelper";
    public static final int y = -1;
    public static final int z;

    static {
        ViewDragHelper.N = new Interpolator() {
            @Override  // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
        };
    }

    private ViewDragHelper(@NonNull Context context0, @NonNull ViewGroup viewGroup0, @NonNull Callback viewDragHelper$Callback0) {
        this.c = -1;
        this.w = () -> {
            ViewDragHelper.this.v.removeCallbacks(ViewDragHelper.this.w);
            if(ViewDragHelper.this.a != 0) {
                ViewDragHelper.this.a = 0;
                ViewDragHelper.this.s.j(0);
                if(ViewDragHelper.this.a == 0) {
                    ViewDragHelper.this.t = null;
                }
            }
        };
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if(viewDragHelper$Callback0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.v = viewGroup0;
        this.s = viewDragHelper$Callback0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        int v = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.p = v;
        this.o = v;
        this.b = viewConfiguration0.getScaledTouchSlop();
        this.m = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.n = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context0, ViewDragHelper.N);
    }

    @Px
    public int A() {
        return this.p;
    }

    @Px
    public int B() {
        return this.o;
    }

    private int C(int v, int v1) {
        int v2 = v >= this.v.getLeft() + this.o ? 0 : 1;
        if(v1 < this.v.getTop() + this.o) {
            v2 |= 4;
        }
        if(v > this.v.getRight() - this.o) {
            v2 |= 2;
        }
        return v1 <= this.v.getBottom() - this.o ? v2 : v2 | 8;
    }

    public float D() {
        return this.n;
    }

    @Px
    public int E() {
        return this.b;
    }

    public int F() {
        return this.a;
    }

    public boolean G(int v, int v1) {
        return this.L(this.t, v, v1);
    }

    public boolean H(int v) {
        for(int v1 = 0; v1 < this.h.length; ++v1) {
            if(this.I(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int v, int v1) {
        return this.J(v1) && (v & this.h[v1]) != 0;
    }

    public boolean J(int v) {
        return (1 << v & this.k) != 0;
    }

    private boolean K(int v) {
        if(!this.J(v)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + v + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public boolean L(@Nullable View view0, int v, int v1) {
        return view0 == null ? false : v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom();
    }

    public void M(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.c();
        }
        if(this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent0);
        int v2 = 0;
        switch(v) {
            case 0: {
                float f8 = motionEvent0.getX();
                float f9 = motionEvent0.getY();
                int v16 = motionEvent0.getPointerId(0);
                View view1 = this.v(((int)f8), ((int)f9));
                this.P(f8, f9, v16);
                this.Y(view1, v16);
                int v17 = this.h[v16];
                int v18 = this.q;
                if((v17 & v18) != 0) {
                    this.s.h(v17 & v18, v16);
                }
                break;
            }
            case 1: {
                if(this.a == 1) {
                    this.N();
                }
                this.c();
                return;
            }
            case 2: {
                if(this.a != 1) {
                    int v14 = motionEvent0.getPointerCount();
                    while(v2 < v14) {
                        int v15 = motionEvent0.getPointerId(v2);
                        if(this.K(v15)) {
                            float f4 = motionEvent0.getX(v2);
                            float f5 = motionEvent0.getY(v2);
                            float f6 = f4 - this.d[v15];
                            float f7 = f5 - this.e[v15];
                            this.O(f6, f7, v15);
                            if(this.a == 1) {
                                break;
                            }
                            View view0 = this.v(((int)f4), ((int)f5));
                            if(!this.h(view0, f6, f7) || !this.Y(view0, v15)) {
                                goto label_71;
                            }
                            break;
                        }
                    label_71:
                        ++v2;
                    }
                    this.Q(motionEvent0);
                    return;
                }
                else if(this.K(this.c)) {
                    int v10 = motionEvent0.findPointerIndex(this.c);
                    float f2 = motionEvent0.getX(v10);
                    float f3 = motionEvent0.getY(v10);
                    int v11 = this.c;
                    int v12 = (int)(f2 - this.f[v11]);
                    int v13 = (int)(f3 - this.g[v11]);
                    this.t(this.t.getLeft() + v12, this.t.getTop() + v13, v12, v13);
                    this.Q(motionEvent0);
                    return;
                }
                break;
            }
            case 3: {
                if(this.a == 1) {
                    this.r(0.0f, 0.0f);
                }
                this.c();
                return;
            }
            case 5: {
                int v7 = motionEvent0.getPointerId(v1);
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.P(f, f1, v7);
                if(this.a == 0) {
                    this.Y(this.v(((int)f), ((int)f1)), v7);
                    int v8 = this.h[v7];
                    int v9 = this.q;
                    if((v8 & v9) != 0) {
                        this.s.h(v8 & v9, v7);
                        return;
                    }
                }
                else if(this.G(((int)f), ((int)f1))) {
                    this.Y(this.t, v7);
                    return;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getPointerId(v1);
                if(this.a == 1 && v3 == this.c) {
                    int v4 = motionEvent0.getPointerCount();
                    while(true) {
                        int v5 = -1;
                        if(v2 >= v4) {
                            break;
                        }
                        int v6 = motionEvent0.getPointerId(v2);
                        if(v6 != this.c && (this.v(((int)motionEvent0.getX(v2)), ((int)motionEvent0.getY(v2))) == this.t && this.Y(this.t, v6))) {
                            v5 = this.c;
                            break;
                        }
                        ++v2;
                    }
                    if(v5 == -1) {
                        this.N();
                    }
                }
                this.l(v3);
            }
        }
    }

    private void N() {
        this.l.computeCurrentVelocity(1000, this.m);
        this.r(this.i(this.l.getXVelocity(this.c), this.n, this.m), this.i(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private void O(float f, float f1, int v) {
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
            this.i[v] |= true;
            this.s.f(1, v);
        }
    }

    private void P(float f, float f1, int v) {
        this.u(v);
        float[] arr_f = this.d;
        this.f[v] = f;
        arr_f[v] = f;
        float[] arr_f1 = this.e;
        this.g[v] = f1;
        arr_f1[v] = f1;
        int[] arr_v = this.h;
        arr_v[v] = this.C(((int)f), ((int)f1));
        this.k |= 1 << v;
    }

    private void Q(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.K(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.f[v2] = f;
                this.g[v2] = f1;
            }
        }
    }

    // 检测为 Lambda 实现
    void R(int v) [...]

    public void S(@IntRange(from = 0L) @Px int v) {
        this.o = v;
    }

    public void T(int v) {
        this.q = v;
    }

    public void U(float f) {
        this.n = f;
    }

    public boolean V(int v, int v1) {
        if(!this.u) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return this.x(v, v1, ((int)this.l.getXVelocity(this.c)), ((int)this.l.getYVelocity(this.c)));
    }

    public boolean W(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.c();
        }
        if(this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.P(f, f1, v2);
                View view0 = this.v(((int)f), ((int)f1));
                if(view0 == this.t && this.a == 2) {
                    this.Y(view0, v2);
                }
                int v3 = this.h[v2];
                int v4 = this.q;
                if((v3 & v4) != 0) {
                    this.s.h(v3 & v4, v2);
                    return this.a == 1;
                }
                break;
            }
            case 2: {
                if(this.d != null && this.e != null) {
                    int v5 = motionEvent0.getPointerCount();
                    int v6 = 0;
                    while(v6 < v5) {
                        int v7 = motionEvent0.getPointerId(v6);
                        if(this.K(v7)) {
                            float f2 = motionEvent0.getX(v6);
                            float f3 = motionEvent0.getY(v6);
                            float f4 = f2 - this.d[v7];
                            float f5 = f3 - this.e[v7];
                            View view1 = this.v(((int)f2), ((int)f3));
                            boolean z = view1 != null && this.h(view1, f4, f5);
                            if(z) {
                                int v8 = view1.getLeft();
                                int v9 = view1.getTop();
                                int v10 = this.s.d(view1);
                                int v11 = this.s.e(view1);
                                if(v10 != 0 && (v10 <= 0 || this.s.a(view1, v8 + ((int)f4), ((int)f4)) != v8) || v11 != 0 && (v11 <= 0 || this.s.b(view1, v9 + ((int)f5), ((int)f5)) != v9)) {
                                    goto label_43;
                                }
                                break;
                            }
                        label_43:
                            this.O(f4, f5, v7);
                            if(this.a != 1 && (!z || !this.Y(view1, v7))) {
                                goto label_45;
                            }
                            break;
                        }
                    label_45:
                        ++v6;
                    }
                    this.Q(motionEvent0);
                    return this.a == 1;
                }
                break;
            }
            case 1: 
            case 3: {
                this.c();
                return this.a == 1;
            }
            case 5: {
                int v12 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.P(f6, f7, v12);
                int v13 = this.a;
                if(v13 == 0) {
                    int v14 = this.h[v12];
                    int v15 = this.q;
                    if((v14 & v15) != 0) {
                        this.s.h(v14 & v15, v12);
                        return this.a == 1;
                    }
                }
                else if(v13 == 2) {
                    View view2 = this.v(((int)f6), ((int)f7));
                    if(view2 == this.t) {
                        this.Y(view2, v12);
                        return this.a == 1;
                    }
                }
                break;
            }
            case 6: {
                this.l(motionEvent0.getPointerId(v1));
                return this.a == 1;
            }
            default: {
                return this.a == 1;
            }
        }
        return this.a == 1;
    }

    public boolean X(@NonNull View view0, int v, int v1) {
        this.t = view0;
        this.c = -1;
        boolean z = this.x(v, v1, 0, 0);
        if(!z && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return z;
    }

    boolean Y(View view0, int v) {
        if(view0 == this.t && this.c == v) {
            return true;
        }
        if(view0 != null && this.s.m(view0, v)) {
            this.c = v;
            this.d(view0, v);
            return true;
        }
        return false;
    }

    public void a() {
        this.c();
        if(this.a == 2) {
            int v = this.r.getCurrX();
            int v1 = this.r.getCurrY();
            this.r.abortAnimation();
            int v2 = this.r.getCurrX();
            int v3 = this.r.getCurrY();
            this.s.k(this.t, v2, v3, v2 - v, v3 - v1);
        }
        this.R(0);
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

    public void c() {
        this.c = -1;
        this.k();
        VelocityTracker velocityTracker0 = this.l;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.l = null;
        }
    }

    public void d(@NonNull View view0, int v) {
        if(view0.getParent() != this.v) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + this.v + ")");
        }
        this.t = view0;
        this.c = v;
        this.s.i(view0, v);
        this.R(1);
    }

    private boolean e(float f, float f1, int v, int v1) {
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if((this.h[v] & v1) == v1 && (this.q & v1) != 0 && (this.j[v] & v1) != v1 && (this.i[v] & v1) != v1 && (f2 > ((float)this.b) || f3 > ((float)this.b))) {
            if(f2 < f3 * 0.5f && this.s.g(v1)) {
                this.j[v] |= v1;
                return false;
            }
            return (this.i[v] & v1) == 0 && f2 > ((float)this.b);
        }
        return false;
    }

    public boolean f(int v) {
        for(int v1 = 0; v1 < this.d.length; ++v1) {
            if(this.g(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int v, int v1) {
        if(!this.J(v1)) {
            return false;
        }
        boolean z = (v & 1) == 1;
        boolean z1 = (v & 2) == 2;
        float f = this.f[v1] - this.d[v1];
        float f1 = this.g[v1] - this.e[v1];
        if(z && z1) {
            return f * f + f1 * f1 > ((float)(this.b * this.b));
        }
        return z ? Math.abs(f) > ((float)this.b) : z1 && Math.abs(f1) > ((float)this.b);
    }

    private boolean h(View view0, float f, float f1) {
        if(view0 == null) {
            return false;
        }
        boolean z = this.s.d(view0) > 0;
        boolean z1 = this.s.e(view0) > 0;
        if(z && z1) {
            return f * f + f1 * f1 > ((float)(this.b * this.b));
        }
        return z ? Math.abs(f) > ((float)this.b) : z1 && Math.abs(f1) > ((float)this.b);
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
        float[] arr_f = this.d;
        if(arr_f == null) {
            return;
        }
        Arrays.fill(arr_f, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void l(int v) {
        if(this.d != null && this.J(v)) {
            this.d[v] = 0.0f;
            this.e[v] = 0.0f;
            this.f[v] = 0.0f;
            this.g[v] = 0.0f;
            this.h[v] = 0;
            this.i[v] = 0;
            this.j[v] = 0;
            this.k &= ~(1 << v);
        }
    }

    private int m(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.v.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 600) : Math.min(Math.round(Math.abs((((float)(v3 / 2)) + this.s(Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3))) * ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 600);
    }

    private int n(View view0, int v, int v1, int v2, int v3) {
        float f1;
        float f;
        int v4 = this.j(v2, ((int)this.n), ((int)this.m));
        int v5 = this.j(v3, ((int)this.n), ((int)this.m));
        int v6 = Math.abs(v);
        int v7 = Math.abs(v1);
        int v8 = Math.abs(v4);
        int v9 = Math.abs(v5);
        int v10 = v8 + v9;
        int v11 = v6 + v7;
        if(v4 != 0) {
            f = (float)v8;
            f1 = (float)v10;
            return v5 == 0 ? ((int)(((float)this.m(v, v4, this.s.d(view0))) * (f / f1) + ((float)this.m(v1, 0, this.s.e(view0))) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.m(v, v4, this.s.d(view0))) * (f / f1) + ((float)this.m(v1, v5, this.s.e(view0))) * (((float)v9) / ((float)v10))));
        }
        f = (float)v6;
        f1 = (float)v11;
        return v5 == 0 ? ((int)(((float)this.m(v, 0, this.s.d(view0))) * (f / f1) + ((float)this.m(v1, 0, this.s.e(view0))) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.m(v, 0, this.s.d(view0))) * (f / f1) + ((float)this.m(v1, v5, this.s.e(view0))) * (((float)v9) / ((float)v10))));
    }

    public boolean o(boolean z) {
        if(this.a == 2) {
            boolean z1 = this.r.computeScrollOffset();
            int v = this.r.getCurrX();
            int v1 = this.r.getCurrY();
            int v2 = v - this.t.getLeft();
            int v3 = v1 - this.t.getTop();
            if(v2 != 0) {
                ViewCompat.k1(this.t, v2);
            }
            if(v3 != 0) {
                ViewCompat.l1(this.t, v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.s.k(this.t, v, v1, v2, v3);
            }
            if(z1 && v == this.r.getFinalX() && v1 == this.r.getFinalY()) {
                this.r.abortAnimation();
                z1 = false;
            }
            if(!z1) {
                if(z) {
                    this.v.post(this.w);
                    return this.a == 2;
                }
                this.R(0);
            }
        }
        return this.a == 2;
    }

    public static ViewDragHelper p(@NonNull ViewGroup viewGroup0, float f, @NonNull Callback viewDragHelper$Callback0) {
        ViewDragHelper viewDragHelper0 = ViewDragHelper.q(viewGroup0, viewDragHelper$Callback0);
        viewDragHelper0.b = (int)(((float)viewDragHelper0.b) * (1.0f / f));
        return viewDragHelper0;
    }

    public static ViewDragHelper q(@NonNull ViewGroup viewGroup0, @NonNull Callback viewDragHelper$Callback0) {
        return new ViewDragHelper(viewGroup0.getContext(), viewGroup0, viewDragHelper$Callback0);
    }

    private void r(float f, float f1) {
        this.u = true;
        this.s.l(this.t, f, f1);
        this.u = false;
        if(this.a == 1) {
            this.R(0);
        }
    }

    private float s(float f) {
        return (float)Math.sin((f - 0.5f) * 0.471239f);
    }

    private void t(int v, int v1, int v2, int v3) {
        int v4 = this.t.getLeft();
        int v5 = this.t.getTop();
        if(v2 != 0) {
            v = this.s.a(this.t, v, v2);
            ViewCompat.k1(this.t, v - v4);
        }
        if(v3 != 0) {
            v1 = this.s.b(this.t, v1, v3);
            ViewCompat.l1(this.t, v1 - v5);
        }
        if(v2 != 0 || v3 != 0) {
            this.s.k(this.t, v, v1, v - v4, v1 - v5);
        }
    }

    private void u(int v) {
        float[] arr_f = this.d;
        if(arr_f == null || arr_f.length <= v) {
            float[] arr_f1 = new float[v + 1];
            float[] arr_f2 = new float[v + 1];
            float[] arr_f3 = new float[v + 1];
            float[] arr_f4 = new float[v + 1];
            int[] arr_v = new int[v + 1];
            int[] arr_v1 = new int[v + 1];
            int[] arr_v2 = new int[v + 1];
            if(arr_f != null) {
                System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                System.arraycopy(this.e, 0, arr_f2, 0, this.e.length);
                System.arraycopy(this.f, 0, arr_f3, 0, this.f.length);
                System.arraycopy(this.g, 0, arr_f4, 0, this.g.length);
                System.arraycopy(this.h, 0, arr_v, 0, this.h.length);
                System.arraycopy(this.i, 0, arr_v1, 0, this.i.length);
                System.arraycopy(this.j, 0, arr_v2, 0, this.j.length);
            }
            this.d = arr_f1;
            this.e = arr_f2;
            this.f = arr_f3;
            this.g = arr_f4;
            this.h = arr_v;
            this.i = arr_v1;
            this.j = arr_v2;
        }
    }

    @Nullable
    public View v(int v, int v1) {
        for(int v2 = this.v.getChildCount() - 1; v2 >= 0; --v2) {
            View view0 = this.v.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public void w(int v, int v1, int v2, int v3) {
        if(!this.u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.r.fling(this.t.getLeft(), this.t.getTop(), ((int)this.l.getXVelocity(this.c)), ((int)this.l.getYVelocity(this.c)), v, v2, v1, v3);
        this.R(2);
    }

    private boolean x(int v, int v1, int v2, int v3) {
        int v4 = this.t.getLeft();
        int v5 = this.t.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        if(v6 == 0 && v7 == 0) {
            this.r.abortAnimation();
            this.R(0);
            return false;
        }
        int v8 = this.n(this.t, v6, v7, v2, v3);
        this.r.startScroll(v4, v5, v6, v7, v8);
        this.R(2);
        return true;
    }

    public int y() {
        return this.c;
    }

    @Nullable
    public View z() {
        return this.t;
    }

    class androidx.customview.widget.ViewDragHelper.2 implements Runnable {
        final ViewDragHelper a;

        @Override
        public void run() {
            ViewDragHelper.this.R(0);
        }
    }

}

