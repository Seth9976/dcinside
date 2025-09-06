package com.bytedance.sdk.component.adexpress.cz;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ReZ.PjT;

public class XX extends Sks {
    private TextView PjT;
    private AnimatorSet ReZ;
    private View Zh;

    public XX(Context context0) {
        super(context0);
        this.ReZ = new AnimatorSet();
        this.Zh(context0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.cz.Sks
    public void PjT() {
        this.cr();
    }

    @Override  // com.bytedance.sdk.component.adexpress.cz.Sks
    protected void PjT(Context context0) {
    }

    private void Zh(Context context0) {
        View view0 = PjT.PjT(context0);
        this.Zh = view0;
        this.addView(view0);
        this.setClipChildren(false);
        this.PjT = (TextView)this.findViewById(0x7D06FFFC);
    }

    @Override  // com.bytedance.sdk.component.adexpress.cz.Sks
    public void Zh() {
        this.ReZ.cancel();
    }

    private void cr() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.Zh, "translationY", new float[]{0.0f, com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.getContext(), -3.0f)});
        objectAnimator0.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimator0.setDuration(1000L);
        objectAnimator0.setRepeatCount(-1);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.Zh, "alpha", new float[]{1.0f, 0.8f});
        objectAnimator1.setDuration(1000L);
        objectAnimator1.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimator1.setRepeatCount(-1);
        this.ReZ.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
        this.ReZ.setDuration(1000L);
        this.ReZ.start();
    }

    public void setButtonText(String s) {
        if(this.PjT != null && !TextUtils.isEmpty(s)) {
            this.PjT.setText(s);
        }
    }
}

