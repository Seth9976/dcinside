package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import java.util.ArrayList;
import java.util.List;

public class qla extends cr {
    public qla(View view0, PjT pjT0) {
        super(view0, pjT0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.cr
    List PjT() {
        float f3;
        float f = XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)this.Zh.cz()));
        float f1 = XX.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), ((float)this.Zh.XX()));
        float f2 = 0.0f;
        if("reverse".equals(this.Zh.xE())) {
            f2 = f;
            f3 = f1;
            f = 0.0f;
            f1 = 0.0f;
        }
        else {
            f3 = 0.0f;
        }
        if(Zh.PjT(this.ReZ.getContext())) {
            f = -f;
            f2 = -f2;
        }
        this.ReZ.setTranslationX(f);
        this.ReZ.setTranslationY(f1);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.ReZ, "translationX", new float[]{f, f2}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.ReZ, "translationY", new float[]{f1, f3}).setDuration(((long)(((int)(this.Zh.DWo() * 1000.0)))));
        List list0 = new ArrayList();
        list0.add(this.PjT(objectAnimator0));
        list0.add(this.PjT(objectAnimator1));
        return list0;
    }
}

