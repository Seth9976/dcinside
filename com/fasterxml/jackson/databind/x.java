package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.S;
import com.fasterxml.jackson.core.C;
import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.I;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.databind.cfg.a;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.deser.n;
import com.fasterxml.jackson.databind.introspect.B;
import com.fasterxml.jackson.databind.introspect.J;
import com.fasterxml.jackson.databind.introspect.M;
import com.fasterxml.jackson.databind.introspect.w;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.jsontype.i;
import com.fasterxml.jackson.databind.jsontype.impl.m;
import com.fasterxml.jackson.databind.jsontype.impl.p;
import com.fasterxml.jackson.databind.jsontype.impl.q;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.ser.s;
import com.fasterxml.jackson.databind.util.D;
import com.fasterxml.jackson.databind.util.h;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.TWR;

public class x extends u implements I, Serializable {
    static class c {
        static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            c.a = arr_v;
            try {
                arr_v[e.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[e.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[e.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[e.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[e.a.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static class d extends q implements Serializable {
        protected final e h;
        protected final com.fasterxml.jackson.databind.jsontype.d i;
        private static final long j = 1L;

        protected d(d x$d0, Class class0) {
            super(x$d0, class0);
            this.h = x$d0.h;
            this.i = x$d0.i;
        }

        @Deprecated
        public d(e x$e0) {
            this(x$e0, m.d);
        }

        public d(e x$e0, com.fasterxml.jackson.databind.jsontype.d d0) {
            this.h = (e)d.H(x$e0, "Can not pass `null` DefaultTyping");
            this.i = (com.fasterxml.jackson.databind.jsontype.d)d.H(d0, "Can not pass `null` PolymorphicTypeValidator");
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.impl.q
        public com.fasterxml.jackson.databind.jsontype.d B(t t0) {
            return this.i;
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.impl.q
        public q F(Class class0) {
            return this.K(class0);
        }

        private static Object H(Object object0, String s) {
            if(object0 == null) {
                throw new NullPointerException(s);
            }
            return object0;
        }

        public static d I(e x$e0, com.fasterxml.jackson.databind.jsontype.d d0) {
            return new d(x$e0, d0);
        }

        public boolean J(com.fasterxml.jackson.databind.m m0) {
            if(m0.isPrimitive()) {
                return false;
            }
            Class class0 = G.class;
        alab1:
            switch(this.h) {
                case 1: {
                    while(true) {
                        if(!m0.l()) {
                            break alab1;
                        }
                        m0 = m0.E();
                    }
                }
                case 2: {
                    break;
                }
                case 3: {
                    while(m0.l()) {
                        m0 = m0.E();
                    }
                    while(m0.s()) {
                        m0 = m0.O();
                    }
                    return !m0.q() && !class0.isAssignableFrom(m0.g());
                }
                case 4: {
                    while(m0.l()) {
                        m0 = m0.E();
                    }
                    while(m0.s()) {
                        m0 = m0.O();
                    }
                    return !m0.q() && !class0.isAssignableFrom(m0.g()) || m0.p();
                }
                case 5: {
                    return true;
                }
                default: {
                    return m0.Y();
                }
            }
            while(m0.s()) {
                m0 = m0.O();
            }
            return m0.Y() || !m0.n() && !class0.isAssignableFrom(m0.g());
        }

        public d K(Class class0) {
            if(this.f == class0) {
                return this;
            }
            h.B0(d.class, this, "withDefaultImpl");
            return new d(this, class0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.fasterxml.jackson.databind.jsontype.impl.q
        public f c(g g0, com.fasterxml.jackson.databind.m m0, Collection collection0) {
            return this.J(m0) ? super.c(g0, m0, collection0) : null;
        }

        // 去混淆评级： 低(20)
        @Override  // com.fasterxml.jackson.databind.jsontype.impl.q
        public j g(com.fasterxml.jackson.databind.G g0, com.fasterxml.jackson.databind.m m0, Collection collection0) {
            return this.J(m0) ? super.g(g0, m0, collection0) : null;
        }

        @Override  // com.fasterxml.jackson.databind.jsontype.impl.q
        public i j(Class class0) {
            return this.K(class0);
        }
    }

    public static enum e {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        NON_FINAL_AND_ENUMS,
        EVERYTHING;

    }

    protected final com.fasterxml.jackson.core.h a;
    protected com.fasterxml.jackson.databind.type.q b;
    protected l c;
    protected com.fasterxml.jackson.databind.jsontype.e d;
    protected final com.fasterxml.jackson.databind.cfg.i e;
    protected final com.fasterxml.jackson.databind.cfg.e f;
    protected J g;
    protected com.fasterxml.jackson.databind.G h;
    protected com.fasterxml.jackson.databind.ser.l i;
    protected s j;
    protected g k;
    protected n l;
    protected Set m;
    protected final ConcurrentHashMap n;
    private static final long o = 2L;
    protected static final b p;
    protected static final a q;

    static {
        B b0 = new B();
        x.p = b0;
        com.fasterxml.jackson.databind.type.q q0 = com.fasterxml.jackson.databind.type.q.j0();
        Locale locale0 = Locale.getDefault();
        com.fasterxml.jackson.databind.introspect.z.c z$c0 = new com.fasterxml.jackson.databind.introspect.z.c();
        x.q = new a(null, b0, null, q0, null, com.fasterxml.jackson.databind.util.G.q, null, locale0, null, com.fasterxml.jackson.core.b.a(), m.d, z$c0, com.fasterxml.jackson.databind.cfg.n.c());
    }

    public x() {
        this(null, null, null);
    }

    public x(com.fasterxml.jackson.core.h h0) {
        this(h0, null, null);
    }

    public x(com.fasterxml.jackson.core.h h0, com.fasterxml.jackson.databind.ser.l l0, n n0) {
        this.n = new ConcurrentHashMap(0x40, 0.6f, 2);
        if(h0 == null) {
            this.a = new v(this);
        }
        else {
            this.a = h0;
            if(h0.S0() == null) {
                h0.d1(this);
            }
        }
        this.d = new p();
        D d0 = new D();
        this.b = com.fasterxml.jackson.databind.type.q.j0();
        J j0 = new J(null);
        this.g = j0;
        w w0 = this.P0();
        a a0 = x.q.A(w0);
        com.fasterxml.jackson.databind.cfg.i i0 = new com.fasterxml.jackson.databind.cfg.i();
        this.e = i0;
        com.fasterxml.jackson.databind.cfg.e e0 = new com.fasterxml.jackson.databind.cfg.e();
        this.f = e0;
        this.h = new com.fasterxml.jackson.databind.G(a0, this.d, j0, d0, i0, com.fasterxml.jackson.databind.cfg.m.c());
        this.k = new g(a0, this.d, j0, d0, i0, e0, com.fasterxml.jackson.databind.cfg.m.c());
        com.fasterxml.jackson.databind.t t0 = com.fasterxml.jackson.databind.t.w;
        if(this.h.a0(t0)) {
            this.k0(t0, false);
        }
        com.fasterxml.jackson.databind.ser.l l1 = l0 == null ? new com.fasterxml.jackson.databind.ser.l.a() : l0;
        this.i = l1;
        n n1 = n0 == null ? new com.fasterxml.jackson.databind.deser.n.a(com.fasterxml.jackson.databind.deser.g.l) : n0;
        this.l = n1;
        this.j = com.fasterxml.jackson.databind.ser.h.e;
    }

    protected x(x x0) {
        this(x0, null);
    }

    protected x(x x0, com.fasterxml.jackson.core.h h0) {
        this.n = new ConcurrentHashMap(0x40, 0.6f, 2);
        if(h0 == null) {
            h0 = x0.a.A0();
        }
        this.a = h0;
        h0.d1(this);
        this.d = x0.d.g();
        this.b = x0.b;
        this.c = x0.c;
        com.fasterxml.jackson.databind.cfg.i i0 = x0.e.b();
        this.e = i0;
        com.fasterxml.jackson.databind.cfg.e e0 = x0.f.c();
        this.f = e0;
        this.g = x0.g.d();
        D d0 = new D();
        this.h = new com.fasterxml.jackson.databind.G(x0.h, this.d, this.g, d0, i0);
        this.k = new g(x0.k, this.d, this.g, d0, i0, e0);
        this.i = x0.i.Z0();
        this.l = x0.l.t1();
        this.j = x0.j;
        Set set0 = x0.m;
        if(set0 == null) {
            this.m = null;
            return;
        }
        this.m = new LinkedHashSet(set0);
    }

    protected y A(g g0) {
        return new y(this, g0);
    }

    public k A0(OutputStream outputStream0, com.fasterxml.jackson.core.g g0) throws IOException {
        this.r("out", outputStream0);
        k k0 = this.a.o(outputStream0, g0);
        this.h.i1(k0);
        return k0;
    }

    public com.fasterxml.jackson.databind.I A1() {
        return this.I(this.h);
    }

    public com.fasterxml.jackson.databind.u A2(com.fasterxml.jackson.core.n n0, Class class0) throws IOException {
        return this.z2(n0, this.b.f0(class0));
    }

    public x A3(Locale locale0) {
        this.k = (g)this.k.H0(locale0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.H0(locale0);
        return this;
    }

    protected y B(g g0, com.fasterxml.jackson.databind.m m0, Object object0, com.fasterxml.jackson.core.e e0, l l0) {
        return new y(this, g0, m0, object0, e0, l0);
    }

    public k B0(Writer writer0) throws IOException {
        this.r("w", writer0);
        k k0 = this.a.p(writer0);
        this.h.i1(k0);
        return k0;
    }

    public com.fasterxml.jackson.databind.jsontype.e B1() {
        return this.d;
    }

    public y B2() {
        return this.A(this.q1()).A1(this.c);
    }

    @Deprecated
    public void B3(Map map0) {
        this.E3(map0);
    }

    protected z C(com.fasterxml.jackson.databind.G g0) {
        return new z(this, g0);
    }

    public com.fasterxml.jackson.core.n C0() throws IOException {
        return this.k.m1(this.a.q());
    }

    public com.fasterxml.jackson.databind.type.q C1() {
        return this.b;
    }

    public y C2(com.fasterxml.jackson.core.a a0) {
        return this.A(((g)this.q1().s0(a0)));
    }

    protected z D(com.fasterxml.jackson.databind.G g0, com.fasterxml.jackson.core.e e0) {
        return new z(this, g0, e0);
    }

    public com.fasterxml.jackson.databind.node.u D0() {
        return this.k.i1().y();
    }

    public M D1() {
        return this.h.K();
    }

    public y D2(com.fasterxml.jackson.core.e e0) {
        this.K(e0);
        return this.B(this.q1(), null, null, e0, this.c);
    }

    public x D3(com.fasterxml.jackson.databind.introspect.w.a w$a0) {
        J j0 = this.g.h(w$a0);
        if(j0 != this.g) {
            this.g = j0;
            this.k = new g(this.k, j0);
            this.h = new com.fasterxml.jackson.databind.G(this.h, j0);
        }
        return this;
    }

    protected z E(com.fasterxml.jackson.databind.G g0, com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.core.v v0) {
        return new z(this, g0, m0, v0);
    }

    public com.fasterxml.jackson.core.n E0(DataInput dataInput0) throws IOException {
        this.r("content", dataInput0);
        return this.k.m1(this.a.s(dataInput0));
    }

    public boolean E1(com.fasterxml.jackson.core.h.a h$a0) {
        return this.a.M(h$a0);
    }

    @Deprecated
    public y E2(com.fasterxml.jackson.core.type.b b0) {
        return this.B(this.q1(), this.b.e0(b0), null, null, this.c);
    }

    public x E3(Map map0) {
        this.g.g(map0);
        return this;
    }

    protected Object F(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.m m0) throws IOException {
        Object object0;
        try {
            g g0 = this.q1();
            n n1 = this.w0(n0, g0);
            r r0 = this.z(n0, m0);
            if(r0 == r.v) {
                object0 = this.y(n1, m0).c(n1);
            }
            else if(r0 != r.n && r0 != r.l) {
                object0 = n1.x1(n0, m0, this.y(n1, m0), null);
                n1.P();
            }
            else {
                object0 = null;
            }
            if(g0.t1(com.fasterxml.jackson.databind.i.q)) {
                this.J(n0, n1, m0);
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            if(n0 != null) {
                try {
                    n0.close();
                }
                catch(Throwable throwable2) {
                    throwable0.addSuppressed(throwable2);
                }
            }
            throw throwable1;
        }
    label_23:
        if(n0 != null) {
            n0.close();
        }
        return object0;
    }

    public com.fasterxml.jackson.core.n F0(File file0) throws IOException {
        this.r("src", file0);
        return this.k.m1(this.a.u(file0));
    }

    public boolean F1(com.fasterxml.jackson.core.k.b k$b0) {
        return this.h.k1(k$b0, this.a);
    }

    public y F2(com.fasterxml.jackson.databind.i i0) {
        return this.A(this.q1().x1(i0));
    }

    public x F3(com.fasterxml.jackson.databind.node.m m0) {
        this.k = this.k.C1(m0);
        return this;
    }

    protected com.fasterxml.jackson.databind.p G(com.fasterxml.jackson.core.n n0) throws IOException {
        com.fasterxml.jackson.databind.p p1;
        com.fasterxml.jackson.databind.p p0;
        g g0;
        try {
            com.fasterxml.jackson.databind.m m0 = this.p0(com.fasterxml.jackson.databind.p.class);
            g0 = this.q1();
            g0.m1(n0);
            r r0 = n0.Y();
            if(r0 != null) {
                goto label_7;
            }
            r0 = n0.m4();
            if(r0 != null) {
            label_7:
                n n1 = this.w0(n0, g0);
                p0 = r0 == r.v ? g0.i1().r() : ((com.fasterxml.jackson.databind.p)n1.x1(n0, m0, this.y(n1, m0), null));
                if(g0.t1(com.fasterxml.jackson.databind.i.q)) {
                    this.J(n0, n1, m0);
                }
                goto label_14;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            goto label_19;
        }
    label_14:
        n0.close();
        return p0;
        try {
        label_16:
            p1 = g0.i1().q();
        }
        catch(Throwable throwable0) {
        label_19:
            TWR.safeClose$NT(n0, throwable0);
            throw throwable0;
        }
        n0.close();
        return p1;
    }

    public com.fasterxml.jackson.core.n G0(InputStream inputStream0) throws IOException {
        this.r("in", inputStream0);
        return this.k.m1(this.a.w(inputStream0));
    }

    public boolean G1(com.fasterxml.jackson.core.n.a n$a0) {
        return this.k.s1(n$a0, this.a);
    }

    public y G2(com.fasterxml.jackson.databind.i i0, com.fasterxml.jackson.databind.i[] arr_i) {
        return this.A(this.q1().y1(i0, arr_i));
    }

    public x G3(com.fasterxml.jackson.databind.jsontype.d d0) {
        a a0 = this.k.f1().s(d0);
        this.k = this.k.X0(a0);
        return this;
    }

    protected Object H(g g0, com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.m m0) throws IOException {
        Object object0;
        r r0 = this.z(n0, m0);
        n n1 = this.w0(n0, g0);
        if(r0 == r.v) {
            object0 = this.y(n1, m0).c(n1);
        }
        else {
            object0 = r0 == r.n || r0 == r.l ? null : n1.x1(n0, m0, this.y(n1, m0), null);
        }
        n0.L();
        if(g0.t1(com.fasterxml.jackson.databind.i.q)) {
            this.J(n0, n1, m0);
        }
        return object0;
    }

    public com.fasterxml.jackson.core.n H0(Reader reader0) throws IOException {
        this.r("r", reader0);
        return this.k.m1(this.a.x(reader0));
    }

    public boolean H1(com.fasterxml.jackson.core.z z0) {
        return this.G1(z0.f());
    }

    public y H2(l l0) {
        return this.B(this.q1(), null, null, null, l0);
    }

    @Deprecated
    public x H3(com.fasterxml.jackson.annotation.u.b u$b0) {
        return this.r3(u$b0);
    }

    protected com.fasterxml.jackson.databind.ser.l I(com.fasterxml.jackson.databind.G g0) {
        return this.i.a1(g0, this.j);
    }

    public com.fasterxml.jackson.core.n I0(String s) throws IOException {
        this.r("content", s);
        return this.k.m1(this.a.y(s));
    }

    public boolean I1(C c0) {
        return this.F1(c0.f());
    }

    public x I3(com.fasterxml.jackson.databind.D d0) {
        this.h = (com.fasterxml.jackson.databind.G)this.h.v0(d0);
        this.k = (g)this.k.v0(d0);
        return this;
    }

    protected final void J(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, com.fasterxml.jackson.databind.m m0) throws IOException {
        r r0 = n0.m4();
        if(r0 != null) {
            h0.f1(h.r0(m0), n0, r0);
        }
    }

    public com.fasterxml.jackson.core.n J0(URL uRL0) throws IOException {
        this.r("src", uRL0);
        return this.k.m1(this.a.z(uRL0));
    }

    public boolean J1(com.fasterxml.jackson.databind.i i0) {
        return this.k.t1(i0);
    }

    @Deprecated
    public y J2(com.fasterxml.jackson.databind.m m0) {
        return this.B(this.q1(), m0, null, null, this.c);
    }

    public x J3(com.fasterxml.jackson.annotation.u.a u$a0) {
        this.H3(com.fasterxml.jackson.annotation.u.b.b(u$a0, u$a0));
        return this;
    }

    protected void K(com.fasterxml.jackson.core.e e0) {
        if(e0 != null && !this.a.j(e0)) {
            throw new IllegalArgumentException("Cannot use FormatSchema of type " + e0.getClass().getName() + " for format " + "JSON");
        }
    }

    public com.fasterxml.jackson.core.n K0(byte[] arr_b) throws IOException {
        this.r("content", arr_b);
        return this.k.m1(this.a.A(arr_b));
    }

    public boolean K1(com.fasterxml.jackson.databind.t t0) {
        return this.h.a0(t0);
    }

    public y K2(com.fasterxml.jackson.databind.cfg.k k0) {
        return this.A(this.q1().A1(k0));
    }

    public x K3(s s0) {
        this.j = s0;
        return this;
    }

    private final void L(k k0, Object object0, com.fasterxml.jackson.databind.G g0) throws IOException {
        Closeable closeable0 = (Closeable)object0;
        try {
            this.I(g0).g1(k0, object0);
        }
        catch(Exception exception0) {
            h.l(k0, closeable0, exception0);
            return;
        }
        try {
            closeable0.close();
        }
        catch(Exception exception0) {
            closeable0 = null;
            h.l(k0, closeable0, exception0);
            return;
        }
        k0.close();
    }

    public com.fasterxml.jackson.core.n L0(byte[] arr_b, int v, int v1) throws IOException {
        this.r("content", arr_b);
        return this.k.m1(this.a.B(arr_b, v, v1));
    }

    public boolean L1(H h0) {
        return this.h.l1(h0);
    }

    public y L2(com.fasterxml.jackson.databind.node.m m0) {
        this.r("nodeFactory", m0);
        return this.A(this.q1()).D1(m0);
    }

    public x L3(com.fasterxml.jackson.databind.ser.l l0) {
        this.i = l0;
        return this;
    }

    private final void M(k k0, Object object0, com.fasterxml.jackson.databind.G g0) throws IOException {
        try {
            this.I(g0).g1(k0, object0);
            if(g0.l1(H.k)) {
                k0.flush();
            }
        }
        catch(Exception exception0) {
            h.l(null, ((Closeable)object0), exception0);
            return;
        }
        ((Closeable)object0).close();
    }

    public com.fasterxml.jackson.core.n M0(char[] arr_c) throws IOException {
        this.r("content", arr_c);
        return this.k.m1(this.a.C(arr_c));
    }

    public com.fasterxml.jackson.databind.p M1() {
        return this.k.i1().q();
    }

    @Deprecated
    public y M2(Class class0) {
        return this.B(this.q1(), this.b.f0(class0), null, null, this.c);
    }

    public x M3(com.fasterxml.jackson.databind.jsontype.e e0) {
        this.d = e0;
        this.k = this.k.B1(e0);
        this.h = this.h.r1(e0);
        return this;
    }

    protected final void N(k k0, Object object0) throws IOException {
        com.fasterxml.jackson.databind.G g0 = this.x1();
        if(g0.l1(H.j) && object0 instanceof Closeable) {
            this.L(k0, object0, g0);
            return;
        }
        try {
            this.I(g0).g1(k0, object0);
        }
        catch(Exception exception0) {
            h.m(k0, exception0);
            return;
        }
        k0.close();
    }

    public com.fasterxml.jackson.core.n N0(char[] arr_c, int v, int v1) throws IOException {
        this.r("content", arr_c);
        return this.k.m1(this.a.D(arr_c, v, v1));
    }

    public int N1() {
        return this.g.f();
    }

    public y N2(com.fasterxml.jackson.core.type.b b0) {
        this.r("type", b0);
        return this.B(this.q1(), this.b.e0(b0), null, null, this.c);
    }

    public x N3(TimeZone timeZone0) {
        this.k = (g)this.k.I0(timeZone0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.I0(timeZone0);
        return this;
    }

    public void O(com.fasterxml.jackson.databind.m m0, com.fasterxml.jackson.databind.jsonFormatVisitors.g g0) throws o {
        if(m0 == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        this.I(this.x1()).X0(m0, g0);
    }

    public x O0() {
        return this.u3(null);
    }

    public com.fasterxml.jackson.databind.p O1() {
        return this.k.i1().r();
    }

    public y O2(com.fasterxml.jackson.databind.m m0) {
        return this.B(this.q1(), m0, null, null, this.c);
    }

    public x O3(com.fasterxml.jackson.databind.type.q q0) {
        this.b = q0;
        this.k = (g)this.k.F0(q0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.F0(q0);
        return this;
    }

    public void P(Class class0, com.fasterxml.jackson.databind.jsonFormatVisitors.g g0) throws o {
        this.O(this.b.f0(class0), g0);
    }

    protected w P0() {
        return new com.fasterxml.jackson.databind.introspect.u();
    }

    public com.fasterxml.jackson.databind.p P1(File file0) throws IOException {
        this.r("file", file0);
        return this.G(this.a.u(file0));
    }

    public y P2(Class class0) {
        return class0 == null ? this.B(this.q1(), null, null, null, this.c) : this.B(this.q1(), this.b.f0(class0), null, null, this.c);
    }

    public x P3(S s0, com.fasterxml.jackson.annotation.h.c h$c0) {
        M m0 = this.e.j().g(s0, h$c0);
        this.e.o(m0);
        return this;
    }

    public x Q(com.fasterxml.jackson.databind.jsontype.d d0) {
        return this.R(d0, e.b);
    }

    public x Q0(com.fasterxml.jackson.databind.i i0) {
        this.k = this.k.M1(i0);
        return this;
    }

    public com.fasterxml.jackson.databind.p Q1(InputStream inputStream0) throws IOException {
        this.r("in", inputStream0);
        return this.G(this.a.w(inputStream0));
    }

    public y Q2(Class class0) {
        this.r("type", class0);
        return this.B(this.q1(), this.b.E(class0), null, null, this.c);
    }

    public x Q3(M m0) {
        this.e.o(m0);
        return this;
    }

    public x R(com.fasterxml.jackson.databind.jsontype.d d0, e x$e0) {
        return this.S(d0, x$e0, com.fasterxml.jackson.annotation.H.a.c);
    }

    public x R0(com.fasterxml.jackson.databind.i i0, com.fasterxml.jackson.databind.i[] arr_i) {
        this.k = this.k.N1(i0, arr_i);
        return this;
    }

    public com.fasterxml.jackson.databind.p R1(Reader reader0) throws IOException {
        this.r("r", reader0);
        return this.G(this.a.x(reader0));
    }

    public y R2(Class class0) {
        this.r("type", class0);
        return this.B(this.q1(), this.b.I(List.class, class0), null, null, this.c);
    }

    @Deprecated
    public void R3(M m0) {
        this.Q3(m0);
    }

    public x S(com.fasterxml.jackson.databind.jsontype.d d0, e x$e0, com.fasterxml.jackson.annotation.H.a h$a0) {
        if(h$a0 == com.fasterxml.jackson.annotation.H.a.d) {
            throw new IllegalArgumentException("Cannot use includeAs of " + h$a0);
        }
        return this.u3(this.w(x$e0, d0).b(com.fasterxml.jackson.annotation.H.d.d(com.fasterxml.jackson.annotation.H.b.c, h$a0, null, null, false, null)));
    }

    public x S0(H h0) {
        this.h = this.h.D1(h0);
        return this;
    }

    public com.fasterxml.jackson.databind.p S1(String s) throws com.fasterxml.jackson.core.p, o {
        this.r("content", s);
        try {
            return this.G(this.a.y(s));
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public y S2(Class class0) {
        this.r("type", class0);
        return this.B(this.q1(), this.b.O(Map.class, String.class, class0), null, null, this.c);
    }

    public x T(com.fasterxml.jackson.databind.jsontype.d d0, e x$e0, String s) {
        return this.u3(this.w(x$e0, d0).b(com.fasterxml.jackson.annotation.H.d.d(com.fasterxml.jackson.annotation.H.b.c, com.fasterxml.jackson.annotation.H.a.a, s, null, false, null)));
    }

    public x T0(H h0, H[] arr_h) {
        this.h = this.h.E1(h0, arr_h);
        return this;
    }

    public com.fasterxml.jackson.databind.p T1(URL uRL0) throws IOException {
        this.r("source", uRL0);
        return this.G(this.a.z(uRL0));
    }

    public y T2(Object object0) {
        return object0 == null ? this.B(this.q1(), null, null, null, this.c) : this.B(this.q1(), this.b.f0(object0.getClass()), object0, null, this.c);
    }

    public com.fasterxml.jackson.core.h T3() {
        return this.a;
    }

    public x U(com.fasterxml.jackson.databind.deser.o o0) {
        this.k = this.k.G1(o0);
        return this;
    }

    public x U0(com.fasterxml.jackson.core.k.b[] arr_k$b) {
        for(int v = 0; v < arr_k$b.length; ++v) {
            this.a.M0(arr_k$b[v]);
        }
        return this;
    }

    public com.fasterxml.jackson.databind.p U1(byte[] arr_b) throws IOException {
        this.r("content", arr_b);
        return this.G(this.a.A(arr_b));
    }

    public y U2(Class class0) {
        return this.A(this.q1().J1(class0));
    }

    public Object U3(G g0, com.fasterxml.jackson.core.type.b b0) throws IllegalArgumentException, com.fasterxml.jackson.core.p {
        return this.V3(g0, this.o0(b0));
    }

    public x V(Class class0, Class class1) {
        this.g.c(class0, class1);
        return this;
    }

    public x V0(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        for(int v = 0; v < arr_n$a.length; ++v) {
            this.a.N0(arr_n$a[v]);
        }
        return this;
    }

    public com.fasterxml.jackson.databind.p V1(byte[] arr_b, int v, int v1) throws IOException {
        this.r("content", arr_b);
        return this.G(this.a.B(arr_b, v, v1));
    }

    public x V2(com.fasterxml.jackson.databind.w w0) {
        class com.fasterxml.jackson.databind.x.a implements com.fasterxml.jackson.databind.w.a {
            final x a;

            @Override  // com.fasterxml.jackson.databind.w$a
            public void A0(com.fasterxml.jackson.databind.ser.i i0) {
                x.this.j = x.this.j.g(i0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void B0(Collection collection0) {
                x.this.Y2(collection0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public boolean C0(com.fasterxml.jackson.core.k.b k$b0) {
                return x.this.F1(k$b0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void D0(com.fasterxml.jackson.databind.deser.h h0) {
                com.fasterxml.jackson.databind.deser.q q0 = x.this.l.c.s(h0);
                x.this.l = x.this.l.z1(q0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void E0(com.fasterxml.jackson.databind.D d0) {
                x.this.I3(d0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public boolean F0(com.fasterxml.jackson.core.n.a n$a0) {
                return x.this.G1(n$a0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public u e0() {
                return x.this;
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void f0(com.fasterxml.jackson.databind.a a0) {
                com.fasterxml.jackson.databind.deser.q q0 = x.this.l.c.p(a0);
                x.this.l = x.this.l.z1(q0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void g0(com.fasterxml.jackson.databind.ser.t t0) {
                x.this.j = x.this.j.f(t0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void h0(com.fasterxml.jackson.databind.deser.s s0) {
                com.fasterxml.jackson.databind.deser.q q0 = x.this.l.c.q(s0);
                x.this.l = x.this.l.z1(q0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public com.fasterxml.jackson.core.H i0() {
                return x.this.version();
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void j0(com.fasterxml.jackson.databind.deser.C c0) {
                com.fasterxml.jackson.databind.deser.q q0 = x.this.l.c.u(c0);
                x.this.l = x.this.l.z1(q0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void k0(com.fasterxml.jackson.databind.type.r r0) {
                com.fasterxml.jackson.databind.type.q q0 = x.this.b.z0(r0);
                x.this.O3(q0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void l0(Class[] arr_class) {
                x.this.a3(arr_class);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public com.fasterxml.jackson.databind.cfg.w m0(Class class0) {
                return x.this.g0(class0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void n0(b b0) {
                x.this.k = (g)x.this.k.O0(b0);
                x.this.h = (com.fasterxml.jackson.databind.G)x.this.h.O0(b0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public boolean o0(com.fasterxml.jackson.databind.t t0) {
                return x.this.K1(t0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void p0(w w0) {
                x.this.k = (g)x.this.k.C0(w0);
                x.this.h = (com.fasterxml.jackson.databind.G)x.this.h.C0(w0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public com.fasterxml.jackson.databind.type.q q0() {
                return x.this.b;
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void r0(com.fasterxml.jackson.databind.deser.t t0) {
                com.fasterxml.jackson.databind.deser.q q0 = x.this.l.c.r(t0);
                x.this.l = x.this.l.z1(q0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void s0(com.fasterxml.jackson.databind.jsontype.c[] arr_c) {
                x.this.Z2(arr_c);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void t0(com.fasterxml.jackson.databind.ser.t t0) {
                x.this.j = x.this.j.e(t0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void u0(com.fasterxml.jackson.databind.deser.o o0) {
                x.this.U(o0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void v0(b b0) {
                x.this.k = (g)x.this.k.K0(b0);
                x.this.h = (com.fasterxml.jackson.databind.G)x.this.h.K0(b0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public boolean w0(com.fasterxml.jackson.core.h.a h$a0) {
                return x.this.E1(h$a0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public boolean x0(com.fasterxml.jackson.databind.i i0) {
                return x.this.J1(i0);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public void y0(Class class0, Class class1) {
                x.this.V(class0, class1);
            }

            @Override  // com.fasterxml.jackson.databind.w$a
            public boolean z0(H h0) {
                return x.this.L1(h0);
            }
        }

        this.r("module", w0);
        if(w0.b() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if(w0.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        for(Object object0: w0.a()) {
            this.V2(((com.fasterxml.jackson.databind.w)object0));
        }
        if(this.K1(com.fasterxml.jackson.databind.t.G)) {
            Object object1 = w0.c();
            if(object1 != null) {
                if(this.m == null) {
                    this.m = new LinkedHashSet();
                }
                if(!this.m.add(object1)) {
                    return this;
                }
            }
        }
        w0.d(new com.fasterxml.jackson.databind.x.a(this));
        return this;
    }

    public Object V3(G g0, com.fasterxml.jackson.databind.m m0) throws IllegalArgumentException, com.fasterxml.jackson.core.p {
        if(g0 == null) {
            return null;
        }
        try {
            if(m0.a0(G.class) && m0.b0(g0.getClass())) {
                return g0;
            }
            if(g0.h() == r.p && g0 instanceof com.fasterxml.jackson.databind.node.v) {
                Object object0 = ((com.fasterxml.jackson.databind.node.v)g0).f2();
                return object0 != null && !m0.b0(object0.getClass()) ? this.W1(this.f(g0), m0) : object0;
            }
            return this.W1(this.f(g0), m0);
        }
        catch(com.fasterxml.jackson.core.p p0) {
        }
        catch(IOException iOException0) {
            throw new IllegalArgumentException(iOException0.getMessage(), iOException0);
        }
        throw p0;
    }

    @Deprecated
    public final void W(Class class0, Class class1) {
        this.V(class0, class1);
    }

    @Deprecated
    public x W0(com.fasterxml.jackson.databind.t[] arr_t) {
        this.k = (g)this.k.T0(arr_t);
        this.h = (com.fasterxml.jackson.databind.G)this.h.T0(arr_t);
        return this;
    }

    public Object W1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("p", n0);
        return this.H(this.q1(), n0, m0);
    }

    public x W2(Iterable iterable0) {
        this.r("modules", iterable0);
        for(Object object0: iterable0) {
            this.V2(((com.fasterxml.jackson.databind.w)object0));
        }
        return this;
    }

    public Object W3(Object object0, Object object1) throws o {
        if(object0 != null && object1 != null) {
            com.fasterxml.jackson.databind.ser.l l0 = this.I(this.x1().D1(H.c));
            com.fasterxml.jackson.databind.util.H h0 = l0.R(this);
            if(this.J1(com.fasterxml.jackson.databind.i.c)) {
                h0 = h0.h5(true);
            }
            try {
                l0.g1(h0, object1);
                com.fasterxml.jackson.core.n n0 = h0.a5();
                object0 = this.T2(object0).L0(n0);
                n0.close();
                return object0;
            }
            catch(IOException iOException0) {
                throw iOException0 instanceof o ? ((o)iOException0) : o.u(iOException0);
            }
        }
        return object0;
    }

    public boolean X(com.fasterxml.jackson.databind.m m0) {
        return this.w0(null, this.q1()).F0(m0, null);
    }

    @Deprecated
    public x X0() {
        return this.u3(null);
    }

    public Object X1(DataInput dataInput0, com.fasterxml.jackson.databind.m m0) throws IOException {
        this.r("src", dataInput0);
        return this.F(this.a.s(dataInput0), m0);
    }

    public x X2(com.fasterxml.jackson.databind.w[] arr_w) {
        for(int v = 0; v < arr_w.length; ++v) {
            this.V2(arr_w[v]);
        }
        return this;
    }

    public com.fasterxml.jackson.databind.p X3(Object object0) throws IllegalArgumentException {
        if(object0 == null) {
            return this.t1().r();
        }
        com.fasterxml.jackson.databind.ser.l l0 = this.I(this.x1());
        com.fasterxml.jackson.databind.util.H h0 = l0.R(this);
        if(this.J1(com.fasterxml.jackson.databind.i.c)) {
            h0 = h0.h5(true);
        }
        try {
            l0.g1(h0, object0);
            try(com.fasterxml.jackson.core.n n0 = h0.a5()) {
                return (com.fasterxml.jackson.databind.p)this.e(n0);
            }
        }
        catch(IOException iOException0) {
            throw new IllegalArgumentException(iOException0.getMessage(), iOException0);
        }
    }

    public boolean Y(com.fasterxml.jackson.databind.m m0, AtomicReference atomicReference0) {
        return this.w0(null, this.q1()).F0(m0, atomicReference0);
    }

    public x Y0(com.fasterxml.jackson.databind.i i0) {
        this.k = this.k.x1(i0);
        return this;
    }

    public Object Y1(DataInput dataInput0, Class class0) throws IOException {
        this.r("src", dataInput0);
        return this.F(this.a.s(dataInput0), this.b.f0(class0));
    }

    public void Y2(Collection collection0) {
        this.B1().h(collection0);
    }

    public void Y3(k k0, com.fasterxml.jackson.databind.p p0) throws IOException {
        this.r("g", k0);
        com.fasterxml.jackson.databind.G g0 = this.x1();
        this.I(g0).g1(k0, p0);
        if(g0.l1(H.k)) {
            k0.flush();
        }
    }

    public boolean Z(Class class0) {
        return this.I(this.x1()).e1(class0, null);
    }

    public x Z0(com.fasterxml.jackson.databind.i i0, com.fasterxml.jackson.databind.i[] arr_i) {
        this.k = this.k.y1(i0, arr_i);
        return this;
    }

    public Object Z1(File file0, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", file0);
        return this.F(this.a.u(file0), this.b.e0(b0));
    }

    public void Z2(com.fasterxml.jackson.databind.jsontype.c[] arr_c) {
        this.B1().i(arr_c);
    }

    public void Z3(DataOutput dataOutput0, Object object0) throws IOException {
        this.N(this.x0(dataOutput0), object0);
    }

    @Override  // com.fasterxml.jackson.core.u
    public G a() {
        return this.v0();
    }

    public boolean a0(Class class0, AtomicReference atomicReference0) {
        return this.I(this.x1()).e1(class0, atomicReference0);
    }

    public x a1(H h0) {
        this.h = this.h.o1(h0);
        return this;
    }

    public Object a2(File file0, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", file0);
        return this.F(this.a.u(file0), m0);
    }

    public void a3(Class[] arr_class) {
        this.B1().j(arr_class);
    }

    public void a4(File file0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.N(this.y0(file0, com.fasterxml.jackson.core.g.d), object0);
    }

    @Override  // com.fasterxml.jackson.core.u
    public G b() {
        return this.D0();
    }

    public x b0() {
        this.k = this.k.H1();
        return this;
    }

    public Object b2(File file0, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", file0);
        return this.F(this.a.u(file0), this.b.f0(class0));
    }

    private static ServiceLoader b3(Class class0, ClassLoader classLoader0) {
        static final class com.fasterxml.jackson.databind.x.b implements PrivilegedAction {
            final ClassLoader a;
            final Class b;

            com.fasterxml.jackson.databind.x.b(ClassLoader classLoader0, Class class0) {
                this.a = classLoader0;
                this.b = class0;
                super();
            }

            public ServiceLoader a() {
                return this.a == null ? ServiceLoader.load(this.b) : ServiceLoader.load(this.b, this.a);
            }

            @Override
            public Object run() {
                return this.a();
            }
        }

        if(System.getSecurityManager() == null) {
            return classLoader0 == null ? ServiceLoader.load(class0) : ServiceLoader.load(class0, classLoader0);
        }
        return (ServiceLoader)AccessController.doPrivileged(new com.fasterxml.jackson.databind.x.b(classLoader0, class0));
    }

    public void b4(OutputStream outputStream0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.N(this.A0(outputStream0, com.fasterxml.jackson.core.g.d), object0);
    }

    @Override  // com.fasterxml.jackson.core.F
    public G c() {
        return this.M1();
    }

    public com.fasterxml.jackson.databind.cfg.v c0() {
        return this.f.d();
    }

    public x c1(H h0, H[] arr_h) {
        this.h = this.h.p1(h0, arr_h);
        return this;
    }

    public Object c2(InputStream inputStream0, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", inputStream0);
        return this.F(this.a.w(inputStream0), this.b.e0(b0));
    }

    public x c3(com.fasterxml.jackson.databind.introspect.a.b a$b0) {
        this.h = (com.fasterxml.jackson.databind.G)this.h.B0(a$b0);
        this.k = (g)this.k.B0(a$b0);
        return this;
    }

    public void c4(Writer writer0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.N(this.B0(writer0), object0);
    }

    @Override  // com.fasterxml.jackson.core.F
    public G d() {
        return this.O1();
    }

    public x d1(com.fasterxml.jackson.core.k.b[] arr_k$b) {
        for(int v = 0; v < arr_k$b.length; ++v) {
            this.a.P0(arr_k$b[v]);
        }
        return this;
    }

    public x d3(b b0) {
        this.h = (com.fasterxml.jackson.databind.G)this.h.t0(b0);
        this.k = (g)this.k.t0(b0);
        return this;
    }

    public byte[] d4(Object object0) throws com.fasterxml.jackson.core.p {
        try {
            com.fasterxml.jackson.core.util.c c0 = new com.fasterxml.jackson.core.util.c(this.a.r0());
            this.N(this.A0(c0, com.fasterxml.jackson.core.g.d), object0);
            c0.release();
            return new byte[0];
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    @Override  // com.fasterxml.jackson.core.u
    public G e(com.fasterxml.jackson.core.n n0) throws IOException {
        this.r("p", n0);
        g g0 = this.q1();
        if(n0.Y() == null && n0.m4() == null) {
            return null;
        }
        G g1 = (com.fasterxml.jackson.databind.p)this.H(g0, n0, this.p0(com.fasterxml.jackson.databind.p.class));
        return g1 == null ? this.t1().r() : g1;
    }

    public com.fasterxml.jackson.databind.cfg.v e0(com.fasterxml.jackson.databind.type.h h0) {
        return this.f.g(h0);
    }

    public x e1(com.fasterxml.jackson.core.n.a[] arr_n$a) {
        for(int v = 0; v < arr_n$a.length; ++v) {
            this.a.Q0(arr_n$a[v]);
        }
        return this;
    }

    public Object e2(InputStream inputStream0, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", inputStream0);
        return this.F(this.a.w(inputStream0), m0);
    }

    public x e3(b b0, b b1) {
        this.h = (com.fasterxml.jackson.databind.G)this.h.t0(b0);
        this.k = (g)this.k.t0(b1);
        return this;
    }

    public String e4(Object object0) throws com.fasterxml.jackson.core.p {
        com.fasterxml.jackson.core.io.p p0 = new com.fasterxml.jackson.core.io.p(this.a.r0());
        try {
            this.N(this.B0(p0), object0);
            return p0.a();
        }
        catch(com.fasterxml.jackson.core.p p1) {
            throw p1;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    @Override  // com.fasterxml.jackson.core.u
    public com.fasterxml.jackson.core.n f(G g0) {
        this.r("n", g0);
        return new com.fasterxml.jackson.databind.node.y(((com.fasterxml.jackson.databind.p)g0), this);
    }

    public com.fasterxml.jackson.databind.cfg.v f0(Class class0) {
        return this.f.h(class0);
    }

    @Deprecated
    public x f1(com.fasterxml.jackson.databind.t[] arr_t) {
        this.k = (g)this.k.J0(arr_t);
        this.h = (com.fasterxml.jackson.databind.G)this.h.J0(arr_t);
        return this;
    }

    public Object f2(InputStream inputStream0, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", inputStream0);
        return this.F(this.a.w(inputStream0), this.b.f0(class0));
    }

    public x f3(com.fasterxml.jackson.core.a a0) {
        this.h = (com.fasterxml.jackson.databind.G)this.h.s0(a0);
        this.k = (g)this.k.s0(a0);
        return this;
    }

    public z f4() {
        return this.C(this.x1());
    }

    @Override  // com.fasterxml.jackson.core.u
    public void g(k k0, G g0) throws IOException {
        this.r("g", k0);
        com.fasterxml.jackson.databind.G g1 = this.x1();
        this.I(g1).g1(k0, g0);
        if(g1.l1(H.k)) {
            k0.flush();
        }
    }

    public com.fasterxml.jackson.databind.cfg.w g0(Class class0) {
        return this.e.d(class0);
    }

    @Deprecated
    public x g1() {
        return this.Q(this.u1());
    }

    public x g3(com.fasterxml.jackson.databind.cfg.b b0) {
        this.r("cacheProvider", b0);
        this.k = (g)this.k.w0(b0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.w0(b0);
        this.l = this.l.A1(b0);
        this.i = this.i.j1(b0);
        this.b = this.b.x0(b0.t2());
        return this;
    }

    public z g4(com.fasterxml.jackson.core.a a0) {
        return this.C(((com.fasterxml.jackson.databind.G)this.x1().s0(a0)));
    }

    @Override  // com.fasterxml.jackson.core.u
    public com.fasterxml.jackson.core.h h() {
        return this.a;
    }

    public x h0(com.fasterxml.jackson.core.k.b k$b0, boolean z) {
        this.a.y0(k$b0, z);
        return this;
    }

    @Deprecated
    public x h1(e x$e0) {
        return this.i1(x$e0, com.fasterxml.jackson.annotation.H.a.c);
    }

    public Object h2(Reader reader0, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", reader0);
        return this.F(this.a.x(reader0), this.b.e0(b0));
    }

    public x h3(g g0) {
        this.r("config", g0);
        this.k = g0;
        return this;
    }

    public z h4(com.fasterxml.jackson.core.e e0) {
        this.K(e0);
        return this.D(this.x1(), e0);
    }

    public x i0(com.fasterxml.jackson.core.n.a n$a0, boolean z) {
        this.a.z0(n$a0, z);
        return this;
    }

    @Deprecated
    public x i1(e x$e0, com.fasterxml.jackson.annotation.H.a h$a0) {
        return this.S(this.u1(), x$e0, h$a0);
    }

    public Object i2(Reader reader0, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", reader0);
        return this.F(this.a.x(reader0), m0);
    }

    public x i3(com.fasterxml.jackson.databind.G g0) {
        this.r("config", g0);
        this.h = g0;
        return this;
    }

    public z i4(com.fasterxml.jackson.core.v v0) {
        if(v0 == null) {
            v0 = z.h;
        }
        return this.E(this.x1(), null, v0);
    }

    @Override  // com.fasterxml.jackson.core.u
    public final Object j(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.a a0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("p", n0);
        return this.H(this.q1(), n0, ((com.fasterxml.jackson.databind.m)a0));
    }

    public x j0(com.fasterxml.jackson.databind.i i0, boolean z) {
        this.k = z ? this.k.x1(i0) : this.k.M1(i0);
        return this;
    }

    @Deprecated
    public x j1(e x$e0, String s) {
        return this.T(this.u1(), x$e0, s);
    }

    public Object j2(Reader reader0, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", reader0);
        return this.F(this.a.x(reader0), this.b.f0(class0));
    }

    public x j3(com.fasterxml.jackson.databind.cfg.j j0) {
        this.k = this.k.z1(j0);
        return this;
    }

    public z j4(com.fasterxml.jackson.core.io.d d0) {
        return this.C(this.x1()).Q(d0);
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object k(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("p", n0);
        return this.H(this.q1(), n0, this.b.e0(b0));
    }

    @Deprecated
    public x k0(com.fasterxml.jackson.databind.t t0, boolean z) {
        this.h = (com.fasterxml.jackson.databind.G)(z ? this.h.J0(new com.fasterxml.jackson.databind.t[]{t0}) : this.h.T0(new com.fasterxml.jackson.databind.t[]{t0}));
        this.k = (g)(z ? this.k.J0(new com.fasterxml.jackson.databind.t[]{t0}) : this.k.T0(new com.fasterxml.jackson.databind.t[]{t0}));
        return this;
    }

    public x k1() {
        return this.W2(x.m1());
    }

    public Object k2(String s, com.fasterxml.jackson.core.type.b b0) throws com.fasterxml.jackson.core.p, o {
        this.r("content", s);
        return this.l2(s, this.b.e0(b0));
    }

    public x k3(DateFormat dateFormat0) {
        this.k = (g)this.k.G0(dateFormat0);
        this.h = this.h.s1(dateFormat0);
        return this;
    }

    public z k4(H h0) {
        return this.C(this.x1().o1(h0));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object l(com.fasterxml.jackson.core.n n0, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("p", n0);
        return this.H(this.q1(), n0, this.b.f0(class0));
    }

    public Class l1(Class class0) {
        return this.g.b(class0);
    }

    public Object l2(String s, com.fasterxml.jackson.databind.m m0) throws com.fasterxml.jackson.core.p, o {
        this.r("content", s);
        try {
            return this.F(this.a.y(s), m0);
        }
        catch(com.fasterxml.jackson.core.p p0) {
            throw p0;
        }
        catch(IOException iOException0) {
            throw o.u(iOException0);
        }
    }

    public x l3(com.fasterxml.jackson.databind.cfg.k k0) {
        this.k = this.k.A1(k0);
        this.h = this.h.q1(k0);
        return this;
    }

    public z l4(H h0, H[] arr_h) {
        return this.C(this.x1().p1(h0, arr_h));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Iterator m(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.a a0) throws IOException {
        return this.x2(n0, a0);
    }

    public x m0(H h0, boolean z) {
        this.h = z ? this.h.o1(h0) : this.h.D1(h0);
        return this;
    }

    public static List m1() {
        return x.n1(null);
    }

    public Object m2(String s, Class class0) throws com.fasterxml.jackson.core.p, o {
        this.r("content", s);
        return this.l2(s, this.b.f0(class0));
    }

    public x m3(Boolean boolean0) {
        this.e.l(boolean0);
        return this;
    }

    public z m4(com.fasterxml.jackson.databind.cfg.k k0) {
        return this.C(this.x1().q1(k0));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Iterator n(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.b b0) throws IOException {
        return this.y2(n0, b0);
    }

    public x n0(com.fasterxml.jackson.databind.cfg.l l0, boolean z) {
        if(z) {
            this.k = (g)this.k.y0(l0);
            this.h = (com.fasterxml.jackson.databind.G)this.h.y0(l0);
            return this;
        }
        this.k = (g)this.k.S0(l0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.S0(l0);
        return this;
    }

    public static List n1(ClassLoader classLoader0) {
        List list0 = new ArrayList();
        for(Object object0: x.b3(com.fasterxml.jackson.databind.w.class, classLoader0)) {
            ((ArrayList)list0).add(((com.fasterxml.jackson.databind.w)object0));
        }
        return list0;
    }

    public Object n2(URL uRL0, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", uRL0);
        return this.F(this.a.z(uRL0), this.b.e0(b0));
    }

    public z n4(com.fasterxml.jackson.databind.ser.m m0) {
        return this.C(this.x1().x1(m0));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Iterator o(com.fasterxml.jackson.core.n n0, Class class0) throws IOException {
        return this.A2(n0, class0);
    }

    public com.fasterxml.jackson.databind.m o0(com.fasterxml.jackson.core.type.b b0) {
        this.r("typeRef", b0);
        return this.b.e0(b0);
    }

    @Deprecated
    public com.fasterxml.jackson.databind.jsonschema.a o1(Class class0) throws o {
        return this.I(this.x1()).d1(class0);
    }

    public Object o2(URL uRL0, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", uRL0);
        return this.F(this.a.z(uRL0), m0);
    }

    public x o3(Boolean boolean0) {
        this.e.m(boolean0);
        return this;
    }

    public z o4(DateFormat dateFormat0) {
        return this.C(this.x1().s1(dateFormat0));
    }

    @Override  // com.fasterxml.jackson.core.u
    public Object p(G g0, Class class0) throws IllegalArgumentException, com.fasterxml.jackson.core.p {
        if(g0 == null) {
            return null;
        }
        try {
            if(G.class.isAssignableFrom(class0) && class0.isAssignableFrom(g0.getClass())) {
                return g0;
            }
            if(g0.h() == r.p && g0 instanceof com.fasterxml.jackson.databind.node.v) {
                Object object0 = ((com.fasterxml.jackson.databind.node.v)g0).f2();
                return object0 != null && !class0.isInstance(object0) ? this.l(this.f(g0), class0) : object0;
            }
            return this.l(this.f(g0), class0);
        }
        catch(com.fasterxml.jackson.core.p p0) {
        }
        catch(IOException iOException0) {
            throw new IllegalArgumentException(iOException0.getMessage(), iOException0);
        }
        throw p0;
    }

    public com.fasterxml.jackson.databind.m p0(Type type0) {
        this.r("t", type0);
        return this.b.f0(type0);
    }

    public DateFormat p1() {
        return this.h.w();
    }

    public Object p2(URL uRL0, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", uRL0);
        return this.F(this.a.z(uRL0), this.b.f0(class0));
    }

    public x p3(com.fasterxml.jackson.core.v v0) {
        this.h = this.h.t1(v0);
        return this;
    }

    public z p4(com.fasterxml.jackson.core.type.b b0) {
        com.fasterxml.jackson.databind.G g0 = this.x1();
        return b0 == null ? this.E(g0, null, null) : this.E(g0, this.b.e0(b0), null);
    }

    @Override  // com.fasterxml.jackson.core.u
    public void q(k k0, Object object0) throws IOException, com.fasterxml.jackson.core.exc.d, com.fasterxml.jackson.databind.f {
        this.r("g", k0);
        com.fasterxml.jackson.databind.G g0 = this.x1();
        if(g0.l1(H.d) && k0.a1() == null) {
            k0.Q1(g0.c1());
        }
        if(g0.l1(H.j) && object0 instanceof Closeable) {
            this.M(k0, object0, g0);
            return;
        }
        this.I(g0).g1(k0, object0);
        if(g0.l1(H.k)) {
            k0.flush();
        }
    }

    public Object q0(Object object0, com.fasterxml.jackson.core.type.b b0) throws IllegalArgumentException {
        return this.x(object0, this.b.e0(b0));
    }

    public g q1() {
        return this.k;
    }

    public Object q2(byte[] arr_b, int v, int v1, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", arr_b);
        return this.F(this.a.B(arr_b, v, v1), this.b.e0(b0));
    }

    public x q3(com.fasterxml.jackson.annotation.u.a u$a0) {
        com.fasterxml.jackson.annotation.u.b u$b0 = com.fasterxml.jackson.annotation.u.b.b(u$a0, u$a0);
        this.e.k(u$b0);
        return this;
    }

    public z q4(com.fasterxml.jackson.databind.m m0) {
        return this.E(this.x1(), m0, null);
    }

    protected final void r(String s, Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", s));
        }
    }

    public Object r0(Object object0, com.fasterxml.jackson.databind.m m0) throws IllegalArgumentException {
        return this.x(object0, m0);
    }

    public com.fasterxml.jackson.databind.h r1() {
        return this.l;
    }

    public Object r2(byte[] arr_b, int v, int v1, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", arr_b);
        return this.F(this.a.B(arr_b, v, v1), m0);
    }

    public x r3(com.fasterxml.jackson.annotation.u.b u$b0) {
        this.e.k(u$b0);
        return this;
    }

    public z r4(Class class0) {
        com.fasterxml.jackson.databind.G g0 = this.x1();
        return class0 == null ? this.E(g0, null, null) : this.E(g0, this.b.f0(class0), null);
    }

    protected void s(Class class0) {
        if(this.getClass() != class0) {
            throw new IllegalStateException("Failed copy()/copyWith(): " + this.getClass().getName() + " (version: " + this.version() + ") does not override copy()/copyWith(); it has to");
        }
    }

    public Object s0(Object object0, Class class0) throws IllegalArgumentException {
        return this.x(object0, this.b.f0(class0));
    }

    public l s1() {
        return this.c;
    }

    public Object s2(byte[] arr_b, int v, int v1, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", arr_b);
        return this.F(this.a.B(arr_b, v, v1), this.b.f0(class0));
    }

    public z s4() {
        com.fasterxml.jackson.databind.G g0 = this.x1();
        return this.E(g0, null, g0.d1());
    }

    public x t0() {
        this.s(x.class);
        return new x(this);
    }

    public com.fasterxml.jackson.databind.node.m t1() {
        return this.k.i1();
    }

    public x t3(com.fasterxml.jackson.annotation.E.a e$a0) {
        this.e.n(e$a0);
        return this;
    }

    @Deprecated
    public z t4(com.fasterxml.jackson.core.type.b b0) {
        com.fasterxml.jackson.databind.G g0 = this.x1();
        return b0 == null ? this.E(g0, null, null) : this.E(g0, this.b.e0(b0), null);
    }

    @Deprecated
    protected final void u(k k0, Object object0) throws IOException {
        this.x1().i1(k0);
        this.N(k0, object0);
    }

    public x u0(com.fasterxml.jackson.core.h h0) {
        this.s(x.class);
        return new x(this, h0);
    }

    public com.fasterxml.jackson.databind.jsontype.d u1() {
        return this.k.f1().k();
    }

    public Object u2(byte[] arr_b, com.fasterxml.jackson.core.type.b b0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", arr_b);
        return this.F(this.a.A(arr_b), this.b.e0(b0));
    }

    public x u3(i i0) {
        this.k = (g)this.k.E0(i0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.E0(i0);
        return this;
    }

    @Deprecated
    public z u4(com.fasterxml.jackson.databind.m m0) {
        return this.E(this.x1(), m0, null);
    }

    public com.fasterxml.jackson.databind.node.a v0() {
        return this.k.i1().R();
    }

    public com.fasterxml.jackson.databind.D v1() {
        return this.h.P();
    }

    public Object v2(byte[] arr_b, com.fasterxml.jackson.databind.m m0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", arr_b);
        return this.F(this.a.A(arr_b), m0);
    }

    public x v3(com.fasterxml.jackson.annotation.h.b h$b0) {
        com.fasterxml.jackson.databind.introspect.M.b m$b0 = com.fasterxml.jackson.databind.introspect.M.b.y(h$b0);
        this.e.o(m$b0);
        return this;
    }

    @Deprecated
    public z v4(Class class0) {
        com.fasterxml.jackson.databind.G g0 = this.x1();
        return class0 == null ? this.E(g0, null, null) : this.E(g0, this.b.f0(class0), null);
    }

    @Override  // com.fasterxml.jackson.core.u, com.fasterxml.jackson.core.I
    public com.fasterxml.jackson.core.H version() {
        return com.fasterxml.jackson.databind.cfg.x.a;
    }

    protected i w(e x$e0, com.fasterxml.jackson.databind.jsontype.d d0) {
        return d.I(x$e0, d0);
    }

    protected n w0(com.fasterxml.jackson.core.n n0, g g0) {
        return this.l.v1(g0, n0, this.c);
    }

    public Set w1() {
        return this.m == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(this.m);
    }

    public Object w2(byte[] arr_b, Class class0) throws IOException, com.fasterxml.jackson.core.exc.c, com.fasterxml.jackson.databind.f {
        this.r("src", arr_b);
        return this.F(this.a.A(arr_b), this.b.f0(class0));
    }

    public x w3(com.fasterxml.jackson.databind.ser.m m0) {
        this.h = this.h.x1(m0);
        return this;
    }

    public z w4(Class class0) {
        return this.C(this.x1().A1(class0));
    }

    protected Object x(Object object0, com.fasterxml.jackson.databind.m m0) throws IllegalArgumentException {
        Object object1;
        com.fasterxml.jackson.databind.ser.l l0 = this.I(this.x1().D1(H.c));
        com.fasterxml.jackson.databind.util.H h0 = l0.R(this);
        if(this.J1(com.fasterxml.jackson.databind.i.c)) {
            h0 = h0.h5(true);
        }
        try {
            l0.g1(h0, object0);
            com.fasterxml.jackson.core.n n0 = h0.a5();
            g g0 = this.q1();
            r r0 = this.z(n0, m0);
            if(r0 == r.v) {
                n n1 = this.w0(n0, g0);
                object1 = this.y(n1, m0).c(n1);
            }
            else if(r0 == r.n || r0 == r.l) {
                object1 = null;
            }
            else {
                n n2 = this.w0(n0, g0);
                object1 = this.y(n2, m0).g(n0, n2);
            }
            n0.close();
            return object1;
        }
        catch(IOException iOException0) {
        }
        throw new IllegalArgumentException(iOException0.getMessage(), iOException0);
    }

    public k x0(DataOutput dataOutput0) throws IOException {
        this.r("out", dataOutput0);
        k k0 = this.a.k(dataOutput0);
        this.h.i1(k0);
        return k0;
    }

    public com.fasterxml.jackson.databind.G x1() {
        return this.h;
    }

    public com.fasterxml.jackson.databind.u x2(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.a a0) throws IOException {
        return this.z2(n0, ((com.fasterxml.jackson.databind.m)a0));
    }

    @Deprecated
    public void x3(com.fasterxml.jackson.databind.ser.m m0) {
        this.h = this.h.x1(m0);
    }

    protected com.fasterxml.jackson.databind.n y(com.fasterxml.jackson.databind.h h0, com.fasterxml.jackson.databind.m m0) throws com.fasterxml.jackson.databind.f {
        com.fasterxml.jackson.databind.n n0 = (com.fasterxml.jackson.databind.n)this.n.get(m0);
        if(n0 != null) {
            return n0;
        }
        com.fasterxml.jackson.databind.n n1 = h0.c0(m0);
        if(n1 == null) {
            return (com.fasterxml.jackson.databind.n)h0.D(m0, "Cannot find a deserializer for type " + m0);
        }
        this.n.put(m0, n1);
        return n1;
    }

    public k y0(File file0, com.fasterxml.jackson.core.g g0) throws IOException {
        this.r("outputFile", file0);
        k k0 = this.a.m(file0, g0);
        this.h.i1(k0);
        return k0;
    }

    public s y1() {
        return this.j;
    }

    public com.fasterxml.jackson.databind.u y2(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.core.type.b b0) throws IOException {
        return this.z2(n0, this.b.e0(b0));
    }

    public Object y3(com.fasterxml.jackson.databind.cfg.q q0) {
        this.k = (g)this.k.A0(q0);
        this.h = (com.fasterxml.jackson.databind.G)this.h.A0(q0);
        return this;
    }

    protected r z(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.m m0) throws IOException {
        this.k.m1(n0);
        r r0 = n0.Y();
        if(r0 == null) {
            r0 = n0.m4();
            if(r0 == null) {
                throw com.fasterxml.jackson.databind.exc.f.E(n0, m0, "No content to map due to end-of-input");
            }
        }
        return r0;
    }

    public k z0(OutputStream outputStream0) throws IOException {
        this.r("out", outputStream0);
        k k0 = this.a.o(outputStream0, com.fasterxml.jackson.core.g.d);
        this.h.i1(k0);
        return k0;
    }

    public com.fasterxml.jackson.databind.I z1() {
        return this.i;
    }

    public com.fasterxml.jackson.databind.u z2(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.m m0) throws IOException {
        this.r("p", n0);
        n n1 = this.w0(n0, this.q1());
        return new com.fasterxml.jackson.databind.u(m0, n0, n1, this.y(n1, m0), false, null);
    }

    public x z3(l l0) {
        this.c = l0;
        return this;
    }
}

