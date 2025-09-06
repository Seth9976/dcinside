package com.kakao.adfit.k;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

abstract class i implements Serializable, Collection {
    private final Collection a;
    final Object b;

    i(Collection collection0) {
        if(collection0 == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.a = collection0;
        this.b = this;
    }

    protected Collection a() {
        return this.a;
    }

    @Override
    public boolean add(Object object0) {
        synchronized(this.b) {
        }
        return this.a().add(object0);
    }

    @Override
    public boolean addAll(Collection collection0) {
        synchronized(this.b) {
        }
        return this.a().addAll(collection0);
    }

    @Override
    public void clear() {
        synchronized(this.b) {
            this.a().clear();
        }
    }

    @Override
    public boolean contains(Object object0) {
        synchronized(this.b) {
        }
        return this.a().contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        synchronized(this.b) {
        }
        return this.a().containsAll(collection0);
    }

    @Override
    public boolean isEmpty() {
        synchronized(this.b) {
        }
        return this.a().isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.a().iterator();
    }

    @Override
    public boolean remove(Object object0) {
        synchronized(this.b) {
        }
        return this.a().remove(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        synchronized(this.b) {
        }
        return this.a().removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        synchronized(this.b) {
        }
        return this.a().retainAll(collection0);
    }

    @Override
    public int size() {
        synchronized(this.b) {
        }
        return this.a().size();
    }

    @Override
    public Object[] toArray() {
        synchronized(this.b) {
        }
        return this.a().toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        synchronized(this.b) {
        }
        return this.a().toArray(arr_object);
    }

    @Override
    public String toString() {
        synchronized(this.b) {
        }
        return this.a().toString();
    }
}

