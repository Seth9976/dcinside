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

public final class j extends l0 implements k {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements k {
        private b() {
            super(j.DEFAULT_INSTANCE);
        }

        b(a j$a0) {
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
            ((j)this.b).I2();
            return this;
        }

        public b R1() {
            this.F1();
            ((j)this.b).J2();
            return this;
        }

        public b S1(int v) {
            this.F1();
            ((j)this.b).a3(v);
            return this;
        }

        public b T1(int v) {
            this.F1();
            ((j)this.b).b3(v);
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

        @Override  // com.google.crypto.tink.proto.k
        public int d() {
            return ((j)this.b).d();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a d6(u u0, V v0) throws y0 {
            return super.q1(u0, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
        }

        @Override  // com.google.crypto.tink.proto.k
        public int getVersion() {
            return ((j)this.b).getVersion();
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

    private static final j DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        j j0 = new j();
        j.DEFAULT_INSTANCE = j0;
        l0.A2(j.class, j0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new j();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(j.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\u000B", new Object[]{"keySize_", "version_"});
            }
            case 4: {
                return j.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = j.PARSER;
                if(j10 == null) {
                    Class class0 = j.class;
                    synchronized(class0) {
                        j10 = j.PARSER;
                        if(j10 == null) {
                            j10 = new c(j.DEFAULT_INSTANCE);
                            j.PARSER = j10;
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

    private void I2() {
        this.keySize_ = 0;
    }

    private void J2() {
        this.version_ = 0;
    }

    public static j K2() {
        return j.DEFAULT_INSTANCE;
    }

    public static b L2() {
        return (b)j.DEFAULT_INSTANCE.y1();
    }

    public static b M2(j j0) {
        return (b)j.DEFAULT_INSTANCE.z1(j0);
    }

    public static j N2(InputStream inputStream0) throws IOException {
        return (j)l0.i2(j.DEFAULT_INSTANCE, inputStream0);
    }

    public static j O2(InputStream inputStream0, V v0) throws IOException {
        return (j)l0.j2(j.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static j P2(u u0) throws y0 {
        return (j)l0.k2(j.DEFAULT_INSTANCE, u0);
    }

    public static j Q2(u u0, V v0) throws y0 {
        return (j)l0.l2(j.DEFAULT_INSTANCE, u0, v0);
    }

    public static j R2(z z0) throws IOException {
        return (j)l0.m2(j.DEFAULT_INSTANCE, z0);
    }

    public static j S2(z z0, V v0) throws IOException {
        return (j)l0.n2(j.DEFAULT_INSTANCE, z0, v0);
    }

    public static j T2(InputStream inputStream0) throws IOException {
        return (j)l0.o2(j.DEFAULT_INSTANCE, inputStream0);
    }

    public static j U2(InputStream inputStream0, V v0) throws IOException {
        return (j)l0.p2(j.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static j V2(ByteBuffer byteBuffer0) throws y0 {
        return (j)l0.q2(j.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static j W2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (j)l0.r2(j.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static j X2(byte[] arr_b) throws y0 {
        return (j)l0.s2(j.DEFAULT_INSTANCE, arr_b);
    }

    public static j Y2(byte[] arr_b, V v0) throws y0 {
        return (j)l0.t2(j.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 Z2() {
        return j.DEFAULT_INSTANCE.getParserForType();
    }

    private void a3(int v) {
        this.keySize_ = v;
    }

    private void b3(int v) {
        this.version_ = v;
    }

    @Override  // com.google.crypto.tink.proto.k
    public int d() {
        return this.keySize_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.k
    public int getVersion() {
        return this.version_;
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

