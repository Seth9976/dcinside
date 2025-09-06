package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.b;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M.e;
import com.google.android.material.internal.M;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.f;
import com.google.android.material.resources.d;

public class NavigationRailView extends NavigationBarView {
    private final int l;
    @Nullable
    private View m;
    @Nullable
    private Boolean n;
    @Nullable
    private Boolean o;
    @Nullable
    private Boolean p;
    static final int q = 49;
    static final int r = 7;
    private static final int s = 49;
    static final int t = -1;

    public NavigationRailView(@NonNull Context context0) {
        this(context0, null);
    }

    public NavigationRailView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.n = null;
        this.o = null;
        this.p = null;
        this.l = this.getResources().getDimensionPixelSize(dimen.mtrl_navigation_rail_margin);
        Context context1 = this.getContext();
        TintTypedArray tintTypedArray0 = D.l(context1, attributeSet0, styleable.NavigationRailView, v, v1, new int[0]);
        int v2 = tintTypedArray0.u(styleable.NavigationRailView_headerLayout, 0);
        if(v2 != 0) {
            this.n(v2);
        }
        this.setMenuGravity(tintTypedArray0.o(styleable.NavigationRailView_menuGravity, 49));
        if(tintTypedArray0.C(styleable.NavigationRailView_itemMinHeight)) {
            this.setItemMinimumHeight(tintTypedArray0.g(1, -1));
        }
        if(tintTypedArray0.C(styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.n = Boolean.valueOf(tintTypedArray0.a(5, false));
        }
        if(tintTypedArray0.C(styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.o = Boolean.valueOf(tintTypedArray0.a(3, false));
        }
        if(tintTypedArray0.C(styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.p = Boolean.valueOf(tintTypedArray0.a(4, false));
        }
        int v3 = this.getResources().getDimensionPixelOffset(dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int v4 = this.getResources().getDimensionPixelOffset(dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float f = b.b(0.0f, 1.0f, 0.3f, 1.0f, d.f(context1) - 1.0f);
        int v5 = this.getItemPaddingTop();
        int v6 = this.getItemPaddingBottom();
        this.setItemPaddingTop(Math.round(b.c(v5, v3, f)));
        this.setItemPaddingBottom(Math.round(b.c(v6, v4, f)));
        tintTypedArray0.I();
        this.p();
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({Scope.b})
    protected f c(@NonNull Context context0) {
        return this.q(context0);
    }

    @Nullable
    public View getHeaderView() {
        return this.m;
    }

    public int getItemMinimumHeight() {
        return ((com.google.android.material.navigationrail.b)this.getMenuView()).getItemMinimumHeight();
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return this.getNavigationRailMenuView().getMenuGravity();
    }

    private com.google.android.material.navigationrail.b getNavigationRailMenuView() {
        return (com.google.android.material.navigationrail.b)this.getMenuView();
    }

    public void n(@LayoutRes int v) {
        this.o(LayoutInflater.from(this.getContext()).inflate(v, this, false));
    }

    public void o(@NonNull View view0) {
        this.t();
        this.m = view0;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 49;
        frameLayout$LayoutParams0.topMargin = this.l;
        this.addView(view0, 0, frameLayout$LayoutParams0);
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        com.google.android.material.navigationrail.b b0 = this.getNavigationRailMenuView();
        int v4 = 0;
        if(this.r()) {
            int v5 = this.m.getBottom() + this.l;
            int v6 = b0.getTop();
            if(v6 < v5) {
                v4 = v5 - v6;
            }
        }
        else if(b0.u()) {
            v4 = this.l;
        }
        if(v4 > 0) {
            b0.layout(b0.getLeft(), b0.getTop() + v4, b0.getRight(), b0.getBottom() + v4);
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        int v2 = this.s(v);
        super.onMeasure(v2, v1);
        if(this.r()) {
            this.measureChild(this.getNavigationRailMenuView(), v2, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.m.getMeasuredHeight() - this.l, 0x80000000));
        }
    }

    private void p() {
        class a implements com.google.android.material.internal.M.d {
            final NavigationRailView a;

            @Override  // com.google.android.material.internal.M$d
            @NonNull
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull e m$e0) {
                Insets insets0 = windowInsetsCompat0.f(0x207);
                if(NavigationRailView.this.u(NavigationRailView.this.n)) {
                    m$e0.b += insets0.b;
                }
                if(NavigationRailView.this.u(NavigationRailView.this.o)) {
                    m$e0.d += insets0.d;
                }
                if(NavigationRailView.this.u(NavigationRailView.this.p)) {
                    m$e0.a += (M.s(view0) ? insets0.c : insets0.a);
                }
                m$e0.a(view0);
                return windowInsetsCompat0;
            }
        }

        M.h(this, new a(this));
    }

    @NonNull
    @RestrictTo({Scope.b})
    protected com.google.android.material.navigationrail.b q(@NonNull Context context0) {
        return new com.google.android.material.navigationrail.b(context0);
    }

    private boolean r() {
        return this.m != null && this.m.getVisibility() != 8;
    }

    private int s(int v) {
        int v1 = this.getSuggestedMinimumWidth();
        if(View.MeasureSpec.getMode(v) != 0x40000000 && v1 > 0) {
            int v2 = this.getPaddingLeft();
            int v3 = this.getPaddingRight();
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), v1 + (v2 + v3)), 0x40000000);
        }
        return v;
    }

    public void setItemMinimumHeight(@Px int v) {
        ((com.google.android.material.navigationrail.b)this.getMenuView()).setItemMinimumHeight(v);
    }

    public void setMenuGravity(int v) {
        this.getNavigationRailMenuView().setMenuGravity(v);
    }

    public void t() {
        View view0 = this.m;
        if(view0 != null) {
            this.removeView(view0);
            this.m = null;
        }
    }

    private boolean u(Boolean boolean0) {
        return boolean0 == null ? ViewCompat.Y(this) : boolean0.booleanValue();
    }
}

