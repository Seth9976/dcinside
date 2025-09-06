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

public final class p extends l0 implements q {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements q {
        private b() {
            super(p.DEFAULT_INSTANCE);
        }

        b(a p$a0) {
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

        @Override  // com.google.crypto.tink.proto.q
        public boolean O0() {
            return ((p)this.b).O0();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a P4(byte[] arr_b, int v, int v1, V v2) throws y0 {
            return super.M1(arr_b, v, v1, v2);
        }

        public b Q1() {
            this.F1();
            ((p)this.b).K2();
            return this;
        }

        public b R1() {
            this.F1();
            ((p)this.b).L2();
            return this;
        }

        @Override  // com.google.crypto.tink.proto.q
        public boolean S0() {
            return ((p)this.b).S0();
        }

        public b S1(A a0) {
            this.F1();
            ((p)this.b).N2(a0);
            return this;
        }

        public b T1(i1 i10) {
            this.F1();
            ((p)this.b).O2(i10);
            return this;
        }

        public b U1(com.google.crypto.tink.proto.A.b a$b0) {
            this.F1();
            ((p)this.b).e3(((A)a$b0.B1()));
            return this;
        }

        @Override  // com.google.crypto.tink.proto.q
        public i1 V() {
            return ((p)this.b).V();
        }

        public b V1(A a0) {
            this.F1();
            ((p)this.b).e3(a0);
            return this;
        }

        @Override  // com.google.crypto.tink.proto.q
        public A W0() {
            return ((p)this.b).W0();
        }

        public b W1(com.google.crypto.tink.proto.i1.b i1$b0) {
            this.F1();
            ((p)this.b).f3(((i1)i1$b0.B1()));
            return this;
        }

        public b X1(i1 i10) {
            this.F1();
            ((p)this.b).f3(i10);
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

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a x1(byte[] arr_b, int v, int v1) throws y0 {
            return super.L1(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a y1(byte[] arr_b, int v, int v1, V v2) throws y0 {
            return super.M1(arr_b, v, v1, v2);
        }
    }

    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE = null;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile j1 PARSER;
    private A aesCtrKeyFormat_;
    private i1 hmacKeyFormat_;

    static {
        p p0 = new p();
        p.DEFAULT_INSTANCE = p0;
        l0.A2(p.class, p0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new p();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(p.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            }
            case 4: {
                return p.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = p.PARSER;
                if(j10 == null) {
                    Class class0 = p.class;
                    synchronized(class0) {
                        j10 = p.PARSER;
                        if(j10 == null) {
                            j10 = new c(p.DEFAULT_INSTANCE);
                            p.PARSER = j10;
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

    private void K2() {
        this.aesCtrKeyFormat_ = null;
    }

    private void L2() {
        this.hmacKeyFormat_ = null;
    }

    public static p M2() {
        return p.DEFAULT_INSTANCE;
    }

    private void N2(A a0) {
        a0.getClass();
        if(this.aesCtrKeyFormat_ != null && this.aesCtrKeyFormat_ != A.L2()) {
            this.aesCtrKeyFormat_ = (A)((com.google.crypto.tink.proto.A.b)A.O2(this.aesCtrKeyFormat_).K1(a0)).C1();
            return;
        }
        this.aesCtrKeyFormat_ = a0;
    }

    @Override  // com.google.crypto.tink.proto.q
    public boolean O0() {
        return this.hmacKeyFormat_ != null;
    }

    private void O2(i1 i10) {
        i10.getClass();
        if(this.hmacKeyFormat_ != null && this.hmacKeyFormat_ != i1.O2()) {
            this.hmacKeyFormat_ = (i1)((com.google.crypto.tink.proto.i1.b)i1.R2(this.hmacKeyFormat_).K1(i10)).C1();
            return;
        }
        this.hmacKeyFormat_ = i10;
    }

    public static b P2() {
        return (b)p.DEFAULT_INSTANCE.y1();
    }

    public static b Q2(p p0) {
        return (b)p.DEFAULT_INSTANCE.z1(p0);
    }

    public static p R2(InputStream inputStream0) throws IOException {
        return (p)l0.i2(p.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.crypto.tink.proto.q
    public boolean S0() {
        return this.aesCtrKeyFormat_ != null;
    }

    public static p S2(InputStream inputStream0, V v0) throws IOException {
        return (p)l0.j2(p.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static p T2(u u0) throws y0 {
        return (p)l0.k2(p.DEFAULT_INSTANCE, u0);
    }

    public static p U2(u u0, V v0) throws y0 {
        return (p)l0.l2(p.DEFAULT_INSTANCE, u0, v0);
    }

    @Override  // com.google.crypto.tink.proto.q
    public i1 V() {
        return this.hmacKeyFormat_ == null ? i1.O2() : this.hmacKeyFormat_;
    }

    public static p V2(z z0) throws IOException {
        return (p)l0.m2(p.DEFAULT_INSTANCE, z0);
    }

    @Override  // com.google.crypto.tink.proto.q
    public A W0() {
        return this.aesCtrKeyFormat_ == null ? A.L2() : this.aesCtrKeyFormat_;
    }

    public static p W2(z z0, V v0) throws IOException {
        return (p)l0.n2(p.DEFAULT_INSTANCE, z0, v0);
    }

    public static p X2(InputStream inputStream0) throws IOException {
        return (p)l0.o2(p.DEFAULT_INSTANCE, inputStream0);
    }

    public static p Y2(InputStream inputStream0, V v0) throws IOException {
        return (p)l0.p2(p.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static p Z2(ByteBuffer byteBuffer0) throws y0 {
        return (p)l0.q2(p.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static p a3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (p)l0.r2(p.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static p b3(byte[] arr_b) throws y0 {
        return (p)l0.s2(p.DEFAULT_INSTANCE, arr_b);
    }

    public static p c3(byte[] arr_b, V v0) throws y0 {
        return (p)l0.t2(p.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 d3() {
        return p.DEFAULT_INSTANCE.getParserForType();
    }

    private void e3(A a0) {
        a0.getClass();
        this.aesCtrKeyFormat_ = a0;
    }

    private void f3(i1 i10) {
        i10.getClass();
        this.hmacKeyFormat_ = i10;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }
}

