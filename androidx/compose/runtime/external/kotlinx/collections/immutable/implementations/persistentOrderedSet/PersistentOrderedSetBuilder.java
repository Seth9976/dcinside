package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Iterator;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PersistentOrderedSetBuilder extends h implements Builder {
    @l
    private PersistentOrderedSet a;
    @m
    private Object b;
    @m
    private Object c;
    @l
    private final PersistentHashMapBuilder d;

    public PersistentOrderedSetBuilder(@l PersistentOrderedSet persistentOrderedSet0) {
        L.p(persistentOrderedSet0, "set");
        super();
        this.a = persistentOrderedSet0;
        this.b = persistentOrderedSet0.c();
        this.c = this.a.g();
        this.d = this.a.d().m();
    }

    @Override  // kotlin.collections.h
    public int a() {
        return this.d.size();
    }

    @Override  // kotlin.collections.h
    public boolean add(Object object0) {
        if(this.d.containsKey(object0)) {
            return false;
        }
        if(this.isEmpty()) {
            this.b = object0;
            this.c = object0;
            Links links0 = new Links();
            this.d.put(object0, links0);
            return true;
        }
        Object object1 = this.d.get(this.c);
        L.m(object1);
        Object object2 = this.c;
        Links links1 = ((Links)object1).e(object0);
        this.d.put(object2, links1);
        Links links2 = new Links(this.c);
        this.d.put(object0, links2);
        this.c = object0;
        return true;
    }

    @m
    public final Object b() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet$Builder
    @l
    public PersistentSet build() {
        PersistentOrderedSet persistentOrderedSet0;
        PersistentHashMap persistentHashMap0 = this.d.f();
        if(persistentHashMap0 == this.a.d()) {
            boolean z = this.b != this.a.c();
            boolean z1 = this.c != this.a.g();
            persistentOrderedSet0 = this.a;
        }
        else {
            persistentOrderedSet0 = new PersistentOrderedSet(this.b, this.c, persistentHashMap0);
        }
        this.a = persistentOrderedSet0;
        return persistentOrderedSet0;
    }

    @l
    public final PersistentHashMapBuilder c() {
        return this.d;
    }

    @Override
    public void clear() {
        this.d.clear();
        this.b = EndOfChain.a;
        this.c = EndOfChain.a;
    }

    @Override
    public boolean contains(Object object0) {
        return this.d.containsKey(object0);
    }

    public final void d(@m Object object0) {
        this.b = object0;
    }

    @Override
    @l
    public Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override
    public boolean remove(Object object0) {
        Links links0 = (Links)this.d.remove(object0);
        if(links0 == null) {
            return false;
        }
        if(links0.b()) {
            Object object1 = this.d.get(links0.d());
            L.m(object1);
            Links links1 = ((Links)object1).e(links0.c());
            this.d.put(links0.d(), links1);
        }
        else {
            this.b = links0.c();
        }
        if(links0.a()) {
            Object object2 = this.d.get(links0.c());
            L.m(object2);
            Links links2 = ((Links)object2).f(links0.d());
            this.d.put(links0.c(), links2);
            return true;
        }
        this.c = links0.d();
        return true;
    }
}

