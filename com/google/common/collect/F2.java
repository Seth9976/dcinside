package com.google.common.collect;

import J1.b;
import O1.a;
import java.util.Iterator;

@b
@C1
public abstract class f2 extends p2 implements Iterator {
    @Override  // com.google.common.collect.p2
    protected Object K() {
        return this.M();
    }

    protected abstract Iterator M();

    @Override
    public boolean hasNext() {
        return this.M().hasNext();
    }

    @Override
    @a
    @d4
    public Object next() {
        return this.M().next();
    }

    @Override
    public void remove() {
        this.M().remove();
    }
}

