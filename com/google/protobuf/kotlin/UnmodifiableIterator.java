package com.google.protobuf.kotlin;

import B3.a;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class UnmodifiableIterator implements a, Iterator {
    private final Iterator $$delegate_0;

    public UnmodifiableIterator(@l Iterator iterator0) {
        L.p(iterator0, "delegate");
        super();
        this.$$delegate_0 = iterator0;
    }

    @Override
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override
    public Object next() {
        return this.$$delegate_0.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

