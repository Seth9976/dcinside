package com.bytedance.sdk.openadsdk.qj.PjT;

import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class cz extends JQp {
    private final WeakReference PjT;

    public cz(KM kM0) {
        this.PjT = new WeakReference(kM0);
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("interactiveFinish", new cz(kM0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    public Object PjT(Object object0, com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    public JSONObject PjT(JSONObject jSONObject0, com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
        JSONObject jSONObject1 = new JSONObject();
        if(this.PjT != null && this.PjT.get() != null) {
            KM kM0 = (KM)this.PjT.get();
            Owx owx0 = kM0.cr();
            try {
                boolean z = true;
                int v = 0;
                if(jSONObject0.optInt("finish", 1) != 1) {
                    z = false;
                }
                int v1 = jSONObject0.optInt("reduce_duration", -1);
                int v2 = owx0 == null ? 0 : owx0.dG();
                if(v1 >= 0 && v2 >= 0) {
                    v1 = Math.min(v1, v2);
                }
                else if(v1 < 0) {
                    v1 = v2 < 0 ? 0 : v2;
                }
                if(z) {
                    kM0.ReZ(v1);
                }
                else {
                    v = -1;
                }
                jSONObject1.put("code", v);
                jSONObject1.put("reduce_duration", v1);
                return jSONObject1;
            }
            catch(JSONException jSONException0) {
            }
            RD.Zh("InteractiveFinishMethod", jSONException0.getMessage());
        }
        return jSONObject1;
    }
}

