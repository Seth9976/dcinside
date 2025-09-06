package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.p;

public final class f extends AtomicReferenceArray implements Queue {
    final int a;
    final int b;
    final AtomicLong c;
    final AtomicLong d;
    private static final long e = 0x5631D997036B8B85L;

    public f(int v) {
        super(p.b(v));
        int v1 = this.length();
        this.a = v1 - 1;
        this.b = v1 - v;
        this.c = new AtomicLong();
        this.d = new AtomicLong();
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
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

    @Override
    public Object element() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return this.c == this.d;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offer(Object object0) {
        object0.getClass();
        long v = this.c.get();
        int v1 = this.a;
        if(this.get(((int)(((long)this.b) + v)) & v1) != null) {
            return false;
        }
        this.c.lazySet(v + 1L);
        this.lazySet(v1 & ((int)v), object0);
        return true;
    }

    @Override
    public Object peek() {
        int v = (int)this.d.get();
        return this.get(this.a & v);
    }

    @Override
    public Object poll() {
        long v = this.d.get();
        int v1 = ((int)v) & this.a;
        Object object0 = this.get(v1);
        if(object0 == null) {
            return null;
        }
        this.d.lazySet(v + 1L);
        this.lazySet(v1, null);
        return object0;
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
        for(long v = this.d.get(); true; v = v2) {
            v1 = this.c.get();
            v2 = this.d.get();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
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

