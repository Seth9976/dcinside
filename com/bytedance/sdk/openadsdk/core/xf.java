package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.PjT;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.Locale;
import org.json.JSONObject;

public class xf {
    private static String PjT;
    private static String ReZ;
    private static String Zh;
    private static boolean cr;

    @SuppressLint({"HardwareIds"})
    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    private static void JQp(Context context0) {
        if(xf.cr) {
            return;
        }
        Context context1 = xf.cr(context0);
        if(context1 == null) {
            return;
        }
        xf.Zh = String.valueOf(Build.TIME);
        xf.ReZ = ReZ.PjT(context1).Zh("uuid", null);
        xf.cr = true;
    }

    public static String PjT(Context context0) {
        if(!TextUtils.isEmpty(xf.PjT)) {
            return xf.PjT;
        }
        xf.cz(context0);
        return xf.PjT;
    }

    public static void PjT() {
        if(!TextUtils.isEmpty(xf.PjT)) {
            Jo.Zh(new Au("update_did") {
                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("time", SystemClock.elapsedRealtime());
                        jSONObject0.put("abcd", xf.PjT);
                        ReZ.PjT(ub.PjT()).PjT("abcd", "{\"message\":\"30963ac127ec43fef26dd48b7fc218dc55959926cb040c08dektghEIHiFVR2v+zZfDSeniHMl4M77K21+7AclnskbQ=\\n\",\"cypher\":3}");
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            });
        }
    }

    public static void PjT(Context context0, String s) {
        if(!TextUtils.isEmpty(s)) {
            if(!s.equals(xf.PjT)) {
                xf.PjT = s;
            }
            xf.PjT();
        }
        if(!TextUtils.isEmpty(xf.PjT)) {
            com.bytedance.sdk.openadsdk.core.SM.ReZ.Zh(xf.PjT);
            qj.PjT(xf.PjT);
        }
    }

    public static String ReZ(Context context0) {
        if(TextUtils.isEmpty(xf.ReZ) && !xf.cr) {
            Class class0 = xf.class;
            __monitor_enter(class0);
            try {
                if(!xf.cr) {
                    xf.JQp(context0);
                }
                __monitor_exit(class0);
                return xf.ReZ;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return xf.ReZ;
    }

    public static String Zh() {
        try {
            Locale locale0 = Build.VERSION.SDK_INT < 24 ? Locale.getDefault() : LocaleList.getDefault().get(0);
            String s = locale0 == null ? "" : locale0.getLanguage();
            if(locale0 == null || !"zh".equals(s)) {
                return s;
            }
            String s1 = locale0.toString();
            if(locale0.toString().length() >= 5) {
                s1 = s1.substring(0, 5);
            }
            return "zh_CN".equals(s1) ? "zh" : "zh-Hant";
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    public static String Zh(Context context0) {
        if(xf.Zh == null && !xf.cr) {
            Class class0 = xf.class;
            __monitor_enter(class0);
            try {
                if(!xf.cr) {
                    xf.JQp(context0);
                }
                __monitor_exit(class0);
                return xf.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return xf.Zh;
    }

    private static Context cr(Context context0) {
        return context0 == null ? ub.PjT() : context0;
    }

    private static void cz(Context context0) {
        Context context1 = xf.cr(context0);
        if(context1 == null) {
            return;
        }
        String s = ReZ.PjT(context1).Zh("abcd", null);
        if(!TextUtils.isEmpty(s)) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                int v = jSONObject0.optInt("cypher", -1);
                String s1 = jSONObject0.optString("message");
                if(v == 3) {
                    String s2 = PjT.ReZ(s1);
                    if(!TextUtils.isEmpty(s2)) {
                        xf.PjT = new JSONObject(s2).optString("abcd");
                        xf.PjT();
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

