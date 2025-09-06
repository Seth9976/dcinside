package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.L;
import y4.l;
import z3.j;

public final class p0 {
    private long a;
    private long b;
    private long c;
    private long d;
    @l
    private final ReentrantLock e;
    @l
    private final Condition f;

    public p0() {
        this(System.nanoTime());
    }

    public p0(long v) {
        this.a = v;
        this.c = 0x2000L;
        this.d = 0x40000L;
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.e = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        L.o(condition0, "newCondition(...)");
        this.f = condition0;
    }

    public final long a(long v, long v1) {
        if(this.b == 0L) {
            return v1;
        }
        long v2 = Math.max(this.a - v, 0L);
        long v3 = this.d - this.i(v2);
        if(v3 >= v1) {
            this.a = v + v2 + this.f(v1);
            return v1;
        }
        long v4 = this.c;
        if(v3 >= v4) {
            this.a = v + this.f(this.d);
            return v3;
        }
        long v5 = Math.min(v4, v1);
        long v6 = v2 + this.f(v5 - this.d);
        if(v6 == 0L) {
            this.a = v + this.f(this.d);
            return v5;
        }
        return -v6;
    }

    @j
    public final void b(long v) {
        p0.e(this, v, 0L, 0L, 6, null);
    }

    @j
    public final void c(long v, long v1) {
        p0.e(this, v, v1, 0L, 4, null);
    }

    @j
    public final void d(long v, long v1, long v2) {
        ReentrantLock reentrantLock0 = this.e;
        reentrantLock0.lock();
        try {
            if(v >= 0L && v1 > 0L && v2 >= v1) {
                this.b = v;
                this.c = v1;
                this.d = v2;
                this.f.signalAll();
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static void e(p0 p00, long v, long v1, long v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = p00.c;
        }
        if((v3 & 4) != 0) {
            v2 = p00.d;
        }
        p00.d(v, v1, v2);
    }

    private final long f(long v) {
        return v * 1000000000L / this.b;
    }

    @l
    public final Condition g() {
        return this.f;
    }

    @l
    public final ReentrantLock h() {
        return this.e;
    }

    private final long i(long v) {
        return v * this.b / 1000000000L;
    }

    @l
    public final m0 j(@l m0 m00) {
        public static final class a extends x {
            final p0 a;

            a(m0 m00, p0 p00) {
                this.a = p00;
                super(m00);
            }

            @Override  // okio.x
            public void write(@l okio.l l0, long v) throws IOException {
                L.p(l0, "source");
                while(v > 0L) {
                    try {
                        long v1 = this.a.l(v);
                        super.write(l0, v1);
                        v -= v1;
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        }

        L.p(m00, "sink");
        return new a(m00, this);
    }

    @l
    public final o0 k(@l o0 o00) {
        public static final class b extends y {
            final p0 a;

            b(o0 o00, p0 p00) {
                this.a = p00;
                super(o00);
            }

            @Override  // okio.y
            public long read(@l okio.l l0, long v) {
                L.p(l0, "sink");
                try {
                    return super.read(l0, this.a.l(v));
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }

        L.p(o00, "source");
        return new b(o00, this);
    }

    public final long l(long v) {
        if(v > 0L) {
            ReentrantLock reentrantLock0 = this.e;
            reentrantLock0.lock();
            try {
                long v2;
                while((v2 = this.a(System.nanoTime(), v)) < 0L) {
                    this.f.awaitNanos(-v2);
                }
                return v2;
            }
            finally {
                reentrantLock0.unlock();
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

