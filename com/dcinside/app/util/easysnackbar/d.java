package com.dcinside.app.util.easysnackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ThemeUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.dcinside.app.R.styleable;
import com.google.android.material.animation.b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class d {
    class c implements a {
        final d a;

        @Override  // com.dcinside.app.util.easysnackbar.h$a
        public void a(int v) {
            Message message0 = d.o.obtainMessage(1, v, 0, d.this);
            d.o.sendMessage(message0);
        }

        @Override  // com.dcinside.app.util.easysnackbar.h$a
        public void show() {
            Message message0 = d.o.obtainMessage(0, d.this);
            d.o.sendMessage(message0);
        }
    }

    public static abstract class l {
        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface com.dcinside.app.util.easysnackbar.d.l.a {
        }

        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        public void a(Object object0, int v) {
        }

        public void b(Object object0) {
        }
    }

    final class m extends SwipeDismissBehavior {
        final d u;

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean O(View view0) {
            return view0 instanceof r;
        }

        public boolean c0(CoordinatorLayout coordinatorLayout0, r d$r0, MotionEvent motionEvent0) {
            switch(motionEvent0.getActionMasked()) {
                case 0: {
                    if(coordinatorLayout0.G(d$r0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()))) {
                        h.d().m(d.this.i);
                    }
                    return super.s(coordinatorLayout0, d$r0, motionEvent0);
                }
                case 1: 
                case 3: {
                    h.d().n(d.this.i);
                    return super.s(coordinatorLayout0, d$r0, motionEvent0);
                }
                default: {
                    return super.s(coordinatorLayout0, d$r0, motionEvent0);
                }
            }
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean s(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            return this.c0(coordinatorLayout0, ((r)view0), motionEvent0);
        }
    }

    public interface n {
        void a(int arg1, int arg2);

        void b(int arg1, int arg2);
    }

    @IntRange(from = 1L)
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface o {
    }

    @RestrictTo({Scope.b})
    interface p {
        void onViewAttachedToWindow(View arg1);

        void onViewDetachedFromWindow(View arg1);
    }

    @RestrictTo({Scope.b})
    interface q {
        void a(View arg1, int arg2, int arg3, int arg4, int arg5);
    }

    @RestrictTo({Scope.b})
    static class r extends FrameLayout {
        private View.OnLayoutChangeListener a;
        private View.OnAttachStateChangeListener b;

        r(Context context0) {
            this(context0, null);
        }

        r(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SnackbarLayout);
            if(typedArray0.hasValue(6)) {
                ViewCompat.X1(this, ((float)typedArray0.getDimensionPixelSize(6, 0)));
            }
            typedArray0.recycle();
            this.setClickable(true);
        }

        @Override  // android.view.ViewGroup
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.b;
            if(view$OnAttachStateChangeListener0 != null) {
                view$OnAttachStateChangeListener0.onViewAttachedToWindow(this);
            }
            ViewCompat.D1(this);
        }

        @Override  // android.view.ViewGroup
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.b;
            if(view$OnAttachStateChangeListener0 != null) {
                view$OnAttachStateChangeListener0.onViewDetachedFromWindow(this);
            }
        }

        @Override  // android.widget.FrameLayout
        protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
            super.onLayout(z, v, v1, v2, v3);
            View.OnLayoutChangeListener view$OnLayoutChangeListener0 = this.a;
            if(view$OnLayoutChangeListener0 != null) {
                view$OnLayoutChangeListener0.onLayoutChange(this, v, v1, v2, v3, v, v1, v2, v3);
            }
        }

        void setOnAttachStateChangeListener(View.OnAttachStateChangeListener view$OnAttachStateChangeListener0) {
            this.b = view$OnAttachStateChangeListener0;
        }

        void setOnLayoutChangeListener(View.OnLayoutChangeListener view$OnLayoutChangeListener0) {
            this.a = view$OnLayoutChangeListener0;
        }
    }

    private final boolean a;
    private final ViewGroup b;
    private final Context c;
    final r d;
    private final n e;
    private int f;
    private List g;
    private final AccessibilityManager h;
    final a i;
    public static final int j = -2;
    public static final int k = -1;
    public static final int l = 0;
    static final int m = 0xFA;
    static final int n = 180;
    static final Handler o = null;
    static final int p = 0;
    static final int q = 1;
    private static final boolean r = false;

    static {
        d.o = new Handler(Looper.getMainLooper(), (Message message0) -> switch(message0.what) {
            case 0: {
                ((d)message0.obj).A();
                return true;
            }
            case 1: {
                ((d)message0.obj).o(message0.arg1);
                return true;
            }
            default: {
                return false;
            }
        });
    }

    protected d(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull n d$n0, boolean z) {
        this.i = new c(this);
        this.b = viewGroup0;
        this.e = d$n0;
        Context context0 = viewGroup0.getContext();
        this.c = context0;
        this.a = z;
        ThemeUtils.a(view0, context0);
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        this.d = z ? ((r)layoutInflater0.inflate(0x7F0E00AD, viewGroup0, false)) : ((r)layoutInflater0.inflate(0x7F0E00A8, viewGroup0, false));  // layout:design_layout_top_snackbar
        this.d.addView(view0);
        ViewCompat.L1(this.d, 1);
        ViewCompat.b2(this.d, 1);
        ViewCompat.Y1(this.d, true);
        com.dcinside.app.util.easysnackbar.a a0 = (View view0, WindowInsetsCompat windowInsetsCompat0) -> {
            view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), windowInsetsCompat0.o());
            return windowInsetsCompat0;
        };
        ViewCompat.m2(this.d, a0);
        this.h = (AccessibilityManager)context0.getSystemService("accessibility");
    }

    final void A() {
        class com.dcinside.app.util.easysnackbar.d.d implements com.google.android.material.behavior.SwipeDismissBehavior.c {
            final d a;

            @Override  // com.google.android.material.behavior.SwipeDismissBehavior$c
            public void a(View view0) {
                view0.setVisibility(8);
                d.this.k(0);
            }

            @Override  // com.google.android.material.behavior.SwipeDismissBehavior$c
            public void b(int v) {
                switch(v) {
                    case 0: {
                        h.d().n(d.this.i);
                        return;
                    }
                    case 1: 
                    case 2: {
                        h.d().m(d.this.i);
                    }
                }
            }
        }


        class e implements View.OnAttachStateChangeListener {
            final d a;

            // 检测为 Lambda 实现
            private void b() [...]

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                if(d.this.q()) {
                    com.dcinside.app.util.easysnackbar.e e0 = () -> d.this.u(3);
                    d.o.post(e0);
                }
            }
        }

        if(this.d.getParent() == null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.d.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                m d$m0 = new m(this);
                d$m0.Z(0.1f);
                d$m0.W(0.6f);
                d$m0.a0(0);
                d$m0.X(new com.dcinside.app.util.easysnackbar.d.d(this));
                ((LayoutParams)viewGroup$LayoutParams0).q(d$m0);
                ((LayoutParams)viewGroup$LayoutParams0).g = 80;
            }
            this.b.addView(this.d);
        }
        e d$e0 = new e(this);
        this.d.setOnAttachStateChangeListener(d$e0);
        if(ViewCompat.a1(this.d)) {
            if(this.y()) {
                if(this.a) {
                    this.g();
                    return;
                }
                this.f();
                return;
            }
            this.v();
            return;
        }
        com.dcinside.app.util.easysnackbar.c c0 = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> {
            this.d.setOnLayoutChangeListener(null);
            if(this.y()) {
                if(this.a) {
                    this.g();
                    return;
                }
                this.f();
                return;
            }
            this.v();
        };
        this.d.setOnLayoutChangeListener(c0);
    }

    @NonNull
    public d e(@NonNull l d$l0) {
        if(d$l0 == null) {
            return this;
        }
        if(this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(d$l0);
        return this;
    }

    void f() {
        class j extends AnimatorListenerAdapter {
            final d a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                d.this.v();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                d.this.e.a(70, 180);
            }
        }


        class k implements ValueAnimator.AnimatorUpdateListener {
            private int a;
            final int b;
            final d c;

            k(int v) {
                this.b = v;
                super();
                this.a = v;
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                d.this.d.setTranslationY(((float)v));
                this.a = v;
            }
        }

        int v = this.d.getHeight();
        this.d.setTranslationY(((float)v));
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{v, 0});
        valueAnimator0.setInterpolator(b.b);
        valueAnimator0.setDuration(0xFAL);
        valueAnimator0.addListener(new j(this));
        valueAnimator0.addUpdateListener(new k(this, v));
        valueAnimator0.start();
    }

    void g() {
        class f extends AnimatorListenerAdapter {
            final d a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                d.this.v();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                d.this.e.a(70, 180);
            }
        }


        class g implements ValueAnimator.AnimatorUpdateListener {
            private int a;
            final int b;
            final d c;

            g(int v) {
                this.b = v;
                super();
                this.a = v;
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                d.this.d.setTranslationY(((float)v));
                this.a = v;
            }
        }

        int v = this.d.getHeight();
        this.d.setTranslationY(((float)(-v)));
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{-v, 0});
        valueAnimator0.setInterpolator(b.b);
        valueAnimator0.setDuration(0xFAL);
        valueAnimator0.addListener(new f(this));
        valueAnimator0.addUpdateListener(new g(this, -v));
        valueAnimator0.start();
    }

    private void h(int v) {
        class com.dcinside.app.util.easysnackbar.d.a extends AnimatorListenerAdapter {
            final int a;
            final d b;

            com.dcinside.app.util.easysnackbar.d.a(int v) {
                this.a = v;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                d.this.u(this.a);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                d.this.e.b(0, 180);
            }
        }


        class com.dcinside.app.util.easysnackbar.d.b implements ValueAnimator.AnimatorUpdateListener {
            private int a;
            final d b;

            com.dcinside.app.util.easysnackbar.d.b() {
                this.a = 0;
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                d.this.d.setTranslationY(((float)v));
                this.a = v;
            }
        }

        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{0, this.d.getHeight()});
        valueAnimator0.setInterpolator(b.b);
        valueAnimator0.setDuration(0xFAL);
        valueAnimator0.addListener(new com.dcinside.app.util.easysnackbar.d.a(this, v));
        valueAnimator0.addUpdateListener(new com.dcinside.app.util.easysnackbar.d.b(this));
        valueAnimator0.start();
    }

    private void i(int v) {
        class com.dcinside.app.util.easysnackbar.d.h extends AnimatorListenerAdapter {
            final int a;
            final d b;

            com.dcinside.app.util.easysnackbar.d.h(int v) {
                this.a = v;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                d.this.u(this.a);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                d.this.e.b(0, 180);
            }
        }


        class i implements ValueAnimator.AnimatorUpdateListener {
            private int a;
            final d b;

            i() {
                this.a = 0;
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                d.this.d.setTranslationY(((float)v));
                this.a = v;
            }
        }

        this.d.setTranslationY(0.0f);
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{0, -this.d.getHeight()});
        valueAnimator0.setInterpolator(b.b);
        valueAnimator0.setDuration(0xFAL);
        valueAnimator0.addListener(new com.dcinside.app.util.easysnackbar.d.h(this, v));
        valueAnimator0.addUpdateListener(new i(this));
        valueAnimator0.start();
    }

    public void j() {
        this.k(3);
    }

    void k(int v) {
        h.d().c(this.i, v);
    }

    @NonNull
    public Context l() {
        return this.c;
    }

    public int m() {
        return this.f;
    }

    @NonNull
    public View n() {
        return this.d;
    }

    final void o(int v) {
        if(this.y() && this.d.getVisibility() == 0) {
            if(this.a) {
                this.i(v);
                return;
            }
            this.h(v);
            return;
        }
        this.u(v);
    }

    public boolean p() {
        return h.d().f(this.i);
    }

    public boolean q() {
        return h.d().g(this.i);
    }

    // 检测为 Lambda 实现
    private static WindowInsetsCompat r(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    // 检测为 Lambda 实现
    private void s(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    // 检测为 Lambda 实现
    private static boolean t(Message message0) [...]

    void u(int v) {
        h.d().k(this.i);
        List list0 = this.g;
        if(list0 != null) {
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                ((l)this.g.get(v1)).a(this, v);
            }
        }
        ViewParent viewParent0 = this.d.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this.d);
        }
    }

    void v() {
        h.d().l(this.i);
        List list0 = this.g;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((l)this.g.get(v)).b(this);
            }
        }
    }

    @NonNull
    public d w(@NonNull l d$l0) {
        if(d$l0 == null) {
            return this;
        }
        List list0 = this.g;
        if(list0 == null) {
            return this;
        }
        list0.remove(d$l0);
        return this;
    }

    @NonNull
    public d x(int v) {
        this.f = v;
        return this;
    }

    boolean y() {
        return !this.h.isEnabled();
    }

    public void z() {
        h.d().p(this.f, this.i);
    }
}

