package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c extends b {
    class com.facebook.fresco.animation.backend.c.a implements Runnable {
        final c a;

        @Override
        public void run() {
            synchronized(c.this) {
                c.this.k = false;
                if(!c.this.A()) {
                    c.this.B();
                }
                else if(c.this.o != null) {
                    c.this.o.o();
                }
            }
        }
    }

    public interface com.facebook.fresco.animation.backend.c.b {
        void o();
    }

    private final d i;
    private final ScheduledExecutorService j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    @h
    private com.facebook.fresco.animation.backend.c.b o;
    private final Runnable p;
    @VisibleForTesting
    static final long q = 2000L;
    @VisibleForTesting
    static final long r = 1000L;

    private c(@h com.facebook.fresco.animation.backend.a a0, @h com.facebook.fresco.animation.backend.c.b c$b0, d d0, ScheduledExecutorService scheduledExecutorService0) {
        super(a0);
        this.k = false;
        this.m = 2000L;
        this.n = 1000L;
        this.p = new com.facebook.fresco.animation.backend.c.a(this);
        this.o = c$b0;
        this.i = d0;
        this.j = scheduledExecutorService0;
    }

    private boolean A() {
        return this.i.now() - this.l > this.m;
    }

    private void B() {
        synchronized(this) {
            if(!this.k) {
                this.k = true;
                this.j.schedule(this.p, this.n, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void C(long v) {
        this.n = v;
    }

    public void D(@h com.facebook.fresco.animation.backend.c.b c$b0) {
        this.o = c$b0;
    }

    public void E(long v) {
        this.m = v;
    }

    @Override  // com.facebook.fresco.animation.backend.b
    public boolean n(Drawable drawable0, Canvas canvas0, int v) {
        this.l = this.i.now();
        boolean z = super.n(drawable0, canvas0, v);
        this.B();
        return z;
    }

    public static b v(com.facebook.fresco.animation.backend.a a0, d d0, ScheduledExecutorService scheduledExecutorService0) {
        return c.w(a0, ((com.facebook.fresco.animation.backend.c.b)a0), d0, scheduledExecutorService0);
    }

    public static b w(com.facebook.fresco.animation.backend.a a0, com.facebook.fresco.animation.backend.c.b c$b0, d d0, ScheduledExecutorService scheduledExecutorService0) {
        return new c(a0, c$b0, d0, scheduledExecutorService0);
    }

    public long x() {
        return this.n;
    }

    public long y() {
        return this.m;
    }
}

