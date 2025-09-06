package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nEnumKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumKt.kt\ncom/google/protobuf/EnumKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
public final class EnumKtKt {
    @l
    @i(name = "-initializeenum")
    public static final Enum -initializeenum(@l Function1 function10) {
        L.p(function10, "block");
        Builder enum$Builder0 = Enum.newBuilder();
        L.o(enum$Builder0, "newBuilder()");
        Dsl enumKt$Dsl0 = Dsl.Companion._create(enum$Builder0);
        function10.invoke(enumKt$Dsl0);
        return enumKt$Dsl0._build();
    }

    @l
    public static final Enum copy(@l Enum enum0, @l Function1 function10) {
        L.p(enum0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = enum0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl enumKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(enumKt$Dsl0);
        return enumKt$Dsl0._build();
    }

    @m
    public static final SourceContext getSourceContextOrNull(@l EnumOrBuilder enumOrBuilder0) {
        L.p(enumOrBuilder0, "<this>");
        return enumOrBuilder0.hasSourceContext() ? enumOrBuilder0.getSourceContext() : null;
    }
}

