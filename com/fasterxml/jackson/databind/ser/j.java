package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.M;

public abstract class j extends M {
    protected j(m m0) {
        super(m0);
    }

    protected j(j j0) {
        super(j0.a, false);
    }

    protected j(Class class0) {
        super(class0);
    }

    protected j(Class class0, boolean z) {
        super(class0, z);
    }

    protected abstract j P(com.fasterxml.jackson.databind.jsontype.j arg1);

    public abstract r Q();

    public abstract m R();

    @Deprecated
    protected boolean S(I i0, d d0) {
        return false;
    }

    public abstract boolean T(Object arg1);

    public j U(com.fasterxml.jackson.databind.jsontype.j j0) {
        return j0 == null ? this : this.P(j0);
    }
}

