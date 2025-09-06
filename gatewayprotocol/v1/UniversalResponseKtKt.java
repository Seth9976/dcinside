package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nUniversalResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalResponseKt.kt\ngatewayprotocol/v1/UniversalResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public final class UniversalResponseKtKt {
    @l
    @i(name = "-initializeuniversalResponse")
    public static final UniversalResponse -initializeuniversalResponse(@l Function1 function10) {
        L.p(function10, "block");
        Builder universalResponseOuterClass$UniversalResponse$Builder0 = UniversalResponse.newBuilder();
        L.o(universalResponseOuterClass$UniversalResponse$Builder0, "newBuilder()");
        Dsl universalResponseKt$Dsl0 = Dsl.Companion._create(universalResponseOuterClass$UniversalResponse$Builder0);
        function10.invoke(universalResponseKt$Dsl0);
        return universalResponseKt$Dsl0._build();
    }

    @l
    public static final Payload copy(@l Payload universalResponseOuterClass$UniversalResponse$Payload0, @l Function1 function10) {
        L.p(universalResponseOuterClass$UniversalResponse$Payload0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalResponseOuterClass$UniversalResponse$Payload0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl universalResponseKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalResponseKt.PayloadKt.Dsl.Companion._create(((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder)generatedMessageLite$Builder0));
        function10.invoke(universalResponseKt$PayloadKt$Dsl0);
        return universalResponseKt$PayloadKt$Dsl0._build();
    }

    @l
    public static final UniversalResponse copy(@l UniversalResponse universalResponseOuterClass$UniversalResponse0, @l Function1 function10) {
        L.p(universalResponseOuterClass$UniversalResponse0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalResponseOuterClass$UniversalResponse0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl universalResponseKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(universalResponseKt$Dsl0);
        return universalResponseKt$Dsl0._build();
    }

    @m
    public static final AdDataRefreshResponse getAdDataRefreshResponseOrNull(@l PayloadOrBuilder universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.hasAdDataRefreshResponse() ? universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.getAdDataRefreshResponse() : null;
    }

    @m
    public static final AdPlayerConfigResponse getAdPlayerConfigResponseOrNull(@l PayloadOrBuilder universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.hasAdPlayerConfigResponse() ? universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.getAdPlayerConfigResponse() : null;
    }

    @m
    public static final AdResponse getAdResponseOrNull(@l PayloadOrBuilder universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.hasAdResponse() ? universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.getAdResponse() : null;
    }

    @m
    public static final Error getErrorOrNull(@l UniversalResponseOrBuilder universalResponseOuterClass$UniversalResponseOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponseOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponseOrBuilder0.hasError() ? universalResponseOuterClass$UniversalResponseOrBuilder0.getError() : null;
    }

    @m
    public static final InitializationResponse getInitializationResponseOrNull(@l PayloadOrBuilder universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.hasInitializationResponse() ? universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.getInitializationResponse() : null;
    }

    @m
    public static final MutableData getMutableDataOrNull(@l UniversalResponseOrBuilder universalResponseOuterClass$UniversalResponseOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponseOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponseOrBuilder0.hasMutableData() ? universalResponseOuterClass$UniversalResponseOrBuilder0.getMutableData() : null;
    }

    @m
    public static final Payload getPayloadOrNull(@l UniversalResponseOrBuilder universalResponseOuterClass$UniversalResponseOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponseOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponseOrBuilder0.hasPayload() ? universalResponseOuterClass$UniversalResponseOrBuilder0.getPayload() : null;
    }

    @m
    public static final PrivacyUpdateResponse getPrivacyUpdateResponseOrNull(@l PayloadOrBuilder universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0) {
        L.p(universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0, "<this>");
        return universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.hasPrivacyUpdateResponse() ? universalResponseOuterClass$UniversalResponse$PayloadOrBuilder0.getPrivacyUpdateResponse() : null;
    }
}

