package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Method extends GeneratedMessageLite implements MethodOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements MethodOrBuilder {
        private Builder() {
            super(Method.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Method.1 method$10) {
        }

        public Builder A0(int v, Option option0) {
            this.c0();
            ((Method)this.b).b2(v, option0);
            return this;
        }

        public Builder B0(boolean z) {
            this.c0();
            ((Method)this.b).c2(z);
            return this;
        }

        public Builder C0(String s) {
            this.c0();
            ((Method)this.b).d2(s);
            return this;
        }

        public Builder D0(ByteString byteString0) {
            this.c0();
            ((Method)this.b).e2(byteString0);
            return this;
        }

        public Builder E0(boolean z) {
            this.c0();
            ((Method)this.b).f2(z);
            return this;
        }

        public Builder F0(String s) {
            this.c0();
            ((Method)this.b).g2(s);
            return this;
        }

        public Builder G0(ByteString byteString0) {
            this.c0();
            ((Method)this.b).h2(byteString0);
            return this;
        }

        public Builder H0(Syntax syntax0) {
            this.c0();
            ((Method)this.b).i2(syntax0);
            return this;
        }

        public Builder I0(int v) {
            this.c0();
            ((Method)this.b).j2(v);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getName() {
            return ((Method)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getNameBytes() {
            return ((Method)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Option getOptions(int v) {
            return ((Method)this.b).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getOptionsCount() {
            return ((Method)this.b).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((Method)this.b).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
            return ((Method)this.b).getRequestStreaming();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getRequestTypeUrl() {
            return ((Method)this.b).getRequestTypeUrl();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getRequestTypeUrlBytes() {
            return ((Method)this.b).getRequestTypeUrlBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
            return ((Method)this.b).getResponseStreaming();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getResponseTypeUrl() {
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getResponseTypeUrlBytes() {
            return ((Method)this.b).getResponseTypeUrlBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Syntax getSyntax() {
            return ((Method)this.b).getSyntax();
        }

        @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
            return ((Method)this.b).getSyntaxValue();
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((Method)this.b).s1(iterable0);
            return this;
        }

        public Builder l0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Method)this.b).t1(v, option$Builder0);
            return this;
        }

        public Builder m0(int v, Option option0) {
            this.c0();
            ((Method)this.b).u1(v, option0);
            return this;
        }

        public Builder n0(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Method)this.b).v1(option$Builder0);
            return this;
        }

        public Builder o0(Option option0) {
            this.c0();
            ((Method)this.b).w1(option0);
            return this;
        }

        public Builder p0() {
            this.c0();
            ((Method)this.b).x1();
            return this;
        }

        public Builder q0() {
            this.c0();
            ((Method)this.b).y1();
            return this;
        }

        public Builder r0() {
            this.c0();
            ((Method)this.b).z1();
            return this;
        }

        public Builder s0() {
            this.c0();
            ((Method)this.b).A1();
            return this;
        }

        public Builder t0() {
            this.c0();
            ((Method)this.b).B1();
            return this;
        }

        public Builder u0() {
            this.c0();
            ((Method)this.b).C1();
            return this;
        }

        public Builder v0() {
            this.c0();
            ((Method)this.b).D1();
            return this;
        }

        public Builder w0(int v) {
            this.c0();
            ((Method)this.b).X1(v);
            return this;
        }

        public Builder x0(String s) {
            this.c0();
            ((Method)this.b).Y1(s);
            return this;
        }

        public Builder y0(ByteString byteString0) {
            this.c0();
            ((Method)this.b).Z1(byteString0);
            return this;
        }

        public Builder z0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Method)this.b).a2(v, option$Builder0);
            return this;
        }
    }

    private static final Method DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_;
    private ProtobufList options_;
    private boolean requestStreaming_;
    private String requestTypeUrl_;
    private boolean responseStreaming_;
    private String responseTypeUrl_;
    private int syntax_;

    static {
        Method method0 = new Method();
        Method.DEFAULT_INSTANCE = method0;
        GeneratedMessageLite.P0(Method.class, method0);
    }

    private Method() {
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.responseTypeUrl_ = "";
        this.options_ = GeneratedMessageLite.b0();
    }

    private void A1() {
        this.requestTypeUrl_ = Method.F1().getRequestTypeUrl();
    }

    private void B1() {
        this.responseStreaming_ = false;
    }

    private void C1() {
        this.responseTypeUrl_ = Method.F1().getResponseTypeUrl();
    }

    private void D1() {
        this.syntax_ = 0;
    }

    private void E1() {
        if(!this.options_.isModifiable()) {
            this.options_ = GeneratedMessageLite.r0(this.options_);
        }
    }

    public static Method F1() {
        return Method.DEFAULT_INSTANCE;
    }

    public OptionOrBuilder G1(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List H1() {
        return this.options_;
    }

    public static Builder I1() {
        return (Builder)Method.DEFAULT_INSTANCE.R();
    }

    public static Builder J1(Method method0) {
        return (Builder)Method.DEFAULT_INSTANCE.S(method0);
    }

    public static Method K1(InputStream inputStream0) throws IOException {
        return (Method)GeneratedMessageLite.w0(Method.DEFAULT_INSTANCE, inputStream0);
    }

    public static Method L1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Method)GeneratedMessageLite.x0(Method.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Method M1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.y0(Method.DEFAULT_INSTANCE, byteString0);
    }

    public static Method N1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.z0(Method.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Method O1(CodedInputStream codedInputStream0) throws IOException {
        return (Method)GeneratedMessageLite.A0(Method.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Method P1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Method)GeneratedMessageLite.B0(Method.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Method Q1(InputStream inputStream0) throws IOException {
        return (Method)GeneratedMessageLite.C0(Method.DEFAULT_INSTANCE, inputStream0);
    }

    public static Method R1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Method)GeneratedMessageLite.D0(Method.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Method S1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.E0(Method.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Method T1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.F0(Method.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Method U1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.G0(Method.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Method();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Method.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001B\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            }
            case 4: {
                return Method.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Method.PARSER;
                if(parser0 == null) {
                    Class class0 = Method.class;
                    synchronized(class0) {
                        parser0 = Method.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Method.DEFAULT_INSTANCE);
                            Method.PARSER = parser0;
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

    public static Method V1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Method)GeneratedMessageLite.H0(Method.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser W1() {
        return Method.DEFAULT_INSTANCE.getParserForType();
    }

    private void X1(int v) {
        this.E1();
        this.options_.remove(v);
    }

    private void Y1(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void Z1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void a2(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.E1();
        this.options_.set(v, option$Builder0.Y());
    }

    private void b2(int v, Option option0) {
        option0.getClass();
        this.E1();
        this.options_.set(v, option0);
    }

    private void c2(boolean z) {
        this.requestStreaming_ = z;
    }

    private void d2(String s) {
        s.getClass();
        this.requestTypeUrl_ = s;
    }

    private void e2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.requestTypeUrl_ = byteString0.b0();
    }

    private void f2(boolean z) {
        this.responseStreaming_ = z;
    }

    private void g2(String s) {
        s.getClass();
        this.responseTypeUrl_ = s;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getRequestTypeUrlBytes() {
        return ByteString.r(this.requestTypeUrl_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getResponseTypeUrl() [...] // 潜在的解密器

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getResponseTypeUrlBytes() {
        return ByteString.r(this.responseTypeUrl_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.a(this.syntax_);
        return syntax0 == null ? Syntax.d : syntax0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    private void h2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.responseTypeUrl_ = byteString0.b0();
    }

    private void i2(Syntax syntax0) {
        syntax0.getClass();
        this.syntax_ = syntax0.getNumber();
    }

    private void j2(int v) {
        this.syntax_ = v;
    }

    private void s1(Iterable iterable0) {
        this.E1();
        AbstractMessageLite.G(iterable0, this.options_);
    }

    private void t1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.E1();
        this.options_.add(v, option$Builder0.Y());
    }

    private void u1(int v, Option option0) {
        option0.getClass();
        this.E1();
        this.options_.add(v, option0);
    }

    private void v1(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.E1();
        this.options_.add(option$Builder0.Y());
    }

    private void w1(Option option0) {
        option0.getClass();
        this.E1();
        this.options_.add(option0);
    }

    private void x1() {
        this.name_ = Method.F1().getName();
    }

    private void y1() {
        this.options_ = GeneratedMessageLite.b0();
    }

    private void z1() {
        this.requestStreaming_ = false;
    }
}

