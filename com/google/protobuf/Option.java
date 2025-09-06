package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Option extends GeneratedMessageLite implements OptionOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements OptionOrBuilder {
        private Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        Builder(a option$a0) {
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Option)this.instance).clearName();
            return this;
        }

        public Builder clearValue() {
            this.copyOnWrite();
            ((Option)this.instance).clearValue();
            return this;
        }

        @Override  // com.google.protobuf.OptionOrBuilder
        public String getName() {
            return ((Option)this.instance).getName();
        }

        @Override  // com.google.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
            return ((Option)this.instance).getNameBytes();
        }

        @Override  // com.google.protobuf.OptionOrBuilder
        public Any getValue() {
            return ((Option)this.instance).getValue();
        }

        @Override  // com.google.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((Option)this.instance).hasValue();
        }

        public Builder mergeValue(Any any0) {
            this.copyOnWrite();
            ((Option)this.instance).mergeValue(any0);
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            ((Option)this.instance).setName(s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            ((Option)this.instance).setNameBytes(byteString0);
            return this;
        }

        public Builder setValue(com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((Option)this.instance).setValue(((Any)any$Builder0.build()));
            return this;
        }

        public Builder setValue(Any any0) {
            this.copyOnWrite();
            ((Option)this.instance).setValue(any0);
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

    private static final Option DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_;
    private Any value_;

    static {
        Option option0 = new Option();
        Option.DEFAULT_INSTANCE = option0;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option0);
    }

    private Option() {
        this.name_ = "";
    }

    private void clearName() {
        this.name_ = "";
    }

    private void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Option();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            }
            case 4: {
                return Option.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Option.PARSER;
                if(parser0 == null) {
                    Class class0 = Option.class;
                    synchronized(class0) {
                        parser0 = Option.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Option.DEFAULT_INSTANCE);
                            Option.PARSER = parser0;
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

    public static Option getDefaultInstance() {
        return Option.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.OptionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.protobuf.OptionOrBuilder
    public Any getValue() {
        return this.value_ == null ? Any.getDefaultInstance() : this.value_;
    }

    @Override  // com.google.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeValue(Any any0) {
        any0.getClass();
        this.value_ = this.value_ == null || this.value_ == Any.getDefaultInstance() ? any0 : ((Any)((com.google.protobuf.Any.Builder)Any.newBuilder(this.value_).mergeFrom(any0)).buildPartial());
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder)Option.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Option option0) {
        return (Builder)Option.DEFAULT_INSTANCE.createBuilder(option0);
    }

    public static Option parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Option)GeneratedMessageLite.parseDelimitedFrom(Option.DEFAULT_INSTANCE, inputStream0);
    }

    public static Option parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.parseDelimitedFrom(Option.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Option parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteString0);
    }

    public static Option parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Option parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Option parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Option parseFrom(InputStream inputStream0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, inputStream0);
    }

    public static Option parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Option parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Option parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Option parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, arr_b);
    }

    public static Option parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.parseFrom(Option.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Option.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    private void setValue(Any any0) {
        any0.getClass();
        this.value_ = any0;
        this.bitField0_ |= 1;
    }
}

