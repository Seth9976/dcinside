package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.j.a;
import rx.o;

public final class i {
    public interface b {
        long nowNanos();
    }

    public static final long a;

    static {
        i.a = TimeUnit.MINUTES.toNanos(15L);
    }

    private i() {
        throw new IllegalStateException("No instances!");
    }

    public static o a(a j$a0, rx.functions.a a0, long v, long v1, TimeUnit timeUnit0, b i$b0) {
        static final class rx.internal.schedulers.i.a implements rx.functions.a {
            long a;
            long b;
            long c;
            final long d;
            final long e;
            final rx.functions.a f;
            final F4.b g;
            final b h;
            final a i;
            final long j;

            rx.internal.schedulers.i.a(long v, long v1, rx.functions.a a0, F4.b b0, b i$b0, a j$a0, long v2) {
                this.d = v;
                this.e = v1;
                this.f = a0;
                this.g = b0;
                this.h = i$b0;
                this.i = j$a0;
                this.j = v2;
                super();
                this.b = v;
                this.c = v1;
            }

            @Override  // rx.functions.a
            public void call() {
                long v5;
                this.f.call();
                if(!this.g.j()) {
                    long v = this.h == null ? TimeUnit.MILLISECONDS.toNanos(this.i.a()) : this.h.nowNanos();
                    long v1 = i.a;
                    long v2 = this.b;
                    if(v + v1 >= v2) {
                        long v3 = this.j;
                        if(v < v2 + v3 + v1) {
                            long v4 = this.a + 1L;
                            this.a = v4;
                            v5 = this.c + v4 * v3;
                            goto label_17;
                        }
                        goto label_12;
                    }
                    else {
                    label_12:
                        long v6 = v + this.j;
                        long v7 = this.a + 1L;
                        this.a = v7;
                        this.c = v6 - this.j * v7;
                        v5 = v6;
                    }
                label_17:
                    this.b = v;
                    o o0 = this.i.d(this, v5 - v, TimeUnit.NANOSECONDS);
                    this.g.b(o0);
                }
            }
        }

        long v2 = timeUnit0.toNanos(v1);
        long v3 = i$b0 == null ? TimeUnit.MILLISECONDS.toNanos(j$a0.a()) : i$b0.nowNanos();
        long v4 = timeUnit0.toNanos(v);
        F4.b b0 = new F4.b();
        F4.b b1 = new F4.b(b0);
        b0.b(j$a0.d(new rx.internal.schedulers.i.a(v3, v4 + v3, a0, b1, i$b0, j$a0, v2), v, timeUnit0));
        return b1;
    }
}

