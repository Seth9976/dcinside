package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.cz.qj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class gK implements XX {
    private final qj PjT;

    public gK(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        int v;
        qj qj0 = new qj(context0);
        this.PjT = qj0;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 81;
        if(xX0.xH() > 0) {
            v = xX0.xH();
        }
        else {
            v = cr.Zh() ? 0 : 120;
        }
        frameLayout$LayoutParams0.bottomMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, ((float)v));
        qj0.setLayoutParams(frameLayout$LayoutParams0);
        qj0.setClipChildren(false);
        qj0.setText(xX0.cI());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        qj qj0 = this.PjT;
        if(qj0 != null) {
            qj0.PjT();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.cr();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        qj qj0 = this.PjT;
        if(qj0 != null) {
            qj0.Zh();
        }
    }

    public qj cr() {
        return this.PjT;
    }
}

