package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.S0;
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

public final class a2 extends l0 implements b2 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements b2 {
        private b() {
            super(a2.DEFAULT_INSTANCE);
        }

        b(a a2$a0) {
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
            ((a2)this.b).Q2();
            return this;
        }

        public b R1() {
            this.F1();
            ((a2)this.b).R2();
            return this;
        }

        public b S1() {
            this.F1();
            ((a2)this.b).S2();
            return this;
        }

        public b T1() {
            this.F1();
            ((a2)this.b).T2();
            return this;
        }

        public b U1() {
            this.F1();
            ((a2)this.b).U2();
            return this;
        }

        public b V1(c a2$c0) {
            this.F1();
            ((a2)this.b).W2(a2$c0);
            return this;
        }

        public b W1(V1 v10) {
            this.F1();
            ((a2)this.b).n3(v10);
            return this;
        }

        public b X1(int v) {
            this.F1();
            ((a2)this.b).o3(v);
            return this;
        }

        public b Y1(com.google.crypto.tink.proto.a2.c.a a2$c$a0) {
            this.F1();
            ((a2)this.b).p3(((c)a2$c$a0.B1()));
            return this;
        }

        public b Z1(c a2$c0) {
            this.F1();
            ((a2)this.b).p3(a2$c0);
            return this;
        }

        public b a2(u u0) {
            this.F1();
            ((a2)this.b).q3(u0);
            return this;
        }

