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

public final class a1 extends l0 implements d1 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements d1 {
        private b() {
            super(a1.DEFAULT_INSTANCE);
        }

        b(a a1$a0) {
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
            ((a1)this.b).L2();
            return this;
        }

        public b R1() {
            this.F1();
            ((a1)this.b).M2();
            return this;
        }

        public b S1() {
            this.F1();
            ((a1)this.b).N2();
            return this;
        }

        public b T1(e1 e10) {
            this.F1();
            ((a1)this.b).P2(e10);
            return this;
        }

        public b U1(u u0) {
            this.F1();
            ((a1)this.b).f3(u0);
            return this;
        }

        public b V1(com.google.crypto.tink.proto.e1.b e1$b0) {
            this.F1();
            ((a1)this.b).g3(((e1)e1$b0.B1()));
            return this;
        }

        public b W1(e1 e10) {
            this.F1();
            ((a1)this.b).g3(e10);
            return this;
        }

        public b X1(int v) {
            this.F1();
            ((a1)this.b).h3(v);
            return this;
        }

        @Override  // com.google.crypto.tink.proto.d1
        public e1 a() {
            return ((a1)this.b).a();
        }

        @Override  // com.google.crypto.tink.proto.d1
        public boolean b() {
            return ((a1)this.b).b();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public R0 build() {
            return super.B1();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public R0 buildPartial() {
            return super.C1();
        }

        @Override  // com.google.crypto.tink.proto.d1
        public u c() {
            return ((a1)this.b).c();
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

        @Override  // com.google.crypto.tink.proto.d1
        public int getVersion() {
            return ((a1)this.b).getVersion();
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

    private static final a1 DEFAULT_INSTANCE = null;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private u keyValue_;
    private e1 params_;
    private int version_;

    static {
        a1 a10 = new a1();
        a1.DEFAULT_INSTANCE = a10;
        l0.A2(a1.class, a10);
    }

    private a1() {
        this.keyValue_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new a1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(a1.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            }
            case 4: {
                return a1.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = a1.PARSER;
                if(j10 == null) {
                    Class class0 = a1.class;
                    synchronized(class0) {
                        j10 = a1.PARSER;
                        if(j10 == null) {
                            j10 = new c(a1.DEFAULT_INSTANCE);
                            a1.PARSER = j10;
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

    private void L2() {
        this.keyValue_ = a1.O2().c();
    }

    private void M2() {
        this.params_ = null;
    }

    private void N2() {
        this.version_ = 0;
    }

    public static a1 O2() {
        return a1.DEFAULT_INSTANCE;
    }

    private void P2(e1 e10) {
        e10.getClass();
        if(this.params_ != null && this.params_ != e1.L2()) {
            this.params_ = (e1)((com.google.crypto.tink.proto.e1.b)e1.N2(this.params_).K1(e10)).C1();
            return;
        }
        this.params_ = e10;
    }

    public static b Q2() {
        return (b)a1.DEFAULT_INSTANCE.y1();
    }

    public static b R2(a1 a10) {
        return (b)a1.DEFAULT_INSTANCE.z1(a10);
    }

    public static a1 S2(InputStream inputStream0) throws IOException {
        return (a1)l0.i2(a1.DEFAULT_INSTANCE, inputStream0);
    }

    public static a1 T2(InputStream inputStream0, V v0) throws IOException {
        return (a1)l0.j2(a1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static a1 U2(u u0) throws y0 {
        return (a1)l0.k2(a1.DEFAULT_INSTANCE, u0);
    }

    public static a1 V2(u u0, V v0) throws y0 {
        return (a1)l0.l2(a1.DEFAULT_INSTANCE, u0, v0);
    }

    public static a1 W2(z z0) throws IOException {
        return (a1)l0.m2(a1.DEFAULT_INSTANCE, z0);
    }

    public static a1 X2(z z0, V v0) throws IOException {
        return (a1)l0.n2(a1.DEFAULT_INSTANCE, z0, v0);
    }

    public static a1 Y2(InputStream inputStream0) throws IOException {
        return (a1)l0.o2(a1.DEFAULT_INSTANCE, inputStream0);
    }

    public static a1 Z2(InputStream inputStream0, V v0) throws IOException {
        return (a1)l0.p2(a1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.proto.d1
    public e1 a() {
        return this.params_ == null ? e1.L2() : this.params_;
    }

    public static a1 a3(ByteBuffer byteBuffer0) throws y0 {
        return (a1)l0.q2(a1.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.crypto.tink.proto.d1
    public boolean b() {
        return this.params_ != null;
    }

    public static a1 b3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (a1)l0.r2(a1.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    @Override  // com.google.crypto.tink.proto.d1
    public u c() {
        return this.keyValue_;
    }

    public static a1 c3(byte[] arr_b) throws y0 {
        return (a1)l0.s2(a1.DEFAULT_INSTANCE, arr_b);
    }

    public static a1 d3(byte[] arr_b, V v0) throws y0 {
        return (a1)l0.t2(a1.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 e3() {
        return a1.DEFAULT_INSTANCE.getParserForType();
    }

    private void f3(u u0) {
        u0.getClass();
        this.keyValue_ = u0;
    }

    private void g3(e1 e10) {
        e10.getClass();
        this.params_ = e10;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.d1
    public int getVersion() {
        return this.version_;
    }

    private void h3(int v) {
        this.version_ = v;
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

