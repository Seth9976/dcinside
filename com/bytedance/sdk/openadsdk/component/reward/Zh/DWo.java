package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.PjT.Au;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;

public class DWo extends Zh {
    public DWo(PjT pjT0) {
        super(pjT0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean JQp() {
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void Owx() {
        super.Owx();
        if(cRA.gK(this.PjT.Zh)) {
            this.DWo.removeMessages(600);
            this.PjT.cRA.ReZ("go_background");
        }
    }

    // 去混淆评级： 低(20)
    public static boolean PjT(Owx owx0) {
        return cRA.XX(owx0) || cRA.gK(owx0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(FrameLayout frameLayout0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void RD() {
        super.RD();
        if(cRA.gK(this.PjT.Zh)) {
            this.DWo.removeMessages(600);
            this.PjT.cRA.ReZ("go_background");
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void XX() {
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean cz() {
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void ltE() {
        if(this.PjT.cRA.Au(Au.ReZ) && cRA.gK(this.PjT.Zh)) {
            this.PjT.cRA.ReZ("return_foreground");
            if((this.xs == null || !this.xs.isShowing()) && this.PjT.cRA.Zh() >= 0.0f) {
                this.PjT.cRA.JQp(0);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void ub() {
        if(cRA.Au(this.Zh) && this.PjT.Jo.ig() && !this.PjT.Jo.IJ()) {
            this.gK();
        }
        if(cRA.XX(this.PjT.Zh)) {
            this.PjT.xH = true;
            PjT pjT0 = this.PjT;
            if(pjT0.xH) {
                pjT0.wN.Zh(true);
                this.PjT.cRA.JQp(true);
            }
        }
        this.PjT.Xtz.PjT();
    }
}

