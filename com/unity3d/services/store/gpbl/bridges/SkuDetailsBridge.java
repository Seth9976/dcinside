package com.unity3d.services.store.gpbl.bridges;

public class SkuDetailsBridge extends CommonJsonResponseBridge {
    public SkuDetailsBridge(Object object0) {
        super(object0);
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.SkuDetails";
    }
}

