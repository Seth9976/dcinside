package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.multipro.cr.cr;

public class qj {
    public static String PjT() {
        return qj.Zh("any_door_id", null);
    }

    public static void PjT(String s) [...] // 潜在的解密器

    private static void PjT(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            cr.PjT(null, s, s1);
        }
        catch(Throwable unused_ex) {
        }
    }

    private static String Zh(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            return cr.Zh(null, s, s1);
        }
        catch(Throwable unused_ex) {
            return s1;
        }
    }
}

