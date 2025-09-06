package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.ser.impl.m;
import com.fasterxml.jackson.databind.util.J;
import com.fasterxml.jackson.databind.util.t;
import com.fasterxml.jackson.databind.util.w;
import java.util.concurrent.atomic.AtomicReference;

public final class r {
    private final w a;
    private final AtomicReference b;
    public static final int c = 4000;
    @Deprecated
    public static final int d = 4000;

    public r() {
        this(4000);
    }

    public r(int v) {
        this.b = new AtomicReference();
        this.a = new t(Math.min(0x40, v >> 2), v);
    }

    public r(w w0) {
        this.b = new AtomicReference();
        this.a = w0;
    }

    private final m a() {
        synchronized(this) {
            m m0 = (m)this.b.get();
            if(m0 == null) {
                m0 = m.c(this.a);
                this.b.set(m0);
            }
            return m0;
        }
    }

    public void b(com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.databind.r r0, I i0) throws o {
        synchronized(this) {
            J j0 = new J(m0, false);
            if(this.a.put(j0, r0) == null) {
                this.b.set(null);
            }
            if(r0 instanceof q) {
                ((q)r0).b(i0);
            }
        }
    }

    public void c(Class class0, com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.databind.r r0, I i0) throws o {
        synchronized(this) {
            J j0 = new J(class0, false);
            Object object0 = this.a.put(j0, r0);
            J j1 = new J(m0, false);
            if(object0 == null || this.a.put(j1, r0) == null) {
                this.b.set(null);
            }
            if(r0 instanceof q) {
                ((q)r0).b(i0);
            }
        }
    }

    public void d(Class class0, com.fasterxml.jackson.databind.r r0, I i0) throws o {
        synchronized(this) {
            J j0 = new J(class0, false);
            if(this.a.put(j0, r0) == null) {
                this.b.set(null);
            }
            if(r0 instanceof q) {
                ((q)r0).b(i0);
            }
        }
    }

    public void e(com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.databind.r r0) {
        synchronized(this) {
            J j0 = new J(m0, true);
            if(this.a.put(j0, r0) == null) {
                this.b.set(null);
            }
        }
    }

    public void f(Class class0, com.fasterxml.jackson.databind.r r0) {
        synchronized(this) {
            J j0 = new J(class0, true);
            if(this.a.put(j0, r0) == null) {
                this.b.set(null);
            }
        }
    }

    public void g() {
        synchronized(this) {
            this.a.clear();
            this.b.set(null);
        }
    }

    public m h() {
        m m0 = (m)this.b.get();
        return m0 == null ? this.a() : m0;
    }

    public int i() {
        synchronized(this) {
        }
        return this.a.size();
    }

    public com.fasterxml.jackson.databind.r j(com.fasterxml.jackson.databind.m m0) {
        J j0;
        synchronized(this) {
            j0 = new J(m0, true);
        }
        return (com.fasterxml.jackson.databind.r)this.a.get(j0);
    }

    public com.fasterxml.jackson.databind.r k(Class class0) {
        J j0;
        synchronized(this) {
            j0 = new J(class0, true);
        }
        return (com.fasterxml.jackson.databind.r)this.a.get(j0);
    }

    public com.fasterxml.jackson.databind.r l(com.fasterxml.jackson.databind.m m0) {
        J j0;
        synchronized(this) {
            j0 = new J(m0, false);
        }
        return (com.fasterxml.jackson.databind.r)this.a.get(j0);
    }

    public com.fasterxml.jackson.databind.r m(Class class0) {
        J j0;
        synchronized(this) {
            j0 = new J(class0, false);
        }
        return (com.fasterxml.jackson.databind.r)this.a.get(j0);
    }
}

