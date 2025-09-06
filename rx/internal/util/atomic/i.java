package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

public final class i implements Queue {
    final AtomicLong a;
    int b;
    long c;
    int d;
    AtomicReferenceArray e;
    int f;
    AtomicReferenceArray g;
    final AtomicLong h;
    static final int i;
    private static final Object j;

    static {
        i.i = 0x1000;
        i.j = new Object();
    }

    public i(int v) {
        int v1 = p.b(Math.max(8, v));
        this.a = new AtomicLong();
        this.h = new AtomicLong();
        AtomicReferenceArray atomicReferenceArray0 = new AtomicReferenceArray(v1 + 1);
        this.e = atomicReferenceArray0;
        this.d = v1 - 1;
        this.a(v1);
        this.g = atomicReferenceArray0;
        this.f = v1 - 1;
        this.c = (long)(v1 - 2);
        this.r(0L);
    }

    private void a(int v) {
        this.b = Math.min(v / 4, i.i);
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    private static int b(int v) [...] // Inlined contents

    private static int c(long v, int v1) {
        return ((int)v) & v1;
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

    @Override
    public boolean contains(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    private long d() {
        return this.h.get();
    }

    @Override
    public Object element() {
        throw new UnsupportedOperationException();
    }

    private long g() {
        return this.a.get();
    }

    private long h() {
        return this.h.get();
    }

    private static Object i(AtomicReferenceArray atomicReferenceArray0, int v) {
        return atomicReferenceArray0.get(v);
    }

    @Override
    public boolean isEmpty() {
        return this.k() == this.h();
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    private AtomicReferenceArray j(AtomicReferenceArray atomicReferenceArray0) {
        return (AtomicReferenceArray)i.i(atomicReferenceArray0, i.b(atomicReferenceArray0.length() - 1));
    }

    private long k() {
        return this.a.get();
    }

    private Object l(AtomicReferenceArray atomicReferenceArray0, long v, int v1) {
        this.g = atomicReferenceArray0;
        return i.i(atomicReferenceArray0, i.c(v, v1));
    }

    private Object m(AtomicReferenceArray atomicReferenceArray0, long v, int v1) {
        this.g = atomicReferenceArray0;
        int v2 = i.c(v, v1);
        Object object0 = i.i(atomicReferenceArray0, v2);
        if(object0 == null) {
            return null;
        }
        this.o(v + 1L);
        i.p(atomicReferenceArray0, v2, null);
        return object0;
    }

    private void n(AtomicReferenceArray atomicReferenceArray0, long v, int v1, Object object0, long v2) {
        AtomicReferenceArray atomicReferenceArray1 = new AtomicReferenceArray(atomicReferenceArray0.length());
        this.e = atomicReferenceArray1;
        this.c = v2 + v - 1L;
        this.r(v + 1L);
        i.p(atomicReferenceArray1, v1, object0);
        this.q(atomicReferenceArray0, atomicReferenceArray1);
        i.p(atomicReferenceArray0, v1, i.j);
    }

    private void o(long v) {
        this.h.lazySet(v);
    }

    @Override
    public boolean offer(Object object0) {
        object0.getClass();
        AtomicReferenceArray atomicReferenceArray0 = this.e;
        long v = this.g();
        int v1 = this.d;
        int v2 = i.c(v, v1);
        if(v < this.c) {
            return this.t(atomicReferenceArray0, object0, v, v2);
        }
        long v3 = ((long)this.b) + v;
        if(i.i(atomicReferenceArray0, i.c(v3, v1)) == null) {
            this.c = v3 - 1L;
            return this.t(atomicReferenceArray0, object0, v, v2);
        }
        if(i.i(atomicReferenceArray0, i.c(v + 1L, v1)) != null) {
            return this.t(atomicReferenceArray0, object0, v, v2);
        }
        this.n(atomicReferenceArray0, v, v2, object0, ((long)v1));
        return true;
    }

    private static void p(AtomicReferenceArray atomicReferenceArray0, int v, Object object0) {
        atomicReferenceArray0.lazySet(v, object0);
    }

    @Override
    public Object peek() {
        AtomicReferenceArray atomicReferenceArray0 = this.g;
        long v = this.d();
        int v1 = this.f;
        Object object0 = i.i(atomicReferenceArray0, i.c(v, v1));
        return object0 == i.j ? this.l(this.j(atomicReferenceArray0), v, v1) : object0;
    }

    @Override
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray0 = this.g;
        long v = this.d();
        int v1 = this.f;
        int v2 = i.c(v, v1);
        Object object0 = i.i(atomicReferenceArray0, v2);
        boolean z = object0 == i.j;
        if(object0 != null && !z) {
            this.o(v + 1L);
            i.p(atomicReferenceArray0, v2, null);
            return object0;
        }
        return z ? this.m(this.j(atomicReferenceArray0), v, v1) : null;
    }

    private void q(AtomicReferenceArray atomicReferenceArray0, AtomicReferenceArray atomicReferenceArray1) {
        i.p(atomicReferenceArray0, i.b(atomicReferenceArray0.length() - 1), atomicReferenceArray1);
    }

    private void r(long v) {
        this.a.lazySet(v);
    }

    @Override
    public Object remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        long v2;
        long v1;
        for(long v = this.h(); true; v = v2) {
            v1 = this.k();
            v2 = this.h();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }

    private boolean t(AtomicReferenceArray atomicReferenceArray0, Object object0, long v, int v1) {
        this.r(v + 1L);
        i.p(atomicReferenceArray0, v1, object0);
        return true;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        throw new UnsupportedOperationException();
    }
}

