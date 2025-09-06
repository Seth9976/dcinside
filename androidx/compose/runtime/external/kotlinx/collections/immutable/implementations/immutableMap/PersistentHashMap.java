package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.b0;
import kotlin.collections.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
public final class PersistentHashMap extends d implements PersistentMap {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PersistentHashMap a() {
            PersistentHashMap persistentHashMap0 = PersistentHashMap.g;
            L.n(persistentHashMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap0;
        }
    }

    @l
    private final TrieNode d;
    private final int e;
    @l
    public static final Companion f;
    @l
    private static final PersistentHashMap g;

    static {
        PersistentHashMap.f = new Companion(null);
        PersistentHashMap.g = new PersistentHashMap(TrieNode.e.a(), 0);
    }

    public PersistentHashMap(@l TrieNode trieNode0, int v) {
        L.p(trieNode0, "node");
        super();
        this.d = trieNode0;
        this.e = v;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableCollection Q() {
        return new PersistentHashMapValues(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet R() {
        return new PersistentHashMapKeys(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet T() {
        return this.o();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public Builder builder() {
        return this.m();
    }

    @Override  // kotlin.collections.d
    @b0
    @l
    public final Set c() {
        return this.o();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentMap clear() {
        return PersistentHashMap.f.a();
    }

    @Override  // kotlin.collections.d
    public boolean containsKey(Object object0) {
        return object0 == null ? this.d.n(0, null, 0) : this.d.n(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.d
    public Set d() {
        return this.R();
    }

    @Override  // kotlin.collections.d
    public int f() {
        return this.e;
    }

    @Override  // kotlin.collections.d
    public Collection g() {
        return this.Q();
    }

    @Override  // kotlin.collections.d
    @m
    public Object get(Object object0) {
        return object0 == null ? this.d.r(0, null, 0) : this.d.r(object0.hashCode(), object0, 0);
    }

    @l
    public PersistentHashMapBuilder m() {
        return new PersistentHashMapBuilder(this);
    }

    private final ImmutableSet o() {
        return new PersistentHashMapEntries(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap put(Object object0, Object object1) {
        return this.t(object0, object1);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentMap putAll(@l Map map0) {
        L.p(map0, "m");
        L.n(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        Builder persistentMap$Builder0 = this.builder();
        persistentMap$Builder0.putAll(map0);
        return persistentMap$Builder0.build();
    }

    public final ImmutableSet q() {
        return this.T();
    }

    @l
    public final TrieNode r() {
        return this.d;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0) {
        return this.u(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0, Object object1) {
        return this.v(object0, object1);
    }

    public final ImmutableSet s() {
        return this.R();
    }

    @l
    public PersistentHashMap t(Object object0, Object object1) {
        ModificationResult trieNode$ModificationResult0 = this.d.S((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        return trieNode$ModificationResult0 == null ? this : new PersistentHashMap(trieNode$ModificationResult0.a(), this.size() + trieNode$ModificationResult0.b());
    }

    @l
    public PersistentHashMap u(Object object0) {
        TrieNode trieNode0 = this.d.T((object0 == null ? 0 : object0.hashCode()), object0, 0);
        if(this.d == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.f.a() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    @l
    public PersistentHashMap v(Object object0, Object object1) {
        TrieNode trieNode0 = this.d.U((object0 == null ? 0 : object0.hashCode()), object0, object1, 0);
        if(this.d == trieNode0) {
            return this;
        }
        return trieNode0 == null ? PersistentHashMap.f.a() : new PersistentHashMap(trieNode0, this.size() - 1);
    }

    public final ImmutableCollection w() {
        return this.Q();
    }
}

