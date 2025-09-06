package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nCampaignStateKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignStateKt.kt\ngatewayprotocol/v1/CampaignStateKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
public final class CampaignStateKtKt {
    @l
    @i(name = "-initializecampaignState")
    public static final CampaignState -initializecampaignState(@l Function1 function10) {
        L.p(function10, "block");
        Builder campaignStateOuterClass$CampaignState$Builder0 = CampaignState.newBuilder();
        L.o(campaignStateOuterClass$CampaignState$Builder0, "newBuilder()");
        Dsl campaignStateKt$Dsl0 = Dsl.Companion._create(campaignStateOuterClass$CampaignState$Builder0);
        function10.invoke(campaignStateKt$Dsl0);
        return campaignStateKt$Dsl0._build();
    }

    @l
    public static final CampaignState copy(@l CampaignState campaignStateOuterClass$CampaignState0, @l Function1 function10) {
        L.p(campaignStateOuterClass$CampaignState0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = campaignStateOuterClass$CampaignState0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl campaignStateKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(campaignStateKt$Dsl0);
        return campaignStateKt$Dsl0._build();
    }
}

