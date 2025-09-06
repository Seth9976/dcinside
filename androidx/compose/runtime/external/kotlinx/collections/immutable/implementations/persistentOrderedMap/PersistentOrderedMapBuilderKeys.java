package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapBuilderKeys extends h implements B3.h, Set {
    @l
    private final PersistentOrderedMapBuilder a;

    public PersistentOrderedMapBuilderKeys(@l PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        L.p(persistentOrderedMapBuilder0, "builder");
        super();
        this.a = persistentOrderedMapBuilder0;
    }

    @Override  // kotlin.collections.h
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.h
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    @l
    public Iterator iterator() {
        return new PersistentOrderedMapBuilderKeysIterator(this.a);
    }

    @Override
    public boolean remove(Object object0) {
        if(this.a.containsKey(object0)) {
            this.a.remove(object0);
            return true;
        }
        return false;
    }
}

