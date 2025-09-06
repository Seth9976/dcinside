package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;
import com.google.android.material.animation.b;
import com.google.android.material.internal.B;
import com.google.android.material.motion.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.util.HashSet;

@RestrictTo({Scope.b})
public abstract class f extends ViewGroup implements MenuView {
    private p A;
    private boolean B;
    private ColorStateList C;
    private NavigationBarPresenter D;
    private MenuBuilder E;
    private static final int F = 5;
    private static final int G = -1;
    private static final int[] H;
    private static final int[] I;
    @Nullable
    private final TransitionSet a;
    @NonNull
    private final View.OnClickListener b;
    private final Pool c;
    @NonNull
    private final SparseArray d;
    private int e;
    @Nullable
    private d[] f;
    private int g;
    private int h;
    @Nullable
    private ColorStateList i;
    @Dimension
    private int j;
    private ColorStateList k;
    @Nullable
    private final ColorStateList l;
    @StyleRes
    private int m;
    @StyleRes
    private int n;
    private boolean o;
    private Drawable p;
    @Nullable
    private ColorStateList q;
    private int r;
    @NonNull
    private final SparseArray s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    static {
        f.H = new int[]{0x10100A0};
        f.I = new int[]{0xFEFEFF62};
    }

    public f(@NonNull Context context0) {
        class a implements View.OnClickListener {
            final f a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                MenuItemImpl menuItemImpl0 = ((d)view0).getItemData();
                if(!f.this.E.Q(menuItemImpl0, f.this.D, 0)) {
                    menuItemImpl0.setChecked(true);
                }
            }
        }

