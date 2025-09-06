package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nInitializationCompletedEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationCompletedEventRequestKt.kt\ngatewayprotocol/v1/InitializationCompletedEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class InitializationCompletedEventRequestKtKt {
    @l
    @i(name = "-initializeinitializationCompletedEventRequest")
    public static final InitializationCompletedEventRequest -initializeinitializationCompletedEventRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0 = InitializationCompletedEventRequest.newBuilder();
        L.o(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0, "newBuilder()");
        Dsl initializationCompletedEventRequestKt$Dsl0 = Dsl.Companion._create(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0);
        function10.invoke(initializationCompletedEventRequestKt$Dsl0);
        return initializationCompletedEventRequestKt$Dsl0._build();
    }

    @l
    public static final InitializationCompletedEventRequest copy(@l InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0, @l Function1 function10) {
        L.p(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl initializationCompletedEventRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(initializationCompletedEventRequestKt$Dsl0);
        return initializationCompletedEventRequestKt$Dsl0._build();
    }

    @m
    public static final DynamicDeviceInfo getDynamicDeviceInfoOrNull(@l InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0) {
        L.p(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0, "<this>");
        return initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0.hasDynamicDeviceInfo() ? initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0.getDynamicDeviceInfo() : null;
    }

    @m
    public static final StaticDeviceInfo getStaticDeviceInfoOrNull(@l InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0) {
        L.p(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0, "<this>");
        return initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0.hasStaticDeviceInfo() ? initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder0.getStaticDeviceInfo() : null;
    }
}

