package com.bytedance.sdk.openadsdk.core.qj.Zh;

import org.json.JSONException;
import org.json.JSONObject;

public class Zh extends ReZ implements Comparable {
    public static class PjT {
        private final String PjT;
        private com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ ReZ;
        private final float Zh;
        private boolean cr;

        public PjT(String s, float f) {
            this.ReZ = com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ.PjT;
            this.cr = false;
            this.PjT = s;
            this.Zh = f;
        }

        public Zh PjT() {
            return new Zh(this.Zh, this.PjT, this.ReZ, Boolean.valueOf(this.cr), null);
        }
    }

    private final float PjT;

    private Zh(float f, String s, com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ reZ$ReZ0, Boolean boolean0) {
        super(s, reZ$ReZ0, boolean0);
        this.PjT = f;
    }

    Zh(float f, String s, com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.ReZ reZ$ReZ0, Boolean boolean0, com.bytedance.sdk.openadsdk.core.qj.Zh.Zh.1 zh$10) {
        this(f, s, reZ$ReZ0, boolean0);
    }

    public int PjT(Zh zh0) {
        if(zh0 != null) {
            float f = this.PjT;
            float f1 = zh0.PjT;
            if(f <= f1) {
                return f < f1 ? -1 : 0;
            }
        }
        return 1;
    }

    public boolean PjT(float f) {
        return this.PjT <= f && !this.JQp();
    }

    public JSONObject Zh() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("content", this.ReZ());
        jSONObject0.put("trackingFraction", ((double)this.PjT));
        return jSONObject0;
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((Zh)object0));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ
    public void j_() {
        super.j_();
    }

    class com.bytedance.sdk.openadsdk.core.qj.Zh.Zh.1 {
    }

}

