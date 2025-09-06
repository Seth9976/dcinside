package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nTokenCountersKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCountersKt.kt\ngatewayprotocol/v1/TokenCountersKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class TokenCountersKtKt {
    @l
    @i(name = "-initializetokenCounters")
    public static final TokenCounters -initializetokenCounters(@l Function1 function10) {
        L.p(function10, "block");
        Builder headerBiddingTokenOuterClass$TokenCounters$Builder0 = TokenCounters.newBuilder();
        L.o(headerBiddingTokenOuterClass$TokenCounters$Builder0, "newBuilder()");
        Dsl tokenCountersKt$Dsl0 = Dsl.Companion._create(headerBiddingTokenOuterClass$TokenCounters$Builder0);
        function10.invoke(tokenCountersKt$Dsl0);
        return tokenCountersKt$Dsl0._build();
    }

    @l
    public static final TokenCounters copy(@l TokenCounters headerBiddingTokenOuterClass$TokenCounters0, @l Function1 function10) {
        L.p(headerBiddingTokenOuterClass$TokenCounters0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = headerBiddingTokenOuterClass$TokenCounters0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl tokenCountersKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(tokenCountersKt$Dsl0);
        return tokenCountersKt$Dsl0._build();
    }
}

