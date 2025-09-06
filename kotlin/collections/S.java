package kotlin.collections;

import B3.a;
import java.util.Iterator;
import y4.l;

public abstract class s implements a, Iterator {
    @l
    public final Byte a() {
        return this.nextByte();
    }

    @Override
    public Object next() {
        return this.nextByte();
    }

    public abstract byte nextByte();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

