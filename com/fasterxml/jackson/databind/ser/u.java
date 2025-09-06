package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.u.a;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.util.b;
import java.io.Serializable;

public abstract class u extends d implements Serializable {
    private static final long x = 1L;

    protected u() {
    }

    protected u(v v0, b b0, m m0) {
        this(v0, b0, m0, null, null, null, v0.n());
    }

    @Deprecated
    protected u(v v0, b b0, m m0, r r0, j j0, m m1, com.fasterxml.jackson.annotation.u.b u$b0) {
        this(v0, b0, m0, r0, j0, m1, u$b0, null);
    }

    protected u(v v0, b b0, m m0, r r0, j j0, m m1, com.fasterxml.jackson.annotation.u.b u$b0, Class[] arr_class) {
        super(v0, v0.D(), b0, m0, r0, j0, m1, u.W(u$b0), u.X(u$b0), arr_class);
    }

    protected u(u u0) {
        super(u0);
    }

    protected u(u u0, B b0) {
        super(u0, b0);
    }

    protected static boolean W(com.fasterxml.jackson.annotation.u.b u$b0) {
        if(u$b0 == null) {
            return false;
        }
        a u$a0 = u$b0.i();
        return u$a0 != a.a && u$a0 != a.g;
    }

    protected static Object X(com.fasterxml.jackson.annotation.u.b u$b0) {
        if(u$b0 == null) {
            return false;
        }
        a u$a0 = u$b0.i();
        return u$a0 == a.a || u$a0 == a.b || u$a0 == a.g ? null : d.w;
    }

    protected abstract Object Y(Object arg1, k arg2, I arg3) throws Exception;

    public abstract u Z(t arg1, com.fasterxml.jackson.databind.introspect.d arg2, v arg3, m arg4);

    @Override  // com.fasterxml.jackson.databind.introspect.y
    public boolean j() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public void n(Object object0, k k0, I i0) throws Exception {
        Object object1 = this.Y(object0, k0, i0);
        if(object1 == null) {
            r r0 = this.o;
            if(r0 != null) {
                r0.m(null, k0, i0);
                return;
            }
            k0.y3();
            return;
        }
        r r1 = this.n;
        if(r1 == null) {
            Class class0 = object1.getClass();
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.q;
            r r2 = k1.m(class0);
            r1 = r2 == null ? this.s(k1, class0, i0) : r2;
        }
        Object object2 = this.s;
        if(object2 != null) {
            if(d.w == object2) {
                if(r1.h(i0, object1)) {
                    this.q(object0, k0, i0);
                    return;
                }
            }
            else if(object2.equals(object1)) {
                this.q(object0, k0, i0);
                return;
            }
        }
        if(object1 == object0 && this.u(object0, k0, i0, r1)) {
            return;
        }
        j j0 = this.p;
        if(j0 == null) {
            r1.m(object1, k0, i0);
            return;
        }
        r1.n(object1, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.d
    public void o(Object object0, k k0, I i0) throws Exception {
        Object object1 = this.Y(object0, k0, i0);
        if(object1 == null) {
            if(this.o != null) {
                k0.s3(this.e);
                this.o.m(null, k0, i0);
            }
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
        k0.s3(this.e);
        j j0 = this.p;
        if(j0 == null) {
            r0.m(object1, k0, i0);
            return;
        }
        r0.n(object1, k0, i0, j0);
    }
}

