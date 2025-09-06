package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nOptionKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionKt.kt\ncom/google/protobuf/OptionKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class OptionKtKt {
    @l
    @i(name = "-initializeoption")
    public static final Option -initializeoption(@l Function1 function10) {
        L.p(function10, "block");
        Builder option$Builder0 = Option.newBuilder();
        L.o(option$Builder0, "newBuilder()");
        Dsl optionKt$Dsl0 = Dsl.Companion._create(option$Builder0);
        function10.invoke(optionKt$Dsl0);
        return optionKt$Dsl0._build();
    }

    @l
    public static final Option copy(@l Option option0, @l Function1 function10) {
        L.p(option0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = option0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl optionKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(optionKt$Dsl0);
        return optionKt$Dsl0._build();
    }

    @m
    public static final Any getValueOrNull(@l OptionOrBuilder optionOrBuilder0) {
        L.p(optionOrBuilder0, "<this>");
        return optionOrBuilder0.hasValue() ? optionOrBuilder0.getValue() : null;
    }
}

