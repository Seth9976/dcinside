package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.n.c;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.cfg.y;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.impl.f;
import com.fasterxml.jackson.databind.ser.std.C;
import com.fasterxml.jackson.databind.ser.std.H;
import com.fasterxml.jackson.databind.ser.std.I;
import com.fasterxml.jackson.databind.ser.std.K;
import com.fasterxml.jackson.databind.ser.std.N;
import com.fasterxml.jackson.databind.ser.std.O;
import com.fasterxml.jackson.databind.ser.std.P;
import com.fasterxml.jackson.databind.ser.std.Q;
import com.fasterxml.jackson.databind.ser.std.T;
import com.fasterxml.jackson.databind.ser.std.e;
import com.fasterxml.jackson.databind.ser.std.g;
import com.fasterxml.jackson.databind.ser.std.h;
import com.fasterxml.jackson.databind.ser.std.k;
import com.fasterxml.jackson.databind.ser.std.n;
import com.fasterxml.jackson.databind.ser.std.p;
import com.fasterxml.jackson.databind.ser.std.u;
import com.fasterxml.jackson.databind.ser.std.x;
import com.fasterxml.jackson.databind.ser.std.z;
import com.fasterxml.jackson.databind.type.l;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.j;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b extends s implements Serializable {
    static class a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.databind.annotation.g.b.values().length];
            a.c = arr_v;
            try {
                arr_v[com.fasterxml.jackson.databind.annotation.g.b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[com.fasterxml.jackson.databind.annotation.g.b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[com.fasterxml.jackson.databind.annotation.g.b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[com.fasterxml.jackson.annotation.u.a.values().length];
            a.b = arr_v1;
            try {
                arr_v1[com.fasterxml.jackson.annotation.u.a.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.annotation.u.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.annotation.u.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.annotation.u.a.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.annotation.u.a.b.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.annotation.u.a.g.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[c.values().length];
            a.a = arr_v2;
            try {
                arr_v2[c.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final y a;
    protected static final HashMap b;
    protected static final HashMap c;

    static {
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        hashMap1.put("java.lang.String", new N());
        hashMap1.put("java.lang.StringBuffer", Q.d);
        hashMap1.put("java.lang.StringBuilder", Q.d);
        hashMap1.put("java.lang.Character", Q.d);
        hashMap1.put("char", Q.d);
        com.fasterxml.jackson.databind.ser.std.y.a(hashMap1);
        hashMap1.put("boolean", new e(true));
        hashMap1.put("java.lang.Boolean", new e(false));
        hashMap1.put("java.math.BigInteger", new x(BigInteger.class));
        hashMap1.put("java.math.BigDecimal", new x(BigDecimal.class));
        hashMap1.put("java.util.Calendar", h.g);
        hashMap1.put("java.util.Date", k.g);
        for(Object object0: I.a()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof r) {
                hashMap1.put(((Class)map$Entry0.getKey()).getName(), ((r)object1));
            }
            else {
                hashMap0.put(((Class)map$Entry0.getKey()).getName(), ((Class)object1));
            }
        }
        hashMap0.put("com.fasterxml.jackson.databind.util.H", T.class);
        b.b = hashMap1;
        b.c = hashMap0;
    }

    protected b(y y0) {
        if(y0 == null) {
            y0 = new y();
        }
        this.a = y0;
    }

    protected abstract Iterable A();

    protected j B(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.introspect.b b0) throws o {
        Object object0 = i0.o().i0(b0);
        return object0 == null ? null : i0.m(b0, object0);
    }

    protected r C(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.introspect.b b0, r r0) throws o {
        j j0 = this.B(i0, b0);
        return j0 == null ? r0 : new H(j0, j0.b(i0.x()), r0);
    }

    protected Object D(G g0, com.fasterxml.jackson.databind.c c0) {
        return g0.n().z(c0.A());
    }

    protected r E(com.fasterxml.jackson.databind.I i0, m m0, com.fasterxml.jackson.databind.c c0, boolean z) throws o {
        return com.fasterxml.jackson.databind.ext.s.m.c(i0.r0(), m0, c0);
    }

    public r F(com.fasterxml.jackson.databind.I i0, l l0, com.fasterxml.jackson.databind.c c0, boolean z) throws o {
        m m0 = l0.E();
        com.fasterxml.jackson.databind.jsontype.j j0 = (com.fasterxml.jackson.databind.jsontype.j)m0.R();
        G g0 = i0.r0();
        if(j0 == null) {
            j0 = this.d(g0, m0);
        }
        r r0 = (r)m0.S();
        for(Object object0: this.A()) {
            r r1 = ((t)object0).a(g0, l0, c0, j0, r0);
            if(r1 != null) {
                return r1;
            }
            if(false) {
                break;
            }
        }
        return l0.a0(AtomicReference.class) ? this.n(i0, l0, c0, z, j0, r0) : null;
    }

    protected final r G(G g0, m m0, com.fasterxml.jackson.databind.c c0, boolean z) throws o {
        Class class0 = m0.g();
        Class class1 = Iterator.class;
        if(class1.isAssignableFrom(class0)) {
            m[] arr_m = g0.S().n0(m0, class1);
            return arr_m == null || arr_m.length != 1 ? this.x(g0, m0, c0, z, q.v0()) : this.x(g0, m0, c0, z, arr_m[0]);
        }
        Class class2 = Iterable.class;
        if(class2.isAssignableFrom(class0)) {
            m[] arr_m1 = g0.S().n0(m0, class2);
            return arr_m1 == null || arr_m1.length != 1 ? this.w(g0, m0, c0, z, q.v0()) : this.w(g0, m0, c0, z, arr_m1[0]);
        }
        return CharSequence.class.isAssignableFrom(class0) ? Q.d : null;
    }

    protected final r H(com.fasterxml.jackson.databind.I i0, m m0, com.fasterxml.jackson.databind.c c0) throws o {
        if(com.fasterxml.jackson.databind.q.class.isAssignableFrom(m0.g())) {
            return C.d;
        }
        com.fasterxml.jackson.databind.introspect.k k0 = c0.p();
        if(k0 != null) {
            if(i0.j()) {
                com.fasterxml.jackson.databind.util.h.i(k0.o(), i0.z(com.fasterxml.jackson.databind.t.q));
            }
            m m1 = k0.g();
            r r0 = this.K(i0, k0);
            if(r0 == null) {
                r0 = (r)m1.S();
            }
            com.fasterxml.jackson.databind.jsontype.j j0 = (com.fasterxml.jackson.databind.jsontype.j)m1.R();
            if(j0 == null) {
                j0 = this.d(i0.r0(), m1);
            }
            return com.fasterxml.jackson.databind.ser.std.s.T(i0.r0(), k0, j0, r0);
        }
        return null;
    }

    protected final r I(m m0, G g0, com.fasterxml.jackson.databind.c c0, boolean z) {
        String s = m0.g().getName();
        r r0 = (r)b.b.get(s);
        if(r0 == null) {
            Class class0 = (Class)b.c.get(s);
            return class0 == null ? null : ((r)com.fasterxml.jackson.databind.util.h.n(class0, false));
        }
        return r0;
    }

    protected final r J(com.fasterxml.jackson.databind.I i0, m m0, com.fasterxml.jackson.databind.c c0, boolean z) throws o {
        if(m0.p()) {
            return this.r(i0.r0(), m0, c0);
        }
        Class class0 = m0.g();
        r r0 = this.E(i0, m0, c0, z);
        if(r0 != null) {
            return r0;
        }
        if(Calendar.class.isAssignableFrom(class0)) {
            return h.g;
        }
        if(Date.class.isAssignableFrom(class0)) {
            return k.g;
        }
        Class class1 = Map.Entry.class;
        if(class1.isAssignableFrom(class0)) {
            m m1 = m0.A(class1);
            return this.y(i0, m0, c0, z, m1.z(0), m1.z(1));
        }
        if(ByteBuffer.class.isAssignableFrom(class0)) {
            return new g();
        }
        if(InetAddress.class.isAssignableFrom(class0)) {
            return new p();
        }
        if(InetSocketAddress.class.isAssignableFrom(class0)) {
            return new com.fasterxml.jackson.databind.ser.std.q();
        }
        if(TimeZone.class.isAssignableFrom(class0)) {
            return new O();
        }
        if(Charset.class.isAssignableFrom(class0)) {
            return Q.d;
        }
        if(Number.class.isAssignableFrom(class0)) {
            switch(c0.l(null).m()) {
                case 1: {
                    return Q.d;
                }
                case 2: 
                case 3: {
                    return null;
                }
                default: {
                    return x.e;
                }
            }
        }
        return ClassLoader.class.isAssignableFrom(class0) ? new P(m0) : null;
    }

    protected r K(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.introspect.b b0) throws o {
        Object object0 = i0.o().n0(b0);
        return object0 == null ? null : this.C(i0, b0, i0.N0(b0, object0));
    }

    public y L() {
        return this.a;
    }

    protected boolean M(Class class0) {
        return RandomAccess.class.isAssignableFrom(class0);
    }

    protected boolean N(G g0, com.fasterxml.jackson.databind.c c0) {
        com.fasterxml.jackson.databind.annotation.g.b g$b0 = g0.n().m0(c0.A());
        if(g$b0 != null) {
            switch(g$b0) {
                case 1: {
                    return false;
                }
                case 2: {
                    return true;
                }
                default: {
                    return g0.a0(com.fasterxml.jackson.databind.t.r);
                }
            }
        }
        return g0.a0(com.fasterxml.jackson.databind.t.r);
    }

    public abstract s O(y arg1);

    @Override  // com.fasterxml.jackson.databind.ser.s
    @Deprecated
    public r a(G g0, m m0, r r0) {
        com.fasterxml.jackson.databind.c c0 = g0.j1(m0);
        r r1 = null;
        if(this.a.a()) {
            for(Object object0: this.a.d()) {
                r1 = ((t)object0).b(g0, m0, c0);
                if(r1 != null) {
                    break;
                }
            }
        }
        if(r1 != null) {
            r0 = r1;
        }
        else if(r0 == null) {
            r0 = K.c(g0, m0.g(), false);
            if(r0 == null) {
                r0 = K.b(g0, m0.g(), c0.A());
            }
        }
        if(this.a.b()) {
            for(Object object1: this.a.e()) {
                r0 = ((i)object1).f(g0, m0, c0, r0);
            }
        }
        return r0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.s
    public r b(com.fasterxml.jackson.databind.I i0, m m0, r r0) throws o {
        r r1;
        G g0 = i0.r0();
        com.fasterxml.jackson.databind.c c0 = g0.j1(m0);
        if(this.a.a()) {
            r1 = null;
            for(Object object0: this.a.d()) {
                r1 = ((t)object0).b(g0, m0, c0);
                if(r1 != null) {
                    break;
                }
            }
        }
        else {
            r1 = null;
        }
        if(r1 == null) {
            r r2 = this.k(i0, c0.A());
            if(r2 != null) {
                r0 = r2;
            }
            else if(r0 == null) {
                r2 = K.c(g0, m0.g(), false);
                if(r2 == null) {
                    com.fasterxml.jackson.databind.introspect.k k0 = c0.o();
                    if(k0 == null) {
                        k0 = c0.p();
                    }
                    if(k0 == null) {
                        r0 = K.b(g0, m0.g(), c0.A());
                    }
                    else {
                        r r3 = this.b(i0, k0.g(), null);
                        if(g0.c()) {
                            com.fasterxml.jackson.databind.util.h.i(k0.o(), g0.a0(com.fasterxml.jackson.databind.t.q));
                        }
                        r0 = com.fasterxml.jackson.databind.ser.std.s.T(g0, k0, null, r3);
                    }
                }
                else {
                    r0 = r2;
                }
            }
        }
        else {
            r0 = r1;
        }
        if(this.a.b()) {
            for(Object object1: this.a.e()) {
                r0 = ((i)object1).f(g0, m0, c0, r0);
            }
        }
        return r0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.s
    public abstract r c(com.fasterxml.jackson.databind.I arg1, m arg2) throws o;

    @Override  // com.fasterxml.jackson.databind.ser.s
    public com.fasterxml.jackson.databind.jsontype.j d(G g0, m m0) {
        d d0 = g0.W(m0.g()).A();
        com.fasterxml.jackson.databind.jsontype.i i0 = g0.n().r0(g0, d0, m0);
        if(i0 == null) {
            i0 = g0.J(m0);
            return i0 == null ? null : i0.g(g0, m0, null);
        }
        return i0 == null ? null : i0.g(g0, m0, g0.Q().c(g0, d0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.s
    public final s e(t t0) {
        return this.O(this.a.g(t0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.s
    public final s f(t t0) {
        return this.O(this.a.h(t0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.s
    public final s g(i i0) {
        return this.O(this.a.i(i0));
    }

    protected u h(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.c c0, u u0) throws o {
        Object object0;
        m m0 = u0.R();
        com.fasterxml.jackson.annotation.u.b u$b0 = this.j(i0, c0, m0, Map.class);
        com.fasterxml.jackson.annotation.u.a u$a0 = u$b0 == null ? com.fasterxml.jackson.annotation.u.a.g : u$b0.g();
        if(u$a0 != com.fasterxml.jackson.annotation.u.a.g && u$a0 != com.fasterxml.jackson.annotation.u.a.a) {
            switch(u$a0) {
                case 1: {
                    object0 = com.fasterxml.jackson.databind.util.e.b(m0);
                    if(object0 != null && object0.getClass().isArray()) {
                        object0 = com.fasterxml.jackson.databind.util.c.b(object0);
                    }
                    return u0.w0(object0, true);
                }
                case 2: {
                    return m0.s() ? u0.w0(u.u, true) : u0.w0(null, true);
                }
                case 3: {
                    return u0.w0(u.u, true);
                }
                case 4: {
                    object0 = i0.B0(null, u$b0.f());
                    return object0 == null ? u0.w0(object0, true) : u0.w0(object0, i0.C0(object0));
                }
                default: {
                    return u0.w0(null, true);
                }
            }
        }
        return i0.D0(com.fasterxml.jackson.databind.H.u) ? u0 : u0.w0(null, true);
    }

    protected r i(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.introspect.b b0) throws o {
        Object object0 = i0.o().j(b0);
        return object0 == null ? null : i0.N0(b0, object0);
    }

    protected com.fasterxml.jackson.annotation.u.b j(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.c c0, m m0, Class class0) throws o {
        G g0 = i0.r0();
        com.fasterxml.jackson.annotation.u.b u$b0 = g0.G(class0, c0.v(g0.E()));
        com.fasterxml.jackson.annotation.u.b u$b1 = g0.G(m0.g(), null);
        if(u$b1 != null) {
            switch(u$b1.i()) {
                case 4: {
                    return u$b0.m(u$b1.f());
                }
                case 6: {
                    break;
                }
                default: {
                    return u$b0.n(u$b1.i());
                }
            }
        }
        return u$b0;
    }

    protected r k(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.introspect.b b0) throws o {
        Object object0 = i0.o().G(b0);
        return object0 == null ? null : i0.N0(b0, object0);
    }

    private void l(com.fasterxml.jackson.databind.introspect.t t0) {
        Class class0 = com.fasterxml.jackson.databind.util.h.t(t0.y());
        Iterator iterator0 = t0.u().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            m m0 = ((v)object0).E();
            if(m0.p() && m0.a0(class0)) {
                iterator0.remove();
            }
        }
    }

    protected r m(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.type.a a0, com.fasterxml.jackson.databind.c c0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0) throws o {
        G g0 = i0.r0();
        r r1 = null;
        for(Object object0: this.A()) {
            r1 = ((t)object0).f(g0, a0, c0, j0, r0);
            if(r1 != null) {
                break;
            }
        }
        if(r1 == null) {
            Class class0 = a0.g();
            if(r0 == null || com.fasterxml.jackson.databind.util.h.c0(r0)) {
                r1 = String[].class == class0 ? com.fasterxml.jackson.databind.ser.impl.p.h : com.fasterxml.jackson.databind.ser.std.G.a(class0);
            }
            if(r1 == null) {
                r1 = new z(a0.E(), z, j0, r0);
            }
        }
        if(this.a.b()) {
            for(Object object1: this.a.e()) {
                r1 = ((i)object1).b(g0, a0, c0, r1);
            }
        }
        return r1;
    }

    protected r n(com.fasterxml.jackson.databind.I i0, l l0, com.fasterxml.jackson.databind.c c0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0) throws o {
        boolean z1;
        m m0 = l0.O();
        com.fasterxml.jackson.annotation.u.b u$b0 = this.j(i0, c0, m0, AtomicReference.class);
        com.fasterxml.jackson.annotation.u.a u$a0 = u$b0 == null ? com.fasterxml.jackson.annotation.u.a.g : u$b0.g();
        Object object0 = null;
        if(u$a0 == com.fasterxml.jackson.annotation.u.a.g || u$a0 == com.fasterxml.jackson.annotation.u.a.a) {
            z1 = false;
        }
        else {
            z1 = true;
            switch(u$a0) {
                case 1: {
                    object0 = com.fasterxml.jackson.databind.util.e.b(m0);
                    if(object0 != null && object0.getClass().isArray()) {
                        object0 = com.fasterxml.jackson.databind.util.c.b(object0);
                        return new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(object0, true);
                    }
                    break;
                }
                case 2: {
                    return m0.s() ? new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(u.u, true) : new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(null, true);
                }
                case 3: {
                    return new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(u.u, true);
                }
                case 4: {
                    object0 = i0.B0(null, u$b0.f());
                    if(object0 != null) {
                        z1 = i0.C0(object0);
                        return new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(object0, z1);
                    }
                    break;
                }
                default: {
                    return new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(null, true);
                }
            }
        }
        return new com.fasterxml.jackson.databind.ser.std.c(l0, z, j0, r0).W(object0, z1);
    }

    protected r o(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.type.e e0, com.fasterxml.jackson.databind.c c0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0) throws o {
        G g0 = i0.r0();
        m m0 = null;
        r r1 = null;
        for(Object object0: this.A()) {
            r1 = ((t)object0).g(g0, e0, c0, j0, r0);
            if(r1 != null) {
                break;
            }
        }
        if(r1 == null) {
            r1 = this.H(i0, e0, c0);
            if(r1 == null) {
                if(c0.l(null).m() == c.e) {
                    return null;
                }
                Class class0 = e0.g();
                if(EnumSet.class.isAssignableFrom(class0)) {
                    m m1 = e0.E();
                    if(m1.W()) {
                        m0 = m1;
                    }
                    r1 = this.s(m0);
                }
                else {
                    Class class1 = e0.E().g();
                    Class class2 = String.class;
                    if(!this.M(class0)) {
                        if(class1 == class2 && com.fasterxml.jackson.databind.util.h.c0(r0)) {
                            r1 = com.fasterxml.jackson.databind.ser.impl.q.e;
                        }
                    }
                    else if(class1 != class2) {
                        r1 = this.u(e0.E(), z, j0, r0);
                    }
                    else if(com.fasterxml.jackson.databind.util.h.c0(r0)) {
                        r1 = f.f;
                    }
                    if(r1 == null) {
                        r1 = this.p(e0.E(), z, j0, r0);
                    }
                }
            }
        }
        if(this.a.b()) {
            for(Object object1: this.a.e()) {
                r1 = ((i)object1).d(g0, e0, c0, r1);
            }
        }
        return r1;
    }

    public com.fasterxml.jackson.databind.ser.j p(m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0) {
        return new com.fasterxml.jackson.databind.ser.std.j(m0, z, j0, r0);
    }

    protected r q(com.fasterxml.jackson.databind.I i0, m m0, com.fasterxml.jackson.databind.c c0, boolean z) throws o {
        com.fasterxml.jackson.databind.c c2;
        com.fasterxml.jackson.databind.c c1 = c0;
        G g0 = i0.r0();
        boolean z1 = z || !m0.e0() || m0.o() && m0.E().Y() ? z : true;
        com.fasterxml.jackson.databind.jsontype.j j0 = this.d(g0, m0.E());
        boolean z2 = j0 == null ? z1 : false;
        r r0 = this.i(i0, c0.A());
        r r1 = null;
        if(m0.r()) {
            r r2 = this.k(i0, c0.A());
            if(((com.fasterxml.jackson.databind.type.i)m0) instanceof com.fasterxml.jackson.databind.type.j) {
                return this.z(i0, ((com.fasterxml.jackson.databind.type.j)(((com.fasterxml.jackson.databind.type.i)m0))), c0, z2, r2, j0, r0);
            }
            for(Object object0: this.A()) {
                r1 = ((t)object0).d(g0, ((com.fasterxml.jackson.databind.type.i)m0), c0, r2, j0, r0);
                if(r1 != null) {
                    break;
                }
            }
            if(r1 == null) {
                r1 = this.H(i0, m0, c0);
            }
            if(r1 != null && this.a.b()) {
                for(Object object1: this.a.e()) {
                    r1 = ((i)object1).g(g0, ((com.fasterxml.jackson.databind.type.i)m0), c1, r1);
                }
            }
            return r1;
        }
        if(m0.m()) {
            if(((com.fasterxml.jackson.databind.type.d)m0) instanceof com.fasterxml.jackson.databind.type.e) {
                return this.o(i0, ((com.fasterxml.jackson.databind.type.e)(((com.fasterxml.jackson.databind.type.d)m0))), c0, z2, j0, r0);
            }
            Iterator iterator2 = this.A().iterator();
            while(true) {
                if(!iterator2.hasNext()) {
                    c2 = c1;
                    break;
                }
                Object object2 = iterator2.next();
                c2 = c1;
                r1 = ((t)object2).c(g0, ((com.fasterxml.jackson.databind.type.d)m0), c0, j0, r0);
                if(r1 != null) {
                    break;
                }
                c1 = c2;
            }
            if(r1 == null) {
                r1 = this.H(i0, m0, c0);
            }
            if(r1 != null && this.a.b()) {
                for(Object object3: this.a.e()) {
                    r1 = ((i)object3).c(g0, ((com.fasterxml.jackson.databind.type.d)m0), c2, r1);
                }
            }
            return r1;
        }
        return m0.l() ? this.m(i0, ((com.fasterxml.jackson.databind.type.a)m0), c0, z2, j0, r0) : null;
    }

    protected r r(G g0, m m0, com.fasterxml.jackson.databind.c c0) throws o {
        com.fasterxml.jackson.annotation.n.d n$d0 = c0.l(null);
        if(n$d0.m() == c.e) {
            ((com.fasterxml.jackson.databind.introspect.t)c0).Z("declaringClass");
            if(m0.p()) {
                this.l(((com.fasterxml.jackson.databind.introspect.t)c0));
            }
            return null;
        }
        r r0 = com.fasterxml.jackson.databind.ser.std.m.R(m0.g(), g0, c0, n$d0);
        if(this.a.b()) {
            for(Object object0: this.a.e()) {
                r0 = ((i)object0).e(g0, m0, c0, r0);
            }
        }
        return r0;
    }

    public r s(m m0) {
        return new n(m0);
    }

    public com.fasterxml.jackson.databind.ser.j u(m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0) {
        return new com.fasterxml.jackson.databind.ser.impl.e(m0, z, j0, r0);
    }

    protected r w(G g0, m m0, com.fasterxml.jackson.databind.c c0, boolean z, m m1) throws o {
        return new com.fasterxml.jackson.databind.ser.std.r(m1, z, this.d(g0, m1));
    }

    protected r x(G g0, m m0, com.fasterxml.jackson.databind.c c0, boolean z, m m1) throws o {
        return new com.fasterxml.jackson.databind.ser.impl.g(m1, z, this.d(g0, m1));
    }

    protected r y(com.fasterxml.jackson.databind.I i0, m m0, com.fasterxml.jackson.databind.c c0, boolean z, m m1, m m2) throws o {
        Object object0;
        Class class0 = Map.Entry.class;
        com.fasterxml.jackson.annotation.n.d n$d0 = i0.s(class0);
        if(com.fasterxml.jackson.annotation.n.d.w(c0.l(null), n$d0).m() == c.e) {
            return null;
        }
        r r0 = new com.fasterxml.jackson.databind.ser.impl.h(m2, m1, m2, z, this.d(i0.r0(), m2), null);
        m m3 = ((com.fasterxml.jackson.databind.ser.impl.h)r0).R();
        com.fasterxml.jackson.annotation.u.b u$b0 = this.j(i0, c0, m3, class0);
        com.fasterxml.jackson.annotation.u.a u$a0 = u$b0 == null ? com.fasterxml.jackson.annotation.u.a.g : u$b0.g();
        if(u$a0 != com.fasterxml.jackson.annotation.u.a.g && u$a0 != com.fasterxml.jackson.annotation.u.a.a) {
            switch(u$a0) {
                case 1: {
                    object0 = com.fasterxml.jackson.databind.util.e.b(m3);
                    if(object0 != null && object0.getClass().isArray()) {
                        object0 = com.fasterxml.jackson.databind.util.c.b(object0);
                    }
                    return ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(object0, true);
                }
                case 2: {
                    return m3.s() ? ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(u.u, true) : ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(null, true);
                }
                case 3: {
                    return ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(u.u, true);
                }
                case 4: {
                    object0 = i0.B0(null, u$b0.f());
                    return object0 == null ? ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(object0, true) : ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(object0, i0.C0(object0));
                }
                default: {
                    return ((com.fasterxml.jackson.databind.ser.impl.h)r0).c0(null, true);
                }
            }
        }
        return r0;
    }

    protected r z(com.fasterxml.jackson.databind.I i0, com.fasterxml.jackson.databind.type.j j0, com.fasterxml.jackson.databind.c c0, boolean z, r r0, com.fasterxml.jackson.databind.jsontype.j j1, r r1) throws o {
        Set set0 = null;
        if(c0.l(null).m() == c.e) {
            return null;
        }
        G g0 = i0.r0();
        r r2 = null;
        for(Object object0: this.A()) {
            r2 = ((t)object0).e(g0, j0, c0, r0, j1, r1);
            if(r2 != null) {
                break;
            }
        }
        if(r2 == null) {
            r2 = this.H(i0, j0, c0);
            if(r2 == null) {
                Object object1 = this.D(g0, c0);
                d d0 = c0.A();
                com.fasterxml.jackson.annotation.s.a s$a0 = g0.D(Map.class, d0);
                Set set1 = s$a0 == null ? null : s$a0.i();
                com.fasterxml.jackson.annotation.v.a v$a0 = g0.H(Map.class, c0.A());
                if(v$a0 != null) {
                    set0 = v$a0.f();
                }
                r2 = this.h(i0, c0, u.g0(set1, set0, j0, z, j1, r0, r1, object1));
            }
        }
        if(this.a.b()) {
            for(Object object2: this.a.e()) {
                r2 = ((i)object2).h(g0, j0, c0, r2);
            }
        }
        return r2;
    }
}

