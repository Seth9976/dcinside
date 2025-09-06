package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Enum extends GeneratedMessageLite implements EnumOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements EnumOrBuilder {
        private Builder() {
            super(Enum.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Enum.1 enum$10) {
        }

        public Builder A0(int v) {
            this.c0();
            ((Enum)this.b).h2(v);
            return this;
        }

        public Builder B0(int v) {
            this.c0();
            ((Enum)this.b).i2(v);
            return this;
        }

        public Builder C0(int v, androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.c0();
            ((Enum)this.b).j2(v, enumValue$Builder0);
            return this;
        }

        public Builder D0(int v, EnumValue enumValue0) {
            this.c0();
            ((Enum)this.b).k2(v, enumValue0);
            return this;
        }

        public Builder E0(String s) {
            this.c0();
            ((Enum)this.b).l2(s);
            return this;
        }

        public Builder F0(ByteString byteString0) {
            this.c0();
            ((Enum)this.b).m2(byteString0);
            return this;
        }

        public Builder G0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Enum)this.b).n2(v, option$Builder0);
            return this;
        }

        public Builder H0(int v, Option option0) {
            this.c0();
            ((Enum)this.b).o2(v, option0);
            return this;
        }

        public Builder I0(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.c0();
            ((Enum)this.b).p2(sourceContext$Builder0);
            return this;
        }

        public Builder J0(SourceContext sourceContext0) {
            this.c0();
            ((Enum)this.b).q2(sourceContext0);
            return this;
        }

        public Builder K0(Syntax syntax0) {
            this.c0();
            ((Enum)this.b).r2(syntax0);
            return this;
        }

        public Builder L0(int v) {
            this.c0();
            ((Enum)this.b).s2(v);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int v) {
            return ((Enum)this.b).getEnumvalue(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((Enum)this.b).getEnumvalueCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List getEnumvalueList() {
            return DesugarCollections.unmodifiableList(((Enum)this.b).getEnumvalueList());
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public String getName() {
            return ((Enum)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
            return ((Enum)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Option getOptions(int v) {
            return ((Enum)this.b).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((Enum)this.b).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((Enum)this.b).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            return ((Enum)this.b).getSourceContext();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
            return ((Enum)this.b).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((Enum)this.b).getSyntaxValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((Enum)this.b).hasSourceContext();
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((Enum)this.b).v1(iterable0);
            return this;
        }

        public Builder l0(Iterable iterable0) {
            this.c0();
            ((Enum)this.b).w1(iterable0);
            return this;
        }

        public Builder m0(int v, androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.c0();
            ((Enum)this.b).x1(v, enumValue$Builder0);
            return this;
        }

        public Builder n0(int v, EnumValue enumValue0) {
            this.c0();
            ((Enum)this.b).y1(v, enumValue0);
            return this;
        }

        public Builder o0(androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.c0();
            ((Enum)this.b).z1(enumValue$Builder0);
            return this;
        }

        public Builder p0(EnumValue enumValue0) {
            this.c0();
            ((Enum)this.b).A1(enumValue0);
            return this;
        }

        public Builder q0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Enum)this.b).B1(v, option$Builder0);
            return this;
        }

        public Builder r0(int v, Option option0) {
            this.c0();
            ((Enum)this.b).C1(v, option0);
            return this;
        }

        public Builder s0(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Enum)this.b).D1(option$Builder0);
            return this;
        }

        public Builder t0(Option option0) {
            this.c0();
            ((Enum)this.b).E1(option0);
            return this;
        }

        public Builder u0() {
            this.c0();
            ((Enum)this.b).F1();
            return this;
        }

        public Builder v0() {
            this.c0();
            ((Enum)this.b).G1();
            return this;
        }

        public Builder w0() {
            this.c0();
            ((Enum)this.b).H1();
            return this;
        }

        public Builder x0() {
            this.c0();
            ((Enum)this.b).I1();
            return this;
        }

        public Builder y0() {
            this.c0();
            ((Enum)this.b).J1();
            return this;
        }

        public Builder z0(SourceContext sourceContext0) {
            this.c0();
            ((Enum)this.b).R1(sourceContext0);
            return this;
        }
    }

    private static final Enum DEFAULT_INSTANCE = null;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private ProtobufList enumvalue_;
    private String name_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Enum enum0 = new Enum();
        Enum.DEFAULT_INSTANCE = enum0;
        GeneratedMessageLite.P0(Enum.class, enum0);
    }

    private Enum() {
        this.name_ = "";
        this.enumvalue_ = GeneratedMessageLite.b0();
        this.options_ = GeneratedMessageLite.b0();
    }

    private void A1(EnumValue enumValue0) {
        enumValue0.getClass();
        this.K1();
        this.enumvalue_.add(enumValue0);
    }

    private void B1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.L1();
        this.options_.add(v, option$Builder0.Y());
    }

    private void C1(int v, Option option0) {
        option0.getClass();
        this.L1();
        this.options_.add(v, option0);
    }

    private void D1(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.L1();
        this.options_.add(option$Builder0.Y());
    }

    private void E1(Option option0) {
        option0.getClass();
        this.L1();
        this.options_.add(option0);
    }

    private void F1() {
        this.enumvalue_ = GeneratedMessageLite.b0();
    }

    private void G1() {
        this.name_ = Enum.M1().getName();
    }

    private void H1() {
        this.options_ = GeneratedMessageLite.b0();
    }

    private void I1() {
        this.sourceContext_ = null;
    }

    private void J1() {
        this.syntax_ = 0;
    }

    private void K1() {
        if(!this.enumvalue_.isModifiable()) {
            this.enumvalue_ = GeneratedMessageLite.r0(this.enumvalue_);
        }
    }

    private void L1() {
        if(!this.options_.isModifiable()) {
            this.options_ = GeneratedMessageLite.r0(this.options_);
        }
    }

    public static Enum M1() {
        return Enum.DEFAULT_INSTANCE;
    }

    public EnumValueOrBuilder N1(int v) {
        return (EnumValueOrBuilder)this.enumvalue_.get(v);
    }

    public List O1() {
        return this.enumvalue_;
    }

    public OptionOrBuilder P1(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List Q1() {
        return this.options_;
    }

    private void R1(SourceContext sourceContext0) {
        sourceContext0.getClass();
        if(this.sourceContext_ != null && this.sourceContext_ != SourceContext.W0()) {
            this.sourceContext_ = (SourceContext)((androidx.datastore.preferences.protobuf.SourceContext.Builder)SourceContext.Y0(this.sourceContext_).g0(sourceContext0)).Z();
            return;
        }
        this.sourceContext_ = sourceContext0;
    }

    public static Builder S1() {
        return (Builder)Enum.DEFAULT_INSTANCE.R();
    }

    public static Builder T1(Enum enum0) {
        return (Builder)Enum.DEFAULT_INSTANCE.S(enum0);
    }

    public static Enum U1(InputStream inputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.w0(Enum.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Enum();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Enum.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001B\u0003\u001B\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            }
            case 4: {
                return Enum.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Enum.PARSER;
                if(parser0 == null) {
                    Class class0 = Enum.class;
                    synchronized(class0) {
                        parser0 = Enum.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Enum.DEFAULT_INSTANCE);
                            Enum.PARSER = parser0;
                        }
                    }
                }
                return parser0;
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

    public static Enum V1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.x0(Enum.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Enum W1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.y0(Enum.DEFAULT_INSTANCE, byteString0);
    }

    public static Enum X1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.z0(Enum.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Enum Y1(CodedInputStream codedInputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.A0(Enum.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Enum Z1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.B0(Enum.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Enum a2(InputStream inputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.C0(Enum.DEFAULT_INSTANCE, inputStream0);
    }

    public static Enum b2(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.D0(Enum.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Enum c2(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.E0(Enum.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Enum d2(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.F0(Enum.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Enum e2(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.G0(Enum.DEFAULT_INSTANCE, arr_b);
    }

    public static Enum f2(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.H0(Enum.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser g2() {
        return Enum.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int v) {
        return (EnumValue)this.enumvalue_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List getEnumvalueList() {
        return this.enumvalue_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.W0() : this.sourceContext_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.a(this.syntax_);
        return syntax0 == null ? Syntax.d : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    private void h2(int v) {
        this.K1();
        this.enumvalue_.remove(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    private void i2(int v) {
        this.L1();
        this.options_.remove(v);
    }

    private void j2(int v, androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
        this.K1();
        this.enumvalue_.set(v, enumValue$Builder0.Y());
    }

    private void k2(int v, EnumValue enumValue0) {
        enumValue0.getClass();
        this.K1();
        this.enumvalue_.set(v, enumValue0);
    }

    private void l2(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void m2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void n2(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.L1();
        this.options_.set(v, option$Builder0.Y());
    }

    private void o2(int v, Option option0) {
        option0.getClass();
        this.L1();
        this.options_.set(v, option0);
    }

    private void p2(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
        this.sourceContext_ = (SourceContext)sourceContext$Builder0.Y();
    }

    private void q2(SourceContext sourceContext0) {
        sourceContext0.getClass();
        this.sourceContext_ = sourceContext0;
    }

    private void r2(Syntax syntax0) {
        syntax0.getClass();
        this.syntax_ = syntax0.getNumber();
    }

    private void s2(int v) {
        this.syntax_ = v;
    }

    private void v1(Iterable iterable0) {
        this.K1();
        AbstractMessageLite.G(iterable0, this.enumvalue_);
    }

    private void w1(Iterable iterable0) {
        this.L1();
        AbstractMessageLite.G(iterable0, this.options_);
    }

    private void x1(int v, androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
        this.K1();
        this.enumvalue_.add(v, enumValue$Builder0.Y());
    }

    private void y1(int v, EnumValue enumValue0) {
        enumValue0.getClass();
        this.K1();
        this.enumvalue_.add(v, enumValue0);
    }

    private void z1(androidx.datastore.preferences.protobuf.EnumValue.Builder enumValue$Builder0) {
        this.K1();
        this.enumvalue_.add(enumValue$Builder0.Y());
    }
}

