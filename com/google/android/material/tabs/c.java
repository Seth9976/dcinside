package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.b;
import com.google.android.material.internal.M;

class c {
    @Dimension(unit = 0)
    private static final int a = 24;

    static RectF a(TabLayout tabLayout0, @Nullable View view0) {
        if(view0 == null) {
            return new RectF();
        }
        return tabLayout0.H() || !(view0 instanceof n) ? new RectF(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom())) : c.b(((n)view0), 24);
    }

    static RectF b(@NonNull n tabLayout$n0, @Dimension(unit = 0) int v) {
        int v1 = tabLayout$n0.getContentWidth();
        int v2 = tabLayout$n0.getContentHeight();
        int v3 = (int)M.i(tabLayout$n0.getContext(), v);
        if(v1 < v3) {
            v1 = v3;
        }
        int v4 = (tabLayout$n0.getLeft() + tabLayout$n0.getRight()) / 2;
        int v5 = (tabLayout$n0.getTop() + tabLayout$n0.getBottom()) / 2;
        return new RectF(((float)(v4 - v1 / 2)), ((float)(v5 - v2 / 2)), ((float)(v1 / 2 + v4)), ((float)(v5 + v4 / 2)));
    }

    void c(TabLayout tabLayout0, View view0, @NonNull Drawable drawable0) {
        RectF rectF0 = c.a(tabLayout0, view0);
        drawable0.setBounds(((int)rectF0.left), drawable0.getBounds().top, ((int)rectF0.right), drawable0.getBounds().bottom);
    }

    void d(TabLayout tabLayout0, View view0, View view1, @FloatRange(from = 0.0, to = 1.0) float f, @NonNull Drawable drawable0) {
        RectF rectF0 = c.a(tabLayout0, view0);
        RectF rectF1 = c.a(tabLayout0, view1);
        drawable0.setBounds(b.c(((int)rectF0.left), ((int)rectF1.left), f), drawable0.getBounds().top, b.c(((int)rectF0.right), ((int)rectF1.right), f), drawable0.getBounds().bottom);
    }
}

