package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.S0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.l0.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.t0.k;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.shaded.protobuf.z;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class s2 extends l0 implements t2 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements t2 {
        private b() {
            super(s2.DEFAULT_INSTANCE);
        }

        b(a s2$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a La(InputStream inputStream0, V v0) throws IOException {
            return super.v1(inputStream0, v0);
        }

        @Override  // com.google.crypto.tink.proto.t2
        public int M() {
            return ((s2)this.b).M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a M4(byte[] arr_b, V v0) throws y0 {
            return super.z1(arr_b, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a P4(byte[] arr_b, int v, int v1, V v2) throws y0 {
            return super.M1(arr_b, v, v1, v2);
        }

        public b Q1(Iterable iterable0) {
            this.F1();
            ((s2)this.b).M2(iterable0);
            return this;
        }

        public b R1(int v, com.google.crypto.tink.proto.s2.c.a s2$c$a0) {
            this.F1();
            ((s2)this.b).N2(v, ((c)s2$c$a0.B1()));
            return this;
        }

        public b S1(int v, c s2$c0) {
            this.F1();
            ((s2)this.b).N2(v, s2$c0);
            return this;
        }

        public b T1(com.google.crypto.tink.proto.s2.c.a s2$c$a0) {
            this.F1();
            ((s2)this.b).O2(((c)s2$c$a0.B1()));
            return this;
        }

        @Override  // com.google.crypto.tink.proto.t2
        public c U0(int v) {
            return ((s2)this.b).U0(v);
        }

        public b U1(c s2$c0) {
            this.F1();
            ((s2)this.b).O2(s2$c0);
            return this;
        }

        public b V1() {
            this.F1();
            ((s2)this.b).P2();
            return this;
        }

        public b W1() {
            this.F1();
            ((s2)this.b).Q2();
            return this;
        }

        public b X1(int v) {
            this.F1();
            ((s2)this.b).l3(v);
            return this;
        }

        public b Y1(int v, com.google.crypto.tink.proto.s2.c.a s2$c$a0) {
            this.F1();
            ((s2)this.b).m3(v, ((c)s2$c$a0.B1()));
            return this;
        }

        public b Z1(int v, c s2$c0) {
            this.F1();
            ((s2)this.b).m3(v, s2$c0);
            return this;
        }

        public b a2(int v) {
            this.F1();
            ((s2)this.b).n3(v);
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

        @Override  // com.google.crypto.tink.proto.t2
        public int c0() {
            return ((s2)this.b).c0();
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

        @Override  // com.google.crypto.tink.proto.t2
        public List e1() {
            return DesugarCollections.unmodifiableList(((s2)this.b).e1());
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

    public static final class c extends l0 implements d {
        public static final class com.google.crypto.tink.proto.s2.c.a extends com.google.crypto.tink.shaded.protobuf.l0.b implements d {
            private com.google.crypto.tink.proto.s2.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.crypto.tink.proto.s2.c.a(a s2$a0) {
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.a$a
            public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
                return super.r1(z0);
            }

            @Override  // com.google.crypto.tink.proto.s2$d
            public int C() {
                return ((c)this.b).C();
            }

            @Override  // com.google.crypto.tink.proto.s2$d
            public int H() {
                return ((c)this.b).H();
            }

            @Override  // com.google.crypto.tink.proto.s2$d
            public int I() {
                return ((c)this.b).I();
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

            public com.google.crypto.tink.proto.s2.c.a Q1() {
                this.F1();
                ((c)this.b).P2();
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a R1() {
                this.F1();
                ((c)this.b).Q2();
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a S1() {
                this.F1();
                ((c)this.b).R2();
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a T1() {
                this.F1();
                ((c)this.b).S2();
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a U1(int v) {
                this.F1();
                ((c)this.b).k3(v);
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a V1(F2 f20) {
                this.F1();
                ((c)this.b).l3(f20);
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a W1(int v) {
                this.F1();
                ((c)this.b).m3(v);
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a X1(m2 m20) {
                this.F1();
                ((c)this.b).n3(m20);
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a Y1(int v) {
                this.F1();
                ((c)this.b).o3(v);
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a Z1(String s) {
                this.F1();
                ((c)this.b).p3(s);
                return this;
            }

            public com.google.crypto.tink.proto.s2.c.a a2(u u0) {
                this.F1();
                ((c)this.b).q3(u0);
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

            @Override  // com.google.crypto.tink.proto.s2$d
            public m2 getStatus() {
                return ((c)this.b).getStatus();
            }

            @Override  // com.google.crypto.tink.proto.s2$d
            public String getTypeUrl() {
                return ((c)this.b).getTypeUrl();
            }

            @Override  // com.google.crypto.tink.proto.s2$d
            public u getTypeUrlBytes() {
                return ((c)this.b).getTypeUrlBytes();
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

            @Override  // com.google.crypto.tink.proto.s2$d
            public F2 y() {
                return ((c)this.b).y();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
            public com.google.crypto.tink.shaded.protobuf.a.a y1(byte[] arr_b, int v, int v1, V v2) throws y0 {
                return super.M1(arr_b, v, v1, v2);
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile j1 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_;

        static {
            c s2$c0 = new c();
            c.DEFAULT_INSTANCE = s2$c0;
            l0.A2(c.class, s2$c0);
        }

        private c() {
            this.typeUrl_ = "";
        }

        @Override  // com.google.crypto.tink.proto.s2$d
        public int C() {
            return this.outputPrefixType_;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0
        protected final Object C1(i l0$i0, Object object0, Object object1) {
            switch(l0$i0) {
                case 1: {
                    return new c();
                }
                case 2: {
                    return new com.google.crypto.tink.proto.s2.c.a(null);
                }
                case 3: {
                    return l0.e2(c.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000B\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
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

        @Override  // com.google.crypto.tink.proto.s2$d
        public int H() {
            return this.keyId_;
        }

        @Override  // com.google.crypto.tink.proto.s2$d
        public int I() {
            return this.status_;
        }

        private void P2() {
            this.keyId_ = 0;
        }

        private void Q2() {
            this.outputPrefixType_ = 0;
        }

        private void R2() {
            this.status_ = 0;
        }

        private void S2() {
            this.typeUrl_ = "";
        }

        public static c T2() {
            return c.DEFAULT_INSTANCE;
        }

        public static com.google.crypto.tink.proto.s2.c.a U2() {
            return (com.google.crypto.tink.proto.s2.c.a)c.DEFAULT_INSTANCE.y1();
        }

        public static com.google.crypto.tink.proto.s2.c.a V2(c s2$c0) {
            return (com.google.crypto.tink.proto.s2.c.a)c.DEFAULT_INSTANCE.z1(s2$c0);
        }

        public static c W2(InputStream inputStream0) throws IOException {
            return (c)l0.i2(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c X2(InputStream inputStream0, V v0) throws IOException {
            return (c)l0.j2(c.DEFAULT_INSTANCE, inputStream0, v0);
        }

        public static c Y2(u u0) throws y0 {
            return (c)l0.k2(c.DEFAULT_INSTANCE, u0);
        }

        public static c Z2(u u0, V v0) throws y0 {
            return (c)l0.l2(c.DEFAULT_INSTANCE, u0, v0);
        }

        public static c a3(z z0) throws IOException {
            return (c)l0.m2(c.DEFAULT_INSTANCE, z0);
        }

        public static c b3(z z0, V v0) throws IOException {
            return (c)l0.n2(c.DEFAULT_INSTANCE, z0, v0);
        }

        public static c c3(InputStream inputStream0) throws IOException {
            return (c)l0.o2(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c d3(InputStream inputStream0, V v0) throws IOException {
            return (c)l0.p2(c.DEFAULT_INSTANCE, inputStream0, v0);
        }

        public static c e3(ByteBuffer byteBuffer0) throws y0 {
            return (c)l0.q2(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c f3(ByteBuffer byteBuffer0, V v0) throws y0 {
            return (c)l0.r2(c.DEFAULT_INSTANCE, byteBuffer0, v0);
        }

        public static c g3(byte[] arr_b) throws y0 {
            return (c)l0.s2(c.DEFAULT_INSTANCE, arr_b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.L1();
        }

        @Override  // com.google.crypto.tink.proto.s2$d
        public m2 getStatus() {
            m2 m20 = m2.a(this.status_);
            return m20 == null ? m2.f : m20;
        }

        @Override  // com.google.crypto.tink.proto.s2$d
        public String getTypeUrl() {
            return this.typeUrl_;
        }

        @Override  // com.google.crypto.tink.proto.s2$d
        public u getTypeUrlBytes() {
            return u.r(this.typeUrl_);
        }

        public static c h3(byte[] arr_b, V v0) throws y0 {
            return (c)l0.t2(c.DEFAULT_INSTANCE, arr_b, v0);
        }

        public static j1 j3() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        private void k3(int v) {
            this.keyId_ = v;
        }

        private void l3(F2 f20) {
            this.outputPrefixType_ = f20.getNumber();
        }

        private void m3(int v) {
            this.outputPrefixType_ = v;
        }

        private void n3(m2 m20) {
            this.status_ = m20.getNumber();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0
        public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
            return super.d2();
        }

        private void o3(int v) {
            this.status_ = v;
        }

        private void p3(String s) {
            s.getClass();
            this.typeUrl_ = s;
        }

        private void q3(u u0) {
            com.google.crypto.tink.shaded.protobuf.a.j1(u0);
            this.typeUrl_ = u0.i0();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0
        public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
            return super.C2();
        }

        @Override  // com.google.crypto.tink.proto.s2$d
        public F2 y() {
            F2 f20 = F2.a(this.outputPrefixType_);
            return f20 == null ? F2.g : f20;
        }
    }

    public interface d extends S0 {
        int C();

        int H();

        int I();

        m2 getStatus();

        String getTypeUrl();

        u getTypeUrlBytes();

        F2 y();
    }

    private static final s2 DEFAULT_INSTANCE = null;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile j1 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private k keyInfo_;
    private int primaryKeyId_;

    static {
        s2 s20 = new s2();
        s2.DEFAULT_INSTANCE = s20;
        l0.A2(s2.class, s20);
    }

    private s2() {
        this.keyInfo_ = l0.I1();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new s2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(s2.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            }
            case 4: {
                return s2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = s2.PARSER;
                if(j10 == null) {
                    Class class0 = s2.class;
                    synchronized(class0) {
                        j10 = s2.PARSER;
                        if(j10 == null) {
                            j10 = new com.google.crypto.tink.shaded.protobuf.l0.c(s2.DEFAULT_INSTANCE);
                            s2.PARSER = j10;
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

    @Override  // com.google.crypto.tink.proto.t2
    public int M() {
        return this.primaryKeyId_;
    }

    private void M2(Iterable iterable0) {
        this.R2();
        com.google.crypto.tink.shaded.protobuf.a.i1(iterable0, this.keyInfo_);
    }

    private void N2(int v, c s2$c0) {
        s2$c0.getClass();
        this.R2();
        this.keyInfo_.add(v, s2$c0);
    }

    private void O2(c s2$c0) {
        s2$c0.getClass();
        this.R2();
        this.keyInfo_.add(s2$c0);
    }

    private void P2() {
        this.keyInfo_ = l0.I1();
    }

    private void Q2() {
        this.primaryKeyId_ = 0;
    }

    private void R2() {
        k t0$k0 = this.keyInfo_;
        if(!t0$k0.isModifiable()) {
            this.keyInfo_ = l0.c2(t0$k0);
        }
    }

    public static s2 S2() {
        return s2.DEFAULT_INSTANCE;
    }

    public d T2(int v) {
        return (d)this.keyInfo_.get(v);
    }

    @Override  // com.google.crypto.tink.proto.t2
    public c U0(int v) {
        return (c)this.keyInfo_.get(v);
    }

    public List U2() {
        return this.keyInfo_;
    }

    public static b V2() {
        return (b)s2.DEFAULT_INSTANCE.y1();
    }

    public static b W2(s2 s20) {
        return (b)s2.DEFAULT_INSTANCE.z1(s20);
    }

    public static s2 X2(InputStream inputStream0) throws IOException {
        return (s2)l0.i2(s2.DEFAULT_INSTANCE, inputStream0);
    }

    public static s2 Y2(InputStream inputStream0, V v0) throws IOException {
        return (s2)l0.j2(s2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static s2 Z2(u u0) throws y0 {
        return (s2)l0.k2(s2.DEFAULT_INSTANCE, u0);
    }

    public static s2 a3(u u0, V v0) throws y0 {
        return (s2)l0.l2(s2.DEFAULT_INSTANCE, u0, v0);
    }

    public static s2 b3(z z0) throws IOException {
        return (s2)l0.m2(s2.DEFAULT_INSTANCE, z0);
    }

    @Override  // com.google.crypto.tink.proto.t2
    public int c0() {
        return this.keyInfo_.size();
    }

    public static s2 c3(z z0, V v0) throws IOException {
        return (s2)l0.n2(s2.DEFAULT_INSTANCE, z0, v0);
    }

    public static s2 d3(InputStream inputStream0) throws IOException {
        return (s2)l0.o2(s2.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.crypto.tink.proto.t2
    public List e1() {
        return this.keyInfo_;
    }

    public static s2 e3(InputStream inputStream0, V v0) throws IOException {
        return (s2)l0.p2(s2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static s2 f3(ByteBuffer byteBuffer0) throws y0 {
        return (s2)l0.q2(s2.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static s2 g3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (s2)l0.r2(s2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    public static s2 h3(byte[] arr_b) throws y0 {
        return (s2)l0.s2(s2.DEFAULT_INSTANCE, arr_b);
    }

    public static s2 j3(byte[] arr_b, V v0) throws y0 {
        return (s2)l0.t2(s2.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 k3() {
        return s2.DEFAULT_INSTANCE.getParserForType();
    }

    private void l3(int v) {
        this.R2();
        this.keyInfo_.remove(v);
    }

    private void m3(int v, c s2$c0) {
        s2$c0.getClass();
        this.R2();
        this.keyInfo_.set(v, s2$c0);
    }

    private void n3(int v) {
        this.primaryKeyId_ = v;
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

