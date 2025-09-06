package com.bytedance.sdk.openadsdk.multipro.cr;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.PjT.ReZ;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh;

public class cr {
    public static int PjT(String s, String s1, int v) {
        if(cr.PjT()) {
            return v;
        }
        return Zh.ReZ() ? PjT.PjT(cr.Zh(s), s1, v) : PjT.PjT(ub.PjT(), cr.Zh(s), s1, v);
    }

    public static long PjT(String s, String s1, long v) {
        if(cr.PjT()) {
            return v;
        }
        return Zh.ReZ() ? PjT.PjT(cr.Zh(s), s1, v) : PjT.PjT(ub.PjT(), cr.Zh(s), s1, v);
    }

    public static void PjT(String s) {
        if(cr.PjT()) {
            return;
        }
        if(Zh.ReZ()) {
            PjT.PjT(cr.Zh(s));
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.cr.Zh.Zh(ub.PjT(), cr.Zh(s));
    }

    public static void PjT(String s, String s1) {
        if(cr.PjT()) {
            return;
        }
        try {
            if(Zh.ReZ()) {
                PjT.Zh(cr.Zh(s), s1);
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.cr.Zh.Zh(ub.PjT(), cr.Zh(s), s1);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(String s, String s1, Boolean boolean0) {
        if(cr.PjT()) {
            return;
        }
        if(Zh.ReZ()) {
            PjT.PjT(cr.Zh(s), s1, boolean0);
            return;
        }
        cr.PjT(cr.Zh(s), s1, boolean0);
    }

    public static void PjT(String s, String s1, Integer integer0) {
        if(cr.PjT()) {
            return;
        }
        if(Zh.ReZ()) {
            PjT.PjT(cr.Zh(s), s1, integer0);
            return;
        }
        cr.PjT(cr.Zh(s), s1, integer0);
    }

    public static void PjT(String s, String s1, Long long0) {
        if(cr.PjT()) {
            return;
        }
        if(Zh.ReZ()) {
            PjT.PjT(cr.Zh(s), s1, long0);
            return;
        }
        cr.PjT(cr.Zh(s), s1, long0);
    }

    private static void PjT(String s, String s1, Object object0) {
        String s2 = PjT.PjT(s, s1);
        if(SM.XX(s2)) {
            ReZ pjT$ReZ0 = com.bytedance.sdk.component.PjT.PjT(ub.PjT(), cr.Zh(s2)).Zh();
            com.bytedance.sdk.openadsdk.multipro.cr.Zh.PjT(pjT$ReZ0, s1, object0);
            pjT$ReZ0.apply();
            return;
        }
        SharedPreferences sharedPreferences0 = com.bytedance.sdk.openadsdk.multipro.cr.Zh.PjT(ub.PjT(), cr.Zh(s2));
        if(sharedPreferences0 == null) {
            return;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        com.bytedance.sdk.openadsdk.multipro.cr.Zh.PjT(sharedPreferences$Editor0, s1, object0);
        sharedPreferences$Editor0.apply();
    }

    public static void PjT(String s, String s1, String s2) {
        if(cr.PjT()) {
            return;
        }
        if(Zh.ReZ()) {
            PjT.PjT(cr.Zh(s), s1, s2);
            return;
        }
        cr.PjT(cr.Zh(s), s1, s2);
    }

    private static boolean PjT() {
        return ub.PjT() == null;
    }

    public static boolean PjT(String s, String s1, boolean z) {
        if(cr.PjT()) {
            return z;
        }
        return Zh.ReZ() ? PjT.PjT(cr.Zh(s), s1, z) : PjT.PjT(ub.PjT(), cr.Zh(s), s1, z);
    }

    // 去混淆评级： 低(20)
    private static String Zh(String s) {
        return TextUtils.isEmpty(s) ? "tt_sp" : s;
    }

    public static String Zh(String s, String s1, String s2) [...] // 潜在的解密器
}

