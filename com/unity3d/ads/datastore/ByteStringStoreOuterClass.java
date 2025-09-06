package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ByteStringStoreOuterClass {
    public static final class ByteStringStore extends GeneratedMessageLite implements ByteStringStoreOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ByteStringStoreOrBuilder {
            private Builder() {
                super(ByteStringStore.DEFAULT_INSTANCE);
            }

            Builder(com.unity3d.ads.datastore.ByteStringStoreOuterClass.1 byteStringStoreOuterClass$10) {
            }

            public Builder clearData() {
                this.copyOnWrite();
                ((ByteStringStore)this.instance).clearData();
                return this;
            }

            @Override  // com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStoreOrBuilder
            public ByteString getData() {
                return ((ByteStringStore)this.instance).getData();
            }

            public Builder setData(ByteString byteString0) {
                this.copyOnWrite();
                ((ByteStringStore)this.instance).setData(byteString0);
                return this;
            }
        }

        public static final int DATA_FIELD_NUMBER = 1;
        private static final ByteStringStore DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private ByteString data_;

        static {
            ByteStringStore byteStringStoreOuterClass$ByteStringStore0 = new ByteStringStore();
            ByteStringStore.DEFAULT_INSTANCE = byteStringStoreOuterClass$ByteStringStore0;
            GeneratedMessageLite.registerDefaultInstance(ByteStringStore.class, byteStringStoreOuterClass$ByteStringStore0);
        }

        private ByteStringStore() {
            this.data_ = ByteString.EMPTY;
        }

        private void clearData() {
            this.data_ = ByteStringStore.getDefaultInstance().getData();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new ByteStringStore();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(ByteStringStore.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"data_"});
                }
                case 4: {
                    return ByteStringStore.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = ByteStringStore.PARSER;
                    if(parser0 == null) {
                        Class class0 = ByteStringStore.class;
                        synchronized(class0) {
                            parser0 = ByteStringStore.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(ByteStringStore.DEFAULT_INSTANCE);
                                ByteStringStore.PARSER = parser0;
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

        @Override  // com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStoreOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        public static ByteStringStore getDefaultInstance() {
            return ByteStringStore.DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)ByteStringStore.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ByteStringStore byteStringStoreOuterClass$ByteStringStore0) {
            return (Builder)ByteStringStore.DEFAULT_INSTANCE.createBuilder(byteStringStoreOuterClass$ByteStringStore0);
        }

        public static ByteStringStore parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (ByteStringStore)GeneratedMessageLite.parseDelimitedFrom(ByteStringStore.DEFAULT_INSTANCE, inputStream0);
        }

        public static ByteStringStore parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ByteStringStore)GeneratedMessageLite.parseDelimitedFrom(ByteStringStore.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ByteStringStore parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, byteString0);
        }

        public static ByteStringStore parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static ByteStringStore parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static ByteStringStore parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static ByteStringStore parseFrom(InputStream inputStream0) throws IOException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, inputStream0);
        }

        public static ByteStringStore parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ByteStringStore parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static ByteStringStore parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static ByteStringStore parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, arr_b);
        }

        public static ByteStringStore parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ByteStringStore)GeneratedMessageLite.parseFrom(ByteStringStore.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return ByteStringStore.DEFAULT_INSTANCE.getParserForType();
        }

        private void setData(ByteString byteString0) {
            byteString0.getClass();
            this.data_ = byteString0;
        }
    }

    public interface ByteStringStoreOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

