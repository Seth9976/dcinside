package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

public class qla {
    public static class PjT {
        public static class com.bytedance.sdk.openadsdk.core.model.qla.PjT.PjT {
            String PjT;

            public com.bytedance.sdk.openadsdk.core.model.qla.PjT.PjT(JSONObject jSONObject0) {
                if(jSONObject0 == null) {
                    return;
                }
                this.PjT = jSONObject0.optString("entry");
            }

            public boolean PjT() {
                return !TextUtils.isEmpty(this.PjT);
            }
        }

        com.bytedance.sdk.openadsdk.core.model.qla.PjT.PjT PjT;
        com.bytedance.sdk.openadsdk.core.model.qla.PjT.PjT Zh;

        public PjT(JSONObject jSONObject0) {
            if(jSONObject0 == null) {
                return;
            }
            if(jSONObject0.has("vertical")) {
                this.PjT = new com.bytedance.sdk.openadsdk.core.model.qla.PjT.PjT(jSONObject0.optJSONObject("vertical"));
            }
            if(jSONObject0.has("horizontal")) {
                this.Zh = new com.bytedance.sdk.openadsdk.core.model.qla.PjT.PjT(jSONObject0.optJSONObject("horizontal"));
            }
        }

        public String PjT(boolean z) {
            if(z) {
                return this.PjT == null ? "" : this.PjT.PjT;
            }
            return this.Zh == null ? "" : this.Zh.PjT;
        }

        // 去混淆评级： 低(20)
        public boolean PjT() {
            return this.Zh == null || !this.Zh.PjT() ? this.PjT != null && this.PjT.PjT() : true;
        }
    }

    private PjT PjT;

    public qla(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("easy_playable");
        if(jSONObject1 != null) {
            this.PjT = new PjT(jSONObject1.optJSONObject("components"));
        }
    }

    public static boolean PjT(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        qla qla0 = owx0.hLk();
        return qla0 == null ? false : qla0.PjT != null && qla0.PjT.PjT();
    }

    public static PjT Zh(Owx owx0) {
        if(owx0 == null) {
            return null;
        }
        qla qla0 = owx0.hLk();
        return qla0 == null ? null : qla0.PjT;
    }
}

