package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nMethodKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodKt.kt\ncom/google/protobuf/MethodKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class MethodKtKt {
    @l
    @i(name = "-initializemethod")
    public static final Method -initializemethod(@l Function1 function10) {
        L.p(function10, "block");
        Builder method$Builder0 = Method.newBuilder();
        L.o(method$Builder0, "newBuilder()");
        Dsl methodKt$Dsl0 = Dsl.Companion._create(method$Builder0);
        function10.invoke(methodKt$Dsl0);
        return methodKt$Dsl0._build();
    }

    @l
    public static final Method copy(@l Method method0, @l Function1 function10) {
        L.p(method0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = method0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl methodKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(methodKt$Dsl0);
        return methodKt$Dsl0._build();
    }
}

