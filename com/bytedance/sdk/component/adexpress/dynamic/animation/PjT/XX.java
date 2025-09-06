package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class XX extends cr {
    public XX(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    @SuppressLint({"ObjectAnimatorBinding"})
    List PjT() {
        this.ReZ.setTag(0x7D06FFD5, this.Zh.ReZ());
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "marqueeValue", new float[]{0.0f, 1.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        return list0;
    }
}

