package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.Zh.Zh;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;

public class XX extends ReZ {
    private final PjT PjT;

    public XX(PjT pjT0) {
        super(pjT0.IJ);
        this.PjT = pjT0;
        if(pjT0.hN == null && Build.VERSION.SDK_INT >= 35) {
            this.setFitsSystemWindows(true);
        }
    }

    private void PjT(View view0, ViewGroup viewGroup0) {
        if(view0 != null) {
            viewGroup0.addView(view0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void PjT(Zh zh0) {
        zh0.PjT(this);
        if(this.PjT.PjT != 1) {
            RFEndCardBackUpLayout rFEndCardBackUpLayout0 = zh0.Au();
            if(rFEndCardBackUpLayout0 != null) {
                this.addView(rFEndCardBackUpLayout0, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        this.PjT(zh0.SM(), this);
        this.PjT(zh0.DWo(), this);
    }
}

