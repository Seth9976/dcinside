package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDiagnosticEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticEventRequestKt.kt\ngatewayprotocol/v1/DiagnosticEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class DiagnosticEventRequestKtKt {
    @l
    @i(name = "-initializediagnosticEventRequest")
    public static final DiagnosticEventRequest -initializediagnosticEventRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0 = DiagnosticEventRequest.newBuilder();
        L.o(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0, "newBuilder()");
        Dsl diagnosticEventRequestKt$Dsl0 = Dsl.Companion._create(diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0);
        function10.invoke(diagnosticEventRequestKt$Dsl0);
        return diagnosticEventRequestKt$Dsl0._build();
    }

    @l
    public static final DiagnosticEventRequest copy(@l DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0, @l Function1 function10) {
        L.p(diagnosticEventRequestOuterClass$DiagnosticEventRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = diagnosticEventRequestOuterClass$DiagnosticEventRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl diagnosticEventRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(diagnosticEventRequestKt$Dsl0);
        return diagnosticEventRequestKt$Dsl0._build();
    }
}

