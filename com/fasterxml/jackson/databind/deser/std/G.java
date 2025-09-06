package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.x;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.node.f;
import com.fasterxml.jackson.databind.node.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.util.C;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

abstract class g extends D implements j {
    static final class a {
        private f[] a;
        private int b;
        private int c;

        public f a() {
            int v = this.b;
            if(v == 0) {
                return null;
            }
            this.b = v - 1;
            return this.a[v - 1];
        }

        public void b(f f0) {
            int v = this.b;
            int v1 = this.c;
            if(v < v1) {
                this.b = v + 1;
                this.a[v] = f0;
                return;
            }
            if(this.a == null) {
                this.c = 10;
                this.a = new f[10];
            }
            else {
                int v2 = v1 + Math.min(4000, Math.max(20, v1 >> 1));
                this.c = v2;
                this.a = (f[])Arrays.copyOf(this.a, v2);
            }
            int v3 = this.b;
            this.b = v3 + 1;
            this.a[v3] = f0;
        }

        public int c() {
            return this.b;
        }
    }

    protected final Boolean f;
    protected final boolean g;
    protected final boolean h;

    protected g(g g0, boolean z, boolean z1) {
        super(g0);
        this.f = g0.f;
        this.g = z;
        this.h = z1;
    }

    public g(Class class0, Boolean boolean0) {
        super(class0);
        this.f = boolean0;
        this.g = true;
        this.h = true;
    }

    protected final p A1(n n0, h h0, m m0) throws IOException {
        b n$b0;
        int v = h0.i0();
        if((D.d & v) == 0) {
            n$b0 = n0.i2();
        }
        else if(i.d.b(v)) {
            n$b0 = b.c;
        }
        else if(i.e.b(v)) {
            n$b0 = b.b;
        }
        else {
            n$b0 = n0.i2();
        }
        if(n$b0 == b.a) {
            return m0.z(n0.Q1());
        }
        return n$b0 == b.b ? m0.C(n0.e2()) : m0.O(n0.x0());
    }

    protected void B1(n n0, h h0, m m0, String s, u u0, p p0, p p1) throws IOException {
        if(h0.J0(i.k)) {
            h0.c1(p.class, "Duplicate field \'%s\' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", new Object[]{s});
        }
        if(h0.I0(x.c)) {
            if(p0.isArray()) {
                ((com.fasterxml.jackson.databind.node.a)p0).K2(p1);
                u0.m3(s, p0);
                return;
            }
            com.fasterxml.jackson.databind.node.a a0 = m0.R();
            a0.K2(p0);
            a0.K2(p1);
            u0.m3(s, a0);
        }
    }

    private static boolean C1(Boolean boolean0, Boolean boolean1) {
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        return boolean1 == null ? true : boolean1.booleanValue();
    }

