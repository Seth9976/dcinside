package com.bytedance.sdk.openadsdk.cr.Zh;

import org.json.JSONException;
import org.json.JSONObject;

public class ReZ implements Zh {
    Zh PjT;

    @Override  // com.bytedance.sdk.openadsdk.cr.Zh.Zh
    public void PjT(JSONObject jSONObject0, long v) throws JSONException {
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.PjT(jSONObject0, v);
        }
        if(v <= 0L) {
            v = System.currentTimeMillis();
        }
        jSONObject0.put("event_ts", v);
    }
}

