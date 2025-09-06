package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class PersistentOrderedMapLinksIterator implements a, Iterator {
    @m
    private Object a;
    @l
    private final Map b;
    private int c;

    public PersistentOrderedMapLinksIterator(@m Object object0, @l Map map0) {
        L.p(map0, "hashMap");
        super();
        this.a = object0;
        this.b = map0;
    }

    public final int a() {
        return this.c;
    }

    @m
    public final Object b() {
        return this.a;
    }

    @l
    public LinkedValue c() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.b.get(this.a);
        if(object0 == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
        }
        ++this.c;
        this.a = ((LinkedValue)object0).c();
        return (LinkedValue)object0;
    }

    public final void d(int v) {
        this.c = v;
    }

    public final void f(@m Object object0) {
        this.a = object0;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override
    public Object next() {
        return this.c();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

