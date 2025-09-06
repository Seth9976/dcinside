package com.google.android.material.appbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.shape.k;

public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final k d;
    public final Integer e;

    public b(AppBarLayout appBarLayout0, ColorStateList colorStateList0, ColorStateList colorStateList1, k k0, Integer integer0) {
        this.a = appBarLayout0;
        this.b = colorStateList0;
        this.c = colorStateList1;
        this.d = k0;
        this.e = integer0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.v(this.b, this.c, this.d, this.e, valueAnimator0);
    }
}

