package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nUniversalRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n1#2:940\n*E\n"})
public final class UniversalRequestKtKt {
    @l
    @i(name = "-initializeuniversalRequest")
    public static final UniversalRequest -initializeuniversalRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder universalRequestOuterClass$UniversalRequest$Builder0 = UniversalRequest.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Builder0, "newBuilder()");
        Dsl universalRequestKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Builder0);
        function10.invoke(universalRequestKt$Dsl0);
        return universalRequestKt$Dsl0._build();
    }

    @l
    public static final Payload copy(@l Payload universalRequestOuterClass$UniversalRequest$Payload0, @l Function1 function10) {
        L.p(universalRequestOuterClass$UniversalRequest$Payload0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalRequestOuterClass$UniversalRequest$Payload0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder)generatedMessageLite$Builder0));
        function10.invoke(universalRequestKt$PayloadKt$Dsl0);
        return universalRequestKt$PayloadKt$Dsl0._build();
    }

    @l
    public static final SharedData copy(@l SharedData universalRequestOuterClass$UniversalRequest$SharedData0, @l Function1 function10) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedData0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalRequestOuterClass$UniversalRequest$SharedData0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl universalRequestKt$SharedDataKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion._create(((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder)generatedMessageLite$Builder0));
        function10.invoke(universalRequestKt$SharedDataKt$Dsl0);
        return universalRequestKt$SharedDataKt$Dsl0._build();
    }

    @l
    public static final UniversalRequest copy(@l UniversalRequest universalRequestOuterClass$UniversalRequest0, @l Function1 function10) {
        L.p(universalRequestOuterClass$UniversalRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalRequestOuterClass$UniversalRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl universalRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(universalRequestKt$Dsl0);
        return universalRequestKt$Dsl0._build();
    }

    @m
    public static final AdDataRefreshRequest getAdDataRefreshRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasAdDataRefreshRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getAdDataRefreshRequest() : null;
    }

    @m
    public static final AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasAdPlayerConfigRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getAdPlayerConfigRequest() : null;
    }

    @m
    public static final AdRequest getAdRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasAdRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getAdRequest() : null;
    }

    @m
    public static final Timestamp getAppStartTimeOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasAppStartTime() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getAppStartTime() : null;
    }

    @m
    public static final DeveloperConsent getDeveloperConsentOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasDeveloperConsent() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getDeveloperConsent() : null;
    }

    @m
    public static final DiagnosticEventRequest getDiagnosticEventRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasDiagnosticEventRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getDiagnosticEventRequest() : null;
    }

    @m
    public static final GetTokenEventRequest getGetTokenEventRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasGetTokenEventRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getGetTokenEventRequest() : null;
    }

    @m
    public static final InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasInitializationCompletedEventRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getInitializationCompletedEventRequest() : null;
    }

    @m
    public static final InitializationRequest getInitializationRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasInitializationRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getInitializationRequest() : null;
    }

    @m
    public static final LimitedSessionToken getLimitedSessionTokenOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasLimitedSessionToken() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getLimitedSessionToken() : null;
    }

    @m
    public static final OperativeEventRequest getOperativeEventOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasOperativeEvent() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getOperativeEvent() : null;
    }

    @m
    public static final Payload getPayloadOrNull(@l UniversalRequestOrBuilder universalRequestOuterClass$UniversalRequestOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequestOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequestOrBuilder0.hasPayload() ? universalRequestOuterClass$UniversalRequestOrBuilder0.getPayload() : null;
    }

    @m
    public static final Pii getPiiOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasPii() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getPii() : null;
    }

    @m
    public static final PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasPrivacyUpdateRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getPrivacyUpdateRequest() : null;
    }

    @m
    public static final Timestamp getSdkStartTimeOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasSdkStartTime() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getSdkStartTime() : null;
    }

    @m
    public static final SharedData getSharedDataOrNull(@l UniversalRequestOrBuilder universalRequestOuterClass$UniversalRequestOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequestOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequestOrBuilder0.hasSharedData() ? universalRequestOuterClass$UniversalRequestOrBuilder0.getSharedData() : null;
    }

    @m
    public static final TestData getTestDataOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasTestData() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getTestData() : null;
    }

    @m
    public static final Timestamps getTimestampsOrNull(@l SharedDataOrBuilder universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.hasTimestamps() ? universalRequestOuterClass$UniversalRequest$SharedDataOrBuilder0.getTimestamps() : null;
    }

    @m
    public static final TransactionEventRequest getTransactionEventRequestOrNull(@l PayloadOrBuilder universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0) {
        L.p(universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0, "<this>");
        return universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.hasTransactionEventRequest() ? universalRequestOuterClass$UniversalRequest$PayloadOrBuilder0.getTransactionEventRequest() : null;
    }
}

