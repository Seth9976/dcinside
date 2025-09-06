package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class cz implements ReZ {
    private long PjT;
    private int ReZ;
    private long Zh;

    public cz() {
        this.ReZ = 0;
    }

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
            jSONObject0.put("total_duration", this.PjT);
            jSONObject0.put("buffers_time", this.Zh);
            jSONObject0.put("video_backup", this.ReZ);
        }
        catch(Throwable throwable0) {
            RD.Zh("FeedOverModel", throwable0.getMessage());
        }
    }

    public void Zh(long v) {
        this.Zh = v;
    }
}

