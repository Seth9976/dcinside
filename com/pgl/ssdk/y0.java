package com.pgl.ssdk;

import android.os.HandlerThread;

public class y0 {
    static class a {
    }

    static class b {
        private static final y0 a;

        static {
            b.a = new y0(null);
        }
    }

    private final b1 a;
    private c1 b;

    private y0() {
        this.a = b1.a(2);
    }

    y0(a y0$a0) {
    }

    public static y0 a() {
        return b.a;
    }

    private z0 a(com.pgl.ssdk.c1.a c1$a0, String s) {
        try {
            HandlerThread handlerThread0 = new HandlerThread(s);
            handlerThread0.start();
            return new z0(handlerThread0, c1$a0);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public c1 a(String s) {
        return this.b(null, s);
    }

    public c1 b() {
        if(this.b == null) {
            Class class0 = y0.class;
            __monitor_enter(class0);
            try {
                if(this.b == null) {
                    this.b = this.a("ssdk_net_handler");
                }
                __monitor_exit(class0);
                return this.b;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return this.b;
    }

    public c1 b(com.pgl.ssdk.c1.a c1$a0, String s) {
        c1 c10 = (z0)this.a.a();
        if(c10 != null) {
            ((z0)c10).a(c1$a0);
            ((z0)c10).a(s);
            return c10;
        }
        return this.a(c1$a0, s);
    }

    public c1 c() {
        if(this.b == null) {
            Class class0 = y0.class;
            __monitor_enter(class0);
            try {
                if(this.b == null) {
                    this.b = this.a("ssdk_handler");
                }
                __monitor_exit(class0);
                return this.b;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return this.b;
    }
}

