package gatewayprotocol.v1;

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

public final class WebviewConfiguration {
    public static final class WebViewConfiguration extends GeneratedMessageLite implements WebViewConfigurationOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements WebViewConfigurationOrBuilder {
            private Builder() {
                super(WebViewConfiguration.DEFAULT_INSTANCE);
            }

            Builder(a webviewConfiguration$a0) {
            }

            public Builder addAdditionalFiles(String s) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).addAdditionalFiles(s);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).addAdditionalFilesBytes(byteString0);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable iterable0) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).addAllAdditionalFiles(iterable0);
                return this;
            }

            public Builder clearAdditionalFiles() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearAdditionalFiles();
                return this;
            }

            public Builder clearEntryPoint() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearEntryPoint();
                return this;
            }

            public Builder clearType() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearType();
                return this;
            }

            public Builder clearVersion() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearVersion();
                return this;
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public String getAdditionalFiles(int v) {
                return ((WebViewConfiguration)this.instance).getAdditionalFiles(v);
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public ByteString getAdditionalFilesBytes(int v) {
                return ((WebViewConfiguration)this.instance).getAdditionalFilesBytes(v);
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public int getAdditionalFilesCount() {
                return ((WebViewConfiguration)this.instance).getAdditionalFilesCount();
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public List getAdditionalFilesList() {
                return DesugarCollections.unmodifiableList(((WebViewConfiguration)this.instance).getAdditionalFilesList());
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public String getEntryPoint() {
                return ((WebViewConfiguration)this.instance).getEntryPoint();
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public ByteString getEntryPointBytes() {
                return ((WebViewConfiguration)this.instance).getEntryPointBytes();
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public String getType() {
                return ((WebViewConfiguration)this.instance).getType();
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public ByteString getTypeBytes() {
                return ((WebViewConfiguration)this.instance).getTypeBytes();
            }

            @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
            public int getVersion() {
                return ((WebViewConfiguration)this.instance).getVersion();
            }

            public Builder setAdditionalFiles(int v, String s) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setAdditionalFiles(v, s);
                return this;
            }

            public Builder setEntryPoint(String s) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setEntryPoint(s);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setEntryPointBytes(byteString0);
                return this;
            }

            public Builder setType(String s) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setType(s);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setTypeBytes(byteString0);
                return this;
            }

            public Builder setVersion(int v) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setVersion(v);
                return this;
            }
        }

        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfiguration DEFAULT_INSTANCE = null;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ProtobufList additionalFiles_;
        private String entryPoint_;
        private String type_;
        private int version_;

        static {
            WebViewConfiguration webviewConfiguration$WebViewConfiguration0 = new WebViewConfiguration();
            WebViewConfiguration.DEFAULT_INSTANCE = webviewConfiguration$WebViewConfiguration0;
            GeneratedMessageLite.registerDefaultInstance(WebViewConfiguration.class, webviewConfiguration$WebViewConfiguration0);
        }

        private WebViewConfiguration() {
            this.entryPoint_ = "";
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
            this.type_ = "";
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
            this.entryPoint_ = "";
        }

        private void clearType() {
            this.type_ = "";
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new WebViewConfiguration();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(WebViewConfiguration.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
                }
                case 4: {
                    return WebViewConfiguration.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = WebViewConfiguration.PARSER;
                    if(parser0 == null) {
                        Class class0 = WebViewConfiguration.class;
                        synchronized(class0) {
                            parser0 = WebViewConfiguration.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(WebViewConfiguration.DEFAULT_INSTANCE);
                                WebViewConfiguration.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public String getAdditionalFiles(int v) {
            return (String)this.additionalFiles_.get(v);
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public ByteString getAdditionalFilesBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.additionalFiles_.get(v)));
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public List getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        public static WebViewConfiguration getDefaultInstance() {
            return WebViewConfiguration.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public String getEntryPoint() {
            return this.entryPoint_;
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public ByteString getEntryPointBytes() {
            return ByteString.copyFromUtf8(this.entryPoint_);
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override  // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder() {
            return (Builder)WebViewConfiguration.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
            return (Builder)WebViewConfiguration.DEFAULT_INSTANCE.createBuilder(webviewConfiguration$WebViewConfiguration0);
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseDelimitedFrom(WebViewConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseDelimitedFrom(WebViewConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, byteString0);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream0) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static WebViewConfiguration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, arr_b);
        }

        public static WebViewConfiguration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom(WebViewConfiguration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return WebViewConfiguration.DEFAULT_INSTANCE.getParserForType();
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

        private void setType(String s) {
            s.getClass();
            this.type_ = s;
        }

        private void setTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.type_ = byteString0.toStringUtf8();
        }

        private void setVersion(int v) {
            this.version_ = v;
        }
    }

    public interface WebViewConfigurationOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalFiles(int arg1);

        ByteString getAdditionalFilesBytes(int arg1);

        int getAdditionalFilesCount();

        List getAdditionalFilesList();

        String getEntryPoint();

        ByteString getEntryPointBytes();

        String getType();

        ByteString getTypeBytes();

        int getVersion();
    }

    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

