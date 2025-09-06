package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ReZ.PjT;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;

public class Sks extends RelativeLayout {
    private AnimatorSet Au;
    private String DWo;
    private TextView JQp;
    private ImageView PjT;
    private ImageView ReZ;
    private AnimatorSet SM;
    private AnimatorSet XX;
    private ImageView Zh;
    private TextView cr;
    private AnimatorSet cz;
    private int qj;

    public Sks(Context context0) {
        super(context0);
        this.cz = new AnimatorSet();
        this.XX = new AnimatorSet();
        this.Au = new AnimatorSet();
        this.SM = new AnimatorSet();
        this.qj = 100;
        this.PjT(context0);
    }

    public Sks(Context context0, String s) {
        super(context0);
        this.cz = new AnimatorSet();
        this.XX = new AnimatorSet();
        this.Au = new AnimatorSet();
        this.SM = new AnimatorSet();
        this.qj = 100;
        this.setClipChildren(false);
        this.DWo = s;
        this.PjT(context0);
    }

    public void PjT() {
        this.ReZ();
        this.cz.start();
        this.cz.addListener(new AnimatorListenerAdapter() {
            final Sks PjT;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                com.bytedance.sdk.component.adexpress.cz.Sks.1.1 sks$1$10 = new Runnable() {
                    final com.bytedance.sdk.component.adexpress.cz.Sks.1 PjT;

                    @Override
                    public void run() {
                        Sks.this.cz.start();
                    }
                };
                Sks.this.postDelayed(sks$1$10, 200L);
            }
        });
    }

    protected void PjT(Context context0) {
        if(context0 == null) {
            context0 = cr.PjT();
        }
        if("5".equals(this.DWo)) {
            this.addView(PjT.cz(context0));
            this.qj = (int)(((double)this.qj) * 1.25);
        }
        else {
            this.addView(PjT.JQp(context0));
        }
        this.PjT = (ImageView)this.findViewById(0x7D06FFEE);
        this.Zh = (ImageView)this.findViewById(0x7D06FFEF);
        this.cr = (TextView)this.findViewById(0x7D06FFEA);
        this.ReZ = (ImageView)this.findViewById(0x7D06FFED);
        this.JQp = (TextView)this.findViewById(0x7D06FFEB);
    }

    public void ReZ() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.PjT, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.PjT, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(this.PjT, "translationY", new float[]{0.0f, XX.PjT(this.getContext(), ((float)(-this.qj)))});
        objectAnimator2.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, ((int)XX.PjT(this.getContext(), ((float)this.qj)))});
        valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final Sks PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                if(Sks.this.ReZ != null) {
                    Integer integer0 = (Integer)valueAnimator0.getAnimatedValue();
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)Sks.this.ReZ.getLayoutParams();
                    relativeLayout$LayoutParams0.height = (int)integer0;
                    Sks.this.ReZ.setLayoutParams(relativeLayout$LayoutParams0);
                }
            }
        });
        valueAnimator0.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(this.ReZ, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator4 = ObjectAnimator.ofFloat(this.ReZ, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(this.Zh, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator6 = ObjectAnimator.ofFloat(this.Zh, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator objectAnimator7 = ObjectAnimator.ofFloat(this.Zh, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator8 = ObjectAnimator.ofFloat(this.Zh, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator objectAnimator9 = ObjectAnimator.ofFloat(this.Zh, "translationY", new float[]{0.0f, XX.PjT(this.getContext(), ((float)(-this.qj)))});
        objectAnimator9.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.XX.setDuration(50L);
        this.SM.setDuration(1500L);
        this.Au.setDuration(50L);
        this.XX.playTogether(new Animator[]{objectAnimator1, objectAnimator6, objectAnimator4});
        this.Au.playTogether(new Animator[]{objectAnimator0, objectAnimator5, objectAnimator7, objectAnimator8, objectAnimator3});
        this.SM.playTogether(new Animator[]{objectAnimator2, valueAnimator0, objectAnimator9});
        this.cz.playSequentially(new Animator[]{this.Au, this.SM, this.XX});
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
            AnimatorSet animatorSet2 = this.XX;
            if(animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.SM;
            if(animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.cz;
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Zh();
    }

    public void setGuideText(String s) {
        TextView textView0 = this.cr;
        if(textView0 != null) {
            textView0.setText(s);
        }
    }

    public void setSlideText(String s) {
        if(this.JQp != null) {
            if(TextUtils.isEmpty(s)) {
                this.JQp.setText("");
                return;
            }
            this.JQp.setText(s);
        }
    }
}

