package com.google.common.collect;

import J1.b;
import java.util.ListIterator;

@b
@C1
abstract class m5 extends l5 implements ListIterator {
    m5(ListIterator listIterator0) {
        super(listIterator0);
    }

    @Override
    public void add(@d4 Object object0) {
        throw new UnsupportedOperationException();
    }

    private ListIterator b() {
        return (ListIterator)this.a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return this.b().nextIndex();
    }

    @Override
    @d4
    public final Object previous() {
        return this.a(this.b().previous());
    }

    @Override
    public final int previousIndex() {
        return this.b().previousIndex();
    }

    @Override
    public void set(@d4 Object object0) {
        throw new UnsupportedOperationException();
    }
}

