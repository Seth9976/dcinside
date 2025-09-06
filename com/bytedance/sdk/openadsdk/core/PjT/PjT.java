package com.bytedance.sdk.openadsdk.core.PjT;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ub.ReZ;
import com.bytedance.sdk.openadsdk.ub.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;

public class PjT implements com.bytedance.sdk.openadsdk.core.ltE.PjT {
    private final com.bytedance.sdk.openadsdk.core.ltE.PjT PjT;
    private final AdSlot Zh;

    public PjT(com.bytedance.sdk.openadsdk.core.ltE.PjT ltE$PjT0, AdSlot adSlot0) {
        this.PjT = ltE$PjT0;
        this.Zh = adSlot0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
    public void PjT(int v, String s) {
        if(this.PjT != null) {
            if(Jo.cz() || this.Zh != null && this.Zh.getDurationSlotType() != 5 && com.bytedance.sdk.openadsdk.RD.PjT.PjT("getads_callback_async", 0) == 1) {
                this.PjT.PjT(v, s);
            }
            else {
                Jo.PjT(new Runnable() {
                    final PjT ReZ;

                    @Override
                    public void run() {
                        PjT.this.PjT.PjT(v, s);
                    }
                });
            }
            if(this.Zh != null && !this.Zh.isPreload()) {
                ReZ.ReZ(new cr() {
                    final PjT PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("load_ad");
                        pjT0.ReZ(PjT.this.Zh.getCodeId());
                        pjT0.cr(wN.ReZ(PjT.this.Zh.getDurationSlotType()));
                        pjT0.PjT("7.1.0.4");
                        pjT0.XX(wN.PjT(PjT.this.Zh).toString());
                        return pjT0;
                    }
                });
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
    public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
        if(this.PjT != null) {
            if(Jo.cz() || this.Zh != null && this.Zh.getDurationSlotType() != 5 && com.bytedance.sdk.openadsdk.RD.PjT.PjT("getads_callback_async", 0) == 1) {
                this.PjT.PjT(pjT0, reZ0);
            }
            else {
                Jo.PjT(new Runnable() {
                    final PjT ReZ;

                    @Override
                    public void run() {
                        PjT.this.PjT.PjT(pjT0, reZ0);
                    }
                });
            }
            if(this.Zh != null && !this.Zh.isPreload()) {
                ReZ.Zh(new cr() {
                    final PjT PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("load_ad");
                        pjT0.ReZ(PjT.this.Zh.getCodeId());
                        pjT0.cr(wN.ReZ(PjT.this.Zh.getDurationSlotType()));
                        pjT0.PjT("7.1.0.4");
                        pjT0.XX(wN.PjT(PjT.this.Zh).toString());
                        return pjT0;
                    }
                });
            }
        }
    }
}

