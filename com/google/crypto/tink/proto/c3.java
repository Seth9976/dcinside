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

public final class c3 extends l0 implements d3 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements d3 {
        private b() {
            super(c3.DEFAULT_INSTANCE);
        }

        b(a c3$a0) {
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
            ((c3)this.b).G2();
            return this;
        }

        public b R1(int v) {
            this.F1();
            ((c3)this.b).X2(v);
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

        @Override  // com.google.crypto.tink.proto.d3
        public int getVersion() {
            return ((c3)this.b).getVersion();
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

    private static final c3 DEFAULT_INSTANCE = null;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        c3 c30 = new c3();
        c3.DEFAULT_INSTANCE = c30;
        l0.A2(c3.class, c30);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new c3();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(c3.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"version_"});
            }
            case 4: {
                return c3.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = c3.PARSER;
                if(j10 == null) {
                    Class class0 = c3.class;
                    synchronized(class0) {
                        j10 = c3.PARSER;
                        if(j10 == null) {
                            j10 = new c(c3.DEFAULT_INSTANCE);
                            c3.PARSER = j10;
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

    private void G2() {
        this.version_ = 0;
    }

    public static c3 H2() {
        return c3.DEFAULT_INSTANCE;
    }

    public static b I2() {
        return (b)c3.DEFAULT_INSTANCE.y1();
    }

    public static b J2(c3 c30) {
        return (b)c3.DEFAULT_INSTANCE.z1(c30);
    }

    public static c3 K2(InputStream inputStream0) throws IOException {
        return (c3)l0.i2(c3.DEFAULT_INSTANCE, inputStream0);
    }

    public static c3 L2(InputStream inputStream0, V v0) throws IOException {
        return (c3)l0.j2(c3.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static c3 M2(u u0) throws y0 {
        return (c3)l0.k2(c3.DEFAULT_INSTANCE, u0);
    }

    public static c3 N2(u u0, V v0) throws y0 {
        return (c3)l0.l2(c3.DEFAULT_INSTANCE, u0, v0);
    }

    public static c3 O2(z z0) throws IOException {
        return (c3)l0.m2(c3.DEFAULT_INSTANCE, z0);
    }

    public static c3 P2(z z0, V v0) throws IOException {
        return (c3)l0.n2(c3.DEFAULT_INSTANCE, z0, v0);
    }

    public static c3 Q2(InputStream inputStream0) throws IOException {
        return (c3)l0.o2(c3.DEFAULT_INSTANCE, inputStream0);
    }

    public static c3 R2(InputStream inputStream0, V v0) throws IOException {
        return (c3)l0.p2(c3.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static c3 S2(ByteBuffer byteBuffer0) throws y0 {
        return (c3)l0.q2(c3.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static c3 T2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (c3)l0.r2(c3.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static c3 U2(byte[] arr_b) throws y0 {
        return (c3)l0.s2(c3.DEFAULT_INSTANCE, arr_b);
    }

    public static c3 V2(byte[] arr_b, V v0) throws y0 {
        return (c3)l0.t2(c3.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 W2() {
        return c3.DEFAULT_INSTANCE.getParserForType();
    }

    private void X2(int v) {
        this.version_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.d3
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

