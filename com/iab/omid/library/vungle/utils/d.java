package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.vungle.c;

public final class d {
    public static void a(String s) {
        if(c.a.booleanValue() && !TextUtils.isEmpty(s)) {
            Log.i("OMIDLIB", s);
        }
    }

    public static void b(String s, Exception exception0) {
        if(c.a.booleanValue() && !TextUtils.isEmpty(s) || exception0 != null) {
            Log.e("OMIDLIB", s, exception0);
        }
    }

    public static void c(String s) {
        if(c.a.booleanValue() && !TextUtils.isEmpty(s)) {
            Log.w("OMIDLIB", s);
        }
    }
}

