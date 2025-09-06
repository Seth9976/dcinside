package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class PurchaseBridge extends CommonJsonResponseBridge {
    private final Object _purchase;
    private static final String getSignatureMethodName = "getSignature";

    public PurchaseBridge(Object object0) {
        super(object0, new com.unity3d.services.store.gpbl.bridges.PurchaseBridge.1());
        this._purchase = object0;

        class com.unity3d.services.store.gpbl.bridges.PurchaseBridge.1 extends HashMap {
            com.unity3d.services.store.gpbl.bridges.PurchaseBridge.1() {
                this.put("getSignature", new Class[0]);
            }
        }

    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.Purchase";
    }

    public String getSignature() {
        return (String)this.callNonVoidMethod("getSignature", this._purchase, new Object[0]);
    }

    @Override  // com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge
    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("purchaseData", this.getOriginalJson());
            jSONObject0.put("signature", this.getSignature());
        }
        catch(JSONException jSONException0) {
            DeviceLog.warning("Could not build Purchase result Json: ", new Object[]{jSONException0.getMessage()});
        }
        return jSONObject0;
    }
}

