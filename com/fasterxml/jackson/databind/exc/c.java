package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;

public class c extends f {
    protected final Object j;
    private static final long k = 1L;

    public c(n n0, String s, Object object0, Class class0) {
        super(n0, s, class0);
        this.j = object0;
    }

    @Deprecated
    public c(String s, l l0, Object object0, Class class0) {
        super(null, s, l0);
        this.j = object0;
        this.i = class0;
    }

    @Deprecated
    public c(String s, Object object0, Class class0) {
        super(null, s);
        this.j = object0;
        this.i = class0;
    }

    public static c J(n n0, String s, Object object0, Class class0) {
        return new c(n0, s, object0, class0);
    }

    public Object K() {
        return this.j;
    }
}

