package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.HashMap;
import java.util.Map;

public class Qf {
    private static final Map PjT;
    private SharedPreferences Zh;

    static {
        Qf.PjT = new HashMap();
    }

    private Qf(String s, Context context0) {
        if(context0 != null) {
            this.Zh = context0.getSharedPreferences(s, 0);
        }
    }

    public static Qf PjT(String s, Context context0) {
        if(TextUtils.isEmpty(s)) {
            s = "tt_ad_sdk_sp";
        }
        Map map0 = Qf.PjT;
        Qf qf0 = (Qf)map0.get(s);
        if(qf0 == null) {
            Class class0 = Qf.class;
            __monitor_enter(class0);
            try {
                qf0 = new Qf(s, ub.PjT());
                map0.put(s, qf0);
                __monitor_exit(class0);
                return qf0;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return qf0;
    }

    public String PjT(String s, String s1) {
        try {
            return this.Zh.getString(s, s1);
        }
        catch(Throwable unused_ex) {
            return s1;
        }
    }

    public void PjT(String s) {
        try {
            this.Zh.edit().remove(s).apply();
        }
        catch(Throwable unused_ex) {
        }
    }
}

