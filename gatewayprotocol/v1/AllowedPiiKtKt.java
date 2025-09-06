package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nAllowedPiiKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllowedPiiKt.kt\ngatewayprotocol/v1/AllowedPiiKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class AllowedPiiKtKt {
    @l
    @i(name = "-initializeallowedPii")
    public static final AllowedPii -initializeallowedPii(@l Function1 function10) {
        L.p(function10, "block");
        Builder allowedPiiOuterClass$AllowedPii$Builder0 = AllowedPii.newBuilder();
        L.o(allowedPiiOuterClass$AllowedPii$Builder0, "newBuilder()");
        Dsl allowedPiiKt$Dsl0 = Dsl.Companion._create(allowedPiiOuterClass$AllowedPii$Builder0);
        function10.invoke(allowedPiiKt$Dsl0);
        return allowedPiiKt$Dsl0._build();
    }

    @l
    public static final AllowedPii copy(@l AllowedPii allowedPiiOuterClass$AllowedPii0, @l Function1 function10) {
        L.p(allowedPiiOuterClass$AllowedPii0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = allowedPiiOuterClass$AllowedPii0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl allowedPiiKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(allowedPiiKt$Dsl0);
        return allowedPiiKt$Dsl0._build();
    }
}

