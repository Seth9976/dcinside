package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDeveloperConsentKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperConsentKt.kt\ngatewayprotocol/v1/DeveloperConsentKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public final class DeveloperConsentKtKt {
    @l
    @i(name = "-initializedeveloperConsent")
    public static final DeveloperConsent -initializedeveloperConsent(@l Function1 function10) {
        L.p(function10, "block");
        Builder developerConsentOuterClass$DeveloperConsent$Builder0 = DeveloperConsent.newBuilder();
        L.o(developerConsentOuterClass$DeveloperConsent$Builder0, "newBuilder()");
        Dsl developerConsentKt$Dsl0 = Dsl.Companion._create(developerConsentOuterClass$DeveloperConsent$Builder0);
        function10.invoke(developerConsentKt$Dsl0);
        return developerConsentKt$Dsl0._build();
    }

    @l
    public static final DeveloperConsent copy(@l DeveloperConsent developerConsentOuterClass$DeveloperConsent0, @l Function1 function10) {
        L.p(developerConsentOuterClass$DeveloperConsent0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = developerConsentOuterClass$DeveloperConsent0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl developerConsentKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(developerConsentKt$Dsl0);
        return developerConsentKt$Dsl0._build();
    }
}

