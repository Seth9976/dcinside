package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.internal.schedulers.i;
import rx.j;
import rx.o;
import rx.subscriptions.f;

public class d extends j {
    static final class a implements Comparator {
        public int b(c d$c0, c d$c1) {
            long v = d$c0.a;
            long v1 = d$c1.a;
            if(v == v1) {
                if(d$c0.d < d$c1.d) {
                    return -1;
                }
                return d$c0.d <= d$c1.d ? 0 : 1;
            }
            if(v < v1) {
                return -1;
            }
            return v <= v1 ? 0 : 1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((c)object0), ((c)object1));
        }
    }

    final class b extends rx.j.a implements rx.internal.schedulers.i.b {
        private final rx.subscriptions.a a;
        final d b;

        b() {
            this.a = new rx.subscriptions.a();
        }

        @Override  // rx.j$a
        public long a() {
            return d.this.b();
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            class rx.schedulers.d.b.b implements rx.functions.a {
                final c a;
                final b b;

                rx.schedulers.d.b.b(c d$c0) {
                    this.a = d$c0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    d.this.a.remove(this.a);
                }
            }

            c d$c0 = new c(this, 0L, a0);
            d.this.a.add(d$c0);
            return f.a(new rx.schedulers.d.b.b(this, d$c0));
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            class rx.schedulers.d.b.a implements rx.functions.a {
                final c a;
                final b b;

                rx.schedulers.d.b.a(c d$c0) {
                    this.a = d$c0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    d.this.a.remove(this.a);
                }
            }

            c d$c0 = new c(this, d.this.b + timeUnit0.toNanos(v), a0);
            d.this.a.add(d$c0);
            return f.a(new rx.schedulers.d.b.a(this, d$c0));
        }

        @Override  // rx.j$a
        public o e(rx.functions.a a0, long v, long v1, TimeUnit timeUnit0) {
            return i.a(this, a0, v, v1, timeUnit0, this);
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.j();
        }

        @Override  // rx.o
        public void l() {
            this.a.l();
        }

        @Override  // rx.internal.schedulers.i$b
        public long nowNanos() {
            return d.this.b;
        }
    }

    static final class c {
        final long a;
        final rx.functions.a b;
        final rx.j.a c;
        private final long d;

        c(rx.j.a j$a0, long v, rx.functions.a a0) {
            long v1 = d.c;
            d.c = v1 + 1L;
            this.d = v1;
            this.a = v;
            this.b = a0;
            this.c = j$a0;
        }

        @Override
        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", this.a, this.b.toString());
        }
    }

    final Queue a;
    long b;
    static long c;

    public d() {
        this.a = new PriorityQueue(11, new a());
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new b(this);
    }

    @Override  // rx.j
    public long b() {
        return TimeUnit.NANOSECONDS.toMillis(this.b);
    }

    public void d(long v, TimeUnit timeUnit0) {
        this.e(this.b + timeUnit0.toNanos(v), TimeUnit.NANOSECONDS);
    }

    public void e(long v, TimeUnit timeUnit0) {
        this.g(timeUnit0.toNanos(v));
    }

    public void f() {
        this.g(this.b);
    }

    private void g(long v) {
        while(!this.a.isEmpty()) {
            c d$c0 = (c)this.a.peek();
            long v1 = d$c0.a;
            if(v1 > v) {
                break;
            }
            if(v1 == 0L) {
                v1 = this.b;
            }
            this.b = v1;
            this.a.remove();
            if(!d$c0.c.j()) {
                d$c0.b.call();
            }
        }
        this.b = v;
    }
}

