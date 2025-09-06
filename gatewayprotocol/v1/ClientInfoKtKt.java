package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nClientInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientInfoKt.kt\ngatewayprotocol/v1/ClientInfoKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n1#2:455\n*E\n"})
public final class ClientInfoKtKt {
    @l
    @i(name = "-initializeclientInfo")
    public static final ClientInfo -initializeclientInfo(@l Function1 function10) {
        L.p(function10, "block");
        Builder clientInfoOuterClass$ClientInfo$Builder0 = ClientInfo.newBuilder();
        L.o(clientInfoOuterClass$ClientInfo$Builder0, "newBuilder()");
        Dsl clientInfoKt$Dsl0 = Dsl.Companion._create(clientInfoOuterClass$ClientInfo$Builder0);
        function10.invoke(clientInfoKt$Dsl0);
        return clientInfoKt$Dsl0._build();
    }

    @l
    public static final ClientInfo copy(@l ClientInfo clientInfoOuterClass$ClientInfo0, @l Function1 function10) {
        L.p(clientInfoOuterClass$ClientInfo0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = clientInfoOuterClass$ClientInfo0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl clientInfoKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(clientInfoKt$Dsl0);
        return clientInfoKt$Dsl0._build();
    }
}

