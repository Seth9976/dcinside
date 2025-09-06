package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import java.util.List;

public final class b implements SkuDetailsResponseListener {
    public final List a;
    public final int b;
    public final List c;
    public final TransactionEventManager d;
    public final PurchaseBridge e;

    public b(List list0, int v, List list1, TransactionEventManager transactionEventManager0, PurchaseBridge purchaseBridge0) {
        this.a = list0;
        this.b = v;
        this.c = list1;
        this.d = transactionEventManager0;
        this.e = purchaseBridge0;
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public final void onSkuDetailsUpdated(BillingResultBridge billingResultBridge0, List list0) {
        com.unity3d.ads.core.data.manager.TransactionEventManager.onPurchasesReceived.1.invokeSuspend$lambda$3$lambda$2(this.a, this.b, this.c, this.d, this.e, billingResultBridge0, list0);
    }
}

