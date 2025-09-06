package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nFieldMaskKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldMaskKt.kt\ncom/google/protobuf/FieldMaskKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class FieldMaskKtKt {
    @l
    @i(name = "-initializefieldMask")
    public static final FieldMask -initializefieldMask(@l Function1 function10) {
        L.p(function10, "block");
        Builder fieldMask$Builder0 = FieldMask.newBuilder();
        L.o(fieldMask$Builder0, "newBuilder()");
        Dsl fieldMaskKt$Dsl0 = Dsl.Companion._create(fieldMask$Builder0);
        function10.invoke(fieldMaskKt$Dsl0);
        return fieldMaskKt$Dsl0._build();
    }

    @l
    public static final FieldMask copy(@l FieldMask fieldMask0, @l Function1 function10) {
        L.p(fieldMask0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = fieldMask0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl fieldMaskKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(fieldMaskKt$Dsl0);
        return fieldMaskKt$Dsl0._build();
    }
}

