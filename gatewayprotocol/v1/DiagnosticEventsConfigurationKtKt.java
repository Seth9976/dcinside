package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDiagnosticEventsConfigurationKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticEventsConfigurationKt.kt\ngatewayprotocol/v1/DiagnosticEventsConfigurationKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
public final class DiagnosticEventsConfigurationKtKt {
    @l
    @i(name = "-initializediagnosticEventsConfiguration")
    public static final DiagnosticEventsConfiguration -initializediagnosticEventsConfiguration(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0 = DiagnosticEventsConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0, "newBuilder()");
        Dsl diagnosticEventsConfigurationKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0);
        function10.invoke(diagnosticEventsConfigurationKt$Dsl0);
        return diagnosticEventsConfigurationKt$Dsl0._build();
    }

    @l
    public static final DiagnosticEventsConfiguration copy(@l DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl diagnosticEventsConfigurationKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(diagnosticEventsConfigurationKt$Dsl0);
        return diagnosticEventsConfigurationKt$Dsl0._build();
    }
}

