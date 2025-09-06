package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.Lrd;

public class Zh extends FrameLayout {
    private int Au;
    private Context DWo;
    private View JQp;
    private AnimatorSet PjT;
    private boolean ReZ;
    private int SM;
    private ImageView XX;
    private ObjectAnimator Zh;
    private View cr;
    private View cz;

    public Zh(Context context0, int v, int v1) {
        super(context0);
        this.ReZ = false;
        this.PjT = new AnimatorSet();
        this.Au = v;
        this.SM = v1;
        this.DWo = context0;
        this.ReZ();
        this.cr();
    }

    private GradientDrawable PjT(String s, String s1) {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(1);
        gradientDrawable0.setColor(Color.parseColor(s));
        gradientDrawable0.setStroke(1, Color.parseColor(s1));
        return gradientDrawable0;
    }

    public void PjT() {
        this.ReZ = false;
        ObjectAnimator objectAnimator0 = this.Zh;
        if(objectAnimator0 != null && this.PjT != null) {
            objectAnimator0.start();
            this.PjT.start();
        }
    }

    private void ReZ() {
        View view0 = new View(this.DWo);
        this.cr = view0;
        view0.setBackground(this.PjT("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)(((double)this.Au) * 0.45)), ((int)(((double)this.SM) * 0.45)));
        frameLayout$LayoutParams0.gravity = 17;
        this.cr.setLayoutParams(frameLayout$LayoutParams0);
        this.addView(this.cr);
        View view1 = new View(this.DWo);
        this.JQp = view1;
        view1.setBackground(this.PjT("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(((int)(((double)this.Au) * 0.25)), ((int)(((double)this.SM) * 0.25)));
        frameLayout$LayoutParams1.gravity = 17;
        this.JQp.setLayoutParams(frameLayout$LayoutParams1);
        this.addView(this.JQp);
        View view2 = new View(this.DWo);
        this.cz = view2;
        view2.setBackground(this.PjT("#807BBEFF", "#FF7BBEFF"));
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(((int)(((double)this.Au) * 0.25)), ((int)(((double)this.Au) * 0.25)));
        frameLayout$LayoutParams2.gravity = 17;
        this.cz.setLayoutParams(frameLayout$LayoutParams2);
        this.addView(this.cz);
        ImageView imageView0 = new ImageView(this.DWo);
        this.XX = imageView0;
        imageView0.setImageResource(Lrd.cr(this.getContext(), "tt_blue_hand"));
        this.XX.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(((int)(((double)this.Au) * 0.62)), ((int)(((double)this.SM) * 0.53)));
        frameLayout$LayoutParams3.gravity = 17;
        frameLayout$LayoutParams3.topMargin = frameLayout$LayoutParams3.width / 2 - 5;
        frameLayout$LayoutParams3.leftMargin = frameLayout$LayoutParams3.height / 2 - 5;
        this.XX.setLayoutParams(frameLayout$LayoutParams3);
        this.addView(this.XX);
    }

    public void Zh() {
        this.ReZ = true;
        ObjectAnimator objectAnimator0 = this.Zh;
        if(objectAnimator0 != null && this.PjT != null) {
            objectAnimator0.cancel();
            this.PjT.cancel();
        }
    }

    private void cr() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.cr, "scaleX", new float[]{1.0f, 2.0f, 1.0f});
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.cr, "scaleY", new float[]{1.0f, 2.0f, 1.0f});
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(this.JQp, "scaleX", new float[]{1.0f, 2.5f, 1.0f});
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(this.JQp, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ObjectAnimator objectAnimator4 = ObjectAnimator.ofFloat(this.cz, "scaleX", new float[]{1.0f, 1.5f, 1.0f});
        ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(this.cz, "scaleY", new float[]{1.0f, 1.5f, 1.0f});
        ObjectAnimator objectAnimator6 = ObjectAnimator.ofFloat(this.XX, "rotation", new float[]{0.0f, -20.0f, 0.0f});
        this.Zh = objectAnimator6;
        objectAnimator6.setDuration(1000L);
        this.PjT.setDuration(1500L);
        this.PjT.setInterpolator(new AccelerateDecelerateInterpolator());
        this.PjT.play(objectAnimator0).with(objectAnimator1).with(objectAnimator2).with(objectAnimator3).with(objectAnimator4).with(objectAnimator5);
        this.PjT.addListener(new Animator.AnimatorListener() {
            final Zh PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
                Zh.this.ReZ = true;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                if(Zh.this.ReZ) {
                    return;
                }
                Zh.this.Zh.start();
                Zh.this.PjT.start();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        });
    }
}

