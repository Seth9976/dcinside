package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class o extends l0 implements p {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements p {
        private b() {
            super(o.DEFAULT_INSTANCE);
        }

        b(a o$a0) {
        }

        public b Q1() {
            this.F1();
            ((o)this.b).G2();
            return this;
        }

        public b R1(boolean z) {
            this.F1();
            ((o)this.b).Y2(z);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.p
        public boolean getValue() {
            return ((o)this.b).getValue();
        }
    }

    private static final o DEFAULT_INSTANCE = null;
    private static volatile j1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

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
                return l0.e2(o.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
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

    private void G2() {
        this.value_ = false;
    }

    public static o H2() {
        return o.DEFAULT_INSTANCE;
    }

    public static b I2() {
        return (b)o.DEFAULT_INSTANCE.y1();
    }

    public static b J2(o o0) {
        return (b)o.DEFAULT_INSTANCE.z1(o0);
    }

    public static o K2(boolean z) {
        return (o)o.I2().R1(z).B1();
    }

    public static o L2(InputStream inputStream0) throws IOException {
        return (o)l0.i2(o.DEFAULT_INSTANCE, inputStream0);
    }

    public static o M2(InputStream inputStream0, V v0) throws IOException {
        return (o)l0.j2(o.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static o N2(u u0) throws y0 {
        return (o)l0.k2(o.DEFAULT_INSTANCE, u0);
    }

    public static o O2(u u0, V v0) throws y0 {
        return (o)l0.l2(o.DEFAULT_INSTANCE, u0, v0);
    }

    public static o P2(z z0) throws IOException {
        return (o)l0.m2(o.DEFAULT_INSTANCE, z0);
    }

    public static o Q2(z z0, V v0) throws IOException {
        return (o)l0.n2(o.DEFAULT_INSTANCE, z0, v0);
    }

    public static o R2(InputStream inputStream0) throws IOException {
        return (o)l0.o2(o.DEFAULT_INSTANCE, inputStream0);
    }

    public static o S2(InputStream inputStream0, V v0) throws IOException {
        return (o)l0.p2(o.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static o T2(ByteBuffer byteBuffer0) throws y0 {
        return (o)l0.q2(o.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static o U2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (o)l0.r2(o.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static o V2(byte[] arr_b) throws y0 {
        return (o)l0.s2(o.DEFAULT_INSTANCE, arr_b);
    }

    public static o W2(byte[] arr_b, V v0) throws y0 {
        return (o)l0.t2(o.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 X2() {
        return o.DEFAULT_INSTANCE.getParserForType();
    }

    private void Y2(boolean z) {
        this.value_ = z;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.p
    public boolean getValue() {
        return this.value_;
    }
}

