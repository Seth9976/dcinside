package com.google.protobuf.kotlin;

import B3.a;
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

public final class DslMap implements a, Map, java.util.Map {
    @l
    private final java.util.Map delegate;

    @OnlyForUseByGeneratedProtoCode
    public DslMap(@l java.util.Map map0) {
        L.p(map0, "delegate");
        super();
        this.delegate = map0;
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
        return this.delegate.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.delegate.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        return this.getEntries();
    }

    @Override
    public boolean equals(@m Object object0) {
        return L.g(this.delegate, object0);
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    @m
    public Object get(Object object0) {
        return this.delegate.get(object0);
    }

    @l
    public Set getEntries() {
        return new UnmodifiableMapEntries(this.delegate.entrySet());
    }

    @l
    public Set getKeys() {
        return new UnmodifiableSet(this.delegate.keySet());
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    public int getSize() {
        return this.delegate.size();
    }

    @l
    public Collection getValues() {
        return new UnmodifiableCollection(this.delegate.values());
    }

    @Override
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.getKeys();
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
        return this.getSize();
    }

    @Override
    @l
    public String toString() {
        return this.delegate.toString();
    }

    @Override
    public final Collection values() {
        return this.getValues();
    }
}

