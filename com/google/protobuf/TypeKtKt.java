package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nTypeKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeKt.kt\ncom/google/protobuf/TypeKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
public final class TypeKtKt {
    @l
    @i(name = "-initializetype")
    public static final Type -initializetype(@l Function1 function10) {
        L.p(function10, "block");
        Builder type$Builder0 = Type.newBuilder();
        L.o(type$Builder0, "newBuilder()");
        Dsl typeKt$Dsl0 = Dsl.Companion._create(type$Builder0);
        function10.invoke(typeKt$Dsl0);
        return typeKt$Dsl0._build();
    }

    @l
    public static final Type copy(@l Type type0, @l Function1 function10) {
        L.p(type0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = type0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl typeKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(typeKt$Dsl0);
        return typeKt$Dsl0._build();
    }

    @m
    public static final SourceContext getSourceContextOrNull(@l TypeOrBuilder typeOrBuilder0) {
        L.p(typeOrBuilder0, "<this>");
        return typeOrBuilder0.hasSourceContext() ? typeOrBuilder0.getSourceContext() : null;
    }
}

