package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
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

public final class AdPlayerConfigRequestOuterClass {
    public static final class AdPlayerConfigRequest extends GeneratedMessageLite implements AdPlayerConfigRequestOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdPlayerConfigRequestOrBuilder {
            private Builder() {
                super(AdPlayerConfigRequest.DEFAULT_INSTANCE);
            }

            Builder(a adPlayerConfigRequestOuterClass$a0) {
            }

            public Builder clearAdFormat() {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).clearAdFormat();
                return this;
            }

            public Builder clearConfigurationToken() {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).clearConfigurationToken();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearPlacementId() {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).clearPlacementId();
                return this;
            }

            public Builder clearWebviewVersion() {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).clearWebviewVersion();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public AdFormat getAdFormat() {
                return ((AdPlayerConfigRequest)this.instance).getAdFormat();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public int getAdFormatValue() {
                return ((AdPlayerConfigRequest)this.instance).getAdFormatValue();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public ByteString getConfigurationToken() {
                return ((AdPlayerConfigRequest)this.instance).getConfigurationToken();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((AdPlayerConfigRequest)this.instance).getImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public String getPlacementId() {
                return ((AdPlayerConfigRequest)this.instance).getPlacementId();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((AdPlayerConfigRequest)this.instance).getPlacementIdBytes();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public int getWebviewVersion() {
                return ((AdPlayerConfigRequest)this.instance).getWebviewVersion();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public boolean hasAdFormat() {
                return ((AdPlayerConfigRequest)this.instance).hasAdFormat();
            }

            @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((AdPlayerConfigRequest)this.instance).hasWebviewVersion();
            }

            public Builder setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setAdFormat(initializationResponseOuterClass$AdFormat0);
                return this;
            }

            public Builder setAdFormatValue(int v) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setAdFormatValue(v);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setConfigurationToken(byteString0);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString0) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setImpressionOpportunityId(byteString0);
                return this;
            }

            public Builder setPlacementId(String s) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setPlacementId(s);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setPlacementIdBytes(byteString0);
                return this;
            }

            public Builder setWebviewVersion(int v) {
                this.copyOnWrite();
                ((AdPlayerConfigRequest)this.instance).setWebviewVersion(v);
                return this;
            }
        }

        public static final int AD_FORMAT_FIELD_NUMBER = 5;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 1;
        private static final AdPlayerConfigRequest DEFAULT_INSTANCE = null;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int bitField0_;
        private ByteString configurationToken_;
        private ByteString impressionOpportunityId_;
        private String placementId_;
        private int webviewVersion_;

        static {
            AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0 = new AdPlayerConfigRequest();
            AdPlayerConfigRequest.DEFAULT_INSTANCE = adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigRequest.class, adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0);
        }

        private AdPlayerConfigRequest() {
            this.configurationToken_ = ByteString.EMPTY;
            this.placementId_ = "";
            this.impressionOpportunityId_ = ByteString.EMPTY;
        }

        private void clearAdFormat() {
            this.bitField0_ &= -3;
            this.adFormat_ = 0;
        }

        private void clearConfigurationToken() {
            this.configurationToken_ = AdPlayerConfigRequest.getDefaultInstance().getConfigurationToken();
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = AdPlayerConfigRequest.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearPlacementId() {
            this.placementId_ = AdPlayerConfigRequest.getDefaultInstance().getPlacementId();
        }

        private void clearWebviewVersion() {
            this.bitField0_ &= -2;
            this.webviewVersion_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdPlayerConfigRequest();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdPlayerConfigRequest.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0004\n\u0005ဌ\u0001\tင\u0000", new Object[]{"bitField0_", "configurationToken_", "placementId_", "impressionOpportunityId_", "adFormat_", "webviewVersion_"});
                }
                case 4: {
                    return AdPlayerConfigRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdPlayerConfigRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdPlayerConfigRequest.class;
                        synchronized(class0) {
                            parser0 = AdPlayerConfigRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdPlayerConfigRequest.DEFAULT_INSTANCE);
                                AdPlayerConfigRequest.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public AdFormat getAdFormat() {
            AdFormat initializationResponseOuterClass$AdFormat0 = AdFormat.forNumber(this.adFormat_);
            return initializationResponseOuterClass$AdFormat0 == null ? AdFormat.UNRECOGNIZED : initializationResponseOuterClass$AdFormat0;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        public static AdPlayerConfigRequest getDefaultInstance() {
            return AdPlayerConfigRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder
        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)AdPlayerConfigRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0) {
            return (Builder)AdPlayerConfigRequest.DEFAULT_INSTANCE.createBuilder(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0);
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseDelimitedFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseDelimitedFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream0) throws IOException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest)GeneratedMessageLite.parseFrom(AdPlayerConfigRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdPlayerConfigRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
            this.adFormat_ = initializationResponseOuterClass$AdFormat0.getNumber();
            this.bitField0_ |= 2;
        }

        private void setAdFormatValue(int v) {
            this.bitField0_ |= 2;
            this.adFormat_ = v;
        }

        private void setConfigurationToken(ByteString byteString0) {
            byteString0.getClass();
            this.configurationToken_ = byteString0;
        }

        private void setImpressionOpportunityId(ByteString byteString0) {
            byteString0.getClass();
            this.impressionOpportunityId_ = byteString0;
        }

        private void setPlacementId(String s) {
            s.getClass();
            this.placementId_ = s;
        }

        private void setPlacementIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementId_ = byteString0.toStringUtf8();
        }

        private void setWebviewVersion(int v) {
            this.bitField0_ |= 1;
            this.webviewVersion_ = v;
        }
    }

    public interface AdPlayerConfigRequestOrBuilder extends MessageLiteOrBuilder {
        AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getConfigurationToken();

        ByteString getImpressionOpportunityId();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasWebviewVersion();
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

