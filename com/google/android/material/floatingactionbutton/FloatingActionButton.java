package com.google.android.material.floatingactionbutton;

import G1.a;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.i;
import com.google.android.material.animation.l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.d;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements a, AttachedBehavior, TintableBackgroundView, TintableImageSourceView, t {
    public static class BaseBehavior extends Behavior {
        private Rect a;
        private b b;
        private boolean c;
        private static final boolean d = true;

        public BaseBehavior() {
            this.c = true;
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.FloatingActionButton_Behavior_Layout);
            this.c = typedArray0.getBoolean(styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArray0.recycle();
        }

        public boolean N(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, @NonNull Rect rect0) {
            rect0.set(floatingActionButton0.getLeft() + floatingActionButton0.m.left, floatingActionButton0.getTop() + floatingActionButton0.m.top, floatingActionButton0.getRight() - floatingActionButton0.m.right, floatingActionButton0.getBottom() - floatingActionButton0.m.bottom);
            return true;
        }

        public boolean O() {
            return this.c;
        }

        private static boolean P(@NonNull View view0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            return viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).f() instanceof BottomSheetBehavior : false;
        }

        private void Q(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0) {
            int v1;
            Rect rect0 = floatingActionButton0.m;
            if(rect0 != null && rect0.centerX() > 0 && rect0.centerY() > 0) {
                LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)floatingActionButton0.getLayoutParams();
                int v = 0;
                if(floatingActionButton0.getRight() >= coordinatorLayout0.getWidth() - coordinatorLayout$LayoutParams0.rightMargin) {
                    v1 = rect0.right;
                }
                else {
                    v1 = floatingActionButton0.getLeft() > coordinatorLayout$LayoutParams0.leftMargin ? 0 : -rect0.left;
                }
                if(floatingActionButton0.getBottom() >= coordinatorLayout0.getHeight() - coordinatorLayout$LayoutParams0.bottomMargin) {
                    v = rect0.bottom;
                }
                else if(floatingActionButton0.getTop() <= coordinatorLayout$LayoutParams0.topMargin) {
                    v = -rect0.top;
                }
                if(v != 0) {
                    ViewCompat.l1(floatingActionButton0, v);
                }
                if(v1 != 0) {
                    ViewCompat.k1(floatingActionButton0, v1);
                }
            }
        }

        public boolean R(CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, View view0) {
            if(view0 instanceof AppBarLayout) {
                this.W(coordinatorLayout0, ((AppBarLayout)view0), floatingActionButton0);
                return false;
            }
            if(BaseBehavior.P(view0)) {
                this.X(view0, floatingActionButton0);
            }
            return false;
        }

        public boolean S(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, int v) {
            List list0 = coordinatorLayout0.w(floatingActionButton0);
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = (View)list0.get(v2);
                if(!(view0 instanceof AppBarLayout)) {
                    if(!BaseBehavior.P(view0) || !this.X(view0, floatingActionButton0)) {
                        continue;
                    }
                    break;
                }
                else if(this.W(coordinatorLayout0, ((AppBarLayout)view0), floatingActionButton0)) {
                    break;
                }
            }
            coordinatorLayout0.N(floatingActionButton0, v);
            this.Q(coordinatorLayout0, floatingActionButton0);
            return true;
        }

        public void T(boolean z) {
            this.c = z;
        }

        @VisibleForTesting
        public void U(b floatingActionButton$b0) {
            this.b = floatingActionButton$b0;
        }

        private boolean V(@NonNull View view0, @NonNull FloatingActionButton floatingActionButton0) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)floatingActionButton0.getLayoutParams();
            if(!this.c) {
                return false;
            }
            return coordinatorLayout$LayoutParams0.e() == view0.getId() ? floatingActionButton0.getUserSetVisibility() == 0 : false;
        }

        private boolean W(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull FloatingActionButton floatingActionButton0) {
            if(!this.V(appBarLayout0, floatingActionButton0)) {
                return false;
            }
            if(this.a == null) {
                this.a = new Rect();
            }
            Rect rect0 = this.a;
            d.a(coordinatorLayout0, appBarLayout0, rect0);
            if(rect0.bottom <= appBarLayout0.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton0.q(this.b, false);
                return true;
            }
            floatingActionButton0.B(this.b, false);
            return true;
        }

        private boolean X(@NonNull View view0, @NonNull FloatingActionButton floatingActionButton0) {
            if(!this.V(view0, floatingActionButton0)) {
                return false;
            }
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)floatingActionButton0.getLayoutParams();
            if(view0.getTop() < floatingActionButton0.getHeight() / 2 + coordinatorLayout$LayoutParams0.topMargin) {
                floatingActionButton0.q(this.b, false);
                return true;
            }
            floatingActionButton0.B(this.b, false);
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean i(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0) {
            return this.N(coordinatorLayout0, ((FloatingActionButton)view0), rect0);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
            if(coordinatorLayout$LayoutParams0.h == 0) {
                coordinatorLayout$LayoutParams0.h = 80;
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean p(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1) {
            return this.R(coordinatorLayout0, ((FloatingActionButton)view0), view1);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.S(coordinatorLayout0, ((FloatingActionButton)view0), v);
        }
    }

    public static class com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior extends BaseBehavior {
        public com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior() {
        }

        public com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean N(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, @NonNull Rect rect0) {
            return super.N(coordinatorLayout0, floatingActionButton0, rect0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean O() {
            return super.O();
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean R(CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, View view0) {
            return super.R(coordinatorLayout0, floatingActionButton0, view0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean S(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FloatingActionButton floatingActionButton0, int v) {
            return super.S(coordinatorLayout0, floatingActionButton0, v);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public void T(boolean z) {
            super.T(z);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        @VisibleForTesting
        public void U(b floatingActionButton$b0) {
            super.U(floatingActionButton$b0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
            super.o(coordinatorLayout$LayoutParams0);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton0) {
        }

        public void b(FloatingActionButton floatingActionButton0) {
        }
    }

    class c implements com.google.android.material.shadow.c {
        final FloatingActionButton a;

        @Override  // com.google.android.material.shadow.c
        public void a(@Nullable Drawable drawable0) {
            if(drawable0 != null) {
                FloatingActionButton.this.super.setBackgroundDrawable(drawable0);
            }
        }

        @Override  // com.google.android.material.shadow.c
        public void b(int v, int v1, int v2, int v3) {
            FloatingActionButton.this.m.set(v, v1, v2, v3);
            int v4 = FloatingActionButton.this.j;
            int v5 = FloatingActionButton.this.j;
            int v6 = FloatingActionButton.this.j;
            int v7 = FloatingActionButton.this.j;
            FloatingActionButton.this.setPadding(v + v4, v1 + v5, v2 + v6, v3 + v7);
        }

        @Override  // com.google.android.material.shadow.c
        public boolean c() {
            return FloatingActionButton.this.l;
        }

        @Override  // com.google.android.material.shadow.c
        public float d() {
            return ((float)FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.floatingactionbutton.FloatingActionButton.d {
    }

    class e implements j {
        @NonNull
        private final l a;
        final FloatingActionButton b;

        e(@NonNull l l0) {
            this.a = l0;
        }

        @Override  // com.google.android.material.floatingactionbutton.d$j
        public void a() {
            this.a.a(FloatingActionButton.this);
        }

        @Override  // com.google.android.material.floatingactionbutton.d$j
        public void b() {
            this.a.b(FloatingActionButton.this);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof e && ((e)object0).a.equals(this.a);
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @Nullable
    private ColorStateList b;
    @Nullable
    private PorterDuff.Mode c;
    @Nullable
    private ColorStateList d;
    @Nullable
    private PorterDuff.Mode e;
    @Nullable
    private ColorStateList f;
    private int g;
    private int h;
    private int i;
    private com.google.android.material.floatingactionbutton.d impl;
    private int j;
    private int k;
    boolean l;
    final Rect m;
    private final Rect n;
    @NonNull
    private final AppCompatImageHelper o;
    @NonNull
    private final G1.c p;
    private static final String q = "FloatingActionButton";
    private static final String r = "expandableWidgetHelper";
    private static final int s = 0;
    public static final int t = 1;
    public static final int u = 0;
    public static final int v = -1;
    public static final int w = 0;
    private static final int x = 470;

    static {
        FloatingActionButton.s = style.Widget_Design_FloatingActionButton;
    }

    public FloatingActionButton(@NonNull Context context0) {
        this(context0, null);
    }

    public FloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, FloatingActionButton.s), attributeSet0, v);
        this.m = new Rect();
        this.n = new Rect();
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.FloatingActionButton, v, FloatingActionButton.s, new int[0]);
        this.b = com.google.android.material.resources.d.a(context1, typedArray0, styleable.FloatingActionButton_backgroundTint);
        this.c = M.u(typedArray0.getInt(styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.f = com.google.android.material.resources.d.a(context1, typedArray0, styleable.FloatingActionButton_rippleColor);
        this.h = typedArray0.getInt(styleable.FloatingActionButton_fabSize, -1);
        this.i = typedArray0.getDimensionPixelSize(styleable.FloatingActionButton_fabCustomSize, 0);
        this.g = typedArray0.getDimensionPixelSize(styleable.FloatingActionButton_borderWidth, 0);
        float f = typedArray0.getDimension(styleable.FloatingActionButton_elevation, 0.0f);
        float f1 = typedArray0.getDimension(styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float f2 = typedArray0.getDimension(styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.l = typedArray0.getBoolean(styleable.FloatingActionButton_useCompatPadding, false);
        int v1 = this.getResources().getDimensionPixelSize(dimen.mtrl_fab_min_touch_target);
        this.setMaxImageSize(typedArray0.getDimensionPixelSize(styleable.FloatingActionButton_maxImageSize, 0));
        i i0 = i.c(context1, typedArray0, styleable.FloatingActionButton_showMotionSpec);
        i i1 = i.c(context1, typedArray0, styleable.FloatingActionButton_hideMotionSpec);
        p p0 = p.g(context1, attributeSet0, v, FloatingActionButton.s, p.m).m();
        boolean z = typedArray0.getBoolean(styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        this.setEnabled(typedArray0.getBoolean(styleable.FloatingActionButton_android_enabled, true));
        typedArray0.recycle();
        AppCompatImageHelper appCompatImageHelper0 = new AppCompatImageHelper(this);
        this.o = appCompatImageHelper0;
        appCompatImageHelper0.g(attributeSet0, v);
        this.p = new G1.c(this);
        this.getImpl().a0(p0);
        this.getImpl().y(this.b, this.c, this.f, this.g);
        this.getImpl().W(v1);
        this.getImpl().R(f);
        this.getImpl().U(f1);
        this.getImpl().X(f2);
        this.getImpl().b0(i0);
        this.getImpl().T(i1);
        this.getImpl().S(z);
        this.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void A(@Nullable b floatingActionButton$b0) {
        this.B(floatingActionButton$b0, true);
    }

    void B(@Nullable b floatingActionButton$b0, boolean z) {
        this.getImpl().f0(this.C(floatingActionButton$b0), z);
    }

    @Nullable
    private k C(@Nullable b floatingActionButton$b0) {
        class com.google.android.material.floatingactionbutton.FloatingActionButton.a implements k {
            final b a;
            final FloatingActionButton b;

            com.google.android.material.floatingactionbutton.FloatingActionButton.a(b floatingActionButton$b0) {
                this.a = floatingActionButton$b0;
                super();
            }

            @Override  // com.google.android.material.floatingactionbutton.d$k
            public void a() {
                this.a.b(FloatingActionButton.this);
            }

            @Override  // com.google.android.material.floatingactionbutton.d$k
            public void b() {
                this.a.a(FloatingActionButton.this);
            }
        }

        return floatingActionButton$b0 == null ? null : new com.google.android.material.floatingactionbutton.FloatingActionButton.a(this, floatingActionButton$b0);
    }

    @Override  // G1.b
    public boolean a(boolean z) {
        return this.p.f(z);
    }

    @Override  // G1.b
    public boolean b() {
        return this.p.c();
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.getImpl().F(this.getDrawableState());
    }

    public void f(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.getImpl().e(animator$AnimatorListener0);
    }

    public void g(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.getImpl().f(animator$AnimatorListener0);
    }

    @Override  // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override  // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        return new com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior();
    }

    public float getCompatElevation() {
        return this.getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return this.getImpl().t();
    }

    @Nullable
    public Drawable getContentBackground() {
        return this.getImpl().m();
    }

    @Px
    public int getCustomSize() {
        return this.i;
    }

    @Override  // G1.a
    public int getExpandedComponentIdHint() {
        return this.p.b();
    }

    @Nullable
    public i getHideMotionSpec() {
        return this.getImpl().p();
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if(this.impl == null) {
            this.impl = this.j();
        }
        return this.impl;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        return this.f == null ? 0 : this.f.getDefaultColor();
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return (p)Preconditions.l(this.getImpl().u());
    }

    @Nullable
    public i getShowMotionSpec() {
        return this.getImpl().v();
    }

    public int getSize() {
        return this.h;
    }

    int getSizeDimension() {
        return this.m(this.h);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    public void h(@NonNull l l0) {
        this.getImpl().g(new e(this, l0));
    }

    public void i() {
        this.setCustomSize(0);
    }

    @NonNull
    private com.google.android.material.floatingactionbutton.d j() {
        return new com.google.android.material.floatingactionbutton.e(this, new c(this));
    }

    @Override  // android.widget.ImageView
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().B();
    }

    @Deprecated
    public boolean k(@NonNull Rect rect0) {
        if(ViewCompat.a1(this)) {
            rect0.set(0, 0, this.getWidth(), this.getHeight());
            this.t(rect0);
            return true;
        }
        return false;
    }

    public void l(@NonNull Rect rect0) {
        rect0.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
        this.t(rect0);
    }

    private int m(int v) {
        int v1 = this.i;
        if(v1 != 0) {
            return v1;
        }
        Resources resources0 = this.getResources();
        switch(v) {
            case -1: {
                return Math.max(resources0.getConfiguration().screenWidthDp, resources0.getConfiguration().screenHeightDp) >= 470 ? this.m(0) : this.m(1);
            }
            case 1: {
                return resources0.getDimensionPixelSize(dimen.design_fab_size_mini);
            }
            default: {
                return resources0.getDimensionPixelSize(dimen.design_fab_size_normal);
            }
        }
    }

    private void n(@NonNull Rect rect0) {
        this.l(rect0);
        int v = this.impl.w();
        rect0.inset(-v, -v);
    }

    public void o() {
        this.p(null);
    }

    @Override  // android.widget.ImageView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getImpl().C();
    }

    @Override  // android.widget.ImageView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getImpl().E();
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        int v2 = this.getSizeDimension();
        this.j = (v2 - this.k) / 2;
        this.getImpl().i0();
        int v3 = Math.min(View.resolveSize(v2, v), View.resolveSize(v2, v1));
        this.setMeasuredDimension(this.m.left + v3 + this.m.right, v3 + this.m.top + this.m.bottom);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((ExtendableSavedState)parcelable0).a());
        Bundle bundle0 = (Bundle)Preconditions.l(((Bundle)((ExtendableSavedState)parcelable0).c.get("expandableWidgetHelper")));
        this.p.d(bundle0);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = super.onSaveInstanceState();
        if(parcelable0 == null) {
            parcelable0 = new Bundle();
        }
        Parcelable parcelable1 = new ExtendableSavedState(parcelable0);
        Bundle bundle0 = this.p.e();
        parcelable1.c.put("expandableWidgetHelper", bundle0);
        return parcelable1;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.n(this.n);
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            return this.n.contains(v, v1) ? super.onTouchEvent(motionEvent0) : false;
        }
        return super.onTouchEvent(motionEvent0);
    }

    public void p(@Nullable b floatingActionButton$b0) {
        this.q(floatingActionButton$b0, true);
    }

    void q(@Nullable b floatingActionButton$b0, boolean z) {
        this.getImpl().x(this.C(floatingActionButton$b0), z);
    }

    public boolean r() {
        return this.getImpl().z();
    }

    public boolean s() {
        return this.getImpl().A();
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override  // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        if(this.b != colorStateList0) {
            this.b = colorStateList0;
            this.getImpl().P(colorStateList0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.c != porterDuff$Mode0) {
            this.c = porterDuff$Mode0;
            this.getImpl().Q(porterDuff$Mode0);
        }
    }

    public void setCompatElevation(float f) {
        this.getImpl().R(f);
    }

    public void setCompatElevationResource(@DimenRes int v) {
        this.setCompatElevation(this.getResources().getDimension(v));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        this.getImpl().U(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int v) {
        this.setCompatHoveredFocusedTranslationZ(this.getResources().getDimension(v));
    }

    public void setCompatPressedTranslationZ(float f) {
        this.getImpl().X(f);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int v) {
        this.setCompatPressedTranslationZ(this.getResources().getDimension(v));
    }

    public void setCustomSize(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if(v != this.i) {
            this.i = v;
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        this.getImpl().j0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if(z != this.getImpl().o()) {
            this.getImpl().S(z);
            this.requestLayout();
        }
    }

    @Override  // G1.a
    public void setExpandedComponentIdHint(@IdRes int v) {
        this.p.g(v);
    }

    public void setHideMotionSpec(@Nullable i i0) {
        this.getImpl().T(i0);
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        this.setHideMotionSpec(i.d(this.getContext(), v));
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable0) {
        if(this.getDrawable() != drawable0) {
            super.setImageDrawable(drawable0);
            this.getImpl().h0();
            if(this.d != null) {
                this.u();
            }
        }
    }

    @Override  // android.widget.ImageView
    public void setImageResource(@DrawableRes int v) {
        this.o.i(v);
        this.u();
    }

    public void setMaxImageSize(int v) {
        this.k = v;
        this.getImpl().V(v);
    }

    public void setRippleColor(@ColorInt int v) {
        this.setRippleColor(ColorStateList.valueOf(v));
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.f != colorStateList0) {
            this.f = colorStateList0;
            this.getImpl().Y(this.f);
        }
    }

    @Override  // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        this.getImpl().J();
    }

    @Override  // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        this.getImpl().J();
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        this.getImpl().Z(z);
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        this.getImpl().a0(p0);
    }

    public void setShowMotionSpec(@Nullable i i0) {
        this.getImpl().b0(i0);
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        this.setShowMotionSpec(i.d(this.getContext(), v));
    }

    public void setSize(int v) {
        this.i = 0;
        if(v != this.h) {
            this.h = v;
            this.requestLayout();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.setBackgroundTintList(colorStateList0);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.setBackgroundTintMode(porterDuff$Mode0);
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList0) {
        if(this.d != colorStateList0) {
            this.d = colorStateList0;
            this.u();
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.e != porterDuff$Mode0) {
            this.e = porterDuff$Mode0;
            this.u();
        }
    }

    @Override  // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        this.getImpl().K();
    }

    @Override  // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.getImpl().K();
    }

    @Override  // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        this.getImpl().K();
    }

    public void setUseCompatPadding(boolean z) {
        if(this.l != z) {
            this.l = z;
            this.getImpl().D();
        }
    }

    @Override  // com.google.android.material.internal.VisibilityAwareImageButton
    public void setVisibility(int v) {
        super.setVisibility(v);
    }

    private void t(@NonNull Rect rect0) {
        rect0.left += this.m.left;
        rect0.top += this.m.top;
        rect0.right -= this.m.right;
        rect0.bottom -= this.m.bottom;
    }

    private void u() {
        Drawable drawable0 = this.getDrawable();
        if(drawable0 == null) {
            return;
        }
        ColorStateList colorStateList0 = this.d;
        if(colorStateList0 == null) {
            DrawableCompat.c(drawable0);
            return;
        }
        int v = colorStateList0.getColorForState(this.getDrawableState(), 0);
        PorterDuff.Mode porterDuff$Mode0 = this.e == null ? PorterDuff.Mode.SRC_IN : this.e;
        drawable0.mutate().setColorFilter(AppCompatDrawableManager.e(v, porterDuff$Mode0));
    }

    public void v(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.getImpl().L(animator$AnimatorListener0);
    }

    public void w(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.getImpl().M(animator$AnimatorListener0);
    }

    public void x(@NonNull l l0) {
        this.getImpl().N(new e(this, l0));
    }

    public boolean y() {
        return this.getImpl().o();
    }

    public void z() {
        this.A(null);
    }
}

