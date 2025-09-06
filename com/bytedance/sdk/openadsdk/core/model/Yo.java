package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Yo {
    private JSONObject JQp;
    private String PjT;
    private String ReZ;
    private String Zh;
    private String cr;

    public JSONObject JQp() {
        return this.JQp;
    }

    public static Yo PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Yo yo0 = new Yo();
        yo0.PjT = jSONObject0.optString("id");
        yo0.cr = jSONObject0.optString("data");
        yo0.ReZ = jSONObject0.optString("url");
        yo0.Zh = jSONObject0.optString("md5");
        yo0.JQp = jSONObject0.optJSONObject("custom_components");
        return yo0;
    }

    public String PjT() {
        return this.PjT;
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
            jSONObject0.put("id", this.PjT);
            jSONObject0.put("md5", this.Zh);
            jSONObject0.put("url", this.ReZ);
            jSONObject0.put("data", this.cr);
            jSONObject0.put("custom_components", this.JQp);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

