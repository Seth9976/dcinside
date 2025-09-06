package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nCampaignKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignKt.kt\ngatewayprotocol/v1/CampaignKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class CampaignKtKt {
    @l
    @i(name = "-initializecampaign")
    public static final Campaign -initializecampaign(@l Function1 function10) {
        L.p(function10, "block");
        Builder campaignStateOuterClass$Campaign$Builder0 = Campaign.newBuilder();
        L.o(campaignStateOuterClass$Campaign$Builder0, "newBuilder()");
        Dsl campaignKt$Dsl0 = Dsl.Companion._create(campaignStateOuterClass$Campaign$Builder0);
        function10.invoke(campaignKt$Dsl0);
        return campaignKt$Dsl0._build();
    }

    @l
    public static final Campaign copy(@l Campaign campaignStateOuterClass$Campaign0, @l Function1 function10) {
        L.p(campaignStateOuterClass$Campaign0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = campaignStateOuterClass$Campaign0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl campaignKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(campaignKt$Dsl0);
        return campaignKt$Dsl0._build();
    }

    @m
    public static final Timestamps getLoadTimestampOrNull(@l CampaignOrBuilder campaignStateOuterClass$CampaignOrBuilder0) {
        L.p(campaignStateOuterClass$CampaignOrBuilder0, "<this>");
        return campaignStateOuterClass$CampaignOrBuilder0.hasLoadTimestamp() ? campaignStateOuterClass$CampaignOrBuilder0.getLoadTimestamp() : null;
    }

    @m
    public static final Timestamps getShowTimestampOrNull(@l CampaignOrBuilder campaignStateOuterClass$CampaignOrBuilder0) {
        L.p(campaignStateOuterClass$CampaignOrBuilder0, "<this>");
        return campaignStateOuterClass$CampaignOrBuilder0.hasShowTimestamp() ? campaignStateOuterClass$CampaignOrBuilder0.getShowTimestamp() : null;
    }
}

