package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.m;

public class e extends f {
    protected final m j;
    protected final String k;
    private static final long l = 1L;

    public e(n n0, String s, m m0, String s1) {
        super(n0, s);
        this.j = m0;
        this.k = s1;
    }

    public static e J(n n0, String s, m m0, String s1) {
        return new e(n0, s, m0, s1);
    }

    public m K() {
        return this.j;
    }

    public String L() {
        return this.k;
    }
}

