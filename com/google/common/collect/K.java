package com.google.common.collect;

import J1.c;
import o3.a;

@c
@C1
abstract class k implements k4 {
    @Override  // com.google.common.collect.k4
    public boolean a(Comparable comparable0) {
        return this.h(comparable0) != null;
    }

    @Override  // com.google.common.collect.k4
    public void b(h4 h40) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.k4
    public void clear() {
        this.b(h4.a());
    }

    @Override  // com.google.common.collect.k4
    public boolean e(h4 h40) {
        return !this.k(h40).isEmpty();
    }

    @Override  // com.google.common.collect.k4
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof k4 ? this.m().equals(((k4)object0).m()) : false;
    }

    @Override  // com.google.common.collect.k4
    public void f(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.b(((h4)object0));
        }
    }

    @Override  // com.google.common.collect.k4
    public boolean g(k4 k40) {
        return this.j(k40.m());
    }

    @Override  // com.google.common.collect.k4
    @a
    public abstract h4 h(Comparable arg1);

    @Override  // com.google.common.collect.k4
    public final int hashCode() {
        return this.m().hashCode();
    }

    @Override  // com.google.common.collect.k4
    public abstract boolean i(h4 arg1);

    @Override  // com.google.common.collect.k4
    public boolean isEmpty() {
        return this.m().isEmpty();
    }

    @Override  // com.google.common.collect.k4
    public boolean j(Iterable iterable0) {
        for(Object object0: iterable0) {
            if(!this.i(((h4)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.google.common.collect.k4
    public void n(k4 k40) {
        this.f(k40.m());
    }

    @Override  // com.google.common.collect.k4
    public void o(h4 h40) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.k4
    public void p(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.o(((h4)object0));
        }
    }

    @Override  // com.google.common.collect.k4
    public void q(k4 k40) {
        this.p(k40.m());
    }

    @Override  // com.google.common.collect.k4
    public final String toString() {
        return this.m().toString();
    }
}

