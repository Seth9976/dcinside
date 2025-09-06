package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.b;
import com.bumptech.glide.load.g;
import java.io.File;
import java.io.IOException;
import jeb.synthetic.FIN;

public class e implements a {
    private final m a;
    private final File b;
    private final long c;
    private final c d;
    private b e;
    private static final String f = "DiskLruCacheWrapper";
    private static final int g = 1;
    private static final int h = 1;
    private static e i;

    @Deprecated
    protected e(File file0, long v) {
        this.d = new c();
        this.b = file0;
        this.c = v;
        this.a = new m();
    }

    @Override  // com.bumptech.glide.load.engine.cache.a
    public void a(g g0, com.bumptech.glide.load.engine.cache.a.b a$b0) {
        com.bumptech.glide.disklrucache.b.c b$c0;
        String s = this.a.b(g0);
        this.d.a(s);
        try {
            if(Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + s + " for for Key: " + g0);
            }
            try {
                b b0 = this.f();
                if(b0.Q(s) == null) {
                    b$c0 = b0.w(s);
                    if(b$c0 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + s);
                    }
                    goto label_11;
                }
                return;
            }
            catch(IOException iOException0) {
                goto label_21;
            }
            try {
            label_11:
                if(a$b0.a(b$c0.f(0))) {
                    b$c0.e();
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    b$c0.b();
                    throw throwable0;
                label_18:
                    b$c0.b();
                    return;
                }
                catch(IOException iOException0) {
                }
            }
        label_21:
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", iOException0);
            }
        }
        finally {
            this.d.b(s);
        }
    }

    @Override  // com.bumptech.glide.load.engine.cache.a
    public File b(g g0) {
        String s = this.a.b(g0);
        if(Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + s + " for for Key: " + g0);
        }
        try {
            com.bumptech.glide.disklrucache.b.e b$e0 = this.f().Q(s);
            if(b$e0 != null) {
                return b$e0.b(0);
            }
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", iOException0);
            }
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.cache.a
    public void c(g g0) {
        String s = this.a.b(g0);
        try {
            this.f().x0(s);
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", iOException0);
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.cache.a
    public void clear() {
        int v;
        __monitor_enter(this);
        try {
            try {
                v = FIN.finallyOpen$NT();
                this.f().t();
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", iOException0);
                }
            }
        }
        catch(Throwable throwable0) {
            this.g();
            FIN.finallyExec$NT(v);
            throw throwable0;
        }
        this.g();
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(this);
        FIN.finallyCodeEnd$NT(v);
    }

    public static a d(File file0, long v) {
        return new e(file0, v);
    }

    @Deprecated
    public static a e(File file0, long v) {
        synchronized(e.class) {
            if(e.i == null) {
                e.i = new e(file0, v);
            }
            return e.i;
        }
    }

    private b f() throws IOException {
        synchronized(this) {
            if(this.e == null) {
                this.e = b.e0(this.b, 1, 1, this.c);
            }
            return this.e;
        }
    }

    private void g() {
        synchronized(this) {
            this.e = null;
        }
    }
}

