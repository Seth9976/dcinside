package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.utils.Lrd;

public class RD extends FrameLayout {
    private AnimatorSet Au;
    private TextView JQp;
    private Context PjT;
    private ImageView ReZ;
    private AnimatorSet SM;
    private AnimatorSet XX;
    private ImageView Zh;
    private ImageView cr;
    private AnimatorSet cz;

    public RD(@NonNull Context context0) {
        super(context0);
        this.cz = new AnimatorSet();
        this.XX = new AnimatorSet();
        this.Au = new AnimatorSet();
        this.SM = new AnimatorSet();
        this.PjT = context0;
        this.ReZ();
    }

    public void PjT() {
        this.cr();
        this.cz.start();
        this.cz.addListener(new AnimatorListenerAdapter() {
            final RD PjT;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                com.bytedance.sdk.component.adexpress.cz.RD.3.1 rD$3$10 = new Runnable() {
                    final com.bytedance.sdk.component.adexpress.cz.RD.3 PjT;

                    @Override
                    public void run() {
                        RD.this.cz.start();
                    }
                };
                RD.this.postDelayed(rD$3$10, 200L);
            }
        });
    }

    private void ReZ() {
        ImageView imageView0 = new ImageView(this.PjT);
        this.cr = imageView0;
        imageView0.setBackgroundResource(Lrd.cr(this.PjT, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(0, -2);
        frameLayout$LayoutParams0.gravity = 0x30;
        frameLayout$LayoutParams0.leftMargin = (int)XX.PjT(this.PjT, 30.0f);
        this.addView(this.cr, frameLayout$LayoutParams0);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        ImageView imageView1 = new ImageView(this.PjT);
        this.ReZ = imageView1;
        imageView1.setImageResource(Lrd.cr(this.PjT, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 50.0f)), ((int)XX.PjT(this.PjT, 50.0f)));
        frameLayout$LayoutParams1.gravity = 0x30;
        frameLayout$LayoutParams1.leftMargin = (int)XX.PjT(this.PjT, 30.0f);
        this.addView(this.ReZ, frameLayout$LayoutParams1);
        ImageView imageView2 = new ImageView(this.PjT);
        this.Zh = imageView2;
        imageView2.setImageResource(Lrd.cr(this.PjT, "tt_splash_hand2"));
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 80.0f)), ((int)XX.PjT(this.PjT, 80.0f)));
        frameLayout$LayoutParams2.gravity = 0x30;
        frameLayout$LayoutParams2.leftMargin = (int)XX.PjT(this.PjT, 30.0f);
        this.addView(this.Zh, frameLayout$LayoutParams2);
        TextView textView0 = new TextView(this.PjT);
        this.JQp = textView0;
        textView0.setTextColor(-1);
        this.JQp.setSingleLine();
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams3.gravity = 80;
        this.addView(this.JQp, frameLayout$LayoutParams3);
        this.post(new Runnable() {
            final RD PjT;

            @Override
            public void run() {
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)RD.this.Zh.getLayoutParams();
                frameLayout$LayoutParams0.topMargin = (int)(((float)RD.this.ReZ.getMeasuredHeight()) / 2.0f - XX.PjT(RD.this.getContext(), 7.0f));
                int v = -RD.this.ReZ.getMeasuredWidth() + ((int)XX.PjT(RD.this.PjT, 30.0f));
                frameLayout$LayoutParams0.leftMargin = v;
                frameLayout$LayoutParams0.setMarginStart(v);
                frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
                RD.this.Zh.setLayoutParams(frameLayout$LayoutParams0);
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)RD.this.cr.getLayoutParams();
                frameLayout$LayoutParams1.topMargin = (int)(((float)RD.this.ReZ.getMeasuredHeight()) / 2.0f - XX.PjT(RD.this.getContext(), 5.0f));
                frameLayout$LayoutParams1.leftMargin = (int)(((float)RD.this.ReZ.getMeasuredWidth()) / 2.0f + ((float)(((int)XX.PjT(RD.this.PjT, 30.0f)))));
                frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.leftMargin);
                frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
                RD.this.cr.setLayoutParams(frameLayout$LayoutParams1);
            }
        });
    }

    public void Zh() {
        try {
            AnimatorSet animatorSet0 = this.cz;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
            AnimatorSet animatorSet1 = this.Au;
            if(animatorSet1 != null) {
                animatorSet1.cancel();
            }
            AnimatorSet animatorSet2 = this.SM;
            if(animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.XX;
            if(animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private void cr() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.Zh, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.ReZ, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(this.ReZ, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(this.cr, "alpha", new float[]{0.0f, 1.0f});
        this.Au.setDuration(300L);
        this.Au.playTogether(new Animator[]{objectAnimator0, objectAnimator1, objectAnimator2, objectAnimator3});
        ObjectAnimator objectAnimator4 = ObjectAnimator.ofFloat(this.Zh, "translationX", new float[]{0.0f, XX.PjT(this.getContext(), 90.0f)});
        objectAnimator4.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, ((int)XX.PjT(this.getContext(), 90.0f))});
        valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final RD PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                Integer integer0 = (Integer)valueAnimator0.getAnimatedValue();
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)RD.this.cr.getLayoutParams();
                frameLayout$LayoutParams0.width = (int)integer0;
                RD.this.cr.setLayoutParams(frameLayout$LayoutParams0);
            }
        });
        valueAnimator0.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(this.ReZ, "translationX", new float[]{0.0f, XX.PjT(this.getContext(), 90.0f)});
        objectAnimator5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.SM.setDuration(1500L);
        this.SM.playTogether(new Animator[]{objectAnimator4, valueAnimator0, objectAnimator5});
        ObjectAnimator objectAnimator6 = ObjectAnimator.ofFloat(this.Zh, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator objectAnimator7 = ObjectAnimator.ofFloat(this.cr, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator objectAnimator8 = ObjectAnimator.ofFloat(this.ReZ, "alpha", new float[]{1.0f, 0.0f});
        this.XX.setDuration(50L);
        this.XX.playTogether(new Animator[]{objectAnimator6, objectAnimator7, objectAnimator8});
        this.cz.playSequentially(new Animator[]{this.Au, this.SM, this.XX});
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
    }

    public void setGuideText(String s) {
        this.JQp.setText(s);
    }
}

