package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

public abstract class k extends b implements Serializable {
    protected final transient K a;
    protected final transient s b;
    private static final long c = 1L;

    protected k(K k0, s s0) {
        this.a = k0;
        this.b = s0;
    }

    protected k(k k0) {
        this.a = k0.a;
        this.b = k0.b;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    @Deprecated
    public Iterable b() {
        s s0 = this.b;
        return s0 == null ? Collections.emptyList() : s0.g();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public final Annotation d(Class class0) {
        return this.b == null ? null : this.b.a(class0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public final boolean h(Class class0) {
        return this.b == null ? false : this.b.c(class0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean i(Class[] arr_class) {
        return this.b == null ? false : this.b.b(arr_class);
    }

    public final void k(boolean z) {
        Member member0 = this.o();
        if(member0 != null) {
            h.i(member0, z);
        }
    }

    public s l() {
        return this.b;
    }

    public abstract Class m();

    public String n() {
        return this.m().getName() + "#" + this.getName();
    }

    public abstract Member o();

    @Deprecated
    public K p() {
        return this.a;
    }

    public abstract Object q(Object arg1) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract void r(Object arg1, Object arg2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract b s(s arg1);
}

