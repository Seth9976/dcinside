package org.bson.util;

import R3.a;
import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

final class d implements Map, java.util.Map, f {
    private final ConcurrentMap a;
    private final f b;

    d(ConcurrentMap concurrentMap0, f f0) {
        this.a = (ConcurrentMap)a.e("map", concurrentMap0);
        this.b = (f)a.e("function", f0);
    }

    public static java.util.Map a(f f0) {
        return new d(e.i(), f0);
    }

    @Override  // org.bson.util.f
    public Object apply(Object object0) {
        return this.get(object0);
    }

    @Override
    public void clear() {
        this.a.clear();
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
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public Set entrySet() {
        return this.a.entrySet();
    }

    @Override
    public boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    public Object get(Object object0) {
        while(true) {
            Object object1 = this.a.get(object0);
            if(object1 != null) {
                return object1;
            }
            Object object2 = this.b.apply(object0);
            if(object2 == null) {
                return null;
            }
            this.a.putIfAbsent(object0, object2);
        }
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
        return this.a.keySet();
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.a.put(object0, object1);
    }

    @Override
    public void putAll(java.util.Map map0) {
        this.a.putAll(map0);
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return this.a.putIfAbsent(object0, object1);
    }

    @Override
    public Object remove(Object object0) {
        return this.a.remove(object0);
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        return this.a.remove(object0, object1);
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        return this.a.replace(object0, object1);
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        return this.a.replace(object0, object1, object2);
    }

    @Override  // j$.util.Map
    public void replaceAll(BiFunction biFunction0) {
        Map.-CC.$default$replaceAll(this, biFunction0);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public Collection values() {
        return this.a.values();
    }
}

