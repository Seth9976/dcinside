package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
public final class PersistentOrderedSet extends i implements PersistentSet {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PersistentSet a() {
            return PersistentOrderedSet.f;
        }
    }

    @m
    private final Object b;
    @m
    private final Object c;
    @l
    private final PersistentHashMap d;
    @l
    public static final Companion e;
    @l
    private static final PersistentOrderedSet f;

    static {
        PersistentOrderedSet.e = new Companion(null);
        PersistentHashMap persistentHashMap0 = PersistentHashMap.f.a();
        PersistentOrderedSet.f = new PersistentOrderedSet(EndOfChain.a, EndOfChain.a, persistentHashMap0);
    }

    public PersistentOrderedSet(@m Object object0, @m Object object1, @l PersistentHashMap persistentHashMap0) {
        L.p(persistentHashMap0, "hashMap");
        super();
        this.b = object0;
        this.c = object1;
        this.d = persistentHashMap0;
    }

    @Override  // kotlin.collections.a
    public int a() {
        return this.d.size();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet add(Object object0) {
        if(this.d.containsKey(object0)) {
            return this;
        }
        if(this.isEmpty()) {
            Links links0 = new Links();
            return new PersistentOrderedSet(object0, object0, this.d.t(object0, links0));
        }
        Object object1 = this.d.get(this.c);
        L.m(object1);
        Links links1 = ((Links)object1).e(object0);
        PersistentHashMap persistentHashMap0 = this.d.t(this.c, links1).t(object0, new Links(this.c));
        return new PersistentOrderedSet(this.b, object0, persistentHashMap0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.addAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public Builder builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @m
    public final Object c() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet clear() {
        return PersistentOrderedSet.e.a();
    }

    @Override  // kotlin.collections.a
    public boolean contains(Object object0) {
        return this.d.containsKey(object0);
    }

    @l
    public final PersistentHashMap d() {
        return this.d;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection e(Function1 function10) {
        return this.e(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet e(@l Function1 function10) {
        L.p(function10, "predicate");
        Builder persistentSet$Builder0 = this.builder();
        u.G0(persistentSet$Builder0, function10);
        return persistentSet$Builder0.build();
    }

    @m
    public final Object g() {
        return this.c;
    }

    @Override  // kotlin.collections.i
    @l
    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.b, this.d);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet remove(Object object0) {
        Links links0 = (Links)this.d.get(object0);
        if(links0 == null) {
            return this;
        }
        PersistentHashMap persistentHashMap0 = this.d.u(object0);
        if(links0.b()) {
            Object object1 = persistentHashMap0.get(links0.d());
            L.m(object1);
            persistentHashMap0 = persistentHashMap0.t(links0.d(), ((Links)object1).e(links0.c()));
        }
        if(links0.a()) {
            Object object2 = persistentHashMap0.get(links0.c());
            L.m(object2);
            persistentHashMap0 = persistentHashMap0.t(links0.c(), ((Links)object2).f(links0.d()));
        }
        Object object3 = links0.b() ? this.b : links0.c();
        return links0.a() ? new PersistentOrderedSet(object3, this.c, persistentHashMap0) : new PersistentOrderedSet(object3, links0.d(), persistentHashMap0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.removeAll(collection0);
        return persistentSet$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        Builder persistentSet$Builder0 = this.builder();
        persistentSet$Builder0.retainAll(collection0);
        return persistentSet$Builder0.build();
    }
}

