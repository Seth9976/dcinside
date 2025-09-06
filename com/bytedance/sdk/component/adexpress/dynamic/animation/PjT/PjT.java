package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class PjT extends cr {
    public PjT(View view0, com.bytedance.sdk.component.adexpress.dynamic.cr.PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        float f = ((float)this.Zh.gK()) / 100.0f;
        float f1 = ((float)this.Zh.ltE()) / 100.0f;
        if("reverse".equals(this.Zh.xE()) && this.Zh.fDm() <= 0.0) {
            float f2 = f1;
            f1 = f;
            f = f2;
        }
        this.ReZ.setAlpha(f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "alpha", new float[]{f, f1}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        return list0;
    }
}

