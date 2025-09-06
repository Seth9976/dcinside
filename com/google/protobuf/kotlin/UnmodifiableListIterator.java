package com.google.protobuf.kotlin;

import B3.a;
import java.util.ListIterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class UnmodifiableListIterator implements a, ListIterator {
    private final ListIterator $$delegate_0;

    public UnmodifiableListIterator(@l ListIterator listIterator0) {
        L.p(listIterator0, "delegate");
        super();
        this.$$delegate_0 = listIterator0;
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.$$delegate_0.hasPrevious();
    }

    @Override
    public Object next() {
        return this.$$delegate_0.next();
    }

    @Override
    public int nextIndex() {
        return this.$$delegate_0.nextIndex();
    }

    @Override
    public Object previous() {
        return this.$$delegate_0.previous();
    }

    @Override
    public int previousIndex() {
        return this.$$delegate_0.previousIndex();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

