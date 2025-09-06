package com.fsn.cauly;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public class BDPrefUtil {
    public static final String DEF_PREF_NAME = "Default";

    public static void clearAll(Context context0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = BDPrefUtil.getPref(context0, "Default").edit();
        sharedPreferences$Editor0.clear();
        sharedPreferences$Editor0.commit();
    }

    public static boolean getBoolValue(Context context0, String s, boolean z) {
        return BDPrefUtil.getPref(context0, "Default").getBoolean(s, z);
    }

    public static int getIntValue(Context context0, String s, int v) {
        return BDPrefUtil.getPref(context0, "Default").getInt(s, v);
    }

    public static SharedPreferences getPref(Context context0, String s) {
        return context0.getSharedPreferences(s, 0);
    }

    public static String getStrValue(Context context0, String s, String s1) {
        return BDPrefUtil.getPref(context0, "Default").getString(s, s1);
    }

    public static void removeValue(Context context0, String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = BDPrefUtil.getPref(context0, "Default").edit();
        sharedPreferences$Editor0.remove(s);
        sharedPreferences$Editor0.commit();
    }

    public static void setBoolValue(Context context0, String s, boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = BDPrefUtil.getPref(context0, "Default").edit();
        sharedPreferences$Editor0.putBoolean(s, z);
        sharedPreferences$Editor0.commit();
    }

    public static void setIntValue(Context context0, String s, int v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = BDPrefUtil.getPref(context0, "Default").edit();
        sharedPreferences$Editor0.putInt(s, v);
        sharedPreferences$Editor0.commit();
    }

    public static void setStrValue(Context context0, String s, String s1) {
        SharedPreferences.Editor sharedPreferences$Editor0 = BDPrefUtil.getPref(context0, "Default").edit();
        sharedPreferences$Editor0.putString(s, s1);
        sharedPreferences$Editor0.commit();
    }

    public static void setStrValue(SharedPreferences.Editor sharedPreferences$Editor0, String s, String s1) {
        sharedPreferences$Editor0.putString(s, s1);
    }
}

