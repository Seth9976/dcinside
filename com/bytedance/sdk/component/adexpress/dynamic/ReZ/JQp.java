package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.Au;
import com.bytedance.sdk.component.adexpress.cz.Sks;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;

public class JQp extends ub {
    public JQp(Context context0, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp jQp0, XX xX0) {
        super(context0, jQp0, xX0);
        this.PjT(xX0);
    }

    private void PjT(XX xX0) {
        this.PjT = new Au(this.Zh);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 81;
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        Sks sks0 = this.PjT;
        if(sks0 instanceof Au) {
            ((Au)sks0).setButtonText(this.cr.cI());
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

