package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;

public class i extends o {
    protected final m i;

    protected i(n n0, String s, m m0) {
        super(n0, s);
        this.i = m0;
    }

    protected i(n n0, String s, m m0, Throwable throwable0) {
        super(n0, s, throwable0);
        this.i = m0;
    }

    public static i E(n n0, String s, m m0) {
        return new i(n0, s, m0);
    }

    public static i F(n n0, String s, m m0, Throwable throwable0) {
        return new i(n0, s, m0, throwable0);
    }

    public m G() {
        return this.i;
    }
}

