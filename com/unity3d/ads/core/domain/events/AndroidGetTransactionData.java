package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.v1.TransactionDataKt.Dsl;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidGetTransactionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetTransactionData.kt\ncom/unity3d/ads/core/domain/events/AndroidGetTransactionData\n+ 2 TransactionDataKt.kt\ngatewayprotocol/v1/TransactionDataKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n10#2:28\n1#3:29\n*S KotlinDebug\n*F\n+ 1 AndroidGetTransactionData.kt\ncom/unity3d/ads/core/domain/events/AndroidGetTransactionData\n*L\n17#1:28\n17#1:29\n*E\n"})
public final class AndroidGetTransactionData implements GetTransactionData {
    @l
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(@l GetByteStringId getByteStringId0) {
        L.p(getByteStringId0, "getByteStringId");
        super();
        this.getByteStringId = getByteStringId0;
    }

    @Override  // com.unity3d.ads.core.domain.events.GetTransactionData
    @l
    public TransactionData invoke(@l PurchaseBridge purchaseBridge0, @l SkuDetailsBridge skuDetailsBridge0) {
        L.p(purchaseBridge0, "purchaseDetail");
        L.p(skuDetailsBridge0, "productDetail");
        Builder transactionEventRequestOuterClass$TransactionData$Builder0 = TransactionData.newBuilder();
        L.o(transactionEventRequestOuterClass$TransactionData$Builder0, "newBuilder()");
        Dsl transactionDataKt$Dsl0 = Dsl.Companion._create(transactionEventRequestOuterClass$TransactionData$Builder0);
        transactionDataKt$Dsl0.setProductId(purchaseBridge0.getOriginalJson().get("productId").toString());
        transactionDataKt$Dsl0.setEventId(this.getByteStringId.invoke());
        Object object0 = purchaseBridge0.getOriginalJson().get("purchaseTime");
        L.n(object0, "null cannot be cast to non-null type kotlin.Long");
        transactionDataKt$Dsl0.setTimestamp(TimestampExtensionsKt.fromMillis(((long)(((Long)object0)))));
        transactionDataKt$Dsl0.setTransactionId(purchaseBridge0.getOriginalJson().get("orderId").toString());
        String s = skuDetailsBridge0.getOriginalJson().toString();
        L.o(s, "productDetail.originalJson.toString()");
        transactionDataKt$Dsl0.setProduct(s);
        String s1 = purchaseBridge0.getOriginalJson().toString();
        L.o(s1, "purchaseDetail.originalJson.toString()");
        transactionDataKt$Dsl0.setTransaction(s1);
        Object object1 = purchaseBridge0.getOriginalJson().get("purchaseState");
        L.n(object1, "null cannot be cast to non-null type kotlin.Int");
        transactionDataKt$Dsl0.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((int)(((Integer)object1)))));
        return transactionDataKt$Dsl0._build();
    }
}

