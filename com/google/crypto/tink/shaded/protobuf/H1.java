package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class h1 extends l0 implements i1 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements i1 {
        private b() {
            super(h1.DEFAULT_INSTANCE);
        }

        b(a h1$a0) {
        }

        public b Q1() {
            this.F1();
            ((h1)this.b).K2();
            return this;
        }

        public b R1() {
            this.F1();
            ((h1)this.b).L2();
            return this;
        }

        public b S1(f f0) {
            this.F1();
            ((h1)this.b).N2(f0);
            return this;
        }

        public b T1(String s) {
            this.F1();
            ((h1)this.b).d3(s);
            return this;
        }

        public b U1(u u0) {
            this.F1();
            ((h1)this.b).e3(u0);
            return this;
        }

        public b V1(com.google.crypto.tink.shaded.protobuf.f.b f$b0) {
            this.F1();
            ((h1)this.b).f3(((f)f$b0.B1()));
            return this;
        }

        public b W1(f f0) {
            this.F1();
            ((h1)this.b).f3(f0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.i1
        public String getName() {
            return ((h1)this.b).getName();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.i1
        public u getNameBytes() {
            return ((h1)this.b).getNameBytes();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.i1
        public f getValue() {
            return ((h1)this.b).getValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.i1
        public boolean hasValue() {
            return ((h1)this.b).hasValue();
        }
    }

    private static final h1 DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile j1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_;
    private f value_;

    static {
        h1 h10 = new h1();
        h1.DEFAULT_INSTANCE = h10;
        l0.A2(h1.class, h10);
    }

    private h1() {
        this.name_ = "";
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new h1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(h1.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            }
            case 4: {
                return h1.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = h1.PARSER;
                if(j10 == null) {
                    Class class0 = h1.class;
                    synchronized(class0) {
                        j10 = h1.PARSER;
                        if(j10 == null) {
                            j10 = new c(h1.DEFAULT_INSTANCE);
                            h1.PARSER = j10;
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

    private void K2() {
        this.name_ = "";
    }

    private void L2() {
        this.value_ = null;
    }

    public static h1 M2() {
        return h1.DEFAULT_INSTANCE;
    }

    private void N2(f f0) {
        f0.getClass();
        if(this.value_ != null && this.value_ != f.L2()) {
            this.value_ = (f)((com.google.crypto.tink.shaded.protobuf.f.b)f.N2(this.value_).K1(f0)).C1();
            return;
        }
        this.value_ = f0;
    }

    public static b O2() {
        return (b)h1.DEFAULT_INSTANCE.y1();
    }

    public static b P2(h1 h10) {
        return (b)h1.DEFAULT_INSTANCE.z1(h10);
    }

    public static h1 Q2(InputStream inputStream0) throws IOException {
        return (h1)l0.i2(h1.DEFAULT_INSTANCE, inputStream0);
    }

    public static h1 R2(InputStream inputStream0, V v0) throws IOException {
        return (h1)l0.j2(h1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static h1 S2(u u0) throws y0 {
        return (h1)l0.k2(h1.DEFAULT_INSTANCE, u0);
    }

    public static h1 T2(u u0, V v0) throws y0 {
        return (h1)l0.l2(h1.DEFAULT_INSTANCE, u0, v0);
    }

    public static h1 U2(z z0) throws IOException {
        return (h1)l0.m2(h1.DEFAULT_INSTANCE, z0);
    }

    public static h1 V2(z z0, V v0) throws IOException {
        return (h1)l0.n2(h1.DEFAULT_INSTANCE, z0, v0);
    }

    public static h1 W2(InputStream inputStream0) throws IOException {
        return (h1)l0.o2(h1.DEFAULT_INSTANCE, inputStream0);
    }

    public static h1 X2(InputStream inputStream0, V v0) throws IOException {
        return (h1)l0.p2(h1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static h1 Y2(ByteBuffer byteBuffer0) throws y0 {
        return (h1)l0.q2(h1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static h1 Z2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (h1)l0.r2(h1.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static h1 a3(byte[] arr_b) throws y0 {
        return (h1)l0.s2(h1.DEFAULT_INSTANCE, arr_b);
    }

    public static h1 b3(byte[] arr_b, V v0) throws y0 {
        return (h1)l0.t2(h1.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 c3() {
        return h1.DEFAULT_INSTANCE.getParserForType();
    }

    private void d3(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void e3(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.name_ = u0.i0();
    }

    private void f3(f f0) {
        f0.getClass();
        this.value_ = f0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.i1
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.i1
    public u getNameBytes() {
        return u.r(this.name_);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.i1
    public f getValue() {
        return this.value_ == null ? f.L2() : this.value_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.i1
    public boolean hasValue() {
        return this.value_ != null;
    }
}

