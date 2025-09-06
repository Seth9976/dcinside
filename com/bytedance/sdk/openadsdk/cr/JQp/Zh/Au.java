package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class Au implements ReZ {
    private long PjT;
    private int ReZ;
    private long Zh;

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
            jSONObject0.put("video_start_duration", this.PjT);
            jSONObject0.put("video_cache_size", this.Zh);
            jSONObject0.put("is_auto_play", this.ReZ);
        }
        catch(Throwable throwable0) {
            RD.Zh("FeedPlayModel", throwable0.getMessage());
        }
    }

    public void Zh(long v) {
        this.Zh = v;
    }
}

