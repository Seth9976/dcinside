package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.F;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

@b
public class q extends F {
    public static final q e;

    static {
        q.e = new q();
    }

    protected q() {
        super(Collection.class);
    }

    protected q(q q0, Boolean boolean0) {
        super(q0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    public r P(d d0, Boolean boolean0) {
        return new q(this, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    protected void Q(com.fasterxml.jackson.databind.jsonFormatVisitors.b b0) throws o {
        b0.d(com.fasterxml.jackson.databind.jsonFormatVisitors.d.a);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    protected p R() {
        return this.x("string", true);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    public void T(Collection collection0, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(collection0, com.fasterxml.jackson.core.r.m));
        k0.u1(collection0);
        this.V(collection0, k0, i0);
        j0.v(k0, c0);
    }

    public void U(Collection collection0, k k0, I i0) throws IOException {
        int v = collection0.size();
        if(v == 1 && (this.d == null && i0.D0(H.w) || this.d == Boolean.TRUE)) {
            this.V(collection0, k0, i0);
            return;
        }
        k0.C4(collection0, v);
        this.V(collection0, k0, i0);
        k0.n3();
    }

    private final void V(Collection collection0, k k0, I i0) throws IOException {
        int v = 0;
        try {
            Iterator iterator0 = collection0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(s == null) {
                    i0.X(k0);
                }
                else {
                    k0.d(s);
                }
                ++v;
            }
        }
        catch(Exception exception0) {
        }
        this.N(i0, exception0, collection0, v);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.U(((Collection)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.F
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.T(((Collection)object0), k0, i0, j0);
    }
}

