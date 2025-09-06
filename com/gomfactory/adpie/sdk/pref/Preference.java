package com.gomfactory.adpie.sdk.pref;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.util.AdPieLog;

public class Preference {
    public static final String TAG = "Preference";

    static {
    }

    public static void clear(Context context0) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).edit();
            sharedPreferences$Editor0.clear();
            sharedPreferences$Editor0.commit();
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
        }
    }

    public static boolean getBooleanValue(Context context0, String s, boolean z) {
        try {
            return context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).getBoolean(s, z);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
            return z;
        }
    }

    public static int getIntValue(Context context0, String s, int v) {
        try {
            return context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).getInt(s, v);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
            return v;
        }
    }

    public static long getLongValue(Context context0, String s, long v) {
        try {
            return context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).getLong(s, v);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
            return v;
        }
    }

    public static String getStringValue(Context context0, String s, String s1) {
        try {
            return context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).getString(s, s1);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
            return s1;
        }
    }

    public static void putBoolean(Context context0, String s, boolean z) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).edit();
            sharedPreferences$Editor0.putBoolean(s, z);
            sharedPreferences$Editor0.apply();
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
        }
    }

    public static void putInt(Context context0, String s, int v) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).edit();
            sharedPreferences$Editor0.putInt(s, v);
            sharedPreferences$Editor0.apply();
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
        }
    }

    public static void putLong(Context context0, String s, long v) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).edit();
            sharedPreferences$Editor0.putLong(s, v);
            sharedPreferences$Editor0.apply();
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
        }
    }

    public static void putString(Context context0, String s, String s1) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.gomfactory.adpie.sdk", 0).edit();
            sharedPreferences$Editor0.putString(s, s1);
            sharedPreferences$Editor0.apply();
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("Preference", exception0);
            }
        }
    }
}

