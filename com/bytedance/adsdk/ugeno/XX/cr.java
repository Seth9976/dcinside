package com.bytedance.adsdk.ugeno.XX;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

public final class cr {
    private static String PjT;
    @SuppressLint({"StaticFieldLeak"})
    private static Context ReZ;
    private static Resources Zh;

    static {
    }

    public static int PjT(Context context0, String s) {
        return cr.PjT(context0, s, "drawable");
    }

    private static int PjT(Context context0, String s, String s1) {
        if(cr.Zh == null) {
            cr.Zh = context0.getResources();
        }
        return cr.Zh.getIdentifier(s, s1, cr.PjT(context0));
    }

    private static String PjT(Context context0) {
        if(cr.PjT == null) {
            cr.PjT = "com.dcinside.app.android";
        }
        return cr.PjT;
    }

    public static void PjT(String s) {
        cr.PjT = s;
    }
}

