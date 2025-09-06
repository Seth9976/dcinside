package com.unity3d.services.core.extensions;

import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.X;
import y4.l;

public final class CoroutineExtensionsKt.deferreds.1 extends LinkedHashMap implements Map {
    CoroutineExtensionsKt.deferreds.1() {
        super(101);
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
    public final boolean containsValue(Object object0) {
        return object0 instanceof X ? this.containsValue(((X)object0)) : false;
    }

    public boolean containsValue(X x0) {
        return super.containsValue(x0);
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    public Set getEntries() {
        return super.entrySet();
    }

    public Set getKeys() {
        return super.keySet();
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    public int getSize() {
        return super.size();
    }

    public Collection getValues() {
        return super.values();
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return Map.-CC.$default$putIfAbsent(this, object0, object1);
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        if(object0 == null) {
            return false;
        }
        return object1 instanceof X ? this.remove(object0, ((X)object1)) : false;
    }

    public boolean remove(Object object0, X x0) {
        return Map.-CC.$default$remove(this, object0, x0);
    }

    @Override
    protected boolean removeEldestEntry(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "eldest");
        return this.size() > 100;
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

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }
}

