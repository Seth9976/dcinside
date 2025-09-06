package com.google.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class Struct extends GeneratedMessageLite implements StructOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements StructOrBuilder {
        private Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }

        Builder(a struct$a0) {
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().clear();
            return this;
        }

        @Override  // com.google.protobuf.StructOrBuilder
        public boolean containsFields(String s) {
            s.getClass();
            return ((Struct)this.instance).getFieldsMap().containsKey(s);
        }

        @Override  // com.google.protobuf.StructOrBuilder
        @Deprecated
        public Map getFields() {
            return this.getFieldsMap();
        }

        @Override  // com.google.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((Struct)this.instance).getFieldsMap().size();
        }

        @Override  // com.google.protobuf.StructOrBuilder
        public Map getFieldsMap() {
            return DesugarCollections.unmodifiableMap(((Struct)this.instance).getFieldsMap());
        }

        @Override  // com.google.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String s, Value value0) {
            s.getClass();
            Map map0 = ((Struct)this.instance).getFieldsMap();
            return map0.containsKey(s) ? ((Value)map0.get(s)) : value0;
        }

        @Override  // com.google.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String s) {
            s.getClass();
            Map map0 = ((Struct)this.instance).getFieldsMap();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (Value)map0.get(s);
        }

        public Builder putAllFields(Map map0) {
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().putAll(map0);
            return this;
        }

        public Builder putFields(String s, Value value0) {
            s.getClass();
            value0.getClass();
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().put(s, value0);
            return this;
        }

        public Builder removeFields(String s) {
            s.getClass();
            this.copyOnWrite();
            ((Struct)this.instance).getMutableFieldsMap().remove(s);
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

    static final class b {
        static final MapEntryLite defaultEntry;

        static {
            Value value0 = Value.getDefaultInstance();
            b.defaultEntry = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.MESSAGE, value0);
        }
    }

    private static final Struct DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private MapFieldLite fields_;

    static {
        Struct struct0 = new Struct();
        Struct.DEFAULT_INSTANCE = struct0;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct0);
    }

    private Struct() {
        this.fields_ = MapFieldLite.emptyMapField();
    }

    @Override  // com.google.protobuf.StructOrBuilder
    public boolean containsFields(String s) {
        s.getClass();
        return this.internalGetFields().containsKey(s);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Struct();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.defaultEntry});
            }
            case 4: {
                return Struct.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Struct.PARSER;
                if(parser0 == null) {
                    Class class0 = Struct.class;
                    synchronized(class0) {
                        parser0 = Struct.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Struct.DEFAULT_INSTANCE);
                            Struct.PARSER = parser0;
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

    public static Struct getDefaultInstance() {
        return Struct.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.StructOrBuilder
    @Deprecated
    public Map getFields() {
        return this.getFieldsMap();
    }

    @Override  // com.google.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return this.internalGetFields().size();
    }

    @Override  // com.google.protobuf.StructOrBuilder
    public Map getFieldsMap() {
        return DesugarCollections.unmodifiableMap(this.internalGetFields());
    }

    @Override  // com.google.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String s, Value value0) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.internalGetFields();
        return mapFieldLite0.containsKey(s) ? ((Value)mapFieldLite0.get(s)) : value0;
    }

    @Override  // com.google.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.internalGetFields();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (Value)mapFieldLite0.get(s);
    }

    private Map getMutableFieldsMap() {
        return this.internalGetMutableFields();
    }

    private MapFieldLite internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite internalGetMutableFields() {
        if(!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static Builder newBuilder() {
        return (Builder)Struct.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Struct struct0) {
        return (Builder)Struct.DEFAULT_INSTANCE.createBuilder(struct0);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.parseDelimitedFrom(Struct.DEFAULT_INSTANCE, inputStream0);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.parseDelimitedFrom(Struct.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Struct parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteString0);
    }

    public static Struct parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Struct parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Struct parseFrom(InputStream inputStream0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, inputStream0);
    }

    public static Struct parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Struct parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, arr_b);
    }

    public static Struct parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Struct)GeneratedMessageLite.parseFrom(Struct.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Struct.DEFAULT_INSTANCE.getParserForType();
    }
}

