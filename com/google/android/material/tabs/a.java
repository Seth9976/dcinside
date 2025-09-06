package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.animation.b;

class a extends c {
    @Override  // com.google.android.material.tabs.c
    void d(TabLayout tabLayout0, View view0, View view1, float f, @NonNull Drawable drawable0) {
        float f2;
        float f1;
        RectF rectF0 = c.a(tabLayout0, view0);
        RectF rectF1 = c.a(tabLayout0, view1);
        if(rectF0.left < rectF1.left) {
            f1 = a.e(f);
            f2 = a.f(f);
        }
        else {
            f1 = a.f(f);
            f2 = a.e(f);
        }
        drawable0.setBounds(b.c(((int)rectF0.left), ((int)rectF1.left), f1), drawable0.getBounds().top, b.c(((int)rectF0.right), ((int)rectF1.right), f2), drawable0.getBounds().bottom);
    }

    private static float e(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (float)(1.0 - Math.cos(((double)f) * 3.141593 / 2.0));
    }

    private static float f(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (float)Math.sin(((double)f) * 3.141593 / 2.0);
    }
}

