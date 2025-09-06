package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.d;
import com.fasterxml.jackson.databind.util.x;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

public class u extends d implements Serializable {
    protected final x x;
    private static final long y = 1L;

    public u(d d0, x x0) {
        super(d0);
        this.x = x0;
    }

    protected u(u u0, x x0, q q0) {
        super(u0, q0);
        this.x = x0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public boolean N() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public d Q(x x0) {
        return this.X(x0);
    }

    protected u W(x x0, q q0) {
        return new u(this, x0, q0);
    }

    public u X(x x0) {
        String s = x0.d(this.e.getValue());
        return this.W(x.a(x0, this.x), new q(s));
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public void g(l l0, I i0) throws o {
        class a extends com.fasterxml.jackson.databind.jsonFormatVisitors.g.a {
            final l b;
            final u c;

            a(I i0, l l0) {
                this.b = l0;
                super(i0);
            }

            @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.g$a
            public l e(m m0) throws o {
                return this.b;
            }
        }

        r r0 = i0.o0(this.getType(), this).o(this.x);
        if(r0.j()) {
            r0.e(new a(this, i0, l0), this.getType());
            return;
        }
        super.g(l0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public void o(Object object0, k k0, I i0) throws Exception {
        Object object1 = this.B(object0);
        if(object1 == null) {
            return;
        }
        r r0 = this.n;
        if(r0 == null) {
            Class class0 = object1.getClass();
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.q;
            r r1 = k1.m(class0);
            r0 = r1 == null ? this.s(k1, class0, i0) : r1;
        }
        Object object2 = this.s;
        if(object2 != null) {
            if(d.w == object2) {
                if(r0.h(i0, object1)) {
                    return;
                }
            }
            else if(object2.equals(object1)) {
                return;
            }
        }
        if(object1 == object0 && this.u(object0, k0, i0, r0)) {
            return;
        }
        if(!r0.j()) {
            k0.s3(this.e);
        }
        j j0 = this.p;
        if(j0 == null) {
            r0.m(object1, k0, i0);
            return;
        }
        r0.n(object1, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    protected void r(com.fasterxml.jackson.databind.node.u u0, p p0) {
        p p1 = p0.N0("properties");
        if(p1 != null) {
            Iterator iterator0 = p1.A0();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)((Map.Entry)object0).getKey();
                x x0 = this.x;
                if(x0 != null) {
                    s = x0.d(s);
                }
                u0.t3(s, ((p)((Map.Entry)object0).getValue()));
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    protected r s(com.fasterxml.jackson.databind.ser.impl.k k0, Class class0, I i0) throws o {
        m m0 = this.i;
        r r0 = m0 == null ? i0.q0(class0, this) : i0.o0(i0.k(m0, class0), this);
        r r1 = r0.o((!r0.j() || !(r0 instanceof v) ? this.x : x.a(this.x, ((v)r0).n)));
        this.q = this.q.l(class0, r1);
        return r1;
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public void y(r r0) {
        if(r0 != null) {
            r0 = r0.o((!r0.j() || !(r0 instanceof v) ? this.x : x.a(this.x, ((v)r0).n)));
        }
        super.y(r0);
    }
}

