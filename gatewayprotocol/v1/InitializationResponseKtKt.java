package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nInitializationResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationResponseKt.kt\ngatewayprotocol/v1/InitializationResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
public final class InitializationResponseKtKt {
    @l
    @i(name = "-initializeinitializationResponse")
    public static final InitializationResponse -initializeinitializationResponse(@l Function1 function10) {
        L.p(function10, "block");
        Builder initializationResponseOuterClass$InitializationResponse$Builder0 = InitializationResponse.newBuilder();
        L.o(initializationResponseOuterClass$InitializationResponse$Builder0, "newBuilder()");
        Dsl initializationResponseKt$Dsl0 = Dsl.Companion._create(initializationResponseOuterClass$InitializationResponse$Builder0);
        function10.invoke(initializationResponseKt$Dsl0);
        return initializationResponseKt$Dsl0._build();
    }

    @l
    public static final InitializationResponse copy(@l InitializationResponse initializationResponseOuterClass$InitializationResponse0, @l Function1 function10) {
        L.p(initializationResponseOuterClass$InitializationResponse0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = initializationResponseOuterClass$InitializationResponse0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl initializationResponseKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(initializationResponseKt$Dsl0);
        return initializationResponseKt$Dsl0._build();
    }

    @m
    public static final Error getErrorOrNull(@l InitializationResponseOrBuilder initializationResponseOuterClass$InitializationResponseOrBuilder0) {
        L.p(initializationResponseOuterClass$InitializationResponseOrBuilder0, "<this>");
        return initializationResponseOuterClass$InitializationResponseOrBuilder0.hasError() ? initializationResponseOuterClass$InitializationResponseOrBuilder0.getError() : null;
    }

    @m
    public static final NativeConfiguration getNativeConfigurationOrNull(@l InitializationResponseOrBuilder initializationResponseOuterClass$InitializationResponseOrBuilder0) {
        L.p(initializationResponseOuterClass$InitializationResponseOrBuilder0, "<this>");
        return initializationResponseOuterClass$InitializationResponseOrBuilder0.hasNativeConfiguration() ? initializationResponseOuterClass$InitializationResponseOrBuilder0.getNativeConfiguration() : null;
    }
}

