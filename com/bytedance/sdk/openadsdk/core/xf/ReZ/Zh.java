package com.bytedance.sdk.openadsdk.core.xf.ReZ;

import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    public static void PjT(Owx owx0) {
        if(cRA.Zh(owx0)) {
            ReZ.Zh(owx0, "playable_preload", "preload_start", null);
        }
    }

    public static void PjT(Owx owx0, int v, String s) {
        if(owx0 != null && (cRA.ReZ(owx0) || cRA.Zh(owx0))) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("error_code", v);
                jSONObject0.put("error_reason", s);
            }
            catch(JSONException jSONException0) {
                RD.PjT("PlayableEvent", "onFail json error", jSONException0);
            }
            ReZ.Zh(owx0, "playable_preload", "preload_fail", jSONObject0);
        }
    }

    public static void PjT(Owx owx0, long v, long v1) {
        if(owx0 != null && (cRA.ReZ(owx0) || cRA.Zh(owx0))) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("loadzip_success_time", v);
                jSONObject0.put("unzip_success_time", v1);
            }
            catch(JSONException jSONException0) {
                RD.PjT("PlayableEvent", "onSuccess json error", jSONException0);
            }
            ReZ.Zh(owx0, "playable_preload", "preload_success", jSONObject0);
        }
    }
}

