package com.google.common.base;

import J1.b;
import java.util.Collections;
import java.util.Set;

@b
@k
final class a extends C {
    static final a b;
    private static final long c;

    static {
        a.b = new a();
    }

    @Override  // com.google.common.base.C
    public Set b() {
        return Collections.emptySet();
    }

    @Override  // com.google.common.base.C
    public Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override  // com.google.common.base.C
    public boolean e() {
        return false;
    }

    @Override  // com.google.common.base.C
    public boolean equals(@o3.a Object object) {
        return object == this;
    }

    @Override  // com.google.common.base.C
    public C g(C c0) {
        return (C)H.E(c0);
    }

    @Override  // com.google.common.base.C
    public Object h(Q q0) {
        return H.F(q0.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override  // com.google.common.base.C
    public int hashCode() {
        return 2040732332;
    }

    @Override  // com.google.common.base.C
    public Object i(Object object0) {
        return H.F(object0, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override  // com.google.common.base.C
    @o3.a
    public Object j() {
        return null;
    }

    @Override  // com.google.common.base.C
    public C l(t t0) {
        H.E(t0);
        return C.a();
    }

    private Object m() {
        return a.b;
    }

    static C n() {
        return a.b;
    }

    @Override  // com.google.common.base.C
    public String toString() {
        return "Optional.absent()";
    }
}

