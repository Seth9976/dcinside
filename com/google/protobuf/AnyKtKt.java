package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nAnyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnyKt.kt\ncom/google/protobuf/AnyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class AnyKtKt {
    @l
    @i(name = "-initializeany")
    public static final Any -initializeany(@l Function1 function10) {
        L.p(function10, "block");
        Builder any$Builder0 = Any.newBuilder();
        L.o(any$Builder0, "newBuilder()");
        Dsl anyKt$Dsl0 = Dsl.Companion._create(any$Builder0);
        function10.invoke(anyKt$Dsl0);
        return anyKt$Dsl0._build();
    }

    @l
    public static final Any copy(@l Any any0, @l Function1 function10) {
        L.p(any0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = any0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl anyKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(anyKt$Dsl0);
        return anyKt$Dsl0._build();
    }
}

