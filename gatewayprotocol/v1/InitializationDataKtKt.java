package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nInitializationDataKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationDataKt.kt\ngatewayprotocol/v1/InitializationDataKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class InitializationDataKtKt {
    @l
    @i(name = "-initializeinitializationData")
    public static final InitializationData -initializeinitializationData(@l Function1 function10) {
        L.p(function10, "block");
        Builder initializationDataOuterClass$InitializationData$Builder0 = InitializationData.newBuilder();
        L.o(initializationDataOuterClass$InitializationData$Builder0, "newBuilder()");
        Dsl initializationDataKt$Dsl0 = Dsl.Companion._create(initializationDataOuterClass$InitializationData$Builder0);
        function10.invoke(initializationDataKt$Dsl0);
        return initializationDataKt$Dsl0._build();
    }

    @l
    public static final InitializationData copy(@l InitializationData initializationDataOuterClass$InitializationData0, @l Function1 function10) {
        L.p(initializationDataOuterClass$InitializationData0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = initializationDataOuterClass$InitializationData0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl initializationDataKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(initializationDataKt$Dsl0);
        return initializationDataKt$Dsl0._build();
    }

    @m
    public static final InitializationRequest getInitializationRequestOrNull(@l InitializationDataOrBuilder initializationDataOuterClass$InitializationDataOrBuilder0) {
        L.p(initializationDataOuterClass$InitializationDataOrBuilder0, "<this>");
        return initializationDataOuterClass$InitializationDataOrBuilder0.hasInitializationRequest() ? initializationDataOuterClass$InitializationDataOrBuilder0.getInitializationRequest() : null;
    }

    @m
    public static final SharedData getSharedDataOrNull(@l InitializationDataOrBuilder initializationDataOuterClass$InitializationDataOrBuilder0) {
        L.p(initializationDataOuterClass$InitializationDataOrBuilder0, "<this>");
        return initializationDataOuterClass$InitializationDataOrBuilder0.hasSharedData() ? initializationDataOuterClass$InitializationDataOrBuilder0.getSharedData() : null;
    }
}

