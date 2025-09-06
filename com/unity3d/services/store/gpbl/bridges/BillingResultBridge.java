package com.unity3d.services.store.gpbl.bridges;

import androidx.annotation.NonNull;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import java.util.HashMap;

public class BillingResultBridge extends GenericBridge {
    private final Object _billingResult;
    private static final String getResponseCodeMethodName = "getResponseCode";

    public BillingResultBridge(Object object0) {
        super(new com.unity3d.services.store.gpbl.bridges.BillingResultBridge.1());
        this._billingResult = object0;

        class com.unity3d.services.store.gpbl.bridges.BillingResultBridge.1 extends HashMap {
            com.unity3d.services.store.gpbl.bridges.BillingResultBridge.1() {
                this.put("getResponseCode", new Class[0]);
            }
        }

    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.BillingResult";
    }

    @NonNull
    public BillingResultResponseCode getResponseCode() {
        return BillingResultResponseCode.fromResponseCode(((int)(((Integer)this.callNonVoidMethod("getResponseCode", this._billingResult, new Object[0])))));
    }
}

