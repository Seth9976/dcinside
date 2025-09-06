package kotlin.collections;

import B3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y4.m;

public abstract class b implements a, Iterator {
    private int a;
    @m
    private Object b;

    protected abstract void a();

    protected final void b() {
        this.a = 2;
    }

    protected final void c(Object object0) {
        this.b = object0;
        this.a = 1;
    }

    private final boolean d() {
        this.a = 3;
        this.a();
        return false;
    }

    @Override
    public boolean hasNext() {
        switch(this.a) {
            case 0: {
                return this.d();
            }
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            default: {
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
        }
    }

    @Override
    public Object next() {
        int v = this.a;
        if(v == 1) {
            this.a = 0;
            return this.b;
        }
        if(v == 2 || !this.d()) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

