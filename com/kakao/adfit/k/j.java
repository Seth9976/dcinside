package com.kakao.adfit.k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public final class j extends i implements Queue {
    private j(Queue queue0) {
        super(queue0);
    }

    public static j a(Queue queue0) {
        return new j(queue0);
    }

    @Override  // com.kakao.adfit.k.i
    protected Collection a() {
        return this.b();
    }

    @Override  // com.kakao.adfit.k.i
    public boolean add(Object object0) {
        return super.add(object0);
    }

    @Override  // com.kakao.adfit.k.i
    public boolean addAll(Collection collection0) {
        return super.addAll(collection0);
    }

    protected Queue b() {
        return (Queue)super.a();
    }

    @Override  // com.kakao.adfit.k.i
    public void clear() {
        super.clear();
    }

    @Override  // com.kakao.adfit.k.i
    public boolean contains(Object object0) {
        return super.contains(object0);
    }

    @Override  // com.kakao.adfit.k.i
    public boolean containsAll(Collection collection0) {
        return super.containsAll(collection0);
    }

    @Override
    public Object element() {
        synchronized(this.b) {
        }
        return this.b().element();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        Object object1 = this.b;
        return this.b().equals(object0);
    }

    @Override
    public int hashCode() {
        synchronized(this.b) {
        }
        return this.b().hashCode();
    }

    @Override  // com.kakao.adfit.k.i
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override  // com.kakao.adfit.k.i
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public boolean offer(Object object0) {
        synchronized(this.b) {
        }
        return this.b().offer(object0);
    }

    @Override
    public Object peek() {
        synchronized(this.b) {
        }
        return this.b().peek();
    }

    @Override
    public Object poll() {
        synchronized(this.b) {
        }
        return this.b().poll();
    }

    @Override
    public Object remove() {
        synchronized(this.b) {
        }
        return this.b().remove();
    }

    @Override  // com.kakao.adfit.k.i
    public boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // com.kakao.adfit.k.i
    public boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // com.kakao.adfit.k.i
    public boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // com.kakao.adfit.k.i
    public int size() {
        return super.size();
    }

    @Override  // com.kakao.adfit.k.i
    public Object[] toArray() {
        return super.toArray();
    }

    @Override  // com.kakao.adfit.k.i
    public Object[] toArray(Object[] arr_object) {
        return super.toArray(arr_object);
    }

    @Override  // com.kakao.adfit.k.i
    public String toString() {
        return super.toString();
    }
}

