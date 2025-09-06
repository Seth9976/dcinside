package kotlin.collections;

import B3.a;
import java.util.Iterator;
import y4.l;

public abstract class t implements a, Iterator {
    @l
    public final Character a() {
        return Character.valueOf(this.b());
    }

    public abstract char b();

    @Override
    public Object next() {
        return Character.valueOf(this.b());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

