package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class z {
    public static abstract class a {
        private final com.fasterxml.jackson.databind.deser.z a;
        private final Class b;

        public a(com.fasterxml.jackson.databind.deser.z z0, m m0) {
            this.a = z0;
            this.b = m0.g();
        }

        public a(com.fasterxml.jackson.databind.deser.z z0, Class class0) {
            this.a = z0;
            this.b = class0;
        }

        public Class a() {
            return this.b;
        }

        public l b() {
            return this.a.a();
        }

        public abstract void c(Object arg1, Object arg2) throws IOException;

        public boolean d(Object object0) {
            return object0.equals(this.a.H());
        }
    }

    protected Object a;
    protected final com.fasterxml.jackson.annotation.N.a b;
    protected LinkedList c;
    protected P d;

    public z(com.fasterxml.jackson.annotation.N.a n$a0) {
        this.b = n$a0;
    }

    public void a(a z$a0) {
        if(this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(z$a0);
    }

    public void b(Object object0) throws IOException {
        this.d.a(this.b, object0);
        this.a = object0;
        Object object1 = this.b.c;
        LinkedList linkedList0 = this.c;
        if(linkedList0 != null) {
            Iterator iterator0 = linkedList0.iterator();
            this.c = null;
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                ((a)object2).c(object1, object0);
            }
        }
    }

    public com.fasterxml.jackson.annotation.N.a c() {
        return this.b;
    }

    public P d() {
        return this.d;
    }

    public boolean e() {
        return this.c != null && !this.c.isEmpty();
    }

    public Iterator f() {
        return this.c == null ? Collections.emptyList().iterator() : this.c.iterator();
    }

    public Object g() {
        Object object0 = this.d.b(this.b);
        this.a = object0;
        return object0;
    }

    public void h(P p0) {
        this.d = p0;
    }

    public boolean i(h h0) [...] // Inlined contents

    @Override
    public String toString() {
        return String.valueOf(this.b);
    }
}

