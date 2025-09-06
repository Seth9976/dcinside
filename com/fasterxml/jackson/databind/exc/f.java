package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.h;

public class f extends o {
    protected Class i;

    protected f(n n0, String s) {
        this(n0, s, null);
    }

    protected f(n n0, String s, l l0) {
        super(n0, s, l0);
    }

    protected f(n n0, String s, m m0) {
        super(n0, s);
        this.i = h.r0(m0);
    }

    protected f(n n0, String s, Class class0) {
        super(n0, s);
        this.i = class0;
    }

    public static f E(n n0, m m0, String s) {
        return new f(n0, s, m0);
    }

    public static f F(n n0, Class class0, String s) {
        return new f(n0, s, class0);
    }

    @Deprecated
    public static f G(n n0, String s) {
        return f.F(n0, null, s);
    }

    public Class H() {
        return this.i;
    }

    public f I(m m0) {
        this.i = m0.g();
        return this;
    }
}

