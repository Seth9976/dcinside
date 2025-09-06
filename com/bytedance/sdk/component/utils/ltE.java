package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

public class ltE {
    public static boolean Au(Context context0) {
        if(context0 == null) {
            return false;
        }
        switch(ltE.ReZ(context0)) {
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean JQp(Context context0) {
        return ltE.ReZ(context0) == 5;
    }

    public static boolean PjT(Context context0) {
        return ltE.ReZ(context0) != 0;
    }

    // 去混淆评级： 低(30)
    public static boolean PjT(String s) {
        return !TextUtils.isEmpty(s) && (s.startsWith("http://") || s.startsWith("https://"));
    }

    public static int ReZ(Context context0) {
        return iZZ.PjT(context0, 60000L);
    }

    public static String XX(Context context0) {
        switch(ltE.ReZ(context0)) {
            case 2: {
                return "2g";
            }
            case 3: {
                return "3g";
            }
            case 4: {
                return "wifi";
            }
            case 5: {
                return "4g";
            }
            case 6: {
                return "5g";
            }
            default: {
                return "mobile";
            }
        }
    }

    public static int Zh(Context context0) {
        int v = ltE.ReZ(context0);
        switch(v) {
            case 1: {
                return 0;
            }
            case 4: {
                return 1;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 6;
            }
            default: {
                return v;
            }
        }
    }

    public static boolean cr(Context context0) {
        return ltE.ReZ(context0) == 4;
    }

    public static boolean cz(Context context0) {
        return ltE.ReZ(context0) == 6;
    }
}

