package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nTransactionEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionEventRequestKt.kt\ngatewayprotocol/v1/TransactionEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class TransactionEventRequestKtKt {
    @l
    @i(name = "-initializetransactionEventRequest")
    public static final TransactionEventRequest -initializetransactionEventRequest(@l Function1 function10) {
        L.p(function10, "block");
        Builder transactionEventRequestOuterClass$TransactionEventRequest$Builder0 = TransactionEventRequest.newBuilder();
        L.o(transactionEventRequestOuterClass$TransactionEventRequest$Builder0, "newBuilder()");
        Dsl transactionEventRequestKt$Dsl0 = Dsl.Companion._create(transactionEventRequestOuterClass$TransactionEventRequest$Builder0);
        function10.invoke(transactionEventRequestKt$Dsl0);
        return transactionEventRequestKt$Dsl0._build();
    }

    @l
    public static final TransactionEventRequest copy(@l TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0, @l Function1 function10) {
        L.p(transactionEventRequestOuterClass$TransactionEventRequest0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = transactionEventRequestOuterClass$TransactionEventRequest0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl transactionEventRequestKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(transactionEventRequestKt$Dsl0);
        return transactionEventRequestKt$Dsl0._build();
    }

    @m
    public static final DynamicDeviceInfo getDynamicDeviceInfoOrNull(@l TransactionEventRequestOrBuilder transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0) {
        L.p(transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0, "<this>");
        return transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0.hasDynamicDeviceInfo() ? transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0.getDynamicDeviceInfo() : null;
    }

    @m
    public static final StaticDeviceInfo getStaticDeviceInfoOrNull(@l TransactionEventRequestOrBuilder transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0) {
        L.p(transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0, "<this>");
        return transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0.hasStaticDeviceInfo() ? transactionEventRequestOuterClass$TransactionEventRequestOrBuilder0.getStaticDeviceInfo() : null;
    }
}

