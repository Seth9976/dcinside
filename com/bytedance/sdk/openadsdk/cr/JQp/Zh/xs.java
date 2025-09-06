package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class xs implements ReZ {
    public long PjT;
    public long ReZ;
    public int Zh;

    public void PjT(int v) {
        this.Zh = v;
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
            jSONObject0.put("buffers_count", this.Zh);
            jSONObject0.put("total_duration", this.ReZ);
        }
        catch(Throwable throwable0) {
            RD.Zh("PlayBufferModel", throwable0.getMessage());
        }
    }

    public void Zh(long v) {
        this.ReZ = v;
    }
}

