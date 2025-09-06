package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.c;
import com.fasterxml.jackson.core.util.v;

public class m extends c {
    private static final long g = 2L;

    public m(n n0, String s) {
        super(n0, s);
    }

    public m(n n0, String s, l l0) {
        super(n0, s, l0);
    }

    public m(n n0, String s, l l0, Throwable throwable0) {
        super(n0, s, l0, throwable0);
    }

    public m(n n0, String s, Throwable throwable0) {
        super(n0, s, throwable0);
    }

    public m(String s) {
        super(s);
    }

    @Deprecated
    public m(String s, l l0) {
        super(s, l0, null);
    }

    @Deprecated
    public m(String s, l l0, Throwable throwable0) {
        super(s, l0, throwable0);
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public Object c() {
        return this.f();
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public n f() {
        return super.f();
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public v g() {
        return super.g();
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public String getMessage() {
        return super.getMessage();
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public String h() {
        return super.h();
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public c i(n n0) {
        return this.k(n0);
    }

    @Override  // com.fasterxml.jackson.core.exc.c
    public c j(v v0) {
        return this.l(v0);
    }

    public m k(n n0) {
        this.d = n0;
        return this;
    }

    public m l(v v0) {
        this.e = v0;
        return this;
    }
}

