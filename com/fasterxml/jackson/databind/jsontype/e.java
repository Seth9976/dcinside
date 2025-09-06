package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.m;
import java.util.Collection;

public abstract class e {
    @Deprecated
    public Collection a(d d0, t t0, b b0) {
        return this.c(t0, d0);
    }

    @Deprecated
    public Collection b(k k0, t t0, b b0, m m0) {
        return this.d(t0, k0, m0);
    }

    public Collection c(t t0, d d0) {
        return this.a(d0, t0, t0.n());
    }

    public Collection d(t t0, k k0, m m0) {
        return this.b(k0, t0, t0.n(), m0);
    }

    public Collection e(t t0, d d0) {
        return this.a(d0, t0, t0.n());
    }

    public Collection f(t t0, k k0, m m0) {
        return this.b(k0, t0, t0.n(), m0);
    }

    public e g() {
        return this;
    }

    public abstract void h(Collection arg1);

    public abstract void i(c[] arg1);

    public abstract void j(Class[] arg1);
}

