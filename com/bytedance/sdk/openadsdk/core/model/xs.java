package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

public class xs {
    private final int PjT;
    private final int ReZ;
    private final int Zh;
    private final int cr;

    public xs(JSONObject jSONObject0) {
        this.PjT = jSONObject0.optInt("auto_click", 0);
        this.Zh = jSONObject0.optInt("close_jump_probability", 0);
        this.ReZ = jSONObject0.optInt("skip_jump_probability", 0);
        this.cr = jSONObject0.optInt("hidden_bar", 0);
    }

    public JSONObject JQp() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(this.PjT == 1) {
                jSONObject0.put("auto_click", 1);
            }
            int v = this.Zh;
            if(v > 0 && v <= 100) {
                jSONObject0.put("close_jump_probability", v);
            }
            int v1 = this.ReZ;
            if(v1 > 0 && v1 <= 100) {
                jSONObject0.put("skip_jump_probability", v1);
            }
            if(this.cr == 1) {
                jSONObject0.put("hidden_bar", 1);
            }
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public static boolean PjT(Owx owx0) {
        return owx0 == null || !owx0.uvo() || owx0.WHM() == null ? false : owx0.WHM().cr();
    }

    public int PjT() {
        return this.PjT;
    }

    public int ReZ() {
        return this.ReZ < 0 || this.ReZ > 100 ? 0 : this.ReZ;
    }

    public int Zh() {
        return this.Zh < 0 || this.Zh > 100 ? 0 : this.Zh;
    }

    public boolean cr() {
        return this.cr == 1;
    }
}

