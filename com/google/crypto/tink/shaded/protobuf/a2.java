package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a2 extends l0 implements b2 {
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

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements b2 {
        private b() {
            super(a2.DEFAULT_INSTANCE);
        }

        b(a a2$a0) {
        }

        public b Q1() {
            this.F1();
            ((a2)this.b).V2();
            return this;
        }

        public b R1() {
            this.F1();
            ((a2)this.b).W2();
            return this;
        }

        public b S1() {
            this.F1();
            ((a2)this.b).X2();
            return this;
        }

        public b T1() {
            this.F1();
            ((a2)this.b).Y2();
            return this;
        }

        public b U1() {
            this.F1();
            ((a2)this.b).Z2();
            return this;
        }

        public b V1() {
            this.F1();
            ((a2)this.b).a3();
            return this;
        }

        public b W1() {
            this.F1();
            ((a2)this.b).b3();
            return this;
        }

        public b X1(G0 g00) {
            this.F1();
            ((a2)this.b).d3(g00);
            return this;
        }

        public b Y1(C1 c10) {
            this.F1();
            ((a2)this.b).e3(c10);
            return this;
        }

        public b Z1(boolean z) {
            this.F1();
            ((a2)this.b).v3(z);
            return this;
        }

        public b a2(com.google.crypto.tink.shaded.protobuf.G0.b g0$b0) {
            this.F1();
            ((a2)this.b).w3(((G0)g0$b0.B1()));
            return this;
        }

        public b b2(G0 g00) {
            this.F1();
            ((a2)this.b).w3(g00);
            return this;
        }

        public b c2(f1 f10) {
            this.F1();
            ((a2)this.b).x3(f10);
            return this;
        }

        public b d2(int v) {
            this.F1();
            ((a2)this.b).y3(v);
            return this;
        }

        public b e2(double f) {
            this.F1();
            ((a2)this.b).z3(f);
            return this;
        }

        public b f2(String s) {
            this.F1();
            ((a2)this.b).A3(s);
            return this;
        }

        public b g2(u u0) {
            this.F1();
            ((a2)this.b).B3(u0);
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean getBoolValue() {
            return ((a2)this.b).getBoolValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public c getKindCase() {
            return ((a2)this.b).getKindCase();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public G0 getListValue() {
            return ((a2)this.b).getListValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public f1 getNullValue() {
            return ((a2)this.b).getNullValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public int getNullValueValue() {
            return ((a2)this.b).getNullValueValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public double getNumberValue() {
            return ((a2)this.b).getNumberValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public String getStringValue() {
            return ((a2)this.b).getStringValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public u getStringValueBytes() {
            return ((a2)this.b).getStringValueBytes();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public C1 getStructValue() {
            return ((a2)this.b).getStructValue();
        }

        public b h2(com.google.crypto.tink.shaded.protobuf.C1.b c1$b0) {
            this.F1();
            ((a2)this.b).C3(((C1)c1$b0.B1()));
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean hasBoolValue() {
            return ((a2)this.b).hasBoolValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean hasListValue() {
            return ((a2)this.b).hasListValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean hasNullValue() {
            return ((a2)this.b).hasNullValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean hasNumberValue() {
            return ((a2)this.b).hasNumberValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean hasStringValue() {
            return ((a2)this.b).hasStringValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.b2
        public boolean hasStructValue() {
            return ((a2)this.b).hasStructValue();
        }

        public b i2(C1 c10) {
            this.F1();
            ((a2)this.b).C3(c10);
            return this;
        }
    }

    public static enum c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int a;

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.h;
                }
                case 1: {
                    return c.b;
                }
                case 2: {
                    return c.c;
                }
                case 3: {
                    return c.d;
                }
                case 4: {
                    return c.e;
                }
                case 5: {
                    return c.f;
                }
                case 6: {
                    return c.g;
                }
                default: {
                    return null;
                }
            }
        }

        @Deprecated
        public static c b(int v) {
            return c.a(v);
        }

        public int getNumber() {
            return this.a;
        }
    }

    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final a2 DEFAULT_INSTANCE = null;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile j1 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_;
    private Object kind_;

    static {
        a2 a20 = new a2();
        a2.DEFAULT_INSTANCE = a20;
        l0.A2(a2.class, a20);
    }

    private a2() {
        this.kindCase_ = 0;
    }

    private void A3(String s) {
        s.getClass();
        this.kindCase_ = 3;
        this.kind_ = s;
    }

    private void B3(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.kind_ = u0.i0();
        this.kindCase_ = 3;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new a2();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(a2.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", C1.class, G0.class});
            }
            case 4: {
                return a2.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = a2.PARSER;
                if(j10 == null) {
                    Class class0 = a2.class;
                    synchronized(class0) {
                        j10 = a2.PARSER;
                        if(j10 == null) {
                            j10 = new com.google.crypto.tink.shaded.protobuf.l0.c(a2.DEFAULT_INSTANCE);
                            a2.PARSER = j10;
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

    private void C3(C1 c10) {
        c10.getClass();
        this.kind_ = c10;
        this.kindCase_ = 5;
    }

    private void V2() {
        if(this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void W2() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    private void X2() {
        if(this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void Y2() {
        if(this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void Z2() {
        if(this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void a3() {
        if(this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void b3() {
        if(this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static a2 c3() {
        return a2.DEFAULT_INSTANCE;
    }

    private void d3(G0 g00) {
        g00.getClass();
        this.kind_ = this.kindCase_ != 6 || this.kind_ == G0.P2() ? g00 : ((com.google.crypto.tink.shaded.protobuf.G0.b)G0.T2(((G0)this.kind_)).K1(g00)).C1();
        this.kindCase_ = 6;
    }

    private void e3(C1 c10) {
        c10.getClass();
        this.kind_ = this.kindCase_ != 5 || this.kind_ == C1.F2() ? c10 : ((com.google.crypto.tink.shaded.protobuf.C1.b)C1.K2(((C1)this.kind_)).K1(c10)).C1();
        this.kindCase_ = 5;
    }

    public static b f3() {
        return (b)a2.DEFAULT_INSTANCE.y1();
    }

    public static b g3(a2 a20) {
        return (b)a2.DEFAULT_INSTANCE.z1(a20);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean getBoolValue() {
        return this.kindCase_ == 4 ? ((Boolean)this.kind_).booleanValue() : false;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public c getKindCase() {
        return c.a(this.kindCase_);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public G0 getListValue() {
        return this.kindCase_ == 6 ? ((G0)this.kind_) : G0.P2();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public f1 getNullValue() {
        if(this.kindCase_ == 1) {
            f1 f10 = f1.a(((int)(((Integer)this.kind_))));
            return f10 == null ? f1.c : f10;
        }
        return f1.b;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public int getNullValueValue() {
        return this.kindCase_ == 1 ? ((int)(((Integer)this.kind_))) : 0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public double getNumberValue() {
        return this.kindCase_ == 2 ? ((double)(((Double)this.kind_))) : 0.0;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public String getStringValue() {
        return this.kindCase_ == 3 ? ((String)this.kind_) : "";
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public u getStringValueBytes() {
        return this.kindCase_ == 3 ? u.r(((String)this.kind_)) : u.r("");
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public C1 getStructValue() {
        return this.kindCase_ == 5 ? ((C1)this.kind_) : C1.F2();
    }

    public static a2 h3(InputStream inputStream0) throws IOException {
        return (a2)l0.i2(a2.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.b2
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static a2 j3(InputStream inputStream0, V v0) throws IOException {
        return (a2)l0.j2(a2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static a2 k3(u u0) throws y0 {
        return (a2)l0.k2(a2.DEFAULT_INSTANCE, u0);
    }

    public static a2 l3(u u0, V v0) throws y0 {
        return (a2)l0.l2(a2.DEFAULT_INSTANCE, u0, v0);
    }

    public static a2 m3(z z0) throws IOException {
        return (a2)l0.m2(a2.DEFAULT_INSTANCE, z0);
    }

    public static a2 n3(z z0, V v0) throws IOException {
        return (a2)l0.n2(a2.DEFAULT_INSTANCE, z0, v0);
    }

    public static a2 o3(InputStream inputStream0) throws IOException {
        return (a2)l0.o2(a2.DEFAULT_INSTANCE, inputStream0);
    }

    public static a2 p3(InputStream inputStream0, V v0) throws IOException {
        return (a2)l0.p2(a2.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static a2 q3(ByteBuffer byteBuffer0) throws y0 {
        return (a2)l0.q2(a2.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static a2 r3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (a2)l0.r2(a2.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static a2 s3(byte[] arr_b) throws y0 {
        return (a2)l0.s2(a2.DEFAULT_INSTANCE, arr_b);
    }

    public static a2 t3(byte[] arr_b, V v0) throws y0 {
        return (a2)l0.t2(a2.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 u3() {
        return a2.DEFAULT_INSTANCE.getParserForType();
    }

    private void v3(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    private void w3(G0 g00) {
        g00.getClass();
        this.kind_ = g00;
        this.kindCase_ = 6;
    }

    private void x3(f1 f10) {
        this.kind_ = f10.getNumber();
        this.kindCase_ = 1;
    }

    private void y3(int v) {
        this.kindCase_ = 1;
        this.kind_ = v;
    }

    private void z3(double f) {
        this.kindCase_ = 2;
        this.kind_ = f;
    }
}

