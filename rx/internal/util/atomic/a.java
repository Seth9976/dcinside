package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

abstract class a extends AbstractQueue {
    protected final AtomicReferenceArray a;
    protected final int b;

    public a(int v) {
        int v1 = p.b(v);
        this.b = v1 - 1;
        this.a = new AtomicReferenceArray(v1);
    }

    protected final int a(long v) {
        return this.b & ((int)v);
    }

    protected final int b(long v, int v1) {
        return ((int)v) & v1;
    }

    protected final Object c(int v) {
        return this.a.get(v);
    }

    @Override
    public void clear() {
        while(true) {
            if(this.poll() != null) {
            }
            else if(this.isEmpty()) {
                break;
            }
        }
    }

    protected final Object d(AtomicReferenceArray atomicReferenceArray0, int v) {
        return atomicReferenceArray0.get(v);
    }

    protected final Object g(int v) {
        return this.h(this.a, v);
    }

    protected final Object h(AtomicReferenceArray atomicReferenceArray0, int v) {
        return atomicReferenceArray0.get(v);
    }

    protected final void i(int v, Object object0) {
        this.a.lazySet(v, object0);
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    protected final void j(AtomicReferenceArray atomicReferenceArray0, int v, Object object0) {
        atomicReferenceArray0.lazySet(v, object0);
    }

    protected final void k(int v, Object object0) {
        this.a.lazySet(v, object0);
    }

    protected final void l(AtomicReferenceArray atomicReferenceArray0, int v, Object object0) {
        atomicReferenceArray0.lazySet(v, object0);
    }

    protected final void m(AtomicReferenceArray atomicReferenceArray0, int v, Object object0) {
        atomicReferenceArray0.set(v, object0);
    }
}

