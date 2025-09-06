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

public final class AdPlayerConfigResponseOuterClass {
    public static final class AdPlayerConfigResponse extends GeneratedMessageLite implements AdPlayerConfigResponseOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdPlayerConfigResponseOrBuilder {
            private Builder() {
                super(AdPlayerConfigResponse.DEFAULT_INSTANCE);
            }

            Builder(a adPlayerConfigResponseOuterClass$a0) {
            }

            public Builder clearAdDataRefreshToken() {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearError() {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).clearError();
                return this;
            }

            public Builder clearImpressionConfiguration() {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).clearImpressionConfiguration();
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            public Builder clearTrackingToken() {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).clearTrackingToken();
                return this;
            }

            public Builder clearWebviewConfiguration() {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdPlayerConfigResponse)this.instance).getAdDataRefreshToken();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public Error getError() {
                return ((AdPlayerConfigResponse)this.instance).getError();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public ByteString getImpressionConfiguration() {
                return ((AdPlayerConfigResponse)this.instance).getImpressionConfiguration();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((AdPlayerConfigResponse)this.instance).getImpressionConfigurationVersion();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdPlayerConfigResponse)this.instance).getTrackingToken();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public WebViewConfiguration getWebviewConfiguration() {
                return ((AdPlayerConfigResponse)this.instance).getWebviewConfiguration();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public boolean hasError() {
                return ((AdPlayerConfigResponse)this.instance).hasError();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((AdPlayerConfigResponse)this.instance).hasWebviewConfiguration();
            }

            public Builder mergeError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).mergeError(errorOuterClass$Error0);
                return this;
            }

            public Builder mergeWebviewConfiguration(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).mergeWebviewConfiguration(webviewConfiguration$WebViewConfiguration0);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setAdDataRefreshToken(byteString0);
                return this;
            }

            public Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder errorOuterClass$Error$Builder0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setError(((Error)errorOuterClass$Error$Builder0.build()));
                return this;
            }

            public Builder setError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setError(errorOuterClass$Error0);
                return this;
            }

            public Builder setImpressionConfiguration(ByteString byteString0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setImpressionConfiguration(byteString0);
                return this;
            }

            public Builder setImpressionConfigurationVersion(int v) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setImpressionConfigurationVersion(v);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setTrackingToken(byteString0);
                return this;
            }

            public Builder setWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder webviewConfiguration$WebViewConfiguration$Builder0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setWebviewConfiguration(((WebViewConfiguration)webviewConfiguration$WebViewConfiguration$Builder0.build()));
                return this;
            }

            public Builder setWebviewConfiguration(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
                this.copyOnWrite();
                ((AdPlayerConfigResponse)this.instance).setWebviewConfiguration(webviewConfiguration$WebViewConfiguration0);
                return this;
            }
        }

        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        private static final AdPlayerConfigResponse DEFAULT_INSTANCE = null;
        public static final int ERROR_FIELD_NUMBER = 6;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private ByteString adDataRefreshToken_;
        private int bitField0_;
        private Error error_;
        private int impressionConfigurationVersion_;
        private ByteString impressionConfiguration_;
        private ByteString trackingToken_;
        private WebViewConfiguration webviewConfiguration_;

        static {
            AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0 = new AdPlayerConfigResponse();
            AdPlayerConfigResponse.DEFAULT_INSTANCE = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigResponse.class, adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0);
        }

        private AdPlayerConfigResponse() {
            this.trackingToken_ = ByteString.EMPTY;
            this.impressionConfiguration_ = ByteString.EMPTY;
            this.adDataRefreshToken_ = ByteString.EMPTY;
        }

        private void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = AdPlayerConfigResponse.getDefaultInstance().getAdDataRefreshToken();
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        private void clearImpressionConfiguration() {
            this.impressionConfiguration_ = AdPlayerConfigResponse.getDefaultInstance().getImpressionConfiguration();
        }

        private void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = AdPlayerConfigResponse.getDefaultInstance().getTrackingToken();
        }

        private void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdPlayerConfigResponse();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdPlayerConfigResponse.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006ဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "error_"});
                }
                case 4: {
                    return AdPlayerConfigResponse.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdPlayerConfigResponse.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdPlayerConfigResponse.class;
                        synchronized(class0) {
                            parser0 = AdPlayerConfigResponse.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdPlayerConfigResponse.DEFAULT_INSTANCE);
                                AdPlayerConfigResponse.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        public static AdPlayerConfigResponse getDefaultInstance() {
            return AdPlayerConfigResponse.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public Error getError() {
            return this.error_ == null ? Error.getDefaultInstance() : this.error_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public WebViewConfiguration getWebviewConfiguration() {
            return this.webviewConfiguration_ == null ? WebViewConfiguration.getDefaultInstance() : this.webviewConfiguration_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = this.error_ == null || this.error_ == Error.getDefaultInstance() ? errorOuterClass$Error0 : ((Error)((gatewayprotocol.v1.ErrorOuterClass.Error.Builder)Error.newBuilder(this.error_).mergeFrom(errorOuterClass$Error0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergeWebviewConfiguration(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
            webviewConfiguration$WebViewConfiguration0.getClass();
            this.webviewConfiguration_ = this.webviewConfiguration_ == null || this.webviewConfiguration_ == WebViewConfiguration.getDefaultInstance() ? webviewConfiguration$WebViewConfiguration0 : ((WebViewConfiguration)((gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder)WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom(webviewConfiguration$WebViewConfiguration0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)AdPlayerConfigResponse.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0) {
            return (Builder)AdPlayerConfigResponse.DEFAULT_INSTANCE.createBuilder(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0);
        }

        public static AdPlayerConfigResponse parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseDelimitedFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdPlayerConfigResponse parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseDelimitedFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdPlayerConfigResponse parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, byteString0);
        }

        public static AdPlayerConfigResponse parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdPlayerConfigResponse parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdPlayerConfigResponse parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdPlayerConfigResponse parseFrom(InputStream inputStream0) throws IOException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdPlayerConfigResponse parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdPlayerConfigResponse parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdPlayerConfigResponse parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdPlayerConfigResponse parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, arr_b);
        }

        public static AdPlayerConfigResponse parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse)GeneratedMessageLite.parseFrom(AdPlayerConfigResponse.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdPlayerConfigResponse.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdDataRefreshToken(ByteString byteString0) {
            byteString0.getClass();
            this.adDataRefreshToken_ = byteString0;
        }

        private void setError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = errorOuterClass$Error0;
            this.bitField0_ |= 2;
        }

        private void setImpressionConfiguration(ByteString byteString0) {
            byteString0.getClass();
            this.impressionConfiguration_ = byteString0;
        }

        private void setImpressionConfigurationVersion(int v) {
            this.impressionConfigurationVersion_ = v;
        }

        private void setTrackingToken(ByteString byteString0) {
            byteString0.getClass();
            this.trackingToken_ = byteString0;
        }

        private void setWebviewConfiguration(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
            webviewConfiguration$WebViewConfiguration0.getClass();
            this.webviewConfiguration_ = webviewConfiguration$WebViewConfiguration0;
            this.bitField0_ |= 1;
        }
    }

    public interface AdPlayerConfigResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdDataRefreshToken();

        Error getError();

        ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        ByteString getTrackingToken();

        WebViewConfiguration getWebviewConfiguration();

        boolean hasError();

        boolean hasWebviewConfiguration();
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

