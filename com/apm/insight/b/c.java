package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.i;
import com.apm.insight.runtime.m;

public final class c {
    private final b a;
    private static long b;
    private boolean c;
    private final Runnable d;

    static {
    }

    c(b b0) {
        this.c = false;
        com.apm.insight.b.c.1 c$10 = new Runnable() {
            private c a;

            @Override
            public final void run() {
                if(c.this.c) {
                    return;
                }
                c.this.a.d();
                c.b = SystemClock.uptimeMillis();
                if(!i.a().b()) {
                }
                m.a().a(c.this.d, 500L);
                com.apm.insight.runtime.b.a(0L);
            }
        };
        this.d = c$10;
        this.a = b0;
        m.a().a(c$10, 5000L);
    }

    public final void a() {
        if(this.c) {
            return;
        }
        m.a().a(this.d, 5000L);
    }

    public final void b() {
        this.c = true;
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - c.b <= 15000L;
    }

    static long d() [...] // 潜在的解密器
}

