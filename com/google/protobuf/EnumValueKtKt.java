package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nEnumValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumValueKt.kt\ncom/google/protobuf/EnumValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class EnumValueKtKt {
    @l
    @i(name = "-initializeenumValue")
    public static final EnumValue -initializeenumValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder enumValue$Builder0 = EnumValue.newBuilder();
        L.o(enumValue$Builder0, "newBuilder()");
        Dsl enumValueKt$Dsl0 = Dsl.Companion._create(enumValue$Builder0);
        function10.invoke(enumValueKt$Dsl0);
        return enumValueKt$Dsl0._build();
    }

    @l
    public static final EnumValue copy(@l EnumValue enumValue0, @l Function1 function10) {
        L.p(enumValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = enumValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl enumValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(enumValueKt$Dsl0);
        return enumValueKt$Dsl0._build();
    }
}

