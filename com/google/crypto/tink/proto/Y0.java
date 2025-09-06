package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.l0.c;
import com.google.crypto.tink.shaded.protobuf.l0.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class y0 extends l0 implements z0 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements z0 {
        private b() {
            super(y0.DEFAULT_INSTANCE);
        }

        b(a y0$a0) {
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
        public com.google.crypto.tink.shaded.protobuf.R0.a M4(byte[] arr_b, V v0) throws com.google.crypto.tink.shaded.protobuf.y0 {
            return super.z1(arr_b, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a P4(byte[] arr_b, int v, int v1, V v2) throws com.google.crypto.tink.shaded.protobuf.y0 {
            return super.M1(arr_b, v, v1, v2);
        }

        public b Q1() {
            this.F1();
            ((y0)this.b).N2();
            return this;
        }

        public b R1() {
            this.F1();
            ((y0)this.b).O2();
            return this;
        }

        public b S1() {
            this.F1();
            ((y0)this.b).P2();
            return this;
        }

        public b T1() {
            this.F1();
            ((y0)this.b).Q2();
            return this;
        }

        public b U1(u0 u00) {
            this.F1();
            ((y0)this.b).S2(u00);
            return this;
        }

        public b V1(com.google.crypto.tink.proto.u0.b u0$b0) {
            this.F1();
            ((y0)this.b).j3(((u0)u0$b0.B1()));
            return this;
        }

        public b W1(u0 u00) {
            this.F1();
            ((y0)this.b).j3(u00);
            return this;
        }

        public b X1(int v) {
            this.F1();
            ((y0)this.b).k3(v);
            return this;
        }

        public b Y1(u u0) {
            this.F1();
            ((y0)this.b).l3(u0);
            return this;
        }

        public b Z1(u u0) {
            this.F1();
            ((y0)this.b).m3(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.proto.z0
        public u0 a() {
            return ((y0)this.b).a();
        }

        @Override  // com.google.crypto.tink.proto.z0
        public boolean b() {
            return ((y0)this.b).b();
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
        public com.google.crypto.tink.shaded.protobuf.R0.a d6(u u0, V v0) throws com.google.crypto.tink.shaded.protobuf.y0 {
            return super.q1(u0, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b, com.google.crypto.tink.shaded.protobuf.S0
        public R0 getDefaultInstanceForType() {
            return super.H1();
        }

        @Override  // com.google.crypto.tink.proto.z0
        public int getVersion() {
            return ((y0)this.b).getVersion();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a i3(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
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
        public com.google.crypto.tink.shaded.protobuf.R0.a mergeFrom(byte[] arr_b) throws com.google.crypto.tink.shaded.protobuf.y0 {
            return super.w1(arr_b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a mergeFrom(byte[] arr_b, int v, int v1) throws com.google.crypto.tink.shaded.protobuf.y0 {
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

        @Override  // com.google.crypto.tink.proto.z0
        public u t() {
            return ((y0)this.b).t();
        }

        @Override  // com.google.crypto.tink.proto.z0
        public u u() {
            return ((y0)this.b).u();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a x1(byte[] arr_b, int v, int v1) throws com.google.crypto.tink.shaded.protobuf.y0 {
            return super.L1(arr_b, v, v1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.a.a y1(byte[] arr_b, int v, int v1, V v2) throws com.google.crypto.tink.shaded.protobuf.y0 {
            return super.M1(arr_b, v, v1, v2);
        }
    }

    private static final y0 DEFAULT_INSTANCE = null;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile j1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private u0 params_;
    private int version_;
    private u x_;
    private u y_;

    static {
        y0 y00 = new y0();
        y0.DEFAULT_INSTANCE = y00;
        l0.A2(y0.class, y00);
    }

    private y0() {
        this.x_ = u.e;
        this.y_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new y0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(y0.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000B\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            }
            case 4: {
                return y0.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = y0.PARSER;
                if(j10 == null) {
                    Class class0 = y0.class;
                    synchronized(class0) {
                        j10 = y0.PARSER;
                        if(j10 == null) {
                            j10 = new c(y0.DEFAULT_INSTANCE);
                            y0.PARSER = j10;
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

    private void N2() {
        this.params_ = null;
    }

    private void O2() {
        this.version_ = 0;
    }

    private void P2() {
        this.x_ = y0.R2().t();
    }

    private void Q2() {
        this.y_ = y0.R2().u();
    }

    public static y0 R2() {
        return y0.DEFAULT_INSTANCE;
    }

    private void S2(u0 u00) {
        u00.getClass();
        if(this.params_ != null && this.params_ != u0.Q2()) {
            this.params_ = (u0)((com.google.crypto.tink.proto.u0.b)u0.S2(this.params_).K1(u00)).C1();
            return;
        }
        this.params_ = u00;
    }

    public static b T2() {
        return (b)y0.DEFAULT_INSTANCE.y1();
    }

    public static b U2(y0 y00) {
        return (b)y0.DEFAULT_INSTANCE.z1(y00);
    }

    public static y0 V2(InputStream inputStream0) throws IOException {
        return (y0)l0.i2(y0.DEFAULT_INSTANCE, inputStream0);
    }

    public static y0 W2(InputStream inputStream0, V v0) throws IOException {
        return (y0)l0.j2(y0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static y0 X2(u u0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return (y0)l0.k2(y0.DEFAULT_INSTANCE, u0);
    }

    public static y0 Y2(u u0, V v0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return (y0)l0.l2(y0.DEFAULT_INSTANCE, u0, v0);
    }

    public static y0 Z2(z z0) throws IOException {
        return (y0)l0.m2(y0.DEFAULT_INSTANCE, z0);
    }

    @Override  // com.google.crypto.tink.proto.z0
    public u0 a() {
        return this.params_ == null ? u0.Q2() : this.params_;
    }

    public static y0 a3(z z0, V v0) throws IOException {
        return (y0)l0.n2(y0.DEFAULT_INSTANCE, z0, v0);
    }

    @Override  // com.google.crypto.tink.proto.z0
    public boolean b() {
        return this.params_ != null;
    }

    public static y0 b3(InputStream inputStream0) throws IOException {
        return (y0)l0.o2(y0.DEFAULT_INSTANCE, inputStream0);
    }

    public static y0 c3(InputStream inputStream0, V v0) throws IOException {
        return (y0)l0.p2(y0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static y0 d3(ByteBuffer byteBuffer0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return (y0)l0.q2(y0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static y0 e3(ByteBuffer byteBuffer0, V v0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return (y0)l0.r2(y0.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static y0 f3(byte[] arr_b) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return (y0)l0.s2(y0.DEFAULT_INSTANCE, arr_b);
    }

    public static y0 g3(byte[] arr_b, V v0) throws com.google.crypto.tink.shaded.protobuf.y0 {
        return (y0)l0.t2(y0.DEFAULT_INSTANCE, arr_b, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.z0
    public int getVersion() {
        return this.version_;
    }

    public static j1 h3() {
        return y0.DEFAULT_INSTANCE.getParserForType();
    }

    private void j3(u0 u00) {
        u00.getClass();
        this.params_ = u00;
    }

    private void k3(int v) {
        this.version_ = v;
    }

    private void l3(u u0) {
        u0.getClass();
        this.x_ = u0;
    }

    private void m3(u u0) {
        u0.getClass();
        this.y_ = u0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a newBuilderForType() {
        return super.d2();
    }

    @Override  // com.google.crypto.tink.proto.z0
    public u t() {
        return this.x_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    public com.google.crypto.tink.shaded.protobuf.R0.a toBuilder() {
        return super.C2();
    }

    @Override  // com.google.crypto.tink.proto.z0
    public u u() {
        return this.y_;
    }
}

