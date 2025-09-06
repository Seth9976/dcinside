package com.bytedance.adsdk.PjT.Zh.cr;

import java.util.HashMap;
import java.util.Map;

public enum PjT implements JQp {
    TRUE,
    FALSE,
    NULL;

    private static final Map cr;

    static {
        PjT.cr = new HashMap(0x80);
        PjT[] arr_pjT = (PjT[])PjT.JQp.clone();
        for(int v = 0; v < arr_pjT.length; ++v) {
            PjT pjT0 = arr_pjT[v];
            PjT.cr.put(pjT0.name().toLowerCase(), pjT0);
        }
    }

    public static PjT PjT(String s) {
        return (PjT)PjT.cr.get(s.toLowerCase());
    }
}

