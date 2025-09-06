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

public final class g2 extends l0 implements h2 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements h2 {
        private b() {
            super(g2.DEFAULT_INSTANCE);
        }

        b(a g2$a0) {
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
            ((g2)this.b).V2();
            return this;
        }

        public b R1() {
            this.F1();
            ((g2)this.b).W2();
            return this;
        }

        public b S1() {
            this.F1();
            ((g2)this.b).X2();
            return this;
        }

        public b T1() {
            this.F1();
            ((g2)this.b).Y2();
            return this;
        }

        public b U1() {
            this.F1();
            ((g2)this.b).Z2();
            return this;
        }

        public b V1() {
            this.F1();
            ((g2)this.b).a3();
            return this;
        }

        public b W1() {
            this.F1();
            ((g2)this.b).b3();
            return this;
        }

        public b X1() {
            this.F1();
            ((g2)this.b).c3();
            return this;
        }

        public b Y1(i2 i20) {
            this.F1();
            ((g2)this.b).e3(i20);
            return this;
        }

        public b Z1(u u0) {
            this.F1();
            ((g2)this.b).v3(u0);
            return this;
        }

        public b a2(u u0) {
            this.F1();
            ((g2)this.b).w3(u0);
            return this;
        }

        public b b2(u u0) {
            this.F1();
            ((g2)this.b).x3(u0);
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

        public b c2(u u0) {
            this.F1();
            ((g2)this.b).y3(u0);
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

        public b d2(u u0) {
            this.F1();
            ((g2)this.b).z3(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a d6(u u0, V v0) throws y0 {
            return super.q1(u0, v0);
        }

        @Override  // com.google.crypto.tink.proto.h2
        public i2 e() {
            return ((g2)this.b).e();
        }

        public b e2(com.google.crypto.tink.proto.i2.b i2$b0) {
            this.F1();
            ((g2)this.b).A3(((i2)i2$b0.B1()));
            return this;
        }

        @Override  // com.google.crypto.tink.proto.h2
        public boolean f() {
            return ((g2)this.b).f();
        }

        public b f2(i2 i20) {
            this.F1();
            ((g2)this.b).A3(i20);
            return this;
        }

        public b g2(u u0) {
            this.F1();
            ((g2)this.b).B3(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
        }

        @Override  // com.google.crypto.tink.proto.h2
        public int getVersion() {
            return ((g2)this.b).getVersion();
        }

        public b h2(int v) {
            this.F1();
            ((g2)this.b).C3(v);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a i3(u u0) throws y0 {
            return super.p1(u0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a j9(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.proto.h2
        public u m() {
            return ((g2)this.b).m();
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

        @Override  // com.google.crypto.tink.proto.h2
        public u q() {
            return ((g2)this.b).q();
        }

        @Override  // com.google.crypto.tink.proto.h2
        public u r() {
            return ((g2)this.b).r();
        }

        @Override  // com.google.crypto.tink.proto.h2
        public u s() {
            return ((g2)this.b).s();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a s1(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.proto.h2
        public u w() {
            return ((g2)this.b).w();
        }

        @Override  // com.google.crypto.tink.proto.h2
        public u x() {
            return ((g2)this.b).x();
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

    public static final int CRT_FIELD_NUMBER = 8;
    private static final g2 DEFAULT_INSTANCE = null;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private u crt_;
    private u d_;
    private u dp_;
    private u dq_;
    private u p_;
    private i2 publicKey_;
    private u q_;
    private int version_;

    static {
        g2 g20 = new g2();
        g2.DEFAULT_INSTANCE = g20;
        l0.A2(g2.class, g20);
    }

    private g2() {
        this.d_ = u.e;
        this.p_ = u.e;
        this.q_ = u.e;
        this.dp_ = u.e;
        this.dq_ = u.e;
        this.crt_ = u.e;
    }

    private void A3(i2 i20) {
        i20.getClass();
        this.publicKey_ = i20;
    }

    private void B3(u u0) {
        u0.getClass();
        this.q_ = u0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new g2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(g2.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            }
            case 4: {
                return g2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = g2.PARSER;
                if(j10 == null) {
                    Class class0 = g2.class;
                    synchronized(class0) {
                        j10 = g2.PARSER;
                        if(j10 == null) {
                            j10 = new c(g2.DEFAULT_INSTANCE);
                            g2.PARSER = j10;
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

    private void C3(int v) {
        this.version_ = v;
    }

    private void V2() {
        this.crt_ = g2.d3().q();
    }

    private void W2() {
        this.d_ = g2.d3().m();
    }

    private void X2() {
        this.dp_ = g2.d3().r();
    }

    private void Y2() {
        this.dq_ = g2.d3().s();
    }

    private void Z2() {
        this.p_ = g2.d3().w();
    }

    private void a3() {
        this.publicKey_ = null;
    }

    private void b3() {
        this.q_ = g2.d3().x();
    }

    private void c3() {
        this.version_ = 0;
    }

    public static g2 d3() {
        return g2.DEFAULT_INSTANCE;
    }

    @Override  // com.google.crypto.tink.proto.h2
    public i2 e() {
        return this.publicKey_ == null ? i2.V2() : this.publicKey_;
    }

    private void e3(i2 i20) {
        i20.getClass();
        if(this.publicKey_ != null && this.publicKey_ != i2.V2()) {
            this.publicKey_ = (i2)((com.google.crypto.tink.proto.i2.b)i2.Y2(this.publicKey_).K1(i20)).C1();
            return;
        }
        this.publicKey_ = i20;
    }

    @Override  // com.google.crypto.tink.proto.h2
    public boolean f() {
        return this.publicKey_ != null;
    }

    public static b f3() {
        return (b)g2.DEFAULT_INSTANCE.y1();
    }

    public static b g3(g2 g20) {
        return (b)g2.DEFAULT_INSTANCE.z1(g20);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.h2
    public int getVersion() {
        return this.version_;
    }

    public static g2 h3(InputStream inputStream0) throws IOException {
        return (g2)l0.i2(g2.DEFAULT_INSTANCE, inputStream0);
    }

    public static g2 j3(InputStream inputStream0, V v0) throws IOException {
        return (g2)l0.j2(g2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static g2 k3(u u0) throws y0 {
        return (g2)l0.k2(g2.DEFAULT_INSTANCE, u0);
    }

    public static g2 l3(u u0, V v0) throws y0 {
        return (g2)l0.l2(g2.DEFAULT_INSTANCE, u0, v0);
    }

    @Override  // com.google.crypto.tink.proto.h2
    public u m() {
        return this.d_;
    }

    public static g2 m3(z z0) throws IOException {
        return (g2)l0.m2(g2.DEFAULT_INSTANCE, z0);
    }

    public static g2 n3(z z0, V v0) throws IOException {
        return (g2)l0.n2(g2.DEFAULT_INSTANCE, z0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    public static g2 o3(InputStream inputStream0) throws IOException {
        return (g2)l0.o2(g2.DEFAULT_INSTANCE, inputStream0);
    }

    public static g2 p3(InputStream inputStream0, V v0) throws IOException {
        return (g2)l0.p2(g2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.proto.h2
    public u q() {
        return this.crt_;
    }

    public static g2 q3(ByteBuffer byteBuffer0) throws y0 {
        return (g2)l0.q2(g2.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.crypto.tink.proto.h2
    public u r() {
        return this.dp_;
    }

    public static g2 r3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (g2)l0.r2(g2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    @Override  // com.google.crypto.tink.proto.h2
    public u s() {
        return this.dq_;
    }

    public static g2 s3(byte[] arr_b) throws y0 {
        return (g2)l0.s2(g2.DEFAULT_INSTANCE, arr_b);
    }

    public static g2 t3(byte[] arr_b, V v0) throws y0 {
        return (g2)l0.t2(g2.DEFAULT_INSTANCE, arr_b, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }

    public static j1 u3() {
        return g2.DEFAULT_INSTANCE.getParserForType();
    }

    private void v3(u u0) {
        u0.getClass();
        this.crt_ = u0;
    }

    @Override  // com.google.crypto.tink.proto.h2
    public u w() {
        return this.p_;
    }

    private void w3(u u0) {
        u0.getClass();
        this.d_ = u0;
    }

    @Override  // com.google.crypto.tink.proto.h2
    public u x() {
        return this.q_;
    }

    private void x3(u u0) {
        u0.getClass();
        this.dp_ = u0;
    }

    private void y3(u u0) {
        u0.getClass();
        this.dq_ = u0;
    }

    private void z3(u u0) {
        u0.getClass();
        this.p_ = u0;
    }
}

