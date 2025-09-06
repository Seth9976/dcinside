package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class B extends b {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            a.a = arr_v;
            try {
                arr_v[d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[d.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class org.bson.B.b extends org.bson.b.b {
        private Z e;
        final B f;

        org.bson.B.b() {
            super(null, u.a);
        }

        org.bson.B.b(Z z0, u u0, org.bson.B.b b$b0) {
            super(b$b0, u0);
            this.e = z0;
        }

        void g(Z z0) {
            Z z1 = this.e;
            if(z1 instanceof n) {
                ((n)z1).k0(z0);
                return;
            }
            ((y)z1).x1(B.this.E3(), z0);
        }
    }

    private final y g;

    public B(y y0) {
        super(new b0());
        this.g = y0;
        this.g4(new org.bson.B.b(this));
    }

    @Override  // org.bson.b
    protected void A2() {
        Z z0 = this.k4().e;
        this.g4(this.k4().e());
        if(this.k4().d() == u.d) {
            U u0 = (U)this.k4().e;
            this.g4(this.k4().e());
            this.m4(new I(u0.k0(), ((y)z0)));
            return;
        }
        if(this.k4().d() != u.a) {
            this.m4(z0);
        }
    }

    @Override  // org.bson.b
    public void B3() {
        this.m4(new Y());
    }

    @Override  // org.bson.b
    protected void C2(int v) {
        this.m4(new E(v));
    }

    @Override  // org.bson.b
    protected org.bson.b.b C3() {
        return this.k4();
    }

    @Override  // org.bson.b
    protected void I2(long v) {
        this.m4(new F(v));
    }

    @Override  // org.bson.b
    protected void L2(String s) {
        this.m4(new H(s));
    }

    @Override  // org.bson.b
    protected void P2(String s) {
        U u0 = new U(s);
        org.bson.B.b b$b0 = this.k4();
        this.g4(new org.bson.B.b(this, u0, u.d, b$b0));
    }

    @Override  // org.bson.b
    protected void R2() {
        this.m4(new J());
    }

    @Override  // org.bson.b
    protected void Y2() {
        this.m4(new L());
    }

    @Override  // org.bson.b
    protected void e2(o o0) {
        this.m4(o0);
    }

    @Override  // org.bson.b
    public void e3() {
        this.m4(M.a);
    }

    @Override  // org.bson.a0
    public void flush() {
    }

    @Override  // org.bson.b
    public void g2(boolean z) {
        this.m4(t.m0(z));
    }

    @Override  // org.bson.b
    protected void i2(w w0) {
        this.m4(w0);
    }

    @Override  // org.bson.b
    public void i3(ObjectId objectId0) {
        this.m4(new O(objectId0));
    }

    @Override  // org.bson.b
    protected void j2(long v) {
        this.m4(new v(v));
    }

    protected org.bson.B.b k4() {
        return (org.bson.B.b)super.C3();
    }

    public y l4() {
        return this.g;
    }

    private void m4(Z z0) {
        this.k4().g(z0);
    }

    @Override  // org.bson.b
    public void n3(S s0) {
        this.m4(s0);
    }

    @Override  // org.bson.b
    protected void o2(Decimal128 decimal1280) {
        this.m4(new x(decimal1280));
    }

    @Override  // org.bson.b
    protected void p2(double f) {
        this.m4(new C(f));
    }

    @Override  // org.bson.b
    protected void p3() {
        n n0 = new n();
        org.bson.B.b b$b0 = this.k4();
        this.g4(new org.bson.B.b(this, n0, u.c, b$b0));
    }

    @Override  // org.bson.b
    protected void r3() {
        switch(this.N3()) {
            case 1: {
                org.bson.B.b b$b0 = this.k4();
                this.g4(new org.bson.B.b(this, this.g, u.b, b$b0));
                return;
            }
            case 2: {
                y y0 = new y();
                org.bson.B.b b$b1 = this.k4();
                this.g4(new org.bson.B.b(this, y0, u.b, b$b1));
                return;
            }
            case 3: {
                y y1 = new y();
                org.bson.B.b b$b2 = this.k4();
                this.g4(new org.bson.B.b(this, y1, u.e, b$b2));
                return;
            }
            default: {
                throw new G("Unexpected state " + this.N3());
            }
        }
    }

    @Override  // org.bson.b
    public void s3(String s) {
        this.m4(new U(s));
    }

    @Override  // org.bson.b
    protected void t2() {
        Z z0 = this.k4().e;
        this.g4(this.k4().e());
        this.m4(z0);
    }

    @Override  // org.bson.b
    public void v3(String s) {
        this.m4(new V(s));
    }

    @Override  // org.bson.b
    public void y3(W w0) {
        this.m4(w0);
    }
}

