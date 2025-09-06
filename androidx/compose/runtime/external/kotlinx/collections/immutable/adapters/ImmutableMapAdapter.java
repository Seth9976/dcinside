package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import B3.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ImmutableMapAdapter implements a, ImmutableMap, Map, java.util.Map {
    @l
    private final java.util.Map a;
    @l
    private final ImmutableSet b;
    @l
    private final ImmutableCollection c;
    @l
    private final ImmutableSet d;

    public ImmutableMapAdapter(@l java.util.Map map0) {
        L.p(map0, "impl");
        super();
        this.a = map0;
        this.b = new ImmutableSetAdapter(map0.keySet());
        this.c = new ImmutableCollectionAdapter(map0.values());
        this.d = new ImmutableSetAdapter(map0.entrySet());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableCollection Q() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet R() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet T() {
        return this.d;
    }

    public final ImmutableSet a() {
        return this.T();
    }

    public int b() {
        return this.a.size();
    }

    public final ImmutableSet c() {
        return this.R();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    public final ImmutableCollection d() {
        return this.Q();
    }

    @Override
    public Set entrySet() {
        return this.a();
    }

    @Override
    public boolean equals(@m Object object0) {
        return this.a.equals(object0);
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    @m
    public Object get(Object object0) {
        return this.a.get(object0);
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Set keySet() {
        return this.c();
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(java.util.Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.b();
    }

    @Override
    @l
    public String toString() {
        return this.a.toString();
    }

    @Override
    public Collection values() {
        return this.d();
    }
}

