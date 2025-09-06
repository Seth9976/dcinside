package org.bson;

import java.util.Arrays;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public abstract class a implements P {
    static class org.bson.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[u.values().length];
            org.bson.a.a.a = arr_v;
            try {
                arr_v[u.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.a.a.a[u.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.a.a.a[u.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.a.a.a[u.a.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public abstract class b {
        private final b a;
        private final u b;
        final a c;

        protected b(b a$b0, u u0) {
            this.a = a$b0;
            this.b = u0;
        }

        protected u c() {
            return this.b;
        }

        protected b d() {
            return this.a;
        }
    }

    public class c implements Q {
        private final d a;
        private final b b;
        private final u c;
        private final X d;
        private final String e;
        final a f;

        protected c() {
            this.a = a0.a;
            this.b = a0.b.a;
            this.c = a0.b.b;
            this.d = a0.c;
            this.e = a0.d;
        }

        protected u a() {
            return this.c;
        }

        protected b b() {
            return this.b;
        }

        @Override  // org.bson.Q
        public void reset() {
            a.this.a = this.a;
            a.this.c = this.d;
            a.this.d = this.e;
        }
    }

    public static enum d {
        INITIAL,
        TYPE,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        END_OF_DOCUMENT,
        END_OF_ARRAY,
        DONE,
        CLOSED;

    }

    private d a;
    private b b;
    private X c;
    private String d;
    private boolean e;

    protected a() {
        this.a = d.a;
    }

    @Override  // org.bson.P
    public o B0() {
        this.k("readBinaryData", X.g);
        this.t1(this.d1());
        return this.p();
    }

    @Override  // org.bson.P
    public String C1() {
        this.k("readJavaScript", X.o);
        this.t1(this.d1());
        return this.T();
    }

    protected abstract String E0();

    @Override  // org.bson.P
    public void E1() {
        if(this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        u u0 = u.b;
        if(this.c1().c() != u0) {
            u u1 = u.e;
            if(this.c1().c() != u1) {
                this.J1("readEndDocument", this.c1().c(), new u[]{u0, u1});
            }
        }
        if(this.h1() == d.b) {
            this.T2();
        }
        d a$d0 = d.f;
        if(this.h1() != a$d0) {
            this.N1("readEndDocument", new d[]{a$d0});
        }
        this.L();
        this.u1();
    }

    @Override  // org.bson.P
    public void G1() {
        this.k("readUndefined", X.h);
        this.t1(this.d1());
        this.Y0();
    }

    @Override  // org.bson.P
    public o G2(String s) {
        this.d2(s);
        return this.B0();
    }

    @Override  // org.bson.P
    public byte G3() {
        this.k("readBinaryData", X.g);
        return this.o();
    }

    @Override  // org.bson.P
    public ObjectId H() {
        this.k("readObjectId", X.i);
        this.t1(this.d1());
        return this.h0();
    }

    protected void J1(String s, u u0, u[] arr_u) {
        throw new G(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", s, p0.a(" or ", Arrays.asList(arr_u)), u0));
    }

    protected abstract void L();

    protected abstract String L0();

    @Override  // org.bson.P
    public String L3(String s) {
        this.d2(s);
        return this.y2();
    }

    @Override  // org.bson.P
    public w M() {
        this.k("readDBPointer", X.n);
        this.t1(this.d1());
        return this.s();
    }

    protected void N1(String s, d[] arr_a$d) {
        throw new G(String.format("%s can only be called when State is %s, not when State is %s.", s, p0.a(" or ", Arrays.asList(arr_a$d)), this.a));
    }

    @Override  // org.bson.P
    public long O1(String s) {
        this.d2(s);
        return this.m3();
    }

    protected abstract int Q();

    protected void Q1(String s, X x0) {
        if(this.a == d.a || this.a == d.e || this.a == d.b) {
            this.T2();
        }
        if(this.a == d.c) {
            this.g1();
        }
        d a$d0 = d.d;
        if(this.a != a$d0) {
            this.N1(s, new d[]{a$d0});
        }
        if(this.c != x0) {
            throw new G(String.format("%s can only be called when CurrentBSONType is %s, not when CurrentBSONType is %s.", s, x0, this.c));
        }
    }

    protected abstract long R();

    @Override  // org.bson.P
    public int R3(String s) {
        this.d2(s);
        return this.readInt32();
    }

    @Override  // org.bson.P
    public S S1(String s) {
        this.d2(s);
        return this.m0();
    }

    protected abstract String T();

    protected abstract W T0();

    @Override  // org.bson.P
    public abstract X T2();

    @Override  // org.bson.P
    public W U0() {
        this.k("readTimestamp", X.s);
        this.t1(this.d1());
        return this.T0();
    }

    @Override  // org.bson.P
    public Decimal128 U1() {
        this.k("readDecimal", X.u);
        this.t1(this.d1());
        return this.v();
    }

    @Override  // org.bson.P
    public void V(String s) {
        this.d2(s);
        this.o0();
    }

    @Override  // org.bson.P
    public void V0() {
        this.k("readMinKey", X.v);
        this.t1(this.d1());
        this.e0();
    }

    @Override  // org.bson.P
    public String W0(String s) {
        this.d2(s);
        return this.readString();
    }

    @Override  // org.bson.P
    public W W3(String s) {
        this.d2(s);
        return this.U0();
    }

    protected abstract String Y();

    protected abstract void Y0();

    @Override  // org.bson.P
    public void Y1() {
        if(this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        d a$d0 = d.d;
        if(this.h1() != a$d0) {
            this.N1("skipValue", new d[]{a$d0});
        }
        this.b1();
        this.t1(d.b);
    }

    @Override  // org.bson.P
    public void Z(String s) {
        this.d2(s);
    }

    @Override  // org.bson.P
    public void Z1(String s) {
        this.d2(s);
        this.s1();
    }

    protected abstract void a1();

    @Override  // org.bson.P
    public int a3() {
        this.k("readBinaryData", X.g);
        return this.n();
    }

    protected abstract void b1();

    @Override  // org.bson.P
    public void c0(String s) {
        this.d2(s);
        this.V0();
    }

    protected b c1() {
        return this.b;
    }

    @Override  // org.bson.P
    public String c2() {
        this.k("readSymbol", X.p);
        this.t1(this.d1());
        return this.L0();
    }

    @Override  // org.bson.P
    public void close() {
        this.e = true;
    }

    protected abstract void d0();

    protected d d1() {
        switch(this.b.c()) {
            case 1: 
            case 2: 
            case 3: {
                return d.b;
            }
            case 4: {
                return d.h;
            }
            default: {
                throw new h(String.format("Unexpected ContextType %s.", this.b.c()));
            }
        }
    }

    protected void d2(String s) {
        this.T2();
        String s1 = this.n0();
        if(!s1.equals(s)) {
            throw new T(String.format("Expected element name to be \'%s\', not \'%s\'.", s, s1));
        }
    }

    @Override  // org.bson.P
    public String d3(String s) {
        this.d2(s);
        return this.C1();
    }

    protected abstract void e0();

    protected abstract void f0();

    @Override  // org.bson.P
    public void g0() {
        this.k("readStartDocument", X.e);
        this.x0();
        this.t1(d.b);
    }

    @Override  // org.bson.P
    public void g1() {
        if(this.isClosed()) {
            throw new IllegalStateException("This instance has been closed");
        }
        d a$d0 = d.c;
        if(this.h1() != a$d0) {
            this.N1("skipName", new d[]{a$d0});
        }
        this.t1(d.d);
        this.a1();
    }

    protected abstract ObjectId h0();

    public d h1() {
        return this.a;
    }

    @Override  // org.bson.P
    public long i0(String s) {
        this.d2(s);
        return this.readInt64();
    }

    protected void i1(b a$b0) {
        this.b = a$b0;
    }

    protected boolean isClosed() {
        return this.e;
    }

    @Override  // org.bson.P
    public w j0(String s) {
        this.d2(s);
        return this.M();
    }

    protected void j1(X x0) {
        this.c = x0;
    }

    protected void k(String s, X x0) {
        if(this.isClosed()) {
            throw new IllegalStateException("BsonWriter is closed");
        }
        this.Q1(s, x0);
    }

    @Override  // org.bson.P
    public boolean k0(String s) {
        this.d2(s);
        return this.readBoolean();
    }

    @Override  // org.bson.P
    public ObjectId k1(String s) {
        this.d2(s);
        return this.H();
    }

    protected abstract S l0();

    protected void l1(String s) {
        this.d = s;
    }

    @Override  // org.bson.P
    public S m0() {
        this.k("readRegularExpression", X.m);
        this.t1(this.d1());
        return this.l0();
    }

    @Override  // org.bson.P
    public double m1(String s) {
        this.d2(s);
        return this.readDouble();
    }

    @Override  // org.bson.P
    public long m3() {
        this.k("readDateTime", X.k);
        this.t1(this.d1());
        return this.t();
    }

    protected abstract int n();

    @Override  // org.bson.P
    public String n0() {
        if(this.a == d.b) {
            this.T2();
        }
        d a$d0 = d.c;
        if(this.a != a$d0) {
            this.N1("readName", new d[]{a$d0});
        }
        this.a = d.d;
        return this.d;
    }

    protected abstract byte o();

    @Override  // org.bson.P
    public void o0() {
        this.k("readNull", X.l);
        this.t1(this.d1());
        this.f0();
    }

    protected abstract o p();

    protected abstract boolean q();

    @Override  // org.bson.P
    public void q3() {
        this.k("readStartArray", X.f);
        this.u0();
        this.t1(d.b);
    }

    @Override  // org.bson.P
    public boolean readBoolean() {
        this.k("readBoolean", X.j);
        this.t1(this.d1());
        return this.q();
    }

    @Override  // org.bson.P
    public double readDouble() {
        this.k("readDouble", X.c);
        this.t1(this.d1());
        return this.w();
    }

    @Override  // org.bson.P
    public int readInt32() {
        this.k("readInt32", X.r);
        this.t1(this.d1());
        return this.Q();
    }

    @Override  // org.bson.P
    public long readInt64() {
        this.k("readInt64", X.t);
        this.t1(this.d1());
        return this.R();
    }

    @Override  // org.bson.P
    public String readString() {
        this.k("readString", X.d);
        this.t1(this.d1());
        return this.E0();
    }

    protected abstract w s();

    @Override  // org.bson.P
    public void s1() {
        this.k("readMaxKey", X.w);
        this.t1(this.d1());
        this.d0();
    }

    protected abstract long t();

    protected void t1(d a$d0) {
        this.a = a$d0;
    }

    protected abstract void u0();

    private void u1() {
        switch(this.c1().c()) {
            case 1: 
            case 2: {
                this.t1(d.b);
                return;
            }
            case 4: {
                this.t1(d.h);
                return;
            }
            default: {
                throw new h(String.format("Unexpected ContextType %s.", this.c1().c()));
            }
        }
    }

    protected abstract Decimal128 v();

    @Override  // org.bson.P
    public void v1() {
        if(this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        u u0 = u.c;
        if(this.c1().c() != u0) {
            this.J1("readEndArray", this.c1().c(), new u[]{u0});
        }
        if(this.h1() == d.b) {
            this.T2();
        }
        d a$d0 = d.g;
        if(this.h1() != a$d0) {
            this.N1("ReadEndArray", new d[]{a$d0});
        }
        this.x();
        this.u1();
    }

    protected abstract double w();

    protected abstract void x();

    protected abstract void x0();

    @Override  // org.bson.P
    public String x2(String s) {
        this.d2(s);
        return this.c2();
    }

    @Override  // org.bson.P
    public String y0() {
        d a$d0 = d.d;
        if(this.a != a$d0) {
            this.N1("getCurrentName", new d[]{a$d0});
        }
        return this.d;
    }

    @Override  // org.bson.P
    public String y2() {
        this.k("readJavaScriptWithScope", X.q);
        this.t1(d.e);
        return this.Y();
    }

    @Override  // org.bson.P
    public X z0() {
        return this.c;
    }

    @Override  // org.bson.P
    public void z2(String s) {
        this.d2(s);
        this.G1();
    }

    @Override  // org.bson.P
    public Decimal128 z3(String s) {
        this.d2(s);
        return this.U1();
    }
}

