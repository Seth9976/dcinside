package com.bytedance.sdk.openadsdk.cr.PjT;

import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.qla.PjT.ReZ;
import com.bytedance.sdk.openadsdk.qla.ReZ.Zh;
import com.bytedance.sdk.openadsdk.utils.Jo;

class xf implements Zh {
    public static final xf PjT;

    static {
        xf.PjT = new xf();
    }

    private void PjT(Au au0) {
        if(au0 == null) {
            return;
        }
        if(!Jo.XX()) {
            Jo.Zh(au0, 5);
            return;
        }
        au0.run();
    }

    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.Zh
    public void PjT(com.bytedance.sdk.openadsdk.qla.Zh zh0) {
        this.PjT(zh0, false);
    }

    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.Zh
    public void PjT(com.bytedance.sdk.openadsdk.qla.Zh zh0, boolean z) {
        this.PjT(new Au("uploadLogEvent") {
            final xf ReZ;

            @Override
            public void run() {
                try {
                    ReZ reZ0 = zh0.getLogStats();
                    if(reZ0 == null) {
                        return;
                    }
                    PjT pjT0 = new PjT("fa215231-397e-484f-bacc-becc1ca76c0b", reZ0.PjT());
                    pjT0.ReZ(0);
                    pjT0.Zh(((byte)(z ? 2 : 3)));
                    pjT0.PjT(1);
                    if(com.bytedance.sdk.component.cz.PjT.Zh.Zh()) {
                        cr.PjT(ub.PjT(), com.bytedance.sdk.openadsdk.multipro.Zh.ReZ());
                    }
                    com.bytedance.sdk.component.cz.PjT.Zh.PjT(pjT0);
                }
                catch(Throwable unused_ex) {
                }
            }
        });
    }
}

