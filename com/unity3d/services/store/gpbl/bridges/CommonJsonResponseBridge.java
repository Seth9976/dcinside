package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.JsonSerializable;
import com.unity3d.services.store.gpbl.IBillingResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class CommonJsonResponseBridge extends GenericBridge implements JsonSerializable, IBillingResponse {
    private final Object _internalBridgeRef;
    private static final String getOriginalJsonMethodName = "getOriginalJson";

    protected CommonJsonResponseBridge(Object object0) {
        this(object0, new HashMap());
    }

    protected CommonJsonResponseBridge(Object object0, Map map0) {
        super(CommonJsonResponseBridge.appendCommonResponseMethods(map0));
        this._internalBridgeRef = object0;
    }

    private static Map appendCommonResponseMethods(Map map0) {
        map0.putAll(new HashMap() {
            {
                this.put("getOriginalJson", new Class[0]);
            }
        });
        return map0;
    }

    @Override  // com.unity3d.services.store.gpbl.IBillingResponse
    public JSONObject getOriginalJson() {
        String s = (String)this.callNonVoidMethod("getOriginalJson", this._internalBridgeRef, new Object[0]);
        try {
            return new JSONObject(s);
        }
        catch(JSONException jSONException0) {
            DeviceLog.error("Couldn\'t parse BillingResponse JSON : %s", new Object[]{jSONException0.getMessage()});
            return null;
        }
    }

    @Override  // com.unity3d.services.store.JsonSerializable
    public JSONObject toJson() {
        return this.getOriginalJson();
    }
}

