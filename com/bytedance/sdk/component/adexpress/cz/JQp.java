package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.utils.Lrd;

public class JQp extends FrameLayout {
    private ImageView PjT;
    private AnimatorSet Zh;

    public JQp(Context context0) {
        super(context0);
        this.ReZ();
        this.cr();
    }

    public void PjT() {
        AnimatorSet animatorSet0 = this.Zh;
        if(animatorSet0 != null) {
            animatorSet0.start();
        }
    }

    private void ReZ() {
        ImageView imageView0 = new ImageView(this.getContext());
        this.PjT = imageView0;
        imageView0.setImageResource(Lrd.cr(this.getContext(), "tt_white_hand"));
        int v = (int)XX.PjT(this.getContext(), 20.0f);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v);
        frameLayout$LayoutParams0.gravity = 17;
        this.addView(this.PjT, frameLayout$LayoutParams0);
    }

    public void Zh() {
        AnimatorSet animatorSet0 = this.Zh;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
    }

    private void cr() {
        this.Zh = new AnimatorSet();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.PjT, "scaleX", new float[]{1.0f, 1.5f, 1.0f, 1.0f, 1.0f});
        objectAnimator0.setDuration(2000L);
        objectAnimator0.setRepeatMode(2);
        objectAnimator0.setRepeatCount(-1);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.PjT, "scaleY", new float[]{1.0f, 1.5f, 1.0f, 1.0f, 1.0f});
        objectAnimator1.setDuration(2000L);
        objectAnimator1.setRepeatMode(2);
        objectAnimator1.setRepeatCount(-1);
        this.Zh.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
    }
}

