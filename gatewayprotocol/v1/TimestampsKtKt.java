package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nTimestampsKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimestampsKt.kt\ngatewayprotocol/v1/TimestampsKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class TimestampsKtKt {
    @l
    @i(name = "-initializetimestamps")
    public static final Timestamps -initializetimestamps(@l Function1 function10) {
        L.p(function10, "block");
        Builder timestampsOuterClass$Timestamps$Builder0 = Timestamps.newBuilder();
        L.o(timestampsOuterClass$Timestamps$Builder0, "newBuilder()");
        Dsl timestampsKt$Dsl0 = Dsl.Companion._create(timestampsOuterClass$Timestamps$Builder0);
        function10.invoke(timestampsKt$Dsl0);
        return timestampsKt$Dsl0._build();
    }

    @l
    public static final Timestamps copy(@l Timestamps timestampsOuterClass$Timestamps0, @l Function1 function10) {
        L.p(timestampsOuterClass$Timestamps0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = timestampsOuterClass$Timestamps0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl timestampsKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(timestampsKt$Dsl0);
        return timestampsKt$Dsl0._build();
    }

    @m
    public static final Timestamp getTimestampOrNull(@l TimestampsOrBuilder timestampsOuterClass$TimestampsOrBuilder0) {
        L.p(timestampsOuterClass$TimestampsOrBuilder0, "<this>");
        return timestampsOuterClass$TimestampsOrBuilder0.hasTimestamp() ? timestampsOuterClass$TimestampsOrBuilder0.getTimestamp() : null;
    }
}

