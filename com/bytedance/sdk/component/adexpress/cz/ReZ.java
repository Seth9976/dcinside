package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.cr.Au;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.utils.Qf;

public class ReZ extends FrameLayout {
    private ub JQp;
    private Context PjT;
    private ImageView ReZ;
    private ImageView Zh;
    private TextView cr;
    private AnimatorSet cz;

    public ReZ(@NonNull Context context0) {
        super(context0);
        this.cz = new AnimatorSet();
        this.PjT = context0;
        this.JQp();
        this.cz();
    }

    private void JQp() {
        FrameLayout frameLayout0 = new FrameLayout(this.PjT);
        this.JQp = new ub(this.PjT);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 95.0f)), ((int)XX.PjT(this.PjT, 95.0f)));
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout0.addView(this.JQp, frameLayout$LayoutParams0);
        this.Zh = new ImageView(this.PjT);
        int v = Qf.PjT(this.PjT, 60.0f);
        Integer integer0 = Qf.PjT(this.PjT, 1.0f);
        Integer integer1 = Color.parseColor("#80FFFFFF");
        GradientDrawable gradientDrawable0 = Au.PjT(1, null, null, new int[]{v, v}, integer0, integer1);
        this.Zh.setImageDrawable(gradientDrawable0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 75.0f)), ((int)XX.PjT(this.PjT, 75.0f)));
        frameLayout$LayoutParams1.gravity = 17;
        frameLayout0.addView(this.Zh, frameLayout$LayoutParams1);
        this.ReZ = new ImageView(this.PjT);
        int v1 = Qf.PjT(this.PjT, 50.0f);
        GradientDrawable gradientDrawable1 = Au.PjT(1, Color.parseColor("#80FFFFFF"), null, new int[]{v1, v1}, null, null);
        this.ReZ.setImageDrawable(gradientDrawable1);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(((int)XX.PjT(this.PjT, 63.0f)), ((int)XX.PjT(this.PjT, 63.0f)));
        frameLayout$LayoutParams2.gravity = 17;
        frameLayout0.addView(this.ReZ, frameLayout$LayoutParams2);
        this.addView(frameLayout0);
        TextView textView0 = new TextView(this.PjT);
        this.cr = textView0;
        textView0.setTextColor(-1);
        this.cr.setMaxLines(1);
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams3.gravity = 81;
        this.addView(this.cr, frameLayout$LayoutParams3);
    }

    public void PjT() {
        this.cz.start();
    }

    public void ReZ() {
        this.JQp.PjT();
    }

    public void Zh() {
        this.cz.cancel();
    }

    public void cr() {
        this.JQp.Zh();
        this.JQp.ReZ();
    }

    private void cz() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "scaleX", new float[]{1.0f, 0.9f});
        objectAnimator0.setRepeatCount(-1);
        objectAnimator0.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimator0.setRepeatMode(2);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.ReZ, "scaleY", new float[]{1.0f, 0.9f});
        objectAnimator1.setRepeatCount(-1);
        objectAnimator1.setRepeatMode(2);
        objectAnimator1.setInterpolator(new AccelerateDecelerateInterpolator());
        this.cz.setDuration(800L);
        this.cz.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
    }

    public void setGuideText(String s) {
        this.cr.setText(s);
    }
}

