package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import B3.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class AbstractListIterator implements a, ListIterator {
    private int a;
    private int b;

    public AbstractListIterator(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public final void a() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final void f(int v) {
        this.a = v;
    }

    public final void g(int v) {
        this.b = v;
    }

    @Override
    public boolean hasNext() {
        return this.a < this.b;
    }

    @Override
    public boolean hasPrevious() {
        return this.a > 0;
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int nextIndex() {
        return this.a;
    }

    @Override
    public int previousIndex() {
        return this.a - 1;
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

