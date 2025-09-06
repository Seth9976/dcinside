package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public class qj {
    private String PjT;
    private int ReZ;
    private String Zh;

    public String PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.ReZ = v;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public int ReZ() {
        return this.ReZ;
    }

    public String Zh() {
        return this.Zh;
    }

    public void Zh(String s) {
        this.Zh = s;
    }

    @Nullable
    public JSONObject cr() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("u", this.PjT);
            jSONObject0.put("ft", this.ReZ);
            jSONObject0.put("fu", this.Zh);
            return jSONObject0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

