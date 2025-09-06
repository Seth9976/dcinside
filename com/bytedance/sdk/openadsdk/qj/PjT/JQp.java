package com.bytedance.sdk.openadsdk.qj.PjT;

import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.Au.PjT.Zh;
import org.json.JSONObject;

public class JQp extends com.bytedance.sdk.component.PjT.JQp {
    private JSONObject PjT;

    public JQp(JSONObject jSONObject0) {
        this.PjT = jSONObject0;
    }

    public static void PjT(ub ub0, JSONObject jSONObject0) {
        ub0.PjT("getData", new JQp(jSONObject0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    public Object PjT(Object object0, cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    public JSONObject PjT(JSONObject jSONObject0, cz cz0) throws Exception {
        return Zh.PjT(this.PjT, jSONObject0);
    }
}

