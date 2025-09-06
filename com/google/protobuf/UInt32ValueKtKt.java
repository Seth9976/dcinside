package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nUInt32ValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UInt32ValueKt.kt\ncom/google/protobuf/UInt32ValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class UInt32ValueKtKt {
    @l
    @i(name = "-initializeuInt32Value")
    public static final UInt32Value -initializeuInt32Value(@l Function1 function10) {
        L.p(function10, "block");
        Builder uInt32Value$Builder0 = UInt32Value.newBuilder();
        L.o(uInt32Value$Builder0, "newBuilder()");
        Dsl uInt32ValueKt$Dsl0 = Dsl.Companion._create(uInt32Value$Builder0);
        function10.invoke(uInt32ValueKt$Dsl0);
        return uInt32ValueKt$Dsl0._build();
    }

    @l
    public static final UInt32Value copy(@l UInt32Value uInt32Value0, @l Function1 function10) {
        L.p(uInt32Value0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = uInt32Value0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl uInt32ValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(uInt32ValueKt$Dsl0);
        return uInt32ValueKt$Dsl0._build();
    }
}

