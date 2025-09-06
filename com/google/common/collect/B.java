package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.util.NoSuchElementException;

@b
@C1
abstract class com.google.common.collect.b extends v5 {
    private final int a;
    private int b;

    protected com.google.common.collect.b(int v) {
        this(v, 0);
    }

    protected com.google.common.collect.b(int v, int v1) {
        H.d0(v1, v);
        this.a = v;
        this.b = v1;
    }

    @d4
    protected abstract Object a(int arg1);

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override
    @d4
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.b;
        this.b = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    @d4
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.b - 1;
        this.b = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
}

