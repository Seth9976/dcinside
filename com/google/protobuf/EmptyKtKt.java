package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nEmptyKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyKt.kt\ncom/google/protobuf/EmptyKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class EmptyKtKt {
    @l
    @i(name = "-initializeempty")
    public static final Empty -initializeempty(@l Function1 function10) {
        L.p(function10, "block");
        Builder empty$Builder0 = Empty.newBuilder();
        L.o(empty$Builder0, "newBuilder()");
        Dsl emptyKt$Dsl0 = Dsl.Companion._create(empty$Builder0);
        function10.invoke(emptyKt$Dsl0);
        return emptyKt$Dsl0._build();
    }

    @l
    public static final Empty copy(@l Empty empty0, @l Function1 function10) {
        L.p(empty0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = empty0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl emptyKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(emptyKt$Dsl0);
        return emptyKt$Dsl0._build();
    }
}

