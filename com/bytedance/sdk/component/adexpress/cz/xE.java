package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.utils.Lrd;

public class xE extends FrameLayout {
    private boolean JQp;
    private Context PjT;
    private tT ReZ;
    private ImageView Zh;
    private AnimatorSet cr;
    private TextView cz;

    public xE(@NonNull Context context0) {
        super(context0);
        this.JQp = true;
        this.PjT = context0;
        this.cr = new AnimatorSet();
        this.ReZ();
        this.cr();
        this.post(new Runnable() {
            final xE PjT;

            @Override
            public void run() {
                int v = (int)XX.PjT(xE.this.PjT, 50.0f);
                int v1 = (int)XX.PjT(xE.this.PjT, 50.0f);
                if(xE.this.ReZ.getMeasuredHeight() > 0) {
                    v = xE.this.ReZ.getMeasuredHeight();
                }
                if(xE.this.ReZ.getMeasuredWidth() > 0) {
                    v1 = xE.this.ReZ.getMeasuredWidth();
                }
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)xE.this.Zh.getLayoutParams();
                frameLayout$LayoutParams0.topMargin = ((int)(((float)v) / 2.0f - XX.PjT(xE.this.getContext(), 5.0f))) + ((int)XX.PjT(xE.this.PjT, 40.0f));
                frameLayout$LayoutParams0.leftMargin = ((int)(((float)v1) / 2.0f - XX.PjT(xE.this.getContext(), 5.0f))) + ((int)XX.PjT(xE.this.PjT, 20.0f));
                frameLayout$LayoutParams0.bottomMargin = (int)(((float)(-v)) / 2.0f + XX.PjT(xE.this.getContext(), 5.0f));
                frameLayout$LayoutParams0.rightMargin = (int)(((float)(-v1)) / 2.0f + XX.PjT(xE.this.getContext(), 5.0f));
                frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.leftMargin);
                frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
                xE.this.Zh.setLayoutParams(frameLayout$LayoutParams0);
            }
        });
    }

    public void PjT() {
        this.cr.start();
    }

    private void ReZ() {
        this.ReZ = new tT(this.PjT);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 50.0f)), ((int)XX.PjT(this.PjT, 50.0f)));
        frameLayout$LayoutParams0.gravity = 0x800033;
        frameLayout$LayoutParams0.topMargin = (int)XX.PjT(this.PjT, 40.0f);
        int v = (int)XX.PjT(this.PjT, 20.0f);
        frameLayout$LayoutParams0.leftMargin = v;
        frameLayout$LayoutParams0.setMarginStart(v);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.addView(this.ReZ, frameLayout$LayoutParams0);
        this.Zh = new ImageView(this.PjT);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 78.0f)), ((int)XX.PjT(this.PjT, 78.0f)));
        this.Zh.setImageResource(Lrd.cr(this.PjT, "tt_splash_hand"));
        this.addView(this.Zh, frameLayout$LayoutParams1);
        TextView textView0 = new TextView(this.PjT);
        this.cz = textView0;
        textView0.setTextColor(-1);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams2.gravity = 81;
        frameLayout$LayoutParams2.bottomMargin = (int)XX.PjT(this.PjT, 10.0f);
        this.addView(this.cz, frameLayout$LayoutParams2);
        this.cz.setVisibility(8);
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
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.Zh, "scaleX", new float[]{1.0f, 1.0f, 1.0f, 0.9f});
        objectAnimator0.setDuration(600L);
        objectAnimator0.setRepeatMode(2);
        objectAnimator0.setRepeatCount(-1);
        objectAnimator0.addListener(new Animator.AnimatorListener() {
            final xE PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
                if(xE.this.JQp) {
                    xE.this.ReZ.PjT();
                }
                xE.this.JQp = !xE.this.JQp;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(xE.this.Zh, "alpha", new float[]{0.0f, 1.0f});
                objectAnimator0.setDuration(200L);
                objectAnimator0.setInterpolator(new LinearInterpolator());
                objectAnimator0.start();
                xE.this.Zh.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.Zh, "scaleY", new float[]{1.0f, 1.0f, 1.0f, 0.9f});
        objectAnimator1.setDuration(600L);
        objectAnimator1.setRepeatMode(2);
        objectAnimator1.setRepeatCount(-1);
        this.cr.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
    }

    public void setGuideText(String s) {
        this.cz.setVisibility(0);
        this.cz.setText(s);
    }

    public void setGuideTextColor(int v) {
        this.cz.setTextColor(v);
    }
}

