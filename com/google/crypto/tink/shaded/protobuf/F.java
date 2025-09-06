package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class f extends l0 implements g {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements g {
        private b() {
            super(f.DEFAULT_INSTANCE);
        }

        b(a f$a0) {
        }

        public b Q1() {
            this.F1();
            ((f)this.b).J2();
            return this;
        }

        public b R1() {
            this.F1();
            ((f)this.b).K2();
            return this;
        }

        public b S1(String s) {
            this.F1();
            ((f)this.b).b3(s);
            return this;
        }

        public b T1(u u0) {
            this.F1();
            ((f)this.b).c3(u0);
            return this;
        }

        public b U1(u u0) {
            this.F1();
            ((f)this.b).d3(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.g
        public String getTypeUrl() {
            return ((f)this.b).getTypeUrl();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.g
        public u getTypeUrlBytes() {
            return ((f)this.b).getTypeUrlBytes();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.g
        public u getValue() {
            return ((f)this.b).getValue();
        }
    }

    private static final f DEFAULT_INSTANCE = null;
    private static volatile j1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_;
    private u value_;

    static {
        f f0 = new f();
        f.DEFAULT_INSTANCE = f0;
        l0.A2(f.class, f0);
    }

    private f() {
        this.typeUrl_ = "";
        this.value_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new f();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(f.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            }
            case 4: {
                return f.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = f.PARSER;
                if(j10 == null) {
                    Class class0 = f.class;
                    synchronized(class0) {
                        j10 = f.PARSER;
                        if(j10 == null) {
                            j10 = new c(f.DEFAULT_INSTANCE);
                            f.PARSER = j10;
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
        this.typeUrl_ = f.L2().getTypeUrl();
    }

    private void K2() {
        this.value_ = f.L2().getValue();
    }

    public static f L2() {
        return f.DEFAULT_INSTANCE;
    }

    public static b M2() {
        return (b)f.DEFAULT_INSTANCE.y1();
    }

    public static b N2(f f0) {
        return (b)f.DEFAULT_INSTANCE.z1(f0);
    }

    public static f O2(InputStream inputStream0) throws IOException {
        return (f)l0.i2(f.DEFAULT_INSTANCE, inputStream0);
    }

    public static f P2(InputStream inputStream0, V v0) throws IOException {
        return (f)l0.j2(f.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static f Q2(u u0) throws y0 {
        return (f)l0.k2(f.DEFAULT_INSTANCE, u0);
    }

    public static f R2(u u0, V v0) throws y0 {
        return (f)l0.l2(f.DEFAULT_INSTANCE, u0, v0);
    }

    public static f S2(z z0) throws IOException {
        return (f)l0.m2(f.DEFAULT_INSTANCE, z0);
    }

    public static f T2(z z0, V v0) throws IOException {
        return (f)l0.n2(f.DEFAULT_INSTANCE, z0, v0);
    }

    public static f U2(InputStream inputStream0) throws IOException {
        return (f)l0.o2(f.DEFAULT_INSTANCE, inputStream0);
    }

    public static f V2(InputStream inputStream0, V v0) throws IOException {
        return (f)l0.p2(f.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static f W2(ByteBuffer byteBuffer0) throws y0 {
        return (f)l0.q2(f.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static f X2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (f)l0.r2(f.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static f Y2(byte[] arr_b) throws y0 {
        return (f)l0.s2(f.DEFAULT_INSTANCE, arr_b);
    }

    public static f Z2(byte[] arr_b, V v0) throws y0 {
        return (f)l0.t2(f.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 a3() {
        return f.DEFAULT_INSTANCE.getParserForType();
    }

    private void b3(String s) {
        s.getClass();
        this.typeUrl_ = s;
    }

    private void c3(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.typeUrl_ = u0.i0();
    }

    private void d3(u u0) {
        u0.getClass();
        this.value_ = u0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.g
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.g
    public u getTypeUrlBytes() {
        return u.r(this.typeUrl_);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.g
    public u getValue() {
        return this.value_;
    }
}

