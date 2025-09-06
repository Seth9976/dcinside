package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nRequestPolicyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestPolicyKt.kt\ngatewayprotocol/v1/RequestPolicyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class RequestPolicyKtKt {
    @l
    @i(name = "-initializerequestPolicy")
    public static final RequestPolicy -initializerequestPolicy(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$RequestPolicy$Builder0 = RequestPolicy.newBuilder();
        L.o(nativeConfigurationOuterClass$RequestPolicy$Builder0, "newBuilder()");
        Dsl requestPolicyKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$RequestPolicy$Builder0);
        function10.invoke(requestPolicyKt$Dsl0);
        return requestPolicyKt$Dsl0._build();
    }

    @l
    public static final RequestPolicy copy(@l RequestPolicy nativeConfigurationOuterClass$RequestPolicy0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$RequestPolicy0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$RequestPolicy0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl requestPolicyKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(requestPolicyKt$Dsl0);
        return requestPolicyKt$Dsl0._build();
    }

    @m
    public static final RequestRetryPolicy getRetryPolicyOrNull(@l RequestPolicyOrBuilder nativeConfigurationOuterClass$RequestPolicyOrBuilder0) {
        L.p(nativeConfigurationOuterClass$RequestPolicyOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$RequestPolicyOrBuilder0.hasRetryPolicy() ? nativeConfigurationOuterClass$RequestPolicyOrBuilder0.getRetryPolicy() : null;
    }

    @m
    public static final RequestTimeoutPolicy getTimeoutPolicyOrNull(@l RequestPolicyOrBuilder nativeConfigurationOuterClass$RequestPolicyOrBuilder0) {
        L.p(nativeConfigurationOuterClass$RequestPolicyOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$RequestPolicyOrBuilder0.hasTimeoutPolicy() ? nativeConfigurationOuterClass$RequestPolicyOrBuilder0.getTimeoutPolicy() : null;
    }
}

