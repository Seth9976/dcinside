package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class CampaignStateKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder campaignStateOuterClass$CampaignState$Builder0) {
                L.p(campaignStateOuterClass$CampaignState$Builder0, "builder");
                return new Dsl(campaignStateOuterClass$CampaignState$Builder0, null);
            }
        }

        public static final class LoadedCampaignsProxy extends DslProxy {
        }

        public static final class ShownCampaignsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder campaignStateOuterClass$CampaignState$Builder0) {
            this._builder = campaignStateOuterClass$CampaignState$Builder0;
        }

        public Dsl(Builder campaignStateOuterClass$CampaignState$Builder0, w w0) {
            this(campaignStateOuterClass$CampaignState$Builder0);
        }

        @b0
        public final CampaignState _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (CampaignState)generatedMessageLite0;
        }

        @i(name = "addAllLoadedCampaigns")
        public final void addAllLoadedCampaigns(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllLoadedCampaigns(iterable0);
        }

        @i(name = "addAllShownCampaigns")
        public final void addAllShownCampaigns(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllShownCampaigns(iterable0);
        }

        @i(name = "addLoadedCampaigns")
        public final void addLoadedCampaigns(DslList dslList0, Campaign campaignStateOuterClass$Campaign0) {
            L.p(dslList0, "<this>");
            L.p(campaignStateOuterClass$Campaign0, "value");
            this._builder.addLoadedCampaigns(campaignStateOuterClass$Campaign0);
        }

        @i(name = "addShownCampaigns")
        public final void addShownCampaigns(DslList dslList0, Campaign campaignStateOuterClass$Campaign0) {
            L.p(dslList0, "<this>");
            L.p(campaignStateOuterClass$Campaign0, "value");
            this._builder.addShownCampaigns(campaignStateOuterClass$Campaign0);
        }

        @i(name = "clearLoadedCampaigns")
        public final void clearLoadedCampaigns(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearLoadedCampaigns();
        }

        @i(name = "clearShownCampaigns")
        public final void clearShownCampaigns(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearShownCampaigns();
        }

        public final DslList getLoadedCampaigns() {
            List list0 = this._builder.getLoadedCampaignsList();
            L.o(list0, "_builder.getLoadedCampaignsList()");
            return new DslList(list0);
        }

        public final DslList getShownCampaigns() {
            List list0 = this._builder.getShownCampaignsList();
            L.o(list0, "_builder.getShownCampaignsList()");
            return new DslList(list0);
        }

        @i(name = "plusAssignAllLoadedCampaigns")
        public final void plusAssignAllLoadedCampaigns(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllLoadedCampaigns(dslList0, iterable0);
        }

        @i(name = "plusAssignAllShownCampaigns")
        public final void plusAssignAllShownCampaigns(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllShownCampaigns(dslList0, iterable0);
        }

        @i(name = "plusAssignLoadedCampaigns")
        public final void plusAssignLoadedCampaigns(DslList dslList0, Campaign campaignStateOuterClass$Campaign0) {
            L.p(dslList0, "<this>");
            L.p(campaignStateOuterClass$Campaign0, "value");
            this.addLoadedCampaigns(dslList0, campaignStateOuterClass$Campaign0);
        }

        @i(name = "plusAssignShownCampaigns")
        public final void plusAssignShownCampaigns(DslList dslList0, Campaign campaignStateOuterClass$Campaign0) {
            L.p(dslList0, "<this>");
            L.p(campaignStateOuterClass$Campaign0, "value");
            this.addShownCampaigns(dslList0, campaignStateOuterClass$Campaign0);
        }

        @i(name = "setLoadedCampaigns")
        public final void setLoadedCampaigns(DslList dslList0, int v, Campaign campaignStateOuterClass$Campaign0) {
            L.p(dslList0, "<this>");
            L.p(campaignStateOuterClass$Campaign0, "value");
            this._builder.setLoadedCampaigns(v, campaignStateOuterClass$Campaign0);
        }

        @i(name = "setShownCampaigns")
        public final void setShownCampaigns(DslList dslList0, int v, Campaign campaignStateOuterClass$Campaign0) {
            L.p(dslList0, "<this>");
            L.p(campaignStateOuterClass$Campaign0, "value");
            this._builder.setShownCampaigns(v, campaignStateOuterClass$Campaign0);
        }
    }

    @l
    public static final CampaignStateKt INSTANCE;

    static {
        CampaignStateKt.INSTANCE = new CampaignStateKt();
    }
}

