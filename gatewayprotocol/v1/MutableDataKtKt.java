package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nMutableDataKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableDataKt.kt\ngatewayprotocol/v1/MutableDataKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public final class MutableDataKtKt {
    @l
    @i(name = "-initializemutableData")
    public static final MutableData -initializemutableData(@l Function1 function10) {
        L.p(function10, "block");
        Builder mutableDataOuterClass$MutableData$Builder0 = MutableData.newBuilder();
        L.o(mutableDataOuterClass$MutableData$Builder0, "newBuilder()");
        Dsl mutableDataKt$Dsl0 = Dsl.Companion._create(mutableDataOuterClass$MutableData$Builder0);
        function10.invoke(mutableDataKt$Dsl0);
        return mutableDataKt$Dsl0._build();
    }

    @l
    public static final MutableData copy(@l MutableData mutableDataOuterClass$MutableData0, @l Function1 function10) {
        L.p(mutableDataOuterClass$MutableData0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = mutableDataOuterClass$MutableData0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl mutableDataKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(mutableDataKt$Dsl0);
        return mutableDataKt$Dsl0._build();
    }

    @m
    public static final AllowedPii getAllowedPiiOrNull(@l MutableDataOrBuilder mutableDataOuterClass$MutableDataOrBuilder0) {
        L.p(mutableDataOuterClass$MutableDataOrBuilder0, "<this>");
        return mutableDataOuterClass$MutableDataOrBuilder0.hasAllowedPii() ? mutableDataOuterClass$MutableDataOrBuilder0.getAllowedPii() : null;
    }

    @m
    public static final SessionCounters getSessionCountersOrNull(@l MutableDataOrBuilder mutableDataOuterClass$MutableDataOrBuilder0) {
        L.p(mutableDataOuterClass$MutableDataOrBuilder0, "<this>");
        return mutableDataOuterClass$MutableDataOrBuilder0.hasSessionCounters() ? mutableDataOuterClass$MutableDataOrBuilder0.getSessionCounters() : null;
    }
}

