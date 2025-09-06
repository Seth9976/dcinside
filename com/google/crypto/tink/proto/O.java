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

public final class o extends l0 implements r {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements r {
        private b() {
            super(o.DEFAULT_INSTANCE);
        }

        b(a o$a0) {
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

        @Override  // com.google.crypto.tink.proto.r
        public h1 Q0() {
            return ((o)this.b).Q0();
        }

        public b Q1() {
            this.F1();
            ((o)this.b).M2();
            return this;
        }

        public b R1() {
            this.F1();
            ((o)this.b).N2();
            return this;
        }

        @Override  // com.google.crypto.tink.proto.r
        public boolean S() {
            return ((o)this.b).S();
        }

        public b S1() {
            this.F1();
            ((o)this.b).O2();
            return this;
        }

        public b T1(com.google.crypto.tink.proto.z z0) {
            this.F1();
            ((o)this.b).Q2(z0);
            return this;
        }

        public b U1(h1 h10) {
            this.F1();
            ((o)this.b).R2(h10);
            return this;
        }

        public b V1(com.google.crypto.tink.proto.z.b z$b0) {
            this.F1();
            ((o)this.b).h3(((com.google.crypto.tink.proto.z)z$b0.B1()));
            return this;
        }

        public b W1(com.google.crypto.tink.proto.z z0) {
            this.F1();
            ((o)this.b).h3(z0);
            return this;
        }

        public b X1(com.google.crypto.tink.proto.h1.b h1$b0) {
            this.F1();
            ((o)this.b).j3(((h1)h1$b0.B1()));
            return this;
        }

        public b Y1(h1 h10) {
            this.F1();
            ((o)this.b).j3(h10);
            return this;
        }

        public b Z1(int v) {
            this.F1();
            ((o)this.b).k3(v);
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

        @Override  // com.google.crypto.tink.proto.r
        public com.google.crypto.tink.proto.z d0() {
            return ((o)this.b).d0();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a d6(u u0, V v0) throws y0 {
            return super.q1(u0, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
        }

        @Override  // com.google.crypto.tink.proto.r
        public int getVersion() {
            return ((o)this.b).getVersion();
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

        @Override  // com.google.crypto.tink.proto.r
        public boolean r0() {
            return ((o)this.b).r0();
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

    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE = null;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.proto.z aesCtrKey_;
    private h1 hmacKey_;
    private int version_;

    static {
        o o0 = new o();
        o.DEFAULT_INSTANCE = o0;
        l0.A2(o.class, o0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new o();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(o.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            }
            case 4: {
                return o.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = o.PARSER;
                if(j10 == null) {
                    Class class0 = o.class;
                    synchronized(class0) {
                        j10 = o.PARSER;
                        if(j10 == null) {
                            j10 = new c(o.DEFAULT_INSTANCE);
                            o.PARSER = j10;
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
        this.aesCtrKey_ = null;
    }

    private void N2() {
        this.hmacKey_ = null;
    }

    private void O2() {
        this.version_ = 0;
    }

    public static o P2() {
        return o.DEFAULT_INSTANCE;
    }

    @Override  // com.google.crypto.tink.proto.r
    public h1 Q0() {
        return this.hmacKey_ == null ? h1.O2() : this.hmacKey_;
    }

    private void Q2(com.google.crypto.tink.proto.z z0) {
        z0.getClass();
        if(this.aesCtrKey_ != null && this.aesCtrKey_ != com.google.crypto.tink.proto.z.O2()) {
            this.aesCtrKey_ = (com.google.crypto.tink.proto.z)((com.google.crypto.tink.proto.z.b)com.google.crypto.tink.proto.z.R2(this.aesCtrKey_).K1(z0)).C1();
            return;
        }
        this.aesCtrKey_ = z0;
    }

    private void R2(h1 h10) {
        h10.getClass();
        if(this.hmacKey_ != null && this.hmacKey_ != h1.O2()) {
            this.hmacKey_ = (h1)((com.google.crypto.tink.proto.h1.b)h1.R2(this.hmacKey_).K1(h10)).C1();
            return;
        }
        this.hmacKey_ = h10;
    }

    @Override  // com.google.crypto.tink.proto.r
    public boolean S() {
        return this.aesCtrKey_ != null;
    }

    public static b S2() {
        return (b)o.DEFAULT_INSTANCE.y1();
    }

    public static b T2(o o0) {
        return (b)o.DEFAULT_INSTANCE.z1(o0);
    }

    public static o U2(InputStream inputStream0) throws IOException {
        return (o)l0.i2(o.DEFAULT_INSTANCE, inputStream0);
    }

    public static o V2(InputStream inputStream0, V v0) throws IOException {
        return (o)l0.j2(o.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static o W2(u u0) throws y0 {
        return (o)l0.k2(o.DEFAULT_INSTANCE, u0);
    }

    public static o X2(u u0, V v0) throws y0 {
        return (o)l0.l2(o.DEFAULT_INSTANCE, u0, v0);
    }

    public static o Y2(z z0) throws IOException {
        return (o)l0.m2(o.DEFAULT_INSTANCE, z0);
    }

    public static o Z2(z z0, V v0) throws IOException {
        return (o)l0.n2(o.DEFAULT_INSTANCE, z0, v0);
    }

    public static o a3(InputStream inputStream0) throws IOException {
        return (o)l0.o2(o.DEFAULT_INSTANCE, inputStream0);
    }

    public static o b3(InputStream inputStream0, V v0) throws IOException {
        return (o)l0.p2(o.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static o c3(ByteBuffer byteBuffer0) throws y0 {
        return (o)l0.q2(o.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.crypto.tink.proto.r
    public com.google.crypto.tink.proto.z d0() {
        return this.aesCtrKey_ == null ? com.google.crypto.tink.proto.z.O2() : this.aesCtrKey_;
    }

    public static o d3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (o)l0.r2(o.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static o e3(byte[] arr_b) throws y0 {
        return (o)l0.s2(o.DEFAULT_INSTANCE, arr_b);
    }

    public static o f3(byte[] arr_b, V v0) throws y0 {
        return (o)l0.t2(o.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 g3() {
        return o.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.r
    public int getVersion() {
        return this.version_;
    }

    private void h3(com.google.crypto.tink.proto.z z0) {
        z0.getClass();
        this.aesCtrKey_ = z0;
    }

    private void j3(h1 h10) {
        h10.getClass();
        this.hmacKey_ = h10;
    }

    private void k3(int v) {
        this.version_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.proto.r
    public boolean r0() {
        return this.hmacKey_ != null;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }
}

