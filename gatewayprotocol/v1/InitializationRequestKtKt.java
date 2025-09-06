package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nInitializationRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationRequestKt.kt\ngatewayprotocol/v1/InitializationRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
public final class InitializationRequestKtKt {
    @l
    @i(name = "-initializeinitializationRequest")
    public static final InitializationRequest -initializeinitializationRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder initializationRequestOuterClass$InitializationRequest$Builder0 = InitializationRequest.newBuilder();
        L.o(initializationRequestOuterClass$InitializationRequest$Builder0, "newBuilder()");
        Dsl initializationRequestKt$Dsl0 = Dsl.Companion._create(initializationRequestOuterClass$InitializationRequest$Builder0);
        function10.invoke(initializationRequestKt$Dsl0);
        return initializationRequestKt$Dsl0._build();
    }

    @l
    public static final InitializationRequest copy(@l InitializationRequest initializationRequestOuterClass$InitializationRequest0, @l Function1 function10) {
        L.p(initializationRequestOuterClass$InitializationRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = initializationRequestOuterClass$InitializationRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl initializationRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(initializationRequestKt$Dsl0);
        return initializationRequestKt$Dsl0._build();
    }

    @m
    public static final ClientInfo getClientInfoOrNull(@l InitializationRequestOrBuilder initializationRequestOuterClass$InitializationRequestOrBuilder0) {
        L.p(initializationRequestOuterClass$InitializationRequestOrBuilder0, "<this>");
        return initializationRequestOuterClass$InitializationRequestOrBuilder0.hasClientInfo() ? initializationRequestOuterClass$InitializationRequestOrBuilder0.getClientInfo() : null;
    }

    @m
    public static final InitializationDeviceInfo getDeviceInfoOrNull(@l InitializationRequestOrBuilder initializationRequestOuterClass$InitializationRequestOrBuilder0) {
        L.p(initializationRequestOuterClass$InitializationRequestOrBuilder0, "<this>");
        return initializationRequestOuterClass$InitializationRequestOrBuilder0.hasDeviceInfo() ? initializationRequestOuterClass$InitializationRequestOrBuilder0.getDeviceInfo() : null;
    }
}

