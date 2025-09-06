package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nFloatValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatValueKt.kt\ncom/google/protobuf/FloatValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class FloatValueKtKt {
    @l
    @i(name = "-initializefloatValue")
    public static final FloatValue -initializefloatValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder floatValue$Builder0 = FloatValue.newBuilder();
        L.o(floatValue$Builder0, "newBuilder()");
        Dsl floatValueKt$Dsl0 = Dsl.Companion._create(floatValue$Builder0);
        function10.invoke(floatValueKt$Dsl0);
        return floatValueKt$Dsl0._build();
    }

    @l
    public static final FloatValue copy(@l FloatValue floatValue0, @l Function1 function10) {
        L.p(floatValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = floatValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl floatValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(floatValueKt$Dsl0);
        return floatValueKt$Dsl0._build();
    }
}

