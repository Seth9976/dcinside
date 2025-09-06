package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nRequestTimeoutPolicyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestTimeoutPolicyKt.kt\ngatewayprotocol/v1/RequestTimeoutPolicyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
public final class RequestTimeoutPolicyKtKt {
    @l
    @i(name = "-initializerequestTimeoutPolicy")
    public static final RequestTimeoutPolicy -initializerequestTimeoutPolicy(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0 = RequestTimeoutPolicy.newBuilder();
        L.o(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0, "newBuilder()");
        Dsl requestTimeoutPolicyKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0);
        function10.invoke(requestTimeoutPolicyKt$Dsl0);
        return requestTimeoutPolicyKt$Dsl0._build();
    }

    @l
    public static final RequestTimeoutPolicy copy(@l RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$RequestTimeoutPolicy0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$RequestTimeoutPolicy0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl requestTimeoutPolicyKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(requestTimeoutPolicyKt$Dsl0);
        return requestTimeoutPolicyKt$Dsl0._build();
    }
}

