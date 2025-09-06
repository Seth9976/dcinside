package com.unity3d.services.store.gpbl.bridges;

public class PurchaseHistoryRecordBridge extends CommonJsonResponseBridge {
    public PurchaseHistoryRecordBridge(Object object0) {
        super(object0);
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.PurchaseHistoryRecord";
    }
}

