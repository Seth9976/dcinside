package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Type extends GeneratedMessageLite implements TypeOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements TypeOrBuilder {
        private Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Type.1 type$10) {
        }

        public Builder A0() {
            this.c0();
            ((Type)this.b).Q1();
            return this;
        }

        public Builder B0() {
            this.c0();
            ((Type)this.b).R1();
            return this;
        }

        public Builder C0() {
            this.c0();
            ((Type)this.b).S1();
            return this;
        }

        public Builder D0(SourceContext sourceContext0) {
            this.c0();
            ((Type)this.b).b2(sourceContext0);
            return this;
        }

        public Builder E0(int v) {
            this.c0();
            ((Type)this.b).r2(v);
            return this;
        }

        public Builder F0(int v) {
            this.c0();
            ((Type)this.b).s2(v);
            return this;
        }

        public Builder G0(int v, androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
            this.c0();
            ((Type)this.b).t2(v, field$Builder0);
            return this;
        }

        public Builder H0(int v, Field field0) {
            this.c0();
            ((Type)this.b).u2(v, field0);
            return this;
        }

        public Builder I0(String s) {
            this.c0();
            ((Type)this.b).v2(s);
            return this;
        }

        public Builder J0(ByteString byteString0) {
            this.c0();
            ((Type)this.b).w2(byteString0);
            return this;
        }

        public Builder K0(int v, String s) {
            this.c0();
            ((Type)this.b).x2(v, s);
            return this;
        }

        public Builder L0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Type)this.b).y2(v, option$Builder0);
            return this;
        }

        public Builder M0(int v, Option option0) {
            this.c0();
            ((Type)this.b).z2(v, option0);
            return this;
        }

        public Builder N0(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.c0();
            ((Type)this.b).A2(sourceContext$Builder0);
            return this;
        }

        public Builder O0(SourceContext sourceContext0) {
            this.c0();
            ((Type)this.b).B2(sourceContext0);
            return this;
        }

        public Builder P0(Syntax syntax0) {
            this.c0();
            ((Type)this.b).C2(syntax0);
            return this;
        }

        public Builder Q0(int v) {
            this.c0();
            ((Type)this.b).D2(v);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Field getFields(int v) {
            return ((Type)this.b).getFields(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type)this.b).getFieldsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List getFieldsList() {
            return DesugarCollections.unmodifiableList(((Type)this.b).getFieldsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getName() {
            return ((Type)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
            return ((Type)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getOneofs(int v) {
            return ((Type)this.b).getOneofs(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int v) {
            return ((Type)this.b).getOneofsBytes(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type)this.b).getOneofsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List getOneofsList() {
            return DesugarCollections.unmodifiableList(((Type)this.b).getOneofsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Option getOptions(int v) {
            return ((Type)this.b).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type)this.b).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((Type)this.b).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type)this.b).getSourceContext();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
            return ((Type)this.b).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type)this.b).getSyntaxValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type)this.b).hasSourceContext();
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((Type)this.b).A1(iterable0);
            return this;
        }

        public Builder l0(Iterable iterable0) {
            this.c0();
            ((Type)this.b).B1(iterable0);
            return this;
        }

        public Builder m0(Iterable iterable0) {
            this.c0();
            ((Type)this.b).C1(iterable0);
            return this;
        }

        public Builder n0(int v, androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
            this.c0();
            ((Type)this.b).D1(v, field$Builder0);
            return this;
        }

        public Builder o0(int v, Field field0) {
            this.c0();
            ((Type)this.b).E1(v, field0);
            return this;
        }

        public Builder p0(androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
            this.c0();
            ((Type)this.b).F1(field$Builder0);
            return this;
        }

        public Builder q0(Field field0) {
            this.c0();
            ((Type)this.b).G1(field0);
            return this;
        }

        public Builder r0(String s) {
            this.c0();
            ((Type)this.b).H1(s);
            return this;
        }

        public Builder s0(ByteString byteString0) {
            this.c0();
            ((Type)this.b).I1(byteString0);
            return this;
        }

        public Builder t0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Type)this.b).J1(v, option$Builder0);
            return this;
        }

        public Builder u0(int v, Option option0) {
            this.c0();
            ((Type)this.b).K1(v, option0);
            return this;
        }

        public Builder v0(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Type)this.b).L1(option$Builder0);
            return this;
        }

        public Builder w0(Option option0) {
            this.c0();
            ((Type)this.b).M1(option0);
            return this;
        }

        public Builder x0() {
            this.c0();
            ((Type)this.b).N1();
            return this;
        }

        public Builder y0() {
            this.c0();
            ((Type)this.b).O1();
            return this;
        }

        public Builder z0() {
            this.c0();
            ((Type)this.b).P1();
            return this;
        }
    }

    private static final Type DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private ProtobufList fields_;
    private String name_;
    private ProtobufList oneofs_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Type type0 = new Type();
        Type.DEFAULT_INSTANCE = type0;
        GeneratedMessageLite.P0(Type.class, type0);
    }

    private Type() {
        this.name_ = "";
        this.fields_ = GeneratedMessageLite.b0();
        this.oneofs_ = GeneratedMessageLite.b0();
        this.options_ = GeneratedMessageLite.b0();
    }

    private void A1(Iterable iterable0) {
        this.T1();
        AbstractMessageLite.G(iterable0, this.fields_);
    }

    private void A2(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
        this.sourceContext_ = (SourceContext)sourceContext$Builder0.Y();
    }

    private void B1(Iterable iterable0) {
        this.U1();
        AbstractMessageLite.G(iterable0, this.oneofs_);
    }

    private void B2(SourceContext sourceContext0) {
        sourceContext0.getClass();
        this.sourceContext_ = sourceContext0;
    }

    private void C1(Iterable iterable0) {
        this.V1();
        AbstractMessageLite.G(iterable0, this.options_);
    }

    private void C2(Syntax syntax0) {
        syntax0.getClass();
        this.syntax_ = syntax0.getNumber();
    }

    private void D1(int v, androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
        this.T1();
        this.fields_.add(v, field$Builder0.Y());
    }

    private void D2(int v) {
        this.syntax_ = v;
    }

    private void E1(int v, Field field0) {
        field0.getClass();
        this.T1();
        this.fields_.add(v, field0);
    }

    private void F1(androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
        this.T1();
        this.fields_.add(field$Builder0.Y());
    }

    private void G1(Field field0) {
        field0.getClass();
        this.T1();
        this.fields_.add(field0);
    }

    private void H1(String s) {
        s.getClass();
        this.U1();
        this.oneofs_.add(s);
    }

    private void I1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.U1();
        this.oneofs_.add(byteString0.b0());
    }

    private void J1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.V1();
        this.options_.add(v, option$Builder0.Y());
    }

    private void K1(int v, Option option0) {
        option0.getClass();
        this.V1();
        this.options_.add(v, option0);
    }

    private void L1(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.V1();
        this.options_.add(option$Builder0.Y());
    }

    private void M1(Option option0) {
        option0.getClass();
        this.V1();
        this.options_.add(option0);
    }

    private void N1() {
        this.fields_ = GeneratedMessageLite.b0();
    }

    private void O1() {
        this.name_ = Type.W1().getName();
    }

    private void P1() {
        this.oneofs_ = GeneratedMessageLite.b0();
    }

    private void Q1() {
        this.options_ = GeneratedMessageLite.b0();
    }

    private void R1() {
        this.sourceContext_ = null;
    }

    private void S1() {
        this.syntax_ = 0;
    }

    private void T1() {
        if(!this.fields_.isModifiable()) {
            this.fields_ = GeneratedMessageLite.r0(this.fields_);
        }
    }

    private void U1() {
        if(!this.oneofs_.isModifiable()) {
            this.oneofs_ = GeneratedMessageLite.r0(this.oneofs_);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Type();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Type.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001B\u0003Ț\u0004\u001B\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            }
            case 4: {
                return Type.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Type.PARSER;
                if(parser0 == null) {
                    Class class0 = Type.class;
                    synchronized(class0) {
                        parser0 = Type.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Type.DEFAULT_INSTANCE);
                            Type.PARSER = parser0;
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

    private void V1() {
        if(!this.options_.isModifiable()) {
            this.options_ = GeneratedMessageLite.r0(this.options_);
        }
    }

    public static Type W1() {
        return Type.DEFAULT_INSTANCE;
    }

    public FieldOrBuilder X1(int v) {
        return (FieldOrBuilder)this.fields_.get(v);
    }

    public List Y1() {
        return this.fields_;
    }

    public OptionOrBuilder Z1(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List a2() {
        return this.options_;
    }

    private void b2(SourceContext sourceContext0) {
        sourceContext0.getClass();
        if(this.sourceContext_ != null && this.sourceContext_ != SourceContext.W0()) {
            this.sourceContext_ = (SourceContext)((androidx.datastore.preferences.protobuf.SourceContext.Builder)SourceContext.Y0(this.sourceContext_).g0(sourceContext0)).Z();
            return;
        }
        this.sourceContext_ = sourceContext0;
    }

    public static Builder c2() {
        return (Builder)Type.DEFAULT_INSTANCE.R();
    }

    public static Builder d2(Type type0) {
        return (Builder)Type.DEFAULT_INSTANCE.S(type0);
    }

    public static Type e2(InputStream inputStream0) throws IOException {
        return (Type)GeneratedMessageLite.w0(Type.DEFAULT_INSTANCE, inputStream0);
    }

    public static Type f2(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Type)GeneratedMessageLite.x0(Type.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Type g2(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.y0(Type.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Field getFields(int v) {
        return (Field)this.fields_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List getFieldsList() {
        return this.fields_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getOneofs(int v) {
        return (String)this.oneofs_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int v) {
        return ByteString.r(((String)this.oneofs_.get(v)));
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List getOneofsList() {
        return this.oneofs_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.W0() : this.sourceContext_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.a(this.syntax_);
        return syntax0 == null ? Syntax.d : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static Type h2(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.z0(Type.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static Type i2(CodedInputStream codedInputStream0) throws IOException {
        return (Type)GeneratedMessageLite.A0(Type.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Type j2(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Type)GeneratedMessageLite.B0(Type.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Type k2(InputStream inputStream0) throws IOException {
        return (Type)GeneratedMessageLite.C0(Type.DEFAULT_INSTANCE, inputStream0);
    }

    public static Type l2(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Type)GeneratedMessageLite.D0(Type.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Type m2(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.E0(Type.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Type n2(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.F0(Type.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Type o2(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.G0(Type.DEFAULT_INSTANCE, arr_b);
    }

    public static Type p2(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Type)GeneratedMessageLite.H0(Type.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser q2() {
        return Type.DEFAULT_INSTANCE.getParserForType();
    }

    private void r2(int v) {
        this.T1();
        this.fields_.remove(v);
    }

    private void s2(int v) {
        this.V1();
        this.options_.remove(v);
    }

    private void t2(int v, androidx.datastore.preferences.protobuf.Field.Builder field$Builder0) {
        this.T1();
        this.fields_.set(v, field$Builder0.Y());
    }

    private void u2(int v, Field field0) {
        field0.getClass();
        this.T1();
        this.fields_.set(v, field0);
    }

    private void v2(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void w2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void x2(int v, String s) {
        s.getClass();
        this.U1();
        this.oneofs_.set(v, s);
    }

    private void y2(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.V1();
        this.options_.set(v, option$Builder0.Y());
    }

    private void z2(int v, Option option0) {
        option0.getClass();
        this.V1();
        this.options_.set(v, option0);
    }
}

