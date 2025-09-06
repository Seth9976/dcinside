package com.google.android.material.navigation;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout.LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.f;
import com.google.android.material.internal.D;
import com.google.android.material.internal.N;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.s;
import com.google.android.material.internal.t;
import com.google.android.material.motion.b;
import com.google.android.material.motion.c;
import com.google.android.material.motion.i;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.u;
import j..util.Objects;

public class NavigationView extends ScrimInsetsFrameLayout implements b {
    public static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            @Nullable
            public SavedState a(@NonNull Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            @NonNull
            public SavedState b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            @NonNull
            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        @Nullable
        public Bundle c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readBundle(classLoader0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeBundle(this.c);
        }
    }

    class com.google.android.material.navigation.NavigationView.a extends SimpleDrawerListener {
        final NavigationView a;

        @Override  // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener
        public void onDrawerClosed(@NonNull View view0) {
            NavigationView navigationView0 = NavigationView.this;
            if(view0 == navigationView0) {
                navigationView0.v.f();
                NavigationView.this.y();
            }
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener
        public void onDrawerOpened(@NonNull View view0) {
            NavigationView navigationView0 = NavigationView.this;
            if(view0 == navigationView0) {
                c c0 = navigationView0.v;
                Objects.requireNonNull(c0);
                view0.post(new h(c0));
            }
        }
    }

    public interface d {
        boolean a(@NonNull MenuItem arg1);
    }

    private static final int A = 1;
    @NonNull
    private final s h;
    private final t i;
    d j;
    private final int k;
    private final int[] l;
    private MenuInflater m;
    private ViewTreeObserver.OnGlobalLayoutListener n;
    private boolean o;
    private boolean p;
    @Px
    private int q;
    private final boolean r;
    @Px
    private final int s;
    private final u t;
    private final i u;
    private final c v;
    private final DrawerListener w;
    private static final int[] x;
    private static final int[] y;
    private static final int z;

    static {
        NavigationView.x = new int[]{0x10100A0};
        NavigationView.y = new int[]{0xFEFEFF62};
        NavigationView.z = style.Widget_Design_NavigationView;
    }

    public NavigationView(@NonNull Context context0) {
        this(context0, null);
    }

