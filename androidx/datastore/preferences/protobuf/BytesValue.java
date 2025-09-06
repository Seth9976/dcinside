package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BytesValue extends GeneratedMessageLite implements BytesValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements BytesValueOrBuilder {
        private Builder() {
            super(BytesValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.BytesValue.1 bytesValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
        public ByteString getValue() {
            return ((BytesValue)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((BytesValue)this.b).U0();
            return this;
        }

        public Builder l0(ByteString byteString0) {
            this.c0();
            ((BytesValue)this.b).n1(byteString0);
            return this;
        }
    }

    private static final BytesValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_;

    static {
        BytesValue bytesValue0 = new BytesValue();
        BytesValue.DEFAULT_INSTANCE = bytesValue0;
        GeneratedMessageLite.P0(BytesValue.class, bytesValue0);
    }

    private BytesValue() {
        this.value_ = ByteString.e;
    }

    private void U0() {
        this.value_ = BytesValue.V0().getValue();
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new BytesValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(BytesValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            }
            case 4: {
                return BytesValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = BytesValue.PARSER;
                if(parser0 == null) {
                    Class class0 = BytesValue.class;
                    synchronized(class0) {
                        parser0 = BytesValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(BytesValue.DEFAULT_INSTANCE);
                            BytesValue.PARSER = parser0;
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

    public static BytesValue V0() {
        return BytesValue.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)BytesValue.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(BytesValue bytesValue0) {
        return (Builder)BytesValue.DEFAULT_INSTANCE.S(bytesValue0);
    }

    public static BytesValue Y0(ByteString byteString0) {
        return (BytesValue)BytesValue.W0().l0(byteString0).Y();
    }

    public static BytesValue Z0(InputStream inputStream0) throws IOException {
        return (BytesValue)GeneratedMessageLite.w0(BytesValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BytesValue a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BytesValue)GeneratedMessageLite.x0(BytesValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BytesValue b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.y0(BytesValue.DEFAULT_INSTANCE, byteString0);
    }

    public static BytesValue c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.z0(BytesValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static BytesValue d1(CodedInputStream codedInputStream0) throws IOException {
        return (BytesValue)GeneratedMessageLite.A0(BytesValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static BytesValue e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BytesValue)GeneratedMessageLite.B0(BytesValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static BytesValue f1(InputStream inputStream0) throws IOException {
        return (BytesValue)GeneratedMessageLite.C0(BytesValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BytesValue g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BytesValue)GeneratedMessageLite.D0(BytesValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    public static BytesValue h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.E0(BytesValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static BytesValue i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.F0(BytesValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static BytesValue j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.G0(BytesValue.DEFAULT_INSTANCE, arr_b);
    }

    public static BytesValue k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BytesValue)GeneratedMessageLite.H0(BytesValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return BytesValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(ByteString byteString0) {
        byteString0.getClass();
        this.value_ = byteString0;
    }
}

