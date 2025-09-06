package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    final Rect d;
    final Rect e;
    private int f;
    private int g;

    public HeaderScrollingViewBehavior() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public HeaderScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    @Override  // com.google.android.material.appbar.ViewOffsetBehavior
    protected void R(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        View view1 = this.W(coordinatorLayout0.w(view0));
        if(view1 != null) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Rect rect0 = this.d;
            rect0.set(coordinatorLayout0.getPaddingLeft() + coordinatorLayout$LayoutParams0.leftMargin, view1.getBottom() + coordinatorLayout$LayoutParams0.topMargin, coordinatorLayout0.getWidth() - coordinatorLayout0.getPaddingRight() - coordinatorLayout$LayoutParams0.rightMargin, coordinatorLayout0.getHeight() + view1.getBottom() - coordinatorLayout0.getPaddingBottom() - coordinatorLayout$LayoutParams0.bottomMargin);
            WindowInsetsCompat windowInsetsCompat0 = coordinatorLayout0.getLastWindowInsets();
            if(windowInsetsCompat0 != null && ViewCompat.Y(coordinatorLayout0) && !ViewCompat.Y(view0)) {
                rect0.left += windowInsetsCompat0.p();
                rect0.right -= windowInsetsCompat0.q();
            }
            GravityCompat.b(HeaderScrollingViewBehavior.c0(coordinatorLayout$LayoutParams0.c), view0.getMeasuredWidth(), view0.getMeasuredHeight(), rect0, this.e, v);
            int v1 = this.X(view1);
            view0.layout(this.e.left, this.e.top - v1, this.e.right, this.e.bottom - v1);
            this.f = this.e.top - view1.getBottom();
            return;
        }
        super.R(coordinatorLayout0, view0, v);
        this.f = 0;
    }

    @Nullable
    abstract View W(List arg1);

    final int X(View view0) {
        return this.g == 0 ? 0 : MathUtils.e(((int)(this.Y(view0) * ((float)this.g))), 0, this.g);
    }

    float Y(View view0) {
        return 1.0f;
    }

    public final int Z() {
        return this.g;
    }

    int a0(@NonNull View view0) {
        return view0.getMeasuredHeight();
    }

    final int b0() {
        return this.f;
    }

    private static int c0(int v) {
        return v == 0 ? 0x800033 : v;
    }

    public final void d0(int v) {
        this.g = v;
    }

    protected boolean e0() {
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
        int v4 = view0.getLayoutParams().height;
        if(v4 == -2 || v4 == -1) {
            View view1 = this.W(coordinatorLayout0.w(view0));
            if(view1 != null) {
                int v5 = View.MeasureSpec.getSize(v2);
                if(v5 <= 0) {
                    v5 = coordinatorLayout0.getHeight();
                }
                else if(ViewCompat.Y(view1)) {
                    WindowInsetsCompat windowInsetsCompat0 = coordinatorLayout0.getLastWindowInsets();
                    if(windowInsetsCompat0 != null) {
                        v5 += windowInsetsCompat0.r() + windowInsetsCompat0.o();
                    }
                }
                int v6 = v5 + this.a0(view1);
                int v7 = view1.getMeasuredHeight();
                if(this.e0()) {
                    view0.setTranslationY(((float)(-v7)));
                }
                else {
                    view0.setTranslationY(0.0f);
                    v6 -= v7;
                }
                coordinatorLayout0.O(view0, v, v1, View.MeasureSpec.makeMeasureSpec(v6, (v4 == -1 ? 0x40000000 : 0x80000000)), v3);
                return true;
            }
        }
        return false;
    }
}