    public NavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.navigationViewStyle);
    }

    public NavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class com.google.android.material.navigation.NavigationView.b implements Callback {
            final NavigationView a;

            @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
            public boolean a(MenuBuilder menuBuilder0, MenuItem menuItem0) {
                d navigationView$d0 = NavigationView.this.j;
                return navigationView$d0 != null && navigationView$d0.a(menuItem0);
            }

            @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
            public void b(MenuBuilder menuBuilder0) {
            }
        }

        int v1 = NavigationView.z;
        super(I1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        t t0 = new t();
        this.i = t0;
        this.l = new int[2];
        this.o = true;
        this.p = true;
        this.q = 0;
        this.t = u.a(this);
        this.u = new i(this);
        this.v = new c(this);
        this.w = new com.google.android.material.navigation.NavigationView.a(this);
        Context context1 = this.getContext();
        s s0 = new s(context1);
        this.h = s0;
        TintTypedArray tintTypedArray0 = D.l(context1, attributeSet0, styleable.NavigationView, v, v1, new int[0]);
        if(tintTypedArray0.C(styleable.NavigationView_android_background)) {
            ViewCompat.R1(this, tintTypedArray0.h(1));
        }
        int v2 = tintTypedArray0.g(styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.q = v2;
        this.r = v2 == 0;
        this.s = this.getResources().getDimensionPixelSize(dimen.m3_navigation_drawer_layout_corner_size);
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = f.g(drawable0);
        if(drawable0 == null || colorStateList0 != null) {
            k k0 = new k(p.e(context1, attributeSet0, v, v1).m());
            if(colorStateList0 != null) {
                k0.p0(colorStateList0);
            }
            k0.a0(context1);
            ViewCompat.R1(this, k0);
        }
        if(tintTypedArray0.C(styleable.NavigationView_elevation)) {
            this.setElevation(((float)tintTypedArray0.g(8, 0)));
        }
        this.setFitsSystemWindows(tintTypedArray0.a(styleable.NavigationView_android_fitsSystemWindows, false));
        this.k = tintTypedArray0.g(styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateList1 = tintTypedArray0.C(styleable.NavigationView_subheaderColor) ? tintTypedArray0.d(0x1F) : null;
        int v3 = tintTypedArray0.C(styleable.NavigationView_subheaderTextAppearance) ? tintTypedArray0.u(34, 0) : 0;
        if(v3 == 0 && colorStateList1 == null) {
            colorStateList1 = this.o(0x1010038);
        }
        ColorStateList colorStateList2 = tintTypedArray0.C(styleable.NavigationView_itemIconTint) ? tintTypedArray0.d(14) : this.o(0x1010038);
        int v4 = tintTypedArray0.C(styleable.NavigationView_itemTextAppearance) ? tintTypedArray0.u(24, 0) : 0;
        boolean z = tintTypedArray0.a(styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if(tintTypedArray0.C(styleable.NavigationView_itemIconSize)) {
            this.setItemIconSize(tintTypedArray0.g(13, 0));
        }
        ColorStateList colorStateList3 = tintTypedArray0.C(styleable.NavigationView_itemTextColor) ? tintTypedArray0.d(26) : null;
        if(v4 == 0 && colorStateList3 == null) {
            colorStateList3 = this.o(0x1010036);
        }
        Drawable drawable1 = tintTypedArray0.h(styleable.NavigationView_itemBackground);
        if(drawable1 == null && this.s(tintTypedArray0)) {
            drawable1 = this.p(tintTypedArray0);
            ColorStateList colorStateList4 = com.google.android.material.resources.d.b(context1, tintTypedArray0, styleable.NavigationView_itemRippleColor);
            if(colorStateList4 != null) {
                Drawable drawable2 = this.q(tintTypedArray0, null);
                t0.M(new RippleDrawable(com.google.android.material.ripple.b.e(colorStateList4), null, drawable2));
            }
        }
        if(tintTypedArray0.C(styleable.NavigationView_itemHorizontalPadding)) {
            this.setItemHorizontalPadding(tintTypedArray0.g(11, 0));
        }
        if(tintTypedArray0.C(styleable.NavigationView_itemVerticalPadding)) {
            this.setItemVerticalPadding(tintTypedArray0.g(27, 0));
        }
        this.setDividerInsetStart(tintTypedArray0.g(styleable.NavigationView_dividerInsetStart, 0));
        this.setDividerInsetEnd(tintTypedArray0.g(styleable.NavigationView_dividerInsetEnd, 0));
        this.setSubheaderInsetStart(tintTypedArray0.g(styleable.NavigationView_subheaderInsetStart, 0));
        this.setSubheaderInsetEnd(tintTypedArray0.g(styleable.NavigationView_subheaderInsetEnd, 0));
        this.setTopInsetScrimEnabled(tintTypedArray0.a(styleable.NavigationView_topInsetScrimEnabled, true));
        this.setBottomInsetScrimEnabled(tintTypedArray0.a(styleable.NavigationView_bottomInsetScrimEnabled, true));
        int v5 = tintTypedArray0.g(styleable.NavigationView_itemIconPadding, 0);
        this.setItemMaxLines(tintTypedArray0.o(styleable.NavigationView_itemMaxLines, 1));
        s0.Y(new com.google.android.material.navigation.NavigationView.b(this));
        t0.K(1);
        t0.i(context1, s0);
        if(v3 != 0) {
            t0.a0(v3);
        }
        t0.X(colorStateList1);
        t0.Q(colorStateList2);
        t0.W(this.getOverScrollMode());
        if(v4 != 0) {
            t0.S(v4);
        }
        t0.T(z);
        t0.U(colorStateList3);
        t0.L(drawable1);
        t0.O(v5);
        s0.b(t0);
        this.addView(((View)t0.m(this)));
        if(tintTypedArray0.C(styleable.NavigationView_menu)) {
            this.u(tintTypedArray0.u(28, 0));
        }
        if(tintTypedArray0.C(styleable.NavigationView_headerLayout)) {
            this.t(tintTypedArray0.u(9, 0));
        }
        tintTypedArray0.I();
        this.C();
    }

    public void A(@NonNull View view0) {
        this.i.F(view0);
    }

    @O1.a
    private Pair B() {
        ViewParent viewParent0 = this.getParent();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(!(viewParent0 instanceof DrawerLayout) || !(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        }
        return new Pair(((DrawerLayout)viewParent0), ((LayoutParams)viewGroup$LayoutParams0));
    }

    private void C() {
        class com.google.android.material.navigation.NavigationView.c implements ViewTreeObserver.OnGlobalLayoutListener {
            final NavigationView a;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView.this.getLocationOnScreen(NavigationView.this.l);
                boolean z = true;
                boolean z1 = NavigationView.this.l[1] == 0;
                NavigationView.this.i.G(z1);
                NavigationView.this.setDrawTopInsetForeground(z1 && NavigationView.this.w());
                boolean z2 = NavigationView.this.l[0] == 0 || NavigationView.this.l[0] + NavigationView.this.getWidth() == 0;
                NavigationView.this.setDrawLeftInsetForeground(z2);
                Activity activity0 = com.google.android.material.internal.c.a(NavigationView.this.getContext());
                if(activity0 != null) {
                    Rect rect0 = N.b(activity0);
                    boolean z3 = rect0.height() - NavigationView.this.getHeight() == NavigationView.this.l[1];
                    boolean z4 = Color.alpha(activity0.getWindow().getNavigationBarColor()) != 0;
                    NavigationView.this.setDrawBottomInsetForeground(z3 && z4 && NavigationView.this.v());
                    if(rect0.width() != NavigationView.this.l[0] && rect0.width() - NavigationView.this.getWidth() != NavigationView.this.l[0]) {
                        z = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z);
                }
            }
        }

        this.n = new com.google.android.material.navigation.NavigationView.c(this);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.n);
    }

    @Override  // com.google.android.material.motion.b
    public void b(@NonNull BackEventCompat backEventCompat0) {
        this.B();
        this.u.j(backEventCompat0);
    }

    @Override  // com.google.android.material.motion.b
    public void c(@NonNull BackEventCompat backEventCompat0) {
        Pair pair0 = this.B();
        this.u.l(backEventCompat0, ((LayoutParams)pair0.second).a);
        if(this.r) {
            float f = this.u.a(backEventCompat0.a());
            this.q = com.google.android.material.animation.b.c(0, this.s, f);
            this.z(this.getWidth(), this.getHeight());
        }
    }

    @Override  // com.google.android.material.motion.b
    public void d() {
        Pair pair0 = this.B();
        DrawerLayout drawerLayout0 = (DrawerLayout)pair0.first;
        BackEventCompat backEventCompat0 = this.u.c();
        if(backEventCompat0 != null && Build.VERSION.SDK_INT >= 34) {
            int v = ((LayoutParams)pair0.second).a;
            Animator.AnimatorListener animator$AnimatorListener0 = com.google.android.material.navigation.b.b(drawerLayout0, this);
            ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = com.google.android.material.navigation.b.c(drawerLayout0);
            this.u.h(backEventCompat0, v, animator$AnimatorListener0, valueAnimator$AnimatorUpdateListener0);
            return;
        }
        drawerLayout0.f(this);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(@NonNull Canvas canvas0) {
        g g0 = (Canvas canvas0) -> super.dispatchDraw(canvas0);
        this.t.e(canvas0, g0);
    }

    @Override  // com.google.android.material.motion.b
    public void f() {
        this.B();
        this.u.f();
        this.y();
    }

    @VisibleForTesting
    i getBackHelper() {
        return this.u;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.i.o();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.i.p();
    }

    @Px
    public int getDividerInsetStart() {
        return this.i.q();
    }

    public int getHeaderCount() {
        return this.i.r();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.i.t();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.i.u();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.i.v();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.i.y();
    }

    public int getItemMaxLines() {
        return this.i.w();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.i.x();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.i.z();
    }

    @NonNull
    public Menu getMenu() {
        return this.h;
    }

    private MenuInflater getMenuInflater() {
        if(this.m == null) {
            this.m = new SupportMenuInflater(this.getContext());
        }
        return this.m;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.i.A();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.i.B();
    }

    @Override  // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({Scope.b})
    protected void h(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        this.i.n(windowInsetsCompat0);
    }

    public void n(@NonNull View view0) {
        this.i.j(view0);
    }

    @Nullable
    private ColorStateList o(int v) {
        TypedValue typedValue0 = new TypedValue();
        if(!this.getContext().getTheme().resolveAttribute(v, typedValue0, true)) {
            return null;
        }
        ColorStateList colorStateList0 = AppCompatResources.a(this.getContext(), typedValue0.resourceId);
        if(!this.getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue0, true)) {
            return null;
        }
        int v1 = typedValue0.data;
        int v2 = colorStateList0.getDefaultColor();
        return new ColorStateList(new int[][]{NavigationView.y, NavigationView.x, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(NavigationView.y, v2), v1, v2});
    }

    @Override  // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof DrawerLayout && this.v.b()) {
            ((DrawerLayout)viewParent0).O(this.w);
            ((DrawerLayout)viewParent0).a(this.w);
            if(((DrawerLayout)viewParent0).D(this)) {
                this.v.e();
            }
        }
    }

    @Override  // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof DrawerLayout) {
            ((DrawerLayout)viewParent0).O(this.w);
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        switch(View.MeasureSpec.getMode(v)) {
            case 0x80000000: {
                v = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), this.k), 0x40000000);
                break;
            }
            case 0: {
                v = View.MeasureSpec.makeMeasureSpec(this.k, 0x40000000);
            }
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.h.V(((SavedState)parcelable0).c);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        Bundle bundle0 = new Bundle();
        parcelable0.c = bundle0;
        this.h.X(bundle0);
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.z(v, v1);
    }

    @NonNull
    private Drawable p(@NonNull TintTypedArray tintTypedArray0) {
        return this.q(tintTypedArray0, com.google.android.material.resources.d.b(this.getContext(), tintTypedArray0, styleable.NavigationView_itemShapeFillColor));
    }

    @NonNull
    private Drawable q(@NonNull TintTypedArray tintTypedArray0, @Nullable ColorStateList colorStateList0) {
        int v = tintTypedArray0.u(styleable.NavigationView_itemShapeAppearance, 0);
        int v1 = tintTypedArray0.u(styleable.NavigationView_itemShapeAppearanceOverlay, 0);
        k k0 = new k(p.b(this.getContext(), v, v1).m());
        k0.p0(colorStateList0);
        return new InsetDrawable(k0, tintTypedArray0.g(styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray0.g(styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray0.g(styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray0.g(styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    public View r(int v) {
        return this.i.s(v);
    }

    // 去混淆评级： 低(20)
    private boolean s(@NonNull TintTypedArray tintTypedArray0) {
        return tintTypedArray0.C(styleable.NavigationView_itemShapeAppearance) || tintTypedArray0.C(styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.p = z;
    }

    public void setCheckedItem(@IdRes int v) {
        MenuItem menuItem0 = this.h.findItem(v);
        if(menuItem0 != null) {
            this.i.H(((MenuItemImpl)menuItem0));
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        MenuItem menuItem1 = this.h.findItem(v);
        if(menuItem1 == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.i.H(((MenuItemImpl)menuItem1));
    }

    public void setDividerInsetEnd(@Px int v) {
        this.i.I(v);
    }

    public void setDividerInsetStart(@Px int v) {
        this.i.J(v);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        l.d(this, f);
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z) {
        this.t.h(this, z);
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.i.L(drawable0);
    }

    public void setItemBackgroundResource(@DrawableRes int v) {
        this.setItemBackground(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setItemHorizontalPadding(@Dimension int v) {
        this.i.N(v);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.i.N(v1);
    }

    public void setItemIconPadding(@Dimension int v) {
        this.i.O(v);
    }

    public void setItemIconPaddingResource(int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.i.O(v1);
    }

    public void setItemIconSize(@Dimension int v) {
        this.i.P(v);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList0) {
        this.i.Q(colorStateList0);
    }

    public void setItemMaxLines(int v) {
        this.i.R(v);
    }

    public void setItemTextAppearance(@StyleRes int v) {
        this.i.S(v);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.i.T(z);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.i.U(colorStateList0);
    }

    public void setItemVerticalPadding(@Px int v) {
        this.i.V(v);
    }

    public void setItemVerticalPaddingResource(@DimenRes int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.i.V(v1);
    }

    public void setNavigationItemSelectedListener(@Nullable d navigationView$d0) {
        this.j = navigationView$d0;
    }

    @Override  // android.view.View
    public void setOverScrollMode(int v) {
        super.setOverScrollMode(v);
        t t0 = this.i;
        if(t0 != null) {
            t0.W(v);
        }
    }

    public void setSubheaderInsetEnd(@Px int v) {
        this.i.Y(v);
    }

    public void setSubheaderInsetStart(@Px int v) {
        this.i.Z(v);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.o = z;
    }

    public View t(@LayoutRes int v) {
        return this.i.D(v);
    }

    public void u(int v) {
        this.i.b0(true);
        this.getMenuInflater().inflate(v, this.h);
        this.i.b0(false);
        this.i.f(false);
    }

    public boolean v() {
        return this.p;
    }

    public boolean w() {
        return this.o;
    }

    // 检测为 Lambda 实现
    private void x(Canvas canvas0) [...]

    private void y() {
        if(this.r && this.q != 0) {
            this.q = 0;
            this.z(this.getWidth(), this.getHeight());
        }
    }

    private void z(@Px int v, @Px int v1) {
        if(this.getParent() instanceof DrawerLayout && this.getLayoutParams() instanceof LayoutParams && (this.q > 0 || this.r) && this.getBackground() instanceof k) {
            boolean z = GravityCompat.d(((LayoutParams)this.getLayoutParams()).a, ViewCompat.e0(this)) == 3;
            k k0 = (k)this.getBackground();
            com.google.android.material.shape.p.b p$b0 = k0.getShapeAppearanceModel().v().o(((float)this.q));
            if(z) {
                p$b0.K(0.0f);
                p$b0.x(0.0f);
            }
            else {
                p$b0.P(0.0f);
                p$b0.C(0.0f);
            }
            p p0 = p$b0.m();
            k0.setShapeAppearanceModel(p0);
            this.t.g(this, p0);
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
            this.t.f(this, rectF0);
            this.t.i(this, true);
        }
    }
}

