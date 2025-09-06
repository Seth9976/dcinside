package com.bytedance.sdk.openadsdk.ReZ;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.ltE;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.List;

public class Zh {
    private static volatile Zh PjT;
    private final ltE Zh;

    private Zh() {
        this.Zh = ub.ReZ();
    }

    public static Zh PjT() {
        if(Zh.PjT == null) {
            Class class0 = Zh.class;
            __monitor_enter(class0);
            try {
                if(Zh.PjT == null) {
                    Zh.PjT = new Zh();
                }
                __monitor_exit(class0);
                return Zh.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Zh.PjT;
    }

    public void PjT(@NonNull String s, List list0, String s1) {
        this.PjT(s, list0, null, null, s1);
    }

    public void PjT(@NonNull String s, List list0, String s1, String s2, String s3) {
        this.Zh.PjT(s, list0, s1, s2, s3);
    }
}

