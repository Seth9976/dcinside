package com.unity3d.ads.datastore;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class WebviewConfigurationStore {
    public static final class WebViewConfigurationStore extends GeneratedMessageLite implements WebViewConfigurationStoreOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements WebViewConfigurationStoreOrBuilder {
            private Builder() {
                super(WebViewConfigurationStore.DEFAULT_INSTANCE);
            }

            Builder(com.unity3d.ads.datastore.WebviewConfigurationStore.1 webviewConfigurationStore$10) {
            }

            public Builder addAdditionalFiles(String s) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).addAdditionalFiles(s);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).addAdditionalFilesBytes(byteString0);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable iterable0) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).addAllAdditionalFiles(iterable0);
                return this;
            }

            public Builder clearAdditionalFiles() {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).clearAdditionalFiles();
                return this;
            }

            public Builder clearEntryPoint() {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).clearEntryPoint();
                return this;
            }

            public Builder clearVersion() {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).clearVersion();
                return this;
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public String getAdditionalFiles(int v) {
                return ((WebViewConfigurationStore)this.instance).getAdditionalFiles(v);
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public ByteString getAdditionalFilesBytes(int v) {
                return ((WebViewConfigurationStore)this.instance).getAdditionalFilesBytes(v);
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public int getAdditionalFilesCount() {
                return ((WebViewConfigurationStore)this.instance).getAdditionalFilesCount();
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public List getAdditionalFilesList() {
                return DesugarCollections.unmodifiableList(((WebViewConfigurationStore)this.instance).getAdditionalFilesList());
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public String getEntryPoint() {
                return ((WebViewConfigurationStore)this.instance).getEntryPoint();
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public ByteString getEntryPointBytes() {
                return ((WebViewConfigurationStore)this.instance).getEntryPointBytes();
            }

            @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
            public int getVersion() {
                return ((WebViewConfigurationStore)this.instance).getVersion();
            }

            public Builder setAdditionalFiles(int v, String s) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).setAdditionalFiles(v, s);
                return this;
            }

            public Builder setEntryPoint(String s) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).setEntryPoint(s);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).setEntryPointBytes(byteString0);
                return this;
            }

            public Builder setVersion(int v) {
                this.copyOnWrite();
                ((WebViewConfigurationStore)this.instance).setVersion(v);
                return this;
            }
        }

        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfigurationStore DEFAULT_INSTANCE = null;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ProtobufList additionalFiles_;
        private String entryPoint_;
        private int version_;

        static {
            WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0 = new WebViewConfigurationStore();
            WebViewConfigurationStore.DEFAULT_INSTANCE = webviewConfigurationStore$WebViewConfigurationStore0;
            GeneratedMessageLite.registerDefaultInstance(WebViewConfigurationStore.class, webviewConfigurationStore$WebViewConfigurationStore0);
        }

        private WebViewConfigurationStore() {
            this.entryPoint_ = "";
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAdditionalFiles(String s) {
            s.getClass();
            this.ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(s);
        }

        private void addAdditionalFilesBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(byteString0.toStringUtf8());
        }

        private void addAllAdditionalFiles(Iterable iterable0) {
            this.ensureAdditionalFilesIsMutable();
            AbstractMessageLite.addAll(iterable0, this.additionalFiles_);
        }

        private void clearAdditionalFiles() {
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEntryPoint() {
            this.entryPoint_ = WebViewConfigurationStore.getDefaultInstance().getEntryPoint();
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new WebViewConfigurationStore();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(WebViewConfigurationStore.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț", new Object[]{"version_", "entryPoint_", "additionalFiles_"});
                }
                case 4: {
                    return WebViewConfigurationStore.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = WebViewConfigurationStore.PARSER;
                    if(parser0 == null) {
                        Class class0 = WebViewConfigurationStore.class;
                        synchronized(class0) {
                            parser0 = WebViewConfigurationStore.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(WebViewConfigurationStore.DEFAULT_INSTANCE);
                                WebViewConfigurationStore.PARSER = parser0;
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

        private void ensureAdditionalFilesIsMutable() {
            ProtobufList internal$ProtobufList0 = this.additionalFiles_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.additionalFiles_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public String getAdditionalFiles(int v) {
            return (String)this.additionalFiles_.get(v);
        }

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public ByteString getAdditionalFilesBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.additionalFiles_.get(v)));
        }

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public List getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        public static WebViewConfigurationStore getDefaultInstance() {
            return WebViewConfigurationStore.DEFAULT_INSTANCE;
        }

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public String getEntryPoint() [...] // 潜在的解密器

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public ByteString getEntryPointBytes() {
            return ByteString.copyFromUtf8(this.entryPoint_);
        }

        @Override  // com.unity3d.ads.datastore.WebviewConfigurationStore$WebViewConfigurationStoreOrBuilder
        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder() {
            return (Builder)WebViewConfigurationStore.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0) {
            return (Builder)WebViewConfigurationStore.DEFAULT_INSTANCE.createBuilder(webviewConfigurationStore$WebViewConfigurationStore0);
        }

        public static WebViewConfigurationStore parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseDelimitedFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, inputStream0);
        }

        public static WebViewConfigurationStore parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseDelimitedFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static WebViewConfigurationStore parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, byteString0);
        }

        public static WebViewConfigurationStore parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static WebViewConfigurationStore parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static WebViewConfigurationStore parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static WebViewConfigurationStore parseFrom(InputStream inputStream0) throws IOException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, inputStream0);
        }

        public static WebViewConfigurationStore parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static WebViewConfigurationStore parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static WebViewConfigurationStore parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static WebViewConfigurationStore parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, arr_b);
        }

        public static WebViewConfigurationStore parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore)GeneratedMessageLite.parseFrom(WebViewConfigurationStore.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return WebViewConfigurationStore.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdditionalFiles(int v, String s) {
            s.getClass();
            this.ensureAdditionalFilesIsMutable();
            this.additionalFiles_.set(v, s);
        }

        private void setEntryPoint(String s) {
            s.getClass();
            this.entryPoint_ = s;
        }

        private void setEntryPointBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.entryPoint_ = byteString0.toStringUtf8();
        }

        private void setVersion(int v) {
            this.version_ = v;
        }
    }

    public interface WebViewConfigurationStoreOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalFiles(int arg1);

        ByteString getAdditionalFilesBytes(int arg1);

        int getAdditionalFilesCount();

        List getAdditionalFilesList();

        String getEntryPoint();

        ByteString getEntryPointBytes();

        int getVersion();
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

