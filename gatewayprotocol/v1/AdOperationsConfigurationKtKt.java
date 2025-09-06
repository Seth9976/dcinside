package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nAdOperationsConfigurationKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdOperationsConfigurationKt.kt\ngatewayprotocol/v1/AdOperationsConfigurationKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class AdOperationsConfigurationKtKt {
    @l
    @i(name = "-initializeadOperationsConfiguration")
    public static final AdOperationsConfiguration -initializeadOperationsConfiguration(@l Function1 function10) {
        L.p(function10, "block");
        Builder nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0 = AdOperationsConfiguration.newBuilder();
        L.o(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0, "newBuilder()");
        Dsl adOperationsConfigurationKt$Dsl0 = Dsl.Companion._create(nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0);
        function10.invoke(adOperationsConfigurationKt$Dsl0);
        return adOperationsConfigurationKt$Dsl0._build();
    }

    @l
    public static final AdOperationsConfiguration copy(@l AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0, @l Function1 function10) {
        L.p(nativeConfigurationOuterClass$AdOperationsConfiguration0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = nativeConfigurationOuterClass$AdOperationsConfiguration0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl adOperationsConfigurationKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(adOperationsConfigurationKt$Dsl0);
        return adOperationsConfigurationKt$Dsl0._build();
    }
}

