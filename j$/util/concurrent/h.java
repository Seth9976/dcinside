package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class h extends a implements Enumeration, Iterator {
    public final int k;

    public h(l[] arr_l, int v, int v1, ConcurrentHashMap concurrentHashMap0, int v2) {
        this.k = v2;
        super(arr_l, v, v1, concurrentHashMap0);
    }

    @Override
    public final Object next() {
        if(this.k != 0) {
            l l0 = this.b;
            if(l0 == null) {
                throw new NoSuchElementException();
            }
            Object object0 = l0.c;
            this.j = l0;
            this.a();
            return object0;
        }
        l l1 = this.b;
        if(l1 == null) {
            throw new NoSuchElementException();
        }
        this.j = l1;
        this.a();
        return l1.b;
    }

    @Override
    public final Object nextElement() {
        return this.next();
    }
}

