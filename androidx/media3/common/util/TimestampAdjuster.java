package androidx.media3.common.util;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeoutException;

@UnstableApi
public final class TimestampAdjuster {
    @GuardedBy("this")
    private long a;
    @GuardedBy("this")
    private long b;
    @GuardedBy("this")
    private long c;
    private final ThreadLocal d;
    public static final long e = 0x7FFFFFFFFFFFFFFFL;
    public static final long f = 0x7FFFFFFFFFFFFFFEL;
    private static final long g = 0x200000000L;

    public TimestampAdjuster(long v) {
        this.d = new ThreadLocal();
        this.i(v);
    }

    public long a(long v) {
        synchronized(this) {
            if(v == 0x8000000000000001L) {
                return 0x8000000000000001L;
            }
            if(!this.g()) {
                this.b = (this.a == 0x7FFFFFFFFFFFFFFEL ? ((long)(((Long)Assertions.g(((Long)this.d.get()))))) : this.a) - v;
                this.notifyAll();
            }
            this.c = v;
            return v + this.b;
        }
    }

    public long b(long v) {
        synchronized(this) {
            return v == 0x8000000000000001L ? 0x8000000000000001L : this.a(v * 1000000L / 90000L);
        }
    }

    public long c(long v) {
        synchronized(this) {
            return v == 0x8000000000000001L ? 0x8000000000000001L : this.a(v * 1000000L / 90000L);
        }
    }

    public long d() {
        synchronized(this) {
        }
        return this.a != 0x7FFFFFFFFFFFFFFFL && this.a != 0x7FFFFFFFFFFFFFFEL ? this.a : 0x8000000000000001L;
    }

    public long e() {
        synchronized(this) {
            long v1 = this.c;
            return v1 == 0x8000000000000001L ? this.d() : v1 + this.b;
        }
    }

    public long f() {
        synchronized(this) {
        }
        return this.b;
    }

    public boolean g() {
        synchronized(this) {
        }
        return this.b != 0x8000000000000001L;
    }

    public static long h(long v) [...] // Inlined contents

    public void i(long v) {
        synchronized(this) {
            this.a = v;
            this.b = v == 0x7FFFFFFFFFFFFFFFL ? 0L : 0x8000000000000001L;
            this.c = 0x8000000000000001L;
        }
    }

    public void j(boolean z, long v, long v1) throws InterruptedException, TimeoutException {
        synchronized(this) {
            Assertions.i(this.a == 0x7FFFFFFFFFFFFFFEL);
            if(this.g()) {
                return;
            }
            if(z) {
                this.d.set(v);
            }
            else {
                long v3 = 0L;
                long v4 = v1;
                while(!this.g()) {
                    if(v1 == 0L) {
                        this.wait();
                    }
                    else {
                        Assertions.i(v4 > 0L);
                        long v5 = SystemClock.elapsedRealtime();
                        this.wait(v4);
                        v3 += SystemClock.elapsedRealtime() - v5;
                        if(v3 >= v1 && !this.g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + v1 + " milliseconds");
                        }
                        v4 = v1 - v3;
                    }
                }
            }
        }
    }

    public static long k(long v) [...] // Inlined contents

    public static long l(long v) {
        return v * 90000L / 1000000L % 0x200000000L;
    }
}

