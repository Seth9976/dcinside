package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nListValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListValueKt.kt\ncom/google/protobuf/ListValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class ListValueKtKt {
    @l
    @i(name = "-initializelistValue")
    public static final ListValue -initializelistValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder listValue$Builder0 = ListValue.newBuilder();
        L.o(listValue$Builder0, "newBuilder()");
        Dsl listValueKt$Dsl0 = Dsl.Companion._create(listValue$Builder0);
        function10.invoke(listValueKt$Dsl0);
        return listValueKt$Dsl0._build();
    }

    @l
    public static final ListValue copy(@l ListValue listValue0, @l Function1 function10) {
        L.p(listValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = listValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl listValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(listValueKt$Dsl0);
        return listValueKt$Dsl0._build();
    }
}

