package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData;
import y4.l;

public interface GetTransactionData {
    @l
    TransactionData invoke(@l PurchaseBridge arg1, @l SkuDetailsBridge arg2);
}

