package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class JQp implements ReZ {
    private long PjT;
    private long Zh;

    public void PjT(long v) {
        this.PjT = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.JQp.Zh.ReZ
    public void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            jSONObject0.put("buffers_time", this.PjT);
            jSONObject0.put("total_duration", this.Zh);
        }
        catch(Throwable throwable0) {
            RD.Zh("FeedContinueModel", throwable0.getMessage());
        }
    }

    public void Zh(long v) {
        this.Zh = v;
    }
}

