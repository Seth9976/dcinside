package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarouselLayoutManager extends LayoutManager implements ScrollVectorProvider, b {
    static final class com.google.android.material.carousel.CarouselLayoutManager.b {
        final View a;
        final float b;
        final float c;
        final d d;

        com.google.android.material.carousel.CarouselLayoutManager.b(View view0, float f, float f1, d carouselLayoutManager$d0) {
            this.a = view0;
            this.b = f;
            this.c = f1;
            this.d = carouselLayoutManager$d0;
        }
    }

    static class c extends ItemDecoration {
        private final Paint a;
        private List b;

        c() {
            Paint paint0 = new Paint();
            this.a = paint0;
            this.b = DesugarCollections.unmodifiableList(new ArrayList());
            paint0.setStrokeWidth(5.0f);
            paint0.setColor(0xFFFF00FF);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
        public void k(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
            super.k(canvas0, recyclerView0, recyclerView$State0);
            float f = recyclerView0.getResources().getDimension(dimen.m3_carousel_debug_keyline_width);
            this.a.setStrokeWidth(f);
            for(Object object0: this.b) {
                com.google.android.material.carousel.k.c k$c0 = (com.google.android.material.carousel.k.c)object0;
                int v = ColorUtils.j(0xFFFF00FF, 0xFF0000FF, k$c0.c);
                this.a.setColor(v);
                if(((CarouselLayoutManager)recyclerView0.getLayoutManager()).r()) {
                    float f1 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).o3();
                    float f2 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).j3();
                    canvas0.drawLine(k$c0.b, f1, k$c0.b, f2, this.a);
                }
                else {
                    float f3 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).l3();
                    float f4 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).m3();
                    canvas0.drawLine(f3, k$c0.b, f4, k$c0.b, this.a);
                }
            }
        }

        void l(List list0) {
            this.b = DesugarCollections.unmodifiableList(list0);
        }
    }

    static class d {
        final com.google.android.material.carousel.k.c a;
        final com.google.android.material.carousel.k.c b;

        d(com.google.android.material.carousel.k.c k$c0, com.google.android.material.carousel.k.c k$c1) {
            Preconditions.a(k$c0.a <= k$c1.a);
            this.a = k$c0;
            this.b = k$c1;
        }
    }

    static class e {
        private static final int a = -1;
        private static final int b = 1;
        private static final int c = 0x80000000;

    }

    private int A;
    @Nullable
    private Map B;
    private com.google.android.material.carousel.e C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;
    private static final String H = "CarouselLayoutManager";
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 0;
    public static final int L = 1;
    @VisibleForTesting
    int s;
    @VisibleForTesting
    int t;
    @VisibleForTesting
    int u;
    private boolean v;
    private final c w;
    @NonNull
    private g x;
    @Nullable
    private l y;
    @Nullable
    private k z;

    public CarouselLayoutManager() {
        this(new p());
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> if(v != v4 || v1 != v5 || v2 != v6 || v3 != v7) {
            view0.post(() -> {
                this.y = null;
                this.g2();
            });
        };
        this.F = -1;
        this.G = 0;
        this.H3(new p());
        this.G3(context0, attributeSet0);
    }

    public CarouselLayoutManager(@NonNull g g0) {
        this(g0, 0);
    }

    public CarouselLayoutManager(@NonNull g g0, int v) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> if(v != v4 || v1 != v5 || v2 != v6 || v3 != v7) {
            view0.post(() -> {
                this.y = null;
                this.g2();
            });
        };
        this.F = -1;
        this.G = 0;
        this.H3(g0);
        this.J3(v);
    }

    private void A3(Recycler recyclerView$Recycler0) {
        View view0 = recyclerView$Recycler0.p(0);
        this.k1(view0, 0, 0);
        k k0 = this.x.g(this, view0);
        if(this.t3()) {
            k0 = k.n(k0, ((float)this.a3()));
        }
        this.y = l.f(this, k0, ((float)this.c3()), ((float)this.e3()), ((float)this.p3()));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void B1(@NonNull RecyclerView recyclerView0, int v, int v1) {
        super.B1(recyclerView0, v, v1);
        this.M3();
    }

    // 检测为 Lambda 实现
    private void B3() [...]

    private void C3(Recycler recyclerView$Recycler0) {
        while(this.j0() > 0) {
            View view0 = this.i0(0);
            float f = this.b3(view0);
            if(!this.v3(f, CarouselLayoutManager.s3(this.z.g(), f, true))) {
                break;
            }
            this.Y1(view0, recyclerView$Recycler0);
        }
        while(this.j0() - 1 >= 0) {
            View view1 = this.i0(this.j0() - 1);
            float f1 = this.b3(view1);
            if(!this.u3(f1, CarouselLayoutManager.s3(this.z.g(), f1, true))) {
                break;
            }
            this.Y1(view1, recyclerView$Recycler0);
        }
    }

    private int D3(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.j0() != 0 && v != 0) {
            if(this.y == null) {
                this.A3(recyclerView$Recycler0);
            }
            int v2 = CarouselLayoutManager.U2(v, this.s, this.t, this.u);
            this.s += v2;
            this.L3(this.y);
            float f = this.z.f();
            float f1 = this.R2(this.K0(this.i0(0)));
            Rect rect0 = new Rect();
            float f2 = this.t3() ? this.z.h().b : this.z.a().b;
            float f3 = 3.402823E+38f;
            for(int v1 = 0; v1 < this.j0(); ++v1) {
                View view0 = this.i0(v1);
                float f4 = Math.abs(f2 - this.z3(view0, f1, f / 2.0f, rect0));
                if(view0 != null && f4 < f3) {
                    this.F = this.K0(view0);
                    f3 = f4;
                }
                f1 = this.L2(f1, this.z.f());
            }
            this.X2(recyclerView$Recycler0, recyclerView$State0);
            return v2;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void E1(@NonNull RecyclerView recyclerView0, int v, int v1) {
        super.E1(recyclerView0, v, v1);
        this.M3();
    }

    private void E3(RecyclerView recyclerView0, int v) {
        if(this.r()) {
            recyclerView0.scrollBy(v, 0);
            return;
        }
        recyclerView0.scrollBy(0, v);
    }

    public void F3(int v) {
        this.G = v;
        this.B3();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean G() {
        return this.r();
    }

    private void G3(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Carousel);
            this.F3(typedArray0.getInt(styleable.Carousel_carousel_alignment, 0));
            this.J3(typedArray0.getInt(styleable.RecyclerView_android_orientation, 0));
            typedArray0.recycle();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean H() {
        return !this.r();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void H1(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(recyclerView$State0.d() > 0 && ((float)this.a3()) > 0.0f) {
            boolean z = this.t3();
            boolean z1 = this.y == null;
            if(z1) {
                this.A3(recyclerView$Recycler0);
            }
            int v = this.V2(this.y);
            int v1 = this.S2(recyclerView$State0, this.y);
            this.t = z ? v1 : v;
            if(z) {
                v1 = v;
            }
            this.u = v1;
            if(z1) {
                this.s = v;
                this.B = this.y.i(this.getItemCount(), this.t, this.u, this.t3());
                int v2 = this.F;
                if(v2 != -1) {
                    this.s = this.q3(v2, this.d3(v2));
                }
            }
            this.s += CarouselLayoutManager.U2(0, this.s, this.t, this.u);
            this.A = MathUtils.e(this.A, 0, recyclerView$State0.d());
            this.L3(this.y);
            this.S(recyclerView$Recycler0);
            this.X2(recyclerView$Recycler0, recyclerView$State0);
            this.E = this.getItemCount();
            return;
        }
        this.W1(recyclerView$Recycler0);
        this.A = 0;
    }

    public void H3(@NonNull g g0) {
        this.x = g0;
        this.B3();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void I1(State recyclerView$State0) {
        super.I1(recyclerView$State0);
        this.A = this.j0() == 0 ? 0 : this.K0(this.i0(0));
        this.N3();
    }

    @RestrictTo({Scope.b})
    public void I3(@NonNull RecyclerView recyclerView0, boolean z) {
        this.v = z;
        recyclerView0.removeItemDecoration(this.w);
        if(z) {
            recyclerView0.addItemDecoration(this.w);
        }
        recyclerView0.invalidateItemDecorations();
    }

    public void J3(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.B(null);
        if(this.C == null || v != this.C.a) {
            this.C = com.google.android.material.carousel.e.c(this, v);
            this.B3();
        }
    }

    private void K2(View view0, int v, com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0) {
        float f = this.z.f();
        this.y(view0, v);
        this.C.n(view0, ((int)(carouselLayoutManager$b0.c - f / 2.0f)), ((int)(carouselLayoutManager$b0.c + f / 2.0f)));
        this.K3(view0, carouselLayoutManager$b0.b, carouselLayoutManager$b0.d);
    }

    private void K3(View view0, float f, d carouselLayoutManager$d0) {
        if(!(view0 instanceof m)) {
            return;
        }
        float f1 = com.google.android.material.animation.b.b(carouselLayoutManager$d0.a.c, carouselLayoutManager$d0.b.c, carouselLayoutManager$d0.a.a, carouselLayoutManager$d0.b.a, f);
        float f2 = (float)view0.getHeight();
        float f3 = (float)view0.getWidth();
        RectF rectF0 = this.C.g(f2, f3, com.google.android.material.animation.b.b(0.0f, f2 / 2.0f, 0.0f, 1.0f, f1), com.google.android.material.animation.b.b(0.0f, f3 / 2.0f, 0.0f, 1.0f, f1));
        float f4 = this.Q2(view0, f, carouselLayoutManager$d0);
        float f5 = rectF0.height();
        float f6 = rectF0.height();
        RectF rectF1 = new RectF(f4 - rectF0.width() / 2.0f, f4 - f5 / 2.0f, f4 + rectF0.width() / 2.0f, f6 / 2.0f + f4);
        RectF rectF2 = new RectF(((float)this.l3()), ((float)this.o3()), ((float)this.m3()), ((float)this.j3()));
        if(this.x.f()) {
            this.C.a(rectF0, rectF1, rectF2);
        }
        this.C.o(rectF0, rectF1, rectF2);
        ((m)view0).setMaskRectF(rectF0);
    }

    // 去混淆评级： 低(20)
    private float L2(float f, float f1) {
        return this.t3() ? f - f1 : f + f1;
    }

    private void L3(@NonNull l l0) {
        int v = this.u;
        int v1 = this.t;
        if(v <= v1) {
            this.z = this.t3() ? l0.h() : l0.l();
        }
        else {
            this.z = l0.j(((float)this.s), ((float)v1), ((float)v));
        }
        this.w.l(this.z.g());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int M(@NonNull State recyclerView$State0) {
        return this.j0() == 0 || this.y == null || this.getItemCount() <= 1 ? 0 : ((int)(((float)this.R0()) * (this.y.g().f() / ((float)this.O(recyclerView$State0)))));
    }

    // 去混淆评级： 低(20)
    private float M2(float f, float f1) {
        return this.t3() ? f + f1 : f - f1;
    }

    private void M3() {
        int v = this.getItemCount();
        int v1 = this.E;
        if(v != v1 && this.y != null) {
            if(this.x.j(this, v1)) {
                this.B3();
            }
            this.E = v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int N(@NonNull State recyclerView$State0) {
        return this.s;
    }

    private void N2(@NonNull Recycler recyclerView$Recycler0, int v, int v1) {
        if(v >= 0 && v < this.getItemCount()) {
            com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0 = this.y3(recyclerView$Recycler0, this.R2(v), v);
            this.K2(carouselLayoutManager$b0.a, v1, carouselLayoutManager$b0);
        }
    }

    private void N3() {
        if(this.v && this.j0() >= 1) {
            int v = 0;
            while(v < this.j0() - 1) {
                int v1 = this.K0(this.i0(v));
                int v2 = this.K0(this.i0(v + 1));
                if(v1 <= v2) {
                    ++v;
                    continue;
                }
                this.x3();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + v + "] had adapter position [" + v1 + "] and child at index [" + (v + 1) + "] had adapter position [" + v2 + "].");
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int O(@NonNull State recyclerView$State0) {
        return this.u - this.t;
    }

    private void O2(Recycler recyclerView$Recycler0, State recyclerView$State0, int v) {
        float f = this.R2(v);
        while(v < recyclerView$State0.d()) {
            com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0 = this.y3(recyclerView$Recycler0, f, v);
            if(this.u3(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                break;
            }
            f = this.L2(f, this.z.f());
            if(!this.v3(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                this.K2(carouselLayoutManager$b0.a, -1, carouselLayoutManager$b0);
            }
            ++v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int P(@NonNull State recyclerView$State0) {
        return this.j0() == 0 || this.y == null || this.getItemCount() <= 1 ? 0 : ((int)(((float)this.x0()) * (this.y.g().f() / ((float)this.R(recyclerView$State0)))));
    }

    private void P2(Recycler recyclerView$Recycler0, int v) {
        float f = this.R2(v);
        while(v >= 0) {
            com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0 = this.y3(recyclerView$Recycler0, f, v);
            if(this.v3(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                break;
            }
            f = this.M2(f, this.z.f());
            if(!this.u3(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                this.K2(carouselLayoutManager$b0.a, 0, carouselLayoutManager$b0);
            }
            --v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int Q(@NonNull State recyclerView$State0) {
        return this.s;
    }

    private float Q2(View view0, float f, d carouselLayoutManager$d0) {
        float f1 = com.google.android.material.animation.b.b(carouselLayoutManager$d0.a.b, carouselLayoutManager$d0.b.b, carouselLayoutManager$d0.a.a, carouselLayoutManager$d0.b.a, f);
        com.google.android.material.carousel.k.c k$c0 = this.z.c();
        if(carouselLayoutManager$d0.b != k$c0) {
            com.google.android.material.carousel.k.c k$c1 = this.z.j();
            if(carouselLayoutManager$d0.a != k$c1) {
                return f1;
            }
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f2 = this.C.f(recyclerView$LayoutParams0);
        return f1 + (f - carouselLayoutManager$d0.b.a) * (1.0f - carouselLayoutManager$d0.b.c + f2 / this.z.f());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int R(@NonNull State recyclerView$State0) {
        return this.u - this.t;
    }

    private float R2(int v) {
        return this.L2(((float)(this.n3() - this.s)), this.z.f() * ((float)v));
    }

    private int S2(State recyclerView$State0, l l0) {
        boolean z = this.t3();
        k k0 = z ? l0.l() : l0.h();
        com.google.android.material.carousel.k.c k$c0 = z ? k0.a() : k0.h();
        int v = recyclerView$State0.d();
        float f = (float)this.n3();
        float f1 = (float)this.k3();
        int v1 = (int)(((float)(v - 1)) * k0.f() * (z ? -1.0f : 1.0f) - (k$c0.a - f) + (f1 - k$c0.a) + (z ? -k$c0.g : k$c0.h));
        return z ? Math.min(0, v1) : Math.max(0, v1);
    }

    int T2(int v) {
        float f = (float)this.q3(v, this.d3(v));
        return (int)(((float)this.s) - f);
    }

    private static int U2(int v, int v1, int v2, int v3) {
        int v4 = v1 + v;
        if(v4 < v2) {
            return v2 - v1;
        }
        return v4 <= v3 ? v : v3 - v1;
    }

    private int V2(@NonNull l l0) {
        boolean z = this.t3();
        k k0 = z ? l0.h() : l0.l();
        float f = this.M2((z ? k0.h() : k0.a()).a, k0.f() / 2.0f);
        return (int)(((float)this.n3()) - f);
    }

    private int W2(int v) {
        int v1 = this.i3();
        switch(v) {
            case 1: {
                return -1;
            }
            case 2: {
                return 1;
            }
            case 17: {
                if(v1 == 0) {
                    return this.t3() ? 1 : -1;
                }
                return 0x80000000;
            }
            case 33: {
                return v1 == 1 ? -1 : 0x80000000;
            }
            case 66: {
                if(v1 == 0) {
                    return this.t3() ? -1 : 1;
                }
                return 0x80000000;
            }
            case 130: {
                return v1 == 1 ? 1 : 0x80000000;
            }
            default: {
                Log.d("CarouselLayoutManager", "Unknown focus request:" + v);
                return 0x80000000;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean X0() {
        return true;
    }

    private void X2(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        this.C3(recyclerView$Recycler0);
        if(this.j0() == 0) {
            this.P2(recyclerView$Recycler0, this.A - 1);
            this.O2(recyclerView$Recycler0, recyclerView$State0, this.A);
        }
        else {
            int v = this.K0(this.i0(0));
            int v1 = this.K0(this.i0(this.j0() - 1));
            this.P2(recyclerView$Recycler0, v - 1);
            this.O2(recyclerView$Recycler0, recyclerView$State0, v1 + 1);
        }
        this.N3();
    }

    // 去混淆评级： 低(20)
    private View Y2() {
        return this.t3() ? this.i0(0) : this.i0(this.j0() - 1);
    }

    // 去混淆评级： 低(20)
    private View Z2() {
        return this.t3() ? this.i0(this.j0() - 1) : this.i0(0);
    }

    // 去混淆评级： 低(20)
    private int a3() {
        return this.r() ? this.n() : this.e();
    }

    private float b3(View view0) {
        Rect rect0 = new Rect();
        super.q0(view0, rect0);
        return this.r() ? ((float)rect0.centerX()) : ((float)rect0.centerY());
    }

    private int c3() {
        if(this.j0() > 0) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)this.i0(0).getLayoutParams();
            return this.C.a == 0 ? recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin : recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public LayoutParams d0() {
        return new LayoutParams(-2, -2);
    }

    private k d3(int v) {
        Map map0 = this.B;
        if(map0 != null) {
            k k0 = (k)map0.get(MathUtils.e(v, 0, Math.max(0, this.getItemCount() - 1)));
            return k0 == null ? this.y.g() : k0;
        }
        return this.y.g();
    }

    @Override  // com.google.android.material.carousel.b
    public int e() {
        return this.x0();
    }

    private int e3() {
        if(!this.n0() && this.x.f()) {
            return this.i3() == 1 ? this.J0() : this.G0();
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean f2(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z, boolean z1) {
        if(this.y == null) {
            return false;
        }
        int v = this.r3(this.K0(view0), this.d3(this.K0(view0)));
        if(v == 0) {
            return false;
        }
        k k0 = this.y.j(((float)(this.s + CarouselLayoutManager.U2(v, this.s, this.t, this.u))), ((float)this.t), ((float)this.u));
        this.E3(recyclerView0, this.r3(this.K0(view0), k0));
        return true;
    }

    private float f3(float f, d carouselLayoutManager$d0) {
        return com.google.android.material.animation.b.b(carouselLayoutManager$d0.a.d, carouselLayoutManager$d0.b.d, carouselLayoutManager$d0.a.b, carouselLayoutManager$d0.b.b, f);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    @Nullable
    public PointF g(int v) {
        if(this.y == null) {
            return null;
        }
        int v1 = this.g3(v, this.d3(v));
        return this.r() ? new PointF(((float)v1), 0.0f) : new PointF(0.0f, ((float)v1));
    }

    int g3(int v, @NonNull k k0) {
        return this.q3(v, k0) - this.s;
    }

    int h3(int v, boolean z) {
        int v1 = this.g3(v, this.y.k(((float)this.s), ((float)this.t), ((float)this.u), true));
        int v2 = this.B == null ? v1 : this.g3(v, this.d3(v));
        return !z || Math.abs(v2) >= Math.abs(v1) ? v1 : v2;
    }

    public int i3() {
        return this.C.a;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int j2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.G() ? this.D3(v, recyclerView$Recycler0, recyclerView$State0) : 0;
    }

    private int j3() {
        return this.C.h();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void k1(@NonNull View view0, int v, int v1) {
        if(!(view0 instanceof m)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        Rect rect0 = new Rect();
        this.F(view0, rect0);
        int v2 = v + (rect0.left + rect0.right);
        int v3 = v1 + (rect0.top + rect0.bottom);
        float f = this.y == null || this.C.a != 0 ? ((float)recyclerView$LayoutParams0.width) : this.y.g().f();
        float f1 = this.y == null || this.C.a != 1 ? ((float)recyclerView$LayoutParams0.height) : this.y.g().f();
        view0.measure(LayoutManager.k0(this.R0(), this.S0(), this.G0() + this.H0() + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin + v2, ((int)f), this.G()), LayoutManager.k0(this.x0(), this.y0(), this.J0() + this.E0() + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin + v3, ((int)f1), this.H()));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void k2(int v) {
        this.F = v;
        if(this.y == null) {
            return;
        }
        this.s = this.q3(v, this.d3(v));
        this.A = MathUtils.e(v, 0, Math.max(0, this.getItemCount() - 1));
        this.L3(this.y);
        this.g2();
    }

    private int k3() {
        return this.C.i();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public int l2(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.H() ? this.D3(v, recyclerView$Recycler0, recyclerView$State0) : 0;
    }

    private int l3() {
        return this.C.j();
    }

    private int m3() {
        return this.C.k();
    }

    @Override  // com.google.android.material.carousel.b
    public int n() {
        return this.R0();
    }

    private int n3() {
        return this.C.l();
    }

    private int o3() {
        return this.C.m();
    }

    @Override  // com.google.android.material.carousel.b
    public int p() {
        return this.G;
    }

    private int p3() {
        if(!this.n0() && this.x.f()) {
            return this.i3() == 1 ? this.E0() : this.H0();
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void q0(@NonNull View view0, @NonNull Rect rect0) {
        super.q0(view0, rect0);
        float f = (float)rect0.centerY();
        if(this.r()) {
            f = (float)rect0.centerX();
        }
        float f1 = this.f3(f, CarouselLayoutManager.s3(this.z.g(), f, true));
        float f2 = 0.0f;
        float f3 = this.r() ? (((float)rect0.width()) - f1) / 2.0f : 0.0f;
        if(!this.r()) {
            f2 = (((float)rect0.height()) - f1) / 2.0f;
        }
        rect0.set(((int)(((float)rect0.left) + f3)), ((int)(((float)rect0.top) + f2)), ((int)(((float)rect0.right) - f3)), ((int)(((float)rect0.bottom) - f2)));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void q1(RecyclerView recyclerView0) {
        super.q1(recyclerView0);
        this.x.e(recyclerView0.getContext());
        this.B3();
        recyclerView0.addOnLayoutChangeListener(this.D);
    }

    // 去混淆评级： 低(20)
    private int q3(int v, k k0) {
        return this.t3() ? ((int)(((float)this.a3()) - k0.h().a - ((float)v) * k0.f() - k0.f() / 2.0f)) : ((int)(((float)v) * k0.f() - k0.a().a + k0.f() / 2.0f));
    }

    @Override  // com.google.android.material.carousel.b
    public boolean r() {
        return this.C.a == 0;
    }

    private int r3(int v, @NonNull k k0) {
        int v1 = 0x7FFFFFFF;
        for(Object object0: k0.e()) {
            com.google.android.material.carousel.k.c k$c0 = (com.google.android.material.carousel.k.c)object0;
            float f = ((float)v) * k0.f() + k0.f() / 2.0f;
            int v2 = (this.t3() ? ((int)(((float)this.a3()) - k$c0.a - f)) : ((int)(f - k$c0.a))) - this.s;
            if(Math.abs(v1) > Math.abs(v2)) {
                v1 = v2;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void s1(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        super.s1(recyclerView0, recyclerView$Recycler0);
        recyclerView0.removeOnLayoutChangeListener(this.D);
    }

    private static d s3(List list0, float f, boolean z) {
        float f1 = 3.402823E+38f;
        float f2 = 3.402823E+38f;
        float f3 = 3.402823E+38f;
        float f4 = -3.402823E+38f;
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        int v4 = -1;
        for(int v = 0; v < list0.size(); ++v) {
            com.google.android.material.carousel.k.c k$c0 = (com.google.android.material.carousel.k.c)list0.get(v);
            float f5 = z ? k$c0.b : k$c0.a;
            float f6 = Math.abs(f5 - f);
            if(f5 <= f && f6 <= f1) {
                v1 = v;
                f1 = f6;
            }
            if(f5 > f && f6 <= f2) {
                v3 = v;
                f2 = f6;
            }
            if(f5 <= f3) {
                v2 = v;
                f3 = f5;
            }
            if(f5 > f4) {
                v4 = v;
                f4 = f5;
            }
        }
        if(v1 == -1) {
            v1 = v2;
        }
        if(v3 == -1) {
            v3 = v4;
        }
        return new d(((com.google.android.material.carousel.k.c)list0.get(v1)), ((com.google.android.material.carousel.k.c)list0.get(v3)));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @Nullable
    public View t1(@NonNull View view0, int v, @NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
        if(this.j0() == 0) {
            return null;
        }
        int v1 = this.W2(v);
        if(v1 == 0x80000000) {
            return null;
        }
        if(v1 == -1) {
            if(this.K0(view0) == 0) {
                return null;
            }
            this.N2(recyclerView$Recycler0, this.K0(this.i0(0)) - 1, 0);
            return this.Z2();
        }
        if(this.K0(view0) == this.getItemCount() - 1) {
            return null;
        }
        this.N2(recyclerView$Recycler0, this.K0(this.i0(this.j0() - 1)) + 1, -1);
        return this.Y2();
    }

    boolean t3() {
        return this.r() && this.A0() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void u1(@NonNull AccessibilityEvent accessibilityEvent0) {
        super.u1(accessibilityEvent0);
        if(this.j0() > 0) {
            accessibilityEvent0.setFromIndex(this.K0(this.i0(0)));
            accessibilityEvent0.setToIndex(this.K0(this.i0(this.j0() - 1)));
        }
    }

    private boolean u3(float f, d carouselLayoutManager$d0) {
        float f1 = this.M2(f, this.f3(f, carouselLayoutManager$d0) / 2.0f);
        return this.t3() ? f1 < 0.0f : f1 > ((float)this.a3());
    }

    private boolean v3(float f, d carouselLayoutManager$d0) {
        float f1 = this.L2(f, this.f3(f, carouselLayoutManager$d0) / 2.0f);
        return this.t3() ? f1 > ((float)this.a3()) : f1 < 0.0f;
    }

    // 检测为 Lambda 实现
    private void w3(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    private void x3() {
        if(!this.v) {
            return;
        }
        if(Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for(int v = 0; v < this.j0(); ++v) {
                View view0 = this.i0(v);
                float f = this.b3(view0);
                Log.d("CarouselLayoutManager", "item position " + this.K0(view0) + ", center:" + f + ", child index:" + v);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        class a extends LinearSmoothScroller {
            final CarouselLayoutManager x;

            a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
            @Nullable
            public PointF a(int v) {
                return CarouselLayoutManager.this.g(v);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            public int u(View view0, int v) {
                if(CarouselLayoutManager.this.y != null && CarouselLayoutManager.this.r()) {
                    int v1 = CarouselLayoutManager.this.K0(view0);
                    return CarouselLayoutManager.this.T2(v1);
                }
                return 0;
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            public int v(View view0, int v) {
                if(CarouselLayoutManager.this.y != null && !CarouselLayoutManager.this.r()) {
                    int v1 = CarouselLayoutManager.this.K0(view0);
                    return CarouselLayoutManager.this.T2(v1);
                }
                return 0;
            }
        }

        a carouselLayoutManager$a0 = new a(this, recyclerView0.getContext());
        carouselLayoutManager$a0.q(v);
        this.z2(carouselLayoutManager$a0);
    }

    private com.google.android.material.carousel.CarouselLayoutManager.b y3(Recycler recyclerView$Recycler0, float f, int v) {
        View view0 = recyclerView$Recycler0.p(v);
        this.k1(view0, 0, 0);
        float f1 = this.L2(f, this.z.f() / 2.0f);
        d carouselLayoutManager$d0 = CarouselLayoutManager.s3(this.z.g(), f1, false);
        return new com.google.android.material.carousel.CarouselLayoutManager.b(view0, f1, this.Q2(view0, f1, carouselLayoutManager$d0), carouselLayoutManager$d0);
    }

    private float z3(View view0, float f, float f1, Rect rect0) {
        float f2 = this.L2(f, f1);
        d carouselLayoutManager$d0 = CarouselLayoutManager.s3(this.z.g(), f2, false);
        float f3 = this.Q2(view0, f2, carouselLayoutManager$d0);
        super.q0(view0, rect0);
        this.K3(view0, f2, carouselLayoutManager$d0);
        this.C.p(view0, rect0, f1, f3);
        return f3;
    }
}

