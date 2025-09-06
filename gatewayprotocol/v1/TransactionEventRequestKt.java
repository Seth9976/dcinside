package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class TransactionEventRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder transactionEventRequestOuterClass$TransactionEventRequest$Builder0) {
                L.p(transactionEventRequestOuterClass$TransactionEventRequest$Builder0, "builder");
                return new Dsl(transactionEventRequestOuterClass$TransactionEventRequest$Builder0, null);
            }
        }

        public static final class TransactionDataProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder transactionEventRequestOuterClass$TransactionEventRequest$Builder0) {
            this._builder = transactionEventRequestOuterClass$TransactionEventRequest$Builder0;
        }

        public Dsl(Builder transactionEventRequestOuterClass$TransactionEventRequest$Builder0, w w0) {
            this(transactionEventRequestOuterClass$TransactionEventRequest$Builder0);
        }

        @b0
        public final TransactionEventRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (TransactionEventRequest)generatedMessageLite0;
        }

        @i(name = "addAllTransactionData")
        public final void addAllTransactionData(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllTransactionData(iterable0);
        }

        @i(name = "addTransactionData")
        public final void addTransactionData(DslList dslList0, TransactionData transactionEventRequestOuterClass$TransactionData0) {
            L.p(dslList0, "<this>");
            L.p(transactionEventRequestOuterClass$TransactionData0, "value");
            this._builder.addTransactionData(transactionEventRequestOuterClass$TransactionData0);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        @i(name = "clearTransactionData")
        public final void clearTransactionData(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearTransactionData();
        }

        @l
        @i(name = "getAppStore")
        public final StoreType getAppStore() {
            StoreType transactionEventRequestOuterClass$StoreType0 = this._builder.getAppStore();
            L.o(transactionEventRequestOuterClass$StoreType0, "_builder.getAppStore()");
            return transactionEventRequestOuterClass$StoreType0;
        }

        @i(name = "getAppStoreValue")
        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        @l
        @i(name = "getCustomStore")
        public final String getCustomStore() {
            String s = this._builder.getCustomStore();
            L.o(s, "_builder.getCustomStore()");
            return s;
        }

        @l
        @i(name = "getDynamicDeviceInfo")
        public final DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = this._builder.getDynamicDeviceInfo();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
        }

        @l
        @i(name = "getStaticDeviceInfo")
        public final StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0 = this._builder.getStaticDeviceInfo();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo0, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo0;
        }

        public final DslList getTransactionData() {
            List list0 = this._builder.getTransactionDataList();
            L.o(list0, "_builder.getTransactionDataList()");
            return new DslList(list0);
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @i(name = "plusAssignAllTransactionData")
        public final void plusAssignAllTransactionData(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllTransactionData(dslList0, iterable0);
        }

        @i(name = "plusAssignTransactionData")
        public final void plusAssignTransactionData(DslList dslList0, TransactionData transactionEventRequestOuterClass$TransactionData0) {
            L.p(dslList0, "<this>");
            L.p(transactionEventRequestOuterClass$TransactionData0, "value");
            this.addTransactionData(dslList0, transactionEventRequestOuterClass$TransactionData0);
        }

        @i(name = "setAppStore")
        public final void setAppStore(@l StoreType transactionEventRequestOuterClass$StoreType0) {
            L.p(transactionEventRequestOuterClass$StoreType0, "value");
            this._builder.setAppStore(transactionEventRequestOuterClass$StoreType0);
        }

        @i(name = "setAppStoreValue")
        public final void setAppStoreValue(int v) {
            this._builder.setAppStoreValue(v);
        }

        @i(name = "setCustomStore")
        public final void setCustomStore(@l String s) {
            L.p(s, "value");
            this._builder.setCustomStore(s);
        }

        @i(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@l DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "value");
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
        }

        @i(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@l StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            L.p(staticDeviceInfoOuterClass$StaticDeviceInfo0, "value");
            this._builder.setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
        }

        @i(name = "setTransactionData")
        public final void setTransactionData(DslList dslList0, int v, TransactionData transactionEventRequestOuterClass$TransactionData0) {
            L.p(dslList0, "<this>");
            L.p(transactionEventRequestOuterClass$TransactionData0, "value");
            this._builder.setTransactionData(v, transactionEventRequestOuterClass$TransactionData0);
        }
    }

    @l
    public static final TransactionEventRequestKt INSTANCE;

    static {
        TransactionEventRequestKt.INSTANCE = new TransactionEventRequestKt();
    }
}

