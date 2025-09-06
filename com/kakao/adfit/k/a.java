package com.kakao.adfit.k;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public final class a extends AbstractCollection implements Serializable, Queue {
    private transient Object[] a;
    private transient int b;
    private transient int c;
    private transient boolean d;
    private final int e;

    public a(int v) {
        this.b = 0;
        this.c = 0;
        this.d = false;
        if(v <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        this.a = new Object[v];
        this.e = v;
    }

    private int a(int v) {
        return v - 1 >= 0 ? v - 1 : this.e - 1;
    }

    public boolean a() {
        return this.size() == this.e;
    }

    @Override
    public boolean add(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if(this.a()) {
            this.remove();
        }
        int v = this.c;
        this.c = v + 1;
        this.a[v] = object0;
        if(v + 1 >= this.e) {
            this.c = 0;
        }
        if(this.c == this.b) {
            this.d = true;
        }
        return true;
    }

    private int b(int v) {
        return v + 1 < this.e ? v + 1 : 0;
    }

    @Override
    public void clear() {
        this.d = false;
        this.b = 0;
        this.c = 0;
        Arrays.fill(this.a, null);
    }

    @Override
    public Object element() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return this.peek();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        class com.kakao.adfit.k.a.a implements Iterator {
            private int a;
            private int b;
            private boolean c;
            final a d;

            com.kakao.adfit.k.a.a() {
                this.a = a0.b;
                this.b = -1;
                this.c = a0.d;
            }

            @Override
            public boolean hasNext() {
                return this.c || this.a != a.this.c;
            }

            @Override
            public Object next() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.c = false;
                this.b = this.a;
                this.a = a.this.b(this.a);
                return a.this.a[this.b];
            }

            @Override
            public void remove() {
                int v = this.b;
                if(v == -1) {
                    throw new IllegalStateException();
                }
                if(v == a.this.b) {
                    a.this.remove();
                    this.b = -1;
                    return;
                }
                int v1 = this.b + 1;
                if(a.this.b >= this.b || v1 >= a.this.c) {
                    while(v1 != a.this.c) {
                        if(v1 >= a.this.e) {
                            a.this.a[v1 - 1] = a.this.a[0];
                            v1 = 0;
                        }
                        else {
                            int v2 = a.this.a(v1);
                            a.this.a[v2] = a.this.a[v1];
                            v1 = a.this.b(v1);
                        }
                    }
                }
                else {
                    System.arraycopy(a.this.a, v1, a.this.a, this.b, a.this.c - v1);
                }
                this.b = -1;
                int v3 = a.this.a(a.this.c);
                a.this.c = v3;
                a.this.a[a.this.c] = null;
                a.this.d = false;
                this.a = a.this.a(this.a);
            }
        }

        return new com.kakao.adfit.k.a.a(this);
    }

    @Override
    public boolean offer(Object object0) {
        return this.add(object0);
    }

    // 去混淆评级： 低(20)
    @Override
    public Object peek() {
        return this.isEmpty() ? null : this.a[this.b];
    }

    // 去混淆评级： 低(20)
    @Override
    public Object poll() {
        return this.isEmpty() ? null : this.remove();
    }

    @Override
    public Object remove() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] arr_object = this.a;
        int v = this.b;
        Object object0 = arr_object[v];
        if(object0 != null) {
            this.b = v + 1;
            arr_object[v] = null;
            if(v + 1 >= this.e) {
                this.b = 0;
            }
            this.d = false;
        }
        return object0;
    }

    @Override
    public int size() {
        int v = this.c;
        int v1 = this.b;
        if(v < v1) {
            return this.e - v1 + v;
        }
        if(v == v1) {
            return this.d ? this.e : 0;
        }
        return v - v1;
    }
}

