package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DoubleValue extends GeneratedMessageLite implements DoubleValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements DoubleValueOrBuilder {
        private Builder() {
            super(DoubleValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.DoubleValue.1 doubleValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.DoubleValueOrBuilder
        public double getValue() {
            return ((DoubleValue)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((DoubleValue)this.b).U0();
            return this;
        }

        public Builder l0(double f) {
            this.c0();
            ((DoubleValue)this.b).n1(f);
            return this;
        }
    }

    private static final DoubleValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue0 = new DoubleValue();
        DoubleValue.DEFAULT_INSTANCE = doubleValue0;
        GeneratedMessageLite.P0(DoubleValue.class, doubleValue0);
    }

    private void U0() {
        this.value_ = 0.0;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new DoubleValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(DoubleValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            }
            case 4: {
                return DoubleValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = DoubleValue.PARSER;
                if(parser0 == null) {
                    Class class0 = DoubleValue.class;
                    synchronized(class0) {
                        parser0 = DoubleValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(DoubleValue.DEFAULT_INSTANCE);
                            DoubleValue.PARSER = parser0;
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

    public static DoubleValue V0() {
        return DoubleValue.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)DoubleValue.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(DoubleValue doubleValue0) {
        return (Builder)DoubleValue.DEFAULT_INSTANCE.S(doubleValue0);
    }

    public static DoubleValue Y0(double f) {
        return (DoubleValue)DoubleValue.W0().l0(f).Y();
    }

    public static DoubleValue Z0(InputStream inputStream0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.w0(DoubleValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static DoubleValue a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.x0(DoubleValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static DoubleValue b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.y0(DoubleValue.DEFAULT_INSTANCE, byteString0);
    }

    public static DoubleValue c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.z0(DoubleValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static DoubleValue d1(CodedInputStream codedInputStream0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.A0(DoubleValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static DoubleValue e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.B0(DoubleValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static DoubleValue f1(InputStream inputStream0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.C0(DoubleValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static DoubleValue g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (DoubleValue)GeneratedMessageLite.D0(DoubleValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.DoubleValueOrBuilder
    public double getValue() {
        return this.value_;
    }

    public static DoubleValue h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.E0(DoubleValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static DoubleValue i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.F0(DoubleValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static DoubleValue j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.G0(DoubleValue.DEFAULT_INSTANCE, arr_b);
    }

    public static DoubleValue k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (DoubleValue)GeneratedMessageLite.H0(DoubleValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return DoubleValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(double f) {
        this.value_ = f;
    }
}

