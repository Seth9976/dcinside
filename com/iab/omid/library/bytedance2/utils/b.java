package com.iab.omid.library.bytedance2.utils;

import android.os.Build;
import org.json.JSONObject;

public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static String c() [...] // 潜在的解密器

    public static JSONObject d() {
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "deviceType", b.a());
        c.a(jSONObject0, "osVersion", "33");
        c.a(jSONObject0, "os", "Android");
        return jSONObject0;
    }
}

