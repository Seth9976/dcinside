package com.iab.omid.library.bytedance2.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.bytedance2.a;

public final class d {
    public static void a(String s) {
        if(a.a.booleanValue() && !TextUtils.isEmpty(s)) {
            Log.i("OMIDLIB", s);
        }
    }

    public static void a(String s, Exception exception0) {
        if(a.a.booleanValue() && !TextUtils.isEmpty(s) || exception0 != null) {
            Log.e("OMIDLIB", s, exception0);
        }
    }

    public static void b(String s) {
        if(a.a.booleanValue() && !TextUtils.isEmpty(s)) {
            Log.w("OMIDLIB", s);
        }
    }
}

