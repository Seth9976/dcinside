package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int64Value extends GeneratedMessageLite implements Int64ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements Int64ValueOrBuilder {
        private Builder() {
            super(Int64Value.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Int64Value.1 int64Value$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.Int64ValueOrBuilder
        public long getValue() {
            return ((Int64Value)this.b).getValue();
        }

        public Builder k0() {
            this.c0();
            ((Int64Value)this.b).U0();
            return this;
        }

        public Builder l0(long v) {
            this.c0();
            ((Int64Value)this.b).n1(v);
            return this;
        }
    }

    private static final Int64Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        Int64Value int64Value0 = new Int64Value();
        Int64Value.DEFAULT_INSTANCE = int64Value0;
        GeneratedMessageLite.P0(Int64Value.class, int64Value0);
    }

    private void U0() {
        this.value_ = 0L;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Int64Value();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            }
            case 4: {
                return Int64Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Int64Value.PARSER;
                if(parser0 == null) {
                    Class class0 = Int64Value.class;
                    synchronized(class0) {
                        parser0 = Int64Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Int64Value.DEFAULT_INSTANCE);
                            Int64Value.PARSER = parser0;
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

    public static Int64Value V0() {
        return Int64Value.DEFAULT_INSTANCE;
    }

    public static Builder W0() {
        return (Builder)Int64Value.DEFAULT_INSTANCE.R();
    }

    public static Builder X0(Int64Value int64Value0) {
        return (Builder)Int64Value.DEFAULT_INSTANCE.S(int64Value0);
    }

    public static Int64Value Y0(long v) {
        return (Int64Value)Int64Value.W0().l0(v).Y();
    }

    public static Int64Value Z0(InputStream inputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.w0(Int64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int64Value a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.x0(Int64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int64Value b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.y0(Int64Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Int64Value c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.z0(Int64Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Int64Value d1(CodedInputStream codedInputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.A0(Int64Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Int64Value e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.B0(Int64Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Int64Value f1(InputStream inputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.C0(Int64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int64Value g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.D0(Int64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Int64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    public static Int64Value h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.E0(Int64Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Int64Value i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.F0(Int64Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Int64Value j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.G0(Int64Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Int64Value k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.H0(Int64Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return Int64Value.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(long v) {
        this.value_ = v;
    }
}

