package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class AdDataRefreshRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0) {
                L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0, "builder");
                return new Dsl(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0) {
            this._builder = adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0;
        }

        public Dsl(Builder adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0, w w0) {
            this(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0);
        }

        @b0
        public final AdDataRefreshRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (AdDataRefreshRequest)generatedMessageLite0;
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
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

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        @l
        @i(name = "getAdDataRefreshToken")
        public final ByteString getAdDataRefreshToken() {
            ByteString byteString0 = this._builder.getAdDataRefreshToken();
            L.o(byteString0, "_builder.getAdDataRefreshToken()");
            return byteString0;
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

        @i(name = "setAdDataRefreshToken")
        public final void setAdDataRefreshToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAdDataRefreshToken(byteString0);
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
    }

    @l
    public static final AdDataRefreshRequestKt INSTANCE;

    static {
        AdDataRefreshRequestKt.INSTANCE = new AdDataRefreshRequestKt();
    }
}

