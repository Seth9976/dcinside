package com.google.common.collect;

import J1.b;
import java.io.Serializable;
import java.util.List;
import o3.a;

@b(serializable = true)
@C1
final class r extends c4 implements Serializable {
    static final r c;
    private static final long d;

    static {
        r.c = new r();
    }

    @Override  // com.google.common.collect.c4
    public c4 P() {
        return this;
    }

    @Override  // com.google.common.collect.c4
    public List Q(Iterable iterable0) {
        return z3.r(iterable0);
    }

    private Object S() {
        return r.c;
    }

    @Override  // com.google.common.collect.c4
    public int compare(@a Object left, @a Object right) {
        return 0;
    }

    @Override
    public String toString() {
        return "Ordering.allEqual()";
    }

    @Override  // com.google.common.collect.c4
    public O2 w(Iterable iterable0) {
        return O2.q(iterable0);
    }
}

