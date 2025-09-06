package org.bson;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class j0 extends k0 implements List {
    public class a implements Iterator {
        private final p a;
        private X b;
        final j0 c;

        public a() {
            p p0 = j00.j();
            this.a = p0;
            p0.g0();
        }

        @Override
        public boolean hasNext() {
            if(this.b == null) {
                this.b = this.a.T2();
            }
            return this.b != X.b;
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            this.b = null;
            this.a.n0();
            return j0.this.r(this.a);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported");
        }
    }

    public j0(byte[] arr_b, int v, h0 h00) {
        super(arr_b, v, h00);
    }

    public j0(byte[] arr_b, h0 h00) {
        super(arr_b, h00);
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) > -1;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: this) {
            hashSet0.add(object0);
        }
        return hashSet0.containsAll(collection0);
    }

    @Override
    public Object get(int v) {
        return this.get(String.valueOf(v));
    }

    @Override
    public int indexOf(Object object0) {
        int v = 0;
        for(Object object1: this) {
            if(object0.equals(object1)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new a(this);
    }

    @Override
    public int lastIndexOf(Object object0) {
        int v = -1;
        int v1 = 0;
        for(Object object1: this) {
            if(object0.equals(object1)) {
                v = v1;
            }
            ++v1;
        }
        return v;
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Operation is not supported instance of this type");
    }

    @Override
    public ListIterator listIterator(int v) {
        throw new UnsupportedOperationException("Operation is not supported instance of this type");
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Object is read only");
    }

    @Override
    public int size() {
        return this.keySet().size();
    }

    @Override
    public List subList(int v, int v1) {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        throw new UnsupportedOperationException("Operation is not supported");
    }
}

