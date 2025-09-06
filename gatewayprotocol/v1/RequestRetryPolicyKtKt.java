package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nRequestRetryPolicyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestRetryPolicyKt.kt\ngatewayprotocol/v1/RequestRetryPolicyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public final class RequestRetryPolicyKtKt {
    @l
    @i(name = "-initializerequestRetryPolicy")
    public static final RequestRetryPolicy -initializerequestRetryPolicy(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$RequestRetryPolicy$Builder0 = RequestRetryPolicy.newBuilder();
        L.o(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0, "newBuilder()");
        Dsl requestRetryPolicyKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$RequestRetryPolicy$Builder0);
        function10.invoke(requestRetryPolicyKt$Dsl0);
        return requestRetryPolicyKt$Dsl0._build();
    }

    @l
    public static final RequestRetryPolicy copy(@l RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$RequestRetryPolicy0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$RequestRetryPolicy0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl requestRetryPolicyKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(requestRetryPolicyKt$Dsl0);
        return requestRetryPolicyKt$Dsl0._build();
    }
}

