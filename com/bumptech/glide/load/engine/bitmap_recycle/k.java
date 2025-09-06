package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class k implements e {
    interface a {
        void a(Bitmap arg1);

        void b(Bitmap arg1);
    }

    static final class b implements a {
        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.k$a
        public void a(Bitmap bitmap0) {
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.k$a
        public void b(Bitmap bitmap0) {
        }
    }

    static class c implements a {
        private final Set a;

        private c() {
            this.a = DesugarCollections.synchronizedSet(new HashSet());
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.k$a
        public void a(Bitmap bitmap0) {
            if(this.a.contains(bitmap0)) {
                throw new IllegalStateException("Can\'t add already added bitmap: " + bitmap0 + " [" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "]");
            }
            this.a.add(bitmap0);
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.k$a
        public void b(Bitmap bitmap0) {
            if(!this.a.contains(bitmap0)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.a.remove(bitmap0);
        }
    }

    private final l a;
    private final Set b;
    private final long c;
    private final a d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;
    private static final String k = "LruBitmapPool";
    private static final Bitmap.Config l;

    static {
        k.l = Bitmap.Config.ARGB_8888;
    }

    public k(long v) {
        this(v, k.p(), k.o());
    }

    k(long v, l l0, Set set0) {
        this.c = v;
        this.e = v;
        this.a = l0;
        this.b = set0;
        this.d = new b();
    }

    public k(long v, Set set0) {
        this(v, k.p(), set0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long a() {
        return this.e;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public void b(int v) {
        if(Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + v);
        }
        if(v >= 40 || Build.VERSION.SDK_INT >= 23 && v >= 20) {
            this.c();
        }
        else if(v >= 20 || v == 15) {
            this.v(this.a() / 2L);
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c() {
        if(Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        this.v(0L);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void d(float f) {
        synchronized(this) {
            this.e = (long)Math.round(((float)this.c) * f);
            this.l();
        }
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void e(Bitmap bitmap0) {
        synchronized(this) {
            if(bitmap0 != null) {
                if(bitmap0.isRecycled()) {
                    throw new IllegalStateException("Cannot pool recycled bitmap");
                }
                if(bitmap0.isMutable() && ((long)this.a.b(bitmap0)) <= this.e) {
                    Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
                    if(this.b.contains(bitmap$Config0)) {
                        int v1 = this.a.b(bitmap0);
                        this.a.e(bitmap0);
                        this.d.a(bitmap0);
                        ++this.i;
                        this.f += (long)v1;
                        if(Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.c(bitmap0));
                        }
                        this.j();
                        this.l();
                        return;
                    }
                }
                if(Log.isLoggable("LruBitmapPool", 2)) {
                    Bitmap.Config bitmap$Config1 = bitmap0.getConfig();
                    Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.c(bitmap0) + ", is mutable: " + bitmap0.isMutable() + ", is allowed config: " + this.b.contains(bitmap$Config1));
                }
                bitmap0.recycle();
                return;
            }
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap f(int v, int v1, Bitmap.Config bitmap$Config0) {
        Bitmap bitmap0 = this.q(v, v1, bitmap$Config0);
        if(bitmap0 != null) {
            bitmap0.eraseColor(0);
            return bitmap0;
        }
        return k.i(v, v1, bitmap$Config0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap g(int v, int v1, Bitmap.Config bitmap$Config0) {
        Bitmap bitmap0 = this.q(v, v1, bitmap$Config0);
        return bitmap0 == null ? k.i(v, v1, bitmap$Config0) : bitmap0;
    }

    @TargetApi(26)
    private static void h(Bitmap.Config bitmap$Config0) {
        if(Build.VERSION.SDK_INT < 26) {
            return;
        }
        if(bitmap$Config0 == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + bitmap$Config0 + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    private static Bitmap i(int v, int v1, @Nullable Bitmap.Config bitmap$Config0) {
        if(bitmap$Config0 == null) {
            bitmap$Config0 = k.l;
        }
        return Bitmap.createBitmap(v, v1, bitmap$Config0);
    }

    private void j() {
        if(Log.isLoggable("LruBitmapPool", 2)) {
            this.k();
        }
    }

    private void k() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    private void l() {
        this.v(this.e);
    }

    public long m() {
        return (long)this.j;
    }

    public long n() {
        return this.f;
    }

    @TargetApi(26)
    private static Set o() {
        HashSet hashSet0 = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int v = Build.VERSION.SDK_INT;
        hashSet0.add(null);
        if(v >= 26) {
            hashSet0.remove(Bitmap.Config.HARDWARE);
        }
        return DesugarCollections.unmodifiableSet(hashSet0);
    }

    private static l p() {
        return new o();
    }

    @Nullable
    private Bitmap q(int v, int v1, @Nullable Bitmap.Config bitmap$Config0) {
        synchronized(this) {
            k.h(bitmap$Config0);
            Bitmap bitmap0 = this.a.f(v, v1, (bitmap$Config0 == null ? k.l : bitmap$Config0));
            if(bitmap0 == null) {
                if(Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.a.a(v, v1, bitmap$Config0));
                }
                ++this.h;
            }
            else {
                ++this.g;
                this.f -= (long)this.a.b(bitmap0);
                this.d.b(bitmap0);
                k.u(bitmap0);
            }
            if(Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.a.a(v, v1, bitmap$Config0));
            }
            this.j();
            return bitmap0;
        }
    }

    public long r() {
        return (long)this.g;
    }

    @TargetApi(19)
    private static void s(Bitmap bitmap0) {
        bitmap0.setPremultiplied(true);
    }

    public long t() {
        return (long)this.h;
    }

    private static void u(Bitmap bitmap0) {
        bitmap0.setHasAlpha(true);
        k.s(bitmap0);
    }

    private void v(long v) {
        synchronized(this) {
            while(this.f > v) {
                Bitmap bitmap0 = this.a.removeLast();
                if(bitmap0 == null) {
                    if(Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        this.k();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.b(bitmap0);
                this.f -= (long)this.a.b(bitmap0);
                ++this.j;
                if(Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.c(bitmap0));
                }
                this.j();
                bitmap0.recycle();
            }
        }
    }
}

