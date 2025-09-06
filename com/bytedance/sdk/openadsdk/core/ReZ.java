package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;

public class ReZ {
    private static volatile ReZ PjT;

    static {
    }

    public static ReZ PjT(Context context0) {
        if(ReZ.PjT == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.PjT == null) {
                    ReZ.PjT = new ReZ();
                }
                __monitor_exit(class0);
                return ReZ.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ReZ.PjT;
    }

    public void PjT(String s, int v) {
        cr.PjT("ttopenadsdk", s, v);
    }

    public void PjT(String s, long v) {
        cr.PjT("ttopenadsdk", s, v);
    }

    public void PjT(String s, String s1) {
        cr.PjT("ttopenadsdk", s, s1);
    }

    public int Zh(String s, int v) {
        return cr.PjT("ttopenadsdk", s, v);
    }

    public Long Zh(String s, long v) {
        return cr.PjT("ttopenadsdk", s, v);
    }

    public String Zh(String s, String s1) [...] // 潜在的解密器
}

