package com.bytedance.sdk.component.PjT;

import android.text.TextUtils;

class Lrd {
    private static boolean PjT;

    static String PjT() [...] // Inlined contents

    static String PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return "{\"code\":1}";
        }
        String s1 = Lrd.PjT ? s.substring(1, s.length() - 1) : "";
        return s1.isEmpty() ? "{\"code\":1,\"__data\":" + s + "}" : "{\"code\":1,\"__data\":" + s + "," + s1 + "}";
    }

    // 去混淆评级： 低(20)
    static String PjT(Throwable throwable0) {
        return "{\"code\":" + (throwable0 instanceof gK ? ((gK)throwable0).PjT : 0) + "}";
    }

    static void PjT(boolean z) {
        Lrd.PjT = z;
    }
}

