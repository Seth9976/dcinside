package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class xf extends cr {
    public xf(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    @SuppressLint({"ObjectAnimatorBinding"})
    List PjT() {
        int v1;
        int v;
        this.ReZ.setTag(0x7D06FFD7, this.Zh.cr());
        if(this.ReZ == null || !Zh.PjT(this.ReZ.getContext())) {
            v = 0;
            v1 = 1;
        }
        else {
            v = 1;
            v1 = 0;
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "shineValue", new float[]{((float)v), ((float)v1)}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        return list0;
    }
}

