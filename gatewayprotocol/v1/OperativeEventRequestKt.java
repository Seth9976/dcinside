package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class OperativeEventRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder operativeEventRequestOuterClass$OperativeEventRequest$Builder0) {
                L.p(operativeEventRequestOuterClass$OperativeEventRequest$Builder0, "builder");
                return new Dsl(operativeEventRequestOuterClass$OperativeEventRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder operativeEventRequestOuterClass$OperativeEventRequest$Builder0) {
            this._builder = operativeEventRequestOuterClass$OperativeEventRequest$Builder0;
        }

        public Dsl(Builder operativeEventRequestOuterClass$OperativeEventRequest$Builder0, w w0) {
            this(operativeEventRequestOuterClass$OperativeEventRequest$Builder0);
        }

        @b0
        public final OperativeEventRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (OperativeEventRequest)generatedMessageLite0;
        }

        public final void clearAdditionalData() {
            this._builder.clearAdditionalData();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSid() {
            this._builder.clearSid();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        @l
        @i(name = "getAdditionalData")
        public final ByteString getAdditionalData() {
            ByteString byteString0 = this._builder.getAdditionalData();
            L.o(byteString0, "_builder.getAdditionalData()");
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
        @i(name = "getEventId")
        public final ByteString getEventId() {
            ByteString byteString0 = this._builder.getEventId();
            L.o(byteString0, "_builder.getEventId()");
            return byteString0;
        }

        @l
        @i(name = "getEventType")
        public final OperativeEventType getEventType() {
            OperativeEventType operativeEventRequestOuterClass$OperativeEventType0 = this._builder.getEventType();
            L.o(operativeEventRequestOuterClass$OperativeEventType0, "_builder.getEventType()");
            return operativeEventRequestOuterClass$OperativeEventType0;
        }

        @i(name = "getEventTypeValue")
        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
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
        @i(name = "getSid")
        public final String getSid() {
            String s = this._builder.getSid();
            L.o(s, "_builder.getSid()");
            return s;
        }

        @l
        @i(name = "getStaticDeviceInfo")
        public final StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0 = this._builder.getStaticDeviceInfo();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo0, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo0;
        }

        @l
        @i(name = "getTrackingToken")
        public final ByteString getTrackingToken() {
            ByteString byteString0 = this._builder.getTrackingToken();
            L.o(byteString0, "_builder.getTrackingToken()");
            return byteString0;
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

        @i(name = "setAdditionalData")
        public final void setAdditionalData(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAdditionalData(byteString0);
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

        @i(name = "setEventId")
        public final void setEventId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setEventId(byteString0);
        }

        @i(name = "setEventType")
        public final void setEventType(@l OperativeEventType operativeEventRequestOuterClass$OperativeEventType0) {
            L.p(operativeEventRequestOuterClass$OperativeEventType0, "value");
            this._builder.setEventType(operativeEventRequestOuterClass$OperativeEventType0);
        }

        @i(name = "setEventTypeValue")
        public final void setEventTypeValue(int v) {
            this._builder.setEventTypeValue(v);
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

        @i(name = "setSid")
        public final void setSid(@l String s) {
            L.p(s, "value");
            this._builder.setSid(s);
        }

        @i(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@l StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            L.p(staticDeviceInfoOuterClass$StaticDeviceInfo0, "value");
            this._builder.setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
        }

        @i(name = "setTrackingToken")
        public final void setTrackingToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setTrackingToken(byteString0);
        }
    }

    @l
    public static final OperativeEventRequestKt INSTANCE;

    static {
        OperativeEventRequestKt.INSTANCE = new OperativeEventRequestKt();
    }
}

