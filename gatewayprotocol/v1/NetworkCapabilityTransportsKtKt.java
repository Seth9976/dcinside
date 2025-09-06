package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nNetworkCapabilityTransportsKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkCapabilityTransportsKt.kt\ngatewayprotocol/v1/NetworkCapabilityTransportsKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
public final class NetworkCapabilityTransportsKtKt {
    @l
    @i(name = "-initializenetworkCapabilityTransports")
    public static final NetworkCapabilityTransports -initializenetworkCapabilityTransports(@l Function1 function10) {
        L.p(function10, "block");
        Builder networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0 = NetworkCapabilityTransports.newBuilder();
        L.o(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0, "newBuilder()");
        Dsl networkCapabilityTransportsKt$Dsl0 = Dsl.Companion._create(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0);
        function10.invoke(networkCapabilityTransportsKt$Dsl0);
        return networkCapabilityTransportsKt$Dsl0._build();
    }

    @l
    public static final NetworkCapabilityTransports copy(@l NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0, @l Function1 function10) {
        L.p(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl networkCapabilityTransportsKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(networkCapabilityTransportsKt$Dsl0);
        return networkCapabilityTransportsKt$Dsl0._build();
    }
}

