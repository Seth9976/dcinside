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

public final class CampaignKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder campaignStateOuterClass$Campaign$Builder0) {
                L.p(campaignStateOuterClass$Campaign$Builder0, "builder");
                return new Dsl(campaignStateOuterClass$Campaign$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder campaignStateOuterClass$Campaign$Builder0) {
            this._builder = campaignStateOuterClass$Campaign$Builder0;
        }

        public Dsl(Builder campaignStateOuterClass$Campaign$Builder0, w w0) {
            this(campaignStateOuterClass$Campaign$Builder0);
        }

        @b0
        public final Campaign _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (Campaign)generatedMessageLite0;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        @l
        @i(name = "getData")
        public final ByteString getData() {
            ByteString byteString0 = this._builder.getData();
            L.o(byteString0, "_builder.getData()");
            return byteString0;
        }

        @i(name = "getDataVersion")
        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        @l
        @i(name = "getImpressionOpportunityId")
        public final ByteString getImpressionOpportunityId() {
            ByteString byteString0 = this._builder.getImpressionOpportunityId();
            L.o(byteString0, "_builder.getImpressionOpportunityId()");
            return byteString0;
        }

        @l
        @i(name = "getLoadTimestamp")
        public final Timestamps getLoadTimestamp() {
            Timestamps timestampsOuterClass$Timestamps0 = this._builder.getLoadTimestamp();
            L.o(timestampsOuterClass$Timestamps0, "_builder.getLoadTimestamp()");
            return timestampsOuterClass$Timestamps0;
        }

        @l
        @i(name = "getPlacementId")
        public final String getPlacementId() {
            String s = this._builder.getPlacementId();
            L.o(s, "_builder.getPlacementId()");
            return s;
        }

        @l
        @i(name = "getShowTimestamp")
        public final Timestamps getShowTimestamp() {
            Timestamps timestampsOuterClass$Timestamps0 = this._builder.getShowTimestamp();
            L.o(timestampsOuterClass$Timestamps0, "_builder.getShowTimestamp()");
            return timestampsOuterClass$Timestamps0;
        }

        @m
        public final Timestamps getShowTimestampOrNull(@l Dsl campaignKt$Dsl0) {
            L.p(campaignKt$Dsl0, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(campaignKt$Dsl0._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        @i(name = "setData")
        public final void setData(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setData(byteString0);
        }

        @i(name = "setDataVersion")
        public final void setDataVersion(int v) {
            this._builder.setDataVersion(v);
        }

        @i(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setImpressionOpportunityId(byteString0);
        }

        @i(name = "setLoadTimestamp")
        public final void setLoadTimestamp(@l Timestamps timestampsOuterClass$Timestamps0) {
            L.p(timestampsOuterClass$Timestamps0, "value");
            this._builder.setLoadTimestamp(timestampsOuterClass$Timestamps0);
        }

        @i(name = "setPlacementId")
        public final void setPlacementId(@l String s) {
            L.p(s, "value");
            this._builder.setPlacementId(s);
        }

        @i(name = "setShowTimestamp")
        public final void setShowTimestamp(@l Timestamps timestampsOuterClass$Timestamps0) {
            L.p(timestampsOuterClass$Timestamps0, "value");
            this._builder.setShowTimestamp(timestampsOuterClass$Timestamps0);
        }
    }

    @l
    public static final CampaignKt INSTANCE;

    static {
        CampaignKt.INSTANCE = new CampaignKt();
    }
}

