package com.bytedance.sdk.component.cz.PjT.PjT.PjT;

import android.annotation.SuppressLint;
import android.content.Context;

public class PjT extends Zh {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile PjT PjT;

    private PjT(Context context0) {
        super(context0);
    }

    public static PjT PjT(Context context0) {
        if(PjT.PjT == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT(context0);
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

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh
    public com.bytedance.sdk.component.cz.PjT.PjT.PjT.Zh.Zh PjT() {
        return super.PjT();
    }
}

