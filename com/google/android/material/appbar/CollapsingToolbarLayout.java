package com.google.android.material.appbar;

import F1.a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.internal.b;
import com.google.android.material.internal.z;
import com.google.android.material.motion.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CollapsingToolbarLayout extends FrameLayout {
    public static class LayoutParams extends FrameLayout.LayoutParams {
        int a;
        float b;
        private static final float c = 0.5f;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(int v, int v1, int v2) {
            super(v, v1, v2);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
            this.b = 0.5f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CollapsingToolbarLayout_Layout);
            this.a = typedArray0.getInt(styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.d(typedArray0.getFloat(styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArray0.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
            this.b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 0;
            this.b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams frameLayout$LayoutParams0) {
            super(frameLayout$LayoutParams0);
            this.a = 0;
            this.b = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams collapsingToolbarLayout$LayoutParams0) {
            super(collapsingToolbarLayout$LayoutParams0);
            this.a = collapsingToolbarLayout$LayoutParams0.a;
            this.b = collapsingToolbarLayout$LayoutParams0.b;
        }

        public int a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }

        public void c(int v) {
            this.a = v;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    class c implements f {
        final CollapsingToolbarLayout a;

        @Override  // com.google.android.material.appbar.AppBarLayout$f
        public void a(AppBarLayout appBarLayout0, int v) {
            CollapsingToolbarLayout.this.y = v;
            WindowInsetsCompat windowInsetsCompat0 = CollapsingToolbarLayout.this.A;
            int v1 = windowInsetsCompat0 == null ? 0 : windowInsetsCompat0.r();
            int v2 = CollapsingToolbarLayout.this.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = CollapsingToolbarLayout.this.getChildAt(v3);
                LayoutParams collapsingToolbarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                i i0 = CollapsingToolbarLayout.k(view0);
                switch(collapsingToolbarLayout$LayoutParams0.a) {
                    case 1: {
                        i0.k(MathUtils.e(-v, 0, CollapsingToolbarLayout.this.i(view0)));
                        break;
                    }
                    case 2: {
                        i0.k(Math.round(((float)(-v)) * collapsingToolbarLayout$LayoutParams0.b));
                    }
                }
            }
            CollapsingToolbarLayout.this.A();
            CollapsingToolbarLayout collapsingToolbarLayout0 = CollapsingToolbarLayout.this;
            if(collapsingToolbarLayout0.p != null && v1 > 0) {
                ViewCompat.v1(collapsingToolbarLayout0);
            }
            int v4 = CollapsingToolbarLayout.this.getHeight();
            int v5 = v4 - ViewCompat.j0(CollapsingToolbarLayout.this) - v1;
            float f = Math.min(1.0f, ((float)(v4 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / ((float)v5));
            CollapsingToolbarLayout.this.k.C0(f);
            CollapsingToolbarLayout.this.k.p0(CollapsingToolbarLayout.this.y + v5);
            CollapsingToolbarLayout.this.k.A0(((float)Math.abs(v)) / ((float)v5));
        }
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public interface d extends z {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Nullable
    WindowInsetsCompat A;
    private int B;
    private boolean C;
    private int D;
    private boolean E;
    private static final int F = 0;
    private static final int G = 600;
    public static final int H = 0;
    public static final int I = 1;
    private boolean a;
    private int b;
    @Nullable
    private ViewGroup c;
    @Nullable
    private View d;
    private View e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final Rect j;
    @NonNull
    final b k;
    @NonNull
    final a l;
    private boolean m;
    private boolean n;
    @Nullable
    private Drawable o;
    @Nullable
    Drawable p;
    private int q;
    private boolean r;
    private ValueAnimator s;
    private long t;
    private final TimeInterpolator u;
    private final TimeInterpolator v;
    private int w;
    private f x;
    int y;
    private int z;

    static {
        CollapsingToolbarLayout.F = style.Widget_Design_CollapsingToolbar;
    }

    public CollapsingToolbarLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CollapsingToolbarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class com.google.android.material.appbar.CollapsingToolbarLayout.a implements OnApplyWindowInsetsListener {
            final CollapsingToolbarLayout a;

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
                return CollapsingToolbarLayout.this.s(windowInsetsCompat0);
            }
        }

        super(I1.a.c(context0, attributeSet0, v, CollapsingToolbarLayout.F), attributeSet0, v);
        this.a = true;
        this.j = new Rect();
        this.w = -1;
        this.B = 0;
        this.D = 0;
        Context context1 = this.getContext();
        b b0 = new b(this);
        this.k = b0;
        b0.N0(com.google.android.material.animation.b.e);
        b0.J0(false);
        this.l = new a(context1);
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.CollapsingToolbarLayout, v, CollapsingToolbarLayout.F, new int[0]);
        b0.w0(typedArray0.getInt(styleable.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
        b0.l0(typedArray0.getInt(styleable.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
        int v1 = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.i = v1;
        this.h = v1;
        this.g = v1;
        this.f = v1;
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f = typedArray0.getDimensionPixelSize(8, 0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.h = typedArray0.getDimensionPixelSize(7, 0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.g = typedArray0.getDimensionPixelSize(9, 0);
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.i = typedArray0.getDimensionPixelSize(6, 0);
        }
        this.m = typedArray0.getBoolean(styleable.CollapsingToolbarLayout_titleEnabled, true);
        this.setTitle(typedArray0.getText(styleable.CollapsingToolbarLayout_title));
        b0.t0(style.TextAppearance_Design_CollapsingToolbar_Expanded);
        b0.i0(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            b0.t0(typedArray0.getResourceId(10, 0));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            b0.i0(typedArray0.getResourceId(1, 0));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            this.setTitleEllipsize(this.b(typedArray0.getInt(22, -1)));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_expandedTitleTextColor)) {
            b0.v0(com.google.android.material.resources.d.a(context1, typedArray0, 11));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            b0.k0(com.google.android.material.resources.d.a(context1, typedArray0, 2));
        }
        this.w = typedArray0.getDimensionPixelSize(styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_maxLines)) {
            b0.H0(typedArray0.getInt(14, 1));
        }
        if(typedArray0.hasValue(styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            b0.I0(AnimationUtils.loadInterpolator(context1, typedArray0.getResourceId(21, 0)));
        }
        this.t = (long)typedArray0.getInt(styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.u = j.g(context1, attr.motionEasingStandardInterpolator, com.google.android.material.animation.b.c);
        this.v = j.g(context1, attr.motionEasingStandardInterpolator, com.google.android.material.animation.b.d);
        this.setContentScrim(typedArray0.getDrawable(styleable.CollapsingToolbarLayout_contentScrim));
        this.setStatusBarScrim(typedArray0.getDrawable(styleable.CollapsingToolbarLayout_statusBarScrim));
        this.setTitleCollapseMode(typedArray0.getInt(styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.b = typedArray0.getResourceId(styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.C = typedArray0.getBoolean(styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.E = typedArray0.getBoolean(styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArray0.recycle();
        this.setWillNotDraw(false);
        ViewCompat.m2(this, (/* 缺少LAMBDA参数 */, WindowInsetsCompat windowInsetsCompat0) -> {
            WindowInsetsCompat windowInsetsCompat1 = ViewCompat.Y(CollapsingToolbarLayout.this) ? windowInsetsCompat0 : null;
            if(!ObjectsCompat.a(CollapsingToolbarLayout.this.A, windowInsetsCompat1)) {
                CollapsingToolbarLayout.this.A = windowInsetsCompat1;
                CollapsingToolbarLayout.this.requestLayout();
            }
            return windowInsetsCompat0.c();
        });
    }

    final void A() {
        if(this.o != null || this.p != null) {
            this.setScrimsShown(this.getHeight() + this.y < this.getScrimVisibleHeightTrigger());
        }
    }

    private void B(int v, int v1, int v2, int v3, boolean z) {
        if(this.m) {
            boolean z1 = false;
            View view0 = this.e;
            if(view0 != null) {
                boolean z2 = ViewCompat.T0(view0) && this.e.getVisibility() == 0;
                this.n = z2;
                if(z2 || z) {
                    if(ViewCompat.e0(this) == 1) {
                        z1 = true;
                    }
                    this.v(z1);
                    this.k.q0((z1 ? this.h : this.f), this.j.top + this.g, v2 - v - (z1 ? this.f : this.h), v3 - v1 - this.i);
                    this.k.d0(z);
                }
            }
        }
    }

    private void C() {
        if(this.c != null && this.m && TextUtils.isEmpty(this.k.P())) {
            this.setTitle(CollapsingToolbarLayout.j(this.c));
        }
    }

    private void a(int v) {
        class com.google.android.material.appbar.CollapsingToolbarLayout.b implements ValueAnimator.AnimatorUpdateListener {
            final CollapsingToolbarLayout a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                CollapsingToolbarLayout.this.setScrimAlpha(v);
            }
        }

        this.d();
        ValueAnimator valueAnimator0 = this.s;
        if(valueAnimator0 == null) {
            ValueAnimator valueAnimator1 = new ValueAnimator();
            this.s = valueAnimator1;
            valueAnimator1.setInterpolator((v <= this.q ? this.v : this.u));
            this.s.addUpdateListener(new com.google.android.material.appbar.CollapsingToolbarLayout.b(this));
        }
        else if(valueAnimator0.isRunning()) {
            this.s.cancel();
        }
        this.s.setDuration(this.t);
        this.s.setIntValues(new int[]{this.q, v});
        this.s.start();
    }

    private TextUtils.TruncateAt b(int v) {
        switch(v) {
            case 0: {
                return TextUtils.TruncateAt.START;
            }
            case 1: {
                return TextUtils.TruncateAt.MIDDLE;
            }
            case 3: {
                return TextUtils.TruncateAt.MARQUEE;
            }
            default: {
                return TextUtils.TruncateAt.END;
            }
        }
    }

    private void c(AppBarLayout appBarLayout0) {
        if(this.o()) {
            appBarLayout0.setLiftOnScroll(false);
        }
    }

    @Override  // android.widget.FrameLayout
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    private void d() {
        if(!this.a) {
            return;
        }
        ViewGroup viewGroup0 = null;
        this.c = null;
        this.d = null;
        int v = this.b;
        if(v != -1) {
            ViewGroup viewGroup1 = (ViewGroup)this.findViewById(v);
            this.c = viewGroup1;
            if(viewGroup1 != null) {
                this.d = this.e(viewGroup1);
            }
        }
        if(this.c == null) {
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = this.getChildAt(v2);
                if(CollapsingToolbarLayout.q(view0)) {
                    viewGroup0 = (ViewGroup)view0;
                    break;
                }
            }
            this.c = viewGroup0;
        }
        this.z();
        this.a = false;
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        this.d();
        if(this.c == null) {
            Drawable drawable0 = this.o;
            if(drawable0 != null && this.q > 0) {
                drawable0.mutate().setAlpha(this.q);
                this.o.draw(canvas0);
            }
        }
        if(this.m && this.n) {
            if(this.c == null || this.o == null || this.q <= 0 || !this.o() || this.k.G() >= this.k.H()) {
                this.k.l(canvas0);
            }
            else {
                int v = canvas0.save();
                canvas0.clipRect(this.o.getBounds(), Region.Op.DIFFERENCE);
                this.k.l(canvas0);
                canvas0.restoreToCount(v);
            }
        }
        if(this.p != null && this.q > 0) {
            int v1 = this.A == null ? 0 : this.A.r();
            if(v1 > 0) {
                this.p.setBounds(0, -this.y, this.getWidth(), v1 - this.y);
                this.p.mutate().setAlpha(this.q);
                this.p.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        if(this.o != null && this.q > 0 && this.r(view0)) {
            this.y(this.o, view0, this.getWidth(), this.getHeight());
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas0);
            return super.drawChild(canvas0, view0, v) || true;
        }
        return super.drawChild(canvas0, view0, v);
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.p;
        boolean z = drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v);
        Drawable drawable1 = this.o;
        if(drawable1 != null && drawable1.isStateful()) {
            z |= drawable1.setState(arr_v);
        }
        b b0 = this.k;
        if(b0 != null) {
            z |= b0.K0(arr_v);
        }
        if(z) {
            this.invalidate();
        }
    }

    @NonNull
    private View e(@NonNull View view0) {
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 != this && viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof View) {
                view0 = (View)viewParent0;
            }
        }
        return view0;
    }

    protected LayoutParams f() {
        return new LayoutParams(-1, -1);
    }

    protected FrameLayout.LayoutParams g(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.FrameLayout
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.f();
    }

    @Override  // android.widget.FrameLayout
    protected FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return this.f();
    }

    @Override  // android.widget.FrameLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.widget.FrameLayout
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.g(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.FrameLayout
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public int getCollapsedTitleGravity() {
        return this.k.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.k.u();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.k.v();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.o;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateList0 = v.l(this.getContext(), attr.colorSurfaceContainer);
        if(colorStateList0 != null) {
            return colorStateList0.getDefaultColor();
        }
        float f = this.getResources().getDimension(dimen.design_appbar_elevation);
        return this.l.g(f);
    }

    public int getExpandedTitleGravity() {
        return this.k.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public float getExpandedTitleTextSize() {
        return this.k.E();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.k.F();
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public int getHyphenationFrequency() {
        return this.k.I();
    }

    @RestrictTo({Scope.b})
    public int getLineCount() {
        return this.k.J();
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public float getLineSpacingAdd() {
        return this.k.K();
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public float getLineSpacingMultiplier() {
        return this.k.L();
    }

    @RestrictTo({Scope.b})
    public int getMaxLines() {
        return this.k.M();
    }

    int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int v = this.w;
        if(v >= 0) {
            return v + this.B + this.D;
        }
        int v1 = this.A == null ? 0 : this.A.r();
        int v2 = ViewCompat.j0(this);
        return v2 <= 0 ? this.getHeight() / 3 : Math.min(v2 * 2 + v1, this.getHeight());
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.p;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getTitle() {
        return this.m ? this.k.P() : null;
    }

    public int getTitleCollapseMode() {
        return this.z;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.k.O();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.k.S();
    }

    private static int h(@NonNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? view0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin : view0.getMeasuredHeight();
    }

    final int i(@NonNull View view0) {
        i i0 = CollapsingToolbarLayout.k(view0);
        LayoutParams collapsingToolbarLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        return this.getHeight() - i0.c() - view0.getHeight() - collapsingToolbarLayout$LayoutParams0.bottomMargin;
    }

    private static CharSequence j(View view0) {
        if(view0 instanceof Toolbar) {
            return ((Toolbar)view0).getTitle();
        }
        return view0 instanceof android.widget.Toolbar ? ((android.widget.Toolbar)view0).getTitle() : null;
    }

    @NonNull
    static i k(@NonNull View view0) {
        i i0 = (i)view0.getTag(id.view_offset_helper);
        if(i0 == null) {
            i0 = new i(view0);
            view0.setTag(0x7F0B106B, i0);  // id:view_offset_helper
        }
        return i0;
    }

    @RestrictTo({Scope.b})
    public boolean l() {
        return this.E;
    }

    @RestrictTo({Scope.b})
    public boolean m() {
        return this.C;
    }

    @RestrictTo({Scope.b})
    public boolean n() {
        return this.k.W();
    }

    private boolean o() {
        return this.z == 1;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof AppBarLayout) {
            this.c(((AppBarLayout)viewParent0));
            ViewCompat.Y1(this, ViewCompat.Y(((AppBarLayout)viewParent0)));
            if(this.x == null) {
                this.x = new c(this);
            }
            ((AppBarLayout)viewParent0).e(this.x);
            ViewCompat.D1(this);
        }
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.k.a0(configuration0);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        ViewParent viewParent0 = this.getParent();
        f appBarLayout$f0 = this.x;
        if(appBarLayout$f0 != null && viewParent0 instanceof AppBarLayout) {
            ((AppBarLayout)viewParent0).B(appBarLayout$f0);
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        WindowInsetsCompat windowInsetsCompat0 = this.A;
        if(windowInsetsCompat0 != null) {
            int v5 = windowInsetsCompat0.r();
            int v6 = this.getChildCount();
            for(int v7 = 0; v7 < v6; ++v7) {
                View view0 = this.getChildAt(v7);
                if(!ViewCompat.Y(view0) && view0.getTop() < v5) {
                    ViewCompat.l1(view0, v5);
                }
            }
        }
        int v8 = this.getChildCount();
        for(int v9 = 0; v9 < v8; ++v9) {
            CollapsingToolbarLayout.k(this.getChildAt(v9)).h();
        }
        this.B(v, v1, v2, v3, false);
        this.C();
        this.A();
        int v10 = this.getChildCount();
        for(int v4 = 0; v4 < v10; ++v4) {
            CollapsingToolbarLayout.k(this.getChildAt(v4)).a();
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        this.d();
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        int v3 = this.A == null ? 0 : this.A.r();
        if((v2 == 0 || this.C) && v3 > 0) {
            this.B = v3;
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + v3, 0x40000000));
        }
        if(this.E && this.k.M() > 1) {
            this.C();
            this.B(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), true);
            int v4 = this.k.z();
            if(v4 > 1) {
                this.D = Math.round(this.k.B()) * (v4 - 1);
                super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() + this.D, 0x40000000));
            }
        }
        ViewGroup viewGroup0 = this.c;
        if(viewGroup0 != null) {
            View view0 = this.d;
            if(view0 != null && view0 != this) {
                this.setMinimumHeight(CollapsingToolbarLayout.h(view0));
                return;
            }
            this.setMinimumHeight(CollapsingToolbarLayout.h(viewGroup0));
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        Drawable drawable0 = this.o;
        if(drawable0 != null) {
            this.x(drawable0, v, v1);
        }
    }

    public boolean p() {
        return this.m;
    }

    // 去混淆评级： 低(20)
    private static boolean q(View view0) {
        return view0 instanceof Toolbar || view0 instanceof android.widget.Toolbar;
    }

    private boolean r(View view0) {
        return this.d == null || this.d == this ? view0 == this.c : view0 == this.d;
    }

    // 检测为 Lambda 实现
    WindowInsetsCompat s(@NonNull WindowInsetsCompat windowInsetsCompat0) [...]

    public void setCollapsedTitleGravity(int v) {
        this.k.l0(v);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int v) {
        this.k.i0(v);
    }

    public void setCollapsedTitleTextColor(@ColorInt int v) {
        this.setCollapsedTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.k.k0(colorStateList0);
    }

    public void setCollapsedTitleTextSize(float f) {
        this.k.m0(f);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface0) {
        this.k.n0(typeface0);
    }

    public void setContentScrim(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.o;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.o = drawable1;
            if(drawable1 != null) {
                this.x(drawable1, this.getWidth(), this.getHeight());
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            ViewCompat.v1(this);
        }
    }

    public void setContentScrimColor(@ColorInt int v) {
        this.setContentScrim(new ColorDrawable(v));
    }

    public void setContentScrimResource(@DrawableRes int v) {
        this.setContentScrim(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setExpandedTitleColor(@ColorInt int v) {
        this.setExpandedTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setExpandedTitleGravity(int v) {
        this.k.w0(v);
    }

    public void setExpandedTitleMarginBottom(int v) {
        this.i = v;
        this.requestLayout();
    }

    public void setExpandedTitleMarginEnd(int v) {
        this.h = v;
        this.requestLayout();
    }

    public void setExpandedTitleMarginStart(int v) {
        this.f = v;
        this.requestLayout();
    }

    public void setExpandedTitleMarginTop(int v) {
        this.g = v;
        this.requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int v) {
        this.k.t0(v);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.k.v0(colorStateList0);
    }

    public void setExpandedTitleTextSize(float f) {
        this.k.x0(f);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface0) {
        this.k.y0(typeface0);
    }

    @RestrictTo({Scope.b})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.E = z;
    }

    @RestrictTo({Scope.b})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.C = z;
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public void setHyphenationFrequency(int v) {
        this.k.D0(v);
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public void setLineSpacingAdd(float f) {
        this.k.F0(f);
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0) float f) {
        this.k.G0(f);
    }

    @RestrictTo({Scope.b})
    public void setMaxLines(int v) {
        this.k.H0(v);
    }

    @RestrictTo({Scope.b})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.k.J0(z);
    }

    void setScrimAlpha(int v) {
        if(v != this.q) {
            if(this.o != null) {
                ViewGroup viewGroup0 = this.c;
                if(viewGroup0 != null) {
                    ViewCompat.v1(viewGroup0);
                }
            }
            this.q = v;
            ViewCompat.v1(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0L) long v) {
        this.t = v;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0L) int v) {
        if(this.w != v) {
            this.w = v;
            this.A();
        }
    }

    public void setScrimsShown(boolean z) {
        this.u(z, ViewCompat.a1(this) && !this.isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public void setStaticLayoutBuilderConfigurer(@Nullable d collapsingToolbarLayout$d0) {
        this.k.L0(collapsingToolbarLayout$d0);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.p;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.p = drawable1;
            if(drawable1 != null) {
                if(drawable1.isStateful()) {
                    this.p.setState(this.getDrawableState());
                }
                DrawableCompat.m(this.p, ViewCompat.e0(this));
                this.p.setVisible(this.getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            ViewCompat.v1(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int v) {
        this.setStatusBarScrim(new ColorDrawable(v));
    }

    public void setStatusBarScrimResource(@DrawableRes int v) {
        this.setStatusBarScrim(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setTitle(@Nullable CharSequence charSequence0) {
        this.k.M0(charSequence0);
        this.w();
    }

    public void setTitleCollapseMode(int v) {
        this.z = v;
        boolean z = this.o();
        this.k.B0(z);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof AppBarLayout) {
            this.c(((AppBarLayout)viewParent0));
        }
        if(z && this.o == null) {
            this.setContentScrimColor(this.getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.k.O0(textUtils$TruncateAt0);
    }

    public void setTitleEnabled(boolean z) {
        if(z != this.m) {
            this.m = z;
            this.w();
            this.z();
            this.requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator0) {
        this.k.I0(timeInterpolator0);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(this.p != null && this.p.isVisible() != (v == 0)) {
            this.p.setVisible(v == 0, false);
        }
        if(this.o != null && this.o.isVisible() != (v == 0)) {
            this.o.setVisible(v == 0, false);
        }
    }

    public void t(int v, int v1, int v2, int v3) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = v3;
        this.requestLayout();
    }

    public void u(boolean z, boolean z1) {
        int v = 0;
        if(this.r != z) {
            if(z1) {
                if(z) {
                    v = 0xFF;
                }
                this.a(v);
            }
            else {
                if(z) {
                    v = 0xFF;
                }
                this.setScrimAlpha(v);
            }
            this.r = z;
        }
    }

    private void v(boolean z) {
        int v4;
        int v3;
        int v2;
        int v1;
        View view0 = this.d;
        if(view0 == null) {
            view0 = this.c;
        }
        int v = this.i(view0);
        com.google.android.material.internal.d.a(this, this.e, this.j);
        ViewGroup viewGroup0 = this.c;
        if(viewGroup0 instanceof Toolbar) {
            v1 = ((Toolbar)viewGroup0).getTitleMarginStart();
            v2 = ((Toolbar)viewGroup0).getTitleMarginEnd();
            v3 = ((Toolbar)viewGroup0).getTitleMarginTop();
            v4 = ((Toolbar)viewGroup0).getTitleMarginBottom();
        }
        else if(Build.VERSION.SDK_INT < 24 || !(viewGroup0 instanceof android.widget.Toolbar)) {
            v1 = 0;
            v4 = 0;
            v2 = 0;
            v3 = 0;
        }
        else {
            v1 = ((android.widget.Toolbar)viewGroup0).getTitleMarginStart();
            v2 = ((android.widget.Toolbar)viewGroup0).getTitleMarginEnd();
            v3 = ((android.widget.Toolbar)viewGroup0).getTitleMarginTop();
            v4 = ((android.widget.Toolbar)viewGroup0).getTitleMarginBottom();
        }
        b b0 = this.k;
        Rect rect0 = this.j;
        int v5 = rect0.left;
        int v6 = z ? v2 : v1;
        int v7 = rect0.top + v + v3;
        int v8 = rect0.right;
        if(!z) {
            v1 = v2;
        }
        b0.g0(v5 + v6, v7, v8 - v1, rect0.bottom + v - v4);
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.o || drawable0 == this.p;
    }

    private void w() {
        this.setContentDescription(this.getTitle());
    }

    private void x(@NonNull Drawable drawable0, int v, int v1) {
        this.y(drawable0, this.c, v, v1);
    }

    private void y(@NonNull Drawable drawable0, @Nullable View view0, int v, int v1) {
        if(this.o() && view0 != null && this.m) {
            v1 = view0.getBottom();
        }
        drawable0.setBounds(0, 0, v, v1);
    }

    private void z() {
        if(!this.m) {
            View view0 = this.e;
            if(view0 != null) {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this.e);
                }
            }
        }
        if(this.m && this.c != null) {
            if(this.e == null) {
                this.e = new View(this.getContext());
            }
            if(this.e.getParent() == null) {
                this.c.addView(this.e, -1, -1);
            }
        }
    }
}

