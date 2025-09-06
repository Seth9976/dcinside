package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nInt64ValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Int64ValueKt.kt\ncom/google/protobuf/Int64ValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class Int64ValueKtKt {
    @l
    @i(name = "-initializeint64Value")
    public static final Int64Value -initializeint64Value(@l Function1 function10) {
        L.p(function10, "block");
        Builder int64Value$Builder0 = Int64Value.newBuilder();
        L.o(int64Value$Builder0, "newBuilder()");
        Dsl int64ValueKt$Dsl0 = Dsl.Companion._create(int64Value$Builder0);
        function10.invoke(int64ValueKt$Dsl0);
        return int64ValueKt$Dsl0._build();
    }

    @l
    public static final Int64Value copy(@l Int64Value int64Value0, @l Function1 function10) {
        L.p(int64Value0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = int64Value0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl int64ValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(int64ValueKt$Dsl0);
        return int64ValueKt$Dsl0._build();
    }
}

