package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class JQp extends cr {
    public JQp(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    private void PjT(List list0) {
        float f = XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)this.Zh.Owx()));
        double f1 = this.Zh.DWo();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationY", new float[]{0.0f, -f}).setDuration(((long)(((int)(f1 * 1000.0)) / 2)));
        objectAnimator0.setInterpolator(new LinearInterpolator());
        objectAnimator0.setRepeatMode(2);
        this.Zh.cz(this.Zh.qla() * 2);
        list0.add(this.PjT(objectAnimator0));
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        List list0 = new ArrayList();
        switch(this.Zh.RD()) {
            case "backwards": {
                this.Zh(list0);
                return list0;
            }
            case "both": {
                this.PjT(list0);
                return list0;
            }
            case "forwards": {
                this.cr(list0);
                return list0;
            }
            case "none": {
            }
        }
        this.ReZ(list0);
        return list0;
    }

    private void ReZ(List list0) {
        float[] arr_f = {0.0f, -XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)this.Zh.Owx()))};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationY", arr_f).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        objectAnimator0.setInterpolator(new BounceInterpolator());
        objectAnimator0.addListener(new Animator.AnimatorListener() {
            final JQp PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                JQp.this.ReZ.setTranslationY(0.0f);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        });
        list0.add(this.PjT(objectAnimator0));
    }

    private void Zh(List list0) {
        float[] arr_f = {0.0f, -XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)this.Zh.Owx()))};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationY", arr_f).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        objectAnimator0.setInterpolator(new BounceInterpolator());
        objectAnimator0.addListener(new Animator.AnimatorListener() {
            final JQp PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                JQp.this.ReZ.setTranslationY(0.0f);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        });
        list0.add(this.PjT(objectAnimator0));
    }

    private void cr(List list0) {
        float[] arr_f = {0.0f, -XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)this.Zh.Owx()))};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationY", arr_f).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        objectAnimator0.setInterpolator(new BounceInterpolator());
        list0.add(this.PjT(objectAnimator0));
    }
}

