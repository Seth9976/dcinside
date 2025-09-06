package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

class FastScroller extends ItemDecoration implements OnItemTouchListener {
    class AnimatorListener extends AnimatorListenerAdapter {
        private boolean a;
        final FastScroller b;

        AnimatorListener() {
            this.a = false;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.a = true;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            if(this.a) {
                this.a = false;
                return;
            }
            if(((float)(((Float)FastScroller.this.z.getAnimatedValue()))) == 0.0f) {
                FastScroller.this.A = 0;
                FastScroller.this.G(0);
                return;
            }
            FastScroller.this.A = 2;
            FastScroller.this.D();
        }
    }

    class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        final FastScroller a;

        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator0) {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            FastScroller.this.c.setAlpha(((int)(f * 255.0f)));
            FastScroller.this.d.setAlpha(((int)(f * 255.0f)));
            FastScroller.this.D();
        }
    }

    int A;
    private final Runnable B;
    private final OnScrollListener C;
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 500;
    private static final int O = 1500;
    private static final int P = 1200;
    private static final int Q = 500;
    private static final int X = 0xFF;
    private static final int[] Y;
    private static final int[] Z;
    private final int a;
    private final int b;
    final StateListDrawable c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    @VisibleForTesting
    int k;
    @VisibleForTesting
    int l;
    @VisibleForTesting
    float m;
    @VisibleForTesting
    int n;
    @VisibleForTesting
    int o;
    @VisibleForTesting
    float p;
    private int q;
    private int r;
    private RecyclerView s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    final ValueAnimator z;

    static {
        FastScroller.Y = new int[]{0x10100A7};
        FastScroller.Z = new int[0];
    }

    FastScroller(RecyclerView recyclerView0, StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1, int v, int v1, int v2) {
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = valueAnimator0;
        this.A = 0;
        this.B = () -> {
            int v1 = FastScroller.this.A;
            if(v1 == 1) {
                FastScroller.this.z.cancel();
            }
            else if(v1 != 2) {
                return;
            }
            FastScroller.this.A = 3;
            float[] arr_f = {((float)(((Float)FastScroller.this.z.getAnimatedValue()))), 0.0f};
            FastScroller.this.z.setFloatValues(arr_f);
            FastScroller.this.z.setDuration(((long)500));
            FastScroller.this.z.start();
        };
        this.C = new OnScrollListener() {
            final FastScroller a;

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrolled(RecyclerView recyclerView0, int v, int v1) {
                int v2 = recyclerView0.computeHorizontalScrollOffset();
                int v3 = recyclerView0.computeVerticalScrollOffset();
                FastScroller.this.J(v2, v3);
            }
        };
        this.c = stateListDrawable0;
        this.d = drawable0;
        this.g = stateListDrawable1;
        this.h = drawable1;
        this.e = Math.max(v, stateListDrawable0.getIntrinsicWidth());
        this.f = Math.max(v, drawable0.getIntrinsicWidth());
        this.i = Math.max(v, stateListDrawable1.getIntrinsicWidth());
        this.j = Math.max(v, drawable1.getIntrinsicWidth());
        this.a = v1;
        this.b = v2;
        stateListDrawable0.setAlpha(0xFF);
        drawable0.setAlpha(0xFF);
        valueAnimator0.addListener(new AnimatorListener(this));
        valueAnimator0.addUpdateListener(new AnimatorUpdater(this));
        this.l(recyclerView0);
    }

    @VisibleForTesting
    boolean A(float f, float f1) {
        return f1 >= ((float)(this.r - this.i)) && (f >= ((float)(this.o - this.n / 2)) && f <= ((float)(this.o + this.n / 2)));
    }

    @VisibleForTesting
    boolean B(float f, float f1) {
        if(this.z()) {
            return f <= ((float)this.e) ? f1 >= ((float)(this.l - this.k / 2)) && f1 <= ((float)(this.l + this.k / 2)) : false;
        }
        return f >= ((float)(this.q - this.e)) ? f1 >= ((float)(this.l - this.k / 2)) && f1 <= ((float)(this.l + this.k / 2)) : false;
    }

    @VisibleForTesting
    boolean C() {
        return this.v == 1;
    }

    void D() {
        this.s.invalidate();
    }

    private void E(int v) {
        this.m();
        this.s.postDelayed(this.B, ((long)v));
    }

    private int F(float f, float f1, int[] arr_v, int v, int v1, int v2) {
        int v3 = arr_v[1] - arr_v[0];
        if(v3 == 0) {
            return 0;
        }
        int v4 = v - v2;
        int v5 = (int)((f1 - f) / ((float)v3) * ((float)v4));
        return v1 + v5 >= v4 || v1 + v5 < 0 ? 0 : v5;
    }

    void G(int v) {
        if(v == 2 && this.v != 2) {
            this.c.setState(FastScroller.Y);
            this.m();
        }
        if(v == 0) {
            this.D();
        }
        else {
            this.I();
        }
        if(this.v == 2 && v != 2) {
            this.c.setState(FastScroller.Z);
            this.E(1200);
        }
        else if(v == 1) {
            this.E(1500);
        }
        this.v = v;
    }

    private void H() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    public void I() {
        int v = this.A;
        if(v == 0) {
        label_4:
            this.A = 1;
            float[] arr_f = {((float)(((Float)this.z.getAnimatedValue()))), 1.0f};
            this.z.setFloatValues(arr_f);
            this.z.setDuration(500L);
            this.z.setStartDelay(0L);
            this.z.start();
        }
        else if(v == 3) {
            this.z.cancel();
            goto label_4;
        }
    }

    void J(int v, int v1) {
        int v2 = this.s.computeVerticalScrollRange();
        int v3 = this.r;
        this.t = v2 - v3 > 0 && v3 >= this.a;
        int v4 = this.s.computeHorizontalScrollRange();
        int v5 = this.q;
        boolean z = v4 - v5 > 0 && v5 >= this.a;
        this.u = z;
        boolean z1 = this.t;
        if(!z1 && !z) {
            if(this.v != 0) {
                this.G(0);
            }
            return;
        }
        if(z1) {
            this.l = (int)(((float)v3) * (((float)v1) + ((float)v3) / 2.0f) / ((float)v2));
            this.k = Math.min(v3, v3 * v3 / v2);
        }
        if(this.u) {
            this.o = (int)(((float)v5) * (((float)v) + ((float)v5) / 2.0f) / ((float)v4));
            this.n = Math.min(v5, v5 * v5 / v4);
        }
        if(this.v == 0 || this.v == 1) {
            this.G(1);
        }
    }

    private void K(float f) {
        int[] arr_v = this.t();
        float f1 = Math.max(arr_v[0], Math.min(arr_v[1], f));
        if(Math.abs(((float)this.l) - f1) < 2.0f) {
            return;
        }
        int v = this.F(this.m, f1, arr_v, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if(v != 0) {
            this.s.scrollBy(0, v);
        }
        this.m = f1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public void h(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
        if(this.v == 0) {
            return;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                boolean z = this.B(motionEvent0.getX(), motionEvent0.getY());
                boolean z1 = this.A(motionEvent0.getX(), motionEvent0.getY());
                if(z || z1) {
                    if(z1) {
                        this.w = 1;
                        this.p = (float)(((int)motionEvent0.getX()));
                    }
                    else if(z) {
                        this.w = 2;
                        this.m = (float)(((int)motionEvent0.getY()));
                    }
                    this.G(2);
                    return;
                }
                break;
            }
            case 1: {
                if(this.v == 2) {
                    this.m = 0.0f;
                    this.p = 0.0f;
                    this.G(1);
                    this.w = 0;
                    return;
                }
            label_22:
                if(motionEvent0.getAction() == 2 && this.v == 2) {
                    this.I();
                    if(this.w == 1) {
                        this.x(motionEvent0.getX());
                    }
                    if(this.w == 2) {
                        this.K(motionEvent0.getY());
                    }
                }
                break;
            }
            default: {
                goto label_22;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public boolean i(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
        int v = this.v;
        if(v == 1) {
            boolean z = this.B(motionEvent0.getX(), motionEvent0.getY());
            boolean z1 = this.A(motionEvent0.getX(), motionEvent0.getY());
            if(motionEvent0.getAction() == 0 && (z || z1)) {
                if(z1) {
                    this.w = 1;
                    this.p = (float)(((int)motionEvent0.getX()));
                }
                else if(z) {
                    this.w = 2;
                    this.m = (float)(((int)motionEvent0.getY()));
                }
                this.G(2);
                return true;
            }
            return false;
        }
        return v == 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public void j(boolean z) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void k(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        if(this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if(this.A != 0) {
                if(this.t) {
                    this.p(canvas0);
                }
                if(this.u) {
                    this.o(canvas0);
                }
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        this.G(0);
    }

    public void l(@Nullable RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.s;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        if(recyclerView1 != null) {
            this.n();
        }
        this.s = recyclerView0;
        if(recyclerView0 != null) {
            this.H();
        }
    }

    private void m() {
        this.s.removeCallbacks(this.B);
    }

    private void n() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        this.m();
    }

    private void o(Canvas canvas0) {
        int v = this.r - this.i;
        int v1 = this.o - this.n / 2;
        this.g.setBounds(0, 0, this.n, this.i);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas0.translate(0.0f, ((float)v));
        this.h.draw(canvas0);
        canvas0.translate(((float)v1), 0.0f);
        this.g.draw(canvas0);
        canvas0.translate(((float)(-v1)), ((float)(-v)));
    }

    private void p(Canvas canvas0) {
        int v = this.q - this.e;
        int v1 = this.l - this.k / 2;
        this.c.setBounds(0, 0, this.e, this.k);
        this.d.setBounds(0, 0, this.f, this.r);
        if(this.z()) {
            this.d.draw(canvas0);
            canvas0.translate(((float)this.e), ((float)v1));
            canvas0.scale(-1.0f, 1.0f);
            this.c.draw(canvas0);
            canvas0.scale(-1.0f, 1.0f);
            canvas0.translate(((float)(-this.e)), ((float)(-v1)));
            return;
        }
        canvas0.translate(((float)v), 0.0f);
        this.d.draw(canvas0);
        canvas0.translate(0.0f, ((float)v1));
        this.c.draw(canvas0);
        canvas0.translate(((float)(-v)), ((float)(-v1)));
    }

    private int[] q() {
        this.y[0] = this.b;
        this.y[1] = this.q - this.b;
        return this.y;
    }

    @VisibleForTesting
    Drawable r() {
        return this.g;
    }

    @VisibleForTesting
    Drawable s() {
        return this.h;
    }

    private int[] t() {
        this.x[0] = this.b;
        this.x[1] = this.r - this.b;
        return this.x;
    }

    @VisibleForTesting
    Drawable u() {
        return this.c;
    }

    @VisibleForTesting
    Drawable v() {
        return this.d;
    }

    // 检测为 Lambda 实现
    @VisibleForTesting
    void w(int v) [...]

    private void x(float f) {
        int[] arr_v = this.q();
        float f1 = Math.max(arr_v[0], Math.min(arr_v[1], f));
        if(Math.abs(((float)this.o) - f1) < 2.0f) {
            return;
        }
        int v = this.F(this.p, f1, arr_v, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if(v != 0) {
            this.s.scrollBy(v, 0);
        }
        this.p = f1;
    }

    public boolean y() {
        return this.v == 2;
    }

    private boolean z() {
        return this.s.getLayoutDirection() == 1;
    }

    class androidx.recyclerview.widget.FastScroller.1 implements Runnable {
        final FastScroller a;

        @Override
        public void run() {
            FastScroller.this.w(500);
        }
    }

}

