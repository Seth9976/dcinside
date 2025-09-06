package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BoolValue extends GeneratedMessageLite implements BoolValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements BoolValueOrBuilder {
        private Builder() {
            super(BoolValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.BoolValue.1 boolValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.BoolValueOrBuilder
        public boolean getValue() {
            return ((BoolValue)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((BoolValue)this.b).U0();
            return this;
        }

        public Builder l0(boolean z) {
            this.c0();
            ((BoolValue)this.b).n1(z);
            return this;
        }
    }

    private static final BoolValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue0 = new BoolValue();
        BoolValue.DEFAULT_INSTANCE = boolValue0;
        GeneratedMessageLite.P0(BoolValue.class, boolValue0);
    }

    private void U0() {
        this.value_ = false;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new BoolValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            }
            case 4: {
                return BoolValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = BoolValue.PARSER;
                if(parser0 == null) {
                    Class class0 = BoolValue.class;
                    synchronized(class0) {
                        parser0 = BoolValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(BoolValue.DEFAULT_INSTANCE);
                            BoolValue.PARSER = parser0;
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

    public static BoolValue V0() {
        return BoolValue.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)BoolValue.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(BoolValue boolValue0) {
        return (Builder)BoolValue.DEFAULT_INSTANCE.S(boolValue0);
    }

    public static BoolValue Y0(boolean z) {
        return (BoolValue)BoolValue.W0().l0(z).Y();
    }

    public static BoolValue Z0(InputStream inputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.w0(BoolValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BoolValue a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.x0(BoolValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BoolValue b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.y0(BoolValue.DEFAULT_INSTANCE, byteString0);
    }

    public static BoolValue c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.z0(BoolValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static BoolValue d1(CodedInputStream codedInputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.A0(BoolValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static BoolValue e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.B0(BoolValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static BoolValue f1(InputStream inputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.C0(BoolValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BoolValue g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.D0(BoolValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.BoolValueOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    public static BoolValue h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.E0(BoolValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static BoolValue i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.F0(BoolValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static BoolValue j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.G0(BoolValue.DEFAULT_INSTANCE, arr_b);
    }

    public static BoolValue k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.H0(BoolValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return BoolValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(boolean z) {
        this.value_ = z;
    }
}

