package com.bytedance.sdk.openadsdk.qj.PjT;

import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import org.json.JSONObject;

public class Au extends JQp {
    private final KM PjT;
    private final String Zh;

    public Au(KM kM0, String s) {
        this.PjT = kM0;
        this.Zh = s;
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("endcardDynamicCreatives", new Au(kM0, "endcardDynamicCreatives"));
        ub0.PjT("multiOpenCovert", new Au(kM0, "multiOpenCovert"));
        ub0.PjT("skipToNextAd", new Au(kM0, "skipToNextAd"));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    public Object PjT(Object object0, cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    public JSONObject PjT(JSONObject jSONObject0, cz cz0) throws Exception {
        if("endcardDynamicCreatives".equals(this.Zh)) {
            return this.PjT.XX(jSONObject0);
        }
        if("multiOpenCovert".equals(this.Zh)) {
            this.PjT.Au(jSONObject0);
            return null;
        }
        if("skipToNextAd".equals(this.Zh)) {
            this.PjT.PjT(jSONObject0, this.Zh);
        }
        return null;
    }
}

