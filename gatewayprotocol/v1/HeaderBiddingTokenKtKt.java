package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nHeaderBiddingTokenKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderBiddingTokenKt.kt\ngatewayprotocol/v1/HeaderBiddingTokenKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,573:1\n1#2:574\n*E\n"})
public final class HeaderBiddingTokenKtKt {
    @l
    @i(name = "-initializeheaderBiddingToken")
    public static final HeaderBiddingToken -initializeheaderBiddingToken(@l Function1 function10) {
        L.p(function10, "block");
        Builder headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0 = HeaderBiddingToken.newBuilder();
        L.o(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0, "newBuilder()");
        Dsl headerBiddingTokenKt$Dsl0 = Dsl.Companion._create(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0);
        function10.invoke(headerBiddingTokenKt$Dsl0);
        return headerBiddingTokenKt$Dsl0._build();
    }

    @l
    public static final HeaderBiddingToken copy(@l HeaderBiddingToken headerBiddingTokenOuterClass$HeaderBiddingToken0, @l Function1 function10) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingToken0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = headerBiddingTokenOuterClass$HeaderBiddingToken0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl headerBiddingTokenKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(headerBiddingTokenKt$Dsl0);
        return headerBiddingTokenKt$Dsl0._build();
    }

    @m
    public static final CampaignState getCampaignStateOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasCampaignState() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getCampaignState() : null;
    }

    @m
    public static final ClientInfo getClientInfoOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasClientInfo() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getClientInfo() : null;
    }

    @m
    public static final DynamicDeviceInfo getDynamicDeviceInfoOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasDynamicDeviceInfo() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getDynamicDeviceInfo() : null;
    }

    @m
    public static final InitializationData getInitializationDataOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasInitializationData() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getInitializationData() : null;
    }

    @m
    public static final LimitedSessionToken getLimitedSessionTokenOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasLimitedSessionToken() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getLimitedSessionToken() : null;
    }

    @m
    public static final Pii getPiiOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasPii() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getPii() : null;
    }

    @m
    public static final SessionCounters getSessionCountersOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasSessionCounters() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getSessionCounters() : null;
    }

    @m
    public static final StaticDeviceInfo getStaticDeviceInfoOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasStaticDeviceInfo() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getStaticDeviceInfo() : null;
    }

    @m
    public static final TestData getTestDataOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasTestData() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getTestData() : null;
    }

    @m
    public static final Timestamps getTimestampsOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasTimestamps() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getTimestamps() : null;
    }

    @m
    public static final TokenCounters getTokenCountersOrNull(@l HeaderBiddingTokenOrBuilder headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0) {
        L.p(headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0, "<this>");
        return headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.hasTokenCounters() ? headerBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder0.getTokenCounters() : null;
    }
}

