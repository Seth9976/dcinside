package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nTestDataKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestDataKt.kt\ngatewayprotocol/v1/TestDataKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public final class TestDataKtKt {
    @l
    @i(name = "-initializetestData")
    public static final TestData -initializetestData(@l Function1 function10) {
        L.p(function10, "block");
        Builder testDataOuterClass$TestData$Builder0 = TestData.newBuilder();
        L.o(testDataOuterClass$TestData$Builder0, "newBuilder()");
        Dsl testDataKt$Dsl0 = Dsl.Companion._create(testDataOuterClass$TestData$Builder0);
        function10.invoke(testDataKt$Dsl0);
        return testDataKt$Dsl0._build();
    }

    @l
    public static final TestData copy(@l TestData testDataOuterClass$TestData0, @l Function1 function10) {
        L.p(testDataOuterClass$TestData0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = testDataOuterClass$TestData0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl testDataKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(testDataKt$Dsl0);
        return testDataKt$Dsl0._build();
    }
}

