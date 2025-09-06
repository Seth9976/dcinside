package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nDurationKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationKt.kt\ncom/google/protobuf/DurationKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class DurationKtKt {
    @l
    @i(name = "-initializeduration")
    public static final Duration -initializeduration(@l Function1 function10) {
        L.p(function10, "block");
        Builder duration$Builder0 = Duration.newBuilder();
        L.o(duration$Builder0, "newBuilder()");
        Dsl durationKt$Dsl0 = Dsl.Companion._create(duration$Builder0);
        function10.invoke(durationKt$Dsl0);
        return durationKt$Dsl0._build();
    }

    @l
    public static final Duration copy(@l Duration duration0, @l Function1 function10) {
        L.p(duration0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = duration0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl durationKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(durationKt$Dsl0);
        return durationKt$Dsl0._build();
    }
}

