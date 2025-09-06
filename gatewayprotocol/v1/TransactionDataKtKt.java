package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nTransactionDataKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionDataKt.kt\ngatewayprotocol/v1/TransactionDataKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
public final class TransactionDataKtKt {
    @l
    @i(name = "-initializetransactionData")
    public static final TransactionData -initializetransactionData(@l Function1 function10) {
        L.p(function10, "block");
        Builder transactionEventRequestOuterClass$TransactionData$Builder0 = TransactionData.newBuilder();
        L.o(transactionEventRequestOuterClass$TransactionData$Builder0, "newBuilder()");
        Dsl transactionDataKt$Dsl0 = Dsl.Companion._create(transactionEventRequestOuterClass$TransactionData$Builder0);
        function10.invoke(transactionDataKt$Dsl0);
        return transactionDataKt$Dsl0._build();
    }

    @l
    public static final TransactionData copy(@l TransactionData transactionEventRequestOuterClass$TransactionData0, @l Function1 function10) {
        L.p(transactionEventRequestOuterClass$TransactionData0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = transactionEventRequestOuterClass$TransactionData0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl transactionDataKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(transactionDataKt$Dsl0);
        return transactionDataKt$Dsl0._build();
    }

    @m
    public static final Timestamp getTimestampOrNull(@l TransactionDataOrBuilder transactionEventRequestOuterClass$TransactionDataOrBuilder0) {
        L.p(transactionEventRequestOuterClass$TransactionDataOrBuilder0, "<this>");
        return transactionEventRequestOuterClass$TransactionDataOrBuilder0.hasTimestamp() ? transactionEventRequestOuterClass$TransactionDataOrBuilder0.getTimestamp() : null;
    }
}

