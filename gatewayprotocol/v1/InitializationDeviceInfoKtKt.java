package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nInitializationDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationDeviceInfoKt.kt\ngatewayprotocol/v1/InitializationDeviceInfoKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
public final class InitializationDeviceInfoKtKt {
    @l
    @i(name = "-initializeinitializationDeviceInfo")
    public static final InitializationDeviceInfo -initializeinitializationDeviceInfo(@l Function1 function10) {
        L.p(function10, "block");
        Builder initializationRequestOuterClass$InitializationDeviceInfo$Builder0 = InitializationDeviceInfo.newBuilder();
        L.o(initializationRequestOuterClass$InitializationDeviceInfo$Builder0, "newBuilder()");
        Dsl initializationDeviceInfoKt$Dsl0 = Dsl.Companion._create(initializationRequestOuterClass$InitializationDeviceInfo$Builder0);
        function10.invoke(initializationDeviceInfoKt$Dsl0);
        return initializationDeviceInfoKt$Dsl0._build();
    }

    @l
    public static final InitializationDeviceInfo copy(@l InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0, @l Function1 function10) {
        L.p(initializationRequestOuterClass$InitializationDeviceInfo0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = initializationRequestOuterClass$InitializationDeviceInfo0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl initializationDeviceInfoKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(initializationDeviceInfoKt$Dsl0);
        return initializationDeviceInfoKt$Dsl0._build();
    }
}

