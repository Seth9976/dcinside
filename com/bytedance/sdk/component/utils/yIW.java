package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

public class yIW {
    private static volatile String PjT;

    public static String PjT() {
        if(!TextUtils.isEmpty(yIW.PjT)) {
            return yIW.PjT;
        }
        yIW.PjT = Build.MODEL;
        return Build.MODEL;
    }
}

