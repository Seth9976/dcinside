package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.exceptions.c;
import rx.n;
import rx.subscriptions.f;

public final class q0 {
    static class a implements rx.g.a {
        final Future a;
        private final long b;
        private final TimeUnit c;

        public a(Future future0) {
            this.a = future0;
            this.b = 0L;
            this.c = null;
        }

        public a(Future future0, long v, TimeUnit timeUnit0) {
            this.a = future0;
            this.b = v;
            this.c = timeUnit0;
        }

        public void a(n n0) {
            class rx.internal.operators.q0.a.a implements rx.functions.a {
                final a a;

                @Override  // rx.functions.a
                public void call() {
                    a.this.a.cancel(true);
                }
            }

            n0.q(f.a(new rx.internal.operators.q0.a.a(this)));
            try {
                if(n0.j()) {
                    return;
                }
                n0.X(new rx.internal.producers.f(n0, (this.c == null ? this.a.get() : this.a.get(this.b, this.c))));
                return;
            }
            catch(Throwable throwable0) {
            }
            if(n0.j()) {
                return;
            }
            c.f(throwable0, n0);
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((n)object0));
        }
    }

    private q0() {
        throw new IllegalStateException("No instances!");
    }

    public static rx.g.a a(Future future0) {
        return new a(future0);
    }

    public static rx.g.a b(Future future0, long v, TimeUnit timeUnit0) {
        return new a(future0, v, timeUnit0);
    }
}

