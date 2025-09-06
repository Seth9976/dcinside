package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.E;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.type.l;
import com.fasterxml.jackson.databind.util.c;
import com.fasterxml.jackson.databind.util.e;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;

public abstract class B extends M implements k {
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

    protected final m d;
    protected final d e;
    protected final j f;
    protected final r g;
    protected final x h;
    protected transient com.fasterxml.jackson.databind.ser.impl.k i;
    protected final Object j;
    protected final boolean k;
    private static final long l = 1L;
    public static final Object m;

    static {
        B.m = com.fasterxml.jackson.annotation.u.a.d;
    }

    protected B(B b0, d d0, j j0, r r0, x x0, Object object0, boolean z) {
        super(b0);
        this.d = b0.d;
        this.i = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.e = d0;
        this.f = j0;
        this.g = r0;
        this.h = x0;
        this.j = object0;
        this.k = z;
    }

    public B(l l0, boolean z, j j0, r r0) {
        super(l0);
        this.d = l0.O();
        this.e = null;
        this.f = j0;
        this.g = r0;
        this.h = null;
        this.j = null;
        this.k = false;
        this.i = com.fasterxml.jackson.databind.ser.impl.k.c();
    }

    private final r P(I i0, Class class0) throws o {
        r r0 = this.i.m(class0);
        if(r0 == null) {
            r r1 = this.d.i() ? i0.h0(i0.k(this.d, class0), this.e) : i0.i0(class0, this.e);
            x x0 = this.h;
            if(x0 != null) {
                r1 = r1.o(x0);
            }
            r0 = r1;
            this.i = this.i.l(class0, r0);
        }
        return r0;
    }

    private final r Q(I i0, m m0, d d0) throws o {
        return i0.h0(m0, d0);
    }

    protected abstract Object R(Object arg1);

    protected abstract Object S(Object arg1);

    protected abstract boolean T(Object arg1);

    protected boolean U(I i0, d d0, m m0) {
        if(m0.Y()) {
            return false;
        }
        if(m0.q()) {
            return true;
        }
        if(m0.e0()) {
            return true;
        }
        b b0 = i0.o();
        if(b0 != null && d0 != null && d0.h() != null) {
            com.fasterxml.jackson.databind.annotation.g.b g$b0 = b0.m0(d0.h());
            if(g$b0 == com.fasterxml.jackson.databind.annotation.g.b.b) {
                return true;
            }
            return g$b0 == com.fasterxml.jackson.databind.annotation.g.b.a ? false : i0.z(t.r);
        }
        return i0.z(t.r);
    }

    public m V() {
        return this.d;
    }

    public abstract B W(Object arg1, boolean arg2);

    protected abstract B X(d arg1, j arg2, r arg3, x arg4);

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        j j0 = this.f == null ? this.f : this.f.b(d0);
        r r0 = this.y(i0, d0);
        if(r0 == null) {
            r0 = this.g;
            if(r0 != null) {
                r0 = i0.y0(r0, d0);
            }
            else if(this.U(i0, d0, this.d)) {
                r0 = this.Q(i0, this.d, d0);
            }
        }
        r r1 = this.e != d0 || this.f != j0 || this.g != r0 ? this.X(d0, j0, r0, this.h) : this;
        if(d0 != null) {
            com.fasterxml.jackson.annotation.u.b u$b0 = d0.i(i0.r0(), this.g());
            if(u$b0 != null) {
                com.fasterxml.jackson.annotation.u.a u$a0 = u$b0.g();
                if(u$a0 != com.fasterxml.jackson.annotation.u.a.g) {
                    Object object0 = null;
                    int v = a.a[u$a0.ordinal()];
                    boolean z = true;
                    if(v == 1) {
                        object0 = e.b(this.d);
                        if(object0 != null && object0.getClass().isArray()) {
                            object0 = c.b(object0);
                        }
                    }
                    else {
                        switch(v) {
                            case 2: {
                                if(this.d.s()) {
                                    object0 = B.m;
                                }
                                break;
                            }
                            case 3: {
                                object0 = B.m;
                                break;
                            }
                            case 4: {
                                object0 = i0.B0(null, u$b0.f());
                                if(object0 != null) {
                                    z = i0.C0(object0);
                                }
                                break;
                            }
                            case 5: {
                                break;
                            }
                            default: {
                                z = false;
                            }
                        }
                    }
                    if(this.j != object0 || this.k != z) {
                        return ((B)r1).W(object0, z);
                    }
                }
            }
        }
        return r1;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        r r0 = this.g;
        if(r0 == null) {
            r0 = this.Q(g0.a(), this.d, this.e);
            x x0 = this.h;
            if(x0 != null) {
                r0 = r0.o(x0);
            }
        }
        r0.e(g0, this.d);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        if(!this.T(object0)) {
            return true;
        }
        Object object1 = this.R(object0);
        if(object1 == null) {
            return this.k;
        }
        if(this.j == null) {
            return false;
        }
        r r0 = this.g;
        if(r0 == null) {
            try {
                r0 = this.P(i0, object1.getClass());
                return this.j == B.m ? r0.h(i0, object1) : this.j.equals(object1);
            }
            catch(o o0) {
                throw new E(o0);
            }
        }
        return this.j == B.m ? r0.h(i0, object1) : this.j.equals(object1);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean j() {
        return this.h != null;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        Object object1 = this.S(object0);
        if(object1 == null) {
            if(this.h == null) {
                i0.X(k0);
            }
            return;
        }
        r r0 = this.g == null ? this.P(i0, object1.getClass()) : this.g;
        j j0 = this.f;
        if(j0 != null) {
            r0.n(object1, k0, i0, j0);
            return;
        }
        r0.m(object1, k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
        Object object1 = this.S(object0);
        if(object1 == null) {
            if(this.h == null) {
                i0.X(k0);
            }
            return;
        }
        (this.g == null ? this.P(i0, object1.getClass()) : this.g).n(object1, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public r o(x x0) {
        r r0 = this.g;
        if(r0 != null) {
            r0 = r0.o(x0);
            if(r0 == this.g) {
                return this;
            }
        }
        x x1 = this.h;
        if(x1 != null) {
            x0 = x.a(x0, x1);
        }
        return this.g != r0 || this.h != x0 ? this.X(this.e, this.f, r0, x0) : this;
    }
}

