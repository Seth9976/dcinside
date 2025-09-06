package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.j;
import rx.o;

public final class f extends j {
    final class a extends rx.j.a implements o {
        final rx.subscriptions.a a;
        final f b;

        a() {
            this.a = new rx.subscriptions.a();
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            a0.call();
            return rx.subscriptions.f.e();
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            long v1 = timeUnit0.toMillis(v);
            return this.c(new m(a0, this, f.this.b() + v1));
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.j();
        }

        @Override  // rx.o
        public void l() {
            this.a.l();
        }
    }

    public static final f a;

    static {
        f.a = new f();
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new a(this);
    }
}

