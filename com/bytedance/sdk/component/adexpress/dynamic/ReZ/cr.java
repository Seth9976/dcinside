package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.Sks;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class cr extends ub {
    public cr(Context context0, JQp jQp0, XX xX0) {
        super(context0, jQp0, xX0);
        this.PjT(xX0);
    }

    private void PjT(XX xX0) {
        this.PjT = new com.bytedance.sdk.component.adexpress.cz.XX(this.Zh);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.gravity = 81;
        frameLayout$LayoutParams0.bottomMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, ((float)xX0.xH()));
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setSlideText(this.cr.cI());
        Sks sks0 = this.PjT;
        if(sks0 instanceof com.bytedance.sdk.component.adexpress.cz.XX) {
            ((com.bytedance.sdk.component.adexpress.cz.XX)sks0).setButtonText(this.cr.DWo());
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.ub
    public void PjT() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.ub
    public void Zh() {
        this.PjT.Zh();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.ub
    protected void cr() {
    }
}

