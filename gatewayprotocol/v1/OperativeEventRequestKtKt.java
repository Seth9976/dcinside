package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nOperativeEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperativeEventRequestKt.kt\ngatewayprotocol/v1/OperativeEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,355:1\n1#2:356\n*E\n"})
public final class OperativeEventRequestKtKt {
    @l
    @i(name = "-initializeoperativeEventRequest")
    public static final OperativeEventRequest -initializeoperativeEventRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder operativeEventRequestOuterClass$OperativeEventRequest$Builder0 = OperativeEventRequest.newBuilder();
        L.o(operativeEventRequestOuterClass$OperativeEventRequest$Builder0, "newBuilder()");
        Dsl operativeEventRequestKt$Dsl0 = Dsl.Companion._create(operativeEventRequestOuterClass$OperativeEventRequest$Builder0);
        function10.invoke(operativeEventRequestKt$Dsl0);
        return operativeEventRequestKt$Dsl0._build();
    }

    @l
    public static final OperativeEventRequest copy(@l OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0, @l Function1 function10) {
        L.p(operativeEventRequestOuterClass$OperativeEventRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = operativeEventRequestOuterClass$OperativeEventRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl operativeEventRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(operativeEventRequestKt$Dsl0);
        return operativeEventRequestKt$Dsl0._build();
    }

    @m
    public static final CampaignState getCampaignStateOrNull(@l OperativeEventRequestOrBuilder operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0) {
        L.p(operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0, "<this>");
        return operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.hasCampaignState() ? operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.getCampaignState() : null;
    }

    @m
    public static final DynamicDeviceInfo getDynamicDeviceInfoOrNull(@l OperativeEventRequestOrBuilder operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0) {
        L.p(operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0, "<this>");
        return operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.hasDynamicDeviceInfo() ? operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.getDynamicDeviceInfo() : null;
    }

    @m
    public static final SessionCounters getSessionCountersOrNull(@l OperativeEventRequestOrBuilder operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0) {
        L.p(operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0, "<this>");
        return operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.hasSessionCounters() ? operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.getSessionCounters() : null;
    }

    @m
    public static final StaticDeviceInfo getStaticDeviceInfoOrNull(@l OperativeEventRequestOrBuilder operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0) {
        L.p(operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0, "<this>");
        return operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.hasStaticDeviceInfo() ? operativeEventRequestOuterClass$OperativeEventRequestOrBuilder0.getStaticDeviceInfo() : null;
    }
}

