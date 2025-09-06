package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class SM extends DWo {
    public SM(PjT pjT0) {
        super(pjT0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.view.DWo
    public void PjT(int v, int v1) {
        super.PjT(v, v1);
        if(Owx.JQp(this.cr) && this.cr.wN() == 3 && this.cr.qZS() == 0) {
            try {
                FrameLayout frameLayout0 = (FrameLayout)this.ReZ.ig.findViewById(qla.DWo);
                frameLayout0.setBackgroundColor(Color.parseColor("#000000"));
                if(this.cr.jK() == 1) {
                    int v2 = qZS.Zh(ub.PjT(), 90.0f);
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)frameLayout0.getLayoutParams();
                    frameLayout$LayoutParams0.bottomMargin = v2;
                    frameLayout0.setLayoutParams(frameLayout$LayoutParams0);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.view.DWo
    protected boolean PjT() {
        return false;
    }
}

