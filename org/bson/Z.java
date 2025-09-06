package org.bson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class z extends a {
    static class org.bson.z.a {
        static final int[] a;

        static {
            int[] arr_v = new int[u.values().length];
            org.bson.z.a.a = arr_v;
            try {
                arr_v[u.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.z.a.a[u.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.z.a.a[u.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class b implements Iterator {
        private Iterator a;
        private List b;
        private int c;
        private boolean d;

        protected b(Iterator iterator0) {
            this.b = new ArrayList();
            this.a = iterator0;
            this.c = 0;
            this.d = false;
        }

        protected void a() {
            this.d = true;
        }

        protected void b() {
            this.c = 0;
            this.d = false;
        }

        @Override
        public boolean hasNext() {
            return this.a.hasNext() || this.c < this.b.size();
        }

        @Override
        public Object next() {
            Object object0;
            if(this.c < this.b.size()) {
                object0 = this.b.get(this.c);
                if(this.d) {
                    ++this.c;
                    return object0;
                }
                this.b.remove(0);
                return object0;
            }
            object0 = this.a.next();
            if(this.d) {
                this.b.add(object0);
                ++this.c;
            }
            return object0;
        }

        @Override
        public void remove() {
        }
    }

    public class c extends org.bson.a.b {
        private b d;
        private b e;
        final z f;

        protected c(c z$c0, u u0, n n0) {
            super(z$c0, u0);
            this.e = new b(n0.iterator());
        }

        protected c(c z$c0, u u0, y y0) {
            super(z$c0, u0);
            this.d = new b(y0.entrySet().iterator());
        }

        // 去混淆评级： 低(20)
        public Map.Entry e() {
            return this.d.hasNext() ? ((Map.Entry)this.d.next()) : null;
        }

        // 去混淆评级： 低(20)
        public Z f() {
            return this.e.hasNext() ? ((Z)this.e.next()) : null;
        }

        protected void g() {
            b z$b0 = this.d;
            if(z$b0 == null) {
                this.e.a();
            }
            else {
                z$b0.a();
            }
            if(this.d() != null) {
                ((c)this.d()).g();
            }
        }

        protected void h() {
            b z$b0 = this.d;
            if(z$b0 == null) {
                this.e.b();
            }
            else {
                z$b0.b();
            }
            if(this.d() != null) {
                ((c)this.d()).h();
            }
        }
    }

    public class d extends org.bson.a.c {
        private final Z g;
        private final c h;
        final z i;

        protected d() {
            this.g = z0.f;
            c z$c0 = z0.i2();
            this.h = z$c0;
            z$c0.g();
        }

        @Override  // org.bson.a$c
        public void reset() {
            super.reset();
            z.this.f = this.g;
            z.this.i1(this.h);
            this.h.h();
        }
    }

    private Z f;
    private d g;

    public z(y y0) {
        this.i1(new c(this, null, u.a, y0));
        this.f = y0;
    }

    @Override  // org.bson.P
    @Deprecated
    public void B() {
        if(this.g != null) {
            throw new h("A mark already exists; it needs to be reset before creating a new one");
        }
        this.g = new d(this);
    }

    @Override  // org.bson.a
    protected String E0() {
        return this.f.D().k0();
    }

    @Override  // org.bson.a
    protected void L() {
        this.i1(this.i2().d());
        switch(this.i2().c()) {
            case 1: 
            case 2: {
                this.t1(org.bson.a.d.b);
                return;
            }
            case 3: {
                this.t1(org.bson.a.d.h);
                return;
            }
            default: {
                throw new h("Unexpected ContextType.");
            }
        }
    }

    @Override  // org.bson.a
    protected String L0() {
        return this.f.E().j0();
    }

    @Override  // org.bson.P
    public Q P1() {
        return new d(this);
    }

    @Override  // org.bson.a
    protected int Q() {
        return this.f.r().p0();
    }

    @Override  // org.bson.a
    protected long R() {
        return this.f.u().p0();
    }

    @Override  // org.bson.a
    protected String T() {
        return this.f.y().j0();
    }

    @Override  // org.bson.a
    protected W T0() {
        return this.f.F();
    }

    @Override  // org.bson.a
    public X T2() {
        if(this.h1() != org.bson.a.d.a && this.h1() != org.bson.a.d.e) {
            org.bson.a.d a$d0 = org.bson.a.d.b;
            if(this.h1() != a$d0) {
                this.N1("ReadBSONType", new org.bson.a.d[]{a$d0});
            }
            switch(this.i2().c()) {
                case 1: {
                    Z z0 = this.i2().f();
                    this.f = z0;
                    if(z0 == null) {
                        this.t1(org.bson.a.d.g);
                        return X.b;
                    }
                    this.t1(org.bson.a.d.d);
                    break;
                }
                case 2: {
                    Map.Entry map$Entry0 = this.i2().e();
                    if(map$Entry0 == null) {
                        this.t1(org.bson.a.d.f);
                        return X.b;
                    }
                    this.l1(((String)map$Entry0.getKey()));
                    this.f = (Z)map$Entry0.getValue();
                    this.t1(org.bson.a.d.c);
                    break;
                }
                default: {
                    throw new h("Invalid ContextType.");
                }
            }
            this.j1(this.f.G());
            return this.z0();
        }
        this.j1(X.e);
        this.t1(org.bson.a.d.d);
        return this.z0();
    }

    @Override  // org.bson.a
    protected String Y() {
        return this.f.z().k0();
    }

    @Override  // org.bson.a
    protected void Y0() {
    }

    @Override  // org.bson.a
    protected void a1() {
    }

    @Override  // org.bson.a
    protected void b1() {
    }

    @Override  // org.bson.a
    protected org.bson.a.b c1() {
        return this.i2();
    }

    @Override  // org.bson.a
    protected void d0() {
    }

    @Override  // org.bson.a
    protected void e0() {
    }

    @Override  // org.bson.a
    protected void f0() {
    }

    @Override  // org.bson.a
    protected ObjectId h0() {
        return this.f.B().k0();
    }

    protected c i2() {
        return (c)super.c1();
    }

    @Override  // org.bson.a
    protected S l0() {
        return this.f.C();
    }

    @Override  // org.bson.a
    protected int n() {
        return this.f.c().n0().length;
    }

    @Override  // org.bson.a
    protected byte o() {
        return this.f.c().o0();
    }

    @Override  // org.bson.a
    protected o p() {
        return this.f.c();
    }

    @Override  // org.bson.a
    protected boolean q() {
        return this.f.d().k0();
    }

    @Override  // org.bson.P
    @Deprecated
    public void reset() {
        d z$d0 = this.g;
        if(z$d0 == null) {
            throw new h("trying to reset a mark before creating it");
        }
        z$d0.reset();
        this.g = null;
    }

    @Override  // org.bson.a
    protected w s() {
        return this.f.g();
    }

    @Override  // org.bson.a
    protected long t() {
        return this.f.h().k0();
    }

    @Override  // org.bson.a
    protected void u0() {
        n n0 = this.f.b();
        this.i1(new c(this, this.i2(), u.c, n0));
    }

    @Override  // org.bson.a
    public Decimal128 v() {
        return this.f.j().o0();
    }

    @Override  // org.bson.a
    protected double w() {
        return this.f.m().p0();
    }

    @Override  // org.bson.a
    protected void x() {
        this.i1(this.i2().d());
    }

    @Override  // org.bson.a
    protected void x0() {
        y y0 = this.f.G() == X.q ? this.f.z().m0() : this.f.l();
        this.i1(new c(this, this.i2(), u.b, y0));
    }
}

