package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cr {
    private static Map PjT;

    static {
        cr.PjT = new HashMap();
    }

    public static Zh PjT(String s) {
        return (Zh)cr.PjT.get(s);
    }

    public static void PjT(List list0) {
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                Zh zh0 = (Zh)object0;
                if(zh0 != null) {
                    cr.PjT.put(zh0.PjT(), zh0);
                }
            }
        }
    }
}

