package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nHeaderBiddingAdMarkupKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderBiddingAdMarkupKt.kt\ngatewayprotocol/v1/HeaderBiddingAdMarkupKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class HeaderBiddingAdMarkupKtKt {
    @l
    @i(name = "-initializeheaderBiddingAdMarkup")
    public static final HeaderBiddingAdMarkup -initializeheaderBiddingAdMarkup(@l Function1 function10) {
        L.p(function10, "block");
        Builder headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0 = HeaderBiddingAdMarkup.newBuilder();
        L.o(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0, "newBuilder()");
        Dsl headerBiddingAdMarkupKt$Dsl0 = Dsl.Companion._create(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup$Builder0);
        function10.invoke(headerBiddingAdMarkupKt$Dsl0);
        return headerBiddingAdMarkupKt$Dsl0._build();
    }

    @l
    public static final HeaderBiddingAdMarkup copy(@l HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, @l Function1 function10) {
        L.p(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl headerBiddingAdMarkupKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(headerBiddingAdMarkupKt$Dsl0);
        return headerBiddingAdMarkupKt$Dsl0._build();
    }
}

