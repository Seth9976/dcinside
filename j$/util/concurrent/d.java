package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class d extends a implements Iterator {
    @Override
    public final Object next() {
        l l0 = this.b;
        if(l0 == null) {
            throw new NoSuchElementException();
        }
        Object object0 = l0.c;
        this.j = l0;
        this.a();
        return new k(l0.b, object0, this.i);
    }
}

