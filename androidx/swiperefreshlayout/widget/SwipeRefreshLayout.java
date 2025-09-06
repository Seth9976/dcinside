package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;

public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingChild, NestedScrollingParent {
    public interface OnChildScrollUpCallback {
        boolean a(@NonNull SwipeRefreshLayout arg1, @Nullable View arg2);
    }

    public interface OnRefreshListener {
        void a();
    }

    int A;
    CircularProgressDrawable B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    boolean H;
    private int I;
    boolean J;
    private OnChildScrollUpCallback K;
    private Animation.AnimationListener L;
    private final Animation M;
    @VisibleForTesting
    static final int M8 = 40;
    private final Animation N;
    @VisibleForTesting
    static final int N8 = 56;
    public static final int O = 0;
    private static final String O8 = "SwipeRefreshLayout";
    public static final int P = 1;
    private static final int P8 = 0xFF;
    public static final int Q = -1;
    private static final int Q8 = 76;
    private static final float R8 = 2.0f;
    private static final int S8 = -1;
    private static final float T8 = 0.5f;
    private static final float U8 = 0.8f;
    private static final int V8 = 150;
    private static final int W8 = 300;
    private static final int X8 = 200;
    private static final int Y8 = 200;
    private static final int Z8 = 0xFFFAFAFA;
    private View a;
    private static final int a9 = 0x40;
    OnRefreshListener b;
    private static final int[] b9;
    boolean c;
    private int d;
    private float e;
    private float f;
    private final NestedScrollingParentHelper g;
    private final NestedScrollingChildHelper h;
    private final int[] i;
    private final int[] j;
    private boolean k;
    private int l;
    int m;
    private float n;
    private float o;
    private boolean p;
    private int q;
    boolean r;
    private boolean s;
    private final DecelerateInterpolator t;
    CircleImageView u;
    private int v;
    protected int w;
    float x;
    protected int y;
    int z;

    static {
        SwipeRefreshLayout.b9 = new int[]{0x101000E};
    }

    public SwipeRefreshLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public SwipeRefreshLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.q = -1;
        this.v = -1;
        this.L = new Animation.AnimationListener() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                SwipeRefreshLayout swipeRefreshLayout0 = SwipeRefreshLayout.this;
                if(swipeRefreshLayout0.c) {
                    swipeRefreshLayout0.B.setAlpha(0xFF);
                    SwipeRefreshLayout.this.B.start();
                    SwipeRefreshLayout swipeRefreshLayout1 = SwipeRefreshLayout.this;
                    if(swipeRefreshLayout1.H) {
                        OnRefreshListener swipeRefreshLayout$OnRefreshListener0 = swipeRefreshLayout1.b;
                        if(swipeRefreshLayout$OnRefreshListener0 != null) {
                            swipeRefreshLayout$OnRefreshListener0.a();
                        }
                    }
                    SwipeRefreshLayout.this.m = SwipeRefreshLayout.this.u.getTop();
                    return;
                }
                swipeRefreshLayout0.o();
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
            }
        };
        this.M = new Animation() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                int v = SwipeRefreshLayout.this.w + ((int)(((float)((SwipeRefreshLayout.this.J ? SwipeRefreshLayout.this.z : SwipeRefreshLayout.this.z - Math.abs(SwipeRefreshLayout.this.y)) - SwipeRefreshLayout.this.w)) * f));
                int v1 = SwipeRefreshLayout.this.u.getTop();
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom(v - v1);
                SwipeRefreshLayout.this.B.v(1.0f - f);
            }
        };
        this.N = new Animation() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                SwipeRefreshLayout.this.k(f);
            }
        };
        this.d = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.l = this.getResources().getInteger(0x10E0001);
        this.setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.I = (int)(displayMetrics0.density * 40.0f);
        this.e();
        this.setChildrenDrawingOrderEnabled(true);
        int v = (int)(displayMetrics0.density * 64.0f);
        this.z = v;
        this.e = (float)v;
        this.g = new NestedScrollingParentHelper(this);
        this.h = new NestedScrollingChildHelper(this);
        this.setNestedScrollingEnabled(true);
        this.m = -this.I;
        this.y = -this.I;
        this.k(1.0f);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, SwipeRefreshLayout.b9);
        this.setEnabled(typedArray0.getBoolean(0, true));
        typedArray0.recycle();
    }

    private void A(int v, Animation.AnimationListener animation$AnimationListener0) {
        this.w = v;
        this.x = this.u.getScaleX();
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8 swipeRefreshLayout$80 = new Animation() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.x + -SwipeRefreshLayout.this.x * f);
                SwipeRefreshLayout.this.k(f);
            }
        };
        this.G = swipeRefreshLayout$80;
        swipeRefreshLayout$80.setDuration(150L);
        if(animation$AnimationListener0 != null) {
            this.u.b(animation$AnimationListener0);
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.G);
    }

    private void B(Animation.AnimationListener animation$AnimationListener0) {
        this.u.setVisibility(0);
        this.B.setAlpha(0xFF);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2 swipeRefreshLayout$20 = new Animation() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.C = swipeRefreshLayout$20;
        swipeRefreshLayout$20.setDuration(((long)this.l));
        if(animation$AnimationListener0 != null) {
            this.u.b(animation$AnimationListener0);
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.C);
    }

    private void b(int v, Animation.AnimationListener animation$AnimationListener0) {
        this.w = v;
        this.M.reset();
        this.M.setDuration(200L);
        this.M.setInterpolator(this.t);
        if(animation$AnimationListener0 != null) {
            this.u.b(animation$AnimationListener0);
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.M);
    }

    private void c(int v, Animation.AnimationListener animation$AnimationListener0) {
        if(this.r) {
            this.A(v, animation$AnimationListener0);
            return;
        }
        this.w = v;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.t);
        if(animation$AnimationListener0 != null) {
            this.u.b(animation$AnimationListener0);
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.N);
    }

    public boolean d() {
        OnChildScrollUpCallback swipeRefreshLayout$OnChildScrollUpCallback0 = this.K;
        if(swipeRefreshLayout$OnChildScrollUpCallback0 != null) {
            return swipeRefreshLayout$OnChildScrollUpCallback0.a(this, this.a);
        }
        View view0 = this.a;
        return view0 instanceof ListView ? ListViewCompat.a(((ListView)view0), -1) : view0.canScrollVertically(-1);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.h.a(f, f1, z);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.h.b(f, f1);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.h.c(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.h.f(v, v1, v2, v3, arr_v);
    }

    private void e() {
        this.u = new CircleImageView(this.getContext(), 0xFFFAFAFA);
        CircularProgressDrawable circularProgressDrawable0 = new CircularProgressDrawable(this.getContext());
        this.B = circularProgressDrawable0;
        circularProgressDrawable0.F(1);
        this.u.setImageDrawable(this.B);
        this.u.setVisibility(8);
        this.addView(this.u);
    }

    private void f() {
        if(this.a == null) {
            for(int v = 0; v < this.getChildCount(); ++v) {
                View view0 = this.getChildAt(v);
                if(!view0.equals(this.u)) {
                    this.a = view0;
                    return;
                }
            }
        }
    }

    private void g(float f) {
        if(f > this.e) {
            this.t(true, true);
            return;
        }
        this.c = false;
        this.B.C(0.0f, 0.0f);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5 swipeRefreshLayout$50 = this.r ? null : new Animation.AnimationListener() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                SwipeRefreshLayout swipeRefreshLayout0 = SwipeRefreshLayout.this;
                if(!swipeRefreshLayout0.r) {
                    swipeRefreshLayout0.z(null);
                }
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
            }
        };
        this.c(this.m, swipeRefreshLayout$50);
        this.B.u(false);
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        int v2 = this.v;
        if(v2 < 0) {
            return v1;
        }
        if(v1 == v - 1) {
            return v2;
        }
        return v1 < v2 ? v1 : v1 + 1;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.g.a();
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.z;
    }

    public int getProgressViewStartOffset() {
        return this.y;
    }

    // 去混淆评级： 低(20)
    private boolean h(Animation animation0) {
        return animation0 != null && animation0.hasStarted() && !animation0.hasEnded();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean hasNestedScrollingParent() {
        return this.h.k();
    }

    public boolean i() {
        return this.c;
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.h.m();
    }

    private void j(float f) {
        this.B.u(true);
        float f1 = Math.min(1.0f, Math.abs(f / this.e));
        float f2 = ((float)Math.max(((double)f1) - 0.4, 0.0)) * 5.0f / 3.0f;
        float f3 = Math.abs(f) - this.e;
        int v = this.A;
        if(v <= 0) {
            v = this.J ? this.z - this.y : this.z;
        }
        float f4 = Math.max(0.0f, Math.min(f3, ((float)v) * 2.0f) / ((float)v));
        float f5 = ((float)(((double)(f4 / 4.0f)) - Math.pow(f4 / 4.0f, 2.0))) * 2.0f;
        int v1 = this.y + ((int)(((float)v) * f1 + ((float)v) * f5 * 2.0f));
        if(this.u.getVisibility() != 0) {
            this.u.setVisibility(0);
        }
        if(!this.r) {
            this.u.setScaleX(1.0f);
            this.u.setScaleY(1.0f);
        }
        if(this.r) {
            this.setAnimationProgress(Math.min(1.0f, f / this.e));
        }
        if(f >= this.e) {
            if(this.B.getAlpha() < 0xFF && !this.h(this.F)) {
                this.x();
            }
        }
        else if(this.B.getAlpha() > 76 && !this.h(this.E)) {
            this.y();
        }
        this.B.C(0.0f, Math.min(0.8f, f2 * 0.8f));
        this.B.v(Math.min(1.0f, f2));
        this.B.z((f2 * 0.4f - 0.25f + f5 * 2.0f) * 0.5f);
        this.setTargetOffsetTopAndBottom(v1 - this.m);
    }

    void k(float f) {
        this.setTargetOffsetTopAndBottom(this.w + ((int)(((float)(this.y - this.w)) * f)) - this.u.getTop());
    }

    private void m(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.q) {
            this.q = motionEvent0.getPointerId((v == 0 ? 1 : 0));
        }
    }

    void o() {
        this.u.clearAnimation();
        this.B.stop();
        this.u.setVisibility(8);
        this.setColorViewAlpha(0xFF);
        if(this.r) {
            this.setAnimationProgress(0.0f);
        }
        else {
            this.setTargetOffsetTopAndBottom(this.y - this.m);
        }
        this.m = this.u.getTop();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o();
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        this.f();
        int v = motionEvent0.getActionMasked();
        if(this.s && v == 0) {
            this.s = false;
        }
        if(this.isEnabled() && !this.s && !this.d() && !this.c && !this.k) {
            switch(v) {
                case 0: {
                    this.setTargetOffsetTopAndBottom(this.y - this.u.getTop());
                    int v3 = motionEvent0.getPointerId(0);
                    this.q = v3;
                    this.p = false;
                    int v4 = motionEvent0.findPointerIndex(v3);
                    if(v4 < 0) {
                        return false;
                    }
                    this.o = motionEvent0.getY(v4);
                    return this.p;
                }
                case 2: {
                    int v1 = this.q;
                    if(v1 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don\'t have an active pointer id.");
                        return false;
                    }
                    int v2 = motionEvent0.findPointerIndex(v1);
                    if(v2 < 0) {
                        return false;
                    }
                    this.w(motionEvent0.getY(v2));
                    return this.p;
                }
                case 1: 
                case 3: {
                    this.p = false;
                    this.q = -1;
                    return false;
                }
                case 6: {
                    this.m(motionEvent0);
                    return this.p;
                }
                default: {
                    return this.p;
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getMeasuredWidth();
        int v5 = this.getMeasuredHeight();
        if(this.getChildCount() == 0) {
            return;
        }
        if(this.a == null) {
            this.f();
        }
        View view0 = this.a;
        if(view0 == null) {
            return;
        }
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingTop();
        view0.layout(v6, v7, v4 - this.getPaddingLeft() - this.getPaddingRight() + v6, v5 - this.getPaddingTop() - this.getPaddingBottom() + v7);
        int v8 = this.u.getMeasuredWidth();
        int v9 = this.u.getMeasuredHeight();
        this.u.layout(v4 / 2 - v8 / 2, this.m, v4 / 2 + v8 / 2, v9 + this.m);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.a == null) {
            this.f();
        }
        View view0 = this.a;
        if(view0 == null) {
            return;
        }
        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 0x40000000));
        this.u.measure(View.MeasureSpec.makeMeasureSpec(this.I, 0x40000000), View.MeasureSpec.makeMeasureSpec(this.I, 0x40000000));
        this.v = -1;
        for(int v2 = 0; v2 < this.getChildCount(); ++v2) {
            if(this.getChildAt(v2) == this.u) {
                this.v = v2;
                return;
            }
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        return this.dispatchNestedFling(f, f1, z);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return this.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        if(v1 > 0) {
            float f = this.f;
            if(f > 0.0f) {
                if(((float)v1) > f) {
                    arr_v[1] = v1 - ((int)f);
                    this.f = 0.0f;
                }
                else {
                    this.f = f - ((float)v1);
                    arr_v[1] = v1;
                }
                this.j(this.f);
            }
        }
        if(this.J && v1 > 0 && this.f == 0.0f && Math.abs(v1 - arr_v[1]) > 0) {
            this.u.setVisibility(8);
        }
        int[] arr_v1 = this.i;
        if(this.dispatchNestedPreScroll(v - arr_v[0], v1 - arr_v[1], arr_v1, null)) {
            arr_v[0] += arr_v1[0];
            arr_v[1] += arr_v1[1];
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.dispatchNestedScroll(v, v1, v2, v3, this.j);
        int v4 = v3 + this.j[1];
        if(v4 < 0 && !this.d()) {
            float f = this.f + ((float)Math.abs(v4));
            this.f = f;
            this.j(f);
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.g.b(view0, view1, v);
        this.startNestedScroll(v & 2);
        this.f = 0.0f;
        this.k = true;
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.isEnabled() && !this.s && !this.c && (v & 2) != 0;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view0) {
        this.g.d(view0);
        this.k = false;
        float f = this.f;
        if(f > 0.0f) {
            this.g(f);
            this.f = 0.0f;
        }
        this.stopNestedScroll();
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(this.s && v == 0) {
            this.s = false;
        }
        if(this.isEnabled() && !this.s && !this.d() && !this.c && !this.k) {
            switch(v) {
                case 0: {
                    this.q = motionEvent0.getPointerId(0);
                    this.p = false;
                    break;
                }
                case 1: {
                    int v2 = motionEvent0.findPointerIndex(this.q);
                    if(v2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don\'t have an active pointer id.");
                        return false;
                    }
                    if(this.p) {
                        float f = motionEvent0.getY(v2);
                        this.p = false;
                        this.g((f - this.n) * 0.5f);
                    }
                    this.q = -1;
                    return false;
                }
                case 2: {
                    int v3 = motionEvent0.findPointerIndex(this.q);
                    if(v3 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float f1 = motionEvent0.getY(v3);
                    this.w(f1);
                    if(this.p) {
                        float f2 = (f1 - this.n) * 0.5f;
                        if(f2 > 0.0f) {
                            this.j(f2);
                            return true;
                        }
                        return false;
                    }
                    break;
                }
                case 3: {
                    return false;
                }
                case 5: {
                    int v1 = motionEvent0.getActionIndex();
                    if(v1 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.q = motionEvent0.getPointerId(v1);
                    return true;
                }
                case 6: {
                    this.m(motionEvent0);
                    return true;
                }
                default: {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void q(boolean z, int v) {
        this.z = v;
        this.r = z;
        this.u.invalidate();
    }

    public void r(boolean z, int v, int v1) {
        this.r = z;
        this.y = v;
        this.z = v1;
        this.J = true;
        this.o();
        this.c = false;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(this.a == null || ViewCompat.c1(this.a)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    void setAnimationProgress(float f) {
        this.u.setScaleX(f);
        this.u.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int[] arr_v) {
        this.setColorSchemeResources(arr_v);
    }

    public void setColorSchemeColors(@ColorInt int[] arr_v) {
        this.f();
        this.B.y(arr_v);
    }

    public void setColorSchemeResources(@ColorRes int[] arr_v) {
        Context context0 = this.getContext();
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = ContextCompat.getColor(context0, arr_v[v]);
        }
        this.setColorSchemeColors(arr_v1);
    }

    private void setColorViewAlpha(int v) {
        this.u.getBackground().setAlpha(v);
        this.B.setAlpha(v);
    }

    public void setDistanceToTriggerSync(int v) {
        this.e = (float)v;
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if(!z) {
            this.o();
        }
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.p(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback swipeRefreshLayout$OnChildScrollUpCallback0) {
        this.K = swipeRefreshLayout$OnChildScrollUpCallback0;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener swipeRefreshLayout$OnRefreshListener0) {
        this.b = swipeRefreshLayout$OnRefreshListener0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int v) {
        this.setProgressBackgroundColorSchemeResource(v);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int v) {
        this.u.setBackgroundColor(v);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int v) {
        this.setProgressBackgroundColorSchemeColor(ContextCompat.getColor(this.getContext(), v));
    }

    public void setRefreshing(boolean z) {
        if(z && !this.c) {
            this.c = true;
            this.setTargetOffsetTopAndBottom((this.J ? this.z : this.z + this.y) - this.m);
            this.H = false;
            this.B(this.L);
            return;
        }
        this.t(z, false);
    }

    public void setSize(int v) {
        if(v != 0 && v != 1) {
            return;
        }
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.I = v == 0 ? ((int)(displayMetrics0.density * 56.0f)) : ((int)(displayMetrics0.density * 40.0f));
        this.u.setImageDrawable(null);
        this.B.F(v);
        this.u.setImageDrawable(this.B);
    }

    public void setSlingshotDistance(@Px int v) {
        this.A = v;
    }

    void setTargetOffsetTopAndBottom(int v) {
        this.u.bringToFront();
        ViewCompat.l1(this.u, v);
        this.m = this.u.getTop();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean startNestedScroll(int v) {
        return this.h.r(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public void stopNestedScroll() {
        this.h.t();
    }

    private void t(boolean z, boolean z1) {
        if(this.c != z) {
            this.H = z1;
            this.f();
            this.c = z;
            if(z) {
                this.b(this.m, this.L);
                return;
            }
            this.z(this.L);
        }
    }

    private Animation v(int v, int v1) {
        Animation animation0 = new Animation() {
            final SwipeRefreshLayout c;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                SwipeRefreshLayout.this.B.setAlpha(((int)(((float)v) + ((float)(v1 - v)) * f)));
            }
        };
        animation0.setDuration(300L);
        this.u.b(null);
        this.u.clearAnimation();
        this.u.startAnimation(animation0);
        return animation0;
    }

    private void w(float f) {
        float f1 = this.o;
        int v = this.d;
        if(f - f1 > ((float)v) && !this.p) {
            this.n = f1 + ((float)v);
            this.p = true;
            this.B.setAlpha(76);
        }
    }

    private void x() {
        this.F = this.v(this.B.getAlpha(), 0xFF);
    }

    private void y() {
        this.E = this.v(this.B.getAlpha(), 76);
    }

    void z(Animation.AnimationListener animation$AnimationListener0) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3 swipeRefreshLayout$30 = new Animation() {
            final SwipeRefreshLayout a;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.D = swipeRefreshLayout$30;
        swipeRefreshLayout$30.setDuration(150L);
        this.u.b(animation$AnimationListener0);
        this.u.clearAnimation();
        this.u.startAnimation(this.D);
    }
}

