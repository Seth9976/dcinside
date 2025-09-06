package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nTimestampKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimestampKt.kt\ncom/google/protobuf/TimestampKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class TimestampKtKt {
    @l
    @i(name = "-initializetimestamp")
    public static final Timestamp -initializetimestamp(@l Function1 function10) {
        L.p(function10, "block");
        Builder timestamp$Builder0 = Timestamp.newBuilder();
        L.o(timestamp$Builder0, "newBuilder()");
        Dsl timestampKt$Dsl0 = Dsl.Companion._create(timestamp$Builder0);
        function10.invoke(timestampKt$Dsl0);
        return timestampKt$Dsl0._build();
    }

    @l
    public static final Timestamp copy(@l Timestamp timestamp0, @l Function1 function10) {
        L.p(timestamp0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = timestamp0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl timestampKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(timestampKt$Dsl0);
        return timestampKt$Dsl0._build();
    }
}

