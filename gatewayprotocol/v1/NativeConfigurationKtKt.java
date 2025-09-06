package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nNativeConfigurationKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeConfigurationKt.kt\ngatewayprotocol/v1/NativeConfigurationKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n1#2:600\n*E\n"})
public final class NativeConfigurationKtKt {
    @l
    @i(name = "-initializenativeConfiguration")
    public static final NativeConfiguration -initializenativeConfiguration(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$NativeConfiguration$Builder0 = NativeConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$NativeConfiguration$Builder0, "newBuilder()");
        Dsl nativeConfigurationKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$NativeConfiguration$Builder0);
        function10.invoke(nativeConfigurationKt$Dsl0);
        return nativeConfigurationKt$Dsl0._build();
    }

    @l
    public static final NativeConfiguration copy(@l NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$NativeConfiguration0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$NativeConfiguration0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl nativeConfigurationKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(nativeConfigurationKt$Dsl0);
        return nativeConfigurationKt$Dsl0._build();
    }

    @m
    public static final AdOperationsConfiguration getAdOperationsOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasAdOperations() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getAdOperations() : null;
    }

    @m
    public static final RequestPolicy getAdPolicyOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasAdPolicy() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getAdPolicy() : null;
    }

    @m
    public static final CachedAssetsConfiguration getCachedAssetsConfigurationOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasCachedAssetsConfiguration() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getCachedAssetsConfiguration() : null;
    }

    @m
    public static final DiagnosticEventsConfiguration getDiagnosticEventsOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasDiagnosticEvents() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getDiagnosticEvents() : null;
    }

    @m
    public static final FeatureFlags getFeatureFlagsOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasFeatureFlags() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getFeatureFlags() : null;
    }

    @m
    public static final RequestPolicy getInitPolicyOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasInitPolicy() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getInitPolicy() : null;
    }

    @m
    public static final RequestPolicy getOperativeEventPolicyOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasOperativeEventPolicy() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getOperativeEventPolicy() : null;
    }

    @m
    public static final RequestPolicy getOtherPolicyOrNull(@l NativeConfigurationOrBuilder nativeConfigurationOuterClass$NativeConfigurationOrBuilder0) {
        L.p(nativeConfigurationOuterClass$NativeConfigurationOrBuilder0, "<this>");
        return nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.hasOtherPolicy() ? nativeConfigurationOuterClass$NativeConfigurationOrBuilder0.getOtherPolicy() : null;
    }
}

