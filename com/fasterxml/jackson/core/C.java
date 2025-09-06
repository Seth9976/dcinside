package com.fasterxml.jackson.core;

import java.io.Serializable;

public class c implements Serializable {
    public static final class a {
        private int a;
        private int b;

        a() {
            this(0x100, 500);
        }

        a(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        a(c c0) {
            this.a = c0.a;
            this.b = c0.b;
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(int v) {
            c.g(v);
            this.a = v;
            return this;
        }

        public a c(int v) {
            c.h(v);
            this.b = v;
            return this;
        }
    }

    protected final int a;
    protected final int b;
    private static final long c = 1L;
    public static final int d = 0x100;
    public static final int e = 500;
    private static c f;

    static {
        c.f = new c(0x100, 500);
    }

    protected c(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public static a a() {
        return new a();
    }

    public static c b() {
        return c.f;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public static void e(c c0) {
        if(c0 == null) {
            c.f = new c(0x100, 500);
            return;
        }
        c.f = c0;
    }

    public a f() {
        return new a(this);
    }

    static void g(int v) throws IllegalArgumentException {
        if(v < 0) {
            throw new IllegalArgumentException(String.format("Value of maxErrorTokenLength (%d) cannot be negative", v));
        }
    }

    static void h(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(String.format("Value of maxRawContentLength (%d) cannot be negative", v));
        }
    }
}

