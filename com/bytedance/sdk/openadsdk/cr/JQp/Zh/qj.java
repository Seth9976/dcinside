package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class qj implements ReZ {
    private final String PjT;
    private final long Zh;

    public qj(String s, long v) {
        this.PjT = s;
        this.Zh = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.JQp.Zh.ReZ
    public void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            jSONObject0.put("preload_url", this.PjT);
            jSONObject0.put("preload_size", this.Zh);
        }
        catch(Throwable throwable0) {
            RD.Zh("LoadVideoStartModel", throwable0.getMessage());
        }
    }
}

