package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.cr.PjT.cr;
import java.util.concurrent.atomic.AtomicInteger;

public class SM {
    private static final AtomicInteger PjT;

    static {
        SM.PjT = new AtomicInteger(1);
    }

    protected static void PjT(int v) {
        AtomicInteger atomicInteger0;
        boolean z = true;
        if(v != 1 && v != 2) {
            return;
        }
        try {
            atomicInteger0 = SM.PjT;
            if(atomicInteger0.get() == v) {
                goto label_14;
            }
            else {
                goto label_9;
            }
        }
        catch(Throwable throwable0) {
            z = false;
            RD.Zh("SdkSwitch", throwable0.getMessage());
        }
        goto label_15;
        try {
        label_9:
            atomicInteger0.set(v);
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("SdkSwitch", throwable0.getMessage());
        goto label_15;
    label_14:
        z = false;
    label_15:
        if(z) {
            Log.e("SdkSwitch", "switch status changed: " + SM.PjT());
            if(SM.PjT()) {
                cr.Zh();
                return;
            }
            cr.ReZ();
        }
    }

    public static boolean PjT() {
        return SM.PjT.get() == 1;
    }
}

