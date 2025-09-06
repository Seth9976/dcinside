package com.fasterxml.jackson.databind.util.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class b extends AbstractCollection implements Deque {
    abstract class c implements Iterator {
        a a;
        final b b;

        c(a a0) {
            this.a = a0;
        }

        abstract a a();

        public a b() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            a a0 = this.a;
            this.a = this.a();
            return a0;
        }

        @Override
        public boolean hasNext() {
            return this.a != null;
        }

        @Override
        public Object next() {
            return this.b();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    a a;
    a b;

    public void A(a a0) {
        this.b(a0);
    }

    public a B() {
        return this.D();
    }

    boolean C(a a0) {
        if(this.g(a0)) {
            this.F(a0);
            return true;
        }
        return false;
    }

    public a D() {
        this.d();
        return this.x();
    }

    public a E() {
        this.d();
        return this.y();
    }

    void F(a a0) {
        a a1 = a0.b();
        a a2 = a0.a();
        if(a1 == null) {
            this.a = a2;
        }
        else {
            a1.d(a2);
            a0.c(null);
        }
        if(a2 == null) {
            this.b = a1;
            return;
        }
        a2.c(a1);
        a0.d(null);
    }

    a G() {
        a a0 = this.a;
        a a1 = a0.a();
        a0.d(null);
        this.a = a1;
        if(a1 == null) {
            this.b = null;
            return a0;
        }
        a1.c(null);
        return a0;
    }

    a H() {
        a a0 = this.b;
        a a1 = a0.b();
        a0.c(null);
        this.b = a1;
        if(a1 == null) {
            this.a = null;
            return a0;
        }
        a1.d(null);
        return a0;
    }

    public boolean a(a a0) {
        return this.q(a0);
    }

    @Override
    public boolean add(Object object0) {
        return this.a(((a)object0));
    }

    @Override
    public void addFirst(Object object0) {
        this.b(((a)object0));
    }

    @Override
    public void addLast(Object object0) {
        this.c(((a)object0));
    }

    public void b(a a0) {
        if(!this.p(a0)) {
            throw new IllegalArgumentException();
        }
    }

    public void c(a a0) {
        if(!this.q(a0)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void clear() {
        for(a a0 = this.a; a0 != null; a0 = a1) {
            a a1 = a0.a();
            a0.c(null);
            a0.d(null);
        }
        this.b = null;
        this.a = null;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean contains(Object object0) {
        return object0 instanceof a && this.g(((a)object0));
    }

    void d() {
        if(this.isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Iterator descendingIterator() {
        class com.fasterxml.jackson.databind.util.internal.b.b extends c {
            final b c;

            com.fasterxml.jackson.databind.util.internal.b.b(a a0) {
                super(a0);
            }

            @Override  // com.fasterxml.jackson.databind.util.internal.b$c
            a a() {
                return this.a.b();
            }
        }

        return new com.fasterxml.jackson.databind.util.internal.b.b(this, this.b);
    }

    @Override
    public Object element() {
        return this.h();
    }

    boolean g(a a0) {
        return a0.b() != null || a0.a() != null || a0 == this.a;
    }

    @Override
    public Object getFirst() {
        return this.i();
    }

    @Override
    public Object getLast() {
        return this.j();
    }

    public a h() {
        return this.i();
    }

    public a i() {
        this.d();
        return this.t();
    }

    @Override
    public boolean isEmpty() {
        return this.a == null;
    }

    @Override
    public Iterator iterator() {
        class com.fasterxml.jackson.databind.util.internal.b.a extends c {
            final b c;

            com.fasterxml.jackson.databind.util.internal.b.a(a a0) {
                super(a0);
            }

            @Override  // com.fasterxml.jackson.databind.util.internal.b$c
            a a() {
                return this.a.a();
            }
        }

        return new com.fasterxml.jackson.databind.util.internal.b.a(this, this.a);
    }

    public a j() {
        this.d();
        return this.u();
    }

    void k(a a0) {
        a a1 = this.a;
        this.a = a0;
        if(a1 == null) {
            this.b = a0;
            return;
        }
        a1.c(a0);
        a0.d(a1);
    }

    void l(a a0) {
        a a1 = this.b;
        this.b = a0;
        if(a1 == null) {
            this.a = a0;
            return;
        }
        a1.d(a0);
        a0.c(a1);
    }

    public void m(a a0) {
        if(a0 != this.b) {
            this.F(a0);
            this.l(a0);
        }
    }

    public void n(a a0) {
        if(a0 != this.a) {
            this.F(a0);
            this.k(a0);
        }
    }

    public boolean o(a a0) {
        return this.q(a0);
    }

    @Override
    public boolean offer(Object object0) {
        return this.o(((a)object0));
    }

    @Override
    public boolean offerFirst(Object object0) {
        return this.p(((a)object0));
    }

    @Override
    public boolean offerLast(Object object0) {
        return this.q(((a)object0));
    }

    public boolean p(a a0) {
        if(this.g(a0)) {
            return false;
        }
        this.k(a0);
        return true;
    }

    @Override
    public Object peek() {
        return this.r();
    }

    @Override
    public Object peekFirst() {
        return this.t();
    }

    @Override
    public Object peekLast() {
        return this.u();
    }

    @Override
    public Object poll() {
        return this.v();
    }

    @Override
    public Object pollFirst() {
        return this.x();
    }

    @Override
    public Object pollLast() {
        return this.y();
    }

    @Override
    public Object pop() {
        return this.z();
    }

    @Override
    public void push(Object object0) {
        this.A(((a)object0));
    }

    public boolean q(a a0) {
        if(this.g(a0)) {
            return false;
        }
        this.l(a0);
        return true;
    }

    public a r() {
        return this.t();
    }

    @Override
    public Object remove() {
        return this.B();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean remove(Object object0) {
        return object0 instanceof a && this.C(((a)object0));
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override
    public Object removeFirst() {
        return this.D();
    }

    @Override
    public boolean removeFirstOccurrence(Object object0) {
        return this.remove(object0);
    }

    @Override
    public Object removeLast() {
        return this.E();
    }

    @Override
    public boolean removeLastOccurrence(Object object0) {
        return this.remove(object0);
    }

    @Override
    public int size() {
        a a0 = this.a;
        int v = 0;
        while(a0 != null) {
            ++v;
            a0 = a0.a();
        }
        return v;
    }

    public a t() {
        return this.a;
    }

    public a u() {
        return this.b;
    }

    public a v() {
        return this.x();
    }

    // 去混淆评级： 低(20)
    public a x() {
        return this.isEmpty() ? null : this.G();
    }

    // 去混淆评级： 低(20)
    public a y() {
        return this.isEmpty() ? null : this.H();
    }

    public a z() {
        return this.D();
    }
}

