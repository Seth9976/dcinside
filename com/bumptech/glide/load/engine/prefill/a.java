package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.h;
import com.bumptech.glide.util.o;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class a implements Runnable {
    @VisibleForTesting
    static class com.bumptech.glide.load.engine.prefill.a.a {
        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    static final class b implements g {
        @Override  // com.bumptech.glide.load.g
        public void b(@NonNull MessageDigest messageDigest0) {
            throw new UnsupportedOperationException();
        }
    }

    private final e a;
    private final j b;
    private final c c;
    private final com.bumptech.glide.load.engine.prefill.a.a d;
    private final Set e;
    private final Handler f;
    private long g;
    private boolean h;
    @VisibleForTesting
    static final String i = "PreFillRunner";
    private static final com.bumptech.glide.load.engine.prefill.a.a j = null;
    static final long k = 0x20L;
    static final long l = 40L;
    static final int m = 4;
    static final long n;

    static {
        a.j = new com.bumptech.glide.load.engine.prefill.a.a();
        a.n = TimeUnit.SECONDS.toMillis(1L);
    }

    public a(e e0, j j0, c c0) {
        Handler handler0 = new Handler(Looper.getMainLooper());
        this(e0, j0, c0, a.j, handler0);
    }

    @VisibleForTesting
    a(e e0, j j0, c c0, com.bumptech.glide.load.engine.prefill.a.a a$a0, Handler handler0) {
        this.e = new HashSet();
        this.g = 40L;
        this.a = e0;
        this.b = j0;
        this.c = c0;
        this.d = a$a0;
        this.f = handler0;
    }

    @VisibleForTesting
    boolean a() {
        Bitmap bitmap0;
        long v = this.d.a();
        while(!this.c.b() && !this.e(v)) {
            d d0 = this.c.c();
            if(this.e.contains(d0)) {
                bitmap0 = Bitmap.createBitmap(d0.d(), d0.b(), d0.a());
            }
            else {
                this.e.add(d0);
                bitmap0 = this.a.g(d0.d(), d0.b(), d0.a());
            }
            int v1 = o.i(bitmap0);
            if(this.c() >= ((long)v1)) {
                b a$b0 = new b();
                h h0 = h.c(bitmap0, this.a);
                this.b.f(a$b0, h0);
            }
            else {
                this.a.e(bitmap0);
            }
            if(Log.isLoggable("PreFillRunner", 3)) {
                Log.d("PreFillRunner", "allocated [" + d0.d() + "x" + d0.b() + "] " + d0.a() + " size: " + v1);
            }
        }
        return !this.h && !this.c.b();
    }

    public void b() {
        this.h = true;
    }

    private long c() {
        return this.b.a() - this.b.e();
    }

    private long d() {
        long v = this.g;
        this.g = Math.min(4L * v, a.n);
        return v;
    }

    private boolean e(long v) {
        return this.d.a() - v >= 0x20L;
    }

    @Override
    public void run() {
        if(this.a()) {
            long v = this.d();
            this.f.postDelayed(this, v);
        }
    }
}

