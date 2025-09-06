package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nGetTokenEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTokenEventRequestKt.kt\ngatewayprotocol/v1/GetTokenEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final class GetTokenEventRequestKtKt {
    @l
    @i(name = "-initializegetTokenEventRequest")
    public static final GetTokenEventRequest -initializegetTokenEventRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0 = GetTokenEventRequest.newBuilder();
        L.o(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0, "newBuilder()");
        Dsl getTokenEventRequestKt$Dsl0 = Dsl.Companion._create(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0);
        function10.invoke(getTokenEventRequestKt$Dsl0);
        return getTokenEventRequestKt$Dsl0._build();
    }

    @l
    public static final GetTokenEventRequest copy(@l GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0, @l Function1 function10) {
        L.p(getTokenEventRequestOuterClass$GetTokenEventRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = getTokenEventRequestOuterClass$GetTokenEventRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl getTokenEventRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(getTokenEventRequestKt$Dsl0);
        return getTokenEventRequestKt$Dsl0._build();
    }
}

