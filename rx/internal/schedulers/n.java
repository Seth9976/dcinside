package rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.j;
import rx.o;
import rx.subscriptions.f;

public final class n extends j {
    static final class a extends rx.j.a implements o {
        final AtomicInteger a;
        final PriorityBlockingQueue b;
        private final rx.subscriptions.a c;
        private final AtomicInteger d;

        a() {
            this.a = new AtomicInteger();
            this.b = new PriorityBlockingQueue();
            this.c = new rx.subscriptions.a();
            this.d = new AtomicInteger();
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            return this.o(a0, this.a());
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            long v1 = timeUnit0.toMillis(v);
            long v2 = this.a() + v1;
            return this.o(new m(a0, this, v2), v2);
        }

        @Override  // rx.o
        public boolean j() {
            return this.c.j();
        }

        @Override  // rx.o
        public void l() {
            this.c.l();
        }

        private o o(rx.functions.a a0, long v) {
            class rx.internal.schedulers.n.a.a implements rx.functions.a {
                final b a;
                final a b;

                rx.internal.schedulers.n.a.a(b n$b0) {
                    this.a = n$b0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    a.this.b.remove(this.a);
                }
            }

            if(this.c.j()) {
                return f.e();
            }
            b n$b0 = new b(a0, v, this.a.incrementAndGet());
            this.b.add(n$b0);
            if(this.d.getAndIncrement() == 0) {
                do {
                    b n$b1 = (b)this.b.poll();
                    if(n$b1 != null) {
                        n$b1.a.call();
                    }
                }
                while(this.d.decrementAndGet() > 0);
                return f.e();
            }
            return f.a(new rx.internal.schedulers.n.a.a(this, n$b0));
        }
    }

    static final class b implements Comparable {
        final rx.functions.a a;
        final Long b;
        final int c;

        b(rx.functions.a a0, Long long0, int v) {
            this.a = a0;
            this.b = long0;
            this.c = v;
        }

        public int a(b n$b0) {
            int v = this.b.compareTo(n$b0.b);
            return v == 0 ? n.d(this.c, n$b0.c) : v;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((b)object0));
        }
    }

    public static final n a;

    static {
        n.a = new n();
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new a();
    }

    static int d(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v == v1 ? 0 : 1;
    }
}

