package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDiagnosticTagKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticTagKt.kt\ngatewayprotocol/v1/DiagnosticTagKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class DiagnosticTagKtKt {
    @l
    @i(name = "-initializediagnosticTag")
    public static final DiagnosticTag -initializediagnosticTag(@l Function1 function10) {
        L.p(function10, "block");
        Builder diagnosticEventRequestOuterClass$DiagnosticTag$Builder0 = DiagnosticTag.newBuilder();
        L.o(diagnosticEventRequestOuterClass$DiagnosticTag$Builder0, "newBuilder()");
        Dsl diagnosticTagKt$Dsl0 = Dsl.Companion._create(diagnosticEventRequestOuterClass$DiagnosticTag$Builder0);
        function10.invoke(diagnosticTagKt$Dsl0);
        return diagnosticTagKt$Dsl0._build();
    }

    @l
    public static final DiagnosticTag copy(@l DiagnosticTag diagnosticEventRequestOuterClass$DiagnosticTag0, @l Function1 function10) {
        L.p(diagnosticEventRequestOuterClass$DiagnosticTag0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = diagnosticEventRequestOuterClass$DiagnosticTag0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl diagnosticTagKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(diagnosticTagKt$Dsl0);
        return diagnosticTagKt$Dsl0._build();
    }
}

