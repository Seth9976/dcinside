package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Any extends GeneratedMessageLite implements AnyOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements AnyOrBuilder {
        private Builder() {
            super(Any.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Any.1 any$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public String getTypeUrl() {
            return ((Any)this.b).getTypeUrl();
        }

        @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Any)this.b).getTypeUrlBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getValue() {
            return ((Any)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((Any)this.b).X0();
            return this;
        }

        public Builder l0() {
            this.c0();
            ((Any)this.b).Y0();
            return this;
        }

        public Builder m0(String s) {
            this.c0();
            ((Any)this.b).q1(s);
            return this;
        }

        public Builder n0(ByteString byteString0) {
            this.c0();
            ((Any)this.b).r1(byteString0);
            return this;
        }

        public Builder o0(ByteString byteString0) {
            this.c0();
            ((Any)this.b).s1(byteString0);
            return this;
        }
    }

    private static final Any DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_;
    private ByteString value_;

    static {
        Any any0 = new Any();
        Any.DEFAULT_INSTANCE = any0;
        GeneratedMessageLite.P0(Any.class, any0);
    }

    private Any() {
        this.typeUrl_ = "";
        this.value_ = ByteString.e;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Any();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            }
            case 4: {
                return Any.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Any.PARSER;
                if(parser0 == null) {
                    Class class0 = Any.class;
                    synchronized(class0) {
                        parser0 = Any.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Any.DEFAULT_INSTANCE);
                            Any.PARSER = parser0;
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

    private void X0() {
        this.typeUrl_ = "";
    }

    private void Y0() {
        this.value_ = Any.Z0().getValue();
    }

    public static Any Z0() {
        return Any.DEFAULT_INSTANCE;
    }

    public static Builder a1() {
        return (Builder)Any.DEFAULT_INSTANCE.R();
    }

    public static Builder b1(Any any0) {
        return (Builder)Any.DEFAULT_INSTANCE.S(any0);
    }

    public static Any c1(InputStream inputStream0) throws IOException {
        return (Any)GeneratedMessageLite.w0(Any.DEFAULT_INSTANCE, inputStream0);
    }

    public static Any d1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.x0(Any.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Any e1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.y0(Any.DEFAULT_INSTANCE, byteString0);
    }

    public static Any f1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.z0(Any.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Any g1(CodedInputStream codedInputStream0) throws IOException {
        return (Any)GeneratedMessageLite.A0(Any.DEFAULT_INSTANCE, codedInputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.r(this.typeUrl_);
    }

    @Override  // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    public static Any h1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.B0(Any.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Any i1(InputStream inputStream0) throws IOException {
        return (Any)GeneratedMessageLite.C0(Any.DEFAULT_INSTANCE, inputStream0);
    }

    public static Any j1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.D0(Any.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Any k1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.E0(Any.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Any m1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.F0(Any.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Any n1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.G0(Any.DEFAULT_INSTANCE, arr_b);
    }

    public static Any o1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.H0(Any.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser p1() {
        return Any.DEFAULT_INSTANCE.getParserForType();
    }

    private void q1(String s) {
        s.getClass();
        this.typeUrl_ = s;
    }

    private void r1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.typeUrl_ = byteString0.b0();
    }

    private void s1(ByteString byteString0) {
        byteString0.getClass();
        this.value_ = byteString0;
    }
}

