package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AdRequestOuterClass {
    public static final class AdRequest extends GeneratedMessageLite implements AdRequestOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdRequestOrBuilder {
            private Builder() {
                super(AdRequest.DEFAULT_INSTANCE);
            }

            Builder(a adRequestOuterClass$a0) {
            }

            public Builder clearAdFormat() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearAdFormat();
                return this;
            }

            public Builder clearAdRequestType() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearAdRequestType();
                return this;
            }

            public Builder clearBannerSize() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearBannerSize();
                return this;
            }

            public Builder clearCampaignState() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearCampaignState();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearPlacementId() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearPlacementId();
                return this;
            }

            public Builder clearRequestImpressionConfiguration() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearRequestImpressionConfiguration();
                return this;
            }

            public Builder clearScarSignal() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearScarSignal();
                return this;
            }

            public Builder clearSessionCounters() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            public Builder clearTcf() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearTcf();
                return this;
            }

            public Builder clearWebviewVersion() {
                this.copyOnWrite();
                ((AdRequest)this.instance).clearWebviewVersion();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public AdFormat getAdFormat() {
                return ((AdRequest)this.instance).getAdFormat();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public int getAdFormatValue() {
                return ((AdRequest)this.instance).getAdFormatValue();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public AdRequestType getAdRequestType() {
                return ((AdRequest)this.instance).getAdRequestType();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public int getAdRequestTypeValue() {
                return ((AdRequest)this.instance).getAdRequestTypeValue();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public BannerSize getBannerSize() {
                return ((AdRequest)this.instance).getBannerSize();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public CampaignState getCampaignState() {
                return ((AdRequest)this.instance).getCampaignState();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AdRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((AdRequest)this.instance).getImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public String getPlacementId() {
                return ((AdRequest)this.instance).getPlacementId();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((AdRequest)this.instance).getPlacementIdBytes();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean getRequestImpressionConfiguration() {
                return ((AdRequest)this.instance).getRequestImpressionConfiguration();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public ByteString getScarSignal() {
                return ((AdRequest)this.instance).getScarSignal();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public SessionCounters getSessionCounters() {
                return ((AdRequest)this.instance).getSessionCounters();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public StaticDeviceInfo getStaticDeviceInfo() {
                return ((AdRequest)this.instance).getStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public ByteString getTcf() {
                return ((AdRequest)this.instance).getTcf();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public int getWebviewVersion() {
                return ((AdRequest)this.instance).getWebviewVersion();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasAdFormat() {
                return ((AdRequest)this.instance).hasAdFormat();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasAdRequestType() {
                return ((AdRequest)this.instance).hasAdRequestType();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasBannerSize() {
                return ((AdRequest)this.instance).hasBannerSize();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasCampaignState() {
                return ((AdRequest)this.instance).hasCampaignState();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((AdRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((AdRequest)this.instance).hasSessionCounters();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((AdRequest)this.instance).hasStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasTcf() {
                return ((AdRequest)this.instance).hasTcf();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((AdRequest)this.instance).hasWebviewVersion();
            }

            public Builder mergeBannerSize(BannerSize adRequestOuterClass$BannerSize0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).mergeBannerSize(adRequestOuterClass$BannerSize0);
                return this;
            }

            public Builder mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).mergeCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).mergeSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public Builder setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setAdFormat(initializationResponseOuterClass$AdFormat0);
                return this;
            }

            public Builder setAdFormatValue(int v) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setAdFormatValue(v);
                return this;
            }

            public Builder setAdRequestType(AdRequestType adRequestOuterClass$AdRequestType0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setAdRequestType(adRequestOuterClass$AdRequestType0);
                return this;
            }

            public Builder setAdRequestTypeValue(int v) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setAdRequestTypeValue(v);
                return this;
            }

            public Builder setBannerSize(gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder adRequestOuterClass$BannerSize$Builder0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setBannerSize(((BannerSize)adRequestOuterClass$BannerSize$Builder0.build()));
                return this;
            }

            public Builder setBannerSize(BannerSize adRequestOuterClass$BannerSize0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setBannerSize(adRequestOuterClass$BannerSize0);
                return this;
            }

            public Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder campaignStateOuterClass$CampaignState$Builder0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setCampaignState(((CampaignState)campaignStateOuterClass$CampaignState$Builder0.build()));
                return this;
            }

            public Builder setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setDynamicDeviceInfo(((DynamicDeviceInfo)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setImpressionOpportunityId(byteString0);
                return this;
            }

            public Builder setPlacementId(String s) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setPlacementId(s);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setPlacementIdBytes(byteString0);
                return this;
            }

            public Builder setRequestImpressionConfiguration(boolean z) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setRequestImpressionConfiguration(z);
                return this;
            }

            public Builder setScarSignal(ByteString byteString0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setScarSignal(byteString0);
                return this;
            }

            public Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder sessionCountersOuterClass$SessionCounters$Builder0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setSessionCounters(((SessionCounters)sessionCountersOuterClass$SessionCounters$Builder0.build()));
                return this;
            }

            public Builder setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setStaticDeviceInfo(((StaticDeviceInfo)staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public Builder setTcf(ByteString byteString0) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setTcf(byteString0);
                return this;
            }

            public Builder setWebviewVersion(int v) {
                this.copyOnWrite();
                ((AdRequest)this.instance).setWebviewVersion(v);
                return this;
            }
        }

        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_REQUEST_TYPE_FIELD_NUMBER = 11;
        public static final int BANNER_SIZE_FIELD_NUMBER = 12;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final AdRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 6;
        public static final int REQUEST_IMPRESSION_CONFIGURATION_FIELD_NUMBER = 7;
        public static final int SCAR_SIGNAL_FIELD_NUMBER = 8;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int TCF_FIELD_NUMBER = 10;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int adRequestType_;
        private BannerSize bannerSize_;
        private int bitField0_;
        private CampaignState campaignState_;
        private DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString impressionOpportunityId_;
        private String placementId_;
        private boolean requestImpressionConfiguration_;
        private ByteString scarSignal_;
        private SessionCounters sessionCounters_;
        private StaticDeviceInfo staticDeviceInfo_;
        private ByteString tcf_;
        private int webviewVersion_;

        static {
            AdRequest adRequestOuterClass$AdRequest0 = new AdRequest();
            AdRequest.DEFAULT_INSTANCE = adRequestOuterClass$AdRequest0;
            GeneratedMessageLite.registerDefaultInstance(AdRequest.class, adRequestOuterClass$AdRequest0);
        }

        private AdRequest() {
            this.impressionOpportunityId_ = ByteString.EMPTY;
            this.placementId_ = "";
            this.scarSignal_ = ByteString.EMPTY;
            this.tcf_ = ByteString.EMPTY;
        }

        private void clearAdFormat() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.adFormat_ = 0;
        }

        private void clearAdRequestType() {
            this.bitField0_ &= -65;
            this.adRequestType_ = 0;
        }

        private void clearBannerSize() {
            this.bannerSize_ = null;
            this.bitField0_ &= 0xFFFFFF7F;
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
            this.impressionOpportunityId_ = AdRequest.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearPlacementId() {
            this.placementId_ = AdRequest.getDefaultInstance().getPlacementId();
        }

        private void clearRequestImpressionConfiguration() {
            this.requestImpressionConfiguration_ = false;
        }

        private void clearScarSignal() {
            this.scarSignal_ = AdRequest.getDefaultInstance().getScarSignal();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTcf() {
            this.bitField0_ &= -33;
            this.tcf_ = AdRequest.getDefaultInstance().getTcf();
        }

        private void clearWebviewVersion() {
            this.bitField0_ &= -17;
            this.webviewVersion_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdRequest();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdRequest.DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\n\u0006Ȉ\u0007\u0007\b\n\tင\u0004\nည\u0005\u000Bဌ\u0006\fဉ\u0007\rဌ\b", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "placementId_", "requestImpressionConfiguration_", "scarSignal_", "webviewVersion_", "tcf_", "adRequestType_", "bannerSize_", "adFormat_"});
                }
                case 4: {
                    return AdRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdRequest.class;
                        synchronized(class0) {
                            parser0 = AdRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdRequest.DEFAULT_INSTANCE);
                                AdRequest.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public AdFormat getAdFormat() {
            AdFormat initializationResponseOuterClass$AdFormat0 = AdFormat.forNumber(this.adFormat_);
            return initializationResponseOuterClass$AdFormat0 == null ? AdFormat.UNRECOGNIZED : initializationResponseOuterClass$AdFormat0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public AdRequestType getAdRequestType() {
            AdRequestType adRequestOuterClass$AdRequestType0 = AdRequestType.forNumber(this.adRequestType_);
            return adRequestOuterClass$AdRequestType0 == null ? AdRequestType.UNRECOGNIZED : adRequestOuterClass$AdRequestType0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public int getAdRequestTypeValue() {
            return this.adRequestType_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public BannerSize getBannerSize() {
            return this.bannerSize_ == null ? BannerSize.getDefaultInstance() : this.bannerSize_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public CampaignState getCampaignState() {
            return this.campaignState_ == null ? CampaignState.getDefaultInstance() : this.campaignState_;
        }

        public static AdRequest getDefaultInstance() {
            return AdRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public DynamicDeviceInfo getDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ == null ? DynamicDeviceInfo.getDefaultInstance() : this.dynamicDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean getRequestImpressionConfiguration() {
            return this.requestImpressionConfiguration_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public ByteString getScarSignal() {
            return this.scarSignal_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public SessionCounters getSessionCounters() {
            return this.sessionCounters_ == null ? SessionCounters.getDefaultInstance() : this.sessionCounters_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public StaticDeviceInfo getStaticDeviceInfo() {
            return this.staticDeviceInfo_ == null ? StaticDeviceInfo.getDefaultInstance() : this.staticDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public ByteString getTcf() {
            return this.tcf_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasAdRequestType() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasBannerSize() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasCampaignState() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasTcf() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$AdRequestOrBuilder
        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        private void mergeBannerSize(BannerSize adRequestOuterClass$BannerSize0) {
            adRequestOuterClass$BannerSize0.getClass();
            this.bannerSize_ = this.bannerSize_ == null || this.bannerSize_ == BannerSize.getDefaultInstance() ? adRequestOuterClass$BannerSize0 : ((BannerSize)((gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder)BannerSize.newBuilder(this.bannerSize_).mergeFrom(adRequestOuterClass$BannerSize0)).buildPartial());
            this.bitField0_ |= 0x80;
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
            return (Builder)AdRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdRequest adRequestOuterClass$AdRequest0) {
            return (Builder)AdRequest.DEFAULT_INSTANCE.createBuilder(adRequestOuterClass$AdRequest0);
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdRequest)GeneratedMessageLite.parseDelimitedFrom(AdRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdRequest)GeneratedMessageLite.parseDelimitedFrom(AdRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static AdRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdRequest parseFrom(InputStream inputStream0) throws IOException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static AdRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdRequest)GeneratedMessageLite.parseFrom(AdRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
            this.adFormat_ = initializationResponseOuterClass$AdFormat0.getNumber();
            this.bitField0_ |= 0x100;
        }

        private void setAdFormatValue(int v) {
            this.bitField0_ |= 0x100;
            this.adFormat_ = v;
        }

        private void setAdRequestType(AdRequestType adRequestOuterClass$AdRequestType0) {
            this.adRequestType_ = adRequestOuterClass$AdRequestType0.getNumber();
            this.bitField0_ |= 0x40;
        }

        private void setAdRequestTypeValue(int v) {
            this.bitField0_ |= 0x40;
            this.adRequestType_ = v;
        }

        private void setBannerSize(BannerSize adRequestOuterClass$BannerSize0) {
            adRequestOuterClass$BannerSize0.getClass();
            this.bannerSize_ = adRequestOuterClass$BannerSize0;
            this.bitField0_ |= 0x80;
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

        private void setPlacementId(String s) {
            s.getClass();
            this.placementId_ = s;
        }

        private void setPlacementIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementId_ = byteString0.toStringUtf8();
        }

        private void setRequestImpressionConfiguration(boolean z) {
            this.requestImpressionConfiguration_ = z;
        }

        private void setScarSignal(ByteString byteString0) {
            byteString0.getClass();
            this.scarSignal_ = byteString0;
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

        private void setTcf(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 0x20;
            this.tcf_ = byteString0;
        }

        private void setWebviewVersion(int v) {
            this.bitField0_ |= 16;
            this.webviewVersion_ = v;
        }
    }

    public interface AdRequestOrBuilder extends MessageLiteOrBuilder {
        AdFormat getAdFormat();

        int getAdFormatValue();

        AdRequestType getAdRequestType();

        int getAdRequestTypeValue();

        BannerSize getBannerSize();

        CampaignState getCampaignState();

        DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getImpressionOpportunityId();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        boolean getRequestImpressionConfiguration();

        ByteString getScarSignal();

        SessionCounters getSessionCounters();

        StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasAdRequestType();

        boolean hasBannerSize();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasWebviewVersion();
    }

    public static enum AdRequestType implements EnumLite {
        class gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.a implements EnumLiteMap {
            gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.a() {
                super();
            }

            public AdRequestType a(int v) {
                return AdRequestType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                b.a = new b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return AdRequestType.forNumber(v) != null;
            }
        }

        AD_REQUEST_TYPE_UNSPECIFIED(0),
        AD_REQUEST_TYPE_FULLSCREEN(1),
        AD_REQUEST_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int AD_REQUEST_TYPE_BANNER_VALUE = 2;
        public static final int AD_REQUEST_TYPE_FULLSCREEN_VALUE = 1;
        public static final int AD_REQUEST_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static AdRequestType[] $values() [...] // Inlined contents

        static {
            AdRequestType.internalValueMap = new gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.a();
        }

        private AdRequestType(int v1) {
            this.value = v1;
        }

        public static AdRequestType forNumber(int v) {
            switch(v) {
                case 0: {
                    return AdRequestType.AD_REQUEST_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return AdRequestType.AD_REQUEST_TYPE_FULLSCREEN;
                }
                case 2: {
                    return AdRequestType.AD_REQUEST_TYPE_BANNER;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == AdRequestType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return AdRequestType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static AdRequestType valueOf(int v) {
            return AdRequestType.forNumber(v);
        }
    }

    public static final class BannerSize extends GeneratedMessageLite implements BannerSizeOrBuilder {
        public static final class gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements BannerSizeOrBuilder {
            private gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder() {
                super(BannerSize.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder(a adRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder clearHeight() {
                this.copyOnWrite();
                ((BannerSize)this.instance).clearHeight();
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder clearWidth() {
                this.copyOnWrite();
                ((BannerSize)this.instance).clearWidth();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$BannerSizeOrBuilder
            public int getHeight() {
                return ((BannerSize)this.instance).getHeight();
            }

            @Override  // gatewayprotocol.v1.AdRequestOuterClass$BannerSizeOrBuilder
            public int getWidth() {
                return ((BannerSize)this.instance).getWidth();
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder setHeight(int v) {
                this.copyOnWrite();
                ((BannerSize)this.instance).setHeight(v);
                return this;
            }

            public gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder setWidth(int v) {
                this.copyOnWrite();
                ((BannerSize)this.instance).setWidth(v);
                return this;
            }
        }

        private static final BannerSize DEFAULT_INSTANCE = null;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        static {
            BannerSize adRequestOuterClass$BannerSize0 = new BannerSize();
            BannerSize.DEFAULT_INSTANCE = adRequestOuterClass$BannerSize0;
            GeneratedMessageLite.registerDefaultInstance(BannerSize.class, adRequestOuterClass$BannerSize0);
        }

        private void clearHeight() {
            this.height_ = 0;
        }

        private void clearWidth() {
            this.width_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new BannerSize();
                }
                case 2: {
                    return new gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(BannerSize.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
                }
                case 4: {
                    return BannerSize.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = BannerSize.PARSER;
                    if(parser0 == null) {
                        Class class0 = BannerSize.class;
                        synchronized(class0) {
                            parser0 = BannerSize.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(BannerSize.DEFAULT_INSTANCE);
                                BannerSize.PARSER = parser0;
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

        public static BannerSize getDefaultInstance() {
            return BannerSize.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$BannerSizeOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override  // gatewayprotocol.v1.AdRequestOuterClass$BannerSizeOrBuilder
        public int getWidth() {
            return this.width_;
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder newBuilder() {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder)BannerSize.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder newBuilder(BannerSize adRequestOuterClass$BannerSize0) {
            return (gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder)BannerSize.DEFAULT_INSTANCE.createBuilder(adRequestOuterClass$BannerSize0);
        }

        public static BannerSize parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (BannerSize)GeneratedMessageLite.parseDelimitedFrom(BannerSize.DEFAULT_INSTANCE, inputStream0);
        }

        public static BannerSize parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (BannerSize)GeneratedMessageLite.parseDelimitedFrom(BannerSize.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static BannerSize parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, byteString0);
        }

        public static BannerSize parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static BannerSize parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static BannerSize parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static BannerSize parseFrom(InputStream inputStream0) throws IOException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, inputStream0);
        }

        public static BannerSize parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static BannerSize parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static BannerSize parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static BannerSize parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, arr_b);
        }

        public static BannerSize parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (BannerSize)GeneratedMessageLite.parseFrom(BannerSize.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return BannerSize.DEFAULT_INSTANCE.getParserForType();
        }

        private void setHeight(int v) {
            this.height_ = v;
        }

        private void setWidth(int v) {
            this.width_ = v;
        }
    }

    public interface BannerSizeOrBuilder extends MessageLiteOrBuilder {
        int getHeight();

        int getWidth();
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

