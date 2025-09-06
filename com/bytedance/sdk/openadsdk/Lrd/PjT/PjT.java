package com.bytedance.sdk.openadsdk.Lrd.PjT;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.Au;

public class PjT {
    private static Handler PjT;
    private static HandlerThread Zh;

    public static Handler PjT() {
        Class class1;
        Class class0;
        try {
            if(PjT.Zh == null || !PjT.Zh.isAlive()) {
                goto label_11;
            }
            if(PjT.PjT == null) {
                class0 = PjT.class;
                __monitor_enter(class0);
                goto label_4;
            }
        }
        catch(Throwable unused_ex) {
        }
        return PjT.PjT;
        try {
        label_4:
            if(PjT.PjT == null) {
                PjT.PjT = new Handler(PjT.Zh.getLooper());
            }
            __monitor_exit(class0);
            return PjT.PjT;
        }
        catch(Throwable throwable0) {
        }
        try {
            __monitor_exit(class0);
            throw throwable0;
        label_11:
            class1 = PjT.class;
            __monitor_enter(class1);
        }
        catch(Throwable unused_ex) {
            return PjT.PjT;
        }
        try {
            if(PjT.Zh == null || !PjT.Zh.isAlive()) {
                PjT.Zh = Au.PjT("csj_ev");
                PjT.PjT = new Handler(PjT.Zh.getLooper());
            }
            __monitor_exit(class1);
            return PjT.PjT;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(class1);
            throw throwable1;
        }
        catch(Throwable unused_ex) {
        }
        return PjT.PjT;
    }
}

