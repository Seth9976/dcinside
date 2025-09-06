package com.fasterxml.jackson.databind.util;

public abstract class B {
    static final class a {
        final Object a;
        final int b;
        a c;

        public a(Object object0, int v) {
            this.a = object0;
            this.b = v;
        }

        public int a(Object object0, int v) {
            System.arraycopy(this.a, 0, object0, v, this.b);
            return v + this.b;
        }

        public Object b() {
            return this.a;
        }

        public void c(a b$a0) {
            if(this.c != null) {
                throw new IllegalStateException();
            }
            this.c = b$a0;
        }

        public a d() {
            return this.c;
        }
    }

    protected Object a;
    protected a b;
    protected a c;
    protected int d;
    static final int e = 12;
    static final int f = 0x4000;
    static final int g = 0x40000;

    protected abstract Object a(int arg1);

    protected void b() {
        a b$a0 = this.c;
        if(b$a0 != null) {
            this.a = b$a0.b();
        }
        this.c = null;
        this.b = null;
        this.d = 0;
    }

    public final Object c(Object object0, int v) {
        a b$a0 = new a(object0, v);
        if(this.b == null) {
            this.c = b$a0;
            this.b = b$a0;
        }
        else {
            this.c.c(b$a0);
            this.c = b$a0;
        }
        this.d += v;
        return v >= 0x4000 ? this.a(v + (v >> 2)) : this.a(v + v);
    }

    public int d() {
        return this.d;
    }

    public Object e(Object object0, int v) {
        int v1 = this.d + v;
        Object object1 = this.a(v1);
        a b$a0 = this.b;
        int v2 = 0;
        while(b$a0 != null) {
            v2 = b$a0.a(object1, v2);
            b$a0 = b$a0.d();
        }
        System.arraycopy(object0, 0, object1, v2, v);
        int v3 = v2 + v;
        if(v3 != v1) {
            throw new IllegalStateException("Should have gotten " + v1 + " entries, got " + v3);
        }
        return object1;
    }

    public Object f() {
        this.b();
        return this.a == null ? this.a(12) : this.a;
    }
}

