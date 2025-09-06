package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.util.Iterator;

@b
@C1
abstract class l5 implements Iterator {
    final Iterator a;

    l5(Iterator iterator0) {
        this.a = (Iterator)H.E(iterator0);
    }

    @d4
    abstract Object a(@d4 Object arg1);

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    @d4
    public final Object next() {
        Object object0 = this.a.next();
        return this.a(object0);
    }

    @Override
    public final void remove() {
        this.a.remove();
    }
}

