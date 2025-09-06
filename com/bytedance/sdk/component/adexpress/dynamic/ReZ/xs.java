package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.qla;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class xs implements XX {
    private qla PjT;

    public xs(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        this.PjT = new qla(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(jQp0.getDynamicHeight(), jQp0.getDynamicHeight());
        frameLayout$LayoutParams0.gravity = 0x800015;
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
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

    public qla cr() {
        return this.PjT;
    }
}

