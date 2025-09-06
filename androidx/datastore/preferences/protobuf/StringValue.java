package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StringValue extends GeneratedMessageLite implements StringValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements StringValueOrBuilder {
        private Builder() {
            super(StringValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.StringValue.1 stringValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public String getValue() {
            return ((StringValue)this.b).getValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public ByteString getValueBytes() {
            return ((StringValue)this.b).getValueBytes();
        }

        public Builder k0() {
            this.c0();
            ((StringValue)this.b).V0();
            return this;
        }

        public Builder l0(String s) {
            this.c0();
            ((StringValue)this.b).o1(s);
            return this;
        }

        public Builder m0(ByteString byteString0) {
            this.c0();
            ((StringValue)this.b).p1(byteString0);
            return this;
        }
    }

    private static final StringValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_;

    static {
        StringValue stringValue0 = new StringValue();
        StringValue.DEFAULT_INSTANCE = stringValue0;
        GeneratedMessageLite.P0(StringValue.class, stringValue0);
    }

    private StringValue() {
        this.value_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new StringValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(StringValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            }
            case 4: {
                return StringValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = StringValue.PARSER;
                if(parser0 == null) {
                    Class class0 = StringValue.class;
                    synchronized(class0) {
                        parser0 = StringValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(StringValue.DEFAULT_INSTANCE);
                            StringValue.PARSER = parser0;
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

    private void V0() {
        this.value_ = "";
    }

    public static StringValue W0() {
        return StringValue.DEFAULT_INSTANCE;
    }

    public static Builder X0() {
        return (Builder)StringValue.DEFAULT_INSTANCE.R();
    }

    public static Builder Y0(StringValue stringValue0) {
        return (Builder)StringValue.DEFAULT_INSTANCE.S(stringValue0);
    }

    public static StringValue Z0(String s) {
        return (StringValue)StringValue.X0().l0(s).Y();
    }

    public static StringValue a1(InputStream inputStream0) throws IOException {
        return (StringValue)GeneratedMessageLite.w0(StringValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static StringValue b1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (StringValue)GeneratedMessageLite.x0(StringValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static StringValue c1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.y0(StringValue.DEFAULT_INSTANCE, byteString0);
    }

    public static StringValue d1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.z0(StringValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static StringValue e1(CodedInputStream codedInputStream0) throws IOException {
        return (StringValue)GeneratedMessageLite.A0(StringValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static StringValue f1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (StringValue)GeneratedMessageLite.B0(StringValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static StringValue g1(InputStream inputStream0) throws IOException {
        return (StringValue)GeneratedMessageLite.C0(StringValue.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override  // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public ByteString getValueBytes() {
        return ByteString.r(this.value_);
    }

    public static StringValue h1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (StringValue)GeneratedMessageLite.D0(StringValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static StringValue i1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.E0(StringValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static StringValue j1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.F0(StringValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static StringValue k1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.G0(StringValue.DEFAULT_INSTANCE, arr_b);
    }

    public static StringValue m1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (StringValue)GeneratedMessageLite.H0(StringValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser n1() {
        return StringValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void o1(String s) {
        s.getClass();
        this.value_ = s;
    }

    private void p1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.value_ = byteString0.b0();
    }
}

