package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nAdRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdRequestKt.kt\ngatewayprotocol/v1/AdRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"})
public final class AdRequestKtKt {
    @l
    @i(name = "-initializeadRequest")
    public static final AdRequest -initializeadRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder adRequestOuterClass$AdRequest$Builder0 = AdRequest.newBuilder();
        L.o(adRequestOuterClass$AdRequest$Builder0, "newBuilder()");
        Dsl adRequestKt$Dsl0 = Dsl.Companion._create(adRequestOuterClass$AdRequest$Builder0);
        function10.invoke(adRequestKt$Dsl0);
        return adRequestKt$Dsl0._build();
    }

    @l
    public static final AdRequest copy(@l AdRequest adRequestOuterClass$AdRequest0, @l Function1 function10) {
        L.p(adRequestOuterClass$AdRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adRequestOuterClass$AdRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adRequestKt$Dsl0);
        return adRequestKt$Dsl0._build();
    }

    @m
    public static final BannerSize getBannerSizeOrNull(@l AdRequestOrBuilder adRequestOuterClass$AdRequestOrBuilder0) {
        L.p(adRequestOuterClass$AdRequestOrBuilder0, "<this>");
        return adRequestOuterClass$AdRequestOrBuilder0.hasBannerSize() ? adRequestOuterClass$AdRequestOrBuilder0.getBannerSize() : null;
    }

    @m
    public static final CampaignState getCampaignStateOrNull(@l AdRequestOrBuilder adRequestOuterClass$AdRequestOrBuilder0) {
        L.p(adRequestOuterClass$AdRequestOrBuilder0, "<this>");
        return adRequestOuterClass$AdRequestOrBuilder0.hasCampaignState() ? adRequestOuterClass$AdRequestOrBuilder0.getCampaignState() : null;
    }

    @m
    public static final DynamicDeviceInfo getDynamicDeviceInfoOrNull(@l AdRequestOrBuilder adRequestOuterClass$AdRequestOrBuilder0) {
        L.p(adRequestOuterClass$AdRequestOrBuilder0, "<this>");
        return adRequestOuterClass$AdRequestOrBuilder0.hasDynamicDeviceInfo() ? adRequestOuterClass$AdRequestOrBuilder0.getDynamicDeviceInfo() : null;
    }

    @m
    public static final SessionCounters getSessionCountersOrNull(@l AdRequestOrBuilder adRequestOuterClass$AdRequestOrBuilder0) {
        L.p(adRequestOuterClass$AdRequestOrBuilder0, "<this>");
        return adRequestOuterClass$AdRequestOrBuilder0.hasSessionCounters() ? adRequestOuterClass$AdRequestOrBuilder0.getSessionCounters() : null;
    }

    @m
    public static final StaticDeviceInfo getStaticDeviceInfoOrNull(@l AdRequestOrBuilder adRequestOuterClass$AdRequestOrBuilder0) {
        L.p(adRequestOuterClass$AdRequestOrBuilder0, "<this>");
        return adRequestOuterClass$AdRequestOrBuilder0.hasStaticDeviceInfo() ? adRequestOuterClass$AdRequestOrBuilder0.getStaticDeviceInfo() : null;
    }
}

