package kotlin.collections;

import B3.a;
import java.util.Iterator;
import y4.l;

public abstract class o0 implements a, Iterator {
    @l
    public final Short a() {
        return this.b();
    }

    public abstract short b();

    @Override
    public Object next() {
        return this.b();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

