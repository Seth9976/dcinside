package com.bytedance.sdk.openadsdk.Lrd.PjT;

import com.bytedance.sdk.openadsdk.core.model.Owx;

public class ReZ {
    public static boolean PjT = false;
    public static String ReZ = "engaged_view";
    public static int Zh = 6;

    static {
    }

    public static void PjT(Owx owx0) {
        Zh zh0 = ReZ.ReZ(owx0);
        if(zh0 == null) {
            return;
        }
        zh0.PjT();
    }

    public static void PjT(Owx owx0, int v) {
        Zh zh0 = ReZ.ReZ(owx0);
        if(zh0 != null && !zh0.ReZ()) {
            zh0.PjT(v);
        }
    }

    public static void PjT(Owx owx0, boolean z) {
        Zh zh0 = ReZ.ReZ(owx0);
        if(zh0 != null && !zh0.ReZ()) {
            zh0.PjT(z);
            zh0.PjT((z ? 4 : 8));
        }
    }

    private static Zh ReZ(Owx owx0) {
        return owx0 == null || !owx0.oKO() ? null : owx0.zE();
    }

    public static void Zh(Owx owx0) {
        Zh zh0 = ReZ.ReZ(owx0);
        if(zh0 == null) {
            return;
        }
        zh0.Zh();
    }
}

