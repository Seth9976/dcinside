package com.bytedance.sdk.component.Zh.PjT.Zh;

final class cz {
    static JQp PjT;
    static long Zh;

    static JQp PjT() {
        synchronized(cz.class) {
            JQp jQp0 = cz.PjT;
            if(jQp0 != null) {
                cz.PjT = jQp0.cz;
                jQp0.cz = null;
                cz.Zh -= 0x2000L;
                return jQp0;
            }
        }
        return new JQp();
    }

    static void PjT(JQp jQp0) {
        if(jQp0.cz != null || jQp0.XX != null) {
            throw new IllegalArgumentException();
        }
        if(jQp0.cr) {
            return;
        }
        Class class0 = cz.class;
        __monitor_enter(class0);
        try {
            long v = cz.Zh;
            if(v + 0x2000L > 0x10000L) {
                __monitor_exit(class0);
                return;
            }
            cz.Zh = v + 0x2000L;
            jQp0.cz = cz.PjT;
            jQp0.ReZ = 0;
            jQp0.Zh = 0;
            cz.PjT = jQp0;
            __monitor_exit(class0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(class0);
        throw throwable0;
    }
}

