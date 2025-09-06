package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Api extends GeneratedMessageLite implements ApiOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ApiOrBuilder {
        private Builder() {
            super(Api.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Api.1 api$10) {
        }

        public Builder A0() {
            this.c0();
            ((Api)this.b).X1();
            return this;
        }

        public Builder B0() {
            this.c0();
            ((Api)this.b).Y1();
            return this;
        }

        public Builder C0() {
            this.c0();
            ((Api)this.b).Z1();
            return this;
        }

        public Builder D0() {
            this.c0();
            ((Api)this.b).a2();
            return this;
        }

        public Builder E0() {
            this.c0();
            ((Api)this.b).b2();
            return this;
        }

        public Builder F0() {
            this.c0();
            ((Api)this.b).c2();
            return this;
        }

        public Builder G0(SourceContext sourceContext0) {
            this.c0();
            ((Api)this.b).n2(sourceContext0);
            return this;
        }

        public Builder H0(int v) {
            this.c0();
            ((Api)this.b).D2(v);
            return this;
        }

        public Builder I0(int v) {
            this.c0();
            ((Api)this.b).E2(v);
            return this;
        }

        public Builder J0(int v) {
            this.c0();
            ((Api)this.b).F2(v);
            return this;
        }

        public Builder K0(int v, androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
            this.c0();
            ((Api)this.b).G2(v, method$Builder0);
            return this;
        }

        public Builder L0(int v, Method method0) {
            this.c0();
            ((Api)this.b).H2(v, method0);
            return this;
        }

        public Builder M0(int v, androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
            this.c0();
            ((Api)this.b).I2(v, mixin$Builder0);
            return this;
        }

        public Builder N0(int v, Mixin mixin0) {
            this.c0();
            ((Api)this.b).J2(v, mixin0);
            return this;
        }

        public Builder O0(String s) {
            this.c0();
            ((Api)this.b).K2(s);
            return this;
        }

        public Builder P0(ByteString byteString0) {
            this.c0();
            ((Api)this.b).L2(byteString0);
            return this;
        }

        public Builder Q0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Api)this.b).M2(v, option$Builder0);
            return this;
        }

        public Builder R0(int v, Option option0) {
            this.c0();
            ((Api)this.b).N2(v, option0);
            return this;
        }

        public Builder S0(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.c0();
            ((Api)this.b).O2(sourceContext$Builder0);
            return this;
        }

        public Builder T0(SourceContext sourceContext0) {
            this.c0();
            ((Api)this.b).P2(sourceContext0);
            return this;
        }

        public Builder U0(Syntax syntax0) {
            this.c0();
            ((Api)this.b).Q2(syntax0);
            return this;
        }

        public Builder V0(int v) {
            this.c0();
            ((Api)this.b).R2(v);
            return this;
        }

        public Builder W0(String s) {
            this.c0();
            ((Api)this.b).S2(s);
            return this;
        }

        public Builder X0(ByteString byteString0) {
            this.c0();
            ((Api)this.b).T2(byteString0);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Method getMethods(int v) {
            return ((Api)this.b).getMethods(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((Api)this.b).getMethodsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List getMethodsList() {
            return DesugarCollections.unmodifiableList(((Api)this.b).getMethodsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Mixin getMixins(int v) {
            return ((Api)this.b).getMixins(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((Api)this.b).getMixinsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List getMixinsList() {
            return DesugarCollections.unmodifiableList(((Api)this.b).getMixinsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getName() {
            return ((Api)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
            return ((Api)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Option getOptions(int v) {
            return ((Api)this.b).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((Api)this.b).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((Api)this.b).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            return ((Api)this.b).getSourceContext();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
            return ((Api)this.b).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((Api)this.b).getSyntaxValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getVersion() {
            return ((Api)this.b).getVersion();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
            return ((Api)this.b).getVersionBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((Api)this.b).hasSourceContext();
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((Api)this.b).H1(iterable0);
            return this;
        }

        public Builder l0(Iterable iterable0) {
            this.c0();
            ((Api)this.b).I1(iterable0);
            return this;
        }

        public Builder m0(Iterable iterable0) {
            this.c0();
            ((Api)this.b).J1(iterable0);
            return this;
        }

        public Builder n0(int v, androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
            this.c0();
            ((Api)this.b).K1(v, method$Builder0);
            return this;
        }

        public Builder o0(int v, Method method0) {
            this.c0();
            ((Api)this.b).L1(v, method0);
            return this;
        }

        public Builder p0(androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
            this.c0();
            ((Api)this.b).M1(method$Builder0);
            return this;
        }

        public Builder q0(Method method0) {
            this.c0();
            ((Api)this.b).N1(method0);
            return this;
        }

        public Builder r0(int v, androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
            this.c0();
            ((Api)this.b).O1(v, mixin$Builder0);
            return this;
        }

        public Builder s0(int v, Mixin mixin0) {
            this.c0();
            ((Api)this.b).P1(v, mixin0);
            return this;
        }

        public Builder t0(androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
            this.c0();
            ((Api)this.b).Q1(mixin$Builder0);
            return this;
        }

        public Builder u0(Mixin mixin0) {
            this.c0();
            ((Api)this.b).R1(mixin0);
            return this;
        }

        public Builder v0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Api)this.b).S1(v, option$Builder0);
            return this;
        }

        public Builder w0(int v, Option option0) {
            this.c0();
            ((Api)this.b).T1(v, option0);
            return this;
        }

        public Builder x0(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Api)this.b).U1(option$Builder0);
            return this;
        }

        public Builder y0(Option option0) {
            this.c0();
            ((Api)this.b).V1(option0);
            return this;
        }

        public Builder z0() {
            this.c0();
            ((Api)this.b).W1();
            return this;
        }
    }

    private static final Api DEFAULT_INSTANCE = null;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private ProtobufList methods_;
    private ProtobufList mixins_;
    private String name_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_;

    static {
        Api api0 = new Api();
        Api.DEFAULT_INSTANCE = api0;
        GeneratedMessageLite.P0(Api.class, api0);
    }

    private Api() {
        this.name_ = "";
        this.methods_ = GeneratedMessageLite.b0();
        this.options_ = GeneratedMessageLite.b0();
        this.version_ = "";
        this.mixins_ = GeneratedMessageLite.b0();
    }

    public static Api A2(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.G0(Api.DEFAULT_INSTANCE, arr_b);
    }

    public static Api B2(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.H0(Api.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser C2() {
        return Api.DEFAULT_INSTANCE.getParserForType();
    }

    private void D2(int v) {
        this.d2();
        this.methods_.remove(v);
    }

    private void E2(int v) {
        this.e2();
        this.mixins_.remove(v);
    }

    private void F2(int v) {
        this.f2();
        this.options_.remove(v);
    }

    private void G2(int v, androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
        this.d2();
        this.methods_.set(v, method$Builder0.Y());
    }

    private void H1(Iterable iterable0) {
        this.d2();
        AbstractMessageLite.G(iterable0, this.methods_);
    }

    private void H2(int v, Method method0) {
        method0.getClass();
        this.d2();
        this.methods_.set(v, method0);
    }

    private void I1(Iterable iterable0) {
        this.e2();
        AbstractMessageLite.G(iterable0, this.mixins_);
    }

    private void I2(int v, androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
        this.e2();
        this.mixins_.set(v, mixin$Builder0.Y());
    }

    private void J1(Iterable iterable0) {
        this.f2();
        AbstractMessageLite.G(iterable0, this.options_);
    }

    private void J2(int v, Mixin mixin0) {
        mixin0.getClass();
        this.e2();
        this.mixins_.set(v, mixin0);
    }

    private void K1(int v, androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
        this.d2();
        this.methods_.add(v, method$Builder0.Y());
    }

    private void K2(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void L1(int v, Method method0) {
        method0.getClass();
        this.d2();
        this.methods_.add(v, method0);
    }

    private void L2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void M1(androidx.datastore.preferences.protobuf.Method.Builder method$Builder0) {
        this.d2();
        this.methods_.add(method$Builder0.Y());
    }

    private void M2(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.f2();
        this.options_.set(v, option$Builder0.Y());
    }

    private void N1(Method method0) {
        method0.getClass();
        this.d2();
        this.methods_.add(method0);
    }

    private void N2(int v, Option option0) {
        option0.getClass();
        this.f2();
        this.options_.set(v, option0);
    }

    private void O1(int v, androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
        this.e2();
        this.mixins_.add(v, mixin$Builder0.Y());
    }

    private void O2(androidx.datastore.preferences.protobuf.SourceContext.Builder sourceContext$Builder0) {
        this.sourceContext_ = (SourceContext)sourceContext$Builder0.Y();
    }

    private void P1(int v, Mixin mixin0) {
        mixin0.getClass();
        this.e2();
        this.mixins_.add(v, mixin0);
    }

    private void P2(SourceContext sourceContext0) {
        sourceContext0.getClass();
        this.sourceContext_ = sourceContext0;
    }

    private void Q1(androidx.datastore.preferences.protobuf.Mixin.Builder mixin$Builder0) {
        this.e2();
        this.mixins_.add(mixin$Builder0.Y());
    }

    private void Q2(Syntax syntax0) {
        syntax0.getClass();
        this.syntax_ = syntax0.getNumber();
    }

    private void R1(Mixin mixin0) {
        mixin0.getClass();
        this.e2();
        this.mixins_.add(mixin0);
    }

    private void R2(int v) {
        this.syntax_ = v;
    }

    private void S1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.f2();
        this.options_.add(v, option$Builder0.Y());
    }

    private void S2(String s) {
        s.getClass();
        this.version_ = s;
    }

    private void T1(int v, Option option0) {
        option0.getClass();
        this.f2();
        this.options_.add(v, option0);
    }

    private void T2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.version_ = byteString0.b0();
    }

    private void U1(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.f2();
        this.options_.add(option$Builder0.Y());
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Api();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Api.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001B\u0003\u001B\u0004Ȉ\u0005\t\u0006\u001B\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            }
            case 4: {
                return Api.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Api.PARSER;
                if(parser0 == null) {
                    Class class0 = Api.class;
                    synchronized(class0) {
                        parser0 = Api.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Api.DEFAULT_INSTANCE);
                            Api.PARSER = parser0;
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

    private void V1(Option option0) {
        option0.getClass();
        this.f2();
        this.options_.add(option0);
    }

    private void W1() {
        this.methods_ = GeneratedMessageLite.b0();
    }

    private void X1() {
        this.mixins_ = GeneratedMessageLite.b0();
    }

    private void Y1() {
        this.name_ = Api.g2().getName();
    }

    private void Z1() {
        this.options_ = GeneratedMessageLite.b0();
    }

    private void a2() {
        this.sourceContext_ = null;
    }

    private void b2() {
        this.syntax_ = 0;
    }

    private void c2() {
        this.version_ = Api.g2().getVersion();
    }

    private void d2() {
        if(!this.methods_.isModifiable()) {
            this.methods_ = GeneratedMessageLite.r0(this.methods_);
        }
    }

    private void e2() {
        if(!this.mixins_.isModifiable()) {
            this.mixins_ = GeneratedMessageLite.r0(this.mixins_);
        }
    }

    private void f2() {
        if(!this.options_.isModifiable()) {
            this.options_ = GeneratedMessageLite.r0(this.options_);
        }
    }

    public static Api g2() {
        return Api.DEFAULT_INSTANCE;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Method getMethods(int v) {
        return (Method)this.methods_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List getMethodsList() {
        return this.methods_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Mixin getMixins(int v) {
        return (Mixin)this.mixins_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List getMixinsList() {
        return this.mixins_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.W0() : this.sourceContext_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.a(this.syntax_);
        return syntax0 == null ? Syntax.d : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.r(this.version_);
    }

    public MethodOrBuilder h2(int v) {
        return (MethodOrBuilder)this.methods_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public List i2() {
        return this.methods_;
    }

    public MixinOrBuilder j2(int v) {
        return (MixinOrBuilder)this.mixins_.get(v);
    }

    public List k2() {
        return this.mixins_;
    }

    public OptionOrBuilder l2(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List m2() {
        return this.options_;
    }

    private void n2(SourceContext sourceContext0) {
        sourceContext0.getClass();
        if(this.sourceContext_ != null && this.sourceContext_ != SourceContext.W0()) {
            this.sourceContext_ = (SourceContext)((androidx.datastore.preferences.protobuf.SourceContext.Builder)SourceContext.Y0(this.sourceContext_).g0(sourceContext0)).Z();
            return;
        }
        this.sourceContext_ = sourceContext0;
    }

    public static Builder o2() {
        return (Builder)Api.DEFAULT_INSTANCE.R();
    }

    public static Builder p2(Api api0) {
        return (Builder)Api.DEFAULT_INSTANCE.S(api0);
    }

    public static Api q2(InputStream inputStream0) throws IOException {
        return (Api)GeneratedMessageLite.w0(Api.DEFAULT_INSTANCE, inputStream0);
    }

    public static Api r2(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Api)GeneratedMessageLite.x0(Api.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Api s2(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.y0(Api.DEFAULT_INSTANCE, byteString0);
    }

    public static Api t2(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.z0(Api.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Api u2(CodedInputStream codedInputStream0) throws IOException {
        return (Api)GeneratedMessageLite.A0(Api.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Api v2(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Api)GeneratedMessageLite.B0(Api.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Api w2(InputStream inputStream0) throws IOException {
        return (Api)GeneratedMessageLite.C0(Api.DEFAULT_INSTANCE, inputStream0);
    }

    public static Api x2(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Api)GeneratedMessageLite.D0(Api.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Api y2(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.E0(Api.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Api z2(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Api)GeneratedMessageLite.F0(Api.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }
}

