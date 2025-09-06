package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class v extends l0 implements w {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements w {
        private b() {
            super(v.DEFAULT_INSTANCE);
        }

        b(a v$a0) {
        }

        public b Q1() {
            this.F1();
            ((v)this.b).G2();
            return this;
        }

        public b R1(u u0) {
            this.F1();
            ((v)this.b).Y2(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.w
        public u getValue() {
            return ((v)this.b).getValue();
        }
    }

    private static final v DEFAULT_INSTANCE = null;
    private static volatile j1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private u value_;

    static {
        v v0 = new v();
        v.DEFAULT_INSTANCE = v0;
        l0.A2(v.class, v0);
    }

    private v() {
        this.value_ = u.e;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new v();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(v.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            }
            case 4: {
                return v.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = v.PARSER;
                if(j10 == null) {
                    Class class0 = v.class;
                    synchronized(class0) {
                        j10 = v.PARSER;
                        if(j10 == null) {
                            j10 = new c(v.DEFAULT_INSTANCE);
                            v.PARSER = j10;
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

    private void G2() {
        this.value_ = v.H2().getValue();
    }

    public static v H2() {
        return v.DEFAULT_INSTANCE;
    }

    public static b I2() {
        return (b)v.DEFAULT_INSTANCE.y1();
    }

    public static b J2(v v0) {
        return (b)v.DEFAULT_INSTANCE.z1(v0);
    }

    public static v K2(u u0) {
        return (v)v.I2().R1(u0).B1();
    }

    public static v L2(InputStream inputStream0) throws IOException {
        return (v)l0.i2(v.DEFAULT_INSTANCE, inputStream0);
    }

    public static v M2(InputStream inputStream0, V v0) throws IOException {
        return (v)l0.j2(v.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static v N2(u u0) throws y0 {
        return (v)l0.k2(v.DEFAULT_INSTANCE, u0);
    }

    public static v O2(u u0, V v0) throws y0 {
        return (v)l0.l2(v.DEFAULT_INSTANCE, u0, v0);
    }

    public static v P2(z z0) throws IOException {
        return (v)l0.m2(v.DEFAULT_INSTANCE, z0);
    }

    public static v Q2(z z0, V v0) throws IOException {
        return (v)l0.n2(v.DEFAULT_INSTANCE, z0, v0);
    }

    public static v R2(InputStream inputStream0) throws IOException {
        return (v)l0.o2(v.DEFAULT_INSTANCE, inputStream0);
    }

    public static v S2(InputStream inputStream0, V v0) throws IOException {
        return (v)l0.p2(v.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static v T2(ByteBuffer byteBuffer0) throws y0 {
        return (v)l0.q2(v.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static v U2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (v)l0.r2(v.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static v V2(byte[] arr_b) throws y0 {
        return (v)l0.s2(v.DEFAULT_INSTANCE, arr_b);
    }

    public static v W2(byte[] arr_b, V v0) throws y0 {
        return (v)l0.t2(v.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 X2() {
        return v.DEFAULT_INSTANCE.getParserForType();
    }

    private void Y2(u u0) {
        u0.getClass();
        this.value_ = u0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.w
    public u getValue() {
        return this.value_;
    }
}

