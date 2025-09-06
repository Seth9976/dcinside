package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class g {
    private final String a;
    private int b;
    public static final String c = "FirebaseCrashlytics";
    static final g d;

    static {
        g.d = new g("FirebaseCrashlytics");
    }

    public g(String s) {
        this.a = s;
        this.b = 4;
    }

    private boolean a(int v) {
        return this.b <= v || Log.isLoggable(this.a, v);
    }

    public void b(String s) {
        this.c(s, null);
    }

    public void c(String s, Throwable throwable0) {
        if(this.a(3)) {
            Log.d(this.a, s, throwable0);
        }
    }

    public void d(String s) {
        this.e(s, null);
    }

    public void e(String s, Throwable throwable0) {
        if(this.a(6)) {
            Log.e(this.a, s, throwable0);
        }
    }

    public static g f() {
        return g.d;
    }

    public void g(String s) {
        this.h(s, null);
    }

    public void h(String s, Throwable throwable0) {
        if(this.a(4)) {
            Log.i(this.a, s, throwable0);
        }
    }

    public void i(int v, String s) {
        this.j(v, s, false);
    }

    public void j(int v, String s, boolean z) {
        if(z || this.a(v)) {
            Log.println(v, this.a, s);
        }
    }

    public void k(String s) [...] // 潜在的解密器

    public void l(String s, Throwable throwable0) {
        if(this.a(2)) {
            Log.v(this.a, s, throwable0);
        }
    }

    public void m(String s) {
        this.n(s, null);
    }

    public void n(String s, Throwable throwable0) {
        if(this.a(5)) {
            Log.w(this.a, s, throwable0);
        }
    }
}

