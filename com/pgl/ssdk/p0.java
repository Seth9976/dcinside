package com.pgl.ssdk;

import android.os.Handler;

public class p0 {
    public static Handler a() {
        return y0.a().b();
    }

    public static void a(Runnable runnable0) {
        if(runnable0 != null) {
            Handler handler0 = p0.a();
            if(handler0 != null) {
                handler0.post(runnable0);
            }
        }
    }

    public static Handler b() {
        return y0.a().c();
    }

    public static void b(Runnable runnable0) {
        if(runnable0 != null) {
            Handler handler0 = p0.b();
            if(handler0 != null) {
                handler0.post(runnable0);
            }
        }
    }
}

