package com.dcinside.app.write;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final PostWriteActivity a;

    public m0(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        PostWriteActivity.p6(this.a, valueAnimator0);
    }
}

