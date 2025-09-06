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

public final class HeaderBiddingTokenKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0) {
                L.p(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0, "builder");
                return new Dsl(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0) {
            this._builder = headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0;
        }

        public Dsl(Builder headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0, w w0) {
            this(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0);
        }

        @b0
        public final HeaderBiddingToken _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (HeaderBiddingToken)generatedMessageLite0;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
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
        @i(name = "getCampaignState")
        public final CampaignState getCampaignState() {
            CampaignState campaignStateOuterClass$CampaignState0 = this._builder.getCampaignState();
            L.o(campaignStateOuterClass$CampaignState0, "_builder.getCampaignState()");
            return campaignStateOuterClass$CampaignState0;
        }

        @l
        @i(name = "getClientInfo")
        public final ClientInfo getClientInfo() {
            ClientInfo clientInfoOuterClass$ClientInfo0 = this._builder.getClientInfo();
            L.o(clientInfoOuterClass$ClientInfo0, "_builder.getClientInfo()");
            return clientInfoOuterClass$ClientInfo0;
        }

        @l
        @i(name = "getDynamicDeviceInfo")
        public final DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = this._builder.getDynamicDeviceInfo();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
        }

        @l
        @i(name = "getInitializationData")
        public final InitializationData getInitializationData() {
            InitializationData initializationDataOuterClass$InitializationData0 = this._builder.getInitializationData();
            L.o(initializationDataOuterClass$InitializationData0, "_builder.getInitializationData()");
            return initializationDataOuterClass$InitializationData0;
        }

        @m
        public final InitializationData getInitializationDataOrNull(@l Dsl headerBiddingTokenKt$Dsl0) {
            L.p(headerBiddingTokenKt$Dsl0, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(headerBiddingTokenKt$Dsl0._builder);
        }

        @l
        @i(name = "getLimitedSessionToken")
        public final LimitedSessionToken getLimitedSessionToken() {
            LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0 = this._builder.getLimitedSessionToken();
            L.o(universalRequestOuterClass$LimitedSessionToken0, "_builder.getLimitedSessionToken()");
            return universalRequestOuterClass$LimitedSessionToken0;
        }

        @m
        public final LimitedSessionToken getLimitedSessionTokenOrNull(@l Dsl headerBiddingTokenKt$Dsl0) {
            L.p(headerBiddingTokenKt$Dsl0, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(headerBiddingTokenKt$Dsl0._builder);
        }

        @i(name = "getOfferwallEnabled")
        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        @l
        @i(name = "getPii")
        public final Pii getPii() {
            Pii piiOuterClass$Pii0 = this._builder.getPii();
            L.o(piiOuterClass$Pii0, "_builder.getPii()");
            return piiOuterClass$Pii0;
        }

        @m
        public final Pii getPiiOrNull(@l Dsl headerBiddingTokenKt$Dsl0) {
            L.p(headerBiddingTokenKt$Dsl0, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(headerBiddingTokenKt$Dsl0._builder);
        }

        @i(name = "getScarSignalsCollected")
        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        @l
        @i(name = "getSessionCounters")
        public final SessionCounters getSessionCounters() {
            SessionCounters sessionCountersOuterClass$SessionCounters0 = this._builder.getSessionCounters();
            L.o(sessionCountersOuterClass$SessionCounters0, "_builder.getSessionCounters()");
            return sessionCountersOuterClass$SessionCounters0;
        }

        @l
        @i(name = "getSessionToken")
        public final ByteString getSessionToken() {
            ByteString byteString0 = this._builder.getSessionToken();
            L.o(byteString0, "_builder.getSessionToken()");
            return byteString0;
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

        @l
        @i(name = "getTestData")
        public final TestData getTestData() {
            TestData testDataOuterClass$TestData0 = this._builder.getTestData();
            L.o(testDataOuterClass$TestData0, "_builder.getTestData()");
            return testDataOuterClass$TestData0;
        }

        @m
        public final TestData getTestDataOrNull(@l Dsl headerBiddingTokenKt$Dsl0) {
            L.p(headerBiddingTokenKt$Dsl0, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(headerBiddingTokenKt$Dsl0._builder);
        }

        @l
        @i(name = "getTimestamps")
        public final Timestamps getTimestamps() {
            Timestamps timestampsOuterClass$Timestamps0 = this._builder.getTimestamps();
            L.o(timestampsOuterClass$Timestamps0, "_builder.getTimestamps()");
            return timestampsOuterClass$Timestamps0;
        }

        @l
        @i(name = "getTokenCounters")
        public final TokenCounters getTokenCounters() {
            TokenCounters headerBiddingTokenOuterClass$TokenCounters0 = this._builder.getTokenCounters();
            L.o(headerBiddingTokenOuterClass$TokenCounters0, "_builder.getTokenCounters()");
            return headerBiddingTokenOuterClass$TokenCounters0;
        }

        @m
        public final TokenCounters getTokenCountersOrNull(@l Dsl headerBiddingTokenKt$Dsl0) {
            L.p(headerBiddingTokenKt$Dsl0, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(headerBiddingTokenKt$Dsl0._builder);
        }

        @l
        @i(name = "getTokenId")
        public final ByteString getTokenId() {
            ByteString byteString0 = this._builder.getTokenId();
            L.o(byteString0, "_builder.getTokenId()");
            return byteString0;
        }

        @i(name = "getTokenNumber")
        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
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

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
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

        @i(name = "setCampaignState")
        public final void setCampaignState(@l CampaignState campaignStateOuterClass$CampaignState0) {
            L.p(campaignStateOuterClass$CampaignState0, "value");
            this._builder.setCampaignState(campaignStateOuterClass$CampaignState0);
        }

        @i(name = "setClientInfo")
        public final void setClientInfo(@l ClientInfo clientInfoOuterClass$ClientInfo0) {
            L.p(clientInfoOuterClass$ClientInfo0, "value");
            this._builder.setClientInfo(clientInfoOuterClass$ClientInfo0);
        }

        @i(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@l DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "value");
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
        }

        @i(name = "setInitializationData")
        public final void setInitializationData(@l InitializationData initializationDataOuterClass$InitializationData0) {
            L.p(initializationDataOuterClass$InitializationData0, "value");
            this._builder.setInitializationData(initializationDataOuterClass$InitializationData0);
        }

        @i(name = "setLimitedSessionToken")
        public final void setLimitedSessionToken(@l LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
            L.p(universalRequestOuterClass$LimitedSessionToken0, "value");
            this._builder.setLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken0);
        }

        @i(name = "setOfferwallEnabled")
        public final void setOfferwallEnabled(boolean z) {
            this._builder.setOfferwallEnabled(z);
        }

        @i(name = "setPii")
        public final void setPii(@l Pii piiOuterClass$Pii0) {
            L.p(piiOuterClass$Pii0, "value");
            this._builder.setPii(piiOuterClass$Pii0);
        }

        @i(name = "setScarSignalsCollected")
        public final void setScarSignalsCollected(boolean z) {
            this._builder.setScarSignalsCollected(z);
        }

        @i(name = "setSessionCounters")
        public final void setSessionCounters(@l SessionCounters sessionCountersOuterClass$SessionCounters0) {
            L.p(sessionCountersOuterClass$SessionCounters0, "value");
            this._builder.setSessionCounters(sessionCountersOuterClass$SessionCounters0);
        }

        @i(name = "setSessionToken")
        public final void setSessionToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setSessionToken(byteString0);
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

        @i(name = "setTestData")
        public final void setTestData(@l TestData testDataOuterClass$TestData0) {
            L.p(testDataOuterClass$TestData0, "value");
            this._builder.setTestData(testDataOuterClass$TestData0);
        }

        @i(name = "setTimestamps")
        public final void setTimestamps(@l Timestamps timestampsOuterClass$Timestamps0) {
            L.p(timestampsOuterClass$Timestamps0, "value");
            this._builder.setTimestamps(timestampsOuterClass$Timestamps0);
        }

        @i(name = "setTokenCounters")
        public final void setTokenCounters(@l TokenCounters headerBiddingTokenOuterClass$TokenCounters0) {
            L.p(headerBiddingTokenOuterClass$TokenCounters0, "value");
            this._builder.setTokenCounters(headerBiddingTokenOuterClass$TokenCounters0);
        }

        @i(name = "setTokenId")
        public final void setTokenId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setTokenId(byteString0);
        }

        @i(name = "setTokenNumber")
        public final void setTokenNumber(int v) {
            this._builder.setTokenNumber(v);
        }
    }

    @l
    public static final HeaderBiddingTokenKt INSTANCE;

    static {
        HeaderBiddingTokenKt.INSTANCE = new HeaderBiddingTokenKt();
    }
}

