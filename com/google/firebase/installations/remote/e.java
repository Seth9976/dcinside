package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.u;
import java.util.concurrent.TimeUnit;

class e {
    private final u a;
    @GuardedBy("this")
    private long b;
    @GuardedBy("this")
    private int c;
    private static final long d;
    private static final long e;

    static {
        e.d = TimeUnit.HOURS.toMillis(24L);
        e.e = TimeUnit.MINUTES.toMillis(30L);
    }

    e() {
        this.a = u.c();
    }

    e(u u0) {
        this.a = u0;
    }

    private long a(int v) {
        synchronized(this) {
            if(!e.c(v)) {
                return e.d;
            }
        }
        return (long)Math.min(Math.pow(2.0, this.c) + 632.0, e.e);
    }

    public boolean b() {
        synchronized(this) {
            return this.c == 0 || this.a.a() > this.b;
        }
    }

    private static boolean c(int v) {
        return v == 429 || v >= 500 && v < 600;
    }

    private static boolean d(int v) {
        return v >= 200 && v < 300 || (v == 401 || v == 404);
    }

    private void e() {
        synchronized(this) {
            this.c = 0;
        }
    }

    public void f(int v) {
        synchronized(this) {
            if(e.d(v)) {
                this.e();
                return;
            }
            ++this.c;
            long v2 = this.a(v);
            this.b = this.a.a() + v2;
        }
    }
}

