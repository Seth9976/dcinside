package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.m;

public class J {
    protected int a;
    protected Class b;
    protected m c;
    protected boolean d;

    public J() {
    }

    public J(m m0, boolean z) {
        this.c = m0;
        this.b = null;
        this.d = z;
        this.a = z ? J.h(m0) : J.j(m0);
    }

    public J(J j0) {
        this.a = j0.a;
        this.b = j0.b;
        this.c = j0.c;
        this.d = j0.d;
    }

    public J(Class class0, boolean z) {
        this.b = class0;
        this.c = null;
        this.d = z;
        this.a = z ? J.i(class0) : J.k(class0);
    }

    public Class a() {
        return this.b;
    }

    public m b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public final void d(m m0) {
        this.c = m0;
        this.b = null;
        this.d = true;
        this.a = J.h(m0);
    }

    public final void e(Class class0) {
        this.c = null;
        this.b = class0;
        this.d = true;
        this.a = J.i(class0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        if(object0.getClass() != this.getClass()) {
            return false;
        }
        if(((J)object0).d == this.d) {
            Class class0 = this.b;
            return class0 == null ? this.c.equals(((J)object0).c) : ((J)object0).b == class0;
        }
        return false;
    }

    public final void f(m m0) {
        this.c = m0;
        this.b = null;
        this.d = false;
        this.a = J.j(m0);
    }

    public final void g(Class class0) {
        this.c = null;
        this.b = class0;
        this.d = false;
        this.a = J.k(class0);
    }

    public static final int h(m m0) {
        return m0.hashCode() - 2;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    public static final int i(Class class0) {
        return class0.getName().hashCode() + 1;
    }

    public static final int j(m m0) {
        return m0.hashCode() - 1;
    }

    public static final int k(Class class0) {
        return class0.getName().hashCode();
    }

    @Override
    public final String toString() {
        return this.b == null ? "{type: " + this.c + ", typed? " + this.d + "}" : "{class: " + this.b.getName() + ", typed? " + this.d + "}";
    }
}

