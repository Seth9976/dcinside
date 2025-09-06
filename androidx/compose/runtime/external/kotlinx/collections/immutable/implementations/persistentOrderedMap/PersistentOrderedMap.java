package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
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

@s0({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
public final class PersistentOrderedMap extends d implements PersistentMap {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PersistentOrderedMap a() {
            PersistentOrderedMap persistentOrderedMap0 = PersistentOrderedMap.h;
            L.n(persistentOrderedMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap0;
        }
    }

    @m
    private final Object d;
    @m
    private final Object e;
    @l
    private final PersistentHashMap f;
    @l
    public static final Companion g;
    @l
    private static final PersistentOrderedMap h;

    static {
        PersistentOrderedMap.g = new Companion(null);
        PersistentHashMap persistentHashMap0 = PersistentHashMap.f.a();
        PersistentOrderedMap.h = new PersistentOrderedMap(EndOfChain.a, EndOfChain.a, persistentHashMap0);
    }

    public PersistentOrderedMap(@m Object object0, @m Object object1, @l PersistentHashMap persistentHashMap0) {
        L.p(persistentHashMap0, "hashMap");
        super();
        this.d = object0;
        this.e = object1;
        this.f = persistentHashMap0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableCollection Q() {
        return new PersistentOrderedMapValues(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet R() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet T() {
        return this.m();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public Builder builder() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override  // kotlin.collections.d
    @b0
    @l
    public final Set c() {
        return this.m();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentMap clear() {
        return PersistentOrderedMap.g.a();
    }

    @Override  // kotlin.collections.d
    public boolean containsKey(Object object0) {
        return this.f.containsKey(object0);
    }

    @Override  // kotlin.collections.d
    public Set d() {
        return this.R();
    }

    @Override  // kotlin.collections.d
    public int f() {
        return this.f.size();
    }

    @Override  // kotlin.collections.d
    public Collection g() {
        return this.Q();
    }

    @Override  // kotlin.collections.d
    @m
    public Object get(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.f.get(object0);
        return linkedValue0 == null ? null : linkedValue0.e();
    }

    private final ImmutableSet m() {
        return new PersistentOrderedMapEntries(this);
    }

    public final ImmutableSet o() {
        return this.T();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap put(Object object0, Object object1) {
        return this.u(object0, object1);
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

    @m
    public final Object q() {
        return this.d;
    }

    @l
    public final PersistentHashMap r() {
        return this.f;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0) {
        return this.v(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap remove(Object object0, Object object1) {
        return this.w(object0, object1);
    }

    @m
    public final Object s() {
        return this.e;
    }

    public final ImmutableSet t() {
        return this.R();
    }

    @l
    public PersistentOrderedMap u(Object object0, Object object1) {
        if(this.isEmpty()) {
            LinkedValue linkedValue0 = new LinkedValue(object1);
            return new PersistentOrderedMap(object0, object0, this.f.t(object0, linkedValue0));
        }
        LinkedValue linkedValue1 = (LinkedValue)this.f.get(object0);
        if(linkedValue1 != null) {
            if(linkedValue1.e() == object1) {
                return this;
            }
            LinkedValue linkedValue2 = linkedValue1.h(object1);
            PersistentHashMap persistentHashMap0 = this.f.t(object0, linkedValue2);
            return new PersistentOrderedMap(this.d, this.e, persistentHashMap0);
        }
        Object object2 = this.f.get(this.e);
        L.m(object2);
        LinkedValue linkedValue3 = ((LinkedValue)object2).f(object0);
        PersistentHashMap persistentHashMap1 = this.f.t(this.e, linkedValue3).t(object0, new LinkedValue(object1, this.e));
        return new PersistentOrderedMap(this.d, object0, persistentHashMap1);
    }

    @l
    public PersistentOrderedMap v(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.f.get(object0);
        if(linkedValue0 == null) {
            return this;
        }
        PersistentHashMap persistentHashMap0 = this.f.u(object0);
        if(linkedValue0.b()) {
            Object object1 = persistentHashMap0.get(linkedValue0.d());
            L.m(object1);
            persistentHashMap0 = persistentHashMap0.t(linkedValue0.d(), ((LinkedValue)object1).f(linkedValue0.c()));
        }
        if(linkedValue0.a()) {
            Object object2 = persistentHashMap0.get(linkedValue0.c());
            L.m(object2);
            persistentHashMap0 = persistentHashMap0.t(linkedValue0.c(), ((LinkedValue)object2).g(linkedValue0.d()));
        }
        Object object3 = linkedValue0.b() ? this.d : linkedValue0.c();
        return linkedValue0.a() ? new PersistentOrderedMap(object3, this.e, persistentHashMap0) : new PersistentOrderedMap(object3, linkedValue0.d(), persistentHashMap0);
    }

    @l
    public PersistentOrderedMap w(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.f.get(object0);
        if(linkedValue0 == null) {
            return this;
        }
        return L.g(linkedValue0.e(), object1) ? this.v(object0) : this;
    }

    public final ImmutableCollection x() {
        return this.Q();
    }
}

