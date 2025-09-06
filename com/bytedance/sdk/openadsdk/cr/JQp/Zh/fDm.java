package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;
import v.a;

public class fDm implements ReZ {
    private final String JQp;
    private long PjT;
    private final int ReZ;
    private long Zh;
    private final int cr;

    public fDm(a a0) {
        this.ReZ = a0.a();
        this.cr = a0.d();
        this.JQp = a0.c();
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
            jSONObject0.put("error_code", this.ReZ);
            jSONObject0.put("extra_error_code", this.cr);
            jSONObject0.put("error_message", this.JQp);
        }
        catch(Throwable throwable0) {
            RD.Zh("PlayErrorModel", throwable0.getMessage());
        }
    }

    public void Zh(long v) {
        this.Zh = v;
    }
}

