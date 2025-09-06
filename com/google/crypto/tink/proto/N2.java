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

public final class n2 extends l0 implements o2 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements o2 {
        private b() {
            super(n2.DEFAULT_INSTANCE);
        }

        b(a n2$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.proto.o2
        public int C() {
            return ((n2)this.b).C();
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
            ((n2)this.b).M2();
            return this;
        }

        public b R1() {
            this.F1();
            ((n2)this.b).N2();
            return this;
        }

        public b S1() {
            this.F1();
            ((n2)this.b).O2();
            return this;
        }

        public b T1(F2 f20) {
            this.F1();
            ((n2)this.b).f3(f20);
            return this;
        }

        public b U1(int v) {
            this.F1();
            ((n2)this.b).g3(v);
            return this;
        }

        public b V1(String s) {
            this.F1();
            ((n2)this.b).h3(s);
            return this;
        }

        public b W1(u u0) {
            this.F1();
            ((n2)this.b).j3(u0);
            return this;
        }

        public b X1(u u0) {
            this.F1();
            ((n2)this.b).k3(u0);
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

        @Override  // com.google.crypto.tink.proto.o2
        public String getTypeUrl() {
            return ((n2)this.b).getTypeUrl();
        }

        @Override  // com.google.crypto.tink.proto.o2
        public u getTypeUrlBytes() {
            return ((n2)this.b).getTypeUrlBytes();
        }

        @Override  // com.google.crypto.tink.proto.o2
        public u getValue() {
            return ((n2)this.b).getValue();
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

        @Override  // com.google.crypto.tink.proto.o2
        public F2 y() {
            return ((n2)this.b).y();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a y1(byte[] arr_b, int v, int v1, V v2) throws y0 {
            return super.M1(arr_b, v, v1, v2);
        }
    }

    private static final n2 DEFAULT_INSTANCE = null;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_;
    private u value_;

    static {
        n2 n20 = new n2();
        n2.DEFAULT_INSTANCE = n20;
        l0.A2(n2.class, n20);
    }

    private n2() {
        this.typeUrl_ = "";
        this.value_ = u.e;
    }

    @Override  // com.google.crypto.tink.proto.o2
    public int C() {
        return this.outputPrefixType_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new n2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(n2.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            }
            case 4: {
                return n2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = n2.PARSER;
                if(j10 == null) {
                    Class class0 = n2.class;
                    synchronized(class0) {
                        j10 = n2.PARSER;
                        if(j10 == null) {
                            j10 = new c(n2.DEFAULT_INSTANCE);
                            n2.PARSER = j10;
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

    private void M2() {
        this.outputPrefixType_ = 0;
    }

    private void N2() {
        this.typeUrl_ = "";
    }

    private void O2() {
        this.value_ = n2.P2().getValue();
    }

    public static n2 P2() {
        return n2.DEFAULT_INSTANCE;
    }

    public static b Q2() {
        return (b)n2.DEFAULT_INSTANCE.y1();
    }

    public static b R2(n2 n20) {
        return (b)n2.DEFAULT_INSTANCE.z1(n20);
    }

    public static n2 S2(InputStream inputStream0) throws IOException {
        return (n2)l0.i2(n2.DEFAULT_INSTANCE, inputStream0);
    }

    public static n2 T2(InputStream inputStream0, V v0) throws IOException {
        return (n2)l0.j2(n2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static n2 U2(u u0) throws y0 {
        return (n2)l0.k2(n2.DEFAULT_INSTANCE, u0);
    }

    public static n2 V2(u u0, V v0) throws y0 {
        return (n2)l0.l2(n2.DEFAULT_INSTANCE, u0, v0);
    }

    public static n2 W2(z z0) throws IOException {
        return (n2)l0.m2(n2.DEFAULT_INSTANCE, z0);
    }

    public static n2 X2(z z0, V v0) throws IOException {
        return (n2)l0.n2(n2.DEFAULT_INSTANCE, z0, v0);
    }

    public static n2 Y2(InputStream inputStream0) throws IOException {
        return (n2)l0.o2(n2.DEFAULT_INSTANCE, inputStream0);
    }

    public static n2 Z2(InputStream inputStream0, V v0) throws IOException {
        return (n2)l0.p2(n2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static n2 a3(ByteBuffer byteBuffer0) throws y0 {
        return (n2)l0.q2(n2.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static n2 b3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (n2)l0.r2(n2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static n2 c3(byte[] arr_b) throws y0 {
        return (n2)l0.s2(n2.DEFAULT_INSTANCE, arr_b);
    }

    public static n2 d3(byte[] arr_b, V v0) throws y0 {
        return (n2)l0.t2(n2.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 e3() {
        return n2.DEFAULT_INSTANCE.getParserForType();
    }

    private void f3(F2 f20) {
        this.outputPrefixType_ = f20.getNumber();
    }

    private void g3(int v) {
        this.outputPrefixType_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.o2
    public String getTypeUrl() [...] // 潜在的解密器

    @Override  // com.google.crypto.tink.proto.o2
    public u getTypeUrlBytes() {
        return u.r(this.typeUrl_);
    }

    @Override  // com.google.crypto.tink.proto.o2
    public u getValue() {
        return this.value_;
    }

    private void h3(String s) {
        s.getClass();
        this.typeUrl_ = s;
    }

    private void j3(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.typeUrl_ = u0.i0();
    }

    private void k3(u u0) {
        u0.getClass();
        this.value_ = u0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }

    @Override  // com.google.crypto.tink.proto.o2
    public F2 y() {
        F2 f20 = F2.a(this.outputPrefixType_);
        return f20 == null ? F2.g : f20;
    }
}

