package com.bytedance.sdk.openadsdk.core.DWo.XX;

import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    private String JQp;
    private String PjT;
    private String ReZ;
    private String Zh;
    private String cr;

    public PjT JQp(String s) {
        this.JQp = s;
        return this;
    }

    public String JQp() {
        return this.JQp;
    }

    public PjT PjT(String s) {
        this.PjT = s;
        return this;
    }

    public String PjT() {
        return this.PjT;
    }

    public JSONObject PjT(PjT pjT0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("id", this.PjT);
            jSONObject0.put("md5", this.Zh);
            jSONObject0.put("url", this.ReZ);
            if(pjT0 != null) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("id", pjT0.PjT());
                jSONObject1.put("md5", pjT0.Zh());
                jSONObject1.put("url", pjT0.ReZ());
                jSONObject0.put("overlay", jSONObject1);
            }
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public PjT ReZ(String s) {
        this.ReZ = s;
        return this;
    }

    public String ReZ() {
        return this.ReZ;
    }

    public PjT Zh(String s) {
        this.Zh = s;
        return this;
    }

    public String Zh() {
        return this.Zh;
    }

    public PjT cr(String s) {
        this.cr = s;
        return this;
    }

    public String cr() {
        return this.cr;
    }
}

