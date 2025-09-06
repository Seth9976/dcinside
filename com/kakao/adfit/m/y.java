package com.kakao.adfit.m;

import android.content.Context;

public abstract class y {
    public static boolean a(Context context0) {
        boolean z;
        if(y.a(context0, "android.permission.INTERNET")) {
            z = true;
        }
        else {
            f.b("android.permission.INTERNET permission must be added in AndroidManifest.xml!");
            z = false;
        }
        if(!y.a(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            f.b("android.permission.ACCESS_NETWORK_STATE permission must be added in AndroidManifest.xml!");
            return false;
        }
        return z;
    }

    public static boolean a(Context context0, String s) {
        return context0.checkCallingOrSelfPermission(s) == 0;
    }
}

