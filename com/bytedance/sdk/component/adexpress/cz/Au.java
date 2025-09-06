package com.bytedance.sdk.component.adexpress.cz;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ReZ.PjT;

public class Au extends Sks {
    private int JQp;
    private TextView PjT;
    private ImageView ReZ;
    private ImageView Zh;
    private ImageView cr;
    private AnimatorSet cz;

    public Au(Context context0) {
        super(context0);
        this.cz = new AnimatorSet();
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
        this.addView(PjT.Zh(context0));
        this.Zh = (ImageView)this.findViewById(0x7D06FFFF);
        this.ReZ = (ImageView)this.findViewById(0x7D06FFFE);
        this.cr = (ImageView)this.findViewById(0x7D06FFFD);
        this.PjT = (TextView)this.findViewById(0x7D06FFFC);
    }

    @Override  // com.bytedance.sdk.component.adexpress.cz.Sks
    public void Zh() {
        this.cz.cancel();
    }

    private void cr() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(this, "alphaColor", new int[]{0, 60});
        objectAnimator0.setInterpolator(new LinearInterpolator());
        objectAnimator0.setDuration(2000L);
        objectAnimator0.setRepeatCount(-1);
        objectAnimator0.start();
    }

    public float getAlphaColor() {
        return (float)this.JQp;
    }

    public void setAlphaColor(int v) {
        if(v >= 0 && v <= 60) {
            int v1 = v + 0xC3;
            ImageView imageView0 = this.cr;
            int v2 = Color.rgb(v1, v1, v1);
            PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
            imageView0.setColorFilter(v2, porterDuff$Mode0);
            int v3 = (v + 20) % 60 + 0xC3;
            this.ReZ.setColorFilter(Color.rgb(v3, v3, v3), porterDuff$Mode0);
            int v4 = (v + 40) % 60 + 0xC3;
            this.Zh.setColorFilter(Color.rgb(v4, v4, v4), porterDuff$Mode0);
        }
    }

    public void setButtonText(String s) {
        if(this.PjT != null && !TextUtils.isEmpty(s)) {
            this.PjT.setText(s);
        }
    }
}

