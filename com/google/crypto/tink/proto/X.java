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

public final class x extends l0 implements y {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements y {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        b(a x$a0) {
        }

        @Override  // com.google.crypto.tink.proto.y
        public int A() {
            return ((x)this.b).A();
        }

        @Override  // com.google.crypto.tink.proto.y
        public Y0 B() {
            return ((x)this.b).B();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.proto.y
        public int G() {
            return ((x)this.b).G();
        }

        @Override  // com.google.crypto.tink.proto.y
        public int K() {
            return ((x)this.b).K();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a La(InputStream inputStream0, V v0) throws IOException {
            return super.v1(inputStream0, v0);
        }

        @Override  // com.google.crypto.tink.proto.y
        public l1 M0() {
            return ((x)this.b).M0();
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
            ((x)this.b).O2();
            return this;
        }

        public b R1() {
            this.F1();
            ((x)this.b).P2();
            return this;
        }

        public b S1() {
            this.F1();
            ((x)this.b).Q2();
            return this;
        }

        public b T1() {
            this.F1();
            ((x)this.b).R2();
            return this;
        }

        public b U1(l1 l10) {
            this.F1();
            ((x)this.b).T2(l10);
            return this;
        }

        public b V1(int v) {
            this.F1();
            ((x)this.b).k3(v);
            return this;
        }

        public b W1(int v) {
            this.F1();
            ((x)this.b).l3(v);
            return this;
        }

        public b X1(Y0 y00) {
            this.F1();
            ((x)this.b).m3(y00);
            return this;
        }

        public b Y1(int v) {
            this.F1();
            ((x)this.b).n3(v);
            return this;
        }

        public b Z1(com.google.crypto.tink.proto.l1.b l1$b0) {
            this.F1();
            ((x)this.b).o3(((l1)l1$b0.B1()));
            return this;
        }

        public b a2(l1 l10) {
            this.F1();
            ((x)this.b).o3(l10);
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

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
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

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        protected com.google.crypto.tink.shaded.protobuf.a.a o1(com.google.crypto.tink.shaded.protobuf.a a0) {
            return super.I1(((l0)a0));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a s1(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.proto.y
        public boolean w0() {
            return ((x)this.b).w0();
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

    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE = null;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile j1 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private l1 hmacParams_;

    static {
        x x0 = new x();
        x.DEFAULT_INSTANCE = x0;
        l0.A2(x.class, x0);
    }

    @Override  // com.google.crypto.tink.proto.y
    public int A() {
        return this.hkdfHashType_;
    }

    @Override  // com.google.crypto.tink.proto.y
    public Y0 B() {
        Y0 y00 = Y0.a(this.hkdfHashType_);
        return y00 == null ? Y0.h : y00;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new x();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(x.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000B\u0002\u000B\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            }
            case 4: {
                return x.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = x.PARSER;
                if(j10 == null) {
                    Class class0 = x.class;
                    synchronized(class0) {
                        j10 = x.PARSER;
                        if(j10 == null) {
                            j10 = new c(x.DEFAULT_INSTANCE);
                            x.PARSER = j10;
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

    @Override  // com.google.crypto.tink.proto.y
    public int G() {
        return this.ciphertextSegmentSize_;
    }

    @Override  // com.google.crypto.tink.proto.y
    public int K() {
        return this.derivedKeySize_;
    }

    @Override  // com.google.crypto.tink.proto.y
    public l1 M0() {
        return this.hmacParams_ == null ? l1.L2() : this.hmacParams_;
    }

    private void O2() {
        this.ciphertextSegmentSize_ = 0;
    }

    private void P2() {
        this.derivedKeySize_ = 0;
    }

    private void Q2() {
        this.hkdfHashType_ = 0;
    }

    private void R2() {
        this.hmacParams_ = null;
    }

    public static x S2() {
        return x.DEFAULT_INSTANCE;
    }

    private void T2(l1 l10) {
        l10.getClass();
        if(this.hmacParams_ != null && this.hmacParams_ != l1.L2()) {
            this.hmacParams_ = (l1)((com.google.crypto.tink.proto.l1.b)l1.N2(this.hmacParams_).K1(l10)).C1();
            return;
        }
        this.hmacParams_ = l10;
    }

    public static b U2() {
        return (b)x.DEFAULT_INSTANCE.y1();
    }

    public static b V2(x x0) {
        return (b)x.DEFAULT_INSTANCE.z1(x0);
    }

    public static x W2(InputStream inputStream0) throws IOException {
        return (x)l0.i2(x.DEFAULT_INSTANCE, inputStream0);
    }

    public static x X2(InputStream inputStream0, V v0) throws IOException {
        return (x)l0.j2(x.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static x Y2(u u0) throws y0 {
        return (x)l0.k2(x.DEFAULT_INSTANCE, u0);
    }

    public static x Z2(u u0, V v0) throws y0 {
        return (x)l0.l2(x.DEFAULT_INSTANCE, u0, v0);
    }

    public static x a3(z z0) throws IOException {
        return (x)l0.m2(x.DEFAULT_INSTANCE, z0);
    }

    public static x b3(z z0, V v0) throws IOException {
        return (x)l0.n2(x.DEFAULT_INSTANCE, z0, v0);
    }

    public static x c3(InputStream inputStream0) throws IOException {
        return (x)l0.o2(x.DEFAULT_INSTANCE, inputStream0);
    }

    public static x d3(InputStream inputStream0, V v0) throws IOException {
        return (x)l0.p2(x.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static x e3(ByteBuffer byteBuffer0) throws y0 {
        return (x)l0.q2(x.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static x f3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (x)l0.r2(x.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static x g3(byte[] arr_b) throws y0 {
        return (x)l0.s2(x.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    public static x h3(byte[] arr_b, V v0) throws y0 {
        return (x)l0.t2(x.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 j3() {
        return x.DEFAULT_INSTANCE.getParserForType();
    }

    private void k3(int v) {
        this.ciphertextSegmentSize_ = v;
    }

    private void l3(int v) {
        this.derivedKeySize_ = v;
    }

    private void m3(Y0 y00) {
        this.hkdfHashType_ = y00.getNumber();
    }

    private void n3(int v) {
        this.hkdfHashType_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    private void o3(l1 l10) {
        l10.getClass();
        this.hmacParams_ = l10;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }

    @Override  // com.google.crypto.tink.proto.y
    public boolean w0() {
        return this.hmacParams_ != null;
    }
}

