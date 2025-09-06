package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nAdPlayerConfigResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdPlayerConfigResponseKt.kt\ngatewayprotocol/v1/AdPlayerConfigResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
public final class AdPlayerConfigResponseKtKt {
    @l
    @i(name = "-initializeadPlayerConfigResponse")
    public static final AdPlayerConfigResponse -initializeadPlayerConfigResponse(@l Function1 function10) {
        L.p(function10, "block");
        Builder adPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder0 = AdPlayerConfigResponse.newBuilder();
        L.o(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder0, "newBuilder()");
        Dsl adPlayerConfigResponseKt$Dsl0 = Dsl.Companion._create(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder0);
        function10.invoke(adPlayerConfigResponseKt$Dsl0);
        return adPlayerConfigResponseKt$Dsl0._build();
    }

    @l
    public static final AdPlayerConfigResponse copy(@l AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0, @l Function1 function10) {
        L.p(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adPlayerConfigResponseKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adPlayerConfigResponseKt$Dsl0);
        return adPlayerConfigResponseKt$Dsl0._build();
    }

    @m
    public static final Error getErrorOrNull(@l AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0) {
        L.p(adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0, "<this>");
        return adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0.hasError() ? adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0.getError() : null;
    }

    @m
    public static final WebViewConfiguration getWebviewConfigurationOrNull(@l AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0) {
        L.p(adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0, "<this>");
        return adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0.hasWebviewConfiguration() ? adPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder0.getWebviewConfiguration() : null;
    }
}

