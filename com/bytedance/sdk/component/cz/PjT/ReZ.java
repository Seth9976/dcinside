package com.bytedance.sdk.component.cz.PjT;

public class ReZ {
    public static void PjT(Object object0, String s) {
        if(object0 == null) {
            ReZ.PjT(s);
        }
    }

    public static void PjT(String s) {
        throw new IllegalArgumentException(s);
    }
}

