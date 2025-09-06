package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class xE extends cr {
    public xE(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationX", new float[]{0.0f, XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), 20.0f), 0.0f, -XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), 20.0f), 0.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        return list0;
    }
}

