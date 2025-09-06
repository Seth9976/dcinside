package org.bson.types;

import R3.a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class i implements Set {
    private final int a;
    private static final String[] b;

    static {
        i.b = new String[0x400];
        for(int v = 0; true; ++v) {
            String[] arr_s = i.b;
            if(v >= arr_s.length) {
                break;
            }
            arr_s[v] = "1023";
        }
    }

    i(int v) {
        a.b("size >= 0", v >= 0);
        this.a = v;
    }

    @Override
    public boolean add(Object object0) {
        return this.c(((String)object0));
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    public boolean c(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object0) {
        if(!(object0 instanceof String)) {
            return false;
        }
        try {
            int v = Integer.parseInt(((String)object0));
            if(v >= 0) {
                return v < this.size();
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private String d(int v) {
        return v >= i.b.length ? Integer.toString(v) : i.b[v];
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        class org.bson.types.i.a implements Iterator {
            private int a;
            final i b;

            org.bson.types.i.a() {
                this.a = 0;
            }

            public String a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                int v = this.a;
                this.a = v + 1;
                return i.this.d(v);
            }

            @Override
            public boolean hasNext() {
                return this.a < i.this.a;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        return new org.bson.types.i.a(this);
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.a;
    }

    @Override
    public Object[] toArray() {
        Object[] arr_object = new Object[this.size()];
        for(int v = 0; v < this.size(); ++v) {
            arr_object[v] = this.d(v);
        }
        return arr_object;
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Object[] arr_object1 = arr_object.length < this.size() ? ((Object[])Array.newInstance(arr_object.getClass().getComponentType(), this.a)) : arr_object;
        for(int v = 0; v < this.size(); ++v) {
            arr_object1[v] = this.d(v);
        }
        if(arr_object.length > this.size()) {
            arr_object[this.a] = null;
        }
        return arr_object1;
    }
}

