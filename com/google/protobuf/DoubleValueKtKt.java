package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDoubleValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleValueKt.kt\ncom/google/protobuf/DoubleValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class DoubleValueKtKt {
    @l
    @i(name = "-initializedoubleValue")
    public static final DoubleValue -initializedoubleValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder doubleValue$Builder0 = DoubleValue.newBuilder();
        L.o(doubleValue$Builder0, "newBuilder()");
        Dsl doubleValueKt$Dsl0 = Dsl.Companion._create(doubleValue$Builder0);
        function10.invoke(doubleValueKt$Dsl0);
        return doubleValueKt$Dsl0._build();
    }

    @l
    public static final DoubleValue copy(@l DoubleValue doubleValue0, @l Function1 function10) {
        L.p(doubleValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = doubleValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl doubleValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(doubleValueKt$Dsl0);
        return doubleValueKt$Dsl0._build();
    }
}

