package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nCachedAssetsConfigurationKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedAssetsConfigurationKt.kt\ngatewayprotocol/v1/CachedAssetsConfigurationKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class CachedAssetsConfigurationKtKt {
    @l
    @i(name = "-initializecachedAssetsConfiguration")
    public static final CachedAssetsConfiguration -initializecachedAssetsConfiguration(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0 = CachedAssetsConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0, "newBuilder()");
        Dsl cachedAssetsConfigurationKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0);
        function10.invoke(cachedAssetsConfigurationKt$Dsl0);
        return cachedAssetsConfigurationKt$Dsl0._build();
    }

    @l
    public static final CachedAssetsConfiguration copy(@l CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$CachedAssetsConfiguration0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$CachedAssetsConfiguration0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl cachedAssetsConfigurationKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(cachedAssetsConfigurationKt$Dsl0);
        return cachedAssetsConfigurationKt$Dsl0._build();
    }
}

