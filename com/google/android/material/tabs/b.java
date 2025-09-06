package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

class b extends c {
    private static final float b = 0.5f;

    @Override  // com.google.android.material.tabs.c
    void d(TabLayout tabLayout0, View view0, View view1, float f, @NonNull Drawable drawable0) {
        int v = Float.compare(f, 0.5f);
        if(v >= 0) {
            view0 = view1;
        }
        RectF rectF0 = c.a(tabLayout0, view0);
        drawable0.setBounds(((int)rectF0.left), drawable0.getBounds().top, ((int)rectF0.right), drawable0.getBounds().bottom);
        drawable0.setAlpha(((int)((v >= 0 ? com.google.android.material.animation.b.b(0.0f, 1.0f, 0.5f, 1.0f, f) : com.google.android.material.animation.b.b(1.0f, 0.0f, 0.0f, 0.5f, f)) * 255.0f)));
    }
}

