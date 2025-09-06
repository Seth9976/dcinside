package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.collections.i;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPersistentHashMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class PersistentHashMapEntries extends i implements ImmutableSet {
    @l
    private final PersistentHashMap b;

    public PersistentHashMapEntries(@l PersistentHashMap persistentHashMap0) {
        L.p(persistentHashMap0, "map");
        super();
        this.b = persistentHashMap0;
    }

    @Override  // kotlin.collections.a
    public int a() {
        return this.b.size();
    }

    public boolean b(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        Object object0 = map$Entry0.getKey();
        Object object1 = this.b.get(object0);
        if(object1 != null) {
            return L.g(object1, map$Entry0.getValue());
        }
        if(map$Entry0.getValue() == null) {
            Object object2 = map$Entry0.getKey();
            return this.b.containsKey(object2);
        }
        return false;
    }

    @Override  // kotlin.collections.a
    public final boolean contains(Object object0) {
        return object0 instanceof Map.Entry ? this.b(((Map.Entry)object0)) : false;
    }

    @Override  // kotlin.collections.i
    @l
    public Iterator iterator() {
        return new PersistentHashMapEntriesIterator(this.b.r());
    }
}

