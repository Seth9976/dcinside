package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Any extends GeneratedMessageLite implements AnyOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AnyOrBuilder {
        private Builder() {
            super(Any.DEFAULT_INSTANCE);
        }

        Builder(a any$a0) {
        }

        public Builder clearTypeUrl() {
            this.copyOnWrite();
            ((Any)this.instance).clearTypeUrl();
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((Any)this.instance).clearValue();
            return this;
        }

        @Override  // com.google.protobuf.AnyOrBuilder
        public String getTypeUrl() {
            return ((Any)this.instance).getTypeUrl();
        }

        @Override  // com.google.protobuf.AnyOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Any)this.instance).getTypeUrlBytes();
        }

        @Override  // com.google.protobuf.AnyOrBuilder
        public ByteString getValue() {
            return ((Any)this.instance).getValue();
        }

        public Builder setTypeUrl(String s) {
            this.copyOnWrite();
            ((Any)this.instance).setTypeUrl(s);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString0) {
            this.copyOnWrite();
            ((Any)this.instance).setTypeUrlBytes(byteString0);
            return this;
        }

        public Builder setValue(ByteString byteString0) {
            this.copyOnWrite();
            ((Any)this.instance).setValue(byteString0);
            return this;
        }
    }

    static class a {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
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
        GeneratedMessageLite.registerDefaultInstance(Any.class, any0);
    }

    private Any() {
        this.typeUrl_ = "";
        this.value_ = ByteString.EMPTY;
    }

    private void clearTypeUrl() {
        this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
    }

    private void clearValue() {
        this.value_ = Any.getDefaultInstance().getValue();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Any();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
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

    public static Any getDefaultInstance() {
        return Any.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.AnyOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override  // com.google.protobuf.AnyOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    @Override  // com.google.protobuf.AnyOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)Any.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Any any0) {
        return (Builder)Any.DEFAULT_INSTANCE.createBuilder(any0);
    }

    public static Any parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Any)GeneratedMessageLite.parseDelimitedFrom(Any.DEFAULT_INSTANCE, inputStream0);
    }

    public static Any parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.parseDelimitedFrom(Any.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Any parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteString0);
    }

    public static Any parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Any parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Any parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Any parseFrom(InputStream inputStream0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, inputStream0);
    }

    public static Any parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Any parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Any parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Any parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, arr_b);
    }

    public static Any parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Any)GeneratedMessageLite.parseFrom(Any.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Any.DEFAULT_INSTANCE.getParserForType();
    }

    private void setTypeUrl(String s) {
        s.getClass();
        this.typeUrl_ = s;
    }

    private void setTypeUrlBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.typeUrl_ = byteString0.toStringUtf8();
    }

    private void setValue(ByteString byteString0) {
        byteString0.getClass();
        this.value_ = byteString0;
    }
}

