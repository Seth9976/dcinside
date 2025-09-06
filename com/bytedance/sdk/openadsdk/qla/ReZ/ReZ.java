package com.bytedance.sdk.openadsdk.qla.ReZ;

import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    public static class PjT {
        public final String PjT;
        public final JSONObject Zh;

        public PjT(String s, JSONObject jSONObject0) {
            this.PjT = s;
            this.Zh = jSONObject0;
            JSONObject jSONObject1 = jSONObject0.optJSONObject("device_info");
            if(jSONObject1 != null) {
                try {
                    jSONObject1.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
                    jSONObject0.put("device_info", jSONObject1);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }

    public static Zh PjT() {
        return cr.PjT();
    }
}

