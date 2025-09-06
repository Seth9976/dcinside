package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPersistentHashMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class PersistentHashMapBuilderEntries extends AbstractMapBuilderEntries {
    @l
    private final PersistentHashMapBuilder a;

    public PersistentHashMapBuilderEntries(@l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "builder");
        super();
        this.a = persistentHashMapBuilder0;
    }

    @Override  // kotlin.collections.h
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.h
    public boolean add(Object object0) {
        return this.h(((Map.Entry)object0));
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean c(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        Object object0 = map$Entry0.getKey();
        Object object1 = this.a.get(object0);
        if(object1 != null) {
            return L.g(object1, map$Entry0.getValue());
        }
        if(map$Entry0.getValue() == null) {
            Object object2 = map$Entry0.getKey();
            return this.a.containsKey(object2);
        }
        return false;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean g(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        Object object0 = map$Entry0.getKey();
        Object object1 = map$Entry0.getValue();
        return this.a.remove(object0, object1);
    }

    public boolean h(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        throw new UnsupportedOperationException();
    }

    @Override
    @l
    public Iterator iterator() {
        return new PersistentHashMapBuilderEntriesIterator(this.a);
    }
}

