package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.e;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.x;

public class n {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.annotation.u.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.fasterxml.jackson.annotation.u.a.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.b.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.a.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final G a;
    protected final c b;
    protected final b c;
    protected Object d;
    protected final com.fasterxml.jackson.annotation.u.b e;
    protected final boolean f;
    private static final Object g;

    static {
        n.g = Boolean.FALSE;
    }

    public n(G g0, c c0) {
        this.a = g0;
        this.b = c0;
        com.fasterxml.jackson.annotation.u.b u$b0 = com.fasterxml.jackson.annotation.u.b.j(c0.v(com.fasterxml.jackson.annotation.u.b.d()), g0.G(c0.y(), com.fasterxml.jackson.annotation.u.b.d()));
        this.e = com.fasterxml.jackson.annotation.u.b.j(g0.E(), u$b0);
        this.f = u$b0.i() == com.fasterxml.jackson.annotation.u.a.e;
        this.c = g0.n();
    }

    protected d a(v v0, k k0, com.fasterxml.jackson.databind.util.b b0, m m0, r r0, j j0, m m1, boolean z, Object object0, Class[] arr_class) throws o {
        return new d(v0, k0, b0, m0, r0, j0, m1, z, object0, arr_class);
    }

    protected Object b(Exception exception0, String s, Object object0) {
        while(exception0.getCause() != null) {
            exception0 = exception0.getCause();
        }
        h.v0(exception0);
        h.x0(exception0);
        throw new IllegalArgumentException("Failed to get property \'" + s + "\' of default " + object0.getClass().getName() + " instance");
    }

    protected d c(I i0, v v0, m m0, r r0, j j0, j j1, k k0, boolean z) throws o {
        boolean z2;
        Object object1;
        m m3;
        m m1;
        boolean z1 = false;
        try {
            m1 = this.d(k0, z, m0);
        }
        catch(o o0) {
            if(v0 == null) {
                return (d)i0.D(m0, h.q(o0));
            }
            String s = h.q(o0);
            return (d)i0.J0(this.b, v0, s, new Object[0]);
        }
        if(j1 == null) {
            m3 = m1;
        }
        else {
            if(m1 == null) {
                m1 = m0;
            }
            if(m1.E() == null) {
                i0.J0(this.b, v0, "serialization type " + m1 + " has no content", new Object[0]);
            }
            m m2 = m1.g0(j1);
            m2.E();
            m3 = m2;
        }
        m m4 = m3 == null ? m0 : m3;
        k k1 = v0.u();
        if(k1 == null) {
            return (d)i0.J0(this.b, v0, "could not determine property type", new Object[0]);
        }
        Class class0 = k1.f();
        com.fasterxml.jackson.annotation.u.b u$b0 = this.a.y(m4.g(), class0, this.e).o(v0.n());
        com.fasterxml.jackson.annotation.u.a u$a0 = u$b0.i();
        if(u$a0 == com.fasterxml.jackson.annotation.u.a.g) {
            u$a0 = com.fasterxml.jackson.annotation.u.a.a;
        }
        Object object0 = null;
        switch(u$a0) {
            case 1: {
                if(this.f) {
                    Object object2 = this.f();
                    if(object2 == null) {
                        object0 = e.b(m4);
                        z1 = true;
                    }
                    else {
                        if(i0.z(t.p)) {
                            k0.k(this.a.a0(t.q));
                        }
                        try {
                            object0 = k0.q(object2);
                        }
                        catch(Exception exception0) {
                            this.b(exception0, v0.getName(), object2);
                        }
                    }
                }
                else {
                    object0 = e.b(m4);
                    z1 = true;
                }
                if(object0 == null) {
                    object1 = null;
                    z2 = true;
                }
                else if(object0.getClass().isArray()) {
                    object1 = com.fasterxml.jackson.databind.util.c.b(object0);
                    z2 = z1;
                }
                else {
                    z2 = z1;
                    object1 = object0;
                }
                break;
            }
            case 2: {
                object1 = m4.s() ? d.w : null;
                z2 = true;
                break;
            }
            case 3: {
                object1 = d.w;
                z2 = true;
                break;
            }
            case 4: {
                object1 = i0.B0(v0, u$b0.h());
                z2 = false;
                break;
            }
            case 5: {
                z1 = true;
            label_31:
                if(!m4.o() || this.a.l1(H.v)) {
                    z2 = z1;
                    object1 = null;
                }
                else {
                    object1 = d.w;
                    z2 = z1;
                }
                break;
            }
            default: {
                goto label_31;
            }
        }
        Class[] arr_class = v0.t();
        if(arr_class == null) {
            arr_class = this.b.j();
        }
        d d0 = this.a(v0, k0, this.b.z(), m0, r0, j0, m3, z2, object1, arr_class);
        Object object3 = this.c.L(k0);
        if(object3 != null) {
            d0.x(i0.N0(k0, object3));
        }
        x x0 = this.c.s0(k0);
        return x0 == null ? d0 : d0.T(x0);
    }

    protected m d(com.fasterxml.jackson.databind.introspect.b b0, boolean z, m m0) throws o {
        m m1 = this.c.M0(this.a, b0, m0);
        boolean z1 = true;
        if(m1 != m0) {
            Class class0 = m1.g();
            Class class1 = m0.g();
            if(!class0.isAssignableFrom(class1) && !class1.isAssignableFrom(class0)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method \'" + b0.getName() + "\': class " + class0.getName() + " not a super-type of (declared) class " + class1.getName());
            }
            m0 = m1;
            z = true;
        }
        com.fasterxml.jackson.databind.annotation.g.b g$b0 = this.c.m0(b0);
        if(g$b0 != null && g$b0 != com.fasterxml.jackson.databind.annotation.g.b.c) {
            if(g$b0 != com.fasterxml.jackson.databind.annotation.g.b.b) {
                z1 = false;
            }
            z = z1;
        }
        return z ? m0.j0() : null;
    }

    public com.fasterxml.jackson.databind.util.b e() {
        return this.b.z();
    }

    protected Object f() {
        Object object0 = this.d;
        if(object0 == null) {
            boolean z = this.a.c();
            object0 = this.b.J(z);
            if(object0 == null) {
                object0 = n.g;
            }
            this.d = object0;
        }
        return object0 == n.g ? null : this.d;
    }

    @Deprecated
    protected Object g(m m0) {
        return e.b(m0);
    }

    @Deprecated
    protected Object h(String s, k k0, m m0) {
        Object object0 = this.f();
        if(object0 == null) {
            return this.g(m0);
        }
        try {
            return k0.q(object0);
        }
        catch(Exception exception0) {
            return this.b(exception0, s, object0);
        }
    }
}

