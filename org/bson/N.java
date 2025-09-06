package org.bson;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.bson.codecs.T;
import org.bson.codecs.g;
import org.bson.json.w;

public class n extends Z implements Cloneable, List {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[X.values().length];
            a.a = arr_v;
            try {
                arr_v[X.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[X.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[X.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[X.q.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final List a;

    public n() {
        this(new ArrayList(), false);
    }

    public n(List list0) {
        this(list0, true);
    }

    n(List list0, boolean z) {
        if(z) {
            this.a = new ArrayList(list0);
            return;
        }
        this.a = list0;
    }

    @Override  // org.bson.Z
    public X G() {
        return X.f;
    }

    @Override
    public void add(int v, Object object0) {
        this.j0(v, ((Z)object0));
    }

    @Override
    public boolean add(Object object0) {
        return this.k0(((Z)object0));
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        return this.a.addAll(v, collection0);
    }

    @Override
    public boolean addAll(Collection collection0) {
        return this.a.addAll(collection0);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.m0();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n ? this.o0().equals(((n)object0).o0()) : false;
    }

    @Override
    public Object get(int v) {
        return this.n0(v);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int indexOf(Object object0) {
        return this.a.indexOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }

    public void j0(int v, Z z0) {
        this.a.add(v, z0);
    }

    public boolean k0(Z z0) {
        return this.a.add(z0);
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.a.lastIndexOf(object0);
    }

    @Override
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
    }

    public n m0() {
        n n0 = new n();
        for(Object object0: this) {
            Z z0 = (Z)object0;
            switch(z0.G()) {
                case 1: {
                    n0.k0(z0.l().m0());
                    break;
                }
                case 2: {
                    n0.k0(z0.b().m0());
                    break;
                }
                case 3: {
                    n0.k0(o.m0(z0.c()));
                    break;
                }
                case 4: {
                    n0.k0(I.j0(z0.z()));
                    break;
                }
                default: {
                    n0.k0(z0);
                }
            }
        }
        return n0;
    }

    public Z n0(int v) {
        return (Z)this.a.get(v);
    }

    public List o0() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public static n p0(String s) {
        return new g().c(new w(s), T.a().a());
    }

    public Z q0(int v) {
        return (Z)this.a.remove(v);
    }

    public Z r0(int v, Z z0) {
        return (Z)this.a.set(v, z0);
    }

    @Override
    public Object remove(int v) {
        return this.q0(v);
    }

    @Override
    public boolean remove(Object object0) {
        return this.a.remove(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        return this.a.removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        return this.a.retainAll(collection0);
    }

    @Override
    public Object set(int v, Object object0) {
        return this.r0(v, ((Z)object0));
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public List subList(int v, int v1) {
        return this.a.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }

    @Override
    public String toString() {
        return "BsonArray{values=" + this.a + '}';
    }
}

