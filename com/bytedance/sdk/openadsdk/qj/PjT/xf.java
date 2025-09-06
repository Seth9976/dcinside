package com.bytedance.sdk.openadsdk.qj.PjT;

import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import org.json.JSONObject;

public class xf extends JQp {
    private final KM PjT;

    public xf(KM kM0) {
        this.PjT = kM0;
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("commonConvert", new xf(kM0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    public Object PjT(Object object0, cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    public JSONObject PjT(JSONObject jSONObject0, cz cz0) throws Exception {
        this.PjT.cz(jSONObject0);
        return null;
    }
}

