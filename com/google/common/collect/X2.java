package com.google.common.collect;

import J1.b;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o3.a;

@b
@C1
public abstract class x2 extends p2 implements W4 {
    @Override  // com.google.common.collect.p2
    protected Object K() {
        return this.M();
    }

    protected abstract W4 M();

    @Override  // com.google.common.collect.W4
    @a
    public Object Z(@a Object object0, @a Object object1) {
        return this.M().Z(object0, object1);
    }

    @Override  // com.google.common.collect.W4
    public boolean a0(@a Object object0) {
        return this.M().a0(object0);
    }

    @Override  // com.google.common.collect.W4
    public Map b0() {
        return this.M().b0();
    }

    @Override  // com.google.common.collect.W4
    public Map c0(@d4 Object object0) {
        return this.M().c0(object0);
    }

    @Override  // com.google.common.collect.W4
    public void clear() {
        this.M().clear();
    }

    @Override  // com.google.common.collect.W4
    public boolean containsValue(@a Object object0) {
        return this.M().containsValue(object0);
    }

    @Override  // com.google.common.collect.W4
    public boolean equals(@a Object object0) {
        return object0 == this || this.M().equals(object0);
    }

    @Override  // com.google.common.collect.W4
    public Map g() {
        return this.M().g();
    }

    @Override  // com.google.common.collect.W4
    @O1.a
    @a
    public Object g0(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
        return this.M().g0(object0, object1, object2);
    }

    @Override  // com.google.common.collect.W4
    public int hashCode() {
        return this.M().hashCode();
    }

    @Override  // com.google.common.collect.W4
    public Set i() {
        return this.M().i();
    }

    @Override  // com.google.common.collect.W4
    public boolean i0(@a Object object0, @a Object object1) {
        return this.M().i0(object0, object1);
    }

    @Override  // com.google.common.collect.W4
    public boolean isEmpty() {
        return this.M().isEmpty();
    }

    @Override  // com.google.common.collect.W4
    public void j0(W4 w40) {
        this.M().j0(w40);
    }

    @Override  // com.google.common.collect.W4
    public Set k0() {
        return this.M().k0();
    }

    @Override  // com.google.common.collect.W4
    public Set m0() {
        return this.M().m0();
    }

    @Override  // com.google.common.collect.W4
    public boolean n0(@a Object object0) {
        return this.M().n0(object0);
    }

    @Override  // com.google.common.collect.W4
    public Map o0(@d4 Object object0) {
        return this.M().o0(object0);
    }

    @Override  // com.google.common.collect.W4
    @O1.a
    @a
    public Object remove(@a Object object0, @a Object object1) {
        return this.M().remove(object0, object1);
    }

    @Override  // com.google.common.collect.W4
    public int size() {
        return this.M().size();
    }

    @Override  // com.google.common.collect.W4
    public Collection values() {
        return this.M().values();
    }
}

