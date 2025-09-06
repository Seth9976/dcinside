package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int64Value extends GeneratedMessageLite implements Int64ValueOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements Int64ValueOrBuilder {
        private Builder() {
            super(Int64Value.DEFAULT_INSTANCE);
        }

        Builder(a int64Value$a0) {
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((Int64Value)this.instance).clearValue();
            return this;
        }

        @Override  // com.google.protobuf.Int64ValueOrBuilder
        public long getValue() {
            return ((Int64Value)this.instance).getValue();
        }

        public Builder setValue(long v) {
            this.copyOnWrite();
            ((Int64Value)this.instance).setValue(v);
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

    private static final Int64Value DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        Int64Value int64Value0 = new Int64Value();
        Int64Value.DEFAULT_INSTANCE = int64Value0;
        GeneratedMessageLite.registerDefaultInstance(Int64Value.class, int64Value0);
    }

    private void clearValue() {
        this.value_ = 0L;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Int64Value();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
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

    public static Int64Value getDefaultInstance() {
        return Int64Value.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.Int64ValueOrBuilder
    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)Int64Value.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Int64Value int64Value0) {
        return (Builder)Int64Value.DEFAULT_INSTANCE.createBuilder(int64Value0);
    }

    public static Int64Value of(long v) {
        return (Int64Value)Int64Value.newBuilder().setValue(v).build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseDelimitedFrom(Int64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseDelimitedFrom(Int64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Int64Value parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(InputStream inputStream0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Int64Value parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Int64Value parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Int64Value parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Int64Value)GeneratedMessageLite.parseFrom(Int64Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Int64Value.DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(long v) {
        this.value_ = v;
    }
}

