package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nFieldKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldKt.kt\ncom/google/protobuf/FieldKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class FieldKtKt {
    @l
    @i(name = "-initializefield")
    public static final Field -initializefield(@l Function1 function10) {
        L.p(function10, "block");
        Builder field$Builder0 = Field.newBuilder();
        L.o(field$Builder0, "newBuilder()");
        Dsl fieldKt$Dsl0 = Dsl.Companion._create(field$Builder0);
        function10.invoke(fieldKt$Dsl0);
        return fieldKt$Dsl0._build();
    }

    @l
    public static final Field copy(@l Field field0, @l Function1 function10) {
        L.p(field0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = field0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl fieldKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(fieldKt$Dsl0);
        return fieldKt$Dsl0._build();
    }
}

