package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.cr.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cz.Zh;
import org.json.JSONObject;

public class XX implements Au {
    private Zh PjT;

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.JQp.Au
    public void PjT(xs xs0) {
        if(xs0.xf() == 1) {
            this.Zh(xs0);
            return;
        }
        cr.PjT(new com.bytedance.sdk.component.Au.Au("dynamicparse") {
            final XX Zh;

            @Override
            public void run() {
                XX.this.Zh(xs0);
            }
        }, 5);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.JQp.Au
    public void PjT(Zh zh0) {
        this.PjT = zh0;
    }

    private void Zh(xs xs0) {
        try {
            JSONObject jSONObject0 = xs0.ReZ();
            JSONObject jSONObject1 = new JSONObject(jSONObject0.optString("template_Plugin"));
            JSONObject jSONObject2 = jSONObject0.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.cr.Au au0 = new cz(jSONObject1, jSONObject2, jSONObject0.optJSONObject("AdSize"), new JSONObject(jSONObject0.optString("diff_template_Plugin"))).PjT(xs0.Zh(), xs0.DWo(), jSONObject2.optDouble("score_exact_i18n"), jSONObject2.optString("comment_num_i18n"), xs0);
            try {
                JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("dynamic_creative"));
                au0.PjT(jSONObject3.optString("color"));
                au0.PjT(jSONObject3.optJSONArray("material_center"));
            }
            catch(Throwable unused_ex) {
            }
            this.PjT.PjT(au0);
        }
        catch(Exception unused_ex) {
        }
    }
}

