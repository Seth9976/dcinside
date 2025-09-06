package io.reactivex.internal.schedulers;

import d3.f;
import io.reactivex.J;
import io.reactivex.disposables.d;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class s extends J {
    static final class a implements Runnable {
        private final Runnable a;
        private final c b;
        private final long c;

        a(Runnable runnable0, c s$c0, long v) {
            this.a = runnable0;
            this.b = s$c0;
            this.c = v;
        }

        @Override
        public void run() {
            if(!this.b.d) {
                long v = this.b.b(TimeUnit.MILLISECONDS);
                long v1 = this.c;
                if(v1 > v) {
                    try {
                        Thread.sleep(v1 - v);
                    }
                    catch(InterruptedException interruptedException0) {
                        Thread.currentThread().interrupt();
                        io.reactivex.plugins.a.Y(interruptedException0);
                        return;
                    }
                }
                if(!this.b.d) {
                    this.a.run();
                }
            }
        }
    }

    static final class b implements Comparable {
        final Runnable a;
        final long b;
        final int c;
        volatile boolean d;

        b(Runnable runnable0, Long long0, int v) {
            this.a = runnable0;
            this.b = (long)long0;
            this.c = v;
        }

        public int a(b s$b0) {
            int v = io.reactivex.internal.functions.b.b(this.b, s$b0.b);
            return v == 0 ? io.reactivex.internal.functions.b.a(this.c, s$b0.c) : v;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((b)object0));
        }
    }

    static final class c extends io.reactivex.J.c implements io.reactivex.disposables.c {
        final class io.reactivex.internal.schedulers.s.c.a implements Runnable {
            final b a;
            final c b;

            io.reactivex.internal.schedulers.s.c.a(b s$b0) {
                this.a = s$b0;
            }

            @Override
            public void run() {
                this.a.d = true;
                c.this.a.remove(this.a);
            }
        }

        final PriorityBlockingQueue a;
        private final AtomicInteger b;
        final AtomicInteger c;
        volatile boolean d;

        c() {
            this.a = new PriorityBlockingQueue();
            this.b = new AtomicInteger();
            this.c = new AtomicInteger();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d;
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c c(@f Runnable runnable0) {
            return this.f(runnable0, this.b(TimeUnit.MILLISECONDS));
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
            long v1 = this.b(TimeUnit.MILLISECONDS) + timeUnit0.toMillis(v);
            return this.f(new a(runnable0, this, v1), v1);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d = true;
        }

        io.reactivex.disposables.c f(Runnable runnable0, long v) {
            if(this.d) {
                return e.a;
            }
            b s$b0 = new b(runnable0, v, this.c.incrementAndGet());
            this.a.add(s$b0);
            if(this.b.getAndIncrement() == 0) {
                int v1 = 1;
                while(true) {
                    if(this.d) {
                        this.a.clear();
                        return e.a;
                    }
                    b s$b1 = (b)this.a.poll();
                    if(s$b1 == null) {
                        v1 = this.b.addAndGet(-v1);
                        if(v1 != 0) {
                            continue;
                        }
                        return e.a;
                    }
                    if(!s$b1.d) {
                        s$b1.a.run();
                    }
                }
            }
            return d.f(new io.reactivex.internal.schedulers.s.c.a(this, s$b0));
        }
    }

    private static final s b;

    static {
        s.b = new s();
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.J.c d() {
        return new c();
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c f(@f Runnable runnable0) {
        io.reactivex.plugins.a.b0(runnable0).run();
        return e.a;
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c g(@f Runnable runnable0, long v, TimeUnit timeUnit0) {
        try {
            timeUnit0.sleep(v);
            io.reactivex.plugins.a.b0(runnable0).run();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            io.reactivex.plugins.a.Y(interruptedException0);
        }
        return e.a;
    }

    public static s l() {
        return s.b;
    }
}

