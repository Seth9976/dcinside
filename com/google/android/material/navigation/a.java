package com.google.android.material.navigation;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final DrawerLayout a;

    public a(DrawerLayout drawerLayout0) {
        this.a = drawerLayout0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        b.d(this.a, valueAnimator0);
    }
}

