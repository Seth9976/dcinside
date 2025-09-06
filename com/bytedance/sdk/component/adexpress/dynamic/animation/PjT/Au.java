package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class Au extends cr {
    public Au(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    @SuppressLint({"ObjectAnimatorBinding"})
    List PjT() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "rippleValue", new float[]{0.0f, 1.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        ((ViewGroup)this.ReZ.getParent()).setClipChildren(false);
        ((ViewGroup)this.ReZ.getParent().getParent()).setClipChildren(false);
        ((ViewGroup)this.ReZ.getParent().getParent().getParent()).setClipChildren(false);
        this.ReZ.setTag(0x7D06FFD8, this.Zh.Au());
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        return list0;
    }
}

