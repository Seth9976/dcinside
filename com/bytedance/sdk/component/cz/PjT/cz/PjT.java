package com.bytedance.sdk.component.cz.PjT.cz;

import com.bytedance.sdk.component.cz.PjT.Au;

public class PjT {
    private static volatile Zh PjT;

    public static Zh PjT() {
        if(PjT.PjT == null) {
            Class class0 = Zh.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new ReZ(Au.XX().cz(), new cz(Au.XX().cz()));
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }
}

