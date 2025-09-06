package com.google.common.collect;

import J1.b;
import java.util.NoSuchElementException;
import o3.a;

@b
@C1
public abstract class l extends u5 {
    @a
    private Object a;

    protected l(@a Object object0) {
        this.a = object0;
    }

    @a
    protected abstract Object a(Object arg1);

    @Override
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override
    public final Object next() {
        Object object0 = this.a;
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        this.a = this.a(object0);
        return object0;
    }
}

