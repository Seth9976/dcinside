package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import B3.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class PersistentOrderedSetIterator implements a, Iterator {
    @m
    private Object a;
    @l
    private final Map b;
    private int c;

    public PersistentOrderedSetIterator(@m Object object0, @l Map map0) {
        L.p(map0, "map");
        super();
        this.a = object0;
        this.b = map0;
    }

    private final void a() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int b() {
        return this.c;
    }

    @l
    public final Map c() {
        return this.b;
    }

    public final void d(int v) {
        this.c = v;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override
    public Object next() {
        this.a();
        Object object0 = this.a;
        ++this.c;
        Object object1 = this.b.get(object0);
        if(object1 == null) {
            throw new ConcurrentModificationException("Hash code of an element (" + object0 + ") has changed after it was added to the persistent set.");
        }
        this.a = ((Links)object1).c();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

