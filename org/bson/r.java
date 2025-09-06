package org.bson;

import java.util.List;
import java.util.Stack;
import org.bson.io.e;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class r extends b {
    public class a extends org.bson.b.b {
        private final int e;
        private int f;
        final r g;

        public a(a r$a0) {
            super(r$a0);
            this.e = r$a0.e;
            this.f = r$a0.f;
        }

        public a(a r$a0, u u0, int v) {
            super(r$a0, u0);
            this.e = v;
        }

        @Override  // org.bson.b$b
        public org.bson.b.b c() {
            return this.h();
        }

        @Override  // org.bson.b$b
        public org.bson.b.b e() {
            return this.i();
        }

        static int f(a r$a0) {
            int v = r$a0.f;
            r$a0.f = v + 1;
            return v;
        }

        public a h() {
            return new a(r.this, this);
        }

        public a i() {
            return (a)super.e();
        }
    }

    public class org.bson.r.b extends c {
        private final int f;
        final r g;

        protected org.bson.r.b() {
            this.f = r0.h.getPosition();
        }

        @Override  // org.bson.b$c
        protected void a() {
            super.a();
            r.this.h.e1(r.this.j.f);
        }
    }

    private final s g;
    private final e h;
    private final Stack i;
    private org.bson.r.b j;

    public r(b0 b00, s s0, e e0) {
        this(b00, s0, e0, new l0());
    }

    public r(b0 b00, s s0, e e0, g0 g00) {
        super(b00, g00);
        Stack stack0 = new Stack();
        this.i = stack0;
        this.g = s0;
        this.h = e0;
        stack0.push(s0.a());
    }

    public r(e e0) {
        this(new b0(), new s(), e0);
    }

    public r(e e0, g0 g00) {
        this(new b0(), new s(), e0, g00);
    }

    @Override  // org.bson.b
    protected void A2() {
        this.h.writeByte(0);
        this.m4();
        this.g4(this.p4().i());
        if(this.p4() != null && this.p4().d() == u.d) {
            this.m4();
            this.g4(this.p4().i());
        }
    }

    public void B() {
        this.j = new org.bson.r.b(this);
    }

    @Override  // org.bson.b
    public void B3() {
        this.h.writeByte(X.h.b());
        this.t4();
    }

    @Override  // org.bson.b
    protected void C2(int v) {
        this.h.writeByte(X.r.b());
        this.t4();
        this.h.h(v);
    }

    @Override  // org.bson.b
    protected org.bson.b.b C3() {
        return this.p4();
    }

    @Override  // org.bson.b
    protected void I2(long v) {
        this.h.writeByte(X.t.b());
        this.t4();
        this.h.r(v);
    }

    @Override  // org.bson.b
    protected void L2(String s) {
        this.h.writeByte(X.o.b());
        this.t4();
        this.h.d(s);
    }

    @Override  // org.bson.b
    protected void P2(String s) {
        this.h.writeByte(X.q.b());
        this.t4();
        a r$a0 = this.p4();
        int v = this.h.getPosition();
        this.g4(new a(this, r$a0, u.d, v));
        this.h.h(0);
        this.h.d(s);
    }

    @Override  // org.bson.b
    protected void R2() {
        this.h.writeByte(X.w.b());
        this.t4();
    }

    @Override  // org.bson.b
    public void S3(P p0, List list0) {
        R3.a.e("reader", p0);
        R3.a.e("extraElements", list0);
        this.a4(p0, list0);
    }

    @Override  // org.bson.b
    protected void Y2() {
        this.h.writeByte(X.v.b());
        this.t4();
    }

    @Override  // org.bson.b
    public void a1(P p0) {
        R3.a.e("reader", p0);
        this.a4(p0, null);
    }

    private void a4(P p0, List list0) {
        if(p0 instanceof p) {
            if(this.N3() == d.c) {
                this.h.writeByte(X.e.b());
                this.t4();
            }
            org.bson.io.c c0 = ((p)p0).g2();
            int v = c0.readInt32();
            if(v < 5) {
                throw new T("Document size must be at least 5");
            }
            int v1 = this.h.getPosition();
            this.h.h(v);
            byte[] arr_b = new byte[v - 4];
            c0.r2(arr_b);
            this.h.writeBytes(arr_b);
            ((p)p0).t1(org.bson.a.d.b);
            if(list0 != null) {
                int v2 = this.h.getPosition();
                this.h.e1(v2 - 1);
                this.g4(new a(this, this.p4(), u.b, v1));
                this.h4(d.b);
                this.b4(list0);
                this.h.writeByte(0);
                int v3 = this.h.getPosition();
                this.h.writeInt32(v1, v3 - v1);
                this.g4(this.p4().i());
            }
            if(this.p4() == null) {
                this.h4(d.e);
            }
            else {
                if(this.p4().d() == u.d) {
                    this.m4();
                    this.g4(this.p4().i());
                }
                this.h4(this.F3());
            }
            this.s4(this.h.getPosition() - v1);
            return;
        }
        if(list0 != null) {
            super.S3(p0, list0);
            return;
        }
        super.a1(p0);
    }

    @Override  // org.bson.b
    public void close() {
        super.close();
    }

    @Override  // org.bson.b
    protected void e2(o o0) {
        this.h.writeByte(X.g.b());
        this.t4();
        int v = o0.n0().length;
        q q0 = q.d;
        if(o0.o0() == q0.a()) {
            v += 4;
        }
        this.h.h(v);
        this.h.writeByte(o0.o0());
        if(o0.o0() == q0.a()) {
            this.h.h(v - 4);
        }
        this.h.writeBytes(o0.n0());
    }

    @Override  // org.bson.b
    public void e3() {
        this.h.writeByte(X.l.b());
        this.t4();
    }

    @Override  // org.bson.a0
    public void flush() {
    }

    @Override  // org.bson.b
    public void g2(boolean z) {
        this.h.writeByte(X.j.b());
        this.t4();
        this.h.writeByte(((int)z));
    }

    @Override  // org.bson.b
    protected void i2(w w0) {
        this.h.writeByte(X.n.b());
        this.t4();
        this.h.d(w0.k0());
        this.h.writeBytes(new byte[]{104, -69, 37, -45, 13, (byte)0xE0, -13, 0x7F, 2, 89, 50, -73});
    }

    @Override  // org.bson.b
    public void i3(ObjectId objectId0) {
        this.h.writeByte(X.i.b());
        this.t4();
        this.h.writeBytes(new byte[]{104, -69, 37, -56, 0x7E, 33, 7, 26, 0x73, 0x1F, 50, (byte)0xA0});
    }

    @Override  // org.bson.b
    protected void j2(long v) {
        this.h.writeByte(X.k.b());
        this.t4();
        this.h.r(v);
    }

    private void m4() {
        int v = this.h.getPosition() - this.p4().e;
        this.s4(v);
        int v1 = this.h.getPosition();
        this.h.writeInt32(v1 - v, v);
    }

    @Override  // org.bson.b
    public void n3(S s0) {
        this.h.writeByte(X.m.b());
        this.t4();
        this.h.B2(s0.k0());
        this.h.B2(s0.j0());
    }

    public s n4() {
        return this.g;
    }

    @Override  // org.bson.b
    protected void o2(Decimal128 decimal1280) {
        this.h.writeByte(X.u.b());
        this.t4();
        this.h.r(decimal1280.i());
        this.h.r(decimal1280.h());
    }

    public e o4() {
        return this.h;
    }

    @Override  // org.bson.b
    protected void p2(double f) {
        this.h.writeByte(X.c.b());
        this.t4();
        this.h.writeDouble(f);
    }

    @Override  // org.bson.b
    protected void p3() {
        this.h.writeByte(X.f.b());
        this.t4();
        a r$a0 = this.p4();
        int v = this.h.getPosition();
        this.g4(new a(this, r$a0, u.c, v));
        this.h.h(0);
    }

    protected a p4() {
        return (a)super.C3();
    }

    public void q4() {
        this.i.pop();
    }

    @Override  // org.bson.b
    protected void r3() {
        if(this.N3() == d.c) {
            this.h.writeByte(X.e.b());
            this.t4();
        }
        a r$a0 = this.p4();
        int v = this.h.getPosition();
        this.g4(new a(this, r$a0, u.b, v));
        this.h.h(0);
    }

    public void r4(int v) {
        this.i.push(v);
    }

    public void reset() {
        org.bson.r.b r$b0 = this.j;
        if(r$b0 == null) {
            throw new IllegalStateException("Can not reset without first marking");
        }
        r$b0.a();
        this.j = null;
    }

    @Override  // org.bson.b
    public void s3(String s) {
        this.h.writeByte(X.d.b());
        this.t4();
        this.h.d(s);
    }

    private void s4(int v) {
        if(v > ((int)(((Integer)this.i.peek())))) {
            throw new K(String.format("Document size of %d is larger than maximum of %d.", v, this.i.peek()));
        }
    }

    @Override  // org.bson.b
    protected void t2() {
        this.h.writeByte(0);
        this.m4();
        this.g4(this.p4().i());
    }

    private void t4() {
        if(this.p4().d() == u.c) {
            String s = Integer.toString(a.f(this.p4()));
            this.h.B2(s);
            return;
        }
        String s1 = this.E3();
        this.h.B2(s1);
    }

    @Override  // org.bson.b
    public void v3(String s) {
        this.h.writeByte(X.p.b());
        this.t4();
        this.h.d(s);
    }

    @Override  // org.bson.b
    public void y3(W w0) {
        this.h.writeByte(X.s.b());
        this.t4();
        this.h.r(w0.n0());
    }
}

