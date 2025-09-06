package com.apm.insight.j;

import android.os.Handler;

public abstract class a implements Runnable {
    private Handler a;
    private final long b;
    private final long c;

    a(Handler handler0, long v) {
        this.a = handler0;
        this.b = 0L;
        this.c = v;
    }

    final void a() {
        this.a.post(this);
    }

    final void a(long v) {
        if(v > 0L) {
            this.a.postDelayed(this, v);
            return;
        }
        this.a.post(this);
    }

    final long b() {
        return this.c;
    }
}