        public b b2(u u0) {
            this.F1();
            ((a2)this.b).r3(u0);
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

        public b c2(int v) {
            this.F1();
            ((a2)this.b).s3(v);
            return this;
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

        @Override  // com.google.crypto.tink.proto.b2
        public V1 g() {
            return ((a2)this.b).g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
        }

        @Override  // com.google.crypto.tink.proto.b2
        public int getVersion() {
            return ((a2)this.b).getVersion();
        }

        @Override  // com.google.crypto.tink.proto.b2
        public int h() {
            return ((a2)this.b).h();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a i3(u u0) throws y0 {
            return super.p1(u0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a j9(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.proto.b2
        public u k() {
            return ((a2)this.b).k();
        }

        @Override  // com.google.crypto.tink.proto.b2
        public c l() {
            return ((a2)this.b).l();
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

        @Override  // com.google.crypto.tink.proto.b2
        public boolean o() {
            return ((a2)this.b).o();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        protected com.google.crypto.tink.shaded.protobuf.a.a o1(com.google.crypto.tink.shaded.protobuf.a a0) {
            return super.I1(((l0)a0));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a s1(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.proto.b2
        public u v() {
            return ((a2)this.b).v();
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

    public static final class c extends l0 implements d {
        public static final class com.google.crypto.tink.proto.a2.c.a extends com.google.crypto.tink.shaded.protobuf.l0.b implements d {
            private com.google.crypto.tink.proto.a2.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.crypto.tink.proto.a2.c.a(a a2$a0) {
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

            public com.google.crypto.tink.proto.a2.c.a Q1() {
                this.F1();
                ((c)this.b).H2();
                return this;
            }

            public com.google.crypto.tink.proto.a2.c.a R1(String s) {
                this.F1();
                ((c)this.b).Y2(s);
                return this;
            }

            public com.google.crypto.tink.proto.a2.c.a S1(u u0) {
                this.F1();
                ((c)this.b).Z2(u0);
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

            @Override  // com.google.crypto.tink.proto.a2$d
            public String getValue() {
                return ((c)this.b).getValue();
            }

            @Override  // com.google.crypto.tink.proto.a2$d
            public u getValueBytes() {
                return ((c)this.b).getValueBytes();
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
        private static volatile j1 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private String value_;

        static {
            c a2$c0 = new c();
            c.DEFAULT_INSTANCE = a2$c0;
            l0.A2(c.class, a2$c0);
        }

        private c() {
            this.value_ = "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0
        protected final Object C1(i l0$i0, Object object0, Object object1) {
            switch(l0$i0) {
                case 1: {
                    return new c();
                }
                case 2: {
                    return new com.google.crypto.tink.proto.a2.c.a(null);
                }
                case 3: {
                    return l0.e2(c.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
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

        private void H2() {
            this.value_ = "";
        }

        public static c I2() {
            return c.DEFAULT_INSTANCE;
        }

        public static com.google.crypto.tink.proto.a2.c.a J2() {
            return (com.google.crypto.tink.proto.a2.c.a)c.DEFAULT_INSTANCE.y1();
        }

        public static com.google.crypto.tink.proto.a2.c.a K2(c a2$c0) {
            return (com.google.crypto.tink.proto.a2.c.a)c.DEFAULT_INSTANCE.z1(a2$c0);
        }

        public static c L2(InputStream inputStream0) throws IOException {
            return (c)l0.i2(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c M2(InputStream inputStream0, V v0) throws IOException {
            return (c)l0.j2(c.DEFAULT_INSTANCE, inputStream0, v0);
        }

        public static c N2(u u0) throws y0 {
            return (c)l0.k2(c.DEFAULT_INSTANCE, u0);
        }

        public static c O2(u u0, V v0) throws y0 {
            return (c)l0.l2(c.DEFAULT_INSTANCE, u0, v0);
        }

        public static c P2(z z0) throws IOException {
            return (c)l0.m2(c.DEFAULT_INSTANCE, z0);
        }

        public static c Q2(z z0, V v0) throws IOException {
            return (c)l0.n2(c.DEFAULT_INSTANCE, z0, v0);
        }

        public static c R2(InputStream inputStream0) throws IOException {
            return (c)l0.o2(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c S2(InputStream inputStream0, V v0) throws IOException {
            return (c)l0.p2(c.DEFAULT_INSTANCE, inputStream0, v0);
        }

        public static c T2(ByteBuffer byteBuffer0) throws y0 {
            return (c)l0.q2(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c U2(ByteBuffer byteBuffer0, V v0) throws y0 {
            return (c)l0.r2(c.DEFAULT_INSTANCE, byteBuffer0, v0);
        }

        public static c V2(byte[] arr_b) throws y0 {
            return (c)l0.s2(c.DEFAULT_INSTANCE, arr_b);
        }

        public static c W2(byte[] arr_b, V v0) throws y0 {
            return (c)l0.t2(c.DEFAULT_INSTANCE, arr_b, v0);
        }

        public static j1 X2() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        private void Y2(String s) {
            s.getClass();
            this.value_ = s;
        }

        private void Z2(u u0) {
            com.google.crypto.tink.shaded.protobuf.a.j1(u0);
            this.value_ = u0.i0();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.L1();
        }

        @Override  // com.google.crypto.tink.proto.a2$d
        public String getValue() [...] // 潜在的解密器

        @Override  // com.google.crypto.tink.proto.a2$d
        public u getValueBytes() {
            return u.r(this.value_);
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

    public interface d extends S0 {
        String getValue();

        u getValueBytes();
    }

    public static final int ALGORITHM_FIELD_NUMBER = 2;
    public static final int CUSTOM_KID_FIELD_NUMBER = 5;
    private static final a2 DEFAULT_INSTANCE = null;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private c customKid_;
    private u e_;
    private u n_;
    private int version_;

    static {
        a2 a20 = new a2();
        a2.DEFAULT_INSTANCE = a20;
        l0.A2(a2.class, a20);
    }

    private a2() {
        this.n_ = u.e;
        this.e_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new a2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(a2.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000B\u0002\f\u0003\n\u0004\n\u0005\t", new Object[]{"version_", "algorithm_", "n_", "e_", "customKid_"});
            }
            case 4: {
                return a2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = a2.PARSER;
                if(j10 == null) {
                    Class class0 = a2.class;
                    synchronized(class0) {
                        j10 = a2.PARSER;
                        if(j10 == null) {
                            j10 = new com.google.crypto.tink.shaded.protobuf.l0.c(a2.DEFAULT_INSTANCE);
                            a2.PARSER = j10;
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

    private void Q2() {
        this.algorithm_ = 0;
    }

    private void R2() {
        this.customKid_ = null;
    }

    private void S2() {
        this.e_ = a2.V2().k();
    }

    private void T2() {
        this.n_ = a2.V2().v();
    }

    private void U2() {
        this.version_ = 0;
    }

    public static a2 V2() {
        return a2.DEFAULT_INSTANCE;
    }

    private void W2(c a2$c0) {
        a2$c0.getClass();
        if(this.customKid_ != null && this.customKid_ != c.I2()) {
            this.customKid_ = (c)((com.google.crypto.tink.proto.a2.c.a)c.K2(this.customKid_).K1(a2$c0)).C1();
            return;
        }
        this.customKid_ = a2$c0;
    }

    public static b X2() {
        return (b)a2.DEFAULT_INSTANCE.y1();
    }

    public static b Y2(a2 a20) {
        return (b)a2.DEFAULT_INSTANCE.z1(a20);
    }

    public static a2 Z2(InputStream inputStream0) throws IOException {
        return (a2)l0.i2(a2.DEFAULT_INSTANCE, inputStream0);
    }

    public static a2 a3(InputStream inputStream0, V v0) throws IOException {
        return (a2)l0.j2(a2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static a2 b3(u u0) throws y0 {
        return (a2)l0.k2(a2.DEFAULT_INSTANCE, u0);
    }

    public static a2 c3(u u0, V v0) throws y0 {
        return (a2)l0.l2(a2.DEFAULT_INSTANCE, u0, v0);
    }

    public static a2 d3(z z0) throws IOException {
        return (a2)l0.m2(a2.DEFAULT_INSTANCE, z0);
    }

    public static a2 e3(z z0, V v0) throws IOException {
        return (a2)l0.n2(a2.DEFAULT_INSTANCE, z0, v0);
    }

    public static a2 f3(InputStream inputStream0) throws IOException {
        return (a2)l0.o2(a2.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.crypto.tink.proto.b2
    public V1 g() {
        V1 v10 = V1.a(this.algorithm_);
        return v10 == null ? V1.f : v10;
    }

    public static a2 g3(InputStream inputStream0, V v0) throws IOException {
        return (a2)l0.p2(a2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.b2
    public int getVersion() {
        return this.version_;
    }

    @Override  // com.google.crypto.tink.proto.b2
    public int h() {
        return this.algorithm_;
    }

    public static a2 h3(ByteBuffer byteBuffer0) throws y0 {
        return (a2)l0.q2(a2.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static a2 j3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (a2)l0.r2(a2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    @Override  // com.google.crypto.tink.proto.b2
    public u k() {
        return this.e_;
    }

    public static a2 k3(byte[] arr_b) throws y0 {
        return (a2)l0.s2(a2.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.crypto.tink.proto.b2
    public c l() {
        return this.customKid_ == null ? c.I2() : this.customKid_;
    }

    public static a2 l3(byte[] arr_b, V v0) throws y0 {
        return (a2)l0.t2(a2.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 m3() {
        return a2.DEFAULT_INSTANCE.getParserForType();
    }

    private void n3(V1 v10) {
        this.algorithm_ = v10.getNumber();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.proto.b2
    public boolean o() {
        return this.customKid_ != null;
    }

    private void o3(int v) {
        this.algorithm_ = v;
    }

    private void p3(c a2$c0) {
        a2$c0.getClass();
        this.customKid_ = a2$c0;
    }

    private void q3(u u0) {
        u0.getClass();
        this.e_ = u0;
    }

    private void r3(u u0) {
        u0.getClass();
        this.n_ = u0;
    }

    private void s3(int v) {
        this.version_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }

    @Override  // com.google.crypto.tink.proto.b2
    public u v() {
        return this.n_;
    }
}

