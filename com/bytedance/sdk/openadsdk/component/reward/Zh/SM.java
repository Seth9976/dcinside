package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class SM extends Zh {
    private PjT qla;

    public SM(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        super(pjT0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean JQp() {
        return this.Qf();
    }

    public FrameLayout KM() {
        return this.qla == null ? null : this.qla.getVideoContainer();
    }

    // 去混淆评级： 低(20)
    public static boolean PjT(Owx owx0) {
        return owx0.Sky() ? false : owx0.Qtm() != 100.0f;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(FrameLayout frameLayout0) {
        PjT pjT0 = new PjT(this.PjT.rds, this.qj);
        this.qla = pjT0;
        pjT0.setDownloadListener(this.xf);
        this.qla.PjT(this.Zh, this.PjT.oG, this.PjT.cI, this.ReZ, this.cr);
        frameLayout0.addView(this.qla);
    }

    private boolean Qf() {
        return Owx.JQp(this.Zh);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void XX() {
        this.cz.ReZ(8);
        this.cz.Zh(8);
        if(this.Zh.iZZ() == 2) {
            this.Au.PjT(false);
            this.Au.ReZ(false);
            this.Au.cr(false);
            this.cz.JQp(8);
            return;
        }
        boolean z = this.Zh.jp();
        this.Au.PjT(z);
        boolean z1 = this.Qf();
        this.Au.ReZ(z1);
        boolean z2 = this.Qf();
        this.Au.cr(z2);
        if(this.Qf()) {
            this.cz.JQp(8);
            return;
        }
        this.Au.JQp();
        this.cz.JQp(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public com.bytedance.sdk.openadsdk.component.reward.Zh.Zh.PjT cr() {
        return new com.bytedance.sdk.openadsdk.component.reward.Zh.Zh.PjT() {
            final SM PjT;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh$PjT
            public void PjT(boolean z) {
                if(SM.this.qla != null) {
                    SM.this.qla.setIsMute(z);
                }
            }
        };
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean cz() {
        return this.Qf();
    }
}

