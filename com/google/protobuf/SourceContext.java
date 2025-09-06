package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SourceContext extends GeneratedMessageLite implements SourceContextOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements SourceContextOrBuilder {
        private Builder() {
            super(SourceContext.DEFAULT_INSTANCE);
        }

        Builder(a sourceContext$a0) {
        }

        public Builder clearFileName() {
            this.copyOnWrite();
            ((SourceContext)this.instance).clearFileName();
            return this;
        }

        @Override  // com.google.protobuf.SourceContextOrBuilder
        public String getFileName() {
            return ((SourceContext)this.instance).getFileName();
        }

        @Override  // com.google.protobuf.SourceContextOrBuilder
        public ByteString getFileNameBytes() {
            return ((SourceContext)this.instance).getFileNameBytes();
        }

        public Builder setFileName(String s) {
            this.copyOnWrite();
            ((SourceContext)this.instance).setFileName(s);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            ((SourceContext)this.instance).setFileNameBytes(byteString0);
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

    private static final SourceContext DEFAULT_INSTANCE = null;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String fileName_;

    static {
        SourceContext sourceContext0 = new SourceContext();
        SourceContext.DEFAULT_INSTANCE = sourceContext0;
        GeneratedMessageLite.registerDefaultInstance(SourceContext.class, sourceContext0);
    }

    private SourceContext() {
        this.fileName_ = "";
    }

    private void clearFileName() {
        this.fileName_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new SourceContext();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(SourceContext.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            }
            case 4: {
                return SourceContext.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = SourceContext.PARSER;
                if(parser0 == null) {
                    Class class0 = SourceContext.class;
                    synchronized(class0) {
                        parser0 = SourceContext.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(SourceContext.DEFAULT_INSTANCE);
                            SourceContext.PARSER = parser0;
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

    public static SourceContext getDefaultInstance() {
        return SourceContext.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.SourceContextOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override  // com.google.protobuf.SourceContextOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    public static Builder newBuilder() {
        return (Builder)SourceContext.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(SourceContext sourceContext0) {
        return (Builder)SourceContext.DEFAULT_INSTANCE.createBuilder(sourceContext0);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (SourceContext)GeneratedMessageLite.parseDelimitedFrom(SourceContext.DEFAULT_INSTANCE, inputStream0);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (SourceContext)GeneratedMessageLite.parseDelimitedFrom(SourceContext.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static SourceContext parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, byteString0);
    }

    public static SourceContext parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static SourceContext parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static SourceContext parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static SourceContext parseFrom(InputStream inputStream0) throws IOException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, inputStream0);
    }

    public static SourceContext parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static SourceContext parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, arr_b);
    }

    public static SourceContext parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.parseFrom(SourceContext.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return SourceContext.DEFAULT_INSTANCE.getParserForType();
    }

    private void setFileName(String s) {
        s.getClass();
        this.fileName_ = s;
    }

    private void setFileNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.fileName_ = byteString0.toStringUtf8();
    }
}

