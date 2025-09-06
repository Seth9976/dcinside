package com.bytedance.sdk.openadsdk.Lrd.Zh;

import org.json.JSONObject;

public class PjT {
    private final int PjT;
    private final float ReZ;
    private final int Zh;

    public PjT(int v, int v1, float f) {
        this.PjT = v;
        this.Zh = v1;
        this.ReZ = f;
    }

    public static JSONObject PjT(PjT pjT0) throws Throwable {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("width", pjT0.PjT);
        jSONObject0.put("height", pjT0.Zh);
        jSONObject0.put("alpha", ((double)pjT0.ReZ));
        return jSONObject0;
    }
}

