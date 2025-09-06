package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class e extends a {
    final AtomicLong c;
    long d;
    final AtomicLong e;
    final int f;
    private static final Integer g;

    static {
        e.g = 0x1000;
    }

    public e(int v) {
        super(v);
        this.c = new AtomicLong();
        this.e = new AtomicLong();
        this.f = Math.min(v / 4, ((int)e.g));
    }

    @Override  // rx.internal.util.atomic.a
    public void clear() {
        super.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.o() == this.n();
    }

    @Override  // rx.internal.util.atomic.a
    public Iterator iterator() {
        return super.iterator();
    }

    private long n() {
        return this.e.get();
    }

    private long o() {
        return this.c.get();
    }

    @Override
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray0 = this.a;
        int v = this.b;
        long v1 = this.c.get();
        int v2 = this.b(v1, v);
        if(v1 >= this.d) {
            long v3 = ((long)this.f) + v1;
            if(this.h(atomicReferenceArray0, this.b(v3, v)) == null) {
                this.d = v3;
            }
            else if(this.h(atomicReferenceArray0, v2) != null) {
                return false;
            }
        }
        this.j(atomicReferenceArray0, v2, object0);
        this.q(v1 + 1L);
        return true;
    }

    private void p(long v) {
        this.e.lazySet(v);
    }

    @Override
    public Object peek() {
        return this.g(this.a(this.e.get()));
    }

    @Override
    public Object poll() {
        long v = this.e.get();
        int v1 = this.a(v);
        AtomicReferenceArray atomicReferenceArray0 = this.a;
        Object object0 = this.h(atomicReferenceArray0, v1);
        if(object0 == null) {
            return null;
        }
        this.j(atomicReferenceArray0, v1, null);
        this.p(v + 1L);
        return object0;
    }

    private void q(long v) {
        this.c.lazySet(v);
    }

    @Override
    public int size() {
        long v2;
        long v1;
        for(long v = this.n(); true; v = v2) {
            v1 = this.o();
            v2 = this.n();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }
}

