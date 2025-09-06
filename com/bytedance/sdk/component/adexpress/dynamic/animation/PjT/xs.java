package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qj;
import java.util.ArrayList;
import java.util.List;

public class xs extends cr {
    public xs(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        if(this.ReZ instanceof ImageView && this.ReZ.getParent() instanceof qj) {
            View view0 = (View)this.ReZ.getParent();
            this.ReZ = view0;
            ((ViewGroup)view0).setClipChildren(true);
            ((ViewGroup)this.ReZ.getParent()).setClipChildren(true);
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "stretchValue", new float[]{0.0f, 1.0f}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        return list0;
    }
}