        super(context0);
        this.c = new SynchronizedPool(5);
        this.d = new SparseArray(5);
        this.g = 0;
        this.h = 0;
        this.s = new SparseArray(5);
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.B = false;
        this.l = this.e(0x1010038);
        if(this.isInEditMode()) {
            this.a = null;
        }
        else {
            AutoTransition autoTransition0 = new AutoTransition();
            this.a = autoTransition0;
            autoTransition0.e1(0);
            Context context1 = this.getContext();
            int v = this.getResources().getInteger(integer.material_motion_duration_long_1);
            autoTransition0.c1(((long)j.f(context1, attr.motionDurationMedium4, v)));
            autoTransition0.d1(j.g(this.getContext(), attr.motionEasingStandard, b.b));
            autoTransition0.Q0(new B());
        }
        this.b = new a(this);
        ViewCompat.b2(this, 1);
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public void a(@NonNull MenuBuilder menuBuilder0) {
        this.E = menuBuilder0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
        this.removeAllViews();
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                d d0 = arr_d[v];
                if(d0 != null) {
                    this.c.a(d0);
                    d0.j();
                }
            }
        }
        if(this.E.size() == 0) {
            this.g = 0;
            this.h = 0;
            this.f = null;
            return;
        }
        this.o();
        this.f = new d[this.E.size()];
        boolean z = this.l(this.e, this.E.H().size());
        for(int v1 = 0; v1 < this.E.size(); ++v1) {
            this.D.n(true);
            this.E.getItem(v1).setCheckable(true);
            this.D.n(false);
            d d1 = this.getNewItem();
            this.f[v1] = d1;
            d1.setIconTintList(this.i);
            d1.setIconSize(this.j);
            d1.setTextColor(this.l);
            d1.setTextAppearanceInactive(this.m);
            d1.setTextAppearanceActive(this.n);
            d1.setTextAppearanceActiveBoldEnabled(this.o);
            d1.setTextColor(this.k);
            int v2 = this.t;
            if(v2 != -1) {
                d1.setItemPaddingTop(v2);
            }
            int v3 = this.u;
            if(v3 != -1) {
                d1.setItemPaddingBottom(v3);
            }
            int v4 = this.v;
            if(v4 != -1) {
                d1.setActiveIndicatorLabelPadding(v4);
            }
            d1.setActiveIndicatorWidth(this.x);
            d1.setActiveIndicatorHeight(this.y);
            d1.setActiveIndicatorMarginHorizontal(this.z);
            d1.setActiveIndicatorDrawable(this.f());
            d1.setActiveIndicatorResizeable(this.B);
            d1.setActiveIndicatorEnabled(this.w);
            Drawable drawable0 = this.p;
            if(drawable0 == null) {
                d1.setItemBackground(this.r);
            }
            else {
                d1.setItemBackground(drawable0);
            }
            d1.setItemRippleColor(this.q);
            d1.setShifting(z);
            d1.setLabelVisibilityMode(this.e);
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.E.getItem(v1);
            d1.f(menuItemImpl0, 0);
            d1.setItemPosition(v1);
            int v5 = menuItemImpl0.getItemId();
            d1.setOnTouchListener(((View.OnTouchListener)this.d.get(v5)));
            d1.setOnClickListener(this.b);
            if(this.g != 0 && v5 == this.g) {
                this.h = v1;
            }
            this.setBadgeIfNeeded(d1);
            this.addView(d1);
        }
        int v6 = Math.min(this.E.size() - 1, this.h);
        this.h = v6;
        this.E.getItem(v6).setChecked(true);
    }

    @Nullable
    public ColorStateList e(int v) {
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
        return new ColorStateList(new int[][]{f.I, f.H, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(f.I, v2), v1, v2});
    }

    @Nullable
    private Drawable f() {
        if(this.A != null && this.C != null) {
            Drawable drawable0 = new k(this.A);
            ((k)drawable0).p0(this.C);
            return drawable0;
        }
        return null;
    }

    @NonNull
    protected abstract d g(@NonNull Context arg1);

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.v;
    }

    SparseArray getBadgeDrawables() {
        return this.s;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.i;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.w;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.y;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.z;
    }

    @Nullable
    public p getItemActiveIndicatorShapeAppearance() {
        return this.A;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.x;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f == null || this.f.length <= 0 ? this.p : this.f[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.r;
    }

    @Dimension
    public int getItemIconSize() {
        return this.j;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.u;
    }

    @Px
    public int getItemPaddingTop() {
        return this.t;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.q;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.n;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.m;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.k;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    @Nullable
    protected MenuBuilder getMenu() {
        return this.E;
    }

    private d getNewItem() {
        d d0 = (d)this.c.b();
        return d0 == null ? this.g(this.getContext()) : d0;
    }

    public int getSelectedItemId() {
        return this.g;
    }

    protected int getSelectedItemPosition() {
        return this.h;
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Nullable
    public d h(int v) {
        this.t(v);
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                if(d0.getId() == v) {
                    return d0;
                }
            }
        }
        return null;
    }

    @Nullable
    public com.google.android.material.badge.a i(int v) {
        return (com.google.android.material.badge.a)this.s.get(v);
    }

    com.google.android.material.badge.a j(int v) {
        this.t(v);
        com.google.android.material.badge.a a0 = (com.google.android.material.badge.a)this.s.get(v);
        if(a0 == null) {
            a0 = com.google.android.material.badge.a.f(this.getContext());
            this.s.put(v, a0);
        }
        d d0 = this.h(v);
        if(d0 != null) {
            d0.setBadge(a0);
        }
        return a0;
    }

    protected boolean k() {
        return this.B;
    }

    protected boolean l(int v, int v1) {
        return v == -1 ? v1 > 3 : v == 0;
    }

    private boolean m(int v) {
        return v != -1;
    }

    void n(int v) {
        this.t(v);
        d d0 = this.h(v);
        if(d0 != null) {
            d0.r();
        }
        this.s.put(v, null);
    }

    private void o() {
        HashSet hashSet0 = new HashSet();
        for(int v1 = 0; v1 < this.E.size(); ++v1) {
            hashSet0.add(this.E.getItem(v1).getItemId());
        }
        for(int v = 0; v < this.s.size(); ++v) {
            int v2 = this.s.keyAt(v);
            if(!hashSet0.contains(v2)) {
                this.s.delete(v2);
            }
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0).m1(CollectionInfoCompat.h(1, this.E.H().size(), false, 1));
    }

    void p(SparseArray sparseArray0) {
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            if(this.s.indexOfKey(v2) < 0) {
                com.google.android.material.badge.a a0 = (com.google.android.material.badge.a)sparseArray0.get(v2);
                this.s.append(v2, a0);
            }
        }
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                d d0 = arr_d[v];
                int v3 = d0.getId();
                com.google.android.material.badge.a a1 = (com.google.android.material.badge.a)this.s.get(v3);
                if(a1 != null) {
                    d0.setBadge(a1);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void q(int v, @Nullable View.OnTouchListener view$OnTouchListener0) {
        if(view$OnTouchListener0 == null) {
            this.d.remove(v);
        }
        else {
            this.d.put(v, view$OnTouchListener0);
        }
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                if(d0.getItemData().getItemId() == v) {
                    d0.setOnTouchListener(view$OnTouchListener0);
                }
            }
        }
    }

    void r(int v) {
        int v1 = this.E.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = this.E.getItem(v2);
            if(v == menuItem0.getItemId()) {
                this.g = v;
                this.h = v2;
                menuItem0.setChecked(true);
                return;
            }
        }
    }

    public void s() {
        MenuBuilder menuBuilder0 = this.E;
        if(menuBuilder0 != null && this.f != null) {
            int v = menuBuilder0.size();
            if(v != this.f.length) {
                this.d();
                return;
            }
            int v1 = this.g;
            for(int v2 = 0; v2 < v; ++v2) {
                MenuItem menuItem0 = this.E.getItem(v2);
                if(menuItem0.isChecked()) {
                    this.g = menuItem0.getItemId();
                    this.h = v2;
                }
            }
            if(v1 != this.g) {
                TransitionSet transitionSet0 = this.a;
                if(transitionSet0 != null) {
                    TransitionManager.b(this, transitionSet0);
                }
            }
            boolean z = this.l(this.e, this.E.H().size());
            for(int v3 = 0; v3 < v; ++v3) {
                this.D.n(true);
                this.f[v3].setLabelVisibilityMode(this.e);
                this.f[v3].setShifting(z);
                this.f[v3].f(((MenuItemImpl)this.E.getItem(v3)), 0);
                this.D.n(false);
            }
        }
    }

    public void setActiveIndicatorLabelPadding(@Px int v) {
        this.v = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorLabelPadding(v);
            }
        }
    }

    private void setBadgeIfNeeded(@NonNull d d0) {
        int v = d0.getId();
        if(!this.m(v)) {
            return;
        }
        com.google.android.material.badge.a a0 = (com.google.android.material.badge.a)this.s.get(v);
        if(a0 != null) {
            d0.setBadge(a0);
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.i = colorStateList0;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setIconTintList(colorStateList0);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList0) {
        this.C = colorStateList0;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorDrawable(this.f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.w = z;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int v) {
        this.y = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorHeight(v);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int v) {
        this.z = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorMarginHorizontal(v);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
        this.B = z;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable p p0) {
        this.A = p0;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorDrawable(this.f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int v) {
        this.x = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorWidth(v);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.p = drawable0;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setItemBackground(drawable0);
            }
        }
    }

    public void setItemBackgroundRes(int v) {
        this.r = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setItemBackground(v);
            }
        }
    }

    public void setItemIconSize(@Dimension int v) {
        this.j = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setIconSize(v);
            }
        }
    }

    public void setItemPaddingBottom(@Px int v) {
        this.u = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setItemPaddingBottom(v);
            }
        }
    }

    public void setItemPaddingTop(@Px int v) {
        this.t = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setItemPaddingTop(v);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList0) {
        this.q = colorStateList0;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setItemRippleColor(colorStateList0);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int v) {
        this.n = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                d0.setTextAppearanceActive(v);
                ColorStateList colorStateList0 = this.k;
                if(colorStateList0 != null) {
                    d0.setTextColor(colorStateList0);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.o = z;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int v) {
        this.m = v;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                d0.setTextAppearanceInactive(v);
                ColorStateList colorStateList0 = this.k;
                if(colorStateList0 != null) {
                    d0.setTextColor(colorStateList0);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.k = colorStateList0;
        d[] arr_d = this.f;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setTextColor(colorStateList0);
            }
        }
    }

    public void setLabelVisibilityMode(int v) {
        this.e = v;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter0) {
        this.D = navigationBarPresenter0;
    }

    private void t(int v) {
        if(!this.m(v)) {
            throw new IllegalArgumentException(v + " is not a valid view id");
        }
    }
}

