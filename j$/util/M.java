package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

final class m implements z, ListIterator {
    private final ListIterator a;

    m(n n0, int v) {
        this.a = n0.b.listIterator(v);
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.z
    public final void forEachRemaining(Consumer consumer0) {
        P.q(this.a, consumer0);
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override
    public final Object next() {
        return this.a.next();
    }

    @Override
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override
    public final Object previous() {
        return this.a.previous();
    }

    @Override
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

