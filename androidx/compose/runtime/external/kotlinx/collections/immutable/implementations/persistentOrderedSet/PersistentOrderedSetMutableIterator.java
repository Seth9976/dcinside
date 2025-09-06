package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import B3.d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public final class PersistentOrderedSetMutableIterator extends PersistentOrderedSetIterator implements d, Iterator {
    @l
    private final PersistentOrderedSetBuilder d;
    @m
    private Object e;
    private boolean f;
    private int g;

    public PersistentOrderedSetMutableIterator(@l PersistentOrderedSetBuilder persistentOrderedSetBuilder0) {
        L.p(persistentOrderedSetBuilder0, "builder");
        super(persistentOrderedSetBuilder0.b(), persistentOrderedSetBuilder0.c());
        this.d = persistentOrderedSetBuilder0;
        this.g = persistentOrderedSetBuilder0.c().g();
    }

    private final void f() {
        if(this.d.c().g() != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void g() {
        if(!this.f) {
            throw new IllegalStateException();
        }
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public Object next() {
        this.f();
        Object object0 = super.next();
        this.e = object0;
        this.f = true;
        return object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public void remove() {
        this.g();
        Object object0 = this.e;
        v0.a(this.d).remove(object0);
        this.e = null;
        this.f = false;
        this.g = this.d.c().g();
        this.d(this.b() - 1);
    }
}

