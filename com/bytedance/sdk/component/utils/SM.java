package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.Au.PjT.PjT;

public class SM {
    private static volatile Handler PjT;

    public static Handler PjT() {
        return PjT.PjT().Zh();
    }

    public static Handler Zh() {
        if(SM.PjT == null) {
            Class class0 = SM.class;
            __monitor_enter(class0);
            try {
                if(SM.PjT == null) {
                    SM.PjT = new Handler(Looper.getMainLooper());
                }
                __monitor_exit(class0);
                return SM.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return SM.PjT;
    }
}

