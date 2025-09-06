package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
public final class PersistentHashSet extends i implements PersistentSet {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PersistentSet a() {
            return PersistentHashSet.e;
        }
    }

    @l
    private final TrieNode b;
    private final int c;
    @l
    public static final Companion d;
    @l
    private static final PersistentHashSet e;

    static {
        PersistentHashSet.d = new Companion(null);
        PersistentHashSet.e = new PersistentHashSet(TrieNode.d.a(), 0);
    }

    public PersistentHashSet(@l TrieNode trieNode0, int v) {
        L.p(trieNode0, "node");
        super();
        this.b = trieNode0;
        this.c = v;
    }

    @Override  // kotlin.collections.a
    public int a() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet add(Object object0) {
        TrieNode trieNode0 = this.b.b((object0 == null ? 0 : object0.hashCode()), object0, 0);
        return this.b == trieNode0 ? this : new PersistentHashSet(trieNode0, this.size() + 1);
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
        return new PersistentHashSetBuilder(this);
    }

    @l
    public final TrieNode c() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet clear() {
        return PersistentHashSet.d.a();
    }

    @Override  // kotlin.collections.a
    public boolean contains(Object object0) {
        return object0 == null ? this.b.i(0, null, 0) : this.b.i(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.a
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(collection0 instanceof PersistentHashSet) {
            return this.b.j(((PersistentHashSet)collection0).b, 0);
        }
        if(collection0 instanceof PersistentHashSetBuilder) {
            TrieNode trieNode0 = ((PersistentHashSetBuilder)collection0).d();
            return this.b.j(trieNode0, 0);
        }
        return super.containsAll(collection0);
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

    @Override  // kotlin.collections.i
    @l
    public Iterator iterator() {
        return new PersistentHashSetIterator(this.b);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    @l
    public PersistentSet remove(Object object0) {
        TrieNode trieNode0 = this.b.K((object0 == null ? 0 : object0.hashCode()), object0, 0);
        return this.b == trieNode0 ? this : new PersistentHashSet(trieNode0, this.size() - 1);
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

