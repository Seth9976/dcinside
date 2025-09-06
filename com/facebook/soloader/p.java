package com.facebook.soloader;

import android.os.Build.VERSION;
import android.util.Log;

public class p {
    public static void a(String s, String s1) {
        if(p.g(s, 3)) {
            Log.d(s, s1);
        }
    }

    public static void b(String s, String s1, Throwable throwable0) {
        if(p.g(s, 3)) {
            Log.d(s, s1, throwable0);
        }
    }

    public static void c(String s, String s1) {
        Log.e(s, s1);
    }

    public static void d(String s, String s1, Throwable throwable0) {
        Log.e(s, s1, throwable0);
    }

    public static void e(String s, String s1) {
        if(p.g(s, 4)) {
            Log.i(s, s1);
        }
    }

    public static void f(String s, String s1, Throwable throwable0) {
        if(p.g(s, 4)) {
            Log.i(s, s1, throwable0);
        }
    }

    private static boolean g(String s, int v) {
        return Build.VERSION.SDK_INT > 25 || s.length() <= 23 ? Log.isLoggable(s, v) : Log.isLoggable(s.substring(0, 23), v);
    }

    public static void h(String s, String s1) {
        if(p.g(s, 2)) {
            Log.v(s, s1);
        }
    }

    public static void i(String s, String s1, Throwable throwable0) {
        if(p.g(s, 2)) {
            Log.v(s, s1, throwable0);
        }
    }

    public static void j(String s, String s1) {
        Log.w(s, s1);
    }

    public static void k(String s, String s1, Throwable throwable0) {
        Log.w(s, s1, throwable0);
    }
}

