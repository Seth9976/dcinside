package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nStringValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValueKt.kt\ncom/google/protobuf/StringValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class StringValueKtKt {
    @l
    @i(name = "-initializestringValue")
    public static final StringValue -initializestringValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder stringValue$Builder0 = StringValue.newBuilder();
        L.o(stringValue$Builder0, "newBuilder()");
        Dsl stringValueKt$Dsl0 = Dsl.Companion._create(stringValue$Builder0);
        function10.invoke(stringValueKt$Dsl0);
        return stringValueKt$Dsl0._build();
    }

    @l
    public static final StringValue copy(@l StringValue stringValue0, @l Function1 function10) {
        L.p(stringValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = stringValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl stringValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(stringValueKt$Dsl0);
        return stringValueKt$Dsl0._build();
    }
}

