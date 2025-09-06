package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.core.k.b;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.databind.deser.C;
import com.fasterxml.jackson.databind.deser.h;
import com.fasterxml.jackson.databind.deser.o;
import com.fasterxml.jackson.databind.deser.s;
import com.fasterxml.jackson.databind.jsontype.c;
import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.t;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.type.r;
import java.util.Collection;
import java.util.Collections;

public abstract class w implements I {
    public interface a {
        void A0(i arg1);

        void B0(Collection arg1);

        boolean C0(b arg1);

        void D0(h arg1);

        void E0(D arg1);

        boolean F0(com.fasterxml.jackson.core.n.a arg1);

        u e0();

        void f0(com.fasterxml.jackson.databind.a arg1);

        void g0(t arg1);

        void h0(s arg1);

        H i0();

        void j0(C arg1);

        void k0(r arg1);

        void l0(Class[] arg1);

        com.fasterxml.jackson.databind.cfg.w m0(Class arg1);

        void n0(com.fasterxml.jackson.databind.b arg1);

        boolean o0(com.fasterxml.jackson.databind.t arg1);

        void p0(com.fasterxml.jackson.databind.introspect.w arg1);

        q q0();

        void r0(com.fasterxml.jackson.databind.deser.t arg1);

        void s0(c[] arg1);

        void t0(t arg1);

        void u0(o arg1);

        void v0(com.fasterxml.jackson.databind.b arg1);

        boolean w0(com.fasterxml.jackson.core.h.a arg1);

        boolean x0(com.fasterxml.jackson.databind.i arg1);

        void y0(Class arg1, Class arg2);

        boolean z0(com.fasterxml.jackson.databind.H arg1);
    }

    public Iterable a() {
        return Collections.emptyList();
    }

    public abstract String b();

    public Object c() {
        return this.getClass().getName();
    }

    public abstract void d(a arg1);

    @Override  // com.fasterxml.jackson.core.I
    public abstract H version();
}

