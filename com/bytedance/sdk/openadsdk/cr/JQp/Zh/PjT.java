package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.openadsdk.core.model.Owx;
import org.json.JSONObject;

public class PjT {
    private boolean JQp;
    private Owx PjT;
    private JSONObject ReZ;
    private String Zh;
    private ReZ cr;

    public PjT(Owx owx0, String s, JSONObject jSONObject0, ReZ reZ0) {
        this.JQp = false;
        this.PjT = owx0;
        this.Zh = s;
        this.ReZ = jSONObject0;
        this.cr = reZ0;
    }

    public boolean JQp() {
        return this.JQp;
    }

    public Owx PjT() {
        return this.PjT;
    }

    public void PjT(boolean z) {
        this.JQp = z;
    }

    public JSONObject ReZ() {
        if(this.ReZ == null) {
            this.ReZ = new JSONObject();
        }
        return this.ReZ;
    }

    public String Zh() {
        return this.Zh;
    }

    public ReZ cr() {
        return this.cr;
    }
}

