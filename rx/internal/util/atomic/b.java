package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

abstract class b extends AbstractQueue {
    private final AtomicReference a;
    private final AtomicReference b;

    public b() {
        this.a = new AtomicReference();
        this.b = new AtomicReference();
    }

    protected final c a() {
        return (c)this.b.get();
    }

    protected final c b() {
        return (c)this.a.get();
    }

    protected final c c() {
        return (c)this.b.get();
    }

    protected final c d() {
        return (c)this.a.get();
    }

    protected final void g(c c0) {
        this.b.lazySet(c0);
    }

    protected final void h(c c0) {
        this.a.lazySet(c0);
    }

    protected final c i(c c0) {
        return (c)this.a.getAndSet(c0);
    }

    @Override
    public final boolean isEmpty() {
        return this.c() == this.d();
    }

    @Override
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        c c2;
        c c0 = this.c();
        c c1 = this.d();
        int v = 0;
        while(c0 != c1 && v < 0x7FFFFFFF) {
            do {
                c2 = c0.c();
            }
            while(c2 == null);
            ++v;
            c0 = c2;
        }
        return v;
    }
}

