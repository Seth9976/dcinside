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

public final class s0 extends l0 implements t0 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements t0 {
        private b() {
            super(s0.DEFAULT_INSTANCE);
        }

        b(a s0$a0) {
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
            ((s0)this.b).J2();
            return this;
        }

        public b R1() {
            this.F1();
            ((s0)this.b).K2();
            return this;
        }

        public b S1(u0 u00) {
            this.F1();
            ((s0)this.b).M2(u00);
            return this;
        }

        public b T1(com.google.crypto.tink.proto.u0.b u0$b0) {
            this.F1();
            ((s0)this.b).c3(((u0)u0$b0.B1()));
            return this;
        }

        public b U1(u0 u00) {
            this.F1();
            ((s0)this.b).c3(u00);
            return this;
        }

        public b V1(int v) {
            this.F1();
            ((s0)this.b).d3(v);
            return this;
        }

        @Override  // com.google.crypto.tink.proto.t0
        public u0 a() {
            return ((s0)this.b).a();
        }

        @Override  // com.google.crypto.tink.proto.t0
        public boolean b() {
            return ((s0)this.b).b();
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

        @Override  // com.google.crypto.tink.proto.t0
        public int getVersion() {
            return ((s0)this.b).getVersion();
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

    private static final s0 DEFAULT_INSTANCE = null;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private u0 params_;
    private int version_;

    static {
        s0 s00 = new s0();
        s0.DEFAULT_INSTANCE = s00;
        l0.A2(s0.class, s00);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new s0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(s0.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\u000B", new Object[]{"params_", "version_"});
            }
            case 4: {
                return s0.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = s0.PARSER;
                if(j10 == null) {
                    Class class0 = s0.class;
                    synchronized(class0) {
                        j10 = s0.PARSER;
                        if(j10 == null) {
                            j10 = new c(s0.DEFAULT_INSTANCE);
                            s0.PARSER = j10;
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
        this.params_ = null;
    }

    private void K2() {
        this.version_ = 0;
    }

    public static s0 L2() {
        return s0.DEFAULT_INSTANCE;
    }

    private void M2(u0 u00) {
        u00.getClass();
        if(this.params_ != null && this.params_ != u0.Q2()) {
            this.params_ = (u0)((com.google.crypto.tink.proto.u0.b)u0.S2(this.params_).K1(u00)).C1();
            return;
        }
        this.params_ = u00;
    }

    public static b N2() {
        return (b)s0.DEFAULT_INSTANCE.y1();
    }

    public static b O2(s0 s00) {
        return (b)s0.DEFAULT_INSTANCE.z1(s00);
    }

    public static s0 P2(InputStream inputStream0) throws IOException {
        return (s0)l0.i2(s0.DEFAULT_INSTANCE, inputStream0);
    }

    public static s0 Q2(InputStream inputStream0, V v0) throws IOException {
        return (s0)l0.j2(s0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static s0 R2(u u0) throws y0 {
        return (s0)l0.k2(s0.DEFAULT_INSTANCE, u0);
    }

    public static s0 S2(u u0, V v0) throws y0 {
        return (s0)l0.l2(s0.DEFAULT_INSTANCE, u0, v0);
    }

    public static s0 T2(z z0) throws IOException {
        return (s0)l0.m2(s0.DEFAULT_INSTANCE, z0);
    }

    public static s0 U2(z z0, V v0) throws IOException {
        return (s0)l0.n2(s0.DEFAULT_INSTANCE, z0, v0);
    }

    public static s0 V2(InputStream inputStream0) throws IOException {
        return (s0)l0.o2(s0.DEFAULT_INSTANCE, inputStream0);
    }

    public static s0 W2(InputStream inputStream0, V v0) throws IOException {
        return (s0)l0.p2(s0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static s0 X2(ByteBuffer byteBuffer0) throws y0 {
        return (s0)l0.q2(s0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static s0 Y2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (s0)l0.r2(s0.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static s0 Z2(byte[] arr_b) throws y0 {
        return (s0)l0.s2(s0.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.crypto.tink.proto.t0
    public u0 a() {
        return this.params_ == null ? u0.Q2() : this.params_;
    }

    public static s0 a3(byte[] arr_b, V v0) throws y0 {
        return (s0)l0.t2(s0.DEFAULT_INSTANCE, arr_b, v0);
    }

    @Override  // com.google.crypto.tink.proto.t0
    public boolean b() {
        return this.params_ != null;
    }

    public static j1 b3() {
        return s0.DEFAULT_INSTANCE.getParserForType();
    }

    private void c3(u0 u00) {
        u00.getClass();
        this.params_ = u00;
    }

    private void d3(int v) {
        this.version_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.t0
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