    protected final p D1(n n0, h h0, u u0, a g$a0) throws IOException {
        String s;
        if(n0.e4()) {
            s = n0.h4();
        }
        else {
            if(!n0.Y3(r.o)) {
                return (p)this.g(n0, h0);
            }
            s = n0.T();
        }
        m m0 = h0.k0();
        while(s != null) {
            r r0 = n0.m4();
            p p0 = u0.N0(s);
            if(p0 == null) {
            label_20:
                if(r0 == null) {
                    r0 = r.j;
                }
                switch(r0.d()) {
                    case 1: {
                        u0.t3(s, this.t1(n0, h0, m0, g$a0, m0.y()));
                        break;
                    }
                    case 3: {
                        u0.t3(s, this.t1(n0, h0, m0, g$a0, m0.R()));
                        break;
                    }
                    case 6: {
                        u0.t3(s, m0.G(n0.R2()));
                        break;
                    }
                    case 7: {
                        u0.t3(s, this.A1(n0, h0, m0));
                        break;
                    }
                    case 9: {
                        u0.t3(s, m0.h(true));
                        break;
                    }
                    case 10: {
                        u0.t3(s, m0.h(false));
                        break;
                    }
                    case 11: {
                        if(h0.A(com.fasterxml.jackson.databind.cfg.r.c)) {
                            u0.t3(s, m0.r());
                        }
                        break;
                    }
                    default: {
                        u0.t3(s, this.v1(n0, h0));
                    }
                }
            }
            else if(!(p0 instanceof u)) {
                if(p0 instanceof com.fasterxml.jackson.databind.node.a && r0 == r.m && this.g) {
                    this.t1(n0, h0, m0, g$a0, ((com.fasterxml.jackson.databind.node.a)p0));
                    goto label_39;
                }
                goto label_20;
            }
            else if(r0 == r.k && this.h) {
                p p1 = this.D1(n0, h0, ((u)p0), g$a0);
                if(p1 != p0) {
                    u0.t3(s, p1);
                }
            }
            else {
                goto label_20;
            }
        label_39:
            s = n0.h4();
        }
        return u0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public com.fasterxml.jackson.databind.n a(h h0, d d0) throws o {
        com.fasterxml.jackson.databind.g g0 = h0.g0();
        Boolean boolean0 = g0.A(com.fasterxml.jackson.databind.node.a.class);
        Boolean boolean1 = g0.A(u.class);
        Boolean boolean2 = g0.A(p.class);
        boolean z = g.C1(boolean0, boolean2);
        boolean z1 = g.C1(boolean1, boolean2);
        return z == this.g && z1 == this.h ? this : this.r1(z, z1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
        return f0.c(n0, h0);
    }

    protected abstract com.fasterxml.jackson.databind.n r1(boolean arg1, boolean arg2);

    protected final p s1(n n0, h h0) throws IOException {
        m m0 = h0.k0();
        int v = n0.d0();
        if(v != 2) {
            switch(v) {
                case 6: {
                    return m0.G(n0.R2());
                }
                case 7: {
                    return this.A1(n0, h0, m0);
                }
                case 8: {
                    return this.y1(n0, h0, m0);
                }
                case 9: {
                    return m0.h(true);
                }
                case 10: {
                    return m0.h(false);
                }
                case 11: {
                    return m0.r();
                }
                case 12: {
                    return this.x1(n0, h0);
                }
                default: {
                    return (p)h0.v0(this.s(), n0);
                }
            }
        }
        return m0.y();
    }

    protected final f t1(n n0, h h0, m m0, a g$a0, f f0) throws IOException {
        com.fasterxml.jackson.databind.node.a a1;
        p p0;
        u u3;
        u u2;
        int v = h0.i0() & D.d;
        f f1 = f0;
    alab1:
        while(true) {
            if(f1 instanceof u) {
                String s = n0.h4();
                f f2 = f1;
                u u0 = (u)f1;
                String s1 = s;
                while(s1 != null) {
                    r r0 = n0.m4();
                    if(r0 == null) {
                        r0 = r.j;
                    }
                    switch(r0.d()) {
                        case 1: {
                            u u1 = m0.y();
                            p p1 = u0.m3(s1, u1);
                            if(p1 == null) {
                                u2 = u1;
                            }
                            else {
                                u2 = u1;
                                this.B1(n0, h0, m0, s1, u0, p1, u1);
                            }
                            g$a0.b(f2);
                            u0 = u2;
                            f2 = u0;
                            goto label_51;
                        }
                        case 3: {
                            com.fasterxml.jackson.databind.node.a a0 = m0.R();
                            p p2 = u0.m3(s1, a0);
                            if(p2 != null) {
                                this.B1(n0, h0, m0, s1, u0, p2, a0);
                            }
                            g$a0.b(f2);
                            f1 = a0;
                            goto label_71;
                        }
                        case 6: {
                            p0 = m0.G(n0.R2());
                            goto label_44;
                        }
                        case 7: {
                            p0 = this.z1(n0, v, m0);
                            goto label_44;
                        }
                        case 8: {
                            p0 = this.y1(n0, h0, m0);
                            goto label_44;
                        }
                        case 9: {
                            p0 = m0.h(true);
                            goto label_44;
                        }
                        case 10: {
                            p0 = m0.h(false);
                            goto label_44;
                        }
                        case 11: {
                            if(h0.A(com.fasterxml.jackson.databind.cfg.r.c)) {
                                p0 = m0.r();
                            label_44:
                                p p3 = u0.m3(s1, p0);
                                if(p3 != null) {
                                    u3 = u0;
                                    this.B1(n0, h0, m0, s1, u0, p3, p0);
                                    goto label_50;
                                }
                            }
                            break;
                        }
                        default: {
                            p0 = this.v1(n0, h0);
                            goto label_44;
                        }
                    }
                    u3 = u0;
                label_50:
                    u0 = u3;
                label_51:
                    s1 = n0.h4();
                }
                f1 = g$a0.a();
                goto label_71;
            }
            a1 = (com.fasterxml.jackson.databind.node.a)f1;
        label_56:
            r r1 = n0.m4();
            if(r1 == null) {
                r1 = r.j;
            }
            switch(r1.d()) {
                case 1: {
                    g$a0.b(f1);
                    f1 = m0.y();
                    a1.K2(f1);
                    goto label_71;
                }
                case 3: {
                    g$a0.b(f1);
                    f1 = m0.R();
                    a1.K2(f1);
                    goto label_71;
                }
                case 4: {
                    f1 = g$a0.a();
                label_71:
                    if(f1 != null) {
                        break;
                    }
                    break alab1;
                }
                case 6: {
                    a1.K2(m0.G(n0.R2()));
                    goto label_56;
                }
                case 7: {
                    a1.K2(this.z1(n0, v, m0));
                    goto label_56;
                }
                case 8: {
                    a1.K2(this.y1(n0, h0, m0));
                    goto label_56;
                }
                case 9: {
                    a1.K2(m0.h(true));
                    goto label_56;
                }
                case 10: {
                    a1.K2(m0.h(false));
                    goto label_56;
                }
                case 11: {
                    a1.K2(m0.r());
                    goto label_56;
                }
                default: {
                    a1.K2(this.v1(n0, h0));
                    goto label_56;
                }
            }
        }
        return f0;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return true;
    }

    protected final u u1(n n0, h h0, m m0, a g$a0) throws IOException {
        p p0;
        u u0 = m0.y();
        for(String s = n0.T(); s != null; s = n0.h4()) {
            r r0 = n0.m4();
            if(r0 == null) {
                r0 = r.j;
            }
            switch(r0.d()) {
                case 1: {
                    p0 = this.t1(n0, h0, m0, g$a0, m0.y());
                    break;
                }
                case 3: {
                    p0 = this.t1(n0, h0, m0, g$a0, m0.R());
                    break;
                }
                default: {
                    p0 = this.s1(n0, h0);
                }
            }
            p p1 = u0.m3(s, p0);
            if(p1 != null) {
                this.B1(n0, h0, m0, s, u0, p1, p0);
            }
        }
        return u0;
    }

    protected final p v1(n n0, h h0) throws IOException {
        switch(n0.d0()) {
            case 2: {
                return h0.k0().y();
            }
            case 8: {
                return this.y1(n0, h0, h0.k0());
            }
            case 12: {
                return this.x1(n0, h0);
            }
            default: {
                return (p)h0.v0(this.s(), n0);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.e;
    }

    protected final p w1(h h0, m m0, BigDecimal bigDecimal0) {
        com.fasterxml.jackson.databind.cfg.m m1 = h0.r();
        if((m1.h(com.fasterxml.jackson.databind.cfg.r.f) ? m1.e(com.fasterxml.jackson.databind.cfg.r.f) : m0.H())) {
            try {
                bigDecimal0 = com.fasterxml.jackson.databind.deser.std.f.a(bigDecimal0);
            }
            catch(ArithmeticException unused_ex) {
            }
        }
        return m0.b(bigDecimal0);
    }

    protected final p x1(n n0, h h0) throws IOException {
        m m0 = h0.k0();
        Object object0 = n0.l1();
        if(object0 == null) {
            return m0.r();
        }
        if(object0.getClass() == byte[].class) {
            return m0.f(((byte[])object0));
        }
        if(object0 instanceof C) {
            return m0.I(((C)object0));
        }
        return object0 instanceof p ? ((p)object0) : m0.d(object0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(com.fasterxml.jackson.databind.g g0) {
        return this.f;
    }

    protected final p y1(n n0, h h0, m m0) throws IOException {
        b n$b0 = n0.i2();
        if(n$b0 == b.f) {
            return this.w1(h0, m0, n0.i1());
        }
        if(h0.J0(i.c)) {
            try {
                return this.w1(h0, m0, n0.i1());
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return n$b0 == b.d ? m0.x(n0.u1()) : m0.w(n0.j1());
    }

    protected final p z1(n n0, int v, m m0) throws IOException {
        if(v != 0) {
            return i.d.b(v) ? m0.O(n0.x0()) : m0.C(n0.e2());
        }
        b n$b0 = n0.i2();
        if(n$b0 == b.a) {
            return m0.z(n0.Q1());
        }
        return n$b0 == b.b ? m0.C(n0.e2()) : m0.O(n0.x0());
    }
}

