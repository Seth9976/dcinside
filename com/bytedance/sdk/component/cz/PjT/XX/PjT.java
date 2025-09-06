package com.bytedance.sdk.component.cz.PjT.XX;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.JQp;

public class PjT {
    private static volatile HandlerThread PjT = null;
    private static int ReZ = 3000;
    private static volatile Handler Zh;

    static {
        PjT.ReZ();
    }

    public static Handler PjT() {
        if(PjT.PjT != null && PjT.PjT.isAlive()) {
            if(PjT.Zh == null) {
                Class class0 = PjT.class;
                __monitor_enter(class0);
                try {
                    if(PjT.Zh == null) {
                        PjT.Zh = new Handler(PjT.PjT.getLooper());
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
        Class class1 = PjT.class;
        __monitor_enter(class1);
        try {
            if(PjT.PjT == null || !PjT.PjT.isAlive()) {
                PjT.ReZ();
                PjT.Zh = new Handler(PjT.PjT.getLooper());
            }
            __monitor_exit(class1);
            return PjT.Zh;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(class1);
        throw throwable1;
    }

    private static void ReZ() {
        JQp jQp0 = Au.XX().xE();
        if(jQp0 != null) {
            HandlerThread handlerThread0 = jQp0.PjT("csj_ad_log", 10);
            if(handlerThread0 != null) {
                PjT.PjT = handlerThread0;
                return;
            }
        }
        HandlerThread handlerThread1 = new HandlerThread("csj_ad_log", 10);
        PjT.PjT = handlerThread1;
        handlerThread1.start();
    }

    public static int Zh() {
        if(PjT.ReZ <= 0) {
            PjT.ReZ = 3000;
        }
        return PjT.ReZ;
    }
}

