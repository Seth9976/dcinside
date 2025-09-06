package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FloatValue extends GeneratedMessageLite implements FloatValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements FloatValueOrBuilder {
        private Builder() {
            super(FloatValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.FloatValue.1 floatValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.FloatValueOrBuilder
        public float getValue() {
            return ((FloatValue)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((FloatValue)this.b).U0();
            return this;
        }

        public Builder l0(float f) {
            this.c0();
            ((FloatValue)this.b).n1(f);
            return this;
        }
    }

    private static final FloatValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue0 = new FloatValue();
        FloatValue.DEFAULT_INSTANCE = floatValue0;
        GeneratedMessageLite.P0(FloatValue.class, floatValue0);
    }

    private void U0() {
        this.value_ = 0.0f;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new FloatValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(FloatValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            }
            case 4: {
                return FloatValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = FloatValue.PARSER;
                if(parser0 == null) {
                    Class class0 = FloatValue.class;
                    synchronized(class0) {
                        parser0 = FloatValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(FloatValue.DEFAULT_INSTANCE);
                            FloatValue.PARSER = parser0;
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

    public static FloatValue V0() {
        return FloatValue.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)FloatValue.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(FloatValue floatValue0) {
        return (Builder)FloatValue.DEFAULT_INSTANCE.S(floatValue0);
    }

    public static FloatValue Y0(float f) {
        return (FloatValue)FloatValue.W0().l0(f).Y();
    }

    public static FloatValue Z0(InputStream inputStream0) throws IOException {
        return (FloatValue)GeneratedMessageLite.w0(FloatValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static FloatValue a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FloatValue)GeneratedMessageLite.x0(FloatValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static FloatValue b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (FloatValue)GeneratedMessageLite.y0(FloatValue.DEFAULT_INSTANCE, byteString0);
    }

    public static FloatValue c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FloatValue)GeneratedMessageLite.z0(FloatValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static FloatValue d1(CodedInputStream codedInputStream0) throws IOException {
        return (FloatValue)GeneratedMessageLite.A0(FloatValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static FloatValue e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FloatValue)GeneratedMessageLite.B0(FloatValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static FloatValue f1(InputStream inputStream0) throws IOException {
        return (FloatValue)GeneratedMessageLite.C0(FloatValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static FloatValue g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (FloatValue)GeneratedMessageLite.D0(FloatValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.FloatValueOrBuilder
    public float getValue() {
        return this.value_;
    }

    public static FloatValue h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (FloatValue)GeneratedMessageLite.E0(FloatValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static FloatValue i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FloatValue)GeneratedMessageLite.F0(FloatValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static FloatValue j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (FloatValue)GeneratedMessageLite.G0(FloatValue.DEFAULT_INSTANCE, arr_b);
    }

    public static FloatValue k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (FloatValue)GeneratedMessageLite.H0(FloatValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return FloatValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(float f) {
        this.value_ = f;
    }
}

