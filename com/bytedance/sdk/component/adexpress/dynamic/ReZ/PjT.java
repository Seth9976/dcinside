package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class PjT implements XX {
    private Zh PjT;

    public PjT(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        double f = xX0.fA();
        double f1 = 1.0;
        if(f == 0.0) {
            f = 1.0;
        }
        double f2 = xX0.zYH();
        if(f2 != 0.0) {
            f1 = f2;
        }
        int v = (int)(((double)jQp0.getDynamicWidth()) * 0.32 * f);
        int v1 = (int)(((double)jQp0.getDynamicWidth()) * 0.32 * f1);
        this.PjT = new Zh(context0, v, v1);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v1);
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout$LayoutParams0.topMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, ((float)(xX0.xu() - 7)));
        frameLayout$LayoutParams0.leftMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, ((float)(xX0.CY() - 3)));
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        this.PjT.Zh();
    }
}

