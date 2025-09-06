package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import O1.a;
import com.google.common.base.H;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@b(emulated = true, serializable = true)
@C1
public class p5 extends n {
    private transient Comparator k;
    private transient Comparator l;
    @c
    @d
    private static final long m;

    p5(Comparator comparator0, Comparator comparator1) {
        super(new TreeMap(comparator0));
        this.k = comparator0;
        this.l = comparator1;
    }

    private p5(Comparator comparator0, Comparator comparator1, M3 m30) {
        this(comparator0, comparator1);
        this.m(m30);
    }

    @Override  // com.google.common.collect.e
    Collection A(@d4 Object object0) {
        if(object0 == null) {
            this.b0().compare(null, null);
        }
        return super.A(object0);
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

    @Override  // com.google.common.collect.p
    Set O() {
        return this.Q();
    }

    @Override  // com.google.common.collect.p
    SortedSet Q() {
        return new TreeSet(this.l);
    }

    @Override  // com.google.common.collect.n
    public SortedMap T() {
        return this.W();
    }

    @Override  // com.google.common.collect.n
    public SortedSet V() {
        return this.c0();
    }

    public NavigableMap W() {
        return (NavigableMap)super.T();
    }

    public static p5 X() {
        return new p5(c4.K(), c4.K());
    }

    public static p5 Y(M3 m30) {
        return new p5(c4.K(), c4.K(), m30);
    }

    public static p5 Z(Comparator comparator0, Comparator comparator1) {
        return new p5(((Comparator)H.E(comparator0)), ((Comparator)H.E(comparator1)));
    }

    @Override  // com.google.common.collect.p
    @a
    public SortedSet a(@o3.a Object object0) {
        return super.a(object0);
    }

    @c
    public NavigableSet a0(@d4 Object object0) {
        return (NavigableSet)super.get(object0);
    }

    @Override  // com.google.common.collect.p
    @a
    public SortedSet b(@d4 Object object0, Iterable iterable0) {
        return super.b(object0, iterable0);
    }

    @Deprecated
    public Comparator b0() {
        return this.k;
    }

    @Override  // com.google.common.collect.n
    public Map c() {
        return this.W();
    }

    public NavigableSet c0() {
        return (NavigableSet)super.V();
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

    @Override  // com.google.common.collect.e
    Map e() {
        return this.B();
    }

    @c
    @d
    private void e0(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        this.k = (Comparator)H.E(((Comparator)objectInputStream0.readObject()));
        this.l = (Comparator)H.E(((Comparator)objectInputStream0.readObject()));
        this.K(new TreeMap(this.k));
        A4.d(this, objectInputStream0);
    }

    @Override  // com.google.common.collect.m, com.google.common.collect.C4
    public boolean equals(@o3.a Object object0) {
        return super.equals(object0);
    }

    @c
    @d
    private void f0(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.b0());
        objectOutputStream0.writeObject(this.r());
        A4.j(this, objectOutputStream0);
    }

    @Override  // com.google.common.collect.p
    @c
    public Collection get(@d4 Object object0) {
        return this.a0(object0);
    }

    @Override  // com.google.common.collect.p
    @c
    public Set get(@d4 Object object0) {
        return this.a0(object0);
    }

    @Override  // com.google.common.collect.p
    @c
    public SortedSet get(@d4 Object object0) {
        return this.a0(object0);
    }

    @Override  // com.google.common.collect.m, com.google.common.collect.C4
    public Set h() {
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

    @Override  // com.google.common.collect.n
    public Set keySet() {
        return this.c0();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @a
    public boolean m(M3 m30) {
        return super.m(m30);
    }

    @Override  // com.google.common.collect.m, com.google.common.collect.M3
    @a
    public boolean put(@d4 Object object0, @d4 Object object1) {
        return super.put(object0, object1);
    }

    @Override  // com.google.common.collect.R4
    public Comparator r() {
        return this.l;
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

    @Override  // com.google.common.collect.p
    public Collection values() {
        return super.values();
    }

    @Override  // com.google.common.collect.p
    Collection y() {
        return this.Q();
    }
}

