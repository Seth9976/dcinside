package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

public class Sks {
    private String PjT;
    private int ReZ;
    private int Zh;

    public static Sks PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Sks sks0 = new Sks();
        try {
            sks0.PjT(jSONObject0.optString("endcard_n_url", ""));
            sks0.PjT(Math.max(jSONObject0.optInt("endcard_show_time", 0), 0));
            sks0.Zh(jSONObject0.optInt("multi_rv_skip_time", -1));
        }
        catch(Throwable unused_ex) {
        }
        return sks0;
    }

    public int PjT() {
        return this.Zh;
    }

    public void PjT(int v) {
        this.Zh = v;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public JSONObject ReZ() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(!TextUtils.isEmpty(this.PjT)) {
                jSONObject0.put("endcard_n_url", this.PjT);
            }
            int v = this.Zh;
            if(v != -1) {
                jSONObject0.put("endcard_show_time", v);
            }
            int v1 = this.ReZ;
            if(v1 != -1) {
                jSONObject0.put("multi_rv_skip_time", v1);
            }
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public int Zh() {
        return this.ReZ;
    }

    public void Zh(int v) {
        this.ReZ = v;
    }
}

