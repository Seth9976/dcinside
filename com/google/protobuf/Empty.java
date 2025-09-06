package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Empty extends GeneratedMessageLite implements EmptyOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements EmptyOrBuilder {
        private Builder() {
            super(Empty.DEFAULT_INSTANCE);
        }

        Builder(a empty$a0) {
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

    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser PARSER;

    static {
        Empty empty0 = new Empty();
        Empty.DEFAULT_INSTANCE = empty0;
        GeneratedMessageLite.registerDefaultInstance(Empty.class, empty0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Empty();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Empty.DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            case 4: {
                return Empty.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Empty.PARSER;
                if(parser0 == null) {
                    Class class0 = Empty.class;
                    synchronized(class0) {
                        parser0 = Empty.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Empty.DEFAULT_INSTANCE);
                            Empty.PARSER = parser0;
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

    public static Empty getDefaultInstance() {
        return Empty.DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)Empty.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Empty empty0) {
        return (Builder)Empty.DEFAULT_INSTANCE.createBuilder(empty0);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Empty)GeneratedMessageLite.parseDelimitedFrom(Empty.DEFAULT_INSTANCE, inputStream0);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Empty)GeneratedMessageLite.parseDelimitedFrom(Empty.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Empty parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, byteString0);
    }

    public static Empty parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Empty parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Empty parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Empty parseFrom(InputStream inputStream0) throws IOException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, inputStream0);
    }

    public static Empty parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Empty parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, arr_b);
    }

    public static Empty parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.parseFrom(Empty.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Empty.DEFAULT_INSTANCE.getParserForType();
    }
}

