package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.node.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;

public class t extends g {
    static final class a extends g {
        private static final long i = 1L;
        protected static final a j;

        static {
            a.j = new a();
        }

        protected a() {
            super(com.fasterxml.jackson.databind.node.a.class, Boolean.TRUE);
        }

        protected a(a t$a0, boolean z, boolean z1) {
            super(t$a0, z, z1);
        }

        public com.fasterxml.jackson.databind.node.a E1(n n0, h h0) throws IOException {
            if(n0.d4()) {
                m m0 = h0.k0();
                com.fasterxml.jackson.databind.node.a a0 = m0.R();
                this.t1(n0, h0, m0, new com.fasterxml.jackson.databind.deser.std.g.a(), a0);
                return a0;
            }
            return (com.fasterxml.jackson.databind.node.a)h0.v0(com.fasterxml.jackson.databind.node.a.class, n0);
        }

        public com.fasterxml.jackson.databind.node.a F1(n n0, h h0, com.fasterxml.jackson.databind.node.a a0) throws IOException {
            if(n0.d4()) {
                this.t1(n0, h0, h0.k0(), new com.fasterxml.jackson.databind.deser.std.g.a(), a0);
                return a0;
            }
            return (com.fasterxml.jackson.databind.node.a)h0.v0(com.fasterxml.jackson.databind.node.a.class, n0);
        }

        public static a G1() {
            return a.j;
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.E1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object h(n n0, h h0, Object object0) throws IOException, f {
            return this.F1(n0, h0, ((com.fasterxml.jackson.databind.node.a)object0));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.g
        protected com.fasterxml.jackson.databind.n r1(boolean z, boolean z1) {
            return new a(this, z, z1);
        }
    }

    static final class b extends g {
        private static final long i = 1L;
        protected static final b j;

        static {
            b.j = new b();
        }

        protected b() {
            super(u.class, Boolean.TRUE);
        }

        protected b(b t$b0, boolean z, boolean z1) {
            super(t$b0, z, z1);
        }

        public u E1(n n0, h h0) throws IOException {
            m m0 = h0.k0();
            if(n0.e4()) {
                u u0 = m0.y();
                this.t1(n0, h0, m0, new com.fasterxml.jackson.databind.deser.std.g.a(), u0);
                return u0;
            }
            if(n0.Y3(r.o)) {
                return this.u1(n0, h0, m0, new com.fasterxml.jackson.databind.deser.std.g.a());
            }
            return n0.Y3(r.l) ? m0.y() : ((u)h0.v0(u.class, n0));
        }

        // 去混淆评级： 低(20)
        public u F1(n n0, h h0, u u0) throws IOException {
            return n0.e4() || n0.Y3(r.o) ? ((u)this.D1(n0, h0, u0, new com.fasterxml.jackson.databind.deser.std.g.a())) : ((u)h0.v0(u.class, n0));
        }

        public static b G1() {
            return b.j;
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.E1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object h(n n0, h h0, Object object0) throws IOException, f {
            return this.F1(n0, h0, ((u)object0));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.g
        protected com.fasterxml.jackson.databind.n r1(boolean z, boolean z1) {
            return new b(this, z, z1);
        }
    }

    private static final t i;

    static {
        t.i = new t();
    }

    protected t() {
        super(p.class, null);
    }

    protected t(t t0, boolean z, boolean z1) {
        super(t0, z, z1);
    }

    public p E1(n n0, h h0) throws IOException {
        com.fasterxml.jackson.databind.deser.std.g.a g$a0 = new com.fasterxml.jackson.databind.deser.std.g.a();
        m m0 = h0.k0();
        switch(n0.d0()) {
            case 1: {
                return this.t1(n0, h0, m0, g$a0, m0.y());
            }
            case 2: {
                return m0.y();
            }
            case 3: {
                return this.t1(n0, h0, m0, g$a0, m0.R());
            }
            case 5: {
                return this.u1(n0, h0, m0, g$a0);
            }
            default: {
                return this.s1(n0, h0);
            }
        }
    }

    public static com.fasterxml.jackson.databind.n F1(Class class0) {
        if(class0 == u.class) {
            return b.G1();
        }
        return class0 == com.fasterxml.jackson.databind.node.a.class ? a.G1() : t.i;
    }

    public p G1(h h0) {
        return h0.k0().r();
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.g
    public com.fasterxml.jackson.databind.n a(h h0, d d0) throws o {
        return super.a(h0, d0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object c(h h0) throws o {
        return this.G1(h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object f(h h0) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException, f {
        return this.E1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.g
    public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
        return super.i(n0, h0, f0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.g
    protected com.fasterxml.jackson.databind.n r1(boolean z, boolean z1) {
        return new t(this, z, z1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.g
    public boolean u() {
        return super.u();
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.g
    public com.fasterxml.jackson.databind.type.h w() {
        return super.w();
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.g
    public Boolean y(com.fasterxml.jackson.databind.g g0) {
        return this.f;
    }
}

