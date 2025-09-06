package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.s;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@n(a.a)
@d
public class com.facebook.common.statfs.a {
    public static enum com.facebook.common.statfs.a.a {
        INTERNAL,
        EXTERNAL;

    }

    @h
    private volatile StatFs a;
    @h
    private volatile File b;
    @h
    private volatile StatFs c;
    @h
    private volatile File d;
    @p3.a("lock")
    private long e;
    private final Lock f;
    private volatile boolean g;
    public static final int h = 400;
    public static final long i = 0x19000000L;
    public static final int j = 100;
    public static final long k = 0x6400000L;
    public static final long l = 0x3E800000L;
    private static com.facebook.common.statfs.a m;
    private static final long n;

    static {
        com.facebook.common.statfs.a.n = TimeUnit.MINUTES.toMillis(2L);
    }

    protected com.facebook.common.statfs.a() {
        this.a = null;
        this.c = null;
        this.g = false;
        this.f = new ReentrantLock();
    }

    protected static StatFs a(String s) {
        return new StatFs(s);
    }

    private void b() {
        if(!this.g) {
            this.f.lock();
            try {
                if(!this.g) {
                    this.b = Environment.getDataDirectory();
                    this.d = Environment.getExternalStorageDirectory();
                    this.m();
                    this.g = true;
                }
            }
            finally {
                this.f.unlock();
            }
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    public long c(com.facebook.common.statfs.a.a a$a0) {
        this.b();
        this.j();
        StatFs statFs0 = a$a0 == com.facebook.common.statfs.a.a.a ? this.a : this.c;
        return statFs0 == null ? 0L : statFs0.getBlockSizeLong() * statFs0.getAvailableBlocksLong();
    }

    @SuppressLint({"DeprecatedMethod"})
    public long d(com.facebook.common.statfs.a.a a$a0) {
        this.b();
        this.j();
        StatFs statFs0 = a$a0 == com.facebook.common.statfs.a.a.a ? this.a : this.c;
        return statFs0 == null ? -1L : statFs0.getBlockSizeLong() * statFs0.getFreeBlocksLong();
    }

    public static com.facebook.common.statfs.a e() {
        synchronized(com.facebook.common.statfs.a.class) {
            if(com.facebook.common.statfs.a.m == null) {
                com.facebook.common.statfs.a.m = new com.facebook.common.statfs.a();
            }
            return com.facebook.common.statfs.a.m;
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    public long f(com.facebook.common.statfs.a.a a$a0) {
        this.b();
        this.j();
        StatFs statFs0 = a$a0 == com.facebook.common.statfs.a.a.a ? this.a : this.c;
        return statFs0 == null ? -1L : statFs0.getBlockSizeLong() * statFs0.getBlockCountLong();
    }

    public boolean g() {
        return this.c(com.facebook.common.statfs.a.a.a) > 0x3E800000L;
    }

    public boolean h() {
        return this.c(com.facebook.common.statfs.a.a.a) < 0x19000000L;
    }

    public boolean i() {
        return this.c(com.facebook.common.statfs.a.a.a) < 0x6400000L;
    }

    private void j() {
        if(this.f.tryLock()) {
            try {
                if(SystemClock.uptimeMillis() - this.e > com.facebook.common.statfs.a.n) {
                    this.m();
                }
            }
            finally {
                this.f.unlock();
            }
        }
    }

    public void k() {
        if(this.f.tryLock()) {
            try {
                this.b();
                this.m();
            }
            finally {
                this.f.unlock();
            }
        }
    }

    public boolean l(com.facebook.common.statfs.a.a a$a0, long v) {
        this.b();
        long v1 = this.c(a$a0);
        return v1 <= 0L || v1 < v;
    }

    @p3.a("lock")
    private void m() {
        this.a = this.n(this.a, this.b);
        this.c = this.n(this.c, this.d);
        this.e = SystemClock.uptimeMillis();
    }

    @h
    private StatFs n(@h StatFs statFs0, @h File file0) {
        if(file0 != null && file0.exists()) {
            try {
                if(statFs0 == null) {
                    return com.facebook.common.statfs.a.a(file0.getAbsolutePath());
                }
                statFs0.restat(file0.getAbsolutePath());
                return statFs0;
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
            catch(Throwable throwable0) {
            }
            throw s.d(throwable0);
        }
        return null;
    }
}

