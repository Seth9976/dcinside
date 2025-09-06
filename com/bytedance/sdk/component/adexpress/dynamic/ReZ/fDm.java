package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.xE;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class fDm implements XX {
    private xE PjT;

    public fDm(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        this.PjT = new xE(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, 180.0f)), ((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, 180.0f)));
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout$LayoutParams0.leftMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, 20.0f);
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setGuideText(xX0.cI());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.cr();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        this.PjT.Zh();
    }

    public xE cr() {
        return this.PjT;
    }
}

