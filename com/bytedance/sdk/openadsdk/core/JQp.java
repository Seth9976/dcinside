package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

public class JQp extends cz {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile JQp PjT;

    private JQp(Context context0) {
        super(context0);
    }

    public static JQp PjT(Context context0) {
        if(JQp.PjT == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.PjT == null) {
                    JQp.PjT = new JQp(context0);
                }
                __monitor_exit(class0);
                return JQp.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.cz
    public ReZ PjT() {
        return super.PjT();
    }
}

