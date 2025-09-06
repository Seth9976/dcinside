package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.p;

public abstract class d extends p {
    protected transient k d;
    private static final long e = 2L;

    protected d(String s, k k0) {
        super(s, null);
        this.d = k0;
    }

    protected d(String s, Throwable throwable0, k k0) {
        super(s, null, throwable0);
        this.d = k0;
    }

    protected d(Throwable throwable0, k k0) {
        super(throwable0);
        this.d = k0;
    }

    @Override  // com.fasterxml.jackson.core.p
    public Object c() {
        return this.f();
    }

    public k f() {
        return this.d;
    }

    public abstract d g(k arg1);
}

