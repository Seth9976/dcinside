package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDeveloperConsentOptionKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperConsentOptionKt.kt\ngatewayprotocol/v1/DeveloperConsentOptionKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public final class DeveloperConsentOptionKtKt {
    @l
    @i(name = "-initializedeveloperConsentOption")
    public static final DeveloperConsentOption -initializedeveloperConsentOption(@l Function1 function10) {
        L.p(function10, "block");
        Builder developerConsentOuterClass$DeveloperConsentOption$Builder0 = DeveloperConsentOption.newBuilder();
        L.o(developerConsentOuterClass$DeveloperConsentOption$Builder0, "newBuilder()");
        Dsl developerConsentOptionKt$Dsl0 = Dsl.Companion._create(developerConsentOuterClass$DeveloperConsentOption$Builder0);
        function10.invoke(developerConsentOptionKt$Dsl0);
        return developerConsentOptionKt$Dsl0._build();
    }

    @l
    public static final DeveloperConsentOption copy(@l DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0, @l Function1 function10) {
        L.p(developerConsentOuterClass$DeveloperConsentOption0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = developerConsentOuterClass$DeveloperConsentOption0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl developerConsentOptionKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(developerConsentOptionKt$Dsl0);
        return developerConsentOptionKt$Dsl0._build();
    }
}

