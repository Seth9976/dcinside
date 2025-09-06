package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class NavigationBarView extends FrameLayout {
    static class SavedState extends AbsSavedState {
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
        Bundle c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            this.c(parcel0, classLoader0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void c(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            this.c = parcel0.readBundle(classLoader0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeBundle(this.c);
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a(@NonNull MenuItem arg1);
    }

    public interface d {
        boolean a(@NonNull MenuItem arg1);
    }

    @NonNull
    private final e a;
    @NonNull
    private final f b;
    @NonNull
    private final NavigationBarPresenter c;
    private MenuInflater d;
    private d e;
    private c f;
    public static final int g = -1;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    private static final int k = 1;

    public NavigationBarView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        class com.google.android.material.navigation.NavigationBarView.a implements Callback {
            final NavigationBarView a;

            @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
            public boolean a(MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
                if(NavigationBarView.this.f != null && menuItem0.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                    NavigationBarView.this.f.a(menuItem0);
                    return true;
                }
                return NavigationBarView.this.e != null && !NavigationBarView.this.e.a(menuItem0);
            }

            @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
            public void b(MenuBuilder menuBuilder0) {
            }
        }

        super(I1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        NavigationBarPresenter navigationBarPresenter0 = new NavigationBarPresenter();
        this.c = navigationBarPresenter0;
        Context context1 = this.getContext();
        TintTypedArray tintTypedArray0 = D.l(context1, attributeSet0, styleable.NavigationBarView, v, v1, new int[]{styleable.NavigationBarView_itemTextAppearanceInactive, styleable.NavigationBarView_itemTextAppearanceActive});
        e e0 = new e(context1, this.getClass(), this.getMaxItemCount());
        this.a = e0;
        f f0 = this.c(context1);
        this.b = f0;
        navigationBarPresenter0.j(f0);
        navigationBarPresenter0.b(1);
        f0.setPresenter(navigationBarPresenter0);
        e0.b(navigationBarPresenter0);
        navigationBarPresenter0.i(this.getContext(), e0);
        if(tintTypedArray0.C(styleable.NavigationBarView_itemIconTint)) {
            f0.setIconTintList(tintTypedArray0.d(6));
        }
        else {
            f0.setIconTintList(f0.e(0x1010038));
        }
        int v2 = this.getResources().getDimensionPixelSize(dimen.mtrl_navigation_bar_item_default_icon_size);
        this.setItemIconSize(tintTypedArray0.g(styleable.NavigationBarView_itemIconSize, v2));
        if(tintTypedArray0.C(12)) {
            this.setItemTextAppearanceInactive(tintTypedArray0.u(12, 0));
        }
        if(tintTypedArray0.C(10)) {
            this.setItemTextAppearanceActive(tintTypedArray0.u(10, 0));
        }
        this.setItemTextAppearanceActiveBoldEnabled(tintTypedArray0.a(styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if(tintTypedArray0.C(styleable.NavigationBarView_itemTextColor)) {
            this.setItemTextColor(tintTypedArray0.d(13));
        }
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = com.google.android.material.drawable.f.g(drawable0);
        if(drawable0 == null || colorStateList0 != null) {
            k k0 = new k(p.e(context1, attributeSet0, v, v1).m());
            if(colorStateList0 != null) {
                k0.p0(colorStateList0);
            }
            k0.a0(context1);
            ViewCompat.R1(this, k0);
        }
        if(tintTypedArray0.C(styleable.NavigationBarView_itemPaddingTop)) {
            this.setItemPaddingTop(tintTypedArray0.g(8, 0));
        }
        if(tintTypedArray0.C(styleable.NavigationBarView_itemPaddingBottom)) {
            this.setItemPaddingBottom(tintTypedArray0.g(7, 0));
        }
        if(tintTypedArray0.C(styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            this.setActiveIndicatorLabelPadding(tintTypedArray0.g(0, 0));
        }
        if(tintTypedArray0.C(styleable.NavigationBarView_elevation)) {
            this.setElevation(((float)tintTypedArray0.g(2, 0)));
        }
        ColorStateList colorStateList1 = com.google.android.material.resources.d.b(context1, tintTypedArray0, styleable.NavigationBarView_backgroundTint);
        DrawableCompat.o(this.getBackground().mutate(), colorStateList1);
        this.setLabelVisibilityMode(tintTypedArray0.p(styleable.NavigationBarView_labelVisibilityMode, -1));
        int v3 = tintTypedArray0.u(styleable.NavigationBarView_itemBackground, 0);
        if(v3 == 0) {
            this.setItemRippleColor(com.google.android.material.resources.d.b(context1, tintTypedArray0, styleable.NavigationBarView_itemRippleColor));
        }
        else {
            f0.setItemBackgroundRes(v3);
        }
        int v4 = tintTypedArray0.u(styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if(v4 != 0) {
            this.setItemActiveIndicatorEnabled(true);
            TypedArray typedArray0 = context1.obtainStyledAttributes(v4, styleable.NavigationBarActiveIndicator);
            this.setItemActiveIndicatorWidth(typedArray0.getDimensionPixelSize(styleable.NavigationBarActiveIndicator_android_width, 0));
            this.setItemActiveIndicatorHeight(typedArray0.getDimensionPixelSize(styleable.NavigationBarActiveIndicator_android_height, 0));
            this.setItemActiveIndicatorMarginHorizontal(typedArray0.getDimensionPixelOffset(styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            this.setItemActiveIndicatorColor(com.google.android.material.resources.d.a(context1, typedArray0, styleable.NavigationBarActiveIndicator_android_color));
            this.setItemActiveIndicatorShapeAppearance(p.b(context1, typedArray0.getResourceId(styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m());
            typedArray0.recycle();
        }
        if(tintTypedArray0.C(styleable.NavigationBarView_menu)) {
            this.f(tintTypedArray0.u(15, 0));
        }
        tintTypedArray0.I();
        this.addView(f0);
        e0.Y(new com.google.android.material.navigation.NavigationBarView.a(this));
    }

    @NonNull
    @RestrictTo({Scope.b})
    protected abstract f c(@NonNull Context arg1);

    @Nullable
    public com.google.android.material.badge.a d(int v) {
        return this.b.i(v);
    }

    @NonNull
    public com.google.android.material.badge.a e(int v) {
        return this.b.j(v);
    }

    public void f(int v) {
        this.c.n(true);
        this.getMenuInflater().inflate(v, this.a);
        this.c.n(false);
        this.c.f(true);
    }

    public boolean g() {
        return this.b.getItemActiveIndicatorEnabled();
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.b.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.b.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.b.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.b.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public p getItemActiveIndicatorShapeAppearance() {
        return this.b.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.b.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.b.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.b.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.b.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.b.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.b.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.b.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.b.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.b.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.b.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.a;
    }

    private MenuInflater getMenuInflater() {
        if(this.d == null) {
            this.d = new SupportMenuInflater(this.getContext());
        }
        return this.d;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public MenuView getMenuView() {
        return this.b;
    }

    @NonNull
    @RestrictTo({Scope.b})
    public NavigationBarPresenter getPresenter() {
        return this.c;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.b.getSelectedItemId();
    }

    public void h(int v) {
        this.b.n(v);
    }

    public void i(int v, @Nullable View.OnTouchListener view$OnTouchListener0) {
        this.b.q(v, view$OnTouchListener0);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.a.V(((SavedState)parcelable0).c);
    }

    @Override  // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        Bundle bundle0 = new Bundle();
        parcelable0.c = bundle0;
        this.a.X(bundle0);
        return parcelable0;
    }

    public void setActiveIndicatorLabelPadding(@Px int v) {
        this.b.setActiveIndicatorLabelPadding(v);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        l.d(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList0) {
        this.b.setItemActiveIndicatorColor(colorStateList0);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int v) {
        this.b.setItemActiveIndicatorHeight(v);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int v) {
        this.b.setItemActiveIndicatorMarginHorizontal(v);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable p p0) {
        this.b.setItemActiveIndicatorShapeAppearance(p0);
    }

    public void setItemActiveIndicatorWidth(@Px int v) {
        this.b.setItemActiveIndicatorWidth(v);
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.b.setItemBackground(drawable0);
    }

    public void setItemBackgroundResource(@DrawableRes int v) {
        this.b.setItemBackgroundRes(v);
    }

    public void setItemIconSize(@Dimension int v) {
        this.b.setItemIconSize(v);
    }

    public void setItemIconSizeRes(@DimenRes int v) {
        this.setItemIconSize(this.getResources().getDimensionPixelSize(v));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList0) {
        this.b.setIconTintList(colorStateList0);
    }

    public void setItemPaddingBottom(@Px int v) {
        this.b.setItemPaddingBottom(v);
    }

    public void setItemPaddingTop(@Px int v) {
        this.b.setItemPaddingTop(v);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList0) {
        this.b.setItemRippleColor(colorStateList0);
    }

    public void setItemTextAppearanceActive(@StyleRes int v) {
        this.b.setItemTextAppearanceActive(v);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.b.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(@StyleRes int v) {
        this.b.setItemTextAppearanceInactive(v);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.b.setItemTextColor(colorStateList0);
    }

    public void setLabelVisibilityMode(int v) {
        if(this.b.getLabelVisibilityMode() != v) {
            this.b.setLabelVisibilityMode(v);
            this.c.f(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable c navigationBarView$c0) {
        this.f = navigationBarView$c0;
    }

    public void setOnItemSelectedListener(@Nullable d navigationBarView$d0) {
        this.e = navigationBarView$d0;
    }

    public void setSelectedItemId(@IdRes int v) {
        MenuItem menuItem0 = this.a.findItem(v);
        if(menuItem0 != null && !this.a.Q(menuItem0, this.c, 0)) {
            menuItem0.setChecked(true);
        }
    }
}

