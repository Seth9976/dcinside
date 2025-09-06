package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nPlacementKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlacementKt.kt\ngatewayprotocol/v1/PlacementKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class PlacementKtKt {
    @l
    @i(name = "-initializeplacement")
    public static final Placement -initializeplacement(@l Function1 function10) {
        L.p(function10, "block");
        Builder initializationResponseOuterClass$Placement$Builder0 = Placement.newBuilder();
        L.o(initializationResponseOuterClass$Placement$Builder0, "newBuilder()");
        Dsl placementKt$Dsl0 = Dsl.Companion._create(initializationResponseOuterClass$Placement$Builder0);
        function10.invoke(placementKt$Dsl0);
        return placementKt$Dsl0._build();
    }

    @l
    public static final Placement copy(@l Placement initializationResponseOuterClass$Placement0, @l Function1 function10) {
        L.p(initializationResponseOuterClass$Placement0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = initializationResponseOuterClass$Placement0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl placementKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(placementKt$Dsl0);
        return placementKt$Dsl0._build();
    }
}

