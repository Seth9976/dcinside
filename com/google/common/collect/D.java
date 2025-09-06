package com.google.common.collect;

import J1.b;
import O1.a;
import j..util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@b
@C1
abstract class d extends e implements y3 {
    private static final long i = 0x5B6E85FC5D362EA5L;

    protected d(Map map0) {
        super(map0);
    }

    @Override  // com.google.common.collect.e
    Collection D() {
        return this.P();
    }

    @Override  // com.google.common.collect.e
    Collection L(Collection collection0) {
        return DesugarCollections.unmodifiableList(((List)collection0));
    }

    @Override  // com.google.common.collect.e
    Collection M(@d4 Object object0, Collection collection0) {
        return this.N(object0, ((List)collection0), null);
    }

    abstract List O();

    List P() {
        return Collections.emptyList();
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.y3
    @a
    public Collection a(@o3.a Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.collect.y3
    @a
    public List a(@o3.a Object object0) {
        return (List)super.a(object0);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.y3
    @a
    public Collection b(@d4 Object object0, Iterable iterable0) {
        return this.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.y3
    @a
    public List b(@d4 Object object0, Iterable iterable0) {
        return (List)super.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.y3, com.google.common.collect.h
    public Map c() {
        return super.c();
    }

    @Override  // com.google.common.collect.y3, com.google.common.collect.h
    public boolean equals(@o3.a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.y3
    public Collection get(@d4 Object object0) {
        return this.get(object0);
    }

    @Override  // com.google.common.collect.y3
    public List get(@d4 Object object0) {
        return (List)super.get(object0);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    @a
    public boolean put(@d4 Object object0, @d4 Object object1) {
        return super.put(object0, object1);
    }

    @Override  // com.google.common.collect.e
    Collection y() {
        return this.O();
    }
}

