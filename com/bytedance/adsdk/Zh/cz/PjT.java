package com.bytedance.adsdk.Zh.cz;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class PjT extends ValueAnimator {
    private final Set PjT;
    private final Set ReZ;
    private final Set Zh;

    public PjT() {
        this.PjT = new CopyOnWriteArraySet();
        this.Zh = new CopyOnWriteArraySet();
        this.ReZ = new CopyOnWriteArraySet();
    }

    void JQp() {
        for(Object object0: this.ReZ) {
            ((Animator.AnimatorPauseListener)object0).onAnimationResume(this);
        }
    }

    void PjT() {
        for(Object object0: this.Zh) {
            ((Animator.AnimatorListener)object0).onAnimationRepeat(this);
        }
    }

    void PjT(boolean z) {
        for(Object object0: this.Zh) {
            Animator.AnimatorListener animator$AnimatorListener0 = (Animator.AnimatorListener)object0;
            if(Build.VERSION.SDK_INT >= 26) {
                animator$AnimatorListener0.onAnimationStart(this, z);
            }
            else {
                animator$AnimatorListener0.onAnimationStart(this);
            }
        }
    }

    void ReZ() {
        for(Object object0: this.PjT) {
            ((ValueAnimator.AnimatorUpdateListener)object0).onAnimationUpdate(this);
        }
    }

    void Zh() {
        for(Object object0: this.Zh) {
            ((Animator.AnimatorListener)object0).onAnimationCancel(this);
        }
    }

    void Zh(boolean z) {
        for(Object object0: this.Zh) {
            Animator.AnimatorListener animator$AnimatorListener0 = (Animator.AnimatorListener)object0;
            if(Build.VERSION.SDK_INT >= 26) {
                animator$AnimatorListener0.onAnimationEnd(this, z);
            }
            else {
                animator$AnimatorListener0.onAnimationEnd(this);
            }
        }
    }

    @Override  // android.animation.Animator
    public void addListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.Zh.add(animator$AnimatorListener0);
    }

    @Override  // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animator$AnimatorPauseListener0) {
        this.ReZ.add(animator$AnimatorPauseListener0);
    }

    @Override  // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.PjT.add(valueAnimator$AnimatorUpdateListener0);
    }

    void cr() {
        for(Object object0: this.ReZ) {
            ((Animator.AnimatorPauseListener)object0).onAnimationPause(this);
        }
    }

    @Override  // android.animation.ValueAnimator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override  // android.animation.Animator
    public void removeAllListeners() {
        this.Zh.clear();
    }

    @Override  // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.PjT.clear();
    }

    @Override  // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.Zh.remove(animator$AnimatorListener0);
    }

    @Override  // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animator$AnimatorPauseListener0) {
        this.ReZ.remove(animator$AnimatorPauseListener0);
    }

    @Override  // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.PjT.remove(valueAnimator$AnimatorUpdateListener0);
    }

    @Override  // android.animation.ValueAnimator
    public Animator setDuration(long v) {
        return this.setDuration(v);
    }

    @Override  // android.animation.ValueAnimator
    public ValueAnimator setDuration(long v) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override  // android.animation.ValueAnimator
    public void setInterpolator(TimeInterpolator timeInterpolator0) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override  // android.animation.ValueAnimator
    public void setStartDelay(long v) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}

