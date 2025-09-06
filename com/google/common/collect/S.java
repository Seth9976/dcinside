package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import J1.e;
import O1.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@b(emulated = true, serializable = true)
@C1
public final class s extends t {
    @e
    transient int j;
    private static final int k = 3;
    @c
    @d
    private static final long l;

    private s() {
        this(12, 3);
    }

    private s(int v, int v1) {
        super(f4.d(v));
        c1.b(v1, "expectedValuesPerKey");
        this.j = v1;
    }

    private s(M3 m30) {
        this(m30.keySet().size(), (m30 instanceof s ? ((s)m30).j : 3));
        this.m(m30);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public S3 E() {
        return super.E();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @a
    public boolean G(@d4 Object object0, Iterable iterable0) {
        return super.G(object0, iterable0);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean J(@o3.a Object object0, @o3.a Object object1) {
        return super.J(object0, object1);
    }

    @Override  // com.google.common.collect.d
    List O() {
        return new ArrayList(this.j);
    }

    public static s Q() {
        return new s();
    }

    public static s R(int v, int v1) {
        return new s(v, v1);
    }

    public static s S(M3 m30) {
        return new s(m30);
    }

    @c
    @d
    private void T(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        this.j = 3;
        int v = A4.h(objectInputStream0);
        this.K(e1.w());
        A4.e(this, objectInputStream0, v);
    }

    @Deprecated
    public void U() {
        for(Object object0: this.x().values()) {
            ((ArrayList)(((Collection)object0))).trimToSize();
        }
    }

    @c
    @d
    private void V(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        A4.j(this, objectOutputStream0);
    }

    @Override  // com.google.common.collect.d
    @a
    public List a(@o3.a Object object0) {
        return super.a(object0);
    }

    @Override  // com.google.common.collect.d
    @a
    public List b(@d4 Object object0, Iterable iterable0) {
        return super.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.d
    public Map c() {
        return super.c();
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public void clear() {
        super.clear();
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public boolean containsKey(@o3.a Object object0) {
        return super.containsKey(object0);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean containsValue(@o3.a Object object0) {
        return super.containsValue(object0);
    }

    @Override  // com.google.common.collect.d
    public boolean equals(@o3.a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.d
    public List get(@d4 Object object0) {
        return super.get(object0);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public Collection h() {
        return super.h();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public Set keySet() {
        return super.keySet();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @a
    public boolean m(M3 m30) {
        return super.m(m30);
    }

    @Override  // com.google.common.collect.d
    @a
    public boolean put(@d4 Object object0, @d4 Object object1) {
        return super.put(object0, object1);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @a
    public boolean remove(@o3.a Object object0, @o3.a Object object1) {
        return super.remove(object0, object1);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public int size() {
        return super.size();
    }

    @Override  // com.google.common.collect.h
    public String toString() {
        return super.toString();
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public Collection values() {
        return super.values();
    }

    @Override  // com.google.common.collect.d
    Collection y() {
        return this.O();
    }
}

