package com.google.common.collect;

import J1.b;
import O1.a;
import java.util.Iterator;
import java.util.ListIterator;

@b
@C1
public abstract class h2 extends f2 implements ListIterator {
    @Override  // com.google.common.collect.f2
    protected Object K() {
        return this.N();
    }

    @Override  // com.google.common.collect.f2
    protected Iterator M() {
        return this.N();
    }

    protected abstract ListIterator N();

    @Override
    public void add(@d4 Object object0) {
        this.N().add(object0);
    }

    @Override
    public boolean hasPrevious() {
        return this.N().hasPrevious();
    }

    @Override
    public int nextIndex() {
        return this.N().nextIndex();
    }

    @Override
    @a
    @d4
    public Object previous() {
        return this.N().previous();
    }

    @Override
    public int previousIndex() {
        return this.N().previousIndex();
    }

    @Override
    public void set(@d4 Object object0) {
        this.N().set(object0);
    }
}

