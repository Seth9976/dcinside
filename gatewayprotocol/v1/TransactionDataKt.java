package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class TransactionDataKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder transactionEventRequestOuterClass$TransactionData$Builder0) {
                L.p(transactionEventRequestOuterClass$TransactionData$Builder0, "builder");
                return new Dsl(transactionEventRequestOuterClass$TransactionData$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder transactionEventRequestOuterClass$TransactionData$Builder0) {
            this._builder = transactionEventRequestOuterClass$TransactionData$Builder0;
        }

        public Dsl(Builder transactionEventRequestOuterClass$TransactionData$Builder0, w w0) {
            this(transactionEventRequestOuterClass$TransactionData$Builder0);
        }

        @b0
        public final TransactionData _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (TransactionData)generatedMessageLite0;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        @l
        @i(name = "getEventId")
        public final ByteString getEventId() {
            ByteString byteString0 = this._builder.getEventId();
            L.o(byteString0, "_builder.getEventId()");
            return byteString0;
        }

        @l
        @i(name = "getProduct")
        public final String getProduct() {
            String s = this._builder.getProduct();
            L.o(s, "_builder.getProduct()");
            return s;
        }

        @l
        @i(name = "getProductId")
        public final String getProductId() {
            String s = this._builder.getProductId();
            L.o(s, "_builder.getProductId()");
            return s;
        }

        @l
        @i(name = "getReceipt")
        public final String getReceipt() {
            String s = this._builder.getReceipt();
            L.o(s, "_builder.getReceipt()");
            return s;
        }

        @l
        @i(name = "getTimestamp")
        public final Timestamp getTimestamp() {
            Timestamp timestamp0 = this._builder.getTimestamp();
            L.o(timestamp0, "_builder.getTimestamp()");
            return timestamp0;
        }

        @l
        @i(name = "getTransaction")
        public final String getTransaction() {
            String s = this._builder.getTransaction();
            L.o(s, "_builder.getTransaction()");
            return s;
        }

        @l
        @i(name = "getTransactionId")
        public final String getTransactionId() {
            String s = this._builder.getTransactionId();
            L.o(s, "_builder.getTransactionId()");
            return s;
        }

        @l
        @i(name = "getTransactionState")
        public final TransactionState getTransactionState() {
            TransactionState transactionEventRequestOuterClass$TransactionState0 = this._builder.getTransactionState();
            L.o(transactionEventRequestOuterClass$TransactionState0, "_builder.getTransactionState()");
            return transactionEventRequestOuterClass$TransactionState0;
        }

        @i(name = "getTransactionStateValue")
        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        @i(name = "setEventId")
        public final void setEventId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setEventId(byteString0);
        }

        @i(name = "setProduct")
        public final void setProduct(@l String s) {
            L.p(s, "value");
            this._builder.setProduct(s);
        }

        @i(name = "setProductId")
        public final void setProductId(@l String s) {
            L.p(s, "value");
            this._builder.setProductId(s);
        }

        @i(name = "setReceipt")
        public final void setReceipt(@l String s) {
            L.p(s, "value");
            this._builder.setReceipt(s);
        }

        @i(name = "setTimestamp")
        public final void setTimestamp(@l Timestamp timestamp0) {
            L.p(timestamp0, "value");
            this._builder.setTimestamp(timestamp0);
        }

        @i(name = "setTransaction")
        public final void setTransaction(@l String s) {
            L.p(s, "value");
            this._builder.setTransaction(s);
        }

        @i(name = "setTransactionId")
        public final void setTransactionId(@l String s) {
            L.p(s, "value");
            this._builder.setTransactionId(s);
        }

        @i(name = "setTransactionState")
        public final void setTransactionState(@l TransactionState transactionEventRequestOuterClass$TransactionState0) {
            L.p(transactionEventRequestOuterClass$TransactionState0, "value");
            this._builder.setTransactionState(transactionEventRequestOuterClass$TransactionState0);
        }

        @i(name = "setTransactionStateValue")
        public final void setTransactionStateValue(int v) {
            this._builder.setTransactionStateValue(v);
        }
    }

    @l
    public static final TransactionDataKt INSTANCE;

    static {
        TransactionDataKt.INSTANCE = new TransactionDataKt();
    }
}

