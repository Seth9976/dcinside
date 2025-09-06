package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

public class v0 {
    private static SharedPreferences a;

    public static int a(Context context0, String s, int v) {
        SharedPreferences sharedPreferences0 = v0.a(context0);
        return sharedPreferences0 == null ? v : sharedPreferences0.getInt(s, v);
    }

    public static SharedPreferences a(Context context0) {
        if(v0.a == null) {
            v0.a = context0.getSharedPreferences("ss_config", 0);
        }
        return v0.a;
    }

    public static String a(Context context0, String s) {
        return v0.a(context0, s, "");
    }

    public static String a(Context context0, String s, String s1) {
        SharedPreferences sharedPreferences0 = v0.a(context0);
        return sharedPreferences0 == null ? s1 : sharedPreferences0.getString(s, s1);
    }

    public static void b(Context context0, String s, int v) {
        SharedPreferences sharedPreferences0 = v0.a(context0);
        if(sharedPreferences0 != null) {
            sharedPreferences0.edit().putInt(s, v).apply();
        }
    }

    public static void b(Context context0, String s, String s1) {
        SharedPreferences sharedPreferences0 = v0.a(context0);
        if(sharedPreferences0 != null) {
            sharedPreferences0.edit().putString(s, s1).apply();
        }
    }
}

