package com.google.common.collect;

import J1.c;
import J1.d;
import java.util.Iterator;
import java.util.NavigableSet;
import o3.a;

@c
@C1
final class z1 extends k3 {
    private final k3 k;

    z1(k3 k30) {
        super(c4.q(k30.comparator()).P());
        this.k = k30;
    }

    @Override  // com.google.common.collect.k3
    k3 B0(Object object0, boolean z, Object object1, boolean z1) {
        return this.k.A0(object1, z1, object0, z).Z();
    }

    @Override  // com.google.common.collect.k3
    k3 E0(Object object0, boolean z) {
        return this.k.c0(object0, z).Z();
    }

    @Override  // com.google.common.collect.k3
    @c("NavigableSet")
    k3 X() {
        throw new AssertionError("should never be called");
    }

    @Override  // com.google.common.collect.k3
    @c("NavigableSet")
    public u5 Y() {
        return this.k.i();
    }

    @Override  // com.google.common.collect.k3
    @c("NavigableSet")
    public k3 Z() {
        return this.k;
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object ceiling(Object object0) {
        return this.k.floor(object0);
    }

    @Override  // com.google.common.collect.K2
    public boolean contains(@a Object object0) {
        return this.k.contains(object0);
    }

    @Override  // com.google.common.collect.k3
    @c("NavigableSet")
    public Iterator descendingIterator() {
        return this.Y();
    }

    @Override  // com.google.common.collect.k3
    @c("NavigableSet")
    public NavigableSet descendingSet() {
        return this.Z();
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object floor(Object object0) {
        return this.k.ceiling(object0);
    }

    @Override  // com.google.common.collect.k3
    k3 g0(Object object0, boolean z) {
        return this.k.D0(object0, z).Z();
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return this.k.h();
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object higher(Object object0) {
        return this.k.lower(object0);
    }

    @Override  // com.google.common.collect.k3
    public u5 i() {
        return this.k.Y();
    }

    @Override  // com.google.common.collect.k3
    int indexOf(@a Object object0) {
        int v = this.k.indexOf(object0);
        return v == -1 ? -1 : this.size() - 1 - v;
    }

    @Override  // com.google.common.collect.k3
    public Iterator iterator() {
        return this.i();
    }

    @Override  // com.google.common.collect.k3
    @d
    Object k() {
        return super.k();
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object lower(Object object0) {
        return this.k.higher(object0);
    }

    @Override
    public int size() {
        return this.k.size();
    }
}

