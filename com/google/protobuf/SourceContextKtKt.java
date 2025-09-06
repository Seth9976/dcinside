package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nSourceContextKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceContextKt.kt\ncom/google/protobuf/SourceContextKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class SourceContextKtKt {
    @l
    @i(name = "-initializesourceContext")
    public static final SourceContext -initializesourceContext(@l Function1 function10) {
        L.p(function10, "block");
        Builder sourceContext$Builder0 = SourceContext.newBuilder();
        L.o(sourceContext$Builder0, "newBuilder()");
        Dsl sourceContextKt$Dsl0 = Dsl.Companion._create(sourceContext$Builder0);
        function10.invoke(sourceContextKt$Dsl0);
        return sourceContextKt$Dsl0._build();
    }

    @l
    public static final SourceContext copy(@l SourceContext sourceContext0, @l Function1 function10) {
        L.p(sourceContext0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = sourceContext0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl sourceContextKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(sourceContextKt$Dsl0);
        return sourceContextKt$Dsl0._build();
    }
}

