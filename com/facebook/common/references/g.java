package com.facebook.common.references;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class g extends com.facebook.common.references.a {
    private g(i i0, @h d a$d0, @h Throwable throwable0) {
        super(i0, a$d0, throwable0);
    }

    g(Object object0, com.facebook.common.references.h h0, d a$d0, @h Throwable throwable0) {
        super(object0, h0, a$d0, throwable0, false);
    }

    @Override  // com.facebook.common.references.a
    public com.facebook.common.references.a b() {
        com.facebook.common.internal.n.o(this.q());
        return new g(this.b, this.c, this.d);
    }

    @Override  // com.facebook.common.references.a
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }
}

