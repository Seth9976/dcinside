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

public final class l1 extends l0 implements m1 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements m1 {
        private b() {
            super(l1.DEFAULT_INSTANCE);
        }

        b(a l1$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.proto.m1
        public int E() {
            return ((l1)this.b).E();
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
            ((l1)this.b).J2();
            return this;
        }

        public b R1() {
            this.F1();
            ((l1)this.b).K2();
            return this;
        }

        public b S1(Y0 y00) {
            this.F1();
            ((l1)this.b).b3(y00);
            return this;
        }

        public b T1(int v) {
            this.F1();
            ((l1)this.b).c3(v);
            return this;
        }

        public b U1(int v) {
            this.F1();
            ((l1)this.b).d3(v);
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

        @Override  // com.google.crypto.tink.proto.m1
        public Y0 j() {
            return ((l1)this.b).j();
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

        @Override  // com.google.crypto.tink.proto.m1
        public int z() {
            return ((l1)this.b).z();
        }
    }

    private static final l1 DEFAULT_INSTANCE = null;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile j1 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        l1 l10 = new l1();
        l1.DEFAULT_INSTANCE = l10;
        l0.A2(l1.class, l10);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new l1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(l1.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000B", new Object[]{"hash_", "tagSize_"});
            }
            case 4: {
                return l1.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = l1.PARSER;
                if(j10 == null) {
                    Class class0 = l1.class;
                    synchronized(class0) {
                        j10 = l1.PARSER;
                        if(j10 == null) {
                            j10 = new c(l1.DEFAULT_INSTANCE);
                            l1.PARSER = j10;
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

    @Override  // com.google.crypto.tink.proto.m1
    public int E() {
        return this.tagSize_;
    }

    private void J2() {
        this.hash_ = 0;
    }

    private void K2() {
        this.tagSize_ = 0;
    }

    public static l1 L2() {
        return l1.DEFAULT_INSTANCE;
    }

    public static b M2() {
        return (b)l1.DEFAULT_INSTANCE.y1();
    }

    public static b N2(l1 l10) {
        return (b)l1.DEFAULT_INSTANCE.z1(l10);
    }

    public static l1 O2(InputStream inputStream0) throws IOException {
        return (l1)l0.i2(l1.DEFAULT_INSTANCE, inputStream0);
    }

    public static l1 P2(InputStream inputStream0, V v0) throws IOException {
        return (l1)l0.j2(l1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static l1 Q2(u u0) throws y0 {
        return (l1)l0.k2(l1.DEFAULT_INSTANCE, u0);
    }

    public static l1 R2(u u0, V v0) throws y0 {
        return (l1)l0.l2(l1.DEFAULT_INSTANCE, u0, v0);
    }

    public static l1 S2(z z0) throws IOException {
        return (l1)l0.m2(l1.DEFAULT_INSTANCE, z0);
    }

    public static l1 T2(z z0, V v0) throws IOException {
        return (l1)l0.n2(l1.DEFAULT_INSTANCE, z0, v0);
    }

    public static l1 U2(InputStream inputStream0) throws IOException {
        return (l1)l0.o2(l1.DEFAULT_INSTANCE, inputStream0);
    }

    public static l1 V2(InputStream inputStream0, V v0) throws IOException {
        return (l1)l0.p2(l1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static l1 W2(ByteBuffer byteBuffer0) throws y0 {
        return (l1)l0.q2(l1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static l1 X2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (l1)l0.r2(l1.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static l1 Y2(byte[] arr_b) throws y0 {
        return (l1)l0.s2(l1.DEFAULT_INSTANCE, arr_b);
    }

    public static l1 Z2(byte[] arr_b, V v0) throws y0 {
        return (l1)l0.t2(l1.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 a3() {
        return l1.DEFAULT_INSTANCE.getParserForType();
    }

    private void b3(Y0 y00) {
        this.hash_ = y00.getNumber();
    }

    private void c3(int v) {
        this.hash_ = v;
    }

    private void d3(int v) {
        this.tagSize_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.m1
    public Y0 j() {
        Y0 y00 = Y0.a(this.hash_);
        return y00 == null ? Y0.h : y00;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }

    @Override  // com.google.crypto.tink.proto.m1
    public int z() {
        return this.hash_;
    }
}

