package com.bytedance.adsdk.ugeno.cz.Zh;

import android.view.View;
import com.bytedance.adsdk.ugeno.Au.ReZ.JQp;

public class Zh implements JQp {
    @Override  // com.bytedance.adsdk.ugeno.Au.ReZ$JQp
    public void PjT(View view0, float f) {
        if(f >= -1.0f && f <= 1.0f) {
            view0.setAlpha(1.0f);
            view0.setTranslationX(((float)view0.getWidth()) * -f);
            view0.setTranslationY(f * ((float)view0.getHeight()));
            return;
        }
        view0.setAlpha(0.0f);
    }
}

