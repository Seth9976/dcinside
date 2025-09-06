package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nAdPlayerConfigRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdPlayerConfigRequestKt.kt\ngatewayprotocol/v1/AdPlayerConfigRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class AdPlayerConfigRequestKtKt {
    @l
    @i(name = "-initializeadPlayerConfigRequest")
    public static final AdPlayerConfigRequest -initializeadPlayerConfigRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0 = AdPlayerConfigRequest.newBuilder();
        L.o(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0, "newBuilder()");
        Dsl adPlayerConfigRequestKt$Dsl0 = Dsl.Companion._create(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0);
        function10.invoke(adPlayerConfigRequestKt$Dsl0);
        return adPlayerConfigRequestKt$Dsl0._build();
    }

    @l
    public static final AdPlayerConfigRequest copy(@l AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0, @l Function1 function10) {
        L.p(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adPlayerConfigRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adPlayerConfigRequestKt$Dsl0);
        return adPlayerConfigRequestKt$Dsl0._build();
    }
}

