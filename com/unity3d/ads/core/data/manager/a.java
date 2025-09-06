package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.util.List;

public final class a implements PurchasesResponseListener {
    public final TransactionEventManager a;

    public a(TransactionEventManager transactionEventManager0) {
        this.a = transactionEventManager0;
    }

    @Override  // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public final void onPurchaseResponse(BillingResultBridge billingResultBridge0, List list0) {
        com.unity3d.ads.core.data.manager.TransactionEventManager.invoke.1.invokeSuspend$lambda$1(this.a, billingResultBridge0, list0);
    }
}

