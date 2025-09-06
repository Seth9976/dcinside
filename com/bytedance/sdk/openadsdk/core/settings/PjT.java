package com.bytedance.sdk.openadsdk.core.settings;

import org.json.JSONObject;

public class PjT extends xf {
    public PjT() {
        super("tt_set_apm.prop", new com.bytedance.sdk.openadsdk.core.settings.PjT.1());

        class com.bytedance.sdk.openadsdk.core.settings.PjT.1 implements com.bytedance.sdk.openadsdk.core.settings.xf.PjT {
            @Override  // com.bytedance.sdk.openadsdk.core.settings.xf$PjT
            public void PjT() {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.xf$PjT
            public void Zh() {
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp
    public void PjT(JSONObject jSONObject0) {
        com.bytedance.sdk.openadsdk.core.settings.JQp.PjT jQp$PjT0 = this.PjT();
        if(jSONObject0.has("apm_url")) {
            jQp$PjT0.PjT("apm_url", jSONObject0.optString("apm_url"));
        }
        if(jSONObject0.has("perf_con")) {
            try {
                JSONObject jSONObject1 = jSONObject0.optJSONObject("perf_con");
                if(jSONObject1 != null && jSONObject1.has("perf_con_apm")) {
                    jQp$PjT0.PjT("perf_con_apm", jSONObject1.optInt("perf_con_apm"));
                }
            }
            catch(Exception unused_ex) {
            }
        }
        jQp$PjT0.PjT();
        this.cr();
    }
}

