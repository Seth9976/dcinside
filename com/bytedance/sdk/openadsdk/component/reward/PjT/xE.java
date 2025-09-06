package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.widget.Au;
import com.bytedance.sdk.openadsdk.core.widget.XX;

public class xE {
    private final PjT JQp;
    Au PjT;
    private final Context ReZ;
    private AnimatorSet XX;
    private final Owx Zh;
    private final int cr;
    private XX cz;

    public xE(PjT pjT0) {
        this.ReZ = pjT0.IJ;
        this.Zh = pjT0.Zh;
        this.cr = pjT0.cI;
        this.JQp = pjT0;
    }

    public void PjT() {
        try {
            if(cRA.ReZ(this.Zh)) {
                return;
            }
            XX xX0 = new XX(this.ReZ);
            this.cz = xX0;
            this.PjT = xX0.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.JQp.Au au0 = this.cz.getDownloadButton();
            if(au0 != null) {
                au0.setOnClickListener(this.JQp.Yo.JQp());
            }
            this.cz.PjT(this.Zh, this.cr);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void ReZ() {
        AnimatorSet animatorSet0 = this.XX;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
    }

    public void Zh() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{1, 80});
        valueAnimator0.setDuration(2000L);
        valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final xE PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                Au au0 = xE.this.PjT;
                if(au0 != null) {
                    au0.setProgress(v);
                }
            }
        });
        ValueAnimator valueAnimator1 = ValueAnimator.ofInt(new int[]{81, 99});
        valueAnimator1.setDuration(3000L);
        valueAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final xE PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                Au au0 = xE.this.PjT;
                if(au0 != null) {
                    au0.setProgress(v);
                }
            }
        });
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.XX = animatorSet0;
        animatorSet0.play(valueAnimator0).before(valueAnimator1);
        this.XX.start();
    }

    public View cr() {
        return this.cz;
    }
}

