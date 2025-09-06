package com.bytedance.sdk.component.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

public class PjT {
    static class com.bytedance.sdk.component.utils.PjT.PjT {
        static final Random PjT;

        static {
            com.bytedance.sdk.component.utils.PjT.PjT.PjT = PjT.ReZ();
        }
    }

    // 去混淆评级： 中等(100)
    public static String PjT() [...] // 潜在的解密器

    public static String PjT(int v) [...] // 潜在的解密器

    public static String PjT(String s, int v) [...] // 潜在的解密器

    public static JSONObject PjT(String s) {
        JSONObject jSONObject0 = new JSONObject();
        if(TextUtils.isEmpty(s)) {
            return jSONObject0;
        }
        try {
            String s1 = PjT.Zh(s);
            if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("message", s1);
                jSONObject0.put("cypher", 3);
                return jSONObject0;
            }
            jSONObject0.put("message", s);
            jSONObject0.put("cypher", 0);
        }
        catch(Throwable unused_ex) {
            try {
                jSONObject0.put("message", s);
                jSONObject0.put("cypher", 0);
            }
            catch(Throwable throwable0) {
                throwable0.getMessage();
            }
        }
        return jSONObject0;
    }

    public static JSONObject PjT(JSONObject jSONObject0) {
        return jSONObject0 == null ? new JSONObject() : PjT.PjT(jSONObject0.toString());
    }

    public static String ReZ(String s) {
        if(!TextUtils.isEmpty(s) && s.length() >= 49) {
            String s1 = PjT.PjT(s.substring(1, 33), 0x20);
            String s2 = s.substring(33, 49);
            return s2 == null || s1 == null ? s : com.bytedance.sdk.component.cr.PjT.Zh(s.substring(49), s2, s1);
        }
        return s;
    }

    public static Random ReZ() {
        if(Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            }
            catch(Throwable unused_ex) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    // 去混淆评级： 中等(100)
    public static String Zh() [...] // 潜在的解密器

    // 去混淆评级： 中等(120)
    public static String Zh(String s) {
        return TextUtils.isEmpty(s) ? s : 3 + "191f7b69b8f2060de2780455b338141a" + "21c8e872d2c5544a" + com.bytedance.sdk.component.cr.PjT.PjT(s, "21c8e872d2c5544a", "e2780455b338141a191f7b69b8f2060d");
    }
}

