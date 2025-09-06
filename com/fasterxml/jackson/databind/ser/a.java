package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.std.u;
import com.fasterxml.jackson.databind.t;
import java.util.Map;

public class a {
    protected final d a;
    protected final k b;
    protected r c;
    protected u d;

    public a(d d0, k k0, r r0) {
        this.b = k0;
        this.a = d0;
        this.c = r0;
        if(r0 instanceof u) {
            this.d = (u)r0;
        }
    }

    public void a(G g0) {
        boolean z = g0.a0(t.q);
        this.b.k(z);
    }

    public void b(Object object0, com.fasterxml.jackson.core.k k0, I i0, o o0) throws Exception {
        Object object1 = this.b.q(object0);
        if(object1 == null) {
            return;
        }
        if(!(object1 instanceof Map)) {
            i0.D(this.a.getType(), String.format("Value returned by \'any-getter\' (%s()) not java.util.Map but %s", this.b.getName(), object1.getClass().getName()));
        }
        u u0 = this.d;
        if(u0 != null) {
            u0.p0(i0, k0, object0, ((Map)object1), o0, null);
            return;
        }
        this.c.m(object1, k0, i0);
    }

    public void c(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        Object object1 = this.b.q(object0);
        if(object1 == null) {
            return;
        }
        if(!(object1 instanceof Map)) {
            i0.D(this.a.getType(), String.format("Value returned by \'any-getter\' %s() not java.util.Map but %s", this.b.getName(), object1.getClass().getName()));
        }
        u u0 = this.d;
        if(u0 != null) {
            u0.u0(((Map)object1), k0, i0);
            return;
        }
        this.c.m(object1, k0, i0);
    }

    public void d(I i0) throws com.fasterxml.jackson.databind.o {
        r r0 = this.c;
        if(r0 instanceof com.fasterxml.jackson.databind.ser.k) {
            r r1 = i0.y0(r0, this.a);
            this.c = r1;
            if(r1 instanceof u) {
                this.d = (u)r1;
            }
        }
    }
}

