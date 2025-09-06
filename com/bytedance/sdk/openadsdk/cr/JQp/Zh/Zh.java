package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class Zh implements ReZ {
    private long PjT;
    private int ReZ;
    private long Zh;
    private int cr;

    public void PjT(int v) {
        this.ReZ = v;
    }

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
            jSONObject0.put("vbtt_skip_type", this.ReZ);
            jSONObject0.put("skip_reason", this.cr);
        }
        catch(Throwable throwable0) {
            RD.Zh("EndcardSkipModel", throwable0.getMessage());
        }
    }

    public void Zh(int v) {
        this.cr = v;
    }

    public void Zh(long v) {
        this.Zh = v;
    }
}

