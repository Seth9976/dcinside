package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class i0 extends l0 implements j0 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements j0 {
        private b() {
            super(i0.DEFAULT_INSTANCE);
        }

        b(a i0$a0) {
        }

        public b Q1() {
            this.F1();
            ((i0)this.b).G2();
            return this;
        }

        public b R1(float f) {
            this.F1();
            ((i0)this.b).Y2(f);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j0
        public float getValue() {
            return ((i0)this.b).getValue();
        }
    }

    private static final i0 DEFAULT_INSTANCE = null;
    private static volatile j1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        i0 i00 = new i0();
        i0.DEFAULT_INSTANCE = i00;
        l0.A2(i0.class, i00);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new i0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(i0.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            }
            case 4: {
                return i0.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = i0.PARSER;
                if(j10 == null) {
                    Class class0 = i0.class;
                    synchronized(class0) {
                        j10 = i0.PARSER;
                        if(j10 == null) {
                            j10 = new c(i0.DEFAULT_INSTANCE);
                            i0.PARSER = j10;
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
        this.value_ = 0.0f;
    }

    public static i0 H2() {
        return i0.DEFAULT_INSTANCE;
    }

    public static b I2() {
        return (b)i0.DEFAULT_INSTANCE.y1();
    }

    public static b J2(i0 i00) {
        return (b)i0.DEFAULT_INSTANCE.z1(i00);
    }

    public static i0 K2(float f) {
        return (i0)i0.I2().R1(f).B1();
    }

    public static i0 L2(InputStream inputStream0) throws IOException {
        return (i0)l0.i2(i0.DEFAULT_INSTANCE, inputStream0);
    }

    public static i0 M2(InputStream inputStream0, V v0) throws IOException {
        return (i0)l0.j2(i0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static i0 N2(u u0) throws y0 {
        return (i0)l0.k2(i0.DEFAULT_INSTANCE, u0);
    }

    public static i0 O2(u u0, V v0) throws y0 {
        return (i0)l0.l2(i0.DEFAULT_INSTANCE, u0, v0);
    }

    public static i0 P2(z z0) throws IOException {
        return (i0)l0.m2(i0.DEFAULT_INSTANCE, z0);
    }

    public static i0 Q2(z z0, V v0) throws IOException {
        return (i0)l0.n2(i0.DEFAULT_INSTANCE, z0, v0);
    }

    public static i0 R2(InputStream inputStream0) throws IOException {
        return (i0)l0.o2(i0.DEFAULT_INSTANCE, inputStream0);
    }

    public static i0 S2(InputStream inputStream0, V v0) throws IOException {
        return (i0)l0.p2(i0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static i0 T2(ByteBuffer byteBuffer0) throws y0 {
        return (i0)l0.q2(i0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static i0 U2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (i0)l0.r2(i0.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static i0 V2(byte[] arr_b) throws y0 {
        return (i0)l0.s2(i0.DEFAULT_INSTANCE, arr_b);
    }

    public static i0 W2(byte[] arr_b, V v0) throws y0 {
        return (i0)l0.t2(i0.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 X2() {
        return i0.DEFAULT_INSTANCE.getParserForType();
    }

    private void Y2(float f) {
        this.value_ = f;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j0
    public float getValue() {
        return this.value_;
    }
}

