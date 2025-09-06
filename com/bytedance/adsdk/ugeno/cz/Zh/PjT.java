package com.bytedance.adsdk.ugeno.cz.Zh;

import android.view.View;
import com.bytedance.adsdk.ugeno.Au.ReZ.JQp;

public class PjT implements JQp {
    final float PjT;
    final float Zh;

    public PjT() {
        this.PjT = 0.8f;
        this.Zh = 0.5f;
    }

    @Override  // com.bytedance.adsdk.ugeno.Au.ReZ$JQp
    public void PjT(View view0, float f) {
        int v = Float.compare(f, 0.0f);
        float f1 = (v >= 0 ? -0.2f : 0.2f) * f + 1.0f;
        if(v < 0) {
            view0.setPivotX(((float)view0.getWidth()));
        }
        else {
            view0.setPivotX(0.0f);
        }
        view0.setPivotY(((float)(view0.getHeight() / 2)));
        view0.setScaleX(f1);
        view0.setScaleY(f1);
        view0.setAlpha(Math.abs(f * (v >= 0 ? -0.5f : 0.5f) + 1.0f));
    }
}

