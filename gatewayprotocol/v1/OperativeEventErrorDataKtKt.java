package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nOperativeEventErrorDataKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperativeEventErrorDataKt.kt\ngatewayprotocol/v1/OperativeEventErrorDataKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class OperativeEventErrorDataKtKt {
    @l
    @i(name = "-initializeoperativeEventErrorData")
    public static final OperativeEventErrorData -initializeoperativeEventErrorData(@l Function1 function10) {
        L.p(function10, "block");
        Builder operativeEventRequestOuterClass$OperativeEventErrorData$Builder0 = OperativeEventErrorData.newBuilder();
        L.o(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0, "newBuilder()");
        Dsl operativeEventErrorDataKt$Dsl0 = Dsl.Companion._create(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0);
        function10.invoke(operativeEventErrorDataKt$Dsl0);
        return operativeEventErrorDataKt$Dsl0._build();
    }

    @l
    public static final OperativeEventErrorData copy(@l OperativeEventErrorData operativeEventRequestOuterClass$OperativeEventErrorData0, @l Function1 function10) {
        L.p(operativeEventRequestOuterClass$OperativeEventErrorData0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = operativeEventRequestOuterClass$OperativeEventErrorData0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl operativeEventErrorDataKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(operativeEventErrorDataKt$Dsl0);
        return operativeEventErrorDataKt$Dsl0._build();
    }
}

