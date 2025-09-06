package gatewayprotocol.v1;

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

public final class HeaderBiddingAdMarkupOuterClass {
    public static final class HeaderBiddingAdMarkup extends GeneratedMessageLite implements HeaderBiddingAdMarkupOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements HeaderBiddingAdMarkupOrBuilder {
            private Builder() {
                super(HeaderBiddingAdMarkup.DEFAULT_INSTANCE);
            }

            Builder(a headerBiddingAdMarkupOuterClass$a0) {
            }

            public Builder clearAdData() {
                this.copyOnWrite();
                ((HeaderBiddingAdMarkup)this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataVersion() {
                this.copyOnWrite();
                ((HeaderBiddingAdMarkup)this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearConfigurationToken() {
                this.copyOnWrite();
                ((HeaderBiddingAdMarkup)this.instance).clearConfigurationToken();
                return this;
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder
            public ByteString getAdData() {
                return ((HeaderBiddingAdMarkup)this.instance).getAdData();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder
            public int getAdDataVersion() {
                return ((HeaderBiddingAdMarkup)this.instance).getAdDataVersion();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder
            public ByteString getConfigurationToken() {
                return ((HeaderBiddingAdMarkup)this.instance).getConfigurationToken();
            }

            public Builder setAdData(ByteString byteString0) {
                this.copyOnWrite();
                ((HeaderBiddingAdMarkup)this.instance).setAdData(byteString0);
                return this;
            }

            public Builder setAdDataVersion(int v) {
                this.copyOnWrite();
                ((HeaderBiddingAdMarkup)this.instance).setAdDataVersion(v);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString0) {
                this.copyOnWrite();
                ((HeaderBiddingAdMarkup)this.instance).setConfigurationToken(byteString0);
                return this;
            }
        }

        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 3;
        private static final HeaderBiddingAdMarkup DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private int adDataVersion_;
        private ByteString adData_;
        private ByteString configurationToken_;

        static {
            HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0 = new HeaderBiddingAdMarkup();
            HeaderBiddingAdMarkup.DEFAULT_INSTANCE = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingAdMarkup.class, headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0);
        }

        private HeaderBiddingAdMarkup() {
            this.adData_ = ByteString.EMPTY;
            this.configurationToken_ = ByteString.EMPTY;
        }

        private void clearAdData() {
            this.adData_ = HeaderBiddingAdMarkup.getDefaultInstance().getAdData();
        }

        private void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        private void clearConfigurationToken() {
            this.configurationToken_ = HeaderBiddingAdMarkup.getDefaultInstance().getConfigurationToken();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new HeaderBiddingAdMarkup();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n", new Object[]{"adData_", "adDataVersion_", "configurationToken_"});
                }
                case 4: {
                    return HeaderBiddingAdMarkup.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = HeaderBiddingAdMarkup.PARSER;
                    if(parser0 == null) {
                        Class class0 = HeaderBiddingAdMarkup.class;
                        synchronized(class0) {
                            parser0 = HeaderBiddingAdMarkup.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(HeaderBiddingAdMarkup.DEFAULT_INSTANCE);
                                HeaderBiddingAdMarkup.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkupOrBuilder
        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        public static HeaderBiddingAdMarkup getDefaultInstance() {
            return HeaderBiddingAdMarkup.DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)HeaderBiddingAdMarkup.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0) {
            return (Builder)HeaderBiddingAdMarkup.DEFAULT_INSTANCE.createBuilder(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0);
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseDelimitedFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, inputStream0);
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseDelimitedFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, byteString0);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream0) throws IOException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, inputStream0);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, arr_b);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup)GeneratedMessageLite.parseFrom(HeaderBiddingAdMarkup.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return HeaderBiddingAdMarkup.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdData(ByteString byteString0) {
            byteString0.getClass();
            this.adData_ = byteString0;
        }

        private void setAdDataVersion(int v) {
            this.adDataVersion_ = v;
        }

        private void setConfigurationToken(ByteString byteString0) {
            byteString0.getClass();
            this.configurationToken_ = byteString0;
        }
    }

    public interface HeaderBiddingAdMarkupOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        int getAdDataVersion();

        ByteString getConfigurationToken();
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

