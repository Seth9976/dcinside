package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nFeatureFlagsKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsKt.kt\ngatewayprotocol/v1/FeatureFlagsKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public final class FeatureFlagsKtKt {
    @l
    @i(name = "-initializefeatureFlags")
    public static final FeatureFlags -initializefeatureFlags(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$FeatureFlags$Builder0 = FeatureFlags.newBuilder();
        L.o(nativeConfigurationOuterClass$FeatureFlags$Builder0, "newBuilder()");
        Dsl featureFlagsKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$FeatureFlags$Builder0);
        function10.invoke(featureFlagsKt$Dsl0);
        return featureFlagsKt$Dsl0._build();
    }

    @l
    public static final FeatureFlags copy(@l FeatureFlags nativeConfigurationOuterClass$FeatureFlags0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$FeatureFlags0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$FeatureFlags0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl featureFlagsKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(featureFlagsKt$Dsl0);
        return featureFlagsKt$Dsl0._build();
    }
}

