package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.j;
import rx.o;
import rx.subscriptions.b;
import rx.subscriptions.f;

public final class c extends j {
    static final class a extends rx.j.a implements Runnable {
        final Executor a;
        final b b;
        final ConcurrentLinkedQueue c;
        final AtomicInteger d;
        final ScheduledExecutorService e;

        public a(Executor executor0) {
            this.a = executor0;
            this.c = new ConcurrentLinkedQueue();
            this.d = new AtomicInteger();
            this.b = new b();
            this.e = d.a();
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            if(this.j()) {
                return f.e();
            }
            o o0 = new rx.internal.schedulers.j(rx.plugins.c.P(a0), this.b);
            this.b.a(o0);
            this.c.offer(o0);
            if(this.d.getAndIncrement() == 0) {
                try {
                    this.a.execute(this);
                    return o0;
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                    this.b.e(o0);
                    this.d.decrementAndGet();
                    rx.plugins.c.I(rejectedExecutionException0);
                    throw rejectedExecutionException0;
                }
            }
            return o0;
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            class rx.internal.schedulers.c.a.a implements rx.functions.a {
                final rx.subscriptions.c a;
                final a b;

                rx.internal.schedulers.c.a.a(rx.subscriptions.c c0) {
                    this.a = c0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    a.this.b.e(this.a);
                }
            }


            class rx.internal.schedulers.c.a.b implements rx.functions.a {
                final rx.subscriptions.c a;
                final rx.functions.a b;
                final o c;
                final a d;

                rx.internal.schedulers.c.a.b(rx.subscriptions.c c0, rx.functions.a a0, o o0) {
                    this.a = c0;
                    this.b = a0;
                    this.c = o0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    if(this.a.j()) {
                        return;
                    }
                    o o0 = a.this.c(this.b);
                    this.a.b(o0);
                    if(o0.getClass() == rx.internal.schedulers.j.class) {
                        ((rx.internal.schedulers.j)o0).b(this.c);
                    }
                }
            }

            if(v <= 0L) {
                return this.c(a0);
            }
            if(this.j()) {
                return f.e();
            }
            rx.functions.a a1 = rx.plugins.c.P(a0);
            rx.subscriptions.c c0 = new rx.subscriptions.c();
            rx.subscriptions.c c1 = new rx.subscriptions.c();
            c1.b(c0);
            this.b.a(c1);
            o o0 = f.a(new rx.internal.schedulers.c.a.a(this, c1));
            rx.internal.schedulers.j j0 = new rx.internal.schedulers.j(new rx.internal.schedulers.c.a.b(this, c1, a1, o0));
            c0.b(j0);
            try {
                j0.a(this.e.schedule(j0, v, timeUnit0));
                return o0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                rx.plugins.c.I(rejectedExecutionException0);
                throw rejectedExecutionException0;
            }
        }

        @Override  // rx.o
        public boolean j() {
            return this.b.j();
        }

        @Override  // rx.o
        public void l() {
            this.b.l();
            this.c.clear();
        }

        @Override
        public void run() {
            do {
                if(this.b.j()) {
                    this.c.clear();
                    return;
                }
                rx.internal.schedulers.j j0 = (rx.internal.schedulers.j)this.c.poll();
                if(j0 == null) {
                    return;
                }
                if(!j0.j()) {
                    if(!this.b.j()) {
                        j0.run();
                        continue;
                    }
                    this.c.clear();
                    return;
                }
            }
            while(this.d.decrementAndGet() != 0);
        }
    }

    final Executor a;

    public c(Executor executor0) {
        this.a = executor0;
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new a(this.a);
    }
}

