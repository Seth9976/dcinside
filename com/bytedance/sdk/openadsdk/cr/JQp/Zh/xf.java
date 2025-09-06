package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class xf implements ReZ {
    private String PjT;
    private long ReZ;
    private long Zh;
    private long cr;

    public void PjT(long v) {
        this.Zh = v;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.JQp.Zh.ReZ
    public void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            jSONObject0.put("preload_url", this.PjT);
            jSONObject0.put("preload_size", this.Zh);
            jSONObject0.put("load_time", this.ReZ);
            jSONObject0.put("local_cache", this.cr);
        }
        catch(Throwable throwable0) {
            RD.Zh("LoadVideoSuccessModel", throwable0.getMessage());
        }
    }

    public void ReZ(long v) {
        this.cr = v;
    }

    public void Zh(long v) {
        this.ReZ = v;
    }
}

