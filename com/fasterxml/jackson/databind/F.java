package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.p;

public abstract class f extends p {
    private static final long d = 3L;

    protected f(String s) {
        super(s);
    }

    protected f(String s, l l0) {
        this(s, l0, null);
    }

    protected f(String s, l l0, Throwable throwable0) {
        super(s, l0, throwable0);
    }

    protected f(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    public abstract void f(Object arg1, int arg2);

    public abstract void g(Object arg1, String arg2);
}

