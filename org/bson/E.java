package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

class e extends b {
    public class a extends org.bson.b.b {
        private int e;
        private d f;
        private String g;
        private String h;
        final e i;

        a(a e$a0, u u0) {
            super(e$a0, u0);
        }

        @Override  // org.bson.b$b
        public org.bson.b.b e() {
            return this.m();
        }

        static int l(a e$a0) {
            int v = e$a0.e;
            e$a0.e = v + 1;
            return v;
        }

        public a m() {
            return (a)super.e();
        }
    }

    private d g;

    protected e(b0 b00, d d0) {
        super(b00);
        this.g = d0;
    }

    @Override  // org.bson.b
    protected void A2() {
        u u0 = this.k4().d();
        this.g4(this.k4().m());
        this.g.p();
        if(u0 == u.e) {
            Object object0 = this.g.get();
            d d0 = this.k4().f;
            this.g = d0;
            d0.n(this.k4().h, this.k4().g, object0);
        }
    }

    @Override  // org.bson.b
    public void B3() {
        this.g.e(this.E3());
    }

    @Override  // org.bson.b
    protected void C2(int v) {
        this.g.y(this.E3(), v);
    }

    @Override  // org.bson.b
    protected org.bson.b.b C3() {
        return this.k4();
    }

    @Override  // org.bson.b
    protected String E3() {
        return this.k4().d() == u.c ? Integer.toString(a.l(this.k4())) : super.E3();
    }

    @Override  // org.bson.b
    protected void I2(long v) {
        this.g.q(this.E3(), v);
    }

    @Override  // org.bson.b
    protected void L2(String s) {
        this.g.t(this.E3(), s);
    }

    @Override  // org.bson.b
    protected void P2(String s) {
        this.k4().f = this.g;
        this.k4().g = s;
        this.k4().h = this.E3();
        this.g = this.g.w();
    }

    @Override  // org.bson.b
    protected void R2() {
        this.g.s(this.E3());
    }

    @Override  // org.bson.b
    protected void Y2() {
        this.g.l(this.E3());
    }

    @Override  // org.bson.b
    protected void e2(o o0) {
        if(o0.o0() == q.e.a()) {
            this.g.v(this.E3(), org.bson.io.b.l(o0.n0(), 0), org.bson.io.b.l(o0.n0(), 8));
            return;
        }
        this.g.g(this.E3(), o0.o0(), o0.n0());
    }

    @Override  // org.bson.b
    public void e3() {
        this.g.k(this.E3());
    }

    @Override  // org.bson.a0
    public void flush() {
    }

    @Override  // org.bson.b
    public void g2(boolean z) {
        this.g.i(this.E3(), z);
        this.h4(this.F3());
    }

    @Override  // org.bson.b
    protected void i2(w w0) {
        this.g.r(this.E3(), w0.k0(), w0.j0());
    }

    @Override  // org.bson.b
    public void i3(ObjectId objectId0) {
        this.g.o(this.E3(), objectId0);
    }

    @Override  // org.bson.b
    protected void j2(long v) {
        this.g.m(this.E3(), v);
    }

    protected a k4() {
        return (a)super.C3();
    }

    @Override  // org.bson.b
    public void n3(S s0) {
        this.g.h(this.E3(), s0.k0(), s0.j0());
    }

    @Override  // org.bson.b
    protected void o2(Decimal128 decimal1280) {
        this.g.A(this.E3(), decimal1280);
    }

    @Override  // org.bson.b
    protected void p2(double f) {
        this.g.f(this.E3(), f);
    }

    @Override  // org.bson.b
    public void p3() {
        this.g.b(this.E3());
        this.g4(new a(this, this.k4(), u.c));
    }

    @Override  // org.bson.b
    public void r3() {
        u u0 = this.N3() == org.bson.b.d.d ? u.e : u.b;
        if(this.k4() == null || u0 == u.e) {
            this.g.a();
        }
        else {
            this.g.c(this.E3());
        }
        this.g4(new a(this, this.k4(), u0));
    }

    @Override  // org.bson.b
    public void s3(String s) {
        this.g.d(this.E3(), s);
    }

    @Override  // org.bson.b
    protected void t2() {
        this.g4(this.k4().m());
        this.g.z();
    }

    @Override  // org.bson.b
    public void v3(String s) {
        this.g.B(this.E3(), s);
    }

    @Override  // org.bson.b
    public void y3(W w0) {
        this.g.j(this.E3(), w0.m0(), w0.k0());
    }
}

