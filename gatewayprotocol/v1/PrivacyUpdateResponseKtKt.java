package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nPrivacyUpdateResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyUpdateResponseKt.kt\ngatewayprotocol/v1/PrivacyUpdateResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class PrivacyUpdateResponseKtKt {
    @l
    @i(name = "-initializeprivacyUpdateResponse")
    public static final PrivacyUpdateResponse -initializeprivacyUpdateResponse(@l Function1 function10) {
        L.p(function10, "block");
        Builder privacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder0 = PrivacyUpdateResponse.newBuilder();
        L.o(privacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder0, "newBuilder()");
        Dsl privacyUpdateResponseKt$Dsl0 = Dsl.Companion._create(privacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder0);
        function10.invoke(privacyUpdateResponseKt$Dsl0);
        return privacyUpdateResponseKt$Dsl0._build();
    }

    @l
    public static final PrivacyUpdateResponse copy(@l PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0, @l Function1 function10) {
        L.p(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = privacyUpdateResponseOuterClass$PrivacyUpdateResponse0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl privacyUpdateResponseKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(privacyUpdateResponseKt$Dsl0);
        return privacyUpdateResponseKt$Dsl0._build();
    }
}

