package com.bytedance.adsdk.ugeno.cz;

import java.util.Collection;

public class cr {
    public static int PjT(boolean z, int v, int v1) {
        if(v1 == 0) {
            return v;
        }
        if(z) {
            int v2 = Math.abs(v - 0x200) % v1;
            if(v - 0x200 < 0) {
                return v2 == 0 ? 0 : v1 - v2;
            }
            return v2;
        }
        return v;
    }

    public static boolean PjT(int v, Collection collection0) {
        return v >= 0 && v < collection0.size();
    }
}

