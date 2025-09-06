package com.google.firebase.perf.logging;

import android.util.Log;

class c {
    private static final String a = "FirebasePerformance";
    private static c b;

    void a(String s) {
        Log.d("FirebasePerformance", s);
    }

    void b(String s) {
        Log.e("FirebasePerformance", s);
    }

    public static c c() {
        synchronized(c.class) {
            if(c.b == null) {
                c.b = new c();
            }
            return c.b;
        }
    }

    void d(String s) {
        Log.i("FirebasePerformance", s);
    }

    void e(String s) {
        Log.v("FirebasePerformance", s);
    }

    void f(String s) {
        Log.w("FirebasePerformance", s);
    }
}

