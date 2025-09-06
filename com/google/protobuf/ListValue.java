package com.google.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ListValue extends GeneratedMessageLite implements ListValueOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ListValueOrBuilder {
        private Builder() {
            super(ListValue.DEFAULT_INSTANCE);
        }

        Builder(a listValue$a0) {
        }

        public Builder addAllValues(Iterable iterable0) {
            this.copyOnWrite();
            ((ListValue)this.instance).addAllValues(iterable0);
            return this;
        }

        public Builder addValues(int v, com.google.protobuf.Value.Builder value$Builder0) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(v, ((Value)value$Builder0.build()));
            return this;
        }

        public Builder addValues(int v, Value value0) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(v, value0);
            return this;
        }

        public Builder addValues(com.google.protobuf.Value.Builder value$Builder0) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(((Value)value$Builder0.build()));
            return this;
        }

        public Builder addValues(Value value0) {
            this.copyOnWrite();
            ((ListValue)this.instance).addValues(value0);
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((ListValue)this.instance).clearValues();
            return this;
        }

        @Override  // com.google.protobuf.ListValueOrBuilder
        public Value getValues(int v) {
            return ((ListValue)this.instance).getValues(v);
        }

        @Override  // com.google.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            return ((ListValue)this.instance).getValuesCount();
        }

        @Override  // com.google.protobuf.ListValueOrBuilder
        public List getValuesList() {
            return DesugarCollections.unmodifiableList(((ListValue)this.instance).getValuesList());
        }

        public Builder removeValues(int v) {
            this.copyOnWrite();
            ((ListValue)this.instance).removeValues(v);
            return this;
        }

        public Builder setValues(int v, com.google.protobuf.Value.Builder value$Builder0) {
            this.copyOnWrite();
            ((ListValue)this.instance).setValues(v, ((Value)value$Builder0.build()));
            return this;
        }

        public Builder setValues(int v, Value value0) {
            this.copyOnWrite();
            ((ListValue)this.instance).setValues(v, value0);
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

    private static final ListValue DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private ProtobufList values_;

    static {
        ListValue listValue0 = new ListValue();
        ListValue.DEFAULT_INSTANCE = listValue0;
        GeneratedMessageLite.registerDefaultInstance(ListValue.class, listValue0);
    }

    private ListValue() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void addAllValues(Iterable iterable0) {
        this.ensureValuesIsMutable();
        AbstractMessageLite.addAll(iterable0, this.values_);
    }

    private void addValues(int v, Value value0) {
        value0.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(v, value0);
    }

    private void addValues(Value value0) {
        value0.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(value0);
    }

    private void clearValues() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new ListValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"values_", Value.class});
            }
            case 4: {
                return ListValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = ListValue.PARSER;
                if(parser0 == null) {
                    Class class0 = ListValue.class;
                    synchronized(class0) {
                        parser0 = ListValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(ListValue.DEFAULT_INSTANCE);
                            ListValue.PARSER = parser0;
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

    private void ensureValuesIsMutable() {
        ProtobufList internal$ProtobufList0 = this.values_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static ListValue getDefaultInstance() {
        return ListValue.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.ListValueOrBuilder
    public Value getValues(int v) {
        return (Value)this.values_.get(v);
    }

    @Override  // com.google.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override  // com.google.protobuf.ListValueOrBuilder
    public List getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int v) {
        return (ValueOrBuilder)this.values_.get(v);
    }

    public List getValuesOrBuilderList() {
        return this.values_;
    }

    public static Builder newBuilder() {
        return (Builder)ListValue.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListValue listValue0) {
        return (Builder)ListValue.DEFAULT_INSTANCE.createBuilder(listValue0);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseDelimitedFrom(ListValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseDelimitedFrom(ListValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteString0);
    }

    public static ListValue parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(InputStream inputStream0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static ListValue parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static ListValue parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, arr_b);
    }

    public static ListValue parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (ListValue)GeneratedMessageLite.parseFrom(ListValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return ListValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int v) {
        this.ensureValuesIsMutable();
        this.values_.remove(v);
    }

    private void setValues(int v, Value value0) {
        value0.getClass();
        this.ensureValuesIsMutable();
        this.values_.set(v, value0);
    }
}

