package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class cr implements wN {
    public class PjT implements Runnable {
        ObjectAnimator PjT;
        final cr ReZ;
        ScheduledFuture Zh;

        PjT(ObjectAnimator objectAnimator0) {
            this.PjT = objectAnimator0;
        }

        public void PjT(ScheduledFuture scheduledFuture0) {
            this.Zh = scheduledFuture0;
        }

        @Override
        public void run() {
            if(com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ() != null) {
                com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().ReZ().ReZ().post(new Runnable() {
                    final PjT PjT;

                    @Override
                    public void run() {
                        PjT.this.PjT.resume();
                    }
                });
                if(this.Zh != null) {
                    cr.this.cr.remove(this.Zh);
                }
            }
        }
    }

    public List PjT;
    public View ReZ;
    com.bytedance.sdk.component.adexpress.dynamic.cr.PjT Zh;
    private Set cr;

    public cr(View view0, com.bytedance.sdk.component.adexpress.dynamic.cr.PjT pjT0) {
        this.ReZ = view0;
        this.Zh = pjT0;
        this.cr = new HashSet();
        this.PjT = this.PjT();
    }

    ObjectAnimator PjT(ObjectAnimator objectAnimator0) {
        objectAnimator0.setStartDelay(((long)(this.Zh.fDm() * 1000.0)));
        if(this.Zh.qla() > 0) {
            objectAnimator0.setRepeatCount(this.Zh.qla() - 1);
        }
        else {
            objectAnimator0.setRepeatCount(-1);
        }
        if(!"normal".equals(this.Zh.xE())) {
            if("alternate".equals(this.Zh.xE()) || "alternate-reverse".equals(this.Zh.xE())) {
                objectAnimator0.setRepeatMode(2);
            }
            else {
                objectAnimator0.setRepeatMode(1);
            }
        }
        if("ease-in-out".equals(this.Zh.xs())) {
            objectAnimator0.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        else if("ease-in".equals(this.Zh.xE())) {
            objectAnimator0.setInterpolator(new AccelerateInterpolator());
        }
        else if("ease-out".equals(this.Zh.xE())) {
            objectAnimator0.setInterpolator(new DecelerateInterpolator());
        }
        else {
            objectAnimator0.setInterpolator(new LinearInterpolator());
        }
        objectAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final cr Zh;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                if(valueAnimator0.getCurrentPlayTime() > 0L) {
                    cr.this.ReZ.setVisibility(0);
                    if(cr.this.ReZ.getParent() instanceof cz) {
                        ((View)cr.this.ReZ.getParent()).setVisibility(0);
                    }
                    objectAnimator0.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator0;
    }

    abstract List PjT();

    public void ReZ() {
        List list0 = this.PjT;
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ObjectAnimator objectAnimator0 = (ObjectAnimator)object0;
            objectAnimator0.start();
            if(this.Zh.ub() > 0.0) {
                objectAnimator0.addListener(new Animator.AnimatorListener() {
                    final cr Zh;

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationCancel(Animator animator0) {
                    }

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationEnd(Animator animator0) {
                    }

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationRepeat(Animator animator0) {
                        objectAnimator0.pause();
                        PjT cr$PjT0 = new PjT(cr.this, objectAnimator0);
                        ScheduledFuture scheduledFuture0 = com.bytedance.sdk.component.adexpress.cr.cr.PjT(cr$PjT0, ((long)(cr.this.Zh.ub() * 1000.0)), TimeUnit.MILLISECONDS);
                        cr$PjT0.PjT(scheduledFuture0);
                        cr.this.cr.add(scheduledFuture0);
                    }

                    @Override  // android.animation.Animator$AnimatorListener
                    public void onAnimationStart(Animator animator0) {
                    }
                });
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void Zh() {
        List list0 = this.PjT;
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ((ObjectAnimator)object0).cancel();
            ((ObjectAnimator)object0).removeAllUpdateListeners();
        }
        for(Object object1: this.cr) {
            ((ScheduledFuture)object1).cancel(true);
        }
    }
}

