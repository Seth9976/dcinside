package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nAdDataRefreshResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdDataRefreshResponseKt.kt\ngatewayprotocol/v1/AdDataRefreshResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class AdDataRefreshResponseKtKt {
    @l
    @i(name = "-initializeadDataRefreshResponse")
    public static final AdDataRefreshResponse -initializeadDataRefreshResponse(@l Function1 function10) {
        L.p(function10, "block");
        Builder adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0 = AdDataRefreshResponse.newBuilder();
        L.o(adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0, "newBuilder()");
        Dsl adDataRefreshResponseKt$Dsl0 = Dsl.Companion._create(adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0);
        function10.invoke(adDataRefreshResponseKt$Dsl0);
        return adDataRefreshResponseKt$Dsl0._build();
    }

    @l
    public static final AdDataRefreshResponse copy(@l AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0, @l Function1 function10) {
        L.p(adDataRefreshResponseOuterClass$AdDataRefreshResponse0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adDataRefreshResponseOuterClass$AdDataRefreshResponse0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adDataRefreshResponseKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adDataRefreshResponseKt$Dsl0);
        return adDataRefreshResponseKt$Dsl0._build();
    }

    @m
    public static final Error getErrorOrNull(@l AdDataRefreshResponseOrBuilder adDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder0) {
        L.p(adDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder0, "<this>");
        return adDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder0.hasError() ? adDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder0.getError() : null;
    }
}

