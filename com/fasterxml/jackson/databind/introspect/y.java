package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.d;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public abstract class y implements d, Serializable {
    protected final A a;
    protected transient List b;
    private static final long c = 1L;

    protected y(A a0) {
        if(a0 == null) {
            a0 = A.k;
        }
        this.a = a0;
    }

    protected y(y y0) {
        this.a = y0.a;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public boolean c() {
        return this.a.l();
    }

    @Override  // com.fasterxml.jackson.databind.d
    public com.fasterxml.jackson.annotation.n.d e(t t0, Class class0) {
        com.fasterxml.jackson.annotation.n.d n$d1;
        com.fasterxml.jackson.annotation.n.d n$d0 = t0.B(class0);
        b b0 = t0.n();
        if(b0 == null) {
            n$d1 = null;
        }
        else {
            k k0 = this.h();
            n$d1 = k0 == null ? null : b0.A(k0);
        }
        if(n$d0 == null) {
            return n$d1 == null ? d.s2 : n$d1;
        }
        return n$d1 == null ? n$d0 : n$d0.C(n$d1);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public List f(t t0) {
        List list0 = this.b;
        if(list0 == null) {
            b b0 = t0.n();
            if(b0 != null) {
                k k0 = this.h();
                if(k0 != null) {
                    list0 = b0.T(k0);
                }
            }
            if(list0 == null) {
                list0 = Collections.emptyList();
            }
            this.b = list0;
        }
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public A getMetadata() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public com.fasterxml.jackson.annotation.u.b i(t t0, Class class0) {
        b b0 = t0.n();
        k k0 = this.h();
        if(k0 == null) {
            return t0.F(class0);
        }
        com.fasterxml.jackson.annotation.u.b u$b0 = t0.x(class0, k0.f());
        if(b0 == null) {
            return u$b0;
        }
        com.fasterxml.jackson.annotation.u.b u$b1 = b0.Z(k0);
        return u$b0 == null ? u$b1 : u$b0.o(u$b1);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public boolean j() {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.d
    @Deprecated
    public final com.fasterxml.jackson.annotation.n.d k(b b0) {
        if(b0 != null) {
            k k0 = this.h();
            if(k0 != null) {
                com.fasterxml.jackson.annotation.n.d n$d0 = b0.A(k0);
                return n$d0 == null ? d.s2 : n$d0;
            }
        }
        return d.s2;
    }
}

