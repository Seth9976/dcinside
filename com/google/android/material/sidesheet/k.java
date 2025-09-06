package com.google.android.material.sidesheet;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public final class k implements ValueAnimator.AnimatorUpdateListener {
    public final SideSheetBehavior a;
    public final ViewGroup.MarginLayoutParams b;
    public final int c;
    public final View d;

    public k(SideSheetBehavior sideSheetBehavior0, ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, View view0) {
        this.a = sideSheetBehavior0;
        this.b = viewGroup$MarginLayoutParams0;
        this.c = v;
        this.d = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.L0(this.b, this.c, this.d, valueAnimator0);
    }
}

