package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nBytesValueKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BytesValueKt.kt\ncom/google/protobuf/BytesValueKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class BytesValueKtKt {
    @l
    @i(name = "-initializebytesValue")
    public static final BytesValue -initializebytesValue(@l Function1 function10) {
        L.p(function10, "block");
        Builder bytesValue$Builder0 = BytesValue.newBuilder();
        L.o(bytesValue$Builder0, "newBuilder()");
        Dsl bytesValueKt$Dsl0 = Dsl.Companion._create(bytesValue$Builder0);
        function10.invoke(bytesValueKt$Dsl0);
        return bytesValueKt$Dsl0._build();
    }

    @l
    public static final BytesValue copy(@l BytesValue bytesValue0, @l Function1 function10) {
        L.p(bytesValue0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = bytesValue0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl bytesValueKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(bytesValueKt$Dsl0);
        return bytesValueKt$Dsl0._build();
    }
}

