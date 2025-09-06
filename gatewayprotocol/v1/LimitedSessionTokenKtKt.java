package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nLimitedSessionTokenKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedSessionTokenKt.kt\ngatewayprotocol/v1/LimitedSessionTokenKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n1#2:386\n*E\n"})
public final class LimitedSessionTokenKtKt {
    @l
    @i(name = "-initializelimitedSessionToken")
    public static final LimitedSessionToken -initializelimitedSessionToken(@l Function1 function10) {
        L.p(function10, "block");
        Builder universalRequestOuterClass$LimitedSessionToken$Builder0 = LimitedSessionToken.newBuilder();
        L.o(universalRequestOuterClass$LimitedSessionToken$Builder0, "newBuilder()");
        Dsl limitedSessionTokenKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$LimitedSessionToken$Builder0);
        function10.invoke(limitedSessionTokenKt$Dsl0);
        return limitedSessionTokenKt$Dsl0._build();
    }

    @l
    public static final LimitedSessionToken copy(@l LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0, @l Function1 function10) {
        L.p(universalRequestOuterClass$LimitedSessionToken0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalRequestOuterClass$LimitedSessionToken0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl limitedSessionTokenKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(limitedSessionTokenKt$Dsl0);
        return limitedSessionTokenKt$Dsl0._build();
    }
}

