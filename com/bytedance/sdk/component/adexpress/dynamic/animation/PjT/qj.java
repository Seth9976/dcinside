package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import java.util.ArrayList;
import java.util.List;

public class qj extends cr {
    public qj(View view0, PjT pjT0) {
        super(view0, pjT0);
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        if(viewGroup0 != null) {
            viewGroup0.setClipChildren(false);
            viewGroup0.setClipToPadding(false);
            ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getParent();
            if(viewGroup1 != null && viewGroup1 instanceof JQp) {
                viewGroup1.setClipChildren(false);
                viewGroup1.setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup)viewGroup1.getParent();
                if(viewGroup2 != null && viewGroup2 instanceof JQp) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        float f3;
        float f = (float)this.Zh.qj();
        float f1 = (float)this.Zh.xf();
        String s = this.Zh.xE();
        float f2 = 1.0f;
        if("reverse".equals(s) || "alternate-reverse".equals(s)) {
            f3 = 1.0f;
        }
        else {
            f2 = f;
            f3 = f1;
            f = 1.0f;
            f1 = 1.0f;
        }
        this.ReZ.setTag(0x7D06FFD6, this.Zh.Zh());
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "scaleX", new float[]{f, f2}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.ReZ, "scaleY", new float[]{f1, f3}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        list0.add(this.PjT(objectAnimator1));
        return list0;
    }
}

