package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.view.XX;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class ReZ extends Zh {
    public ReZ(PjT pjT0) {
        super(pjT0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean JQp() {
        return false;
    }

    public static boolean PjT(Owx owx0) {
        gK.ReZ(owx0);
        return gK.ReZ(owx0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(FrameLayout frameLayout0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(XX xX0) {
        this.Zh(xX0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void XX() {
    }

    private void Zh(XX xX0) {
        if(xX0 == null) {
            return;
        }
        Context context0 = xX0.getContext();
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(1);
        xX0.addView(jQp0, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        reZ0.setId(qla.Co);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 100.0f;
        jQp0.addView(reZ0, linearLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ1 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        reZ1.setId(qla.DWo);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        reZ0.addView(reZ1, frameLayout$LayoutParams0);
        reZ1.addView(Zh.PjT(context0));
        switch(this.Zh.fK()) {
            case 3: 
            case 5: {
                break;
            }
            default: {
                cr cr0 = new cr(context0);
                cr0.setId(qla.Yr);
                cr0.setVisibility(8);
                cr0.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(qZS.Zh(context0, 28.0f), qZS.Zh(context0, 28.0f));
                frameLayout$LayoutParams1.gravity = 0x800055;
                frameLayout$LayoutParams1.rightMargin = qZS.Zh(context0, 20.0f);
                frameLayout$LayoutParams1.bottomMargin = qZS.Zh(context0, 10.0f);
                reZ0.addView(cr0, frameLayout$LayoutParams1);
            }
        }
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ2 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        reZ2.setId(qla.Owx);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams1.weight = 0.0f;
        jQp0.addView(reZ2, linearLayout$LayoutParams1);
        reZ2.addView(com.bytedance.sdk.openadsdk.component.reward.Zh.cr.PjT(context0, this.PjT.Zh));
        com.bytedance.sdk.openadsdk.component.reward.view.cr.PjT(reZ2, this.Zh);
        com.bytedance.sdk.openadsdk.component.reward.view.cr.PjT(reZ0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean cz() {
        return true;
    }
}

