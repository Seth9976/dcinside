package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class TransactionEventRequestOuterClass {
    public static enum StoreType implements EnumLite {
        class a implements EnumLiteMap {
            a() {
                super();
            }

            public StoreType a(int v) {
                return StoreType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                b.a = new b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return StoreType.forNumber(v) != null;
            }
        }

        STORE_TYPE_UNSPECIFIED(0),
        STORE_TYPE_CUSTOM(1),
        STORE_TYPE_APPLE_APP_STORE(2),
        STORE_TYPE_GOOGLE_PLAY(3),
        UNRECOGNIZED(-1);

        public static final int STORE_TYPE_APPLE_APP_STORE_VALUE = 2;
        public static final int STORE_TYPE_CUSTOM_VALUE = 1;
        public static final int STORE_TYPE_GOOGLE_PLAY_VALUE = 3;
        public static final int STORE_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static StoreType[] $values() [...] // Inlined contents

        static {
            StoreType.internalValueMap = new a();
        }

        private StoreType(int v1) {
            this.value = v1;
        }

        public static StoreType forNumber(int v) {
            switch(v) {
                case 0: {
                    return StoreType.STORE_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return StoreType.STORE_TYPE_CUSTOM;
                }
                case 2: {
                    return StoreType.STORE_TYPE_APPLE_APP_STORE;
                }
                case 3: {
                    return StoreType.STORE_TYPE_GOOGLE_PLAY;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == StoreType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return StoreType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static StoreType valueOf(int v) {
            return StoreType.forNumber(v);
        }
    }

    public static final class TransactionData extends GeneratedMessageLite implements TransactionDataOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements TransactionDataOrBuilder {
            private Builder() {
                super(TransactionData.DEFAULT_INSTANCE);
            }

            Builder(gatewayprotocol.v1.TransactionEventRequestOuterClass.a transactionEventRequestOuterClass$a0) {
            }

            public Builder clearEventId() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearEventId();
                return this;
            }

            public Builder clearProduct() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearProduct();
                return this;
            }

            public Builder clearProductId() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearProductId();
                return this;
            }

            public Builder clearReceipt() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearReceipt();
                return this;
            }

            public Builder clearTimestamp() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTransaction() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTransaction();
                return this;
            }

            public Builder clearTransactionId() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTransactionId();
                return this;
            }

            public Builder clearTransactionState() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTransactionState();
                return this;
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public ByteString getEventId() {
                return ((TransactionData)this.instance).getEventId();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public String getProduct() {
                return ((TransactionData)this.instance).getProduct();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public ByteString getProductBytes() {
                return ((TransactionData)this.instance).getProductBytes();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public String getProductId() {
                return ((TransactionData)this.instance).getProductId();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public ByteString getProductIdBytes() {
                return ((TransactionData)this.instance).getProductIdBytes();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public String getReceipt() {
                return ((TransactionData)this.instance).getReceipt();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public ByteString getReceiptBytes() {
                return ((TransactionData)this.instance).getReceiptBytes();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public Timestamp getTimestamp() {
                return ((TransactionData)this.instance).getTimestamp();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public String getTransaction() {
                return ((TransactionData)this.instance).getTransaction();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public ByteString getTransactionBytes() {
                return ((TransactionData)this.instance).getTransactionBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public String getTransactionId() {
                return "";
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public ByteString getTransactionIdBytes() {
                return ((TransactionData)this.instance).getTransactionIdBytes();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public TransactionState getTransactionState() {
                return ((TransactionData)this.instance).getTransactionState();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public int getTransactionStateValue() {
                return ((TransactionData)this.instance).getTransactionStateValue();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public boolean hasReceipt() {
                return ((TransactionData)this.instance).hasReceipt();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
            public boolean hasTimestamp() {
                return ((TransactionData)this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).mergeTimestamp(timestamp0);
                return this;
            }

            public Builder setEventId(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setEventId(byteString0);
                return this;
            }

            public Builder setProduct(String s) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProduct(s);
                return this;
            }

            public Builder setProductBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProductBytes(byteString0);
                return this;
            }

            public Builder setProductId(String s) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProductId(s);
                return this;
            }

            public Builder setProductIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProductIdBytes(byteString0);
                return this;
            }

            public Builder setReceipt(String s) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setReceipt(s);
                return this;
            }

            public Builder setReceiptBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setReceiptBytes(byteString0);
                return this;
            }

            public Builder setTimestamp(com.google.protobuf.Timestamp.Builder timestamp$Builder0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTimestamp(((Timestamp)timestamp$Builder0.build()));
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTimestamp(timestamp0);
                return this;
            }

            public Builder setTransaction(String s) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransaction(s);
                return this;
            }

            public Builder setTransactionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionBytes(byteString0);
                return this;
            }

            public Builder setTransactionId(String s) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionId(s);
                return this;
            }

            public Builder setTransactionIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionIdBytes(byteString0);
                return this;
            }

            public Builder setTransactionState(TransactionState transactionEventRequestOuterClass$TransactionState0) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionState(transactionEventRequestOuterClass$TransactionState0);
                return this;
            }

            public Builder setTransactionStateValue(int v) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionStateValue(v);
                return this;
            }
        }

        private static final TransactionData DEFAULT_INSTANCE = null;
        public static final int EVENT_ID_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int PRODUCT_FIELD_NUMBER = 5;
        public static final int PRODUCT_ID_FIELD_NUMBER = 2;
        public static final int RECEIPT_FIELD_NUMBER = 7;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSACTION_FIELD_NUMBER = 6;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
        public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private ByteString eventId_;
        private String productId_;
        private String product_;
        private String receipt_;
        private Timestamp timestamp_;
        private String transactionId_;
        private int transactionState_;
        private String transaction_;

        static {
            TransactionData transactionEventRequestOuterClass$TransactionData0 = new TransactionData();
            TransactionData.DEFAULT_INSTANCE = transactionEventRequestOuterClass$TransactionData0;
            GeneratedMessageLite.registerDefaultInstance(TransactionData.class, transactionEventRequestOuterClass$TransactionData0);
        }

        private TransactionData() {
            this.productId_ = "";
            this.eventId_ = ByteString.EMPTY;
            this.transactionId_ = "";
            this.product_ = "";
            this.transaction_ = "";
            this.receipt_ = "";
        }

        private void clearEventId() {
            this.eventId_ = TransactionData.getDefaultInstance().getEventId();
        }

        private void clearProduct() {
            this.product_ = "";
        }

        private void clearProductId() {
            this.productId_ = TransactionData.getDefaultInstance().getProductId();
        }

        private void clearReceipt() {
            this.bitField0_ &= -3;
            this.receipt_ = "";
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTransaction() {
            this.transaction_ = "";
        }

        private void clearTransactionId() {
            this.transactionId_ = TransactionData.getDefaultInstance().getTransactionId();
        }

        private void clearTransactionState() {
            this.transactionState_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new TransactionData();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(TransactionData.DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0001\b\f", new Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_"});
                }
                case 4: {
                    return TransactionData.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = TransactionData.PARSER;
                    if(parser0 == null) {
                        Class class0 = TransactionData.class;
                        synchronized(class0) {
                            parser0 = TransactionData.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(TransactionData.DEFAULT_INSTANCE);
                                TransactionData.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        public static TransactionData getDefaultInstance() {
            return TransactionData.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public String getProduct() {
            return this.product_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public ByteString getProductBytes() {
            return ByteString.copyFromUtf8(this.product_);
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public String getProductId() {
            return this.productId_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public ByteString getProductIdBytes() {
            return ByteString.copyFromUtf8(this.productId_);
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public String getReceipt() {
            return this.receipt_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public ByteString getReceiptBytes() {
            return ByteString.copyFromUtf8(this.receipt_);
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public Timestamp getTimestamp() {
            return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public String getTransaction() {
            return this.transaction_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public ByteString getTransactionBytes() {
            return ByteString.copyFromUtf8(this.transaction_);
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public String getTransactionId() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8(this.transactionId_);
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public TransactionState getTransactionState() {
            TransactionState transactionEventRequestOuterClass$TransactionState0 = TransactionState.forNumber(this.transactionState_);
            return transactionEventRequestOuterClass$TransactionState0 == null ? TransactionState.UNRECOGNIZED : transactionEventRequestOuterClass$TransactionState0;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public int getTransactionStateValue() {
            return this.transactionState_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public boolean hasReceipt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionDataOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeTimestamp(Timestamp timestamp0) {
            timestamp0.getClass();
            this.timestamp_ = this.timestamp_ == null || this.timestamp_ == Timestamp.getDefaultInstance() ? timestamp0 : ((Timestamp)((com.google.protobuf.Timestamp.Builder)Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)TransactionData.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TransactionData transactionEventRequestOuterClass$TransactionData0) {
            return (Builder)TransactionData.DEFAULT_INSTANCE.createBuilder(transactionEventRequestOuterClass$TransactionData0);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseDelimitedFrom(TransactionData.DEFAULT_INSTANCE, inputStream0);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseDelimitedFrom(TransactionData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TransactionData parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, byteString0);
        }

        public static TransactionData parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static TransactionData parseFrom(InputStream inputStream0) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, inputStream0);
        }

        public static TransactionData parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static TransactionData parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, arr_b);
        }

        public static TransactionData parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom(TransactionData.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return TransactionData.DEFAULT_INSTANCE.getParserForType();
        }

        private void setEventId(ByteString byteString0) {
            byteString0.getClass();
            this.eventId_ = byteString0;
        }

        private void setProduct(String s) {
            s.getClass();
            this.product_ = s;
        }

        private void setProductBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.product_ = byteString0.toStringUtf8();
        }

        private void setProductId(String s) {
            s.getClass();
            this.productId_ = s;
        }

        private void setProductIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.productId_ = byteString0.toStringUtf8();
        }

        private void setReceipt(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.receipt_ = s;
        }

        private void setReceiptBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.receipt_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setTimestamp(Timestamp timestamp0) {
            timestamp0.getClass();
            this.timestamp_ = timestamp0;
            this.bitField0_ |= 1;
        }

        private void setTransaction(String s) {
            s.getClass();
            this.transaction_ = s;
        }

        private void setTransactionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.transaction_ = byteString0.toStringUtf8();
        }

        private void setTransactionId(String s) {
            s.getClass();
            this.transactionId_ = s;
        }

        private void setTransactionIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.transactionId_ = byteString0.toStringUtf8();
        }

        private void setTransactionState(TransactionState transactionEventRequestOuterClass$TransactionState0) {
            this.transactionState_ = transactionEventRequestOuterClass$TransactionState0.getNumber();
        }

        private void setTransactionStateValue(int v) {
            this.transactionState_ = v;
        }
    }

    public interface TransactionDataOrBuilder extends MessageLiteOrBuilder {
        ByteString getEventId();

        String getProduct();

        ByteString getProductBytes();

        String getProductId();

        ByteString getProductIdBytes();

        String getReceipt();

        ByteString getReceiptBytes();

        Timestamp getTimestamp();

        String getTransaction();

        ByteString getTransactionBytes();

        String getTransactionId();

        ByteString getTransactionIdBytes();

        TransactionState getTransactionState();

        int getTransactionStateValue();

        boolean hasReceipt();

        boolean hasTimestamp();
    }

    public static final class TransactionEventRequest extends GeneratedMessageLite implements TransactionEventRequestOrBuilder {
        public static final class gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements TransactionEventRequestOrBuilder {
            private gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder() {
                super(TransactionEventRequest.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder(gatewayprotocol.v1.TransactionEventRequestOuterClass.a transactionEventRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addAllTransactionData(Iterable iterable0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addAllTransactionData(iterable0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(int v, Builder transactionEventRequestOuterClass$TransactionData$Builder0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(v, ((TransactionData)transactionEventRequestOuterClass$TransactionData$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(int v, TransactionData transactionEventRequestOuterClass$TransactionData0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(v, transactionEventRequestOuterClass$TransactionData0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(Builder transactionEventRequestOuterClass$TransactionData$Builder0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(((TransactionData)transactionEventRequestOuterClass$TransactionData$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(TransactionData transactionEventRequestOuterClass$TransactionData0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(transactionEventRequestOuterClass$TransactionData0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearAppStore() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearAppStore();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearCustomStore() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearCustomStore();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearTransactionData() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearTransactionData();
                return this;
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public StoreType getAppStore() {
                return ((TransactionEventRequest)this.instance).getAppStore();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public int getAppStoreValue() {
                return ((TransactionEventRequest)this.instance).getAppStoreValue();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public String getCustomStore() {
                return ((TransactionEventRequest)this.instance).getCustomStore();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public ByteString getCustomStoreBytes() {
                return ((TransactionEventRequest)this.instance).getCustomStoreBytes();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((TransactionEventRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public StaticDeviceInfo getStaticDeviceInfo() {
                return ((TransactionEventRequest)this.instance).getStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public TransactionData getTransactionData(int v) {
                return ((TransactionEventRequest)this.instance).getTransactionData(v);
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public int getTransactionDataCount() {
                return ((TransactionEventRequest)this.instance).getTransactionDataCount();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public List getTransactionDataList() {
                return DesugarCollections.unmodifiableList(((TransactionEventRequest)this.instance).getTransactionDataList());
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((TransactionEventRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((TransactionEventRequest)this.instance).hasStaticDeviceInfo();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder removeTransactionData(int v) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).removeTransactionData(v);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setAppStore(StoreType transactionEventRequestOuterClass$StoreType0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setAppStore(transactionEventRequestOuterClass$StoreType0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setAppStoreValue(int v) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setAppStoreValue(v);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setCustomStore(String s) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setCustomStore(s);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setCustomStoreBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setCustomStoreBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setDynamicDeviceInfo(((DynamicDeviceInfo)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setStaticDeviceInfo(((StaticDeviceInfo)staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setTransactionData(int v, Builder transactionEventRequestOuterClass$TransactionData$Builder0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setTransactionData(v, ((TransactionData)transactionEventRequestOuterClass$TransactionData$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setTransactionData(int v, TransactionData transactionEventRequestOuterClass$TransactionData0) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setTransactionData(v, transactionEventRequestOuterClass$TransactionData0);
                return this;
            }
        }

        public static final int APP_STORE_FIELD_NUMBER = 3;
        public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
        private static final TransactionEventRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
        private int appStore_;
        private int bitField0_;
        private String customStore_;
        private DynamicDeviceInfo dynamicDeviceInfo_;
        private StaticDeviceInfo staticDeviceInfo_;
        private ProtobufList transactionData_;

        static {
            TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0 = new TransactionEventRequest();
            TransactionEventRequest.DEFAULT_INSTANCE = transactionEventRequestOuterClass$TransactionEventRequest0;
            GeneratedMessageLite.registerDefaultInstance(TransactionEventRequest.class, transactionEventRequestOuterClass$TransactionEventRequest0);
        }

        private TransactionEventRequest() {
            this.customStore_ = "";
            this.transactionData_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllTransactionData(Iterable iterable0) {
            this.ensureTransactionDataIsMutable();
            AbstractMessageLite.addAll(iterable0, this.transactionData_);
        }

        private void addTransactionData(int v, TransactionData transactionEventRequestOuterClass$TransactionData0) {
            transactionEventRequestOuterClass$TransactionData0.getClass();
            this.ensureTransactionDataIsMutable();
            this.transactionData_.add(v, transactionEventRequestOuterClass$TransactionData0);
        }

        private void addTransactionData(TransactionData transactionEventRequestOuterClass$TransactionData0) {
            transactionEventRequestOuterClass$TransactionData0.getClass();
            this.ensureTransactionDataIsMutable();
            this.transactionData_.add(transactionEventRequestOuterClass$TransactionData0);
        }

        private void clearAppStore() {
            this.appStore_ = 0;
        }

        private void clearCustomStore() {
            this.customStore_ = TransactionEventRequest.getDefaultInstance().getCustomStore();
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTransactionData() {
            this.transactionData_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new TransactionEventRequest();
                }
                case 2: {
                    return new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(TransactionEventRequest.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004Ȉ\u0005\u001B", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", TransactionData.class});
                }
                case 4: {
                    return TransactionEventRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = TransactionEventRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = TransactionEventRequest.class;
                        synchronized(class0) {
                            parser0 = TransactionEventRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(TransactionEventRequest.DEFAULT_INSTANCE);
                                TransactionEventRequest.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureTransactionDataIsMutable() {
            ProtobufList internal$ProtobufList0 = this.transactionData_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.transactionData_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public StoreType getAppStore() {
            StoreType transactionEventRequestOuterClass$StoreType0 = StoreType.forNumber(this.appStore_);
            return transactionEventRequestOuterClass$StoreType0 == null ? StoreType.UNRECOGNIZED : transactionEventRequestOuterClass$StoreType0;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public int getAppStoreValue() {
            return this.appStore_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public String getCustomStore() {
            return this.customStore_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public ByteString getCustomStoreBytes() {
            return ByteString.copyFromUtf8(this.customStore_);
        }

        public static TransactionEventRequest getDefaultInstance() {
            return TransactionEventRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public DynamicDeviceInfo getDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ == null ? DynamicDeviceInfo.getDefaultInstance() : this.dynamicDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public StaticDeviceInfo getStaticDeviceInfo() {
            return this.staticDeviceInfo_ == null ? StaticDeviceInfo.getDefaultInstance() : this.staticDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public TransactionData getTransactionData(int v) {
            return (TransactionData)this.transactionData_.get(v);
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public int getTransactionDataCount() {
            return this.transactionData_.size();
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public List getTransactionDataList() {
            return this.transactionData_;
        }

        public TransactionDataOrBuilder getTransactionDataOrBuilder(int v) {
            return (TransactionDataOrBuilder)this.transactionData_.get(v);
        }

        public List getTransactionDataOrBuilderList() {
            return this.transactionData_;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = this.dynamicDeviceInfo_ == null || this.dynamicDeviceInfo_ == DynamicDeviceInfo.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 : ((DynamicDeviceInfo)((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = this.staticDeviceInfo_ == null || this.staticDeviceInfo_ == StaticDeviceInfo.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo0 : ((StaticDeviceInfo)((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder() {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder)TransactionEventRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder(TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder)TransactionEventRequest.DEFAULT_INSTANCE.createBuilder(transactionEventRequestOuterClass$TransactionEventRequest0);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseDelimitedFrom(TransactionEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseDelimitedFrom(TransactionEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream0) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static TransactionEventRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static TransactionEventRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom(TransactionEventRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return TransactionEventRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTransactionData(int v) {
            this.ensureTransactionDataIsMutable();
            this.transactionData_.remove(v);
        }

        private void setAppStore(StoreType transactionEventRequestOuterClass$StoreType0) {
            this.appStore_ = transactionEventRequestOuterClass$StoreType0.getNumber();
        }

        private void setAppStoreValue(int v) {
            this.appStore_ = v;
        }

        private void setCustomStore(String s) {
            s.getClass();
            this.customStore_ = s;
        }

        private void setCustomStoreBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.customStore_ = byteString0.toStringUtf8();
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
            this.bitField0_ |= 2;
        }

        private void setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            this.bitField0_ |= 1;
        }

        private void setTransactionData(int v, TransactionData transactionEventRequestOuterClass$TransactionData0) {
            transactionEventRequestOuterClass$TransactionData0.getClass();
            this.ensureTransactionDataIsMutable();
            this.transactionData_.set(v, transactionEventRequestOuterClass$TransactionData0);
        }
    }

    public interface TransactionEventRequestOrBuilder extends MessageLiteOrBuilder {
        StoreType getAppStore();

        int getAppStoreValue();

        String getCustomStore();

        ByteString getCustomStoreBytes();

        DynamicDeviceInfo getDynamicDeviceInfo();

        StaticDeviceInfo getStaticDeviceInfo();

        TransactionData getTransactionData(int arg1);

        int getTransactionDataCount();

        List getTransactionDataList();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    public static enum TransactionState implements EnumLite {
        class gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.a implements EnumLiteMap {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.a() {
                super();
            }

            public TransactionState a(int v) {
                return TransactionState.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.b.a = new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return TransactionState.forNumber(v) != null;
            }
        }

        TRANSACTION_STATE_UNSPECIFIED(0),
        TRANSACTION_STATE_PENDING(1),
        TRANSACTION_STATE_PURCHASED(2),
        TRANSACTION_STATE_FAILED(3),
        TRANSACTION_STATE_RESTORED(4),
        TRANSACTION_STATE_DEFERRED(5),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_STATE_DEFERRED_VALUE = 5;
        public static final int TRANSACTION_STATE_FAILED_VALUE = 3;
        public static final int TRANSACTION_STATE_PENDING_VALUE = 1;
        public static final int TRANSACTION_STATE_PURCHASED_VALUE = 2;
        public static final int TRANSACTION_STATE_RESTORED_VALUE = 4;
        public static final int TRANSACTION_STATE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static TransactionState[] $values() [...] // Inlined contents

        static {
            TransactionState.internalValueMap = new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.a();
        }

        private TransactionState(int v1) {
            this.value = v1;
        }

        public static TransactionState forNumber(int v) {
            switch(v) {
                case 0: {
                    return TransactionState.TRANSACTION_STATE_UNSPECIFIED;
                }
                case 1: {
                    return TransactionState.TRANSACTION_STATE_PENDING;
                }
                case 2: {
                    return TransactionState.TRANSACTION_STATE_PURCHASED;
                }
                case 3: {
                    return TransactionState.TRANSACTION_STATE_FAILED;
                }
                case 4: {
                    return TransactionState.TRANSACTION_STATE_RESTORED;
                }
                case 5: {
                    return TransactionState.TRANSACTION_STATE_DEFERRED;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == TransactionState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return TransactionState.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.b.a;
        }

        @Deprecated
        public static TransactionState valueOf(int v) {
            return TransactionState.forNumber(v);
        }
    }

    static class gatewayprotocol.v1.TransactionEventRequestOuterClass.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.TransactionEventRequestOuterClass.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

