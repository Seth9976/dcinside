package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
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

public final class PersistentOrderedMapBuilder extends g implements Builder, Map {
    @l
    private PersistentOrderedMap a;
    @m
    private Object b;
    @m
    private Object c;
    @l
    private final PersistentHashMapBuilder d;

    public PersistentOrderedMapBuilder(@l PersistentOrderedMap persistentOrderedMap0) {
        L.p(persistentOrderedMap0, "map");
        super();
        this.a = persistentOrderedMap0;
        this.b = persistentOrderedMap0.q();
        this.c = this.a.s();
        this.d = this.a.r().m();
    }

    @Override  // kotlin.collections.g
    @l
    public Set a() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Override  // kotlin.collections.g
    @l
    public Set b() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder
    @l
    public PersistentMap build() {
        PersistentOrderedMap persistentOrderedMap0;
        PersistentHashMap persistentHashMap0 = this.d.f();
        if(persistentHashMap0 == this.a.r()) {
            boolean z = this.b != this.a.q();
            boolean z1 = this.c != this.a.s();
            persistentOrderedMap0 = this.a;
        }
        else {
            persistentOrderedMap0 = new PersistentOrderedMap(this.b, this.c, persistentHashMap0);
        }
        this.a = persistentOrderedMap0;
        return persistentOrderedMap0;
    }

    @Override  // kotlin.collections.g
    public int c() {
        return this.d.size();
    }

    @Override
    public void clear() {
        this.d.clear();
        this.b = EndOfChain.a;
        this.c = EndOfChain.a;
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
        return this.d.containsKey(object0);
    }

    @Override  // kotlin.collections.g
    @l
    public Collection d() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @m
    public final Object f() {
        return this.b;
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @l
    public final PersistentHashMapBuilder g() {
        return this.d;
    }

    @Override
    @m
    public Object get(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.d.get(object0);
        return linkedValue0 == null ? null : linkedValue0.e();
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override  // kotlin.collections.g
    @m
    public Object put(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.d.get(object0);
        if(linkedValue0 != null) {
            if(linkedValue0.e() == object1) {
                return object1;
            }
            LinkedValue linkedValue1 = linkedValue0.h(object1);
            this.d.put(object0, linkedValue1);
            return linkedValue0.e();
        }
        if(this.isEmpty()) {
            this.b = object0;
            this.c = object0;
            LinkedValue linkedValue2 = new LinkedValue(object1);
            this.d.put(object0, linkedValue2);
            return null;
        }
        Object object2 = this.c;
        Object object3 = this.d.get(object2);
        L.m(object3);
        LinkedValue linkedValue3 = ((LinkedValue)object3).f(object0);
        this.d.put(object2, linkedValue3);
        LinkedValue linkedValue4 = new LinkedValue(object1, object2);
        this.d.put(object0, linkedValue4);
        this.c = object0;
        return null;
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return Map.-CC.$default$putIfAbsent(this, object0, object1);
    }

    @Override
    @m
    public Object remove(Object object0) {
        LinkedValue linkedValue0 = (LinkedValue)this.d.remove(object0);
        if(linkedValue0 == null) {
            return null;
        }
        if(linkedValue0.b()) {
            Object object1 = this.d.get(linkedValue0.d());
            L.m(object1);
            LinkedValue linkedValue1 = ((LinkedValue)object1).f(linkedValue0.c());
            this.d.put(linkedValue0.d(), linkedValue1);
        }
        else {
            this.b = linkedValue0.c();
        }
        if(linkedValue0.a()) {
            Object object2 = this.d.get(linkedValue0.c());
            L.m(object2);
            LinkedValue linkedValue2 = ((LinkedValue)object2).g(linkedValue0.d());
            this.d.put(linkedValue0.c(), linkedValue2);
            return linkedValue0.e();
        }
        this.c = linkedValue0.d();
        return linkedValue0.e();
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        LinkedValue linkedValue0 = (LinkedValue)this.d.get(object0);
        if(linkedValue0 == null) {
            return false;
        }
        if(L.g(linkedValue0.e(), object1)) {
            this.remove(object0);
            return true;
        }
        return false;
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

