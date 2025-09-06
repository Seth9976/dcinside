package com.facebook.common.util;

import k1.n.a;
import k1.n;

@n(a.a)
public class b extends Exception {
    public b(String s) {
        super(s);
    }

    @Override
    public Throwable fillInStackTrace() {
        synchronized(this) {
        }
        return this;
    }
}

