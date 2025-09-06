package kotlin.collections;

import B3.a;
import java.util.Iterator;
import y4.l;

public abstract class r implements a, Iterator {
    @l
    public final Boolean a() {
        return Boolean.valueOf(this.b());
    }

    public abstract boolean b();

    @Override
    public Object next() {
        return Boolean.valueOf(this.b());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

