package com.google.crypto.tink.shaded.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class b0 extends l0 implements c0 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements c0 {
        private b() {
            super(b0.DEFAULT_INSTANCE);
        }

        b(a b0$a0) {
        }

        public b Q1(Iterable iterable0) {
            this.F1();
            ((b0)this.b).J2(iterable0);
            return this;
        }

        public b R1(String s) {
            this.F1();
            ((b0)this.b).K2(s);
            return this;
        }

        public b S1(u u0) {
            this.F1();
            ((b0)this.b).L2(u0);
            return this;
        }

        public b T1() {
            this.F1();
            ((b0)this.b).M2();
            return this;
        }

        public b U1(int v, String s) {
            this.F1();
            ((b0)this.b).e3(v, s);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.c0
        public String getPaths(int v) {
            return ((b0)this.b).getPaths(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.c0
        public u getPathsBytes(int v) {
            return ((b0)this.b).getPathsBytes(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.c0
        public int getPathsCount() {
            return ((b0)this.b).getPathsCount();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.c0
        public List getPathsList() {
            return DesugarCollections.unmodifiableList(((b0)this.b).getPathsList());
        }
    }

    private static final b0 DEFAULT_INSTANCE = null;
    private static volatile j1 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private k paths_;

    static {
        b0 b00 = new b0();
        b0.DEFAULT_INSTANCE = b00;
        l0.A2(b0.class, b00);
    }

    private b0() {
        this.paths_ = l0.I1();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new b0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(b0.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            }
            case 4: {
                return b0.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = b0.PARSER;
                if(j10 == null) {
                    Class class0 = b0.class;
                    synchronized(class0) {
                        j10 = b0.PARSER;
                        if(j10 == null) {
                            j10 = new c(b0.DEFAULT_INSTANCE);
                            b0.PARSER = j10;
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

    private void J2(Iterable iterable0) {
        this.N2();
        com.google.crypto.tink.shaded.protobuf.a.i1(iterable0, this.paths_);
    }

    private void K2(String s) {
        s.getClass();
        this.N2();
        this.paths_.add(s);
    }

    private void L2(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.N2();
        this.paths_.add(u0.i0());
    }

    private void M2() {
        this.paths_ = l0.I1();
    }

    private void N2() {
        k t0$k0 = this.paths_;
        if(!t0$k0.isModifiable()) {
            this.paths_ = l0.c2(t0$k0);
        }
    }

    public static b0 O2() {
        return b0.DEFAULT_INSTANCE;
    }

    public static b P2() {
        return (b)b0.DEFAULT_INSTANCE.y1();
    }

    public static b Q2(b0 b00) {
        return (b)b0.DEFAULT_INSTANCE.z1(b00);
    }

    public static b0 R2(InputStream inputStream0) throws IOException {
        return (b0)l0.i2(b0.DEFAULT_INSTANCE, inputStream0);
    }

    public static b0 S2(InputStream inputStream0, V v0) throws IOException {
        return (b0)l0.j2(b0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static b0 T2(u u0) throws y0 {
        return (b0)l0.k2(b0.DEFAULT_INSTANCE, u0);
    }

    public static b0 U2(u u0, V v0) throws y0 {
        return (b0)l0.l2(b0.DEFAULT_INSTANCE, u0, v0);
    }

    public static b0 V2(z z0) throws IOException {
        return (b0)l0.m2(b0.DEFAULT_INSTANCE, z0);
    }

    public static b0 W2(z z0, V v0) throws IOException {
        return (b0)l0.n2(b0.DEFAULT_INSTANCE, z0, v0);
    }

    public static b0 X2(InputStream inputStream0) throws IOException {
        return (b0)l0.o2(b0.DEFAULT_INSTANCE, inputStream0);
    }

    public static b0 Y2(InputStream inputStream0, V v0) throws IOException {
        return (b0)l0.p2(b0.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static b0 Z2(ByteBuffer byteBuffer0) throws y0 {
        return (b0)l0.q2(b0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static b0 a3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (b0)l0.r2(b0.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static b0 b3(byte[] arr_b) throws y0 {
        return (b0)l0.s2(b0.DEFAULT_INSTANCE, arr_b);
    }

    public static b0 c3(byte[] arr_b, V v0) throws y0 {
        return (b0)l0.t2(b0.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 d3() {
        return b0.DEFAULT_INSTANCE.getParserForType();
    }

    private void e3(int v, String s) {
        s.getClass();
        this.N2();
        this.paths_.set(v, s);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c0
    public String getPaths(int v) {
        return (String)this.paths_.get(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c0
    public u getPathsBytes(int v) {
        return u.r(((String)this.paths_.get(v)));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c0
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c0
    public List getPathsList() {
        return this.paths_;
    }
}

