package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.R0;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.l0.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class k2 extends l0 implements l2 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements l2 {
        private b() {
            super(k2.DEFAULT_INSTANCE);
        }

        b(a k2$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a B6(z z0) throws IOException {
            return super.r1(z0);
        }

        @Override  // com.google.crypto.tink.proto.l2
        public c E0() {
            return ((k2)this.b).E0();
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
            ((k2)this.b).M2();
            return this;
        }

        public b R1() {
            this.F1();
            ((k2)this.b).N2();
            return this;
        }

        public b S1() {
            this.F1();
            ((k2)this.b).O2();
            return this;
        }

        public b T1(c k2$c0) {
            this.F1();
            ((k2)this.b).f3(k2$c0);
            return this;
        }

        public b U1(int v) {
            this.F1();
            ((k2)this.b).g3(v);
            return this;
        }

        public b V1(String s) {
            this.F1();
            ((k2)this.b).h3(s);
            return this;
        }

        public b W1(u u0) {
            this.F1();
            ((k2)this.b).j3(u0);
            return this;
        }

        public b X1(u u0) {
            this.F1();
            ((k2)this.b).k3(u0);
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

        @Override  // com.google.crypto.tink.proto.l2
        public String getTypeUrl() {
            return ((k2)this.b).getTypeUrl();
        }

        @Override  // com.google.crypto.tink.proto.l2
        public u getTypeUrlBytes() {
            return ((k2)this.b).getTypeUrlBytes();
        }

        @Override  // com.google.crypto.tink.proto.l2
        public u getValue() {
            return ((k2)this.b).getValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a$a
        public com.google.crypto.tink.shaded.protobuf.R0.a i3(u u0) throws y0 {
            return super.p1(u0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.l0$b
        public com.google.crypto.tink.shaded.protobuf.R0.a j9(z z0, V v0) throws IOException {
            return super.J1(z0, v0);
        }

        @Override  // com.google.crypto.tink.proto.l2
        public int k0() {
            return ((k2)this.b).k0();
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

    public static enum c implements com.google.crypto.tink.shaded.protobuf.t0.c {
        class com.google.crypto.tink.proto.k2.c.a implements d {
            com.google.crypto.tink.proto.k2.c.a() {
                super();
            }

            public c a(int v) {
                return c.a(v);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.t0$d
            public com.google.crypto.tink.shaded.protobuf.t0.c findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.crypto.tink.proto.k2.c.b implements e {
            static final e a;

            static {
                com.google.crypto.tink.proto.k2.c.b.a = new com.google.crypto.tink.proto.k2.c.b();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.t0$e
            public boolean isInRange(int v) {
                return c.a(v) != null;
            }
        }

        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int a;
        public static final int h = 0;
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 3;
        public static final int l = 4;
        private static final d m;

        static {
            c.m = new com.google.crypto.tink.proto.k2.c.a();
        }

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.b;
                }
                case 1: {
                    return c.c;
                }
                case 2: {
                    return c.d;
                }
                case 3: {
                    return c.e;
                }
                case 4: {
                    return c.f;
                }
                default: {
                    return null;
                }
            }
        }

        public static d b() {
            return c.m;
        }

        public static e c() {
            return com.google.crypto.tink.proto.k2.c.b.a;
        }

        @Deprecated
        public static c d(int v) {
            return c.a(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
        public final int getNumber() {
            if(this == c.g) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    private static final k2 DEFAULT_INSTANCE = null;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_;
    private u value_;

    static {
        k2 k20 = new k2();
        k2.DEFAULT_INSTANCE = k20;
        l0.A2(k2.class, k20);
    }

    private k2() {
        this.typeUrl_ = "";
        this.value_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new k2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(k2.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            }
            case 4: {
                return k2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = k2.PARSER;
                if(j10 == null) {
                    Class class0 = k2.class;
                    synchronized(class0) {
                        j10 = k2.PARSER;
                        if(j10 == null) {
                            j10 = new com.google.crypto.tink.shaded.protobuf.l0.c(k2.DEFAULT_INSTANCE);
                            k2.PARSER = j10;
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

    @Override  // com.google.crypto.tink.proto.l2
    public c E0() {
        c k2$c0 = c.a(this.keyMaterialType_);
        return k2$c0 == null ? c.g : k2$c0;
    }

    private void M2() {
        this.keyMaterialType_ = 0;
    }

    private void N2() {
        this.typeUrl_ = "";
    }

    private void O2() {
        this.value_ = k2.P2().getValue();
    }

    public static k2 P2() {
        return k2.DEFAULT_INSTANCE;
    }

    public static b Q2() {
        return (b)k2.DEFAULT_INSTANCE.y1();
    }

    public static b R2(k2 k20) {
        return (b)k2.DEFAULT_INSTANCE.z1(k20);
    }

    public static k2 S2(InputStream inputStream0) throws IOException {
        return (k2)l0.i2(k2.DEFAULT_INSTANCE, inputStream0);
    }

    public static k2 T2(InputStream inputStream0, V v0) throws IOException {
        return (k2)l0.j2(k2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static k2 U2(u u0) throws y0 {
        return (k2)l0.k2(k2.DEFAULT_INSTANCE, u0);
    }

    public static k2 V2(u u0, V v0) throws y0 {
        return (k2)l0.l2(k2.DEFAULT_INSTANCE, u0, v0);
    }

    public static k2 W2(z z0) throws IOException {
        return (k2)l0.m2(k2.DEFAULT_INSTANCE, z0);
    }

    public static k2 X2(z z0, V v0) throws IOException {
        return (k2)l0.n2(k2.DEFAULT_INSTANCE, z0, v0);
    }

    public static k2 Y2(InputStream inputStream0) throws IOException {
        return (k2)l0.o2(k2.DEFAULT_INSTANCE, inputStream0);
    }

    public static k2 Z2(InputStream inputStream0, V v0) throws IOException {
        return (k2)l0.p2(k2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static k2 a3(ByteBuffer byteBuffer0) throws y0 {
        return (k2)l0.q2(k2.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static k2 b3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (k2)l0.r2(k2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static k2 c3(byte[] arr_b) throws y0 {
        return (k2)l0.s2(k2.DEFAULT_INSTANCE, arr_b);
    }

    public static k2 d3(byte[] arr_b, V v0) throws y0 {
        return (k2)l0.t2(k2.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 e3() {
        return k2.DEFAULT_INSTANCE.getParserForType();
    }

    private void f3(c k2$c0) {
        this.keyMaterialType_ = k2$c0.getNumber();
    }

    private void g3(int v) {
        this.keyMaterialType_ = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.S0
    public R0 getDefaultInstanceForType() {
        return super.L1();
    }

    @Override  // com.google.crypto.tink.proto.l2
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override  // com.google.crypto.tink.proto.l2
    public u getTypeUrlBytes() {
        return u.r(this.typeUrl_);
    }

    @Override  // com.google.crypto.tink.proto.l2
    public u getValue() {
        return this.value_;
    }

    private void h3(String s) {
        s.getClass();
        this.typeUrl_ = s;
    }

    private void j3(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.typeUrl_ = u0.i0();
    }

    @Override  // com.google.crypto.tink.proto.l2
    public int k0() {
        return this.keyMaterialType_;
    }

    private void k3(u u0) {
        u0.getClass();
        this.value_ = u0;
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

