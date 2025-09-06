package com.bytedance.sdk.openadsdk.qj.PjT;

import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.component.SM.cz;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class DWo extends JQp {
    private WeakReference PjT;

    public DWo(cz cz0) {
        this.PjT = new WeakReference(cz0);
    }

    public static void PjT(ub ub0, cz cz0) {
        ub0.PjT("preventTouchEvent", new DWo(cz0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    public Object PjT(Object object0, com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    public JSONObject PjT(JSONObject jSONObject0, com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
        JSONObject jSONObject1 = new JSONObject();
        try {
            boolean z = jSONObject0.optBoolean("isPrevent", false);
            cz cz1 = (cz)this.PjT.get();
            if(cz1 != null) {
                cz1.setIsPreventTouchEvent(z);
                jSONObject1.put("success", true);
                return jSONObject1;
            }
            jSONObject1.put("success", false);
        }
        catch(Throwable unused_ex) {
            jSONObject1.put("success", false);
        }
        return jSONObject1;
    }
}

