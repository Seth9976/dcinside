package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nAdDataRefreshRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdDataRefreshRequestKt.kt\ngatewayprotocol/v1/AdDataRefreshRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class AdDataRefreshRequestKtKt {
    @l
    @i(name = "-initializeadDataRefreshRequest")
    public static final AdDataRefreshRequest -initializeadDataRefreshRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0 = AdDataRefreshRequest.newBuilder();
        L.o(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0, "newBuilder()");
        Dsl adDataRefreshRequestKt$Dsl0 = Dsl.Companion._create(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0);
        function10.invoke(adDataRefreshRequestKt$Dsl0);
        return adDataRefreshRequestKt$Dsl0._build();
    }

    @l
    public static final AdDataRefreshRequest copy(@l AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0, @l Function1 function10) {
        L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adDataRefreshRequestOuterClass$AdDataRefreshRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adDataRefreshRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adDataRefreshRequestKt$Dsl0);
        return adDataRefreshRequestKt$Dsl0._build();
    }

    @m
    public static final CampaignState getCampaignStateOrNull(@l AdDataRefreshRequestOrBuilder adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0) {
        L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0, "<this>");
        return adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.hasCampaignState() ? adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.getCampaignState() : null;
    }

    @m
    public static final DynamicDeviceInfo getDynamicDeviceInfoOrNull(@l AdDataRefreshRequestOrBuilder adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0) {
        L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0, "<this>");
        return adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.hasDynamicDeviceInfo() ? adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.getDynamicDeviceInfo() : null;
    }

    @m
    public static final SessionCounters getSessionCountersOrNull(@l AdDataRefreshRequestOrBuilder adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0) {
        L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0, "<this>");
        return adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.hasSessionCounters() ? adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.getSessionCounters() : null;
    }

    @m
    public static final StaticDeviceInfo getStaticDeviceInfoOrNull(@l AdDataRefreshRequestOrBuilder adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0) {
        L.p(adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0, "<this>");
        return adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.hasStaticDeviceInfo() ? adDataRefreshRequestOuterClass$AdDataRefreshRequestOrBuilder0.getStaticDeviceInfo() : null;
    }
}

