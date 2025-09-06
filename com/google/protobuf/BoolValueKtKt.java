package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nBoolValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoolValueKt.kt\ncom/google/protobuf/BoolValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class BoolValueKtKt {
    @l
    @i(name = "-initializeboolValue")
    public static final BoolValue -initializeboolValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder boolValue$Builder0 = BoolValue.newBuilder();
        L.o(boolValue$Builder0, "newBuilder()");
        Dsl boolValueKt$Dsl0 = Dsl.Companion._create(boolValue$Builder0);
        function10.invoke(boolValueKt$Dsl0);
        return boolValueKt$Dsl0._build();
    }

    @l
    public static final BoolValue copy(@l BoolValue boolValue0, @l Function1 function10) {
        L.p(boolValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = boolValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl boolValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(boolValueKt$Dsl0);
        return boolValueKt$Dsl0._build();
    }
}

