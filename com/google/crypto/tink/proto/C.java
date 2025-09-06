package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.l0.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class c extends l0 implements d {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements d {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        b(a c$a0) {
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
            ((c)this.b).J2();
            return this;
        }

        public b R1() {
            this.F1();
            ((c)this.b).K2();
            return this;
        }

        public b S1(f f0) {
            this.F1();
            ((c)this.b).M2(f0);
            return this;
        }

        public b T1(int v) {
            this.F1();
            ((c)this.b).c3(v);
            return this;
        }

        public b U1(com.google.crypto.tink.proto.f.b f$b0) {
            this.F1();
            ((c)this.b).d3(((f)f$b0.B1()));
            return this;
        }

        public b V1(f f0) {
            this.F1();
            ((c)this.b).d3(f0);
            return this;
        }

        @Override  // com.google.crypto.tink.proto.d
        public f a() {
            return ((c)this.b).a();
        }

        @Override  // com.google.crypto.tink.proto.d
        public boolean b() {
            return ((c)this.b).b();
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

        @Override  // com.google.crypto.tink.proto.d
        public int d() {
            return ((c)this.b).d();
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

    private static final c DEFAULT_INSTANCE = null;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile j1 PARSER;
    private int keySize_;
    private f params_;

    static {
        c c0 = new c();
        c.DEFAULT_INSTANCE = c0;
        l0.A2(c.class, c0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new c();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(c.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\t", new Object[]{"keySize_", "params_"});
            }
            case 4: {
                return c.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = c.PARSER;
                if(j10 == null) {
                    Class class0 = c.class;
                    synchronized(class0) {
                        j10 = c.PARSER;
                        if(j10 == null) {
                            j10 = new com.google.crypto.tink.shaded.protobuf.l0.c(c.DEFAULT_INSTANCE);
                            c.PARSER = j10;
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

    private void J2() {
        this.keySize_ = 0;
    }

    private void K2() {
        this.params_ = null;
    }

    public static c L2() {
        return c.DEFAULT_INSTANCE;
    }

    private void M2(f f0) {
        f0.getClass();
        if(this.params_ != null && this.params_ != f.H2()) {
            this.params_ = (f)((com.google.crypto.tink.proto.f.b)f.J2(this.params_).K1(f0)).C1();
            return;
        }
        this.params_ = f0;
    }

    public static b N2() {
        return (b)c.DEFAULT_INSTANCE.y1();
    }

    public static b O2(c c0) {
        return (b)c.DEFAULT_INSTANCE.z1(c0);
    }

    public static c P2(InputStream inputStream0) throws IOException {
        return (c)l0.i2(c.DEFAULT_INSTANCE, inputStream0);
    }

    public static c Q2(InputStream inputStream0, V v0) throws IOException {
        return (c)l0.j2(c.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static c R2(u u0) throws y0 {
        return (c)l0.k2(c.DEFAULT_INSTANCE, u0);
    }

    public static c S2(u u0, V v0) throws y0 {
        return (c)l0.l2(c.DEFAULT_INSTANCE, u0, v0);
    }

    public static c T2(z z0) throws IOException {
        return (c)l0.m2(c.DEFAULT_INSTANCE, z0);
    }

    public static c U2(z z0, V v0) throws IOException {
        return (c)l0.n2(c.DEFAULT_INSTANCE, z0, v0);
    }

    public static c V2(InputStream inputStream0) throws IOException {
        return (c)l0.o2(c.DEFAULT_INSTANCE, inputStream0);
    }

    public static c W2(InputStream inputStream0, V v0) throws IOException {
        return (c)l0.p2(c.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static c X2(ByteBuffer byteBuffer0) throws y0 {
        return (c)l0.q2(c.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static c Y2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (c)l0.r2(c.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static c Z2(byte[] arr_b) throws y0 {
        return (c)l0.s2(c.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.crypto.tink.proto.d
    public f a() {
        return this.params_ == null ? f.H2() : this.params_;
    }

    public static c a3(byte[] arr_b, V v0) throws y0 {
        return (c)l0.t2(c.DEFAULT_INSTANCE, arr_b, v0);
    }

    @Override  // com.google.crypto.tink.proto.d
    public boolean b() {
        return this.params_ != null;
    }

    public static j1 b3() {
        return c.DEFAULT_INSTANCE.getParserForType();
    }

    private void c3(int v) {
        this.keySize_ = v;
    }

    @Override  // com.google.crypto.tink.proto.d
    public int d() {
        return this.keySize_;
    }

    private void d3(f f0) {
        f0.getClass();
        this.params_ = f0;
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

