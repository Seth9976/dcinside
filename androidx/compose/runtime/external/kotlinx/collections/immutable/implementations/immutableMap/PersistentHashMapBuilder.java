package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.g;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PersistentHashMapBuilder extends g implements Builder, Map {
    @l
    private PersistentHashMap a;
    @l
    private MutabilityOwnership b;
    @l
    private TrieNode c;
    @m
    private Object d;
    private int e;
    private int f;

    public PersistentHashMapBuilder(@l PersistentHashMap persistentHashMap0) {
        L.p(persistentHashMap0, "map");
        super();
        this.a = persistentHashMap0;
        this.b = new MutabilityOwnership();
        this.c = this.a.r();
        this.f = this.a.size();
    }

    @Override  // kotlin.collections.g
    @l
    public Set a() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override  // kotlin.collections.g
    @l
    public Set b() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
    public PersistentMap build() {
        return this.f();
    }

    @Override  // kotlin.collections.g
    public int c() {
        return this.f;
    }

    @Override
    public void clear() {
        TrieNode trieNode0 = TrieNode.e.a();
        L.n(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = trieNode0;
        this.q(0);
    }

    @Override  // j$.util.Map
    public Object compute(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$compute(this, object0, biFunction0);
    }

    @Override  // j$.util.Map
    public Object computeIfAbsent(Object object0, Function function0) {
        return Map.-CC.$default$computeIfAbsent(this, object0, function0);
    }

    @Override  // j$.util.Map
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$computeIfPresent(this, object0, biFunction0);
    }

    @Override
    public boolean containsKey(Object object0) {
        TrieNode trieNode0 = this.c;
        return object0 == null ? trieNode0.n(0, null, 0) : trieNode0.n(object0.hashCode(), object0, 0);
    }

    @Override  // kotlin.collections.g
    @l
    public Collection d() {
        return new PersistentHashMapBuilderValues(this);
    }

    @l
    public PersistentHashMap f() {
        PersistentHashMap persistentHashMap0;
        if(this.c == this.a.r()) {
            persistentHashMap0 = this.a;
        }
        else {
            this.b = new MutabilityOwnership();
            persistentHashMap0 = new PersistentHashMap(this.c, this.size());
        }
        this.a = persistentHashMap0;
        return persistentHashMap0;
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    public final int g() {
        return this.e;
    }

    @Override
    @m
    public Object get(Object object0) {
        TrieNode trieNode0 = this.c;
        return object0 == null ? trieNode0.r(0, null, 0) : trieNode0.r(object0.hashCode(), object0, 0);
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    @l
    public final TrieNode h() {
        return this.c;
    }

    @m
    public final Object i() {
        return this.d;
    }

    @l
    public final MutabilityOwnership j() {
        return this.b;
    }

    public final void l(int v) {
        this.e = v;
    }

    public final void m(@l TrieNode trieNode0) {
        L.p(trieNode0, "<set-?>");
        this.c = trieNode0;
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    public final void o(@m Object object0) {
        this.d = object0;
    }

    @Override  // kotlin.collections.g
    @m
    public Object put(Object object0, Object object1) {
        this.d = null;
        this.c = this.c.G((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        return this.d;
    }

    @Override
    public void putAll(@l java.util.Map map0) {
        L.p(map0, "from");
        PersistentHashMap persistentHashMap0 = map0 instanceof PersistentHashMap ? ((PersistentHashMap)map0) : null;
        if(persistentHashMap0 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder0 = map0 instanceof PersistentHashMapBuilder ? ((PersistentHashMapBuilder)map0) : null;
            persistentHashMap0 = persistentHashMapBuilder0 == null ? null : persistentHashMapBuilder0.f();
        }
        if(persistentHashMap0 == null) {
            super.putAll(map0);
        }
        else {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            TrieNode trieNode0 = this.c;
            TrieNode trieNode1 = persistentHashMap0.r();
            L.n(trieNode1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.c = trieNode0.H(trieNode1, 0, deltaCounter0, this);
            int v1 = persistentHashMap0.size() + v - deltaCounter0.d();
            if(v != v1) {
                this.q(v1);
            }
        }
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return Map.-CC.$default$putIfAbsent(this, object0, object1);
    }

    public void q(int v) {
        this.f = v;
        ++this.e;
    }

    @Override
    @m
    public Object remove(Object object0) {
        this.d = null;
        TrieNode trieNode0 = this.c.J((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        if(trieNode0 == null) {
            trieNode0 = TrieNode.e.a();
            L.n(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = trieNode0;
        return this.d;
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        int v = this.size();
        TrieNode trieNode0 = this.c.K((object0 == null ? 0 : object0.hashCode()), object0, object1, 0, this);
        if(trieNode0 == null) {
            trieNode0 = TrieNode.e.a();
            L.n(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = trieNode0;
        return v != this.size();
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        return Map.-CC.$default$replace(this, object0, object1);
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        return Map.-CC.$default$replace(this, object0, object1, object2);
    }

    @Override  // j$.util.Map
    public void replaceAll(BiFunction biFunction0) {
        Map.-CC.$default$replaceAll(this, biFunction0);
    }
}

