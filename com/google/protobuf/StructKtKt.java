package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nStructKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StructKt.kt\ncom/google/protobuf/StructKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class StructKtKt {
    @l
    @i(name = "-initializestruct")
    public static final Struct -initializestruct(@l Function1 function10) {
        L.p(function10, "block");
        Builder struct$Builder0 = Struct.newBuilder();
        L.o(struct$Builder0, "newBuilder()");
        Dsl structKt$Dsl0 = Dsl.Companion._create(struct$Builder0);
        function10.invoke(structKt$Dsl0);
        return structKt$Dsl0._build();
    }

    @l
    public static final Struct copy(@l Struct struct0, @l Function1 function10) {
        L.p(struct0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = struct0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl structKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(structKt$Dsl0);
        return structKt$Dsl0._build();
    }
}

