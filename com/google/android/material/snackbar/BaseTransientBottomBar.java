package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.internal.N;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar {
    public static class Behavior extends SwipeDismissBehavior {
        @NonNull
        private final t u;

        public Behavior() {
            this.u = new t(this);
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean O(View view0) {
            return this.u.a(view0);
        }

        private void d0(@NonNull BaseTransientBottomBar baseTransientBottomBar0) {
            this.u.c(baseTransientBottomBar0);
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            this.u.b(coordinatorLayout0, view0, motionEvent0);
            return super.s(coordinatorLayout0, view0, motionEvent0);
        }
    }

    class h implements Handler.Callback {
        h() {
            super();
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(@NonNull Message message0) {
            switch(message0.what) {
                case 0: {
                    ((BaseTransientBottomBar)message0.obj).n0();
                    return true;
                }
                case 1: {
                    ((BaseTransientBottomBar)message0.obj).P(message0.arg1);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    class i implements Runnable {
        final BaseTransientBottomBar a;

        @Override
        public void run() {
            if(BaseTransientBottomBar.this.i != null && BaseTransientBottomBar.this.h != null) {
                int v = N.b(BaseTransientBottomBar.this.h).height() - BaseTransientBottomBar.this.N() + ((int)BaseTransientBottomBar.this.i.getTranslationY());
                if(v >= BaseTransientBottomBar.this.t) {
                    BaseTransientBottomBar.this.u = BaseTransientBottomBar.this.t;
                    return;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = BaseTransientBottomBar.this.i.getLayoutParams();
                if(!(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.S, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar.this.u = BaseTransientBottomBar.this.t;
                ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin += BaseTransientBottomBar.this.t - v;
                BaseTransientBottomBar.this.i.requestLayout();
            }
        }
    }

    class l implements b {
        final BaseTransientBottomBar a;

        @Override  // com.google.android.material.snackbar.e$b
        public void a(int v) {
            Message message0 = BaseTransientBottomBar.N.obtainMessage(1, v, 0, BaseTransientBottomBar.this);
            BaseTransientBottomBar.N.sendMessage(message0);
        }

        @Override  // com.google.android.material.snackbar.e$b
        public void show() {
            Message message0 = BaseTransientBottomBar.N.obtainMessage(0, BaseTransientBottomBar.this);
            BaseTransientBottomBar.N.sendMessage(message0);
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @NonNull
        private final WeakReference a;
        @NonNull
        private final WeakReference b;

        private q(@NonNull BaseTransientBottomBar baseTransientBottomBar0, @NonNull View view0) {
            this.a = new WeakReference(baseTransientBottomBar0);
            this.b = new WeakReference(view0);
        }

        static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar0, @NonNull View view0) {
            q baseTransientBottomBar$q0 = new q(baseTransientBottomBar0, view0);
            if(ViewCompat.T0(view0)) {
                M.b(view0, baseTransientBottomBar$q0);
            }
            view0.addOnAttachStateChangeListener(baseTransientBottomBar$q0);
            return baseTransientBottomBar$q0;
        }

        @Nullable
        View b() {
            return (View)this.b.get();
        }

        void c() {
            if(this.b.get() != null) {
                ((View)this.b.get()).removeOnAttachStateChangeListener(this);
                M.v(((View)this.b.get()), this);
            }
            this.b.clear();
            this.a.clear();
        }

        private boolean d() {
            if(this.a.get() == null) {
                this.c();
                return true;
            }
            return false;
        }

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(!this.d() && ((BaseTransientBottomBar)this.a.get()).n) {
                ((BaseTransientBottomBar)this.a.get()).a0();
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
            if(this.d()) {
                return;
            }
            M.b(view0, this);
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            if(this.d()) {
                return;
            }
            M.v(view0, this);
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface r {
    }

    public static abstract class s {
        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
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

    @RestrictTo({Scope.b})
    public static class t {
        private b a;

        public t(@NonNull SwipeDismissBehavior swipeDismissBehavior0) {
            swipeDismissBehavior0.Z(0.1f);
            swipeDismissBehavior0.W(0.6f);
            swipeDismissBehavior0.a0(0);
        }

        public boolean a(View view0) {
            return view0 instanceof w;
        }

        public void b(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
            switch(motionEvent0.getActionMasked()) {
                case 0: {
                    if(coordinatorLayout0.G(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()))) {
                        e.c().k(this.a);
                    }
                    return;
                }
                case 1: 
                case 3: {
                    e.c().l(this.a);
                }
            }
        }

        public void c(@NonNull BaseTransientBottomBar baseTransientBottomBar0) {
            this.a = baseTransientBottomBar0.z;
        }
    }

    @Deprecated
    public interface u extends com.google.android.material.snackbar.b {
    }

    @IntRange(from = -2L)
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface v {
    }

    @RestrictTo({Scope.b})
    public static class w extends FrameLayout {
        class com.google.android.material.snackbar.BaseTransientBottomBar.w.a implements View.OnTouchListener {
            com.google.android.material.snackbar.BaseTransientBottomBar.w.a() {
                super();
            }

            @Override  // android.view.View$OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return true;
            }
        }

        @Nullable
        private BaseTransientBottomBar a;
        @Nullable
        p b;
        private int c;
        private final float d;
        private final float e;
        private final int f;
        private final int g;
        private ColorStateList h;
        private PorterDuff.Mode i;
        @Nullable
        private Rect j;
        private boolean k;
        private static final View.OnTouchListener l;

        static {
            w.l = new com.google.android.material.snackbar.BaseTransientBottomBar.w.a();
        }

        protected w(@NonNull Context context0) {
            this(context0, null);
        }

        protected w(@NonNull Context context0, AttributeSet attributeSet0) {
            super(I1.a.c(context0, attributeSet0, 0, 0), attributeSet0);
            Context context1 = this.getContext();
            TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, styleable.SnackbarLayout);
            if(typedArray0.hasValue(styleable.SnackbarLayout_elevation)) {
                ViewCompat.X1(this, ((float)typedArray0.getDimensionPixelSize(6, 0)));
            }
            this.c = typedArray0.getInt(styleable.SnackbarLayout_animationMode, 0);
            if(typedArray0.hasValue(styleable.SnackbarLayout_shapeAppearance) || typedArray0.hasValue(styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.b = p.e(context1, attributeSet0, 0, 0).m();
            }
            this.d = typedArray0.getFloat(styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            this.setBackgroundTintList(d.a(context1, typedArray0, styleable.SnackbarLayout_backgroundTint));
            this.setBackgroundTintMode(M.u(typedArray0.getInt(styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.e = typedArray0.getFloat(styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f = typedArray0.getDimensionPixelSize(styleable.SnackbarLayout_android_maxWidth, -1);
            this.g = typedArray0.getDimensionPixelSize(styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArray0.recycle();
            this.setOnTouchListener(w.l);
            this.setFocusable(true);
            if(this.getBackground() == null) {
                ViewCompat.R1(this, this.d());
            }
        }

        void c(ViewGroup viewGroup0) {
            this.k = true;
            viewGroup0.addView(this);
            this.k = false;
        }

        @NonNull
        private Drawable d() {
            int v = com.google.android.material.color.v.v(this, attr.colorSurface, attr.colorOnSurface, this.getBackgroundOverlayColorAlpha());
            p p0 = this.b;
            k k0 = p0 == null ? BaseTransientBottomBar.y(v, this.getResources()) : BaseTransientBottomBar.z(v, p0);
            if(this.h != null) {
                Drawable drawable0 = DrawableCompat.r(k0);
                DrawableCompat.o(drawable0, this.h);
                return drawable0;
            }
            return DrawableCompat.r(k0);
        }

        private void e(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            this.j = new Rect(viewGroup$MarginLayoutParams0.leftMargin, viewGroup$MarginLayoutParams0.topMargin, viewGroup$MarginLayoutParams0.rightMargin, viewGroup$MarginLayoutParams0.bottomMargin);
        }

        float getActionTextColorAlpha() {
            return this.e;
        }

        int getAnimationMode() {
            return this.c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.d;
        }

        int getMaxInlineActionWidth() {
            return this.g;
        }

        int getMaxWidth() {
            return this.f;
        }

        @Override  // android.view.ViewGroup
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar0 = this.a;
            if(baseTransientBottomBar0 != null) {
                baseTransientBottomBar0.V();
            }
            ViewCompat.D1(this);
        }

        @Override  // android.view.ViewGroup
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar0 = this.a;
            if(baseTransientBottomBar0 != null) {
                baseTransientBottomBar0.W();
            }
        }

        @Override  // android.widget.FrameLayout
        protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
            super.onLayout(z, v, v1, v2, v3);
            BaseTransientBottomBar baseTransientBottomBar0 = this.a;
            if(baseTransientBottomBar0 != null) {
                baseTransientBottomBar0.X();
            }
        }

        @Override  // android.widget.FrameLayout
        protected void onMeasure(int v, int v1) {
            super.onMeasure(v, v1);
            if(this.f > 0) {
                int v2 = this.getMeasuredWidth();
                int v3 = this.f;
                if(v2 > v3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), v1);
                }
            }
        }

        void setAnimationMode(int v) {
            this.c = v;
        }

        @Override  // android.view.View
        public void setBackground(@Nullable Drawable drawable0) {
            this.setBackgroundDrawable(drawable0);
        }

        @Override  // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable0) {
            if(drawable0 != null && this.h != null) {
                drawable0 = DrawableCompat.r(drawable0.mutate());
                DrawableCompat.o(drawable0, this.h);
                DrawableCompat.p(drawable0, this.i);
            }
            super.setBackgroundDrawable(drawable0);
        }

        @Override  // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
            this.h = colorStateList0;
            if(this.getBackground() != null) {
                Drawable drawable0 = DrawableCompat.r(this.getBackground().mutate());
                DrawableCompat.o(drawable0, colorStateList0);
                DrawableCompat.p(drawable0, this.i);
                if(drawable0 != this.getBackground()) {
                    super.setBackgroundDrawable(drawable0);
                }
            }
        }

        @Override  // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
            this.i = porterDuff$Mode0;
            if(this.getBackground() != null) {
                Drawable drawable0 = DrawableCompat.r(this.getBackground().mutate());
                DrawableCompat.p(drawable0, porterDuff$Mode0);
                if(drawable0 != this.getBackground()) {
                    super.setBackgroundDrawable(drawable0);
                }
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar0) {
            this.a = baseTransientBottomBar0;
        }

        @Override  // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super.setLayoutParams(viewGroup$LayoutParams0);
            if(!this.k && viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                this.e(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
                BaseTransientBottomBar baseTransientBottomBar0 = this.a;
                if(baseTransientBottomBar0 != null) {
                    baseTransientBottomBar0.t0();
                }
            }
        }

        @Override  // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
            this.setOnTouchListener((view$OnClickListener0 == null ? w.l : null));
            super.setOnClickListener(view$OnClickListener0);
        }
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = -2;
    public static final int D = -1;
    public static final int E = 0;
    static final int F = 0xFA;
    static final int G = 180;
    private static final TimeInterpolator H = null;
    private static final int I = 150;
    private static final int J = 75;
    private static final TimeInterpolator K = null;
    private static final TimeInterpolator L = null;
    private static final float M = 0.8f;
    @NonNull
    static final Handler N = null;
    static final int O = 0;
    static final int P = 1;
    private static final boolean Q;
    private static final int[] R;
    private static final String S;
    private final int a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator e;
    private final TimeInterpolator f;
    @NonNull
    private final ViewGroup g;
    private final Context h;
    @NonNull
    protected final w i;
    @NonNull
    private final com.google.android.material.snackbar.b j;
    private int k;
    private boolean l;
    @Nullable
    private q m;
    private boolean n;
    @RequiresApi(29)
    private final Runnable o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private List w;
    private Behavior x;
    @Nullable
    private final AccessibilityManager y;
    @NonNull
    b z;

    static {
        BaseTransientBottomBar.H = com.google.android.material.animation.b.b;
        BaseTransientBottomBar.K = com.google.android.material.animation.b.a;
        BaseTransientBottomBar.L = com.google.android.material.animation.b.d;
        BaseTransientBottomBar.Q = false;
        BaseTransientBottomBar.R = new int[]{attr.snackbarStyle};
        BaseTransientBottomBar.S = "BaseTransientBottomBar";
        BaseTransientBottomBar.N = new Handler(Looper.getMainLooper(), new h());
    }

    protected BaseTransientBottomBar(@NonNull Context context0, @NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull com.google.android.material.snackbar.b b0) {
        class j implements OnApplyWindowInsetsListener {
            final BaseTransientBottomBar a;

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
                int v = windowInsetsCompat0.o();
                BaseTransientBottomBar.this.p = v;
                int v1 = windowInsetsCompat0.p();
                BaseTransientBottomBar.this.q = v1;
                int v2 = windowInsetsCompat0.q();
                BaseTransientBottomBar.this.r = v2;
                BaseTransientBottomBar.this.t0();
                return windowInsetsCompat0;
            }
        }


        class com.google.android.material.snackbar.BaseTransientBottomBar.k extends AccessibilityDelegateCompat {
            final BaseTransientBottomBar d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.a(0x100000);
                accessibilityNodeInfoCompat0.s1(true);
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public boolean j(View view0, int v, Bundle bundle0) {
                if(v == 0x100000) {
                    BaseTransientBottomBar.this.A();
                    return true;
                }
                return super.j(view0, v, bundle0);
            }
        }

        this.n = false;
        this.o = new i(this);
        this.z = new l(this);
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if(view0 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if(b0 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup0;
        this.j = b0;
        this.h = context0;
        D.a(context0);
        w baseTransientBottomBar$w0 = (w)LayoutInflater.from(context0).inflate(this.K(), viewGroup0, false);
        this.i = baseTransientBottomBar$w0;
        baseTransientBottomBar$w0.setBaseTransientBottomBar(this);
        if(view0 instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout)view0).c(baseTransientBottomBar$w0.getActionTextColorAlpha());
            ((SnackbarContentLayout)view0).setMaxInlineActionWidth(baseTransientBottomBar$w0.getMaxInlineActionWidth());
        }
        baseTransientBottomBar$w0.addView(view0);
        ViewCompat.L1(baseTransientBottomBar$w0, 1);
        ViewCompat.b2(baseTransientBottomBar$w0, 1);
        ViewCompat.Y1(baseTransientBottomBar$w0, true);
        ViewCompat.m2(baseTransientBottomBar$w0, new j(this));
        ViewCompat.J1(baseTransientBottomBar$w0, new com.google.android.material.snackbar.BaseTransientBottomBar.k(this));
        this.y = (AccessibilityManager)context0.getSystemService("accessibility");
        this.c = com.google.android.material.motion.j.f(context0, attr.motionDurationLong2, 0xFA);
        this.a = com.google.android.material.motion.j.f(context0, attr.motionDurationLong2, 150);
        this.b = com.google.android.material.motion.j.f(context0, attr.motionDurationMedium1, 75);
        this.d = com.google.android.material.motion.j.g(context0, attr.motionEasingEmphasizedInterpolator, BaseTransientBottomBar.K);
        this.f = com.google.android.material.motion.j.g(context0, attr.motionEasingEmphasizedInterpolator, BaseTransientBottomBar.L);
        this.e = com.google.android.material.motion.j.g(context0, attr.motionEasingEmphasizedInterpolator, BaseTransientBottomBar.H);
    }

    protected BaseTransientBottomBar(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull com.google.android.material.snackbar.b b0) {
        this(viewGroup0.getContext(), viewGroup0, view0, b0);
    }

    public void A() {
        this.B(3);
    }

    protected void B(int v) {
        e.c().b(this.z, v);
    }

    private ValueAnimator C(float[] arr_f) {
        class com.google.android.material.snackbar.BaseTransientBottomBar.b implements ValueAnimator.AnimatorUpdateListener {
            final BaseTransientBottomBar a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                BaseTransientBottomBar.this.i.setAlpha(f);
            }
        }

        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(arr_f);
        valueAnimator0.setInterpolator(this.d);
        valueAnimator0.addUpdateListener(new com.google.android.material.snackbar.BaseTransientBottomBar.b(this));
        return valueAnimator0;
    }

    @Nullable
    public View D() {
        return this.m == null ? null : this.m.b();
    }

    public int E() {
        return this.i.getAnimationMode();
    }

    public Behavior F() {
        return this.x;
    }

    @NonNull
    public Context G() {
        return this.h;
    }

    public int H() {
        return this.k;
    }

    @NonNull
    protected SwipeDismissBehavior I() {
        return new Behavior();
    }

    private ValueAnimator J(float[] arr_f) {
        class c implements ValueAnimator.AnimatorUpdateListener {
            final BaseTransientBottomBar a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                BaseTransientBottomBar.this.i.setScaleX(f);
                BaseTransientBottomBar.this.i.setScaleY(f);
            }
        }

        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(arr_f);
        valueAnimator0.setInterpolator(this.f);
        valueAnimator0.addUpdateListener(new c(this));
        return valueAnimator0;
    }

    // 去混淆评级： 低(20)
    @LayoutRes
    protected int K() {
        return this.O() ? layout.mtrl_layout_snackbar : layout.design_layout_snackbar;
    }

    private int L() {
        int v = this.i.getHeight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? v + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin : v;
    }

    @NonNull
    public View M() {
        return this.i;
    }

    private int N() {
        int[] arr_v = new int[2];
        this.i.getLocationInWindow(arr_v);
        return arr_v[1] + this.i.getHeight();
    }

    protected boolean O() {
        TypedArray typedArray0 = this.h.obtainStyledAttributes(BaseTransientBottomBar.R);
        int v = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v != -1;
    }

    final void P(int v) {
        if(this.k0() && this.i.getVisibility() == 0) {
            this.w(v);
            return;
        }
        this.Y(v);
    }

    public boolean Q() {
        return this.n;
    }

    public boolean R() {
        return this.l;
    }

    public boolean S() {
        return e.c().e(this.z);
    }

    public boolean T() {
        return e.c().f(this.z);
    }

    private boolean U() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof LayoutParams && ((LayoutParams)viewGroup$LayoutParams0).f() instanceof SwipeDismissBehavior;
    }

    void V() {
        if(Build.VERSION.SDK_INT >= 29) {
            WindowInsets windowInsets0 = this.i.getRootWindowInsets();
            if(windowInsets0 != null) {
                this.t = windowInsets0.getMandatorySystemGestureInsets().bottom;
                this.t0();
            }
        }
    }

    void W() {
        class m implements Runnable {
            final BaseTransientBottomBar a;

            @Override
            public void run() {
                BaseTransientBottomBar.this.Y(3);
            }
        }

        if(this.T()) {
            m baseTransientBottomBar$m0 = () -> {
                e.c().i(BaseTransientBottomBar.this.z);
                List list0 = BaseTransientBottomBar.this.w;
                if(list0 != null) {
                    for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                        ((s)BaseTransientBottomBar.this.w.get(v1)).a(BaseTransientBottomBar.this, 3);
                    }
                }
                ViewParent viewParent0 = BaseTransientBottomBar.this.i.getParent();
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(BaseTransientBottomBar.this.i);
                }
            };
            BaseTransientBottomBar.N.post(baseTransientBottomBar$m0);
        }
    }

    void X() {
        if(this.v) {
            this.o0();
            this.v = false;
        }
    }

    // 检测为 Lambda 实现
    void Y(int v) [...]

    void Z() {
        e.c().j(this.z);
        List list0 = this.w;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((s)this.w.get(v)).b(this);
            }
        }
    }

    private void a0() {
        this.s = this.x();
        this.t0();
    }

    @NonNull
    public BaseTransientBottomBar b0(@Nullable s baseTransientBottomBar$s0) {
        if(baseTransientBottomBar$s0 == null) {
            return this;
        }
        List list0 = this.w;
        if(list0 == null) {
            return this;
        }
        list0.remove(baseTransientBottomBar$s0);
        return this;
    }

    @NonNull
    public BaseTransientBottomBar c0(@IdRes int v) {
        View view0 = this.g.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("Unable to find anchor view with id: " + v);
        }
        return this.d0(view0);
    }

    @NonNull
    public BaseTransientBottomBar d0(@Nullable View view0) {
        q baseTransientBottomBar$q0 = this.m;
        if(baseTransientBottomBar$q0 != null) {
            baseTransientBottomBar$q0.c();
        }
        this.m = view0 == null ? null : q.a(this, view0);
        return this;
    }

    public void e0(boolean z) {
        this.n = z;
    }

    @NonNull
    public BaseTransientBottomBar f0(int v) {
        this.i.setAnimationMode(v);
        return this;
    }

    @NonNull
    public BaseTransientBottomBar g0(Behavior baseTransientBottomBar$Behavior0) {
        this.x = baseTransientBottomBar$Behavior0;
        return this;
    }

    @NonNull
    public BaseTransientBottomBar h0(int v) {
        this.k = v;
        return this;
    }

    @NonNull
    public BaseTransientBottomBar i0(boolean z) {
        this.l = z;
        return this;
    }

    private void j0(LayoutParams coordinatorLayout$LayoutParams0) {
        class n implements com.google.android.material.behavior.SwipeDismissBehavior.c {
            final BaseTransientBottomBar a;

            @Override  // com.google.android.material.behavior.SwipeDismissBehavior$c
            public void a(@NonNull View view0) {
                if(view0.getParent() != null) {
                    view0.setVisibility(8);
                }
                BaseTransientBottomBar.this.B(0);
            }

            @Override  // com.google.android.material.behavior.SwipeDismissBehavior$c
            public void b(int v) {
                switch(v) {
                    case 0: {
                        e.c().l(BaseTransientBottomBar.this.z);
                        return;
                    }
                    case 1: 
                    case 2: {
                        e.c().k(BaseTransientBottomBar.this.z);
                    }
                }
            }
        }

        SwipeDismissBehavior swipeDismissBehavior0 = this.x;
        if(swipeDismissBehavior0 == null) {
            swipeDismissBehavior0 = this.I();
        }
        if(swipeDismissBehavior0 instanceof Behavior) {
            ((Behavior)swipeDismissBehavior0).d0(this);
        }
        swipeDismissBehavior0.X(new n(this));
        coordinatorLayout$LayoutParams0.q(swipeDismissBehavior0);
        if(this.D() == null) {
            coordinatorLayout$LayoutParams0.g = 80;
        }
    }

    boolean k0() {
        AccessibilityManager accessibilityManager0 = this.y;
        if(accessibilityManager0 == null) {
            return true;
        }
        List list0 = accessibilityManager0.getEnabledAccessibilityServiceList(1);
        return list0 != null && list0.isEmpty();
    }

    // 去混淆评级： 低(20)
    private boolean l0() {
        return this.t > 0 && !this.l && this.U();
    }

    public void m0() {
        e.c().n(this.H(), this.z);
    }

    final void n0() {
        if(this.i.getParent() == null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                this.j0(((LayoutParams)viewGroup$LayoutParams0));
            }
            this.i.c(this.g);
            this.a0();
            this.i.setVisibility(4);
        }
        if(ViewCompat.a1(this.i)) {
            this.o0();
            return;
        }
        this.v = true;
    }

    private void o0() {
        if(this.k0()) {
            this.v();
            return;
        }
        if(this.i.getParent() != null) {
            this.i.setVisibility(0);
        }
        this.Z();
    }

    private void p0() {
        class com.google.android.material.snackbar.BaseTransientBottomBar.p extends AnimatorListenerAdapter {
            final BaseTransientBottomBar a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BaseTransientBottomBar.this.Z();
            }
        }

        ValueAnimator valueAnimator0 = this.C(new float[]{0.0f, 1.0f});
        ValueAnimator valueAnimator1 = this.J(new float[]{0.8f, 1.0f});
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        animatorSet0.setDuration(((long)this.a));
        animatorSet0.addListener(new com.google.android.material.snackbar.BaseTransientBottomBar.p(this));
        animatorSet0.start();
    }

    private void q0(int v) {
        class com.google.android.material.snackbar.BaseTransientBottomBar.a extends AnimatorListenerAdapter {
            final int a;
            final BaseTransientBottomBar b;

            com.google.android.material.snackbar.BaseTransientBottomBar.a(int v) {
                this.a = v;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BaseTransientBottomBar.this.Y(this.a);
            }
        }

        ValueAnimator valueAnimator0 = this.C(new float[]{1.0f, 0.0f});
        valueAnimator0.setDuration(((long)this.b));
        valueAnimator0.addListener(new com.google.android.material.snackbar.BaseTransientBottomBar.a(this, v));
        valueAnimator0.start();
    }

    private void r0() {
        class com.google.android.material.snackbar.BaseTransientBottomBar.d extends AnimatorListenerAdapter {
            final BaseTransientBottomBar a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BaseTransientBottomBar.this.Z();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                BaseTransientBottomBar.this.j.a(BaseTransientBottomBar.this.c - BaseTransientBottomBar.this.a, BaseTransientBottomBar.this.a);
            }
        }


        class com.google.android.material.snackbar.BaseTransientBottomBar.e implements ValueAnimator.AnimatorUpdateListener {
            private int a;
            final int b;
            final BaseTransientBottomBar c;

            com.google.android.material.snackbar.BaseTransientBottomBar.e(int v) {
                this.b = v;
                super();
                this.a = v;
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                if(BaseTransientBottomBar.Q) {
                    ViewCompat.l1(BaseTransientBottomBar.this.i, v - this.a);
                }
                else {
                    BaseTransientBottomBar.this.i.setTranslationY(((float)v));
                }
                this.a = v;
            }
        }

        int v = this.L();
        if(BaseTransientBottomBar.Q) {
            ViewCompat.l1(this.i, v);
        }
        else {
            this.i.setTranslationY(((float)v));
        }
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{v, 0});
        valueAnimator0.setInterpolator(this.e);
        valueAnimator0.setDuration(((long)this.c));
        valueAnimator0.addListener(new com.google.android.material.snackbar.BaseTransientBottomBar.d(this));
        valueAnimator0.addUpdateListener(new com.google.android.material.snackbar.BaseTransientBottomBar.e(this, v));
        valueAnimator0.start();
    }

    private void s0(int v) {
        class f extends AnimatorListenerAdapter {
            final int a;
            final BaseTransientBottomBar b;

            f(int v) {
                this.a = v;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BaseTransientBottomBar.this.Y(this.a);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                int v = BaseTransientBottomBar.this.b;
                BaseTransientBottomBar.this.j.b(0, v);
            }
        }


        class g implements ValueAnimator.AnimatorUpdateListener {
            private int a;
            final BaseTransientBottomBar b;

            g() {
                this.a = 0;
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                if(BaseTransientBottomBar.Q) {
                    ViewCompat.l1(BaseTransientBottomBar.this.i, v - this.a);
                }
                else {
                    BaseTransientBottomBar.this.i.setTranslationY(((float)v));
                }
                this.a = v;
            }
        }

        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setIntValues(new int[]{0, this.L()});
        valueAnimator0.setInterpolator(this.e);
        valueAnimator0.setDuration(((long)this.c));
        valueAnimator0.addListener(new f(this, v));
        valueAnimator0.addUpdateListener(new g(this));
        valueAnimator0.start();
    }

    private void t0() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.i.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if(this.i.j == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because original view margins are not set");
            return;
        }
        if(this.i.getParent() == null) {
            return;
        }
        int v = this.D() == null ? this.p : this.s;
        int v1 = this.i.j.bottom + v;
        int v2 = this.i.j.left + this.q;
        int v3 = this.i.j.right + this.r;
        int v4 = this.i.j.top;
        boolean z = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin != v1 || ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin != v2 || ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin != v3 || ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin != v4;
        if(z) {
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin = v1;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin = v2;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin = v3;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = v4;
            this.i.requestLayout();
        }
        if((z || this.u != this.t) && Build.VERSION.SDK_INT >= 29 && this.l0()) {
            this.i.removeCallbacks(this.o);
            this.i.post(this.o);
        }
    }

    @NonNull
    public BaseTransientBottomBar u(@Nullable s baseTransientBottomBar$s0) {
        if(baseTransientBottomBar$s0 == null) {
            return this;
        }
        if(this.w == null) {
            this.w = new ArrayList();
        }
        this.w.add(baseTransientBottomBar$s0);
        return this;
    }

    void v() {
        class o implements Runnable {
            final BaseTransientBottomBar a;

            @Override
            public void run() {
                w baseTransientBottomBar$w0 = BaseTransientBottomBar.this.i;
                if(baseTransientBottomBar$w0 == null) {
                    return;
                }
                if(baseTransientBottomBar$w0.getParent() != null) {
                    BaseTransientBottomBar.this.i.setVisibility(0);
                }
                if(BaseTransientBottomBar.this.i.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.p0();
                    return;
                }
                BaseTransientBottomBar.this.r0();
            }
        }

        o baseTransientBottomBar$o0 = new o(this);
        this.i.post(baseTransientBottomBar$o0);
    }

    private void w(int v) {
        if(this.i.getAnimationMode() == 1) {
            this.q0(v);
            return;
        }
        this.s0(v);
    }

    private int x() {
        if(this.D() == null) {
            return 0;
        }
        int[] arr_v = new int[2];
        this.D().getLocationOnScreen(arr_v);
        int v = arr_v[1];
        int[] arr_v1 = new int[2];
        this.g.getLocationOnScreen(arr_v1);
        return arr_v1[1] + this.g.getHeight() - v;
    }

    @NonNull
    private static GradientDrawable y(@ColorInt int v, @NonNull Resources resources0) {
        float f = resources0.getDimension(dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setCornerRadius(f);
        gradientDrawable0.setColor(v);
        return gradientDrawable0;
    }

    @NonNull
    private static k z(@ColorInt int v, @NonNull p p0) {
        k k0 = new k(p0);
        k0.p0(ColorStateList.valueOf(v));
        return k0;
    }
}

