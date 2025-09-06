package rx.subscriptions;

import F4.b;
import rx.o;

public final class c implements o {
    final b a;

    public c() {
        this.a = new b();
    }

    public o a() {
        return this.a.a();
    }

    public void b(o o0) {
        if(o0 == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.a.b(o0);
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

