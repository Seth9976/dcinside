package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    private boolean JQp;
    private String PjT;
    private String ReZ;
    private String Zh;
    private String cr;

    public boolean JQp() {
        return this.JQp;
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        this.PjT = jSONObject0.optString("icon");
        this.Zh = jSONObject0.optString("text");
        this.ReZ = jSONObject0.optString("privacy_url");
        this.cr = jSONObject0.optString("privacy_title");
    }

    public void PjT(boolean z) {
        this.JQp = z;
    }

    public String ReZ() {
        return this.ReZ;
    }

    public String Zh() {
        return this.Zh;
    }

    public String cr() {
        return this.cr;
    }

    public JSONObject cz() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("privacy_url", this.ReZ);
            jSONObject0.put("privacy_title", this.cr);
            jSONObject0.put("text", this.Zh);
            jSONObject0.put("icon", this.PjT);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

