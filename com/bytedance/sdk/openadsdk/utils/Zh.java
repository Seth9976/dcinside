package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.lang.ref.SoftReference;

public class Zh {
    public static SoftReference PjT;

    static {
    }

    public static Owx PjT() {
        return Zh.PjT == null ? null : ((Owx)Zh.PjT.get());
    }

    public static void PjT(Owx owx0) {
        if(owx0 == null) {
            return;
        }
        Zh.PjT = new SoftReference(owx0);
    }
}

