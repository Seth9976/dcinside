package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class UniversalRequestStoreOuterClass {
    public static final class UniversalRequestStore extends GeneratedMessageLite implements UniversalRequestStoreOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements UniversalRequestStoreOrBuilder {
            private Builder() {
                super(UniversalRequestStore.DEFAULT_INSTANCE);
            }

            Builder(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.1 universalRequestStoreOuterClass$10) {
            }

            public Builder clearUniversalRequestMap() {
                this.copyOnWrite();
                ((UniversalRequestStore)this.instance).getMutableUniversalRequestMapMap().clear();
                return this;
            }

            @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
            public boolean containsUniversalRequestMap(String s) {
                s.getClass();
                return ((UniversalRequestStore)this.instance).getUniversalRequestMapMap().containsKey(s);
            }

            @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
            @Deprecated
            public Map getUniversalRequestMap() {
                return this.getUniversalRequestMapMap();
            }

            @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
            public int getUniversalRequestMapCount() {
                return ((UniversalRequestStore)this.instance).getUniversalRequestMapMap().size();
            }

            @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
            public Map getUniversalRequestMapMap() {
                return DesugarCollections.unmodifiableMap(((UniversalRequestStore)this.instance).getUniversalRequestMapMap());
            }

            @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
            public ByteString getUniversalRequestMapOrDefault(String s, ByteString byteString0) {
                s.getClass();
                Map map0 = ((UniversalRequestStore)this.instance).getUniversalRequestMapMap();
                return map0.containsKey(s) ? ((ByteString)map0.get(s)) : byteString0;
            }

            @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
            public ByteString getUniversalRequestMapOrThrow(String s) {
                s.getClass();
                Map map0 = ((UniversalRequestStore)this.instance).getUniversalRequestMapMap();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (ByteString)map0.get(s);
            }

            public Builder putAllUniversalRequestMap(Map map0) {
                this.copyOnWrite();
                ((UniversalRequestStore)this.instance).getMutableUniversalRequestMapMap().putAll(map0);
                return this;
            }

            public Builder putUniversalRequestMap(String s, ByteString byteString0) {
                s.getClass();
                byteString0.getClass();
                this.copyOnWrite();
                ((UniversalRequestStore)this.instance).getMutableUniversalRequestMapMap().put(s, byteString0);
                return this;
            }

            public Builder removeUniversalRequestMap(String s) {
                s.getClass();
                this.copyOnWrite();
                ((UniversalRequestStore)this.instance).getMutableUniversalRequestMapMap().remove(s);
                return this;
            }
        }

        static final class UniversalRequestMapDefaultEntryHolder {
            static final MapEntryLite defaultEntry;

            static {
                UniversalRequestMapDefaultEntryHolder.defaultEntry = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.BYTES, ByteString.EMPTY);
            }
        }

        private static final UniversalRequestStore DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int UNIVERSAL_REQUEST_MAP_FIELD_NUMBER = 1;
        private MapFieldLite universalRequestMap_;

        static {
            UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0 = new UniversalRequestStore();
            UniversalRequestStore.DEFAULT_INSTANCE = universalRequestStoreOuterClass$UniversalRequestStore0;
            GeneratedMessageLite.registerDefaultInstance(UniversalRequestStore.class, universalRequestStoreOuterClass$UniversalRequestStore0);
        }

        private UniversalRequestStore() {
            this.universalRequestMap_ = MapFieldLite.emptyMapField();
        }

        @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
        public boolean containsUniversalRequestMap(String s) {
            s.getClass();
            return this.internalGetUniversalRequestMap().containsKey(s);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new UniversalRequestStore();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(UniversalRequestStore.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"universalRequestMap_", UniversalRequestMapDefaultEntryHolder.defaultEntry});
                }
                case 4: {
                    return UniversalRequestStore.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = UniversalRequestStore.PARSER;
                    if(parser0 == null) {
                        Class class0 = UniversalRequestStore.class;
                        synchronized(class0) {
                            parser0 = UniversalRequestStore.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(UniversalRequestStore.DEFAULT_INSTANCE);
                                UniversalRequestStore.PARSER = parser0;
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

        public static UniversalRequestStore getDefaultInstance() {
            return UniversalRequestStore.DEFAULT_INSTANCE;
        }

        private Map getMutableUniversalRequestMapMap() {
            return this.internalGetMutableUniversalRequestMap();
        }

        @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
        @Deprecated
        public Map getUniversalRequestMap() {
            return this.getUniversalRequestMapMap();
        }

        @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
        public int getUniversalRequestMapCount() {
            return this.internalGetUniversalRequestMap().size();
        }

        @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
        public Map getUniversalRequestMapMap() {
            return DesugarCollections.unmodifiableMap(this.internalGetUniversalRequestMap());
        }

        @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
        public ByteString getUniversalRequestMapOrDefault(String s, ByteString byteString0) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetUniversalRequestMap();
            return mapFieldLite0.containsKey(s) ? ((ByteString)mapFieldLite0.get(s)) : byteString0;
        }

        @Override  // com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStoreOrBuilder
        public ByteString getUniversalRequestMapOrThrow(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetUniversalRequestMap();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (ByteString)mapFieldLite0.get(s);
        }

        private MapFieldLite internalGetMutableUniversalRequestMap() {
            if(!this.universalRequestMap_.isMutable()) {
                this.universalRequestMap_ = this.universalRequestMap_.mutableCopy();
            }
            return this.universalRequestMap_;
        }

        private MapFieldLite internalGetUniversalRequestMap() {
            return this.universalRequestMap_;
        }

        public static Builder newBuilder() {
            return (Builder)UniversalRequestStore.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0) {
            return (Builder)UniversalRequestStore.DEFAULT_INSTANCE.createBuilder(universalRequestStoreOuterClass$UniversalRequestStore0);
        }

        public static UniversalRequestStore parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (UniversalRequestStore)GeneratedMessageLite.parseDelimitedFrom(UniversalRequestStore.DEFAULT_INSTANCE, inputStream0);
        }

        public static UniversalRequestStore parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalRequestStore)GeneratedMessageLite.parseDelimitedFrom(UniversalRequestStore.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UniversalRequestStore parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, byteString0);
        }

        public static UniversalRequestStore parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static UniversalRequestStore parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static UniversalRequestStore parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static UniversalRequestStore parseFrom(InputStream inputStream0) throws IOException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, inputStream0);
        }

        public static UniversalRequestStore parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UniversalRequestStore parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static UniversalRequestStore parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static UniversalRequestStore parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, arr_b);
        }

        public static UniversalRequestStore parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalRequestStore)GeneratedMessageLite.parseFrom(UniversalRequestStore.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return UniversalRequestStore.DEFAULT_INSTANCE.getParserForType();
        }
    }

    public interface UniversalRequestStoreOrBuilder extends MessageLiteOrBuilder {
        boolean containsUniversalRequestMap(String arg1);

        @Deprecated
        Map getUniversalRequestMap();

        int getUniversalRequestMapCount();

        Map getUniversalRequestMapMap();

        ByteString getUniversalRequestMapOrDefault(String arg1, ByteString arg2);

        ByteString getUniversalRequestMapOrThrow(String arg1);
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

