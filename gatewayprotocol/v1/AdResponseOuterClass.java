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

public final class AdResponseOuterClass {
    public static final class AdResponse extends GeneratedMessageLite implements AdResponseOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdResponseOrBuilder {
            private Builder() {
                super(AdResponse.DEFAULT_INSTANCE);
            }

            Builder(a adResponseOuterClass$a0) {
            }

            public Builder clearAdData() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearAdDataVersion() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearError() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearError();
                return this;
            }

            public Builder clearImpressionConfiguration() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearImpressionConfiguration();
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            public Builder clearTrackingToken() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearTrackingToken();
                return this;
            }

            public Builder clearWebviewConfiguration() {
                this.copyOnWrite();
                ((AdResponse)this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public ByteString getAdData() {
                return ((AdResponse)this.instance).getAdData();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdResponse)this.instance).getAdDataRefreshToken();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public int getAdDataVersion() {
                return ((AdResponse)this.instance).getAdDataVersion();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public Error getError() {
                return ((AdResponse)this.instance).getError();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public ByteString getImpressionConfiguration() {
                return ((AdResponse)this.instance).getImpressionConfiguration();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((AdResponse)this.instance).getImpressionConfigurationVersion();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdResponse)this.instance).getTrackingToken();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public WebViewConfiguration getWebviewConfiguration() {
                return ((AdResponse)this.instance).getWebviewConfiguration();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public boolean hasError() {
                return ((AdResponse)this.instance).hasError();
            }

            @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((AdResponse)this.instance).hasWebviewConfiguration();
            }

            public Builder mergeError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).mergeError(errorOuterClass$Error0);
                return this;
            }

            public Builder mergeWebviewConfiguration(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).mergeWebviewConfiguration(webviewConfiguration$WebViewConfiguration0);
                return this;
            }

            public Builder setAdData(ByteString byteString0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setAdData(byteString0);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setAdDataRefreshToken(byteString0);
                return this;
            }

            public Builder setAdDataVersion(int v) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setAdDataVersion(v);
                return this;
            }

            public Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder errorOuterClass$Error$Builder0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setError(((Error)errorOuterClass$Error$Builder0.build()));
                return this;
            }

            public Builder setError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setError(errorOuterClass$Error0);
                return this;
            }

            public Builder setImpressionConfiguration(ByteString byteString0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setImpressionConfiguration(byteString0);
                return this;
            }

            public Builder setImpressionConfigurationVersion(int v) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setImpressionConfigurationVersion(v);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setTrackingToken(byteString0);
                return this;
            }

            public Builder setWebviewConfiguration(gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration.Builder webviewConfiguration$WebViewConfiguration$Builder0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setWebviewConfiguration(((WebViewConfiguration)webviewConfiguration$WebViewConfiguration$Builder0.build()));
                return this;
            }

            public Builder setWebviewConfiguration(WebViewConfiguration webviewConfiguration$WebViewConfiguration0) {
                this.copyOnWrite();
                ((AdResponse)this.instance).setWebviewConfiguration(webviewConfiguration$WebViewConfiguration0);
                return this;
            }
        }

        public static final int AD_DATA_FIELD_NUMBER = 6;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
        private static final AdResponse DEFAULT_INSTANCE = null;
        public static final int ERROR_FIELD_NUMBER = 8;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private Error error_;
        private int impressionConfigurationVersion_;
        private ByteString impressionConfiguration_;
        private ByteString trackingToken_;
        private WebViewConfiguration webviewConfiguration_;

        static {
            AdResponse adResponseOuterClass$AdResponse0 = new AdResponse();
            AdResponse.DEFAULT_INSTANCE = adResponseOuterClass$AdResponse0;
            GeneratedMessageLite.registerDefaultInstance(AdResponse.class, adResponseOuterClass$AdResponse0);
        }

        private AdResponse() {
            this.trackingToken_ = ByteString.EMPTY;
            this.impressionConfiguration_ = ByteString.EMPTY;
            this.adDataRefreshToken_ = ByteString.EMPTY;
            this.adData_ = ByteString.EMPTY;
        }

        private void clearAdData() {
            this.adData_ = AdResponse.getDefaultInstance().getAdData();
        }

        private void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = AdResponse.getDefaultInstance().getAdDataRefreshToken();
        }

        private void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        private void clearImpressionConfiguration() {
            this.impressionConfiguration_ = AdResponse.getDefaultInstance().getImpressionConfiguration();
        }

        private void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = AdResponse.getDefaultInstance().getTrackingToken();
        }

        private void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdResponse();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdResponse.DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_"});
                }
                case 4: {
                    return AdResponse.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdResponse.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdResponse.class;
                        synchronized(class0) {
                            parser0 = AdResponse.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdResponse.DEFAULT_INSTANCE);
                                AdResponse.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        public static AdResponse getDefaultInstance() {
            return AdResponse.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public Error getError() {
            return this.error_ == null ? Error.getDefaultInstance() : this.error_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public WebViewConfiguration getWebviewConfiguration() {
            return this.webviewConfiguration_ == null ? WebViewConfiguration.getDefaultInstance() : this.webviewConfiguration_;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
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
            return (Builder)AdResponse.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdResponse adResponseOuterClass$AdResponse0) {
            return (Builder)AdResponse.DEFAULT_INSTANCE.createBuilder(adResponseOuterClass$AdResponse0);
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdResponse)GeneratedMessageLite.parseDelimitedFrom(AdResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdResponse)GeneratedMessageLite.parseDelimitedFrom(AdResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdResponse parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, byteString0);
        }

        public static AdResponse parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdResponse parseFrom(InputStream inputStream0) throws IOException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdResponse parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdResponse parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, arr_b);
        }

        public static AdResponse parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdResponse)GeneratedMessageLite.parseFrom(AdResponse.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdResponse.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdData(ByteString byteString0) {
            byteString0.getClass();
            this.adData_ = byteString0;
        }

        private void setAdDataRefreshToken(ByteString byteString0) {
            byteString0.getClass();
            this.adDataRefreshToken_ = byteString0;
        }

        private void setAdDataVersion(int v) {
            this.adDataVersion_ = v;
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

    public interface AdResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

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

