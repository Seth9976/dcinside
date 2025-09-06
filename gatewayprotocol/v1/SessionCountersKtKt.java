package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nSessionCountersKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCountersKt.kt\ngatewayprotocol/v1/SessionCountersKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
public final class SessionCountersKtKt {
    @l
    @i(name = "-initializesessionCounters")
    public static final SessionCounters -initializesessionCounters(@l Function1 function10) {
        L.p(function10, "block");
        Builder sessionCountersOuterClass$SessionCounters$Builder0 = SessionCounters.newBuilder();
        L.o(sessionCountersOuterClass$SessionCounters$Builder0, "newBuilder()");
        Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(sessionCountersOuterClass$SessionCounters$Builder0);
        function10.invoke(sessionCountersKt$Dsl0);
        return sessionCountersKt$Dsl0._build();
    }

    @l
    public static final SessionCounters copy(@l SessionCounters sessionCountersOuterClass$SessionCounters0, @l Function1 function10) {
        L.p(sessionCountersOuterClass$SessionCounters0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = sessionCountersOuterClass$SessionCounters0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(sessionCountersKt$Dsl0);
        return sessionCountersKt$Dsl0._build();
    }
}

