package io.reactivex.internal.schedulers;

import d3.f;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends J {
    final class a implements Runnable {
        private final b a;
        final d b;

        a(b d$b0) {
            this.a = d$b0;
        }

        @Override
        public void run() {
            c c0 = d.this.f(this.a);
            this.a.b.b(c0);
        }
    }

    static final class b extends AtomicReference implements c, io.reactivex.schedulers.a, Runnable {
        final h a;
        final h b;
        private static final long c = -4101336210206799084L;

        b(Runnable runnable0) {
            super(runnable0);
            this.a = new h();
            this.b = new h();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == null;
        }

        @Override  // io.reactivex.schedulers.a
        public Runnable b() {
            Runnable runnable0 = (Runnable)this.get();
            return runnable0 == null ? io.reactivex.internal.functions.a.b : runnable0;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.getAndSet(null) != null) {
                this.a.dispose();
                this.b.dispose();
            }
        }

        @Override
        public void run() {
            Runnable runnable0 = (Runnable)this.get();
            if(runnable0 != null) {
                try {
                    runnable0.run();
                }
                finally {
                    this.lazySet(null);
                    this.a.lazySet(io.reactivex.internal.disposables.d.a);
                    this.b.lazySet(io.reactivex.internal.disposables.d.a);
                }
            }
        }
    }

    public static final class io.reactivex.internal.schedulers.d.c extends io.reactivex.J.c implements Runnable {
        static final class io.reactivex.internal.schedulers.d.c.a extends AtomicBoolean implements c, Runnable {
            final Runnable a;
            private static final long b = 0xDE657A0F3A4D2514L;

            io.reactivex.internal.schedulers.d.c.a(Runnable runnable0) {
                this.a = runnable0;
            }

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return this.get();
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
                this.lazySet(true);
            }

            @Override
            public void run() {
                if(this.get()) {
                    return;
                }
                try {
                    this.a.run();
                }
                finally {
                    this.lazySet(true);
                }
            }
        }

        static final class io.reactivex.internal.schedulers.d.c.b extends AtomicInteger implements c, Runnable {
            final Runnable a;
            final io.reactivex.internal.disposables.c b;
            volatile Thread c;
            private static final long d = 0xCDFE056CB41E6354L;
            static final int e = 0;
            static final int f = 1;
            static final int g = 2;
            static final int h = 3;
            static final int i = 4;

            io.reactivex.internal.schedulers.d.c.b(Runnable runnable0, io.reactivex.internal.disposables.c c0) {
                this.a = runnable0;
                this.b = c0;
            }

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return this.get() >= 2;
            }

            void b() {
                io.reactivex.internal.disposables.c c0 = this.b;
                if(c0 != null) {
                    c0.c(this);
                }
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
            alab1:
                while(true) {
                    do {
                        int v = this.get();
                        if(v >= 2) {
                            break alab1;
                        }
                        if(v != 0) {
                            goto label_6;
                        }
                    }
                    while(!this.compareAndSet(0, 4));
                    this.b();
                    return;
                label_6:
                    if(this.compareAndSet(1, 3)) {
                        Thread thread0 = this.c;
                        if(thread0 != null) {
                            thread0.interrupt();
                            this.c = null;
                        }
                        this.set(4);
                        this.b();
                        return;
                    }
                }
            }

            @Override
            public void run() {
                if(this.get() == 0) {
                    this.c = Thread.currentThread();
                    if(this.compareAndSet(0, 1)) {
                        try {
                            this.a.run();
                        }
                        catch(Throwable throwable0) {
                            this.c = null;
                            if(this.compareAndSet(1, 2)) {
                                this.b();
                            }
                            else {
                                while(this.get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw throwable0;
                        }
                        this.c = null;
                        if(this.compareAndSet(1, 2)) {
                            this.b();
                            return;
                        }
                        while(this.get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                        return;
                    }
                    this.c = null;
                }
            }
        }

        final class io.reactivex.internal.schedulers.d.c.c implements Runnable {
            private final h a;
            private final Runnable b;
            final io.reactivex.internal.schedulers.d.c c;

            io.reactivex.internal.schedulers.d.c.c(h h0, Runnable runnable0) {
                this.a = h0;
                this.b = runnable0;
            }

            @Override
            public void run() {
                c c0 = io.reactivex.internal.schedulers.d.c.this.c(this.b);
                this.a.b(c0);
            }
        }

        final boolean a;
        final Executor b;
        final io.reactivex.internal.queue.a c;
        volatile boolean d;
        final AtomicInteger e;
        final io.reactivex.disposables.b f;

        public io.reactivex.internal.schedulers.d.c(Executor executor0, boolean z) {
            this.e = new AtomicInteger();
            this.f = new io.reactivex.disposables.b();
            this.b = executor0;
            this.c = new io.reactivex.internal.queue.a();
            this.a = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d;
        }

        @Override  // io.reactivex.J$c
        @f
        public c c(@f Runnable runnable0) {
            c c0;
            if(this.d) {
                return e.a;
            }
            Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
            if(this.a) {
                c0 = new io.reactivex.internal.schedulers.d.c.b(runnable1, this.f);
                this.f.d(c0);
            }
            else {
                c0 = new io.reactivex.internal.schedulers.d.c.a(runnable1);
            }
            this.c.offer(c0);
            if(this.e.getAndIncrement() == 0) {
                try {
                    this.b.execute(this);
                    return c0;
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                    this.d = true;
                    this.c.clear();
                    io.reactivex.plugins.a.Y(rejectedExecutionException0);
                    return e.a;
                }
            }
            return c0;
        }

        @Override  // io.reactivex.J$c
        @f
        public c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
            if(v <= 0L) {
                return this.c(runnable0);
            }
            if(this.d) {
                return e.a;
            }
            h h0 = new h();
            c c0 = new h(h0);
            n n0 = new n(new io.reactivex.internal.schedulers.d.c.c(this, ((h)c0), io.reactivex.plugins.a.b0(runnable0)), this.f);
            this.f.d(n0);
            Executor executor0 = this.b;
            if(executor0 instanceof ScheduledExecutorService) {
                try {
                    n0.b(((ScheduledExecutorService)executor0).schedule(n0, v, timeUnit0));
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                    this.d = true;
                    io.reactivex.plugins.a.Y(rejectedExecutionException0);
                    return e.a;
                }
            }
            else {
                n0.b(new io.reactivex.internal.schedulers.c(d.d.g(n0, v, timeUnit0)));
            }
            h0.b(n0);
            return c0;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.d) {
                this.d = true;
                this.f.dispose();
                if(this.e.getAndIncrement() == 0) {
                    this.c.clear();
                }
            }
        }

        @Override
        public void run() {
            Runnable runnable0;
            io.reactivex.internal.queue.a a0 = this.c;
            int v = 1;
            while(true) {
                if(this.d) {
                    a0.clear();
                    return;
                }
            label_5:
                runnable0 = (Runnable)a0.poll();
                if(runnable0 != null) {
                    break;
                }
                if(this.d) {
                    a0.clear();
                    return;
                }
                v = this.e.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            runnable0.run();
            if(!this.d) {
                goto label_5;
            }
            a0.clear();
        }
    }

    final boolean b;
    @f
    final Executor c;
    static final J d;

    static {
        d.d = io.reactivex.schedulers.b.g();
    }

    public d(@f Executor executor0, boolean z) {
        this.c = executor0;
        this.b = z;
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.J.c d() {
        return new io.reactivex.internal.schedulers.d.c(this.c, this.b);
    }

    @Override  // io.reactivex.J
    @f
    public c f(@f Runnable runnable0) {
        Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
        try {
            if(this.c instanceof ExecutorService) {
                c c0 = new m(runnable1);
                ((io.reactivex.internal.schedulers.a)c0).c(((ExecutorService)this.c).submit(((Callable)c0)));
                return c0;
            }
            if(this.b) {
                c c1 = new io.reactivex.internal.schedulers.d.c.b(runnable1, null);
                this.c.execute(((Runnable)c1));
                return c1;
            }
            c c2 = new io.reactivex.internal.schedulers.d.c.a(runnable1);
            this.c.execute(((Runnable)c2));
            return c2;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        io.reactivex.plugins.a.Y(rejectedExecutionException0);
        return e.a;
    }

    @Override  // io.reactivex.J
    @f
    public c g(@f Runnable runnable0, long v, TimeUnit timeUnit0) {
        Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
        if(this.c instanceof ScheduledExecutorService) {
            try {
                c c0 = new m(runnable1);
                ((io.reactivex.internal.schedulers.a)c0).c(((ScheduledExecutorService)this.c).schedule(((Callable)c0), v, timeUnit0));
                return c0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                io.reactivex.plugins.a.Y(rejectedExecutionException0);
                return e.a;
            }
        }
        c c1 = new b(runnable1);
        a d$a0 = new a(this, ((b)c1));
        c c2 = d.d.g(d$a0, v, timeUnit0);
        c1.a.b(c2);
        return c1;
    }

    @Override  // io.reactivex.J
    @f
    public c h(@f Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        if(this.c instanceof ScheduledExecutorService) {
            Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
            try {
                c c0 = new l(runnable1);
                ((io.reactivex.internal.schedulers.a)c0).c(((ScheduledExecutorService)this.c).scheduleAtFixedRate(((Runnable)c0), v, v1, timeUnit0));
                return c0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                io.reactivex.plugins.a.Y(rejectedExecutionException0);
                return e.a;
            }
        }
        return super.h(runnable0, v, v1, timeUnit0);
    }
}

