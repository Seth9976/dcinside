package com.bytedance.sdk.openadsdk.ltE.PjT.Zh;

import com.bytedance.sdk.openadsdk.core.ub;

public class PjT {
    private String PjT;
    private static volatile PjT Zh;

    static {
    }

    private PjT() {
        this.PjT = "";
    }

    public static PjT PjT() {
        if(PjT.Zh == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.Zh == null) {
                    PjT.Zh = new PjT();
                }
                __monitor_exit(class0);
                return PjT.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.Zh;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    // 去混淆评级： 低(20)
    public String Zh() {
        return ub.cr().Yo("gaid") ? this.PjT : "";
    }
}

