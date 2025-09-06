package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueKt.kt\ncom/google/protobuf/ValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
public final class ValueKtKt {
    @l
    @i(name = "-initializevalue")
    public static final Value -initializevalue(@l Function1 function10) {
        L.p(function10, "block");
        Builder value$Builder0 = Value.newBuilder();
        L.o(value$Builder0, "newBuilder()");
        Dsl valueKt$Dsl0 = Dsl.Companion._create(value$Builder0);
        function10.invoke(valueKt$Dsl0);
        return valueKt$Dsl0._build();
    }

    @l
    public static final Value copy(@l Value value0, @l Function1 function10) {
        L.p(value0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = value0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl valueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(valueKt$Dsl0);
        return valueKt$Dsl0._build();
    }

    @m
    public static final ListValue getListValueOrNull(@l ValueOrBuilder valueOrBuilder0) {
        L.p(valueOrBuilder0, "<this>");
        return valueOrBuilder0.hasListValue() ? valueOrBuilder0.getListValue() : null;
    }

    @m
    public static final Struct getStructValueOrNull(@l ValueOrBuilder valueOrBuilder0) {
        L.p(valueOrBuilder0, "<this>");
        return valueOrBuilder0.hasStructValue() ? valueOrBuilder0.getStructValue() : null;
    }
}

