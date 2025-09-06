package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nAdResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdResponseKt.kt\ngatewayprotocol/v1/AdResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class AdResponseKtKt {
    @l
    @i(name = "-initializeadResponse")
    public static final AdResponse -initializeadResponse(@l Function1 function10) {
        L.p(function10, "block");
        Builder adResponseOuterClass$AdResponse$Builder0 = AdResponse.newBuilder();
        L.o(adResponseOuterClass$AdResponse$Builder0, "newBuilder()");
        Dsl adResponseKt$Dsl0 = Dsl.Companion._create(adResponseOuterClass$AdResponse$Builder0);
        function10.invoke(adResponseKt$Dsl0);
        return adResponseKt$Dsl0._build();
    }

    @l
    public static final AdResponse copy(@l AdResponse adResponseOuterClass$AdResponse0, @l Function1 function10) {
        L.p(adResponseOuterClass$AdResponse0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adResponseOuterClass$AdResponse0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adResponseKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adResponseKt$Dsl0);
        return adResponseKt$Dsl0._build();
    }

    @m
    public static final Error getErrorOrNull(@l AdResponseOrBuilder adResponseOuterClass$AdResponseOrBuilder0) {
        L.p(adResponseOuterClass$AdResponseOrBuilder0, "<this>");
        return adResponseOuterClass$AdResponseOrBuilder0.hasError() ? adResponseOuterClass$AdResponseOrBuilder0.getError() : null;
    }

    @m
    public static final WebViewConfiguration getWebviewConfigurationOrNull(@l AdResponseOrBuilder adResponseOuterClass$AdResponseOrBuilder0) {
        L.p(adResponseOuterClass$AdResponseOrBuilder0, "<this>");
        return adResponseOuterClass$AdResponseOrBuilder0.hasWebviewConfiguration() ? adResponseOuterClass$AdResponseOrBuilder0.getWebviewConfiguration() : null;
    }
}

