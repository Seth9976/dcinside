package com.google.crypto.tink.shaded.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class i extends l0 implements j {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.crypto.tink.shaded.protobuf.l0.i.values().length];
            a.a = arr_v;
            try {
                arr_v[com.google.crypto.tink.shaded.protobuf.l0.i.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.shaded.protobuf.l0.i.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.shaded.protobuf.l0.i.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.shaded.protobuf.l0.i.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.shaded.protobuf.l0.i.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.shaded.protobuf.l0.i.a.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.crypto.tink.shaded.protobuf.l0.i.b.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.l0.b implements j {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        b(a i$a0) {
        }

        public b A2(G1 g10) {
            this.F1();
            ((i)this.b).j4(g10);
            return this;
        }

        public b B2(int v) {
            this.F1();
            ((i)this.b).k4(v);
            return this;
        }

        public b C2(String s) {
            this.F1();
            ((i)this.b).l4(s);
            return this;
        }

        public b D2(u u0) {
            this.F1();
            ((i)this.b).m4(u0);
            return this;
        }

        public b Q1(Iterable iterable0) {
            this.F1();
            ((i)this.b).j3(iterable0);
            return this;
        }

        public b R1(Iterable iterable0) {
            this.F1();
            ((i)this.b).k3(iterable0);
            return this;
        }

        public b S1(Iterable iterable0) {
            this.F1();
            ((i)this.b).l3(iterable0);
            return this;
        }

        public b T1(int v, com.google.crypto.tink.shaded.protobuf.W0.b w0$b0) {
            this.F1();
            ((i)this.b).m3(v, ((W0)w0$b0.B1()));
            return this;
        }

        public b U1(int v, W0 w00) {
            this.F1();
            ((i)this.b).m3(v, w00);
            return this;
        }

        public b V1(com.google.crypto.tink.shaded.protobuf.W0.b w0$b0) {
            this.F1();
            ((i)this.b).n3(((W0)w0$b0.B1()));
            return this;
        }

        public b W1(W0 w00) {
            this.F1();
            ((i)this.b).n3(w00);
            return this;
        }

        public b X1(int v, com.google.crypto.tink.shaded.protobuf.Y0.b y0$b0) {
            this.F1();
            ((i)this.b).o3(v, ((Y0)y0$b0.B1()));
            return this;
        }

        public b Y1(int v, Y0 y00) {
            this.F1();
            ((i)this.b).o3(v, y00);
            return this;
        }

        public b Z1(com.google.crypto.tink.shaded.protobuf.Y0.b y0$b0) {
            this.F1();
            ((i)this.b).p3(((Y0)y0$b0.B1()));
            return this;
        }

        public b a2(Y0 y00) {
            this.F1();
            ((i)this.b).p3(y00);
            return this;
        }

        public b b2(int v, com.google.crypto.tink.shaded.protobuf.h1.b h1$b0) {
            this.F1();
            ((i)this.b).q3(v, ((h1)h1$b0.B1()));
            return this;
        }

        public b c2(int v, h1 h10) {
            this.F1();
            ((i)this.b).q3(v, h10);
            return this;
        }

        public b d2(com.google.crypto.tink.shaded.protobuf.h1.b h1$b0) {
            this.F1();
            ((i)this.b).r3(((h1)h1$b0.B1()));
            return this;
        }

        public b e2(h1 h10) {
            this.F1();
            ((i)this.b).r3(h10);
            return this;
        }

        public b f2() {
            this.F1();
            ((i)this.b).s3();
            return this;
        }

        public b g2() {
            this.F1();
            ((i)this.b).t3();
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public W0 getMethods(int v) {
            return ((i)this.b).getMethods(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public int getMethodsCount() {
            return ((i)this.b).getMethodsCount();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public List getMethodsList() {
            return DesugarCollections.unmodifiableList(((i)this.b).getMethodsList());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public Y0 getMixins(int v) {
            return ((i)this.b).getMixins(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public int getMixinsCount() {
            return ((i)this.b).getMixinsCount();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public List getMixinsList() {
            return DesugarCollections.unmodifiableList(((i)this.b).getMixinsList());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public String getName() {
            return ((i)this.b).getName();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public u getNameBytes() {
            return ((i)this.b).getNameBytes();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public h1 getOptions(int v) {
            return ((i)this.b).getOptions(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public int getOptionsCount() {
            return ((i)this.b).getOptionsCount();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((i)this.b).getOptionsList());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public x1 getSourceContext() {
            return ((i)this.b).getSourceContext();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public G1 getSyntax() {
            return ((i)this.b).getSyntax();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public int getSyntaxValue() {
            return ((i)this.b).getSyntaxValue();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public String getVersion() {
            return ((i)this.b).getVersion();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public u getVersionBytes() {
            return ((i)this.b).getVersionBytes();
        }

        public b h2() {
            this.F1();
            ((i)this.b).u3();
            return this;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.j
        public boolean hasSourceContext() {
            return ((i)this.b).hasSourceContext();
        }

        public b i2() {
            this.F1();
            ((i)this.b).v3();
            return this;
        }

        public b j2() {
            this.F1();
            ((i)this.b).w3();
            return this;
        }

        public b k2() {
            this.F1();
            ((i)this.b).x3();
            return this;
        }

        public b l2() {
            this.F1();
            ((i)this.b).y3();
            return this;
        }

        public b m2(x1 x10) {
            this.F1();
            ((i)this.b).K3(x10);
            return this;
        }

        public b n2(int v) {
            this.F1();
            ((i)this.b).a4(v);
            return this;
        }

        public b o2(int v) {
            this.F1();
            ((i)this.b).b4(v);
            return this;
        }

        public b p2(int v) {
            this.F1();
            ((i)this.b).c4(v);
            return this;
        }

        public b q2(int v, com.google.crypto.tink.shaded.protobuf.W0.b w0$b0) {
            this.F1();
            ((i)this.b).d4(v, ((W0)w0$b0.B1()));
            return this;
        }

        public b r2(int v, W0 w00) {
            this.F1();
            ((i)this.b).d4(v, w00);
            return this;
        }

        public b s2(int v, com.google.crypto.tink.shaded.protobuf.Y0.b y0$b0) {
            this.F1();
            ((i)this.b).e4(v, ((Y0)y0$b0.B1()));
            return this;
        }

        public b t2(int v, Y0 y00) {
            this.F1();
            ((i)this.b).e4(v, y00);
            return this;
        }

        public b u2(String s) {
            this.F1();
            ((i)this.b).f4(s);
            return this;
        }

        public b v2(u u0) {
            this.F1();
            ((i)this.b).g4(u0);
            return this;
        }

        public b w2(int v, com.google.crypto.tink.shaded.protobuf.h1.b h1$b0) {
            this.F1();
            ((i)this.b).h4(v, ((h1)h1$b0.B1()));
            return this;
        }

        public b x2(int v, h1 h10) {
            this.F1();
            ((i)this.b).h4(v, h10);
            return this;
        }

        public b y2(com.google.crypto.tink.shaded.protobuf.x1.b x1$b0) {
            this.F1();
            ((i)this.b).i4(((x1)x1$b0.B1()));
            return this;
        }

        public b z2(x1 x10) {
            this.F1();
            ((i)this.b).i4(x10);
            return this;
        }
    }

    private static final i DEFAULT_INSTANCE = null;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile j1 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private k methods_;
    private k mixins_;
    private String name_;
    private k options_;
    private x1 sourceContext_;
    private int syntax_;
    private String version_;

    static {
        i i0 = new i();
        i.DEFAULT_INSTANCE = i0;
        l0.A2(i.class, i0);
    }

    private i() {
        this.name_ = "";
        this.methods_ = l0.I1();
        this.options_ = l0.I1();
        this.version_ = "";
        this.mixins_ = l0.I1();
    }

    private void A3() {
        k t0$k0 = this.mixins_;
        if(!t0$k0.isModifiable()) {
            this.mixins_ = l0.c2(t0$k0);
        }
    }

    private void B3() {
        k t0$k0 = this.options_;
        if(!t0$k0.isModifiable()) {
            this.options_ = l0.c2(t0$k0);
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.l0
    protected final Object C1(com.google.crypto.tink.shaded.protobuf.l0.i l0$i0, Object object0, Object object1) {
        switch(l0$i0) {
            case 1: {
                return new i();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return l0.e2(i.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001B\u0003\u001B\u0004Ȉ\u0005\t\u0006\u001B\u0007\f", new Object[]{"name_", "methods_", W0.class, "options_", h1.class, "version_", "sourceContext_", "mixins_", Y0.class, "syntax_"});
            }
            case 4: {
                return i.DEFAULT_INSTANCE;
            }
            case 5: {
                j1 j10 = i.PARSER;
                if(j10 == null) {
                    Class class0 = i.class;
                    synchronized(class0) {
                        j10 = i.PARSER;
                        if(j10 == null) {
                            j10 = new c(i.DEFAULT_INSTANCE);
                            i.PARSER = j10;
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

    public static i C3() {
        return i.DEFAULT_INSTANCE;
    }

    public X0 D3(int v) {
        return (X0)this.methods_.get(v);
    }

    public List F3() {
        return this.methods_;
    }

    public Z0 G3(int v) {
        return (Z0)this.mixins_.get(v);
    }

    public List H3() {
        return this.mixins_;
    }

    public i1 I3(int v) {
        return (i1)this.options_.get(v);
    }

    public List J3() {
        return this.options_;
    }

    private void K3(x1 x10) {
        x10.getClass();
        if(this.sourceContext_ != null && this.sourceContext_ != x1.I2()) {
            this.sourceContext_ = (x1)((com.google.crypto.tink.shaded.protobuf.x1.b)x1.K2(this.sourceContext_).K1(x10)).C1();
            return;
        }
        this.sourceContext_ = x10;
    }

    public static b L3() {
        return (b)i.DEFAULT_INSTANCE.y1();
    }

    public static b M3(i i0) {
        return (b)i.DEFAULT_INSTANCE.z1(i0);
    }

    public static i N3(InputStream inputStream0) throws IOException {
        return (i)l0.i2(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i O3(InputStream inputStream0, V v0) throws IOException {
        return (i)l0.j2(i.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static i P3(u u0) throws y0 {
        return (i)l0.k2(i.DEFAULT_INSTANCE, u0);
    }

    public static i Q3(u u0, V v0) throws y0 {
        return (i)l0.l2(i.DEFAULT_INSTANCE, u0, v0);
    }

    public static i R3(z z0) throws IOException {
        return (i)l0.m2(i.DEFAULT_INSTANCE, z0);
    }

    public static i S3(z z0, V v0) throws IOException {
        return (i)l0.n2(i.DEFAULT_INSTANCE, z0, v0);
    }

    public static i T3(InputStream inputStream0) throws IOException {
        return (i)l0.o2(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i U3(InputStream inputStream0, V v0) throws IOException {
        return (i)l0.p2(i.DEFAULT_INSTANCE, inputStream0, v0);
    }

    public static i V3(ByteBuffer byteBuffer0) throws y0 {
        return (i)l0.q2(i.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static i W3(ByteBuffer byteBuffer0, V v0) throws y0 {
        return (i)l0.r2(i.DEFAULT_INSTANCE, byteBuffer0, v0);
    }

    public static i X3(byte[] arr_b) throws y0 {
        return (i)l0.s2(i.DEFAULT_INSTANCE, arr_b);
    }

    public static i Y3(byte[] arr_b, V v0) throws y0 {
        return (i)l0.t2(i.DEFAULT_INSTANCE, arr_b, v0);
    }

    public static j1 Z3() {
        return i.DEFAULT_INSTANCE.getParserForType();
    }

    private void a4(int v) {
        this.z3();
        this.methods_.remove(v);
    }

    private void b4(int v) {
        this.A3();
        this.mixins_.remove(v);
    }

    private void c4(int v) {
        this.B3();
        this.options_.remove(v);
    }

    private void d4(int v, W0 w00) {
        w00.getClass();
        this.z3();
        this.methods_.set(v, w00);
    }

    private void e4(int v, Y0 y00) {
        y00.getClass();
        this.A3();
        this.mixins_.set(v, y00);
    }

    private void f4(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void g4(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.name_ = u0.i0();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public W0 getMethods(int v) {
        return (W0)this.methods_.get(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public List getMethodsList() {
        return this.methods_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public Y0 getMixins(int v) {
        return (Y0)this.mixins_.get(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public List getMixinsList() {
        return this.mixins_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public u getNameBytes() {
        return u.r(this.name_);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public h1 getOptions(int v) {
        return (h1)this.options_.get(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public List getOptionsList() {
        return this.options_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public x1 getSourceContext() {
        return this.sourceContext_ == null ? x1.I2() : this.sourceContext_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public G1 getSyntax() {
        G1 g10 = G1.a(this.syntax_);
        return g10 == null ? G1.d : g10;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public String getVersion() {
        return this.version_;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public u getVersionBytes() {
        return u.r(this.version_);
    }

    private void h4(int v, h1 h10) {
        h10.getClass();
        this.B3();
        this.options_.set(v, h10);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    private void i4(x1 x10) {
        x10.getClass();
        this.sourceContext_ = x10;
    }

    private void j3(Iterable iterable0) {
        this.z3();
        com.google.crypto.tink.shaded.protobuf.a.i1(iterable0, this.methods_);
    }

    private void j4(G1 g10) {
        this.syntax_ = g10.getNumber();
    }

    private void k3(Iterable iterable0) {
        this.A3();
        com.google.crypto.tink.shaded.protobuf.a.i1(iterable0, this.mixins_);
    }

    private void k4(int v) {
        this.syntax_ = v;
    }

    private void l3(Iterable iterable0) {
        this.B3();
        com.google.crypto.tink.shaded.protobuf.a.i1(iterable0, this.options_);
    }

    private void l4(String s) {
        s.getClass();
        this.version_ = s;
    }

    private void m3(int v, W0 w00) {
        w00.getClass();
        this.z3();
        this.methods_.add(v, w00);
    }

    private void m4(u u0) {
        com.google.crypto.tink.shaded.protobuf.a.j1(u0);
        this.version_ = u0.i0();
    }

    private void n3(W0 w00) {
        w00.getClass();
        this.z3();
        this.methods_.add(w00);
    }

    private void o3(int v, Y0 y00) {
        y00.getClass();
        this.A3();
        this.mixins_.add(v, y00);
    }

    private void p3(Y0 y00) {
        y00.getClass();
        this.A3();
        this.mixins_.add(y00);
    }

    private void q3(int v, h1 h10) {
        h10.getClass();
        this.B3();
        this.options_.add(v, h10);
    }

    private void r3(h1 h10) {
        h10.getClass();
        this.B3();
        this.options_.add(h10);
    }

    private void s3() {
        this.methods_ = l0.I1();
    }

    private void t3() {
        this.mixins_ = l0.I1();
    }

    private void u3() {
        this.name_ = "";
    }

    private void v3() {
        this.options_ = l0.I1();
    }

    private void w3() {
        this.sourceContext_ = null;
    }

    private void x3() {
        this.syntax_ = 0;
    }

    private void y3() {
        this.version_ = i.C3().getVersion();
    }

    private void z3() {
        k t0$k0 = this.methods_;
        if(!t0$k0.isModifiable()) {
            this.methods_ = l0.c2(t0$k0);
        }
    }
}

