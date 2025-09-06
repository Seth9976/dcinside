package com.google.android.material.internal;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class j implements ValueAnimator.AnimatorUpdateListener {
    @Nullable
    private final View a;
    @Nullable
    private final View b;
    private final float[] c;

    public j(@Nullable View view0, @Nullable View view1) {
        this.a = view0;
        this.b = view1;
        this.c = new float[2];
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
        k.a(((float)(((Float)valueAnimator0.getAnimatedValue()))), this.c);
        View view0 = this.a;
        if(view0 != null) {
            view0.setAlpha(this.c[0]);
        }
        View view1 = this.b;
        if(view1 != null) {
            view1.setAlpha(this.c[1]);
        }
    }
}

