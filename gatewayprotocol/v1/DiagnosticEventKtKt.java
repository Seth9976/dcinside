package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nDiagnosticEventKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticEventKt.kt\ngatewayprotocol/v1/DiagnosticEventKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,508:1\n1#2:509\n*E\n"})
public final class DiagnosticEventKtKt {
    @l
    @i(name = "-initializediagnosticEvent")
    public static final DiagnosticEvent -initializediagnosticEvent(@l Function1 function10) {
        L.p(function10, "block");
        Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0 = DiagnosticEvent.newBuilder();
        L.o(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0, "newBuilder()");
        Dsl diagnosticEventKt$Dsl0 = Dsl.Companion._create(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0);
        function10.invoke(diagnosticEventKt$Dsl0);
        return diagnosticEventKt$Dsl0._build();
    }

    @l
    public static final DiagnosticEvent copy(@l DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0, @l Function1 function10) {
        L.p(diagnosticEventRequestOuterClass$DiagnosticEvent0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = diagnosticEventRequestOuterClass$DiagnosticEvent0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl diagnosticEventKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(diagnosticEventKt$Dsl0);
        return diagnosticEventKt$Dsl0._build();
    }

    @m
    public static final Timestamps getTimestampsOrNull(@l DiagnosticEventOrBuilder diagnosticEventRequestOuterClass$DiagnosticEventOrBuilder0) {
        L.p(diagnosticEventRequestOuterClass$DiagnosticEventOrBuilder0, "<this>");
        return diagnosticEventRequestOuterClass$DiagnosticEventOrBuilder0.hasTimestamps() ? diagnosticEventRequestOuterClass$DiagnosticEventOrBuilder0.getTimestamps() : null;
    }
}

