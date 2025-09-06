package com.bytedance.sdk.component.SM.PjT;

public class PjT {
    private volatile Zh PjT;
    private static volatile PjT Zh;

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

    public void PjT(Zh zh0) {
        this.PjT = zh0;
    }

    public Zh Zh() {
        return this.PjT;
    }
}

