package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class cr implements ReZ {
    public long PjT;
    public int ReZ;
    public long Zh;
    public int cr;

    public cr() {
        this.cr = 0;
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
            jSONObject0.put("break_reason", this.ReZ);
            jSONObject0.put("video_backup", this.cr);
        }
        catch(Throwable throwable0) {
            RD.Zh("FeedBreakModel", throwable0.getMessage());
        }
    }

    public void Zh(int v) {
        this.cr = v;
    }

    public void Zh(long v) {
        this.Zh = v;
    }
}

