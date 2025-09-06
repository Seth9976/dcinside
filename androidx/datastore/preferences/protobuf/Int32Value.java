package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int32Value extends GeneratedMessageLite implements Int32ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements Int32ValueOrBuilder {
        private Builder() {
            super(Int32Value.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Int32Value.1 int32Value$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.Int32ValueOrBuilder
        public int getValue() {
            return ((Int32Value)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((Int32Value)this.b).U0();
            return this;
        }

        public Builder l0(int v) {
            this.c0();
            ((Int32Value)this.b).n1(v);
            return this;
        }
    }

    private static final Int32Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        Int32Value int32Value0 = new Int32Value();
        Int32Value.DEFAULT_INSTANCE = int32Value0;
        GeneratedMessageLite.P0(Int32Value.class, int32Value0);
    }

    private void U0() {
        this.value_ = 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Int32Value();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Int32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            }
            case 4: {
                return Int32Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Int32Value.PARSER;
                if(parser0 == null) {
                    Class class0 = Int32Value.class;
                    synchronized(class0) {
                        parser0 = Int32Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Int32Value.DEFAULT_INSTANCE);
                            Int32Value.PARSER = parser0;
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

    public static Int32Value V0() {
        return Int32Value.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)Int32Value.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(Int32Value int32Value0) {
        return (Builder)Int32Value.DEFAULT_INSTANCE.S(int32Value0);
    }

    public static Int32Value Y0(int v) {
        return (Int32Value)Int32Value.W0().l0(v).Y();
    }

    public static Int32Value Z0(InputStream inputStream0) throws IOException {
        return (Int32Value)GeneratedMessageLite.w0(Int32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int32Value a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int32Value)GeneratedMessageLite.x0(Int32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int32Value b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.y0(Int32Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Int32Value c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.z0(Int32Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Int32Value d1(CodedInputStream codedInputStream0) throws IOException {
        return (Int32Value)GeneratedMessageLite.A0(Int32Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Int32Value e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int32Value)GeneratedMessageLite.B0(Int32Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Int32Value f1(InputStream inputStream0) throws IOException {
        return (Int32Value)GeneratedMessageLite.C0(Int32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int32Value g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int32Value)GeneratedMessageLite.D0(Int32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Int32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Int32Value h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.E0(Int32Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Int32Value i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.F0(Int32Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Int32Value j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.G0(Int32Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Int32Value k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int32Value)GeneratedMessageLite.H0(Int32Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return Int32Value.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(int v) {
        this.value_ = v;
    }
}

