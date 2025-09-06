package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class cz extends cr {
    public cz(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        float f = (float)this.ReZ.getLayoutParams().width;
        this.ReZ.setTranslationX(f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationX", new float[]{f, 0.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.ReZ, "alpha", new float[]{0.0f, 1.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        list0.add(this.PjT(objectAnimator1));
        return list0;
    }
}

