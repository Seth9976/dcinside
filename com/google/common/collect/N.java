package com.google.common.collect;

import J1.b;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@b
@C1
abstract class n extends p {
    n(SortedMap sortedMap0) {
        super(sortedMap0);
    }

    public SortedMap T() {
        return (SortedMap)super.c();
    }

    SortedMap U() {
        return (SortedMap)super.x();
    }

    public SortedSet V() {
        return (SortedSet)super.keySet();
    }

    @Override  // com.google.common.collect.p
    public Map c() {
        return this.T();
    }

    @Override  // com.google.common.collect.e
    Set g() {
        return this.C();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public Set keySet() {
        return this.V();
    }

    @Override  // com.google.common.collect.e
    Map x() {
        return this.U();
    }
}

