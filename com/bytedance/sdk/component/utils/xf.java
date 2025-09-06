package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

public class xf {
    @SuppressLint({"StaticFieldLeak"})
    private static Context PjT;

    public static void PjT(Context context0, String s, String s1) {
        try {
            if(s == null) {
                s = "";
            }
            if(s1 == null) {
                s1 = "";
            }
            xf.PjT = context0.createConfigurationContext(xf.Zh(context0, s, s1));
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
        Lrd.PjT(xf.PjT);
    }

    private static Configuration Zh(Context context0, String s, String s1) {
        Configuration configuration0 = new Configuration(context0.getResources().getConfiguration());
        configuration0.setLocale(new Locale(s, s1));
        return configuration0;
    }
}

