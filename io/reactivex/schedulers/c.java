package io.reactivex.schedulers;

import d3.f;
import io.reactivex.J;
import io.reactivex.disposables.d;
import io.reactivex.internal.disposables.e;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class c extends J {
    final class a extends io.reactivex.J.c {
        final class io.reactivex.schedulers.c.a.a implements Runnable {
            final b a;
            final a b;

            io.reactivex.schedulers.c.a.a(b c$b0) {
                this.a = c$b0;
            }

            @Override
            public void run() {
                c.this.b.remove(this.a);
            }
        }

        volatile boolean a;
        final c b;

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.a;
        }

        @Override  // io.reactivex.J$c
        public long b(@f TimeUnit timeUnit0) {
            return c.this.e(timeUnit0);
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c c(@f Runnable runnable0) {
            if(this.a) {
                return e.a;
            }
            long v = c.this.c;
            c.this.c = v + 1L;
            b c$b0 = new b(this, 0L, runnable0, v);
            c.this.b.add(c$b0);
            return d.f(new io.reactivex.schedulers.c.a.a(this, c$b0));
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
            if(this.a) {
                return e.a;
            }
            long v1 = c.this.d;
            long v2 = timeUnit0.toNanos(v);
            long v3 = c.this.c;
            c.this.c = v3 + 1L;
            b c$b0 = new b(this, v1 + v2, runnable0, v3);
            c.this.b.add(c$b0);
            return d.f(new io.reactivex.schedulers.c.a.a(this, c$b0));
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.a = true;
        }
    }

    static final class b implements Comparable {
        final long a;
        final Runnable b;
        final a c;
        final long d;

        b(a c$a0, long v, Runnable runnable0, long v1) {
            this.a = v;
            this.b = runnable0;
            this.c = c$a0;
            this.d = v1;
        }

        public int a(b c$b0) {
            return this.a == c$b0.a ? io.reactivex.internal.functions.b.b(this.d, c$b0.d) : io.reactivex.internal.functions.b.b(this.a, c$b0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((b)object0));
        }

        @Override
        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", this.a, this.b.toString());
        }
    }

    final Queue b;
    long c;
    volatile long d;

    public c() {
        this.b = new PriorityBlockingQueue(11);
    }

    public c(long v, TimeUnit timeUnit0) {
        this.b = new PriorityBlockingQueue(11);
        this.d = timeUnit0.toNanos(v);
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.J.c d() {
        return new a(this);
    }

    @Override  // io.reactivex.J
    public long e(@f TimeUnit timeUnit0) {
        return timeUnit0.convert(this.d, TimeUnit.NANOSECONDS);
    }

    public void l(long v, TimeUnit timeUnit0) {
        this.m(this.d + timeUnit0.toNanos(v), TimeUnit.NANOSECONDS);
    }

    public void m(long v, TimeUnit timeUnit0) {
        this.o(timeUnit0.toNanos(v));
    }

    public void n() {
        this.o(this.d);
    }

    private void o(long v) {
        b c$b0;
        while((c$b0 = (b)this.b.peek()) != null) {
            long v1 = c$b0.a;
            if(v1 > v) {
                break;
            }
            if(v1 == 0L) {
                v1 = this.d;
            }
            this.d = v1;
            this.b.remove(c$b0);
            if(!c$b0.c.a) {
                c$b0.b.run();
            }
        }
        this.d = v;
    }
}

