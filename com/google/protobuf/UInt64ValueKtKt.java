package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nUInt64ValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UInt64ValueKt.kt\ncom/google/protobuf/UInt64ValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class UInt64ValueKtKt {
    @l
    @i(name = "-initializeuInt64Value")
    public static final UInt64Value -initializeuInt64Value(@l Function1 function10) {
        L.p(function10, "block");
        Builder uInt64Value$Builder0 = UInt64Value.newBuilder();
        L.o(uInt64Value$Builder0, "newBuilder()");
        Dsl uInt64ValueKt$Dsl0 = Dsl.Companion._create(uInt64Value$Builder0);
        function10.invoke(uInt64ValueKt$Dsl0);
        return uInt64ValueKt$Dsl0._build();
    }

    @l
    public static final UInt64Value copy(@l UInt64Value uInt64Value0, @l Function1 function10) {
        L.p(uInt64Value0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = uInt64Value0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl uInt64ValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(uInt64ValueKt$Dsl0);
        return uInt64ValueKt$Dsl0._build();
    }
}

