package com.gomfactory.adpie.sdk.util;

import android.text.TextUtils;
import android.util.Log;

public class AdPieLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static boolean logEnable = false;
    public static int logLevel = 2;

    static {
    }

    public static void d(String s, String s1) {
        AdPieLog.debug(s, s1);
    }

    private static void debug(String s, String s1) {
        if(AdPieLog.logEnable && AdPieLog.logLevel <= 3) {
            if(s1 == null) {
                s1 = "null";
            }
            int v = 0;
            if(TextUtils.isEmpty(s)) {
                while(v < s1.length()) {
                    Log.d("AdPieSDK-1.14.1", s1.substring(v, Math.min(s1.length(), v + 0x800)));
                    v += 0x800;
                }
                return;
            }
            while(v < s1.length()) {
                Log.d(("AdPieSDK-1.14.1-" + s), s1.substring(v, Math.min(s1.length(), v + 0x800)));
                v += 0x800;
            }
        }
    }

    public static void e(String s, Exception exception0) {
        AdPieLog.error(s, exception0);
    }

    // 去混淆评级： 低(26)
    private static void error(String s, Exception exception0) {
        if(AdPieLog.logEnable && AdPieLog.logLevel <= 6) {
            if(TextUtils.isEmpty(s)) {
                Log.e("AdPieSDK-1.14.1", "" + exception0.toString(), new Throwable(exception0));
                return;
            }
            Log.e(("AdPieSDK-1.14.1-" + s), "" + exception0.toString(), new Throwable(exception0));
        }
    }

    public static void i(String s, String s1) {
        AdPieLog.info(s, s1);
    }

    private static void info(String s, String s1) {
        if(AdPieLog.logEnable && AdPieLog.logLevel <= 4) {
            if(s1 == null) {
                s1 = "null";
            }
            int v = 0;
            if(TextUtils.isEmpty(s)) {
                while(v < s1.length()) {
                    Log.i("AdPieSDK-1.14.1", s1.substring(v, Math.min(s1.length(), v + 0x800)));
                    v += 0x800;
                }
                return;
            }
            while(v < s1.length()) {
                Log.i(("AdPieSDK-1.14.1-" + s), s1.substring(v, Math.min(s1.length(), v + 0x800)));
                v += 0x800;
            }
        }
    }

    public static void setLogEnable(boolean z) {
        AdPieLog.logEnable = z;
    }

    public static void setLogLevel(int v) {
        AdPieLog.logLevel = v;
    }
}

