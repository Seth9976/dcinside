package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class DWo implements ReZ {
    private String JQp;
    private String PjT;
    private long ReZ;
    private long Zh;
    private int cr;
    private String cz;

    public void PjT(int v) {
        this.cr = v;
    }

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
            jSONObject0.put("error_code", this.cr);
            jSONObject0.put("error_message", this.JQp);
            jSONObject0.put("error_message_server", this.cz);
        }
        catch(Throwable throwable0) {
            RD.Zh("LoadVideoErrorModel", throwable0.getMessage());
        }
    }

    public void ReZ(String s) {
        this.cz = s;
    }

    public void Zh(long v) {
        this.ReZ = v;
    }

    public void Zh(String s) {
        this.JQp = s;
    }
}

