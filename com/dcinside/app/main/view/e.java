package com.dcinside.app.main.view;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.l0.h;

public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final CrowdView a;
    public final f b;
    public final h c;

    public e(CrowdView crowdView0, f l0$f0, h l0$h0) {
        this.a = crowdView0;
        this.b = l0$f0;
        this.c = l0$h0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        CrowdView.M(this.a, this.b, this.c, valueAnimator0);
    }
}

