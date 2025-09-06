package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.utils.Lrd;

public class qla extends FrameLayout {
    private boolean JQp;
    private Context PjT;
    private tT ReZ;
    private ImageView Zh;
    private AnimatorSet cr;

    public qla(@NonNull Context context0) {
        super(context0);
        this.JQp = true;
        this.PjT = context0;
        this.cr = new AnimatorSet();
        this.ReZ();
        this.cr();
        this.post(new Runnable() {
            final qla PjT;

            @Override
            public void run() {
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)qla.this.Zh.getLayoutParams();
                frameLayout$LayoutParams0.topMargin = (int)(((float)qla.this.ReZ.getMeasuredHeight()) / 2.0f - XX.PjT(qla.this.getContext(), 5.0f));
                frameLayout$LayoutParams0.leftMargin = (int)(((float)qla.this.ReZ.getMeasuredWidth()) / 2.0f - XX.PjT(qla.this.getContext(), 5.0f));
                frameLayout$LayoutParams0.bottomMargin = (int)(((float)(-qla.this.ReZ.getMeasuredHeight())) / 2.0f + XX.PjT(qla.this.getContext(), 5.0f));
                frameLayout$LayoutParams0.rightMargin = (int)(((float)(-qla.this.ReZ.getMeasuredWidth())) / 2.0f + XX.PjT(qla.this.getContext(), 5.0f));
                frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.leftMargin);
                frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
                qla.this.Zh.setLayoutParams(frameLayout$LayoutParams0);
            }
        });
    }

    public void PjT() {
        this.cr.start();
    }

    private void ReZ() {
        this.ReZ = new tT(this.PjT);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 40.0f)), ((int)XX.PjT(this.PjT, 40.0f)));
        frameLayout$LayoutParams0.gravity = 0x800013;
        this.addView(this.ReZ, frameLayout$LayoutParams0);
        this.Zh = new ImageView(this.PjT);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 62.0f)), ((int)XX.PjT(this.PjT, 62.0f)));
        frameLayout$LayoutParams1.gravity = 16;
        this.Zh.setImageResource(Lrd.cr(this.PjT, "tt_splash_hand"));
        this.addView(this.Zh, frameLayout$LayoutParams1);
    }

    public void Zh() {
        AnimatorSet animatorSet0 = this.cr;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
        tT tT0 = this.ReZ;
        if(tT0 != null) {
            tT0.Zh();
        }
        ImageView imageView0 = this.Zh;
        if(imageView0 != null) {
            imageView0.clearAnimation();
        }
    }

    private void cr() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.Zh, "scaleX", new float[]{1.0f, 0.9f});
        objectAnimator0.setDuration(800L);
        objectAnimator0.setRepeatMode(2);
        objectAnimator0.setRepeatCount(-1);
        objectAnimator0.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimator0.addListener(new Animator.AnimatorListener() {
            final qla PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
                if(qla.this.JQp) {
                    qla.this.ReZ.PjT();
                }
                qla.this.JQp = !qla.this.JQp;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(qla.this.Zh, "alpha", new float[]{0.0f, 1.0f});
                objectAnimator0.setDuration(200L);
                objectAnimator0.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimator0.start();
                qla.this.Zh.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.Zh, "scaleY", new float[]{1.0f, 0.9f});
        objectAnimator1.setDuration(800L);
        objectAnimator1.setRepeatMode(2);
        objectAnimator1.setRepeatCount(-1);
        objectAnimator1.setInterpolator(new AccelerateDecelerateInterpolator());
        this.cr.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
    }
}

