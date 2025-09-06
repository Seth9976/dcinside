package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

public final class AdRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder adRequestOuterClass$AdRequest$Builder0) {
                L.p(adRequestOuterClass$AdRequest$Builder0, "builder");
                return new Dsl(adRequestOuterClass$AdRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder adRequestOuterClass$AdRequest$Builder0) {
            this._builder = adRequestOuterClass$AdRequest$Builder0;
        }

        public Dsl(Builder adRequestOuterClass$AdRequest$Builder0, w w0) {
            this(adRequestOuterClass$AdRequest$Builder0);
        }

        @b0
        public final AdRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AdRequest)generatedMessageLite0;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        @l
        @i(name = "getAdFormat")
        public final AdFormat getAdFormat() {
            AdFormat initializationResponseOuterClass$AdFormat0 = this._builder.getAdFormat();
            L.o(initializationResponseOuterClass$AdFormat0, "_builder.getAdFormat()");
            return initializationResponseOuterClass$AdFormat0;
        }

        @i(name = "getAdFormatValue")
        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @l
        @i(name = "getAdRequestType")
        public final AdRequestType getAdRequestType() {
            AdRequestType adRequestOuterClass$AdRequestType0 = this._builder.getAdRequestType();
            L.o(adRequestOuterClass$AdRequestType0, "_builder.getAdRequestType()");
            return adRequestOuterClass$AdRequestType0;
        }

        @i(name = "getAdRequestTypeValue")
        public final int getAdRequestTypeValue() {
            return this._builder.getAdRequestTypeValue();
        }

        @l
        @i(name = "getBannerSize")
        public final BannerSize getBannerSize() {
            BannerSize adRequestOuterClass$BannerSize0 = this._builder.getBannerSize();
            L.o(adRequestOuterClass$BannerSize0, "_builder.getBannerSize()");
            return adRequestOuterClass$BannerSize0;
        }

        @m
        public final BannerSize getBannerSizeOrNull(@l Dsl adRequestKt$Dsl0) {
            L.p(adRequestKt$Dsl0, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(adRequestKt$Dsl0._builder);
        }

        @l
        @i(name = "getCampaignState")
        public final CampaignState getCampaignState() {
            CampaignState campaignStateOuterClass$CampaignState0 = this._builder.getCampaignState();
            L.o(campaignStateOuterClass$CampaignState0, "_builder.getCampaignState()");
            return campaignStateOuterClass$CampaignState0;
        }

        @l
        @i(name = "getDynamicDeviceInfo")
        public final DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = this._builder.getDynamicDeviceInfo();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
        }

        @l
        @i(name = "getImpressionOpportunityId")
        public final ByteString getImpressionOpportunityId() {
            ByteString byteString0 = this._builder.getImpressionOpportunityId();
            L.o(byteString0, "_builder.getImpressionOpportunityId()");
            return byteString0;
        }

        @l
        @i(name = "getPlacementId")
        public final String getPlacementId() {
            String s = this._builder.getPlacementId();
            L.o(s, "_builder.getPlacementId()");
            return s;
        }

        @i(name = "getRequestImpressionConfiguration")
        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        @l
        @i(name = "getScarSignal")
        public final ByteString getScarSignal() {
            ByteString byteString0 = this._builder.getScarSignal();
            L.o(byteString0, "_builder.getScarSignal()");
            return byteString0;
        }

        @l
        @i(name = "getSessionCounters")
        public final SessionCounters getSessionCounters() {
            SessionCounters sessionCountersOuterClass$SessionCounters0 = this._builder.getSessionCounters();
            L.o(sessionCountersOuterClass$SessionCounters0, "_builder.getSessionCounters()");
            return sessionCountersOuterClass$SessionCounters0;
        }

        @l
        @i(name = "getStaticDeviceInfo")
        public final StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0 = this._builder.getStaticDeviceInfo();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo0, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo0;
        }

        @l
        @i(name = "getTcf")
        public final ByteString getTcf() {
            ByteString byteString0 = this._builder.getTcf();
            L.o(byteString0, "_builder.getTcf()");
            return byteString0;
        }

        @i(name = "getWebviewVersion")
        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        @i(name = "setAdFormat")
        public final void setAdFormat(@l AdFormat initializationResponseOuterClass$AdFormat0) {
            L.p(initializationResponseOuterClass$AdFormat0, "value");
            this._builder.setAdFormat(initializationResponseOuterClass$AdFormat0);
        }

        @i(name = "setAdFormatValue")
        public final void setAdFormatValue(int v) {
            this._builder.setAdFormatValue(v);
        }

        @i(name = "setAdRequestType")
        public final void setAdRequestType(@l AdRequestType adRequestOuterClass$AdRequestType0) {
            L.p(adRequestOuterClass$AdRequestType0, "value");
            this._builder.setAdRequestType(adRequestOuterClass$AdRequestType0);
        }

        @i(name = "setAdRequestTypeValue")
        public final void setAdRequestTypeValue(int v) {
            this._builder.setAdRequestTypeValue(v);
        }

        @i(name = "setBannerSize")
        public final void setBannerSize(@l BannerSize adRequestOuterClass$BannerSize0) {
            L.p(adRequestOuterClass$BannerSize0, "value");
            this._builder.setBannerSize(adRequestOuterClass$BannerSize0);
        }

        @i(name = "setCampaignState")
        public final void setCampaignState(@l CampaignState campaignStateOuterClass$CampaignState0) {
            L.p(campaignStateOuterClass$CampaignState0, "value");
            this._builder.setCampaignState(campaignStateOuterClass$CampaignState0);
        }

        @i(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@l DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "value");
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
        }

        @i(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setImpressionOpportunityId(byteString0);
        }

        @i(name = "setPlacementId")
        public final void setPlacementId(@l String s) {
            L.p(s, "value");
            this._builder.setPlacementId(s);
        }

        @i(name = "setRequestImpressionConfiguration")
        public final void setRequestImpressionConfiguration(boolean z) {
            this._builder.setRequestImpressionConfiguration(z);
        }

        @i(name = "setScarSignal")
        public final void setScarSignal(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setScarSignal(byteString0);
        }

        @i(name = "setSessionCounters")
        public final void setSessionCounters(@l SessionCounters sessionCountersOuterClass$SessionCounters0) {
            L.p(sessionCountersOuterClass$SessionCounters0, "value");
            this._builder.setSessionCounters(sessionCountersOuterClass$SessionCounters0);
        }

        @i(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@l StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            L.p(staticDeviceInfoOuterClass$StaticDeviceInfo0, "value");
            this._builder.setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
        }

        @i(name = "setTcf")
        public final void setTcf(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setTcf(byteString0);
        }

        @i(name = "setWebviewVersion")
        public final void setWebviewVersion(int v) {
            this._builder.setWebviewVersion(v);
        }
    }

    @l
    public static final AdRequestKt INSTANCE;

    static {
        AdRequestKt.INSTANCE = new AdRequestKt();
    }
}

