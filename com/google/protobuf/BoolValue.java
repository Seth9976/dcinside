package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BoolValue extends GeneratedMessageLite implements BoolValueOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements BoolValueOrBuilder {
        private Builder() {
            super(BoolValue.DEFAULT_INSTANCE);
        }

        Builder(a boolValue$a0) {
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((BoolValue)this.instance).clearValue();
            return this;
        }

        @Override  // com.google.protobuf.BoolValueOrBuilder
        public boolean getValue() {
            return ((BoolValue)this.instance).getValue();
        }

        public Builder setValue(boolean z) {
            this.copyOnWrite();
            ((BoolValue)this.instance).setValue(z);
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

    private static final BoolValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue0 = new BoolValue();
        BoolValue.DEFAULT_INSTANCE = boolValue0;
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, boolValue0);
    }

    private void clearValue() {
        this.value_ = false;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new BoolValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
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

    public static BoolValue getDefaultInstance() {
        return BoolValue.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.BoolValueOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    public static Builder newBuilder() {
        return (Builder)BoolValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BoolValue boolValue0) {
        return (Builder)BoolValue.DEFAULT_INSTANCE.createBuilder(boolValue0);
    }

    public static BoolValue of(boolean z) {
        return (BoolValue)BoolValue.newBuilder().setValue(z).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseDelimitedFrom(BoolValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseDelimitedFrom(BoolValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteString0);
    }

    public static BoolValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static BoolValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(InputStream inputStream0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static BoolValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static BoolValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, arr_b);
    }

    public static BoolValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (BoolValue)GeneratedMessageLite.parseFrom(BoolValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return BoolValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(boolean z) {
        this.value_ = z;
    }
}

