package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.d;

public class j extends d {
    private static final long f = 0x7BL;

    @Deprecated
    public j(String s) {
        super(s, null);
    }

    public j(String s, k k0) {
        super(s, k0);
        this.d = k0;
    }

    @Deprecated
    public j(String s, Throwable throwable0) {
        super(s, throwable0, null);
    }

    public j(String s, Throwable throwable0, k k0) {
        super(s, throwable0, k0);
        this.d = k0;
    }

    @Deprecated
    public j(Throwable throwable0) {
        super(throwable0, null);
    }

    public j(Throwable throwable0, k k0) {
        super(throwable0, k0);
    }

    @Override  // com.fasterxml.jackson.core.exc.d
    public Object c() {
        return this.f();
    }

    @Override  // com.fasterxml.jackson.core.exc.d
    public k f() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.core.exc.d
    public d g(k k0) {
        return this.h(k0);
    }

    public j h(k k0) {
        this.d = k0;
        return this;
    }
}

