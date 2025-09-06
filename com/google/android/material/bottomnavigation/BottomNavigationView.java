package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M.e;
import com.google.android.material.internal.M;
import com.google.android.material.navigation.NavigationBarView.c;
import com.google.android.material.navigation.NavigationBarView.d;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.f;

public class BottomNavigationView extends NavigationBarView {
    @Deprecated
    public interface b extends c {
    }

    @Deprecated
    public interface com.google.android.material.bottomnavigation.BottomNavigationView.c extends d {
    }

    private static final int l = 5;

    public BottomNavigationView(@NonNull Context context0) {
        this(context0, null);
    }

    public BottomNavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        TintTypedArray tintTypedArray0 = D.l(this.getContext(), attributeSet0, styleable.BottomNavigationView, v, v1, new int[0]);
        this.setItemHorizontalTranslationEnabled(tintTypedArray0.a(styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if(tintTypedArray0.C(styleable.BottomNavigationView_android_minHeight)) {
            this.setMinimumHeight(tintTypedArray0.g(0, 0));
        }
        boolean z = !tintTypedArray0.a(styleable.BottomNavigationView_compatShadowEnabled, true);
        tintTypedArray0.I();
        this.k();
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({Scope.b})
    protected f c(@NonNull Context context0) {
        return new com.google.android.material.bottomnavigation.b(context0);
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    private void j(@NonNull Context context0) {
        View view0 = new View(context0);
        view0.setBackgroundColor(ContextCompat.getColor(context0, color.design_bottom_navigation_shadow_color));
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, this.getResources().getDimensionPixelSize(dimen.design_bottom_navigation_shadow_height)));
        this.addView(view0);
    }

    private void k() {
        class a implements com.google.android.material.internal.M.d {
            final BottomNavigationView a;

            @Override  // com.google.android.material.internal.M$d
            @NonNull
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull e m$e0) {
                m$e0.d += windowInsetsCompat0.o();
                boolean z = ViewCompat.e0(view0) == 1;
                int v = windowInsetsCompat0.p();
                int v1 = windowInsetsCompat0.q();
                m$e0.a += (z ? v1 : v);
                int v2 = m$e0.c;
                if(!z) {
                    v = v1;
                }
                m$e0.c = v2 + v;
                m$e0.a(view0);
                return windowInsetsCompat0;
            }
        }

        M.h(this, new a(this));
    }

    public boolean l() {
        return ((com.google.android.material.bottomnavigation.b)this.getMenuView()).u();
    }

    private int m(int v) {
        int v1 = this.getSuggestedMinimumHeight();
        if(View.MeasureSpec.getMode(v) != 0x40000000 && v1 > 0) {
            int v2 = this.getPaddingTop();
            int v3 = this.getPaddingBottom();
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), v1 + (v2 + v3)), 0x40000000);
        }
        return v;
    }

    private boolean n() [...] // Inlined contents

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, this.m(v1));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        com.google.android.material.bottomnavigation.b b0 = (com.google.android.material.bottomnavigation.b)this.getMenuView();
        if(b0.u() != z) {
            b0.setItemHorizontalTranslationEnabled(z);
            this.getPresenter().f(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable b bottomNavigationView$b0) {
        this.setOnItemReselectedListener(bottomNavigationView$b0);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable com.google.android.material.bottomnavigation.BottomNavigationView.c bottomNavigationView$c0) {
        this.setOnItemSelectedListener(bottomNavigationView$c0);
    }
}

