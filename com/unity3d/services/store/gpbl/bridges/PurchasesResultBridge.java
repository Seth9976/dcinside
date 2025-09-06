package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PurchasesResultBridge extends GenericBridge {
    private final Object _purchasesResult;
    private static final String getBillingResultMethodName = "getBillingResult";
    private static final String getPurchasesListMethodName = "getPurchasesList";

    public PurchasesResultBridge(Object object0) {
        super(new com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.1());
        this._purchasesResult = object0;

        class com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.1 extends HashMap {
            com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.1() {
                this.put("getBillingResult", new Class[0]);
                this.put("getPurchasesList", new Class[0]);
            }
        }

    }

    public BillingResultBridge getBillingResult() {
        return new BillingResultBridge(this.callNonVoidMethod("getBillingResult", this._purchasesResult, new Object[0]));
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    public List getPurchasesList() {
        List list0 = (List)this.callNonVoidMethod("getPurchasesList", this._purchasesResult, new Object[0]);
        List list1 = new ArrayList();
        if(list0 != null) {
            for(Object object0: list0) {
                list1.add(new PurchaseBridge(object0));
            }
        }
        return list1;
    }
}

