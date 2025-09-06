package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference {
    private Object a;
    private static final long b = 2404266111789071508L;

    public c() {
    }

    public c(Object object0) {
        this.e(object0);
    }

    public Object a() {
        this.e(null);
        return this.b();
    }

    public Object b() {
        return this.a;
    }

    public c c() {
        return (c)this.get();
    }

    public void d(c c0) {
        this.lazySet(c0);
    }

    public void e(Object object0) {
        this.a = object0;
    }
}

