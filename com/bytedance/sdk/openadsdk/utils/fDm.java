package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.core.model.Lrd;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.oem.PjT;

public class fDm implements PjT {
    private static final fDm PjT;
    private static boolean ReZ;
    private static com.bytedance.sdk.openadsdk.component.reward.PjT.PjT Zh;

    static {
        fDm.PjT = new fDm();
    }

    public static void PjT() {
        if(fDm.Zh == null) {
            return;
        }
        fDm.Zh = null;
        IPMiBroadcastReceiver iPMiBroadcastReceiver0 = IPMiBroadcastReceiver.PjT(ub.PjT());
        if(iPMiBroadcastReceiver0 != null) {
            iPMiBroadcastReceiver0.PjT();
        }
        fDm.ReZ = false;
    }

    public static void PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        Lrd lrd0 = pjT0.Zh.ceO();
        if(lrd0 != null && lrd0.XX()) {
            fDm.Zh = pjT0;
            IPMiBroadcastReceiver iPMiBroadcastReceiver0 = IPMiBroadcastReceiver.PjT(pjT0.IJ);
            if(iPMiBroadcastReceiver0 != null) {
                iPMiBroadcastReceiver0.PjT(fDm.PjT);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.oem.PjT
    public void PjT(String s, int v) {
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = fDm.Zh;
        if(pjT0 == null) {
            return;
        }
        if(pjT0.Zh.uQg() == null) {
        }

        class com.bytedance.sdk.openadsdk.utils.fDm.1 implements Runnable {
            final fDm Zh;

            com.bytedance.sdk.openadsdk.utils.fDm.1(int v) {
            }

            @Override
            public void run() {
                if(fDm.Zh != null && (this.PjT > 0 && this.PjT <= 5 && this.PjT == 1)) {
                    fDm.PjT();
                }
            }
        }

    }

    public static void Zh() {
        fDm.ReZ = true;
    }

    static boolean cr() [...] // 潜在的解密器
}

