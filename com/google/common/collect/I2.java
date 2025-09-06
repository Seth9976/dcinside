package com.google.common.collect;

import J1.b;
import O1.a;
import java.util.Collection;
import java.util.List;

@b
@C1
public abstract class i2 extends l2 implements y3 {
    @Override  // com.google.common.collect.l2
    protected Object K() {
        return this.N();
    }

    @Override  // com.google.common.collect.l2
    protected M3 M() {
        return this.N();
    }

    protected abstract y3 N();

    @Override  // com.google.common.collect.l2, com.google.common.collect.y3
    @a
    public Collection a(@o3.a Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.collect.y3
    @a
    public List a(@o3.a Object object0) {
        return this.N().a(object0);
    }

    @Override  // com.google.common.collect.l2, com.google.common.collect.y3
    @a
    public Collection b(@d4 Object object0, Iterable iterable0) {
        return this.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.y3
    @a
    public List b(@d4 Object object0, Iterable iterable0) {
        return this.N().b(object0, iterable0);
    }

    @Override  // com.google.common.collect.l2, com.google.common.collect.y3
    public Collection get(@d4 Object object0) {
        return this.get(object0);
    }

    @Override  // com.google.common.collect.y3
    public List get(@d4 Object object0) {
        return this.N().get(object0);
    }
}

