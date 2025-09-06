package com.bytedance.sdk.component.Au.Zh;

import org.json.JSONObject;

public class PjT {
    public int PjT;
    public int ReZ;
    public int Zh;
    public int cr;

    public PjT(int v, int v1, int v2, int v3) {
        this.PjT = v;
        this.Zh = v1;
        this.ReZ = v2;
        this.cr = v3;
    }

    public JSONObject PjT() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("sdk_thread_num", this.PjT);
            jSONObject0.put("sdk_max_thread_num", this.Zh);
            jSONObject0.put("app_thread_num", this.ReZ);
            jSONObject0.put("app_max_thread_num", this.cr);
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject0;
    }
}

