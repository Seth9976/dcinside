package com.tiktok.util;

import android.util.Log;
import com.tiktok.b.d;

public class f {
    public final d a;
    private final String b;

    public f(String s, d b$d0) {
        this.b = s;
        this.a = b$d0;
    }

    public void a(String s, Object[] arr_object) {
        if(this.e(d.d)) {
            String s1 = this.d(s, arr_object);
            if(s1.length() > 1000) {
                Log.d(this.b, s1.substring(0, 1000));
                this.a(s1.substring(1000), new Object[0]);
                return;
            }
            Log.d(this.b, s1);
        }
    }

    public void b(Throwable throwable0, String s, Object[] arr_object) {
        if(this.e(d.b)) {
            Log.e(this.b, this.d(s, arr_object), throwable0);
        }
    }

    public void c(String s, Object[] arr_object) {
        if(this.e(d.b)) {
            String s1 = this.d(s, arr_object);
            if(s1.length() > 1000) {
                Log.i(this.b, s1.substring(0, 1000));
                this.c(s1.substring(1000), new Object[0]);
                return;
            }
            Log.i(this.b, s1);
        }
    }

    private String d(String s, Object[] arr_object) {
        if(s == null) {
            return "null";
        }
        return arr_object.length == 0 ? s : String.format(s, arr_object);
    }

    private boolean e(d b$d0) {
        return this.a.ordinal() >= b$d0.ordinal();
    }

    public void f(String s, Object[] arr_object) {
        if(this.e(d.c)) {
            Log.w(this.b, this.d(s, arr_object));
        }
    }
}

