package org.bson;

import java.nio.ByteBuffer;
import org.bson.io.d;
import org.bson.io.f;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class p extends a {
    static class org.bson.p.a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[X.values().length];
            org.bson.p.a.b = arr_v;
            try {
                arr_v[X.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.j.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.k.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.c.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.r.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.t.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.u.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.o.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.q.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.w.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.v.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.l.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.i.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.m.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.d.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.p.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.s.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.h.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.b[X.n.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[u.values().length];
            org.bson.p.a.a = arr_v1;
            try {
                arr_v1[u.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.a[u.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                org.bson.p.a.a[u.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public class b extends org.bson.a.b {
        private final int d;
        private final int e;
        final p f;

        b(b p$b0, u u0, int v, int v1) {
            super(p$b0, u0);
            this.d = v;
            this.e = v1;
        }

        @Override  // org.bson.a$b
        protected org.bson.a.b d() {
            return this.g();
        }

        protected b g() {
            return (b)super.d();
        }

        b h(int v) {
            int v1 = v - this.d;
            if(v1 != this.e) {
                throw new T(String.format("Expected size to be %d, not %d.", this.e, v1));
            }
            return this.g();
        }
    }

    public class c extends org.bson.a.c {
        private final int g;
        private final int h;
        private final d i;
        final p j;

        protected c() {
            this.g = p0.i2().d;
            this.h = p0.i2().e;
            this.i = p0.f.I1(0x7FFFFFFF);
        }

        @Override  // org.bson.a$c
        public void reset() {
            super.reset();
            this.i.reset();
            b p$b0 = new b(p.this, ((b)this.b()), this.a(), this.g, this.h);
            p.this.i1(p$b0);
        }
    }

    private final org.bson.io.c f;
    private c g;

    public p(ByteBuffer byteBuffer0) {
        this(new f(new d0(((ByteBuffer)R3.a.e("byteBuffer", byteBuffer0)))));
    }

    public p(org.bson.io.c c0) {
        if(c0 == null) {
            throw new IllegalArgumentException("bsonInput is null");
        }
        this.f = c0;
        this.i1(new b(this, null, u.a, 0, 0));
    }

    @Override  // org.bson.P
    @Deprecated
    public void B() {
        if(this.g != null) {
            throw new h("A mark already exists; it needs to be reset before creating a new one");
        }
        this.g = new c(this);
    }

    @Override  // org.bson.a
    protected String E0() {
        return this.f.readString();
    }

    @Override  // org.bson.a
    protected void L() {
        this.i1(this.i2().h(this.f.getPosition()));
        if(this.i2().c() == u.d) {
            this.i1(this.i2().h(this.f.getPosition()));
        }
    }

    @Override  // org.bson.a
    protected String L0() {
        return this.f.readString();
    }

    @Override  // org.bson.P
    public Q P1() {
        return new c(this);
    }

    @Override  // org.bson.a
    protected int Q() {
        return this.f.readInt32();
    }

    @Override  // org.bson.a
    protected long R() {
        return this.f.readInt64();
    }

    @Override  // org.bson.a
    protected String T() {
        return this.f.readString();
    }

    @Override  // org.bson.a
    protected W T0() {
        return new W(this.f.readInt64());
    }

    @Override  // org.bson.a
    public X T2() {
        if(this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        if(this.h1() != org.bson.a.d.a && this.h1() != org.bson.a.d.h && this.h1() != org.bson.a.d.e) {
            org.bson.a.d a$d0 = org.bson.a.d.b;
            if(this.h1() != a$d0) {
                this.N1("ReadBSONType", new org.bson.a.d[]{a$d0});
            }
            int v = this.f.readByte();
            X x0 = X.a(v);
            if(x0 != null) {
                this.j1(x0);
                X x1 = X.b;
                if(this.z0() == x1) {
                    switch(this.i2().c()) {
                        case 1: {
                            this.t1(org.bson.a.d.g);
                            return x1;
                        }
                        case 2: 
                        case 3: {
                            this.t1(org.bson.a.d.f);
                            return x1;
                        }
                        default: {
                            throw new T(String.format("BSONType EndOfDocument is not valid when ContextType is %s.", this.i2().c()));
                        }
                    }
                }
                switch(this.i2().c()) {
                    case 1: {
                        this.f.J2();
                        this.t1(org.bson.a.d.d);
                        return this.z0();
                    }
                    case 2: 
                    case 3: {
                        this.l1(this.f.h2());
                        this.t1(org.bson.a.d.c);
                        return this.z0();
                    }
                    default: {
                        throw new h("Unexpected ContextType.");
                    }
                }
            }
            throw new T(String.format("Detected unknown BSON type \"\\x%x\" for fieldname \"%s\". Are you using the latest driver version?", ((byte)v), this.f.h2()));
        }
        this.j1(X.e);
        this.t1(org.bson.a.d.d);
        return this.z0();
    }

    @Override  // org.bson.a
    protected String Y() {
        int v = this.f.getPosition();
        int v1 = this.j2();
        this.i1(new b(this, this.i2(), u.d, v, v1));
        return this.f.readString();
    }

    @Override  // org.bson.a
    protected void Y0() {
    }

    @Override  // org.bson.a
    protected void a1() {
    }

    @Override  // org.bson.a
    protected void b1() {
        int v = 0;
        if(this.isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        }
        org.bson.a.d a$d0 = org.bson.a.d.d;
        if(this.h1() != a$d0) {
            this.N1("skipValue", new org.bson.a.d[]{a$d0});
        }
        switch(this.z0()) {
            case 1: {
                v = this.j2() - 4;
                break;
            }
            case 2: {
                v = this.j2() + 1;
                break;
            }
            case 3: {
                v = 1;
                break;
            }
            case 5: {
                v = this.j2() - 4;
                break;
            }
            case 7: {
                v = 4;
                break;
            }
            case 9: {
                v = 16;
                break;
            }
            case 10: {
                v = this.j2();
                break;
            }
            case 11: {
                v = this.j2() - 4;
                break;
            }
            case 15: {
                v = 12;
                break;
            }
            case 16: {
                this.f.J2();
                this.f.J2();
                break;
            }
            case 17: {
                v = this.j2();
                break;
            }
            case 18: {
                v = this.j2();
                break;
            }
            case 4: 
            case 6: 
            case 8: 
            case 19: {
                v = 8;
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 20: {
                break;
            }
            case 21: {
                v = this.j2() + 12;
                break;
            }
            default: {
                throw new h("Unexpected BSON type: " + this.z0());
            }
        }
        this.f.g(v);
        this.t1(org.bson.a.d.b);
    }

    @Override  // org.bson.a
    protected org.bson.a.b c1() {
        return this.i2();
    }

    @Override  // org.bson.a
    public void close() {
        super.close();
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

    public org.bson.io.c g2() {
        return this.f;
    }

    @Override  // org.bson.a
    protected ObjectId h0() {
        return this.f.H();
    }

    protected b i2() {
        return (b)super.c1();
    }

    private int j2() {
        int v = this.f.readInt32();
        if(v < 0) {
            throw new T(String.format("Size %s is not valid because it is negative.", v));
        }
        return v;
    }

    @Override  // org.bson.a
    protected S l0() {
        return new S(this.f.h2(), this.f.h2());
    }

    @Override  // org.bson.a
    protected int n() {
        this.B();
        int v = this.j2();
        this.reset();
        return v;
    }

    @Override  // org.bson.a
    protected byte o() {
        this.B();
        this.j2();
        byte b = this.f.readByte();
        this.reset();
        return b;
    }

    @Override  // org.bson.a
    protected o p() {
        int v = this.j2();
        int v1 = this.f.readByte();
        if(v1 == q.d.a()) {
            if(this.f.readInt32() != v - 4) {
                throw new T("Binary sub type OldBinary has inconsistent sizes");
            }
            v -= 4;
        }
        byte[] arr_b = new byte[v];
        this.f.r2(arr_b);
        return new o(((byte)v1), arr_b);
    }

    @Override  // org.bson.a
    protected boolean q() {
        int v = this.f.readByte();
        if(v != 0 && v != 1) {
            throw new T(String.format("Expected a boolean value but found %d", ((byte)v)));
        }
        return v == 1;
    }

    @Override  // org.bson.P
    @Deprecated
    public void reset() {
        c p$c0 = this.g;
        if(p$c0 == null) {
            throw new h("trying to reset a mark before creating it");
        }
        p$c0.reset();
        this.g = null;
    }

    @Override  // org.bson.a
    protected w s() {
        return new w(this.f.readString(), this.f.H());
    }

    @Override  // org.bson.a
    protected long t() {
        return this.f.readInt64();
    }

    @Override  // org.bson.a
    public void u0() {
        int v = this.f.getPosition();
        int v1 = this.j2();
        this.i1(new b(this, this.i2(), u.c, v, v1));
    }

    @Override  // org.bson.a
    public Decimal128 v() {
        long v = this.f.readInt64();
        return Decimal128.fromIEEE754BIDEncoding(this.f.readInt64(), v);
    }

    @Override  // org.bson.a
    protected double w() {
        return this.f.readDouble();
    }

    @Override  // org.bson.a
    protected void x() {
        this.i1(this.i2().h(this.f.getPosition()));
    }

    @Override  // org.bson.a
    protected void x0() {
        int v = this.f.getPosition();
        int v1 = this.j2();
        this.i1(new b(this, this.i2(), (this.h1() == org.bson.a.d.e ? u.e : u.b), v, v1));
    }
}

