package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import org.json.JSONException;
import org.json.JSONObject;

public class cr {
    public static void PjT(Owx owx0, String s, int v, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        try {
            jSONObject0.put("type", v);
        }
        catch(JSONException unused_ex) {
        }
        ReZ.Zh(owx0, s, "convert_track", jSONObject0);
    }
}

