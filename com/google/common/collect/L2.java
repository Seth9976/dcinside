package com.google.common.collect;

import J1.b;
import O1.a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@b
@C1
public abstract class l2 extends p2 implements M3 {
    @Override  // com.google.common.collect.M3
    public S3 E() {
        return this.M().E();
    }

    @Override  // com.google.common.collect.M3
    @a
    public boolean G(@d4 Object object0, Iterable iterable0) {
        return this.M().G(object0, iterable0);
    }

    @Override  // com.google.common.collect.M3
    public boolean J(@o3.a Object object0, @o3.a Object object1) {
        return this.M().J(object0, object1);
    }

    @Override  // com.google.common.collect.p2
    protected Object K() {
        return this.M();
    }

    protected abstract M3 M();

    @Override  // com.google.common.collect.M3
    @a
    public Collection a(@o3.a Object object0) {
        return this.M().a(object0);
    }

    @Override  // com.google.common.collect.M3
    @a
    public Collection b(@d4 Object object0, Iterable iterable0) {
        return this.M().b(object0, iterable0);
    }

    @Override  // com.google.common.collect.M3
    public Map c() {
        return this.M().c();
    }

    @Override  // com.google.common.collect.M3
    public void clear() {
        this.M().clear();
    }

    @Override  // com.google.common.collect.M3
    public boolean containsKey(@o3.a Object object0) {
        return this.M().containsKey(object0);
    }

    @Override  // com.google.common.collect.M3
    public boolean containsValue(@o3.a Object object0) {
        return this.M().containsValue(object0);
    }

    @Override  // com.google.common.collect.M3
    public boolean equals(@o3.a Object object0) {
        return object0 == this || this.M().equals(object0);
    }

    @Override  // com.google.common.collect.M3
    public Collection get(@d4 Object object0) {
        return this.M().get(object0);
    }

    @Override  // com.google.common.collect.M3
    public Collection h() {
        return this.M().h();
    }

    @Override  // com.google.common.collect.M3
    public int hashCode() {
        return this.M().hashCode();
    }

    @Override  // com.google.common.collect.M3
    public boolean isEmpty() {
        return this.M().isEmpty();
    }

    @Override  // com.google.common.collect.M3
    public Set keySet() {
        return this.M().keySet();
    }

    @Override  // com.google.common.collect.M3
    @a
    public boolean m(M3 m30) {
        return this.M().m(m30);
    }

    @Override  // com.google.common.collect.M3
    @a
    public boolean put(@d4 Object object0, @d4 Object object1) {
        return this.M().put(object0, object1);
    }

    @Override  // com.google.common.collect.M3
    @a
    public boolean remove(@o3.a Object object0, @o3.a Object object1) {
        return this.M().remove(object0, object1);
    }

    @Override  // com.google.common.collect.M3
    public int size() {
        return this.M().size();
    }

    @Override  // com.google.common.collect.M3
    public Collection values() {
        return this.M().values();
    }
}

