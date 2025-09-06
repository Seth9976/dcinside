package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class x1 extends l0 implements y1 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements y1 {
        private b() {
            super(x1.DEFAULT_INSTANCE);
        }

        b(a x1$a0) {
        }

        public b Q1() {
            this.F1();
            ((x1)this.b).H2();
            return this;
        }

        public b R1(String s) {
            this.F1();
            ((x1)this.b).Y2(s);
            return this;
        }

        public b S1(u u0) {
            this.F1();
            ((x1)this.b).Z2(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.y1
        public String getFileName() {
            return ((x1)this.b).getFileName();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.y1
        public u getFileNameBytes() {
            return ((x1)this.b).getFileNameBytes();
        }
    }

    private static final x1 DEFAULT_INSTANCE = null;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile j1 PARSER;
    private String fileName_;

    static {
        x1 x10 = new x1();
        x1.DEFAULT_INSTANCE = x10;
        l0.A2(x1.class, x10);
    }

    private x1() {
        this.fileName_ = "";
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new x1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(x1.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            }
            case 4: {
                return x1.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = x1.PARSER;
                if(j10 == null) {
                    Class class0 = x1.class;
                    synchronized(class0) {
                        j10 = x1.PARSER;
                        if(j10 == null) {
                            j10 = new c(x1.DEFAULT_INSTANCE);
                            x1.PARSER = j10;
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
        this.fileName_ = "";
    }

    public static x1 I2() {
        return x1.DEFAULT_INSTANCE;
    }

    public static b J2() {
        return (b)x1.DEFAULT_INSTANCE.y1();
    }

    public static b K2(x1 x10) {
        return (b)x1.DEFAULT_INSTANCE.z1(x10);
    }

    public static x1 L2(InputStream inputStream0) throws IOException {
        return (x1)l0.i2(x1.DEFAULT_INSTANCE, inputStream0);
    }

    public static x1 M2(InputStream inputStream0, V v0) throws IOException {
        return (x1)l0.j2(x1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static x1 N2(u u0) throws y0 {
        return (x1)l0.k2(x1.DEFAULT_INSTANCE, u0);
    }

    public static x1 O2(u u0, V v0) throws y0 {
        return (x1)l0.l2(x1.DEFAULT_INSTANCE, u0, v0);
    }

    public static x1 P2(z z0) throws IOException {
        return (x1)l0.m2(x1.DEFAULT_INSTANCE, z0);
    }

    public static x1 Q2(z z0, V v0) throws IOException {
        return (x1)l0.n2(x1.DEFAULT_INSTANCE, z0, v0);
    }

    public static x1 R2(InputStream inputStream0) throws IOException {
        return (x1)l0.o2(x1.DEFAULT_INSTANCE, inputStream0);
    }

    public static x1 S2(InputStream inputStream0, V v0) throws IOException {
        return (x1)l0.p2(x1.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static x1 T2(ByteBuffer byteBuffer0) throws y0 {
        return (x1)l0.q2(x1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static x1 U2(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (x1)l0.r2(x1.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static x1 V2(byte[] arr_b) throws y0 {
        return (x1)l0.s2(x1.DEFAULT_INSTANCE, arr_b);
    }

    public static x1 W2(byte[] arr_b, V v0) throws y0 {
        return (x1)l0.t2(x1.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 X2() {
        return x1.DEFAULT_INSTANCE.getParserForType();
    }

    private void Y2(String s) {
        s.getClass();
        this.fileName_ = s;
    }

    private void Z2(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.fileName_ = u0.i0();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.y1
    public String getFileName() {
        return this.fileName_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.y1
    public u getFileNameBytes() {
        return u.r(this.fileName_);
    }
}

