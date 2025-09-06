package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.impl.n;

public abstract class m {
    @Deprecated
    public abstract c a(Object arg1);

    public o b(Object object0, Object object1) {
        c c0 = this.a(object0);
        return c0 == null ? null : n.k(c0);
    }
}

