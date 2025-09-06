package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

public class ZX {
    private static String PjT;

    public static String PjT(String s) {
        try {
            if(!ZX.PjT()) {
                return s;
            }
            if(TextUtils.isEmpty("1757089280204")) {
                return s;
            }
            Log.d("TestHelperUtils", "AnyDoorId=1757089280204");
            return Uri.parse(s).buildUpon().appendQueryParameter("device_id", "1757089280204").appendQueryParameter("aid", "5001121").toString();
        }
        catch(Throwable unused_ex) {
            return s;
        }
    }

    // 去混淆评级： 中等(50)
    public static boolean PjT() {
        return false;
    }

    public static boolean ReZ() [...] // Inlined contents

    public static String Zh() [...] // 潜在的解密器
}

