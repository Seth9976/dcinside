package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.o;

public final class a implements o {
    static final class rx.subscriptions.a.a implements rx.functions.a {
        @Override  // rx.functions.a
        public void call() {
        }
    }

    final AtomicReference a;
    static final rx.functions.a b;

    static {
        a.b = new rx.subscriptions.a.a();
    }

    public a() {
        this.a = new AtomicReference();
    }

    private a(rx.functions.a a0) {
        this.a = new AtomicReference(a0);
    }

    public static a a() {
        return new a();
    }

    public static a b(rx.functions.a a0) {
        return new a(a0);
    }

    @Override  // rx.o
    public boolean j() {
        return this.a.get() == a.b;
    }

    @Override  // rx.o
    public void l() {
        rx.functions.a a0 = (rx.functions.a)this.a.get();
        rx.functions.a a1 = a.b;
        if(a0 != a1) {
            rx.functions.a a2 = (rx.functions.a)this.a.getAndSet(a1);
            if(a2 != null && a2 != a1) {
                a2.call();
            }
        }
    }
}

