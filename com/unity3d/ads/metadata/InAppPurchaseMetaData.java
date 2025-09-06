package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppPurchaseMetaData extends MetaData {
    public static final String IAP_KEY = "iap";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_PRICE = "price";
    public static final String KEY_PRODUCT_ID = "productId";
    public static final String KEY_RECEIPT_PURCHASE_DATA = "receiptPurchaseData";
    public static final String KEY_SIGNATURE = "signature";

    public InAppPurchaseMetaData(Context context0) {
        super(context0);
    }

    @Override  // com.unity3d.ads.metadata.MetaData
    public void commit() {
        JSONArray jSONArray0;
        if(StorageManager.init(this._context)) {
            Storage storage0 = StorageManager.getStorage(StorageType.PUBLIC);
            if(this.getData() != null && storage0 != null) {
                Object object0 = storage0.get("iap.purchases");
                if(object0 == null) {
                    jSONArray0 = null;
                }
                else {
                    try {
                        jSONArray0 = (JSONArray)object0;
                    }
                    catch(Exception unused_ex) {
                        DeviceLog.error("Invalid object type for purchases");
                        jSONArray0 = null;
                    }
                }
                if(jSONArray0 == null) {
                    jSONArray0 = new JSONArray();
                }
                JSONObject jSONObject0 = this.getData();
                try {
                    jSONObject0.put("ts", System.currentTimeMillis());
                }
                catch(JSONException unused_ex) {
                    DeviceLog.error("Error constructing purchase object");
                    return;
                }
                jSONArray0.put(jSONObject0);
                storage0.set("iap.purchases", jSONArray0);
                storage0.writeStorage();
                Object object1 = storage0.get("iap.purchases");
                storage0.sendEvent(StorageEvent.SET, object1);
            }
        }
        else {
            DeviceLog.error("Unity Ads could not commit metadata due to storage error or the data is null");
        }
    }

    @Override  // com.unity3d.ads.metadata.MetaData
    public boolean set(String s, Object object0) {
        synchronized(this) {
            return this.setRaw(s, object0);
        }
    }

    public void setCurrency(String s) {
        this.set("currency", s);
    }

    public void setPrice(Double double0) {
        this.set("price", double0);
    }

    public void setProductId(String s) {
        this.set("productId", s);
    }

    public void setReceiptPurchaseData(String s) {
        this.set("receiptPurchaseData", s);
    }

    public void setSignature(String s) {
        this.set("signature", s);
    }
}

