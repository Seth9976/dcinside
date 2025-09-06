package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nInt32ValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Int32ValueKt.kt\ncom/google/protobuf/Int32ValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class Int32ValueKtKt {
    @l
    @i(name = "-initializeint32Value")
    public static final Int32Value -initializeint32Value(@l Function1 function10) {
        L.p(function10, "block");
        Builder int32Value$Builder0 = Int32Value.newBuilder();
        L.o(int32Value$Builder0, "newBuilder()");
        Dsl int32ValueKt$Dsl0 = Dsl.Companion._create(int32Value$Builder0);
        function10.invoke(int32ValueKt$Dsl0);
        return int32ValueKt$Dsl0._build();
    }

    @l
    public static final Int32Value copy(@l Int32Value int32Value0, @l Function1 function10) {
        L.p(int32Value0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = int32Value0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl int32ValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(int32ValueKt$Dsl0);
        return int32ValueKt$Dsl0._build();
    }
}

