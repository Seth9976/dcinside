package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UInt64Value extends GeneratedMessageLite implements UInt64ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements UInt64ValueOrBuilder {
        private Builder() {
            super(UInt64Value.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.UInt64Value.1 uInt64Value$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.UInt64ValueOrBuilder
        public long getValue() {
            return ((UInt64Value)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((UInt64Value)this.b).U0();
            return this;
        }

        public Builder l0(long v) {
            this.c0();
            ((UInt64Value)this.b).n1(v);
            return this;
        }
    }

    private static final UInt64Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        UInt64Value uInt64Value0 = new UInt64Value();
        UInt64Value.DEFAULT_INSTANCE = uInt64Value0;
        GeneratedMessageLite.P0(UInt64Value.class, uInt64Value0);
    }

    private void U0() {
        this.value_ = 0L;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new UInt64Value();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(UInt64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            }
            case 4: {
                return UInt64Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = UInt64Value.PARSER;
                if(parser0 == null) {
                    Class class0 = UInt64Value.class;
                    synchronized(class0) {
                        parser0 = UInt64Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(UInt64Value.DEFAULT_INSTANCE);
                            UInt64Value.PARSER = parser0;
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

    public static UInt64Value V0() {
        return UInt64Value.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)UInt64Value.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(UInt64Value uInt64Value0) {
        return (Builder)UInt64Value.DEFAULT_INSTANCE.S(uInt64Value0);
    }

    public static UInt64Value Y0(long v) {
        return (UInt64Value)UInt64Value.W0().l0(v).Y();
    }

    public static UInt64Value Z0(InputStream inputStream0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.w0(UInt64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt64Value a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.x0(UInt64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static UInt64Value b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.y0(UInt64Value.DEFAULT_INSTANCE, byteString0);
    }

    public static UInt64Value c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.z0(UInt64Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static UInt64Value d1(CodedInputStream codedInputStream0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.A0(UInt64Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static UInt64Value e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.B0(UInt64Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static UInt64Value f1(InputStream inputStream0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.C0(UInt64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static UInt64Value g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (UInt64Value)GeneratedMessageLite.D0(UInt64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.UInt64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    public static UInt64Value h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.E0(UInt64Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static UInt64Value i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.F0(UInt64Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static UInt64Value j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.G0(UInt64Value.DEFAULT_INSTANCE, arr_b);
    }

    public static UInt64Value k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (UInt64Value)GeneratedMessageLite.H0(UInt64Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return UInt64Value.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(long v) {
        this.value_ = v;
    }
}

