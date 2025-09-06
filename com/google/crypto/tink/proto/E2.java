package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.l0.c;
import com.google.crypto.tink.shaded.protobuf.l0.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class e2 extends l0 implements f2 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[i.values().length];
            a.a = arr_v;
            try {
                arr_v[i.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[i.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[i.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[i.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[i.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[i.a.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[i.b.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements f2 {
        private b() {
            super(e2.DEFAULT_INSTANCE);
        }

        b(a e2$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a La(InputStream inputStream0, V v0) throws IOException {
            return super.v1(inputStream0, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a M4(byte[] arr_b, V v0) throws y0 {
            return super.z1(arr_b, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a P4(byte[] arr_b, int v, int v1, V v2) throws y0 {
            return super.M1(arr_b, v, v1, v2);
        }

        public b Q1() {
            this.F1();
            ((e2)this.b).N2();
            return this;
        }

        public b R1() {
            this.F1();
            ((e2)this.b).O2();
            return this;
        }

        public b S1() {
            this.F1();
            ((e2)this.b).P2();
            return this;
        }

        public b T1() {
            this.F1();
            ((e2)this.b).Q2();
            return this;
        }

        public b U1(d2 d20) {
            this.F1();
            ((e2)this.b).h3(d20);
            return this;
        }

        public b V1(int v) {
            this.F1();
            ((e2)this.b).j3(v);
            return this;
        }

        public b W1(int v) {
            this.F1();
            ((e2)this.b).k3(v);
            return this;
        }

        public b X1(u u0) {
            this.F1();
            ((e2)this.b).l3(u0);
            return this;
        }

        public b Y1(int v) {
            this.F1();
            ((e2)this.b).m3(v);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public R0 build() {
            return super.B1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public R0 buildPartial() {
            return super.C1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a ca(R0 r00) {
            return super.t1(r00);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a clear() {
            return super.D1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a clone() {
            return super.E1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public Object clone() throws CloneNotSupportedException {
            return super.E1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a d6(u u0, V v0) throws y0 {
            return super.q1(u0, v0);
        }

        @Override  // com.google.crypto.tink.proto.f2
        public d2 g() {
            return ((e2)this.b).g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
        }

        @Override  // com.google.crypto.tink.proto.f2
        public int getVersion() {
            return ((e2)this.b).getVersion();
        }

        @Override  // com.google.crypto.tink.proto.f2
        public int h() {
            return ((e2)this.b).h();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a i3(u u0) throws y0 {
            return super.p1(u0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a j9(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a m1() {
            return super.E1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a mergeFrom(InputStream inputStream0) throws IOException {
            return super.u1(inputStream0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a mergeFrom(byte[] arr_b) throws y0 {
            return super.w1(arr_b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a mergeFrom(byte[] arr_b, int v, int v1) throws y0 {
            return super.L1(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.proto.f2
        public int n() {
            return ((e2)this.b).n();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        protected com.google.crypto.tink.shaded.protobuf.a.a o1(com.google.crypto.tink.shaded.protobuf.a a0) {
            return super.I1(((l0)a0));
        }

        @Override  // com.google.crypto.tink.proto.f2
        public u p() {
            return ((e2)this.b).p();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a s1(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a x1(byte[] arr_b, int v, int v1) throws y0 {
            return super.L1(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a y1(byte[] arr_b, int v, int v1, V v2) throws y0 {
            return super.M1(arr_b, v, v1, v2);
        }
    }

    public static final int ALGORITHM_FIELD_NUMBER = 2;
    private static final e2 DEFAULT_INSTANCE = null;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private int modulusSizeInBits_;
    private u publicExponent_;
    private int version_;

    static {
        e2 e20 = new e2();
        e2.DEFAULT_INSTANCE = e20;
        l0.A2(e2.class, e20);
    }

    private e2() {
        this.publicExponent_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new e2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(e2.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000B\u0002\f\u0003\u000B\u0004\n", new Object[]{"version_", "algorithm_", "modulusSizeInBits_", "publicExponent_"});
            }
            case 4: {
                return e2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = e2.PARSER;
                if(j10 == null) {
                    Class class0 = e2.class;
                    synchronized(class0) {
                        j10 = e2.PARSER;
                        if(j10 == null) {
                            j10 = new c(e2.DEFAULT_INSTANCE);
                            e2.PARSER = j10;
                        }
                    }
                }
                return j10;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    private void N2() {
        this.algorithm_ = 0;
    }

    private void O2() {
        this.modulusSizeInBits_ = 0;
    }

    private void P2() {
        this.publicExponent_ = e2.R2().p();
    }

    private void Q2() {
        this.version_ = 0;
    }

    public static e2 R2() {
        return e2.DEFAULT_INSTANCE;
    }

    public static b S2() {
        return (b)e2.DEFAULT_INSTANCE.y1();
    }

    public static b T2(e2 e20) {
        return (b)e2.DEFAULT_INSTANCE.z1(e20);
    }

    public static e2 U2(InputStream inputStream0) throws IOException {
        return (e2)l0.i2(e2.DEFAULT_INSTANCE, inputStream0);
    }

    public static e2 V2(InputStream inputStream0, V v0) throws IOException {
        return (e2)l0.j2(e2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static e2 W2(u u0) throws y0 {
        return (e2)l0.k2(e2.DEFAULT_INSTANCE, u0);
    }

    public static e2 X2(u u0, V v0) throws y0 {
        return (e2)l0.l2(e2.DEFAULT_INSTANCE, u0, v0);
    }

    public static e2 Y2(z z0) throws IOException {
        return (e2)l0.m2(e2.DEFAULT_INSTANCE, z0);
    }

    public static e2 Z2(z z0, V v0) throws IOException {
        return (e2)l0.n2(e2.DEFAULT_INSTANCE, z0, v0);
    }

    public static e2 a3(InputStream inputStream0) throws IOException {
        return (e2)l0.o2(e2.DEFAULT_INSTANCE, inputStream0);
    }

    public static e2 b3(InputStream inputStream0, V v0) throws IOException {
        return (e2)l0.p2(e2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static e2 c3(ByteBuffer byteBuffer0) throws y0 {
        return (e2)l0.q2(e2.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static e2 d3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (e2)l0.r2(e2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static e2 e3(byte[] arr_b) throws y0 {
        return (e2)l0.s2(e2.DEFAULT_INSTANCE, arr_b);
    }

    public static e2 f3(byte[] arr_b, V v0) throws y0 {
        return (e2)l0.t2(e2.DEFAULT_INSTANCE, arr_b, v0);
    }

    @Override  // com.google.crypto.tink.proto.f2
    public d2 g() {
        d2 d20 = d2.a(this.algorithm_);
        return d20 == null ? d2.f : d20;
    }

    public static j1 g3() {
        return e2.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.f2
    public int getVersion() {
        return this.version_;
    }

    @Override  // com.google.crypto.tink.proto.f2
    public int h() {
        return this.algorithm_;
    }

    private void h3(d2 d20) {
        this.algorithm_ = d20.getNumber();
    }

    private void j3(int v) {
        this.algorithm_ = v;
    }

    private void k3(int v) {
        this.modulusSizeInBits_ = v;
    }

    private void l3(u u0) {
        u0.getClass();
        this.publicExponent_ = u0;
    }

    private void m3(int v) {
        this.version_ = v;
    }

    @Override  // com.google.crypto.tink.proto.f2
    public int n() {
        return this.modulusSizeInBits_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.proto.f2
    public u p() {
        return this.publicExponent_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }
}

