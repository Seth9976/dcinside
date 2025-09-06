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

public final class AdDataRefreshRequestOuterClass {
    public static final class AdDataRefreshRequest extends GeneratedMessageLite implements AdDataRefreshRequestOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdDataRefreshRequestOrBuilder {
            private Builder() {
                super(AdDataRefreshRequest.DEFAULT_INSTANCE);
            }

            Builder(a adDataRefreshRequestOuterClass$a0) {
            }

            public Builder clearAdDataRefreshToken() {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearCampaignState() {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).clearCampaignState();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearSessionCounters() {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdDataRefreshRequest)this.instance).getAdDataRefreshToken();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public CampaignState getCampaignState() {
                return ((AdDataRefreshRequest)this.instance).getCampaignState();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AdDataRefreshRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((AdDataRefreshRequest)this.instance).getImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public SessionCounters getSessionCounters() {
                return ((AdDataRefreshRequest)this.instance).getSessionCounters();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public StaticDeviceInfo getStaticDeviceInfo() {
                return ((AdDataRefreshRequest)this.instance).getStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public boolean hasCampaignState() {
                return ((AdDataRefreshRequest)this.instance).hasCampaignState();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((AdDataRefreshRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((AdDataRefreshRequest)this.instance).hasSessionCounters();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((AdDataRefreshRequest)this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).mergeCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).mergeSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setAdDataRefreshToken(byteString0);
                return this;
            }

            public Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder campaignStateOuterClass$CampaignState$Builder0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setCampaignState(((CampaignState)campaignStateOuterClass$CampaignState$Builder0.build()));
                return this;
            }

            public Builder setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setDynamicDeviceInfo(((DynamicDeviceInfo)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setImpressionOpportunityId(byteString0);
                return this;
            }

            public Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder sessionCountersOuterClass$SessionCounters$Builder0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setSessionCounters(((SessionCounters)sessionCountersOuterClass$SessionCounters$Builder0.build()));
                return this;
            }

            public Builder setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setStaticDeviceInfo(((StaticDeviceInfo)staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((AdDataRefreshRequest)this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }
        }

        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 6;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final AdDataRefreshRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private ByteString adDataRefreshToken_;
        private int bitField0_;
        private CampaignState campaignState_;
        private DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString impressionOpportunityId_;
        private SessionCounters sessionCounters_;
        private StaticDeviceInfo staticDeviceInfo_;

        static {
            AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0 = new AdDataRefreshRequest();
            AdDataRefreshRequest.DEFAULT_INSTANCE = adDataRefreshRequestOuterClass$AdDataRefreshRequest0;
            GeneratedMessageLite.registerDefaultInstance(AdDataRefreshRequest.class, adDataRefreshRequestOuterClass$AdDataRefreshRequest0);
        }

        private AdDataRefreshRequest() {
            this.impressionOpportunityId_ = ByteString.EMPTY;
            this.adDataRefreshToken_ = ByteString.EMPTY;
        }

        private void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = AdDataRefreshRequest.getDefaultInstance().getAdDataRefreshToken();
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = AdDataRefreshRequest.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdDataRefreshRequest();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdDataRefreshRequest.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\n\u0006\n", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "adDataRefreshToken_"});
                }
                case 4: {
                    return AdDataRefreshRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdDataRefreshRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdDataRefreshRequest.class;
                        synchronized(class0) {
                            parser0 = AdDataRefreshRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdDataRefreshRequest.DEFAULT_INSTANCE);
                                AdDataRefreshRequest.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public CampaignState getCampaignState() {
            return this.campaignState_ == null ? CampaignState.getDefaultInstance() : this.campaignState_;
        }

        public static AdDataRefreshRequest getDefaultInstance() {
            return AdDataRefreshRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public DynamicDeviceInfo getDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ == null ? DynamicDeviceInfo.getDefaultInstance() : this.dynamicDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public SessionCounters getSessionCounters() {
            return this.sessionCounters_ == null ? SessionCounters.getDefaultInstance() : this.sessionCounters_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public StaticDeviceInfo getStaticDeviceInfo() {
            return this.staticDeviceInfo_ == null ? StaticDeviceInfo.getDefaultInstance() : this.staticDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public boolean hasCampaignState() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
            campaignStateOuterClass$CampaignState0.getClass();
            this.campaignState_ = this.campaignState_ == null || this.campaignState_ == CampaignState.getDefaultInstance() ? campaignStateOuterClass$CampaignState0 : ((CampaignState)((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder)CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignStateOuterClass$CampaignState0)).buildPartial());
            this.bitField0_ |= 8;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = this.dynamicDeviceInfo_ == null || this.dynamicDeviceInfo_ == DynamicDeviceInfo.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 : ((DynamicDeviceInfo)((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = this.sessionCounters_ == null || this.sessionCounters_ == SessionCounters.getDefaultInstance() ? sessionCountersOuterClass$SessionCounters0 : ((SessionCounters)((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCountersOuterClass$SessionCounters0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = this.staticDeviceInfo_ == null || this.staticDeviceInfo_ == StaticDeviceInfo.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo0 : ((StaticDeviceInfo)((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder)AdDataRefreshRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0) {
            return (Builder)AdDataRefreshRequest.DEFAULT_INSTANCE.createBuilder(adDataRefreshRequestOuterClass$AdDataRefreshRequest0);
        }

        public static AdDataRefreshRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseDelimitedFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdDataRefreshRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseDelimitedFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdDataRefreshRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static AdDataRefreshRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdDataRefreshRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdDataRefreshRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdDataRefreshRequest parseFrom(InputStream inputStream0) throws IOException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdDataRefreshRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdDataRefreshRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdDataRefreshRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdDataRefreshRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static AdDataRefreshRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest)GeneratedMessageLite.parseFrom(AdDataRefreshRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdDataRefreshRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdDataRefreshToken(ByteString byteString0) {
            byteString0.getClass();
            this.adDataRefreshToken_ = byteString0;
        }

        private void setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
            campaignStateOuterClass$CampaignState0.getClass();
            this.campaignState_ = campaignStateOuterClass$CampaignState0;
            this.bitField0_ |= 8;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
            this.bitField0_ |= 4;
        }

        private void setImpressionOpportunityId(ByteString byteString0) {
            byteString0.getClass();
            this.impressionOpportunityId_ = byteString0;
        }

        private void setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = sessionCountersOuterClass$SessionCounters0;
            this.bitField0_ |= 1;
        }

        private void setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            this.bitField0_ |= 2;
        }
    }

    public interface AdDataRefreshRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdDataRefreshToken();

        CampaignState getCampaignState();

        DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getImpressionOpportunityId();

        SessionCounters getSessionCounters();

        StaticDeviceInfo getStaticDeviceInfo();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
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

