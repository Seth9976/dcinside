package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;

public class b extends o {
    protected final m i;
    protected transient c j;
    protected transient v k;

    protected b(k k0, String s, c c0, v v0) {
        super(k0, s);
        this.i = c0 == null ? null : c0.H();
        this.j = c0;
        this.k = v0;
    }

    protected b(k k0, String s, m m0) {
        super(k0, s);
        this.i = m0;
        this.j = null;
        this.k = null;
    }

    protected b(n n0, String s, c c0, v v0) {
        super(n0, s);
        this.i = c0 == null ? null : c0.H();
        this.j = c0;
        this.k = v0;
    }

    protected b(n n0, String s, m m0) {
        super(n0, s);
        this.i = m0;
        this.j = null;
        this.k = null;
    }

    public static b E(k k0, String s, c c0, v v0) {
        return new b(k0, s, c0, v0);
    }

    public static b F(k k0, String s, m m0) {
        return new b(k0, s, m0);
    }

    public static b G(n n0, String s, c c0, v v0) {
        return new b(n0, s, c0, v0);
    }

    public static b H(n n0, String s, m m0) {
        return new b(n0, s, m0);
    }

    public c I() {
        return this.j;
    }

    public v J() {
        return this.k;
    }

    public m K() {
        return this.i;
    }
}

