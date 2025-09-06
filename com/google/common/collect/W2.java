package com.google.common.collect;

import J1.b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import o3.a;

@b
@C1
public abstract class w2 extends s2 implements R4 {
    @Override  // com.google.common.collect.s2
    protected Object K() {
        return this.O();
    }

    @Override  // com.google.common.collect.s2
    protected M3 M() {
        return this.O();
    }

    @Override  // com.google.common.collect.s2
    protected C4 N() {
        return this.O();
    }

    protected abstract R4 O();

    @Override  // com.google.common.collect.s2, com.google.common.collect.R4
    public Collection a(@a Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.collect.s2, com.google.common.collect.R4
    public Set a(@a Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.collect.R4
    public SortedSet a(@a Object object0) {
        return this.O().a(object0);
    }

    @Override  // com.google.common.collect.s2, com.google.common.collect.R4
    public Collection b(@d4 Object object0, Iterable iterable0) {
        return this.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.s2, com.google.common.collect.R4
    public Set b(@d4 Object object0, Iterable iterable0) {
        return this.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.R4
    public SortedSet b(@d4 Object object0, Iterable iterable0) {
        return this.O().b(object0, iterable0);
    }

    @Override  // com.google.common.collect.s2, com.google.common.collect.R4
    public Collection get(@d4 Object object0) {
        return this.get(object0);
    }

    @Override  // com.google.common.collect.s2, com.google.common.collect.R4
    public Set get(@d4 Object object0) {
        return this.get(object0);
    }

    @Override  // com.google.common.collect.R4
    public SortedSet get(@d4 Object object0) {
        return this.O().get(object0);
    }

    @Override  // com.google.common.collect.R4
    @a
    public Comparator r() {
        return this.O().r();
    }
}

