package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.util.v;

public abstract class c extends p {
    protected transient n d;
    protected v e;
    static final long f = 2L;

    protected c(n n0, String s) {
        super(s, (n0 == null ? null : n0.b1()));
        this.d = n0;
    }

    protected c(n n0, String s, l l0) {
        super(s, l0, null);
        this.d = n0;
    }

    protected c(n n0, String s, l l0, Throwable throwable0) {
        super(s, l0, throwable0);
        this.d = n0;
    }

    protected c(n n0, String s, Throwable throwable0) {
        super(s, (n0 == null ? null : n0.b1()), throwable0);
        this.d = n0;
    }

    protected c(String s) {
        super(s);
    }

    protected c(String s, l l0, Throwable throwable0) {
        super(s, l0, throwable0);
    }

    @Override  // com.fasterxml.jackson.core.p
    public Object c() {
        return this.f();
    }

    public n f() {
        return this.d;
    }

    public v g() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.core.p
    public String getMessage() {
        String s = super.getMessage();
        return this.e == null ? s : s + "\nRequest payload : " + this.e.toString();
    }

    public String h() {
        return this.e == null ? null : this.e.toString();
    }

    public abstract c i(n arg1);

    public abstract c j(v arg1);
}

