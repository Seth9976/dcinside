package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UInt32Value extends GeneratedMessageLite implements UInt32ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements UInt32ValueOrBuilder {
        private Builder() {
            super(UInt32Value.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.UInt32Value.1 uInt32Value$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
        public int getValue() {
            return ((UInt32Value)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((UInt32Value)this.b).U0();
            return this;
        }

        public Builder l0(int v) {
            this.c0();
            ((UInt32Value)this.b).n1(v);
            return this;
        }
    }

    private static final UInt32Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        UInt32Value uInt32Value0 = new UInt32Value();
        UInt32Value.DEFAULT_INSTANCE = uInt32Value0;
        GeneratedMessageLite.P0(UInt32Value.class, uInt32Value0);
    }

    private void U0() {
        this.value_ = 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new UInt32Value();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(UInt32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"value_"});
            }
            case 4: {
                return UInt32Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = UInt32Value.PARSER;
                if(parser0 == null) {
                    Class class0 = UInt32Value.class;
                    synchronized(class0) {
                        parser0 = UInt32Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(UInt32Value.DEFAULT_INSTANCE);
                            UInt32Value.PARSER = parser0;
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

    public static UInt32Value V0() {
        return UInt32Value.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)UInt32Value.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(UInt32Value uInt32Value0) {
        return (Builder)UInt32Value.DEFAULT_INSTANCE.S(uInt32Value0);
    }

    public static UInt32Value Y0(int v) {
        return (UInt32Value)UInt32Value.W0().l0(v).Y();
    }

    public static UInt32Value Z0(InputStream inputStream0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.w0(UInt32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt32Value a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.x0(UInt32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static UInt32Value b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.y0(UInt32Value.DEFAULT_INSTANCE, byteString0);
    }

    public static UInt32Value c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.z0(UInt32Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static UInt32Value d1(CodedInputStream codedInputStream0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.A0(UInt32Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static UInt32Value e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.B0(UInt32Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static UInt32Value f1(InputStream inputStream0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.C0(UInt32Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt32Value g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt32Value)GeneratedMessageLite.D0(UInt32Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static UInt32Value h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.E0(UInt32Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static UInt32Value i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.F0(UInt32Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static UInt32Value j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.G0(UInt32Value.DEFAULT_INSTANCE, arr_b);
    }

    public static UInt32Value k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt32Value)GeneratedMessageLite.H0(UInt32Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return UInt32Value.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(int v) {
        this.value_ = v;
    }
}

