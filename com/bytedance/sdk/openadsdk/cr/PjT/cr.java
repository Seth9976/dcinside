package com.bytedance.sdk.openadsdk.cr.PjT;

import android.content.Context;
import com.bytedance.sdk.component.cz.PjT.PjT.PjT;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.qla.ReZ.Zh;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class cr {
    public static AtomicInteger PjT;
    public static final AtomicBoolean Zh;

    static {
        cr.PjT = new AtomicInteger(0);
        cr.Zh = new AtomicBoolean(false);
    }

    public static Zh PjT() {
        return xf.PjT;
    }

    public static void PjT(Context context0, boolean z) {
        if(cr.Zh.compareAndSet(false, true)) {
            com.bytedance.sdk.component.cz.PjT.Zh.PjT(new PjT().PjT(new DWo()).Zh(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT.ReZ()).ReZ(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT.JQp()).PjT(com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT.cr()).PjT(z).PjT(new qj()).PjT(Au.PjT).Zh(ub.cr().xs()).PjT(ub.cr().fDm()).PjT(ub.cr().zYH()).PjT(), context0);
            cr.Zh();
        }
    }

    public static void PjT(com.bytedance.sdk.openadsdk.cr.PjT pjT0) {
        com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT pjT1 = new com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT(pjT0.cr(), pjT0);
        pjT1.Zh(((byte)(pjT0.JQp() ? 1 : 2)));
        pjT1.PjT(0);
        if(com.bytedance.sdk.component.cz.PjT.Zh.Zh()) {
            cr.PjT(ub.PjT(), com.bytedance.sdk.openadsdk.multipro.Zh.ReZ());
        }
        com.bytedance.sdk.component.cz.PjT.Zh.PjT(pjT1);
    }

    public static void PjT(String s) {
        cr.PjT(s, false);
    }

    public static void PjT(String s, boolean z) {
        if(com.bytedance.sdk.component.cz.PjT.Zh.Zh()) {
            cr.PjT(ub.PjT(), com.bytedance.sdk.openadsdk.multipro.Zh.ReZ());
        }
        com.bytedance.sdk.component.cz.PjT.Zh.PjT(s, z);
    }

    public static void PjT(List list0, int v, String s) {
        if(list0 == null) {
            return;
        }
        ReZ.PjT(new com.bytedance.sdk.component.Au.Au("track") {
            @Override
            public void run() {
                if(com.bytedance.sdk.component.cz.PjT.Zh.Zh()) {
                    cr.PjT(ub.PjT(), com.bytedance.sdk.openadsdk.multipro.Zh.ReZ());
                }
                com.bytedance.sdk.component.cz.PjT.Zh.PjT(com.bytedance.sdk.openadsdk.core.xf.PjT(ub.PjT()), list0, true, v, s);
            }
        });
    }

    public static void ReZ() {
        try {
            com.bytedance.sdk.component.cz.PjT.Zh.cr();
        }
        catch(Throwable throwable0) {
            RD.Zh("AdLogSwitchUtils", throwable0.getMessage());
        }
    }

    public static void Zh() {
        com.bytedance.sdk.component.cz.PjT.Zh.ReZ();
    }
}

