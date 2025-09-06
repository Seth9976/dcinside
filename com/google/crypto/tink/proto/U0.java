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

public final class u0 extends l0 implements v0 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements v0 {
        private b() {
            super(u0.DEFAULT_INSTANCE);
        }

        b(a u0$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.proto.v0
        public Y0 F() {
            return ((u0)this.b).F();
        }

        @Override  // com.google.crypto.tink.proto.v0
        public int L() {
            return ((u0)this.b).L();
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

        @Override  // com.google.crypto.tink.proto.v0
        public int Q() {
            return ((u0)this.b).Q();
        }

        public b Q1() {
            this.F1();
            ((u0)this.b).N2();
            return this;
        }

        public b R1() {
            this.F1();
            ((u0)this.b).O2();
            return this;
        }

        public b S1() {
            this.F1();
            ((u0)this.b).P2();
            return this;
        }

        @Override  // com.google.crypto.tink.proto.v0
        public V0 T0() {
            return ((u0)this.b).T0();
        }

        public b T1(V0 v00) {
            this.F1();
            ((u0)this.b).g3(v00);
            return this;
        }

        public b U1(int v) {
            this.F1();
            ((u0)this.b).h3(v);
            return this;
        }

        public b V1(A0 a00) {
            this.F1();
            ((u0)this.b).j3(a00);
            return this;
        }

        public b W1(int v) {
            this.F1();
            ((u0)this.b).k3(v);
            return this;
        }

        public b X1(Y0 y00) {
            this.F1();
            ((u0)this.b).l3(y00);
            return this;
        }

        public b Y1(int v) {
            this.F1();
            ((u0)this.b).m3(v);
            return this;
        }

        @Override  // com.google.crypto.tink.proto.v0
        public A0 a0() {
            return ((u0)this.b).a0();
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

        @Override  // com.google.crypto.tink.proto.v0
        public int i0() {
            return ((u0)this.b).i0();
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

    public static final int CURVE_FIELD_NUMBER = 2;
    private static final u0 DEFAULT_INSTANCE = null;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile j1 PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    static {
        u0 u00 = new u0();
        u0.DEFAULT_INSTANCE = u00;
        l0.A2(u0.class, u00);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new u0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(u0.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            }
            case 4: {
                return u0.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = u0.PARSER;
                if(j10 == null) {
                    Class class0 = u0.class;
                    synchronized(class0) {
                        j10 = u0.PARSER;
                        if(j10 == null) {
                            j10 = new c(u0.DEFAULT_INSTANCE);
                            u0.PARSER = j10;
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

    @Override  // com.google.crypto.tink.proto.v0
    public Y0 F() {
        Y0 y00 = Y0.a(this.hashType_);
        return y00 == null ? Y0.h : y00;
    }

    @Override  // com.google.crypto.tink.proto.v0
    public int L() {
        return this.hashType_;
    }

    private void N2() {
        this.curve_ = 0;
    }

    private void O2() {
        this.encoding_ = 0;
    }

    private void P2() {
        this.hashType_ = 0;
    }

    @Override  // com.google.crypto.tink.proto.v0
    public int Q() {
        return this.encoding_;
    }

    public static u0 Q2() {
        return u0.DEFAULT_INSTANCE;
    }

    public static b R2() {
        return (b)u0.DEFAULT_INSTANCE.y1();
    }

    public static b S2(u0 u00) {
        return (b)u0.DEFAULT_INSTANCE.z1(u00);
    }

    @Override  // com.google.crypto.tink.proto.v0
    public V0 T0() {
        V0 v00 = V0.a(this.curve_);
        return v00 == null ? V0.g : v00;
    }

    public static u0 T2(InputStream inputStream0) throws IOException {
        return (u0)l0.i2(u0.DEFAULT_INSTANCE, inputStream0);
    }

    public static u0 U2(InputStream inputStream0, V v0) throws IOException {
        return (u0)l0.j2(u0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static u0 V2(u u0) throws y0 {
        return (u0)l0.k2(u0.DEFAULT_INSTANCE, u0);
    }

    public static u0 W2(u u0, V v0) throws y0 {
        return (u0)l0.l2(u0.DEFAULT_INSTANCE, u0, v0);
    }

    public static u0 X2(z z0) throws IOException {
        return (u0)l0.m2(u0.DEFAULT_INSTANCE, z0);
    }

    public static u0 Y2(z z0, V v0) throws IOException {
        return (u0)l0.n2(u0.DEFAULT_INSTANCE, z0, v0);
    }

    public static u0 Z2(InputStream inputStream0) throws IOException {
        return (u0)l0.o2(u0.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.crypto.tink.proto.v0
    public A0 a0() {
        A0 a00 = A0.a(this.encoding_);
        return a00 == null ? A0.e : a00;
    }

    public static u0 a3(InputStream inputStream0, V v0) throws IOException {
        return (u0)l0.p2(u0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static u0 b3(ByteBuffer byteBuffer0) throws y0 {
        return (u0)l0.q2(u0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static u0 c3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (u0)l0.r2(u0.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static u0 d3(byte[] arr_b) throws y0 {
        return (u0)l0.s2(u0.DEFAULT_INSTANCE, arr_b);
    }

    public static u0 e3(byte[] arr_b, V v0) throws y0 {
        return (u0)l0.t2(u0.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 f3() {
        return u0.DEFAULT_INSTANCE.getParserForType();
    }

    private void g3(V0 v00) {
        this.curve_ = v00.getNumber();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    private void h3(int v) {
        this.curve_ = v;
    }

    @Override  // com.google.crypto.tink.proto.v0
    public int i0() {
        return this.curve_;
    }

    private void j3(A0 a00) {
        this.encoding_ = a00.getNumber();
    }

    private void k3(int v) {
        this.encoding_ = v;
    }

    private void l3(Y0 y00) {
        this.hashType_ = y00.getNumber();
    }

    private void m3(int v) {
        this.hashType_ = v;
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

